package com.spotify.ffwd.http;

import com.google.common.collect.ImmutableList;
import com.netflix.loadbalancer.Server;
import com.netflix.loadbalancer.ServerList;
import java.util.List;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.xbill.DNS.DClass;
import org.xbill.DNS.Lookup;
import org.xbill.DNS.Record;
import org.xbill.DNS.SRVRecord;
import org.xbill.DNS.TextParseException;
import org.xbill.DNS.Type;

@Slf4j
@Data
public class SrvServerList implements ServerList<Server> {
    private final String record;

    @Override
    public List<Server> getInitialListOfServers() {
        return lookup();
    }

    @Override
    public List<Server> getUpdatedListOfServers() {
        return lookup();
    }

    private List<Server> lookup() {
        final Lookup lookup;
        try {
            lookup = new Lookup(record, Type.SRV, DClass.IN);
        } catch (TextParseException e) {
            throw new RuntimeException(e);
        }

        final Record[] result = lookup.run();

        if (lookup.getResult() != Lookup.SUCCESSFUL) {
            throw new RuntimeException("DNS lookup failed: " + lookup.getErrorString());
        }

        final ImmutableList.Builder<Server> results = ImmutableList.builder();

        if (result != null) {
            for (final Record a : result) {
                final SRVRecord srv = (SRVRecord) a;
                results.add(new Server(srv.getTarget().canonicalize().toString(), srv.getPort()));
            }
        }

        return results.build();
    }
}
