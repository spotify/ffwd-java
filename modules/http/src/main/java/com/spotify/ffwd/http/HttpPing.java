package com.spotify.ffwd.http;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.Server;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HttpPing implements IPing {
    @Inject
    HttpClientFactory clientFactory;

    @Override
    public boolean isAlive(final Server server) {
        try {
            clientFactory.newClient(server).ping().get();
        } catch (Exception e) {
            log.warn("Error when pinging server ({}): {}", server, e.getMessage());
            log.trace("Error when pinging server ({}): {}", server, e.getMessage(), e);
            return false;
        }

        return true;
    }
}
