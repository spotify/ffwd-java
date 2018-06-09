package com.spotify.ffwd.output;

import com.spotify.ffwd.model.Batch;
import com.spotify.ffwd.model.Event;
import com.spotify.ffwd.model.Metric;
import eu.toolchain.async.AsyncFuture;

public interface TransactionOutputManager {

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

    AsyncFuture<Void> start();

    AsyncFuture<Void> stop();

    /**
     * Populate all plugin sinks with buffered data
     */
    void commit();
}
