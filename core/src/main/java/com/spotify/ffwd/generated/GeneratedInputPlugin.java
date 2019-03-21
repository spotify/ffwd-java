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

package com.spotify.ffwd.generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.inject.Key;
import com.google.inject.Module;
import com.google.inject.PrivateModule;
import com.spotify.ffwd.filter.Filter;
import com.spotify.ffwd.input.InputPlugin;
import com.spotify.ffwd.input.PluginSource;
import java.util.Optional;

public class GeneratedInputPlugin implements InputPlugin {
    private final boolean sameHost;

    @JsonCreator
    public GeneratedInputPlugin(
        @JsonProperty("sameHost") Boolean sameHost, @JsonProperty("filter") Optional<Filter> filter
    ) {
        this.sameHost = Optional.ofNullable(sameHost).orElse(false);
    }

    @Override
    public Module module(final Key<PluginSource> key, final String id) {
        return new PrivateModule() {
            @Override
            protected void configure() {
                bind(key).toInstance(new GeneratedPluginSource(sameHost));
                expose(key);
            }
        };
    }
}
