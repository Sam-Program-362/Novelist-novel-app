package org.apache.tika.io;

import java.io.InputStream;

/* loaded from: classes.dex */
public class IOUtils {
    public static long skip(InputStream inputStream, long j3, byte[] bArr) {
        if (j3 < 0) {
            throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j3);
        }
        long j4 = j3;
        while (j4 > 0) {
            long read = inputStream.read(bArr, 0, (int) Math.min(j4, bArr.length));
            if (read < 0) {
                break;
            }
            j4 -= read;
        }
        return j3 - j4;
    }
}
