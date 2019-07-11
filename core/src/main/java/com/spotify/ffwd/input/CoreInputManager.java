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

package com.spotify.ffwd.input;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.spotify.ffwd.debug.DebugServer;
import com.spotify.ffwd.filter.Filter;
import com.spotify.ffwd.model.Batch;
import com.spotify.ffwd.model.Metric;
import com.spotify.ffwd.output.OutputManager;
import com.spotify.ffwd.statistics.InputManagerStatistics;
import eu.toolchain.async.AsyncFramework;
import eu.toolchain.async.AsyncFuture;
import java.util.ArrayList;
import java.util.List;
import lombok.ToString;

/**
 * Responsible for receiving, logging and transforming the event.
 *
 * @author udoprog
 */
@ToString(of = {"sources"})
public class CoreInputManager implements InputManager {
    private static final String DEBUG_ID = "core.input";

    @Inject
    private List<PluginSource> sources;

    @Inject
    private AsyncFramework async;

    @Inject
    private OutputManager output;

    @Inject
    private DebugServer debug;

    @Inject
    private InputManagerStatistics statistics;

    @Inject
    private Filter filter;

    @Override
    public void init() {
        for (final PluginSource s : sources) {
            s.init();
        }
    }

    @Override
    public void receiveMetric(Metric metric) {
        if (!filter.matchesMetric(metric)) {
            statistics.reportMetricsDroppedByFilter(1);
            return;
        }

        statistics.reportReceivedMetrics(1);
        debug.inspectMetric(DEBUG_ID, metric);
        output.sendMetric(metric);
    }

    @Override
    public void receiveBatch(Batch batch) {
        // TODO: consider filtering
        statistics.reportReceivedMetrics(batch.getPoints().size());
        debug.inspectBatch(DEBUG_ID, batch);
        output.sendBatch(batch);
    }

    @Override
    public AsyncFuture<Void> start() {
        final ArrayList<AsyncFuture<Void>> futures = Lists.newArrayList();

        for (final PluginSource s : sources) {
            futures.add(s.start());
        }

        return async.collectAndDiscard(futures);
    }

    @Override
    public AsyncFuture<Void> stop() {
        final ArrayList<AsyncFuture<Void>> futures = Lists.newArrayList();

        for (final PluginSource s : sources) {
            futures.add(s.stop());
        }

        return async.collectAndDiscard(futures);
    }
}
