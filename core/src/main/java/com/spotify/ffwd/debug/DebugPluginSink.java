/*-
 * -\-\-
 * FastForward Core
 * --
 * Copyright (C) 2016 - 2018 Spotify AB
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

package com.spotify.ffwd.debug;

import com.google.inject.Inject;
import com.spotify.ffwd.model.v2.Batch;
import com.spotify.ffwd.model.v2.Metric;
import com.spotify.ffwd.output.BatchablePluginSink;
import eu.toolchain.async.AsyncFramework;
import eu.toolchain.async.AsyncFuture;
import java.util.Collection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DebugPluginSink implements BatchablePluginSink {

  private static final Logger log = LoggerFactory.getLogger(DebugPluginSink.class);

  @Inject
  private AsyncFramework async;

  @Override
  public void init() {
  }

  @Override
  public void sendMetric(Metric metric) {
    log.info("M: {}", metric);
  }

  @Override
  public void sendBatch(final Batch batch) {
    log.info("B: {}", batch);
  }

  @Override
  public AsyncFuture<Void> sendMetrics(Collection<Metric> metrics) {
    int i = 0;

    for (final Metric m : metrics) {
      log.info("M#{}: {}", i++, m);
    }

    return async.resolved(null);
  }

  @Override
  public AsyncFuture<Void> sendBatches(final Collection<Batch> batches) {
    int i = 0;

    for (final Batch b : batches) {
      log.info("B#{}: {}", i++, b);
    }

    return async.resolved(null);
  }

  @Override
  public AsyncFuture<Void> start() {
    return async.resolved();
  }

  @Override
  public AsyncFuture<Void> stop() {
    return async.resolved();
  }

  @Override
  public boolean isReady() {
    return true;
  }
}
