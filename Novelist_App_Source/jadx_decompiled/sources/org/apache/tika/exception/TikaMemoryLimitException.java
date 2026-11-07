package org.apache.tika.exception;

/* loaded from: classes.dex */
public class TikaMemoryLimitException extends TikaException {
    public TikaMemoryLimitException(String str) {
        super(str);
    }

    private static String msg(long j3, long j4) {
        return "Tried to allocate " + j3 + " bytes, but " + j4 + " is the maximum allowed. Please open an issue https://issues.apache.org/jira/projects/TIKA if you believe this file is not corrupt.";
    }

    public TikaMemoryLimitException(long j3, long j4) {
        super(msg(j3, j4));
    }
}
