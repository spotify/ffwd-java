/*
 * Copyright 2013-2017 Spotify AB. All rights reserved.
 *
 * The contents of this file are licensed under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.spotify.ffwd.output;

import com.spotify.ffwd.Initializable;
import com.spotify.ffwd.model.Batch;
import com.spotify.ffwd.model.Event;
import com.spotify.ffwd.model.Metric;
import eu.toolchain.async.AsyncFuture;

public interface PluginSink extends Initializable {
    /**
     * Send the given collection of events.
     * <p>
     * This method is fire-and-forget, because tracking each individual send is too expensive.
     *
     * @param events Collection of events to send.
     * @return A future that will be resolved when the events have been sent.
     */
    void sendEvent(Event event);

    /**
     * Send the given collection of metrics.
     * <p>
     * This method is fire-and-forget, because tracking each individual send is too expensive.
     *
     * @param metrics Metrics to send.
     * @return A future that will be resolved when the metrics have been sent.
     */
    void sendMetric(Metric metric);

    /**
     * Send the given collection of metrics.
     * <p>
     * This method is fire-and-forget, because tracking each individual send is too expensive.
     *
     * @param batch Batch to send.
     * @return A future that will be resolved when the metrics have been sent.
     */
    void sendBatch(Batch batch);

    AsyncFuture<Void> start();

    AsyncFuture<Void> stop();

    boolean isReady();

    /**
     * Indicates if given batch would not cause buffer overflow.
     *
     * @param batch Batch to send.
     * @return true if batch fits in the buffer, false otherwise
     */
    boolean prepareSendBatch(Batch batch);

    /**
     * Indicates if given metric would not cause buffer overflow.
     *
     * @param metric Metrics to send.
     * @return true if metric fits in the buffer, false otherwise
     */
    boolean prepareSendMetric(Metric metric);

    /**
     * Indicates if event would not cause buffer overflow.
     *
     * @param events Collection of events to send.
     * @return true if metric fits in the buffer, false otherwise
     */
    boolean prepareSendEvent(Event event);
}
