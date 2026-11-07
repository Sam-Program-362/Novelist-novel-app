package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0126x {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f2114a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f2115b;

    static {
        Charset.forName("US-ASCII");
        f2114a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2115b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0111h(bArr, 0, 0, false).e(0);
        } catch (C0128z e3) {
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
