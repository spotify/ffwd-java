package com.spotify.ffwd.http;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.loadbalancer.Server;
import eu.toolchain.async.AsyncFramework;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Data;
import okhttp3.OkHttpClient;

@Data
public class HttpClientFactory {
    @Inject
    private AsyncFramework async;

    @Inject
    @Named("application/json")
    private ObjectMapper mapper;

    @Inject
    private OkHttpClient httpClient;

    public HttpClient newClient(final Server server) {
        final String baseUrl = "http://" + server.getHost() + ":" + server.getPort();
        return new HttpClient(async, mapper, httpClient, baseUrl);
    }
}
