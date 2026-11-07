package X;

import androidx.datastore.preferences.protobuf.AbstractC0120t;
import androidx.datastore.preferences.protobuf.AbstractC0122v;
import androidx.datastore.preferences.protobuf.C0110i;
import androidx.datastore.preferences.protobuf.C0112k;
import androidx.datastore.preferences.protobuf.C0115n;
import androidx.datastore.preferences.protobuf.C0121u;
import androidx.datastore.preferences.protobuf.C0126z;
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

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0122v {
    private static final f DEFAULT_INSTANCE;
    private static volatile Q PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private H preferences_ = H.f1979l;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC0122v.j(f.class, fVar);
    }

    public static H l(f fVar) {
        H h3 = fVar.preferences_;
        if (!h3.f1980k) {
            fVar.preferences_ = h3.b();
        }
        return fVar.preferences_;
    }

    public static d n() {
        return (d) ((AbstractC0120t) DEFAULT_INSTANCE.c(5));
    }

    public static f o(FileInputStream fileInputStream) {
        f fVar = DEFAULT_INSTANCE;
        C0110i c0110i = new C0110i(fileInputStream);
        C0115n c0115nA = C0115n.a();
        AbstractC0122v abstractC0122vI = fVar.i();
        try {
            S s3 = S.f2003c;
            s3.getClass();
            V vA = s3.a(abstractC0122vI.getClass());
            C0112k c0112k = c0110i.f2071b;
            if (c0112k == null) {
                c0112k = new C0112k(c0110i);
            }
            vA.g(abstractC0122vI, c0112k, c0115nA);
            vA.d(abstractC0122vI);
            if (AbstractC0122v.f(abstractC0122vI, true)) {
                return (f) abstractC0122vI;
            }
            throw new C0126z(new b0().getMessage());
        } catch (b0 e3) {
            throw new C0126z(e3.getMessage());
        } catch (C0126z e4) {
            if (e4.f2116k) {
                throw new C0126z(e4.getMessage(), e4);
            }
            throw e4;
        } catch (IOException e5) {
            if (e5.getCause() instanceof C0126z) {
                throw ((C0126z) e5.getCause());
            }
            throw new C0126z(e5.getMessage(), e5);
        } catch (RuntimeException e6) {
            if (e6.getCause() instanceof C0126z) {
                throw ((C0126z) e6.getCause());
            }
            throw e6;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0122v
    public final Object c(int i3) {
        Q c0121u;
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
                Q q3 = PARSER;
                if (q3 != null) {
                    return q3;
                }
                synchronized (f.class) {
                    try {
                        c0121u = PARSER;
                        if (c0121u == null) {
                            c0121u = new C0121u();
                            PARSER = c0121u;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c0121u;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
