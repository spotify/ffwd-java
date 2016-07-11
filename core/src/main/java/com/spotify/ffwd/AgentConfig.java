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
package com.spotify.ffwd;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.spotify.ffwd.input.InputManagerModule;
import com.spotify.ffwd.output.OutputManagerModule;
import lombok.Data;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@Data
public class AgentConfig {
    public static final int DEFAULT_ASYNC_THREADS = 4;
    public static final int DEFAULT_SCHEDULER_THREADS = 4;
    public static final int DEFAULT_BOSS_THREADS = 2;
    public static final int DEFAULT_WORKER_THREADS = 4;

    public static final Map<String, String> DEFAULT_TAGS = Maps.newHashMap();
    public static final Set<String> DEFAULT_RIEMANNTAGS = Sets.newHashSet();

    public static final String DEFAULT_QLOG = "./qlog/";

    private final Optional<Debug> debug;
    private final String host;
    private final Map<String, String> tags;
    private final Set<String> riemannTags;
    private final InputManagerModule input;
    private final OutputManagerModule output;
    private final int schedulerThreads;
    private final int asyncThreads;
    private final int bossThreads;
    private final int workerThreads;
    private final long ttl;
    private final Path qlog;

    @JsonCreator
    public AgentConfig(
        @JsonProperty("debug") Optional<Debug> debug,
        @JsonProperty("host") Optional<String> host,
        @JsonProperty("tags") Optional<Map<String, String>> tags,
        @JsonProperty("riemannTags") Optional<Set<String>> riemannTags,
        @JsonProperty("input") Optional<InputManagerModule> input,
        @JsonProperty("output") Optional<OutputManagerModule> output,
        @JsonProperty("asyncThreads") Optional<Integer> asyncThreads,
        @JsonProperty("schedulerThreads") Optional<Integer> schedulerThreads,
        @JsonProperty("bossThreads") Optional<Integer> bossThreads,
        @JsonProperty("workerThreads") Optional<Integer> workerThreads,
        @JsonProperty("ttl") Optional<Long> ttl,
        @JsonProperty("qlog") Optional<String> qlog
    ) {
        this.debug = debug;
        this.host = host.orElseGet(this::buildDefaultHost);
        this.tags = tags.orElse(DEFAULT_TAGS);
        this.riemannTags = riemannTags.orElse(DEFAULT_RIEMANNTAGS);
        this.input = input.orElseGet(InputManagerModule.supplyDefault());
        this.output = output.orElseGet(OutputManagerModule.supplyDefault());
        this.asyncThreads = asyncThreads.orElse(DEFAULT_ASYNC_THREADS);
        this.schedulerThreads = schedulerThreads.orElse(DEFAULT_SCHEDULER_THREADS);
        this.bossThreads = bossThreads.orElse(DEFAULT_BOSS_THREADS);
        this.workerThreads = workerThreads.orElse(DEFAULT_WORKER_THREADS);
        this.ttl = ttl.orElse(0L);
        this.qlog = Paths.get(qlog.orElse(DEFAULT_QLOG));
    }

    private String buildDefaultHost() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            throw new RuntimeException("unable to get local host", e);
        }
    }

    @Data
    public static final class Debug {
        public static final String DEFAULT_HOST = "localhost";
        public static final int DEFAULT_PORT = 19001;

        private final InetSocketAddress localAddress;

        @JsonCreator
        public Debug(
            @JsonProperty("host") Optional<String> host,
            @JsonProperty("port") Optional<Integer> port
        ) {
            this.localAddress = buildLocalAddress(
                host.orElse(DEFAULT_HOST),
                port.orElse(DEFAULT_PORT)
            );
        }

        private InetSocketAddress buildLocalAddress(String host, Integer port) {
            return new InetSocketAddress(host, port);
        }
    }
}
