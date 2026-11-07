package X;

import androidx.datastore.preferences.protobuf.AbstractC0122t;
import androidx.datastore.preferences.protobuf.AbstractC0124v;
import androidx.datastore.preferences.protobuf.C0112i;
import androidx.datastore.preferences.protobuf.C0114k;
import androidx.datastore.preferences.protobuf.C0117n;
import androidx.datastore.preferences.protobuf.C0123u;
import androidx.datastore.preferences.protobuf.C0128z;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.b0;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends AbstractC0124v {
    private static final f DEFAULT_INSTANCE;
    private static volatile Q PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private H preferences_ = H.f1979l;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0124v.j(f.class, fVar);
    }

    public static H l(f fVar) {
        H h3 = fVar.preferences_;
        if (!h3.f1980k) {
            fVar.preferences_ = h3.b();
        }
        return fVar.preferences_;
    }

    public static d n() {
        return (d) ((AbstractC0122t) DEFAULT_INSTANCE.c(5));
    }

    public static f o(FileInputStream fileInputStream) {
        f fVar = DEFAULT_INSTANCE;
        C0112i c0112i = new C0112i(fileInputStream);
        C0117n a3 = C0117n.a();
        AbstractC0124v i3 = fVar.i();
        try {
            S s3 = S.f2003c;
            s3.getClass();
            V a4 = s3.a(i3.getClass());
            C0114k c0114k = c0112i.f2071b;
            if (c0114k == null) {
                c0114k = new C0114k(c0112i);
            }
            a4.g(i3, c0114k, a3);
            a4.d(i3);
            if (AbstractC0124v.f(i3, true)) {
                return (f) i3;
            }
            throw new C0128z(new b0().getMessage());
        } catch (b0 e3) {
            throw new C0128z(e3.getMessage());
        } catch (C0128z e4) {
            if (e4.f2116k) {
                throw new C0128z(e4.getMessage(), e4);
            }
            throw e4;
        } catch (IOException e5) {
            if (e5.getCause() instanceof C0128z) {
                throw ((C0128z) e5.getCause());
            }
            throw new C0128z(e5.getMessage(), e5);
        } catch (RuntimeException e6) {
            if (e6.getCause() instanceof C0128z) {
                throw ((C0128z) e6.getCause());
            }
            throw e6;
        }
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
                return new U(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", e.f1559a});
            case 3:
                return new f();
            case 4:
                return new d(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q4 = PARSER;
                if (q4 != null) {
                    return q4;
                }
                synchronized (f.class) {
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

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
