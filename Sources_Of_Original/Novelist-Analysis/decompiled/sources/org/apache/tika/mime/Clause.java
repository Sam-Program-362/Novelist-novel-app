package org.apache.tika.mime;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
interface Clause extends Serializable {
    boolean eval(byte[] bArr);

    int size();
}
