package p004b1;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class O extends IOException {
    public O(Exception exc) {
        super("Error in decoding CborValue from bytes", exc);
    }
}
