package org.apache.tika.extractor;

import M1.K;
import M1.N;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.pipes.extractor.EmbeddedDocumentBytesConfig;
import s2.c;
import t2.a;
import w2.e;
import w2.f;
import x2.b;

/* loaded from: classes.dex */
public class BasicEmbeddedDocumentBytesHandler extends AbstractEmbeddedDocumentBytesHandler {
    private final EmbeddedDocumentBytesConfig config;
    Map<Integer, byte[]> docBytes = new HashMap();

    public BasicEmbeddedDocumentBytesHandler(EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig) {
        this.config = embeddedDocumentBytesConfig;
    }

    @Override // org.apache.tika.extractor.AbstractEmbeddedDocumentBytesHandler, org.apache.tika.extractor.EmbeddedDocumentBytesHandler
    public void add(int i3, Metadata metadata, InputStream inputStream) {
        super.add(i3, metadata, inputStream);
        Map<Integer, byte[]> map = this.docBytes;
        Integer valueOf = Integer.valueOf(i3);
        byte[] bArr = c.f4533a;
        int i4 = x2.c.f4723p;
        x2.c cVar = new x2.c(new e());
        b bVar = new b(new N(15), new K(cVar, 14));
        try {
            c.b(inputStream, bVar);
            byte[] b3 = cVar.b();
            bVar.close();
            map.put(valueOf, b3);
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public InputStream getDocument(int i3) {
        e eVar = new e();
        eVar.f4582m = new a(this.docBytes.get(Integer.valueOf(i3)));
        a aVar = eVar.f4582m;
        if (aVar == null) {
            throw new IllegalStateException("origin == null");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) aVar.f4581m);
        f fVar = new f();
        fVar.f4671k = byteArrayInputStream;
        fVar.f4674o = -1;
        fVar.f4672l = new byte[8192];
        return fVar;
    }
}
