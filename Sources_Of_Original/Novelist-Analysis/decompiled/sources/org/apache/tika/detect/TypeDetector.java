package org.apache.tika.detect;

import java.io.InputStream;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* JADX INFO: loaded from: classes.dex */
public class TypeDetector implements Detector {
    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) {
        MediaType mediaType;
        String str = metadata.get(HttpHeaders.CONTENT_TYPE);
        return (str == null || (mediaType = MediaType.parse(str)) == null) ? MediaType.OCTET_STREAM : mediaType;
    }
}
