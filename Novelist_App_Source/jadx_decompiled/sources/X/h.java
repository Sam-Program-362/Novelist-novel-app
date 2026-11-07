package X;

import androidx.datastore.preferences.protobuf.AbstractC0105b;
import androidx.datastore.preferences.protobuf.AbstractC0122t;
import androidx.datastore.preferences.protobuf.AbstractC0124v;
import androidx.datastore.preferences.protobuf.AbstractC0126x;
import androidx.datastore.preferences.protobuf.C0123u;
import androidx.datastore.preferences.protobuf.InterfaceC0125w;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.U;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public final class h extends AbstractC0124v {
    private static final h DEFAULT_INSTANCE;
    private static volatile Q PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0125w strings_ = T.n;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC0124v.j(h.class, hVar);
    }

    public static void l(h hVar, Set set) {
        InterfaceC0125w interfaceC0125w = hVar.strings_;
        if (!((AbstractC0105b) interfaceC0125w).f2028k) {
            T t3 = (T) interfaceC0125w;
            int i3 = t3.f2007m;
            hVar.strings_ = t3.c(i3 == 0 ? 10 : i3 * 2);
        }
        RandomAccess randomAccess = hVar.strings_;
        Charset charset = AbstractC0126x.f2114a;
        set.getClass();
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((T) randomAccess).f2007m);
        }
        T t4 = (T) randomAccess;
        int i4 = t4.f2007m;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (t4.f2007m - i4) + " is null.";
                for (int i5 = t4.f2007m - 1; i5 >= i4; i5--) {
                    t4.remove(i5);
                }
                throw new NullPointerException(str);
            }
            t4.add(obj);
        }
    }

    public static h m() {
        return DEFAULT_INSTANCE;
    }

    public static g o() {
        return (g) ((AbstractC0122t) DEFAULT_INSTANCE.c(5));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0124v
    public final Object c(int i3) {
        Q q3;
        switch (j.a(i3)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new U(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new h();
            case 4:
                return new g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q4 = PARSER;
                if (q4 != null) {
                    return q4;
                }
                synchronized (h.class) {
                    try {
                        q3 = PARSER;
                        if (q3 == null) {
                            q3 = new C0123u();
                            PARSER = q3;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return q3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final InterfaceC0125w n() {
        return this.strings_;
    }
}
