package com.spotify.ffwd.output;

import com.spotify.ffwd.model.Batch;
import com.spotify.ffwd.model.Event;
import com.spotify.ffwd.model.Metric;
import eu.toolchain.async.AsyncFuture;

public class CoreTransactionOutputManager implements TransactionOutputManager {
    @Override
    public boolean prepareSendBatch(final Batch batch) {
        return false;
    }

    @Override
    public boolean prepareSendMetric(final Metric metric) {
        return false;
    }

    @Override
    public boolean prepareSendEvent(final Event event) {
        return false;
    }

    @Override
    public AsyncFuture<Void> start() {
        return null;
    }

    @Override
    public AsyncFuture<Void> stop() {
        return null;
    }

    @Override
    public void commit() {

    }
}
