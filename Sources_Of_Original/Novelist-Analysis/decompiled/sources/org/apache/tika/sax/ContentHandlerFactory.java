package org.apache.tika.sax;

import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import org.xml.sax.ContentHandler;

/* JADX INFO: loaded from: classes.dex */
public interface ContentHandlerFactory extends Serializable {
    ContentHandler getNewContentHandler();

    ContentHandler getNewContentHandler(OutputStream outputStream, Charset charset);
}
