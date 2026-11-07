package org.apache.tika.metadata.filter;

import org.apache.tika.metadata.Metadata;

/* JADX INFO: loaded from: classes.dex */
public class NoOpFilter extends MetadataFilter {
    public static final NoOpFilter NOOP_FILTER = new NoOpFilter();

    @Override // org.apache.tika.metadata.filter.MetadataFilter
    public void filter(Metadata metadata) {
    }
}
