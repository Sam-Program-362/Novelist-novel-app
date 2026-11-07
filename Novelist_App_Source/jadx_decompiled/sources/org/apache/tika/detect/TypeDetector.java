package org.apache.tika.detect;

import java.io.InputStream;
import org.apache.tika.metadata.HttpHeaders;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* loaded from: classes.dex */
public class TypeDetector implements Detector {
    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) {
        MediaType parse;
        String str = metadata.get(HttpHeaders.CONTENT_TYPE);
        return (str == null || (parse = MediaType.parse(str)) == null) ? MediaType.OCTET_STREAM : parse;
    }
}
