package org.apache.hadoop.hive.metastore.hooks;

import org.apache.hadoop.hive.metastore.HiveMetaException;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class SimpleURIResolver implements URIResolverHook {
    @Override
    public List<URI> resolveURI(URI uri) throws HiveMetaException {
        if (uri == null) {
            throw new HiveMetaException("thrift uri is null");
        }

        List<URI> uris = new ArrayList<>(1);
        uris.add(uri);
        return uris;
    }
}
