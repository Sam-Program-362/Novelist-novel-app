package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117n {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0117n f2085a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0117n f2086b;

    static {
        C0117n c0117n = new C0117n();
        Map map = Collections.EMPTY_MAP;
        f2086b = c0117n;
    }

    public static C0117n a() {
        C0117n c0117n;
        S s3 = S.f2003c;
        C0117n c0117n2 = f2085a;
        if (c0117n2 != null) {
            return c0117n2;
        }
        synchronized (C0117n.class) {
            try {
                c0117n = f2085a;
                if (c0117n == null) {
                    Class cls = AbstractC0116m.f2084a;
                    C0117n c0117n3 = null;
                    if (cls != null) {
                        try {
                            c0117n3 = (C0117n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c0117n = c0117n3 != null ? c0117n3 : f2086b;
                    f2085a = c0117n;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0117n;
    }
}
