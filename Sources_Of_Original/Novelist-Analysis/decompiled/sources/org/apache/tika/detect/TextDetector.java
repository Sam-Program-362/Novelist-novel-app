package org.apache.tika.detect;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* JADX INFO: loaded from: classes.dex */
public class TextDetector implements Detector {
    private static final int DEFAULT_NUMBER_OF_BYTES_TO_TEST = 512;
    private static final boolean[] IS_CONTROL_BYTE;
    private static final long serialVersionUID = 4774601079503507765L;
    private final int bytesToTest;

    static {
        boolean[] zArr = new boolean[32];
        IS_CONTROL_BYTE = zArr;
        Arrays.fill(zArr, true);
        zArr[9] = false;
        zArr[10] = false;
        zArr[12] = false;
        zArr[13] = false;
        zArr[27] = false;
    }

    public TextDetector() {
        this(DEFAULT_NUMBER_OF_BYTES_TO_TEST);
    }

    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) throws IOException {
        if (inputStream == null) {
            return MediaType.OCTET_STREAM;
        }
        inputStream.mark(this.bytesToTest);
        try {
            TextStatistics textStatistics = new TextStatistics();
            byte[] bArr = new byte[1024];
            int i3 = inputStream.read(bArr, 0, Math.min(this.bytesToTest, 1024));
            int i4 = 0;
            while (i3 != -1 && i4 < this.bytesToTest) {
                textStatistics.addData(bArr, 0, i3);
                i4 += i3;
                i3 = inputStream.read(bArr, 0, Math.min(this.bytesToTest - i4, 1024));
            }
            if (!textStatistics.isMostlyAscii() && !textStatistics.looksLikeUTF8()) {
                return MediaType.OCTET_STREAM;
            }
            return MediaType.TEXT_PLAIN;
        } finally {
            inputStream.reset();
        }
    }

    public TextDetector(int i3) {
        this.bytesToTest = i3;
    }
}
