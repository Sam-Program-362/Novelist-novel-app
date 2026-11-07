package org.apache.tika.metadata.filter;

import java.io.Serializable;
import org.apache.tika.config.ConfigBase;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.metadata.Metadata;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes.dex */
public abstract class MetadataFilter extends ConfigBase implements Serializable {
    public static MetadataFilter load(Element element, boolean z3) throws TikaConfigException {
        try {
            return (MetadataFilter) ConfigBase.buildComposite("metadataFilters", CompositeMetadataFilter.class, "metadataFilter", MetadataFilter.class, element);
        } catch (TikaConfigException e3) {
            if (z3 && e3.getMessage().contains("could not find metadataFilters")) {
                return new NoOpFilter();
            }
            throw e3;
        }
    }

    public abstract void filter(Metadata metadata);
}
