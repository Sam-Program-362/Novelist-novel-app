package org.apache.tika.mime;

import java.io.IOException;
import org.apache.tika.detect.MagicDetector;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.utils.StringUtils;
import w2.g;
import w2.h;

/* JADX INFO: loaded from: classes.dex */
class MagicMatch implements Clause {
    private MagicDetector detector = null;
    private final String mask;
    private final MediaType mediaType;
    private final String offset;
    private final String type;
    private final String value;

    public MagicMatch(MediaType mediaType, String str, String str2, String str3, String str4) {
        this.mediaType = mediaType;
        this.type = str;
        this.offset = str2;
        this.value = str3;
        this.mask = str4;
    }

    private synchronized MagicDetector getDetector() {
        try {
            if (this.detector == null) {
                this.detector = MagicDetector.parse(this.mediaType, this.type, this.offset, this.value, this.mask);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.detector;
    }

    @Override // org.apache.tika.mime.Clause
    public boolean eval(byte[] bArr) {
        try {
            MagicDetector detector = getDetector();
            int i3 = h.f4677o;
            g gVar = new g();
            gVar.W(bArr);
            return detector.detect(new h(gVar), new Metadata()) != MediaType.OCTET_STREAM;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // org.apache.tika.mime.Clause
    public int size() {
        return getDetector().getLength();
    }

    public String toString() {
        return this.mediaType.toString() + StringUtils.SPACE + this.type + StringUtils.SPACE + this.offset + StringUtils.SPACE + this.value + StringUtils.SPACE + this.mask;
    }
}
