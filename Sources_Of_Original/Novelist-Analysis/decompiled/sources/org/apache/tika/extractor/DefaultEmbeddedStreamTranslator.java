package org.apache.tika.extractor;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import org.apache.tika.config.ServiceLoader;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.utils.ServiceLoaderUtils;

/* JADX INFO: loaded from: classes.dex */
public class DefaultEmbeddedStreamTranslator implements EmbeddedStreamTranslator {
    final List<EmbeddedStreamTranslator> translators;

    public DefaultEmbeddedStreamTranslator() {
        this(getDefaultFilters(new ServiceLoader()));
    }

    private static List<EmbeddedStreamTranslator> getDefaultFilters(ServiceLoader serviceLoader) {
        List<EmbeddedStreamTranslator> listLoadServiceProviders = serviceLoader.loadServiceProviders(EmbeddedStreamTranslator.class);
        ServiceLoaderUtils.sortLoadedClasses(listLoadServiceProviders);
        return listLoadServiceProviders;
    }

    @Override // org.apache.tika.extractor.EmbeddedStreamTranslator
    public boolean shouldTranslate(InputStream inputStream, Metadata metadata) {
        Iterator<EmbeddedStreamTranslator> it2 = this.translators.iterator();
        while (it2.hasNext()) {
            if (it2.next().shouldTranslate(inputStream, metadata)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.apache.tika.extractor.EmbeddedStreamTranslator
    public InputStream translate(InputStream inputStream, Metadata metadata) {
        Iterator<EmbeddedStreamTranslator> it2 = this.translators.iterator();
        while (it2.hasNext()) {
            InputStream inputStreamTranslate = it2.next().translate(inputStream, metadata);
            if (inputStreamTranslate != null) {
                return inputStreamTranslate;
            }
        }
        return inputStream;
    }

    private DefaultEmbeddedStreamTranslator(List<EmbeddedStreamTranslator> list) {
        this.translators = list;
    }
}
