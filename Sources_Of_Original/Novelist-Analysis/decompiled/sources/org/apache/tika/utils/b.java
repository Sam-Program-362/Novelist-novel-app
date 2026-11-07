package org.apache.tika.utils;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements EntityResolver {
    @Override // org.xml.sax.EntityResolver
    public final InputSource resolveEntity(String str, String str2) {
        return XMLReaderUtils.lambda$static$0(str, str2);
    }
}
