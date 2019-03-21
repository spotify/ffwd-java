/*-
 * -\-\-
 * FastForward API
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

package com.spotify.ffwd.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Batch {
    private final Map<String, String> commonTags;
    private final Map<String, String> commonResource;
    private final List<Point> points;

    /**
     * JSON creator.
     */
    @JsonCreator
    public static Batch create(
        @JsonProperty("commonTags") final Optional<Map<String, String>> commonTags,
        @JsonProperty("commonResource") final Optional<Map<String, String>> commonResource,
        @JsonProperty("points") final List<Point> points
    ) {
        return new Batch(commonTags.orElseGet(ImmutableMap::of),
            commonResource.orElseGet(ImmutableMap::of), points);
    }

    @Data
    public static class Point {
        private final String key;
        private final Map<String, String> tags;
        private final Map<String, String> resource;
        private final double value;
        private final long timestamp;

        /**
         * JSON creator.
         */
        @JsonCreator
        public static Point create(
            @JsonProperty("key") final String key,
            @JsonProperty("tags") final Optional<Map<String, String>> tags,
            @JsonProperty("resource") final Optional<Map<String, String>> resource,
            @JsonProperty("value") final double value,
            @JsonProperty("timestamp") final long timestamp
        ) {
            return new Point(key, tags.orElseGet(ImmutableMap::of),
                resource.orElseGet(ImmutableMap::of), value, timestamp);
        }
    }
}
