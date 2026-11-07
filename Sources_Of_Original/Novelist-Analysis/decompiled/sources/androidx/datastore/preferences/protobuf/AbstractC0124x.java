package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0124x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f2114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f2115b;

    static {
        Charset.forName("US-ASCII");
        f2114a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2115b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0109h(bArr, 0, 0, false).e(0);
        } catch (C0126z e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }
}
