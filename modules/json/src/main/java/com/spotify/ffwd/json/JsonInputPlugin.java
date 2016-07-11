/**
 * Copyright 2013-2014 Spotify AB. All rights reserved.
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
 **/
package com.spotify.ffwd.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.inject.Key;
import com.google.inject.Module;
import com.google.inject.PrivateModule;
import com.google.inject.Scopes;
import com.spotify.ffwd.input.InputPlugin;
import com.spotify.ffwd.input.PluginSource;
import com.spotify.ffwd.protocol.Protocol;
import com.spotify.ffwd.protocol.ProtocolFactory;
import com.spotify.ffwd.protocol.ProtocolServer;
import com.spotify.ffwd.protocol.ProtocolType;
import com.spotify.ffwd.protocol.RetryPolicy;

import java.util.Optional;

public class JsonInputPlugin implements InputPlugin {
    private static final ProtocolType DEFAULT_PROTOCOL = ProtocolType.UDP;
    private static final int DEFAULT_PORT = 19000;

    private static final String FRAME = "frame";
    private static final String LINE = "line";

    public static final String DEFAULT_DELIMITER = FRAME;

    private final Protocol protocol;
    private final Class<? extends ProtocolServer> protocolServer;
    private final RetryPolicy retry;

    @JsonCreator
    public JsonInputPlugin(
        @JsonProperty("protocol") ProtocolFactory protocol,
        @JsonProperty("delimiter") String delimiter, @JsonProperty("retry") RetryPolicy retry
    ) {
        this.protocol = Optional
            .ofNullable(protocol)
            .orElseGet(ProtocolFactory.defaultFor())
            .protocol(DEFAULT_PROTOCOL, DEFAULT_PORT);
        this.protocolServer =
            parseProtocolServer(Optional.ofNullable(delimiter).orElseGet(this::defaultDelimiter));
        this.retry = Optional.ofNullable(retry).orElseGet(() -> new RetryPolicy.Exponential());
    }

    private String defaultDelimiter() {
        if (protocol.getType() == ProtocolType.TCP) {
            return LINE;
        }

        if (protocol.getType() == ProtocolType.UDP) {
            return FRAME;
        }

        return FRAME;
    }

    private Class<? extends ProtocolServer> parseProtocolServer(String delimiter) {
        if (FRAME.equals(delimiter)) {
            if (protocol.getType() == ProtocolType.TCP) {
                throw new IllegalArgumentException("frame-based decoding is not suitable for TCP");
            }

            return JsonFrameProtocolServer.class;
        }

        if (LINE.equals(delimiter)) {
            return JsonLineProtocolServer.class;
        }

        return defaultProtocolServer();
    }

    private Class<? extends ProtocolServer> defaultProtocolServer() {
        if (protocol.getType() == ProtocolType.TCP) {
            return JsonLineProtocolServer.class;
        }

        return JsonFrameProtocolServer.class;
    }

    @Override
    public Module module(final Key<PluginSource> key, final String id) {
        return new PrivateModule() {
            @Override
            protected void configure() {
                bind(JsonObjectMapperDecoder.class).in(Scopes.SINGLETON);
                bind(Protocol.class).toInstance(protocol);
                bind(ProtocolServer.class).to(protocolServer).in(Scopes.SINGLETON);
                bind(RetryPolicy.class).toInstance(retry);

                bind(key).to(JsonPluginSource.class).in(Scopes.SINGLETON);
                expose(key);
            }
        };
    }

    @Override
    public String id(int index) {
        return String.format("%s[%s]", getClass().getPackage().getName(), protocol.toString());
    }
}
