package com.spotify.ffwd.http;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.google.common.collect.ImmutableList;
import com.netflix.loadbalancer.LoadBalancerBuilder;
import com.netflix.loadbalancer.Server;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Data;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(HttpDiscovery.Static.class), @JsonSubTypes.Type(HttpDiscovery.Srv.class),
})
public interface HttpDiscovery {
    HostAndPort DEFAULT_SERVER = new HostAndPort("localhost", 8080);

    LoadBalancerBuilder<Server> apply(LoadBalancerBuilder<Server> builder);

    @JsonTypeName("static")
    @Data
    class Static implements HttpDiscovery {
        private final List<HostAndPort> servers;

        @Override
        public LoadBalancerBuilder<Server> apply(
            final LoadBalancerBuilder<Server> builder
        ) {
            final List<Server> servers = this.servers
                .stream()
                .map(hostAndPort -> new Server(hostAndPort.getHost(), hostAndPort.getPort()))
                .collect(Collectors.toList());
            return builder.withDynamicServerList(new StaticServerList(servers));
        }
    }

    @JsonTypeName("srv")
    @Data
    class Srv implements HttpDiscovery {
        private final String record;

        @Override
        public LoadBalancerBuilder<Server> apply(
            final LoadBalancerBuilder<Server> builder
        ) {
            return builder.withDynamicServerList(new SrvServerList(record));
        }
    }

    /**
     * Default implementation for http discovery when nothing else is configured.
     */
    static HttpDiscovery supplyDefault() {
        return new HttpDiscovery.Static(ImmutableList.of(DEFAULT_SERVER));
    }

    @Data
    class HostAndPort {
        private final String host;
        private final int port;

        @JsonCreator
        public static HostAndPort create(String input) {
            final String[] parts = input.split(":");
            if (parts.length != 2) {
                throw new RuntimeException("Not a valid server (expected host:port): " + input);
            }

            final String host = parts[0];
            final int port = Integer.parseUnsignedInt(parts[1]);

            return new HostAndPort(host, port);
        }
    }
}
