package com.spotify.ffwd.http;

import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;
import java.util.List;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class StaticServerList implements ServerList<Server> {
    private final List<Server> servers;

    @Override
    public List<Server> getInitialListOfServers() {
        return servers;
    }

    @Override
    public List<Server> getUpdatedListOfServers() {
        return servers;
    }
}
