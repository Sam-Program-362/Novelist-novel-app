package p004b1;

import B1.e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class V implements Comparable {
    public static int d(byte b3) {
        return (b3 >> 5) & 7;
    }

    public static V e(byte... bArr) {
        bArr.getClass();
        X x = new X(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return AbstractC0168a.k(x);
        } finally {
            try {
                x.close();
            } catch (IOException unused) {
            }
        }
    }

    public abstract int a();

    public int b() {
        return 0;
    }

    public final V c(Class cls) throws U {
        if (cls.isInstance(this)) {
            return (V) cls.cast(this);
        }
        throw new U(e.k("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }
}
