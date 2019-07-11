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

package com.spotify.ffwd.serializer;

import com.spotify.ffwd.cache.WriteCache;
import com.spotify.ffwd.model.Event;
import com.spotify.ffwd.model.Metric;
import com.spotify.proto.Spotify100;
import java.util.Collection;
import org.xerial.snappy.Snappy;

/**
 * Spotify100ProtoSerializer is intended to reduce the amount of data transferred between
 * the publisher and the consumer. It useful when being used with Google Pubsub, because the
 * client does not have native compression like Kafka.
 *
 * Compression is done with the snappy library via JNI.
 */
public class Spotify100ProtoSerializer implements Serializer {
  @Override
  public byte[] serialize(final Event event) throws Exception {
    return new byte[0];
  }

  @Override
  public byte[] serialize(final Metric metric) throws Exception {
    throw new UnsupportedOperationException("Not supported");
  }

  @Override
  public byte[] serialize(Collection<Metric> metrics, WriteCache writeCache) throws Exception {
    final Spotify100.Batch.Builder batch = Spotify100.Batch.newBuilder();

    for (Metric metric : metrics) {
      if (!writeCache.checkCacheOrSet(metric)) {
        batch.addMetric(serializeMetric(metric));
      }
    }
    return Snappy.compress(batch.build().toByteArray());
  }

  private Spotify100.Metric serializeMetric(final Metric metric) {
    return Spotify100.Metric.newBuilder()
      .setKey(metric.getKey())
      .setTime(metric.getTime().getTime())
      .setValue(metric.getValue())
      .putAllTags(metric.getTags())
      .putAllResource(metric.getResource())
      .build();
  }
}
