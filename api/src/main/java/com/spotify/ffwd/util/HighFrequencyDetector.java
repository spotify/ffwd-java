/*-
 * -\-\-
 * FastForward API
 * --
 * Copyright (C) 2020 Spotify AB
 * --
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * -/-/-
 */

package com.spotify.ffwd.util;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.spotify.ffwd.model.Metric;
import com.spotify.ffwd.statistics.HighFrequencyDetectorStatistics;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HighFrequencyDetector {

  /** Allow to drop high frequency metrics. */
  @Inject
  @Named("dropHighFrequencyMetric")
  Boolean dropHighFrequencyMetric;

  /** Minimum number of milliseconds allowed between data points. */
  @Inject
  @Named("minFrequencyMillisAllowed")
  Integer minFrequencyMillisAllowed;

  /** Minimum number of times high frequency detected before metrics are dropped. */
  @Inject
  @Named("minNumberOfTriggers")
  Integer minNumberOfTriggers;

  /** Milliseconds high frequency triggers are refreshed. */
  @Inject
  @Named("highFrequencyDataRecycleMS")
  Long highFrequencyDataRecycleMS;

  @Inject
  private HighFrequencyDetectorStatistics statistics;

  /** High frequency metrics counter. */
  // TODO review to use ConcurrentHashMap vs AtomicReference
  final AtomicReference<Map<Integer, Integer>> highFrequencyMetrics =
      new AtomicReference<>(new HashMap<>());

  final AtomicLong highFrequencyTriggersTS;
  private AtomicBoolean highFrequencyRecycleLock;

  /* TODO
      1. unit tests
          a. sendBatch with many points
          b. send both with many points
          c. check swap of high freq hashmap
   */

  @Inject
  public HighFrequencyDetector() {
    this.highFrequencyTriggersTS = new AtomicLong(System.currentTimeMillis());
    this.highFrequencyRecycleLock = new AtomicBoolean(false);
  }

  public List<Metric> detectHighFrequencyMetrics(final List<Metric> metrics) {
    List<Metric> newList = new ArrayList<>();

    // Groups metrics by metric hash code and finds timestamp deltas of ordered data points.
    // {hashcode -> -1, hashcode1 -> 10}
    Map<Integer, Integer> groupedMetrics =
        metrics.stream()
            .sorted(Comparator.comparing(Metric::getTime))
            .collect(
                Collectors.groupingBy(
                    Metric::hashCode,
                    Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                          int size = list.size();
                          return IntStream.range(1, size)
                              .map(
                                  x ->
                                      (int)
                                          (list.get(size - x).getTime().getTime()
                                              - list.get(size - x - 1).getTime().getTime()))
                              .filter(d -> (d >= 0 && d < minFrequencyMillisAllowed))
                              .min()
                              .orElse(-1);
                        })));

    if (dropHighFrequencyMetric) {
      updateHighFrequencyMetricsStats(groupedMetrics);

      if (highFrequencyMetrics.get().size() > 0) {
        metrics.stream()
            .filter(
                metric ->
                    highFrequencyMetrics.get().getOrDefault(metric.hashCode(), 0)
                        < minNumberOfTriggers)
            .forEach(newList::add);

        statistics.reportHighFrequencyMetricsDropped(metrics.size() - newList.size());
        return newList;
      }
    }

    return metrics;
  }

  /**
   * Updates internal map of high frequency metrics
   *
   * @param groupedMetrics - Grouped metrics
   */
  private void updateHighFrequencyMetricsStats(final Map<Integer, Integer> groupedMetrics) {
    groupedMetrics.entrySet().stream()
        .filter(x -> x.getValue() >= 0)
        .forEach(
            hashcode -> {
              highFrequencyMetrics
                  .get()
                  .compute(hashcode.getKey(), (key, val) -> (val == null) ? 1 : val + 1);
            });

    statistics.reportHighFrequencyMetrics(highFrequencyMetrics.get().size());
    swapHighFrequencyTriggersData();
  }

  /** This will reset high frequency triggers data */
  private void swapHighFrequencyTriggersData() {
    if (System.currentTimeMillis() - highFrequencyTriggersTS.get() > highFrequencyDataRecycleMS
        && highFrequencyRecycleLock.compareAndExchange(false, true)) {
      highFrequencyMetrics.set(new HashMap<>());
      highFrequencyTriggersTS.set(System.currentTimeMillis());
      highFrequencyRecycleLock.set(false);
    }
  }
}
