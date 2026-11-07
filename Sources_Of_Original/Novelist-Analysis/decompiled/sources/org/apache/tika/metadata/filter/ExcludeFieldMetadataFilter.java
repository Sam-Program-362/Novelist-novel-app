package org.apache.tika.metadata.filter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.tika.config.Field;
import org.apache.tika.metadata.Metadata;

/* JADX INFO: loaded from: classes.dex */
public class ExcludeFieldMetadataFilter extends MetadataFilter {
    private final Set<String> excludeSet;

    public ExcludeFieldMetadataFilter() {
        this(new HashSet());
    }

    @Override // org.apache.tika.metadata.filter.MetadataFilter
    public void filter(Metadata metadata) {
        Iterator<String> it2 = this.excludeSet.iterator();
        while (it2.hasNext()) {
            metadata.remove(it2.next());
        }
    }

    public List<String> getExclude() {
        return new ArrayList(this.excludeSet);
    }

    @Field
    public void setExclude(List<String> list) {
        this.excludeSet.addAll(list);
    }

    public ExcludeFieldMetadataFilter(Set<String> set) {
        this.excludeSet = set;
    }
}
