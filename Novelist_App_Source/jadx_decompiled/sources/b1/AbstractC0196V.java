package b1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: b1.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0196V implements Comparable {
    public static int d(byte b3) {
        return (b3 >> 5) & 7;
    }

    public static AbstractC0196V e(byte... bArr) {
        bArr.getClass();
        X x = new X(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return AbstractC0197a.k(x);
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

    public final AbstractC0196V c(Class cls) {
        if (cls.isInstance(this)) {
            return (AbstractC0196V) cls.cast(this);
        }
        throw new C0195U(B1.e.k("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }
}
