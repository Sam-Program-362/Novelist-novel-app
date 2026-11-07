package org.apache.tika.metadata.filter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.metadata.Metadata;
import t.AbstractC0468a;

/* loaded from: classes.dex */
public class CompositeMetadataFilter extends MetadataFilter {
    private List<MetadataFilter> filters;

    public CompositeMetadataFilter() {
        this.filters = new ArrayList();
    }

    @Override // org.apache.tika.metadata.filter.MetadataFilter
    public void filter(Metadata metadata) {
        Iterator<MetadataFilter> it2 = this.filters.iterator();
        while (it2.hasNext()) {
            it2.next().filter(metadata);
        }
    }

    public List<MetadataFilter> getFilters() {
        return this.filters;
    }

    public void setFilters(List<MetadataFilter> list) {
        this.filters.clear();
        this.filters.addAll(list);
    }

    public String toString() {
        return AbstractC0468a.b("CompositeMetadataFilter{filters=", String.valueOf(this.filters), "}");
    }

    public CompositeMetadataFilter(List<MetadataFilter> list) {
        this.filters = list;
    }
}
