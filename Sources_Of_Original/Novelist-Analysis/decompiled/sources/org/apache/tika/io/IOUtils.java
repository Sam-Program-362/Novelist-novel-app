package org.apache.tika.io;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class IOUtils {
    public static long skip(InputStream inputStream, long j3, byte[] bArr) {
        if (j3 < 0) {
            throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j3);
        }
        long j4 = j3;
        while (j4 > 0) {
            long j5 = inputStream.read(bArr, 0, (int) Math.min(j4, bArr.length));
            if (j5 < 0) {
                break;
            }
            j4 -= j5;
        }
        return j3 - j4;
    }
}
