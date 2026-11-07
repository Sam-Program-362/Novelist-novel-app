package org.apache.tika.metadata;

/* JADX INFO: loaded from: classes.dex */
public interface XMPPDF {
    public static final String PREFIX = "xmp:pdf:";
    public static final Property ABOUT = Property.externalTextBag("xmp:pdf:About");
    public static final Property KEY_WORDS = Property.externalTextBag("xmp:pdf:Keywords");
    public static final Property PDF_VERSION = Property.externalText("xmp:pdf:PDFVersion");
    public static final Property PRODUCER = Property.externalText("xmp:pdf:Producer");
}
