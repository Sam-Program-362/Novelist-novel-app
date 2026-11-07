package org.apache.tika.exception;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class FileTooLongException extends IOException {
    public FileTooLongException(String str) {
        super(str);
    }

    private static String msg(long j3, long j4) {
        return "File is " + j3 + " bytes, but " + j4 + " is the maximum length allowed.  You can modify maxLength via the setter on the fetcher.";
    }

    public FileTooLongException(long j3, long j4) {
        super(msg(j3, j4));
    }
}
