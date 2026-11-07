package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0115n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile C0115n f2085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0115n f2086b;

    static {
        C0115n c0115n = new C0115n();
        Map map = Collections.EMPTY_MAP;
        f2086b = c0115n;
    }

    public static C0115n a() {
        C0115n c0115n;
        S s3 = S.f2003c;
        C0115n c0115n2 = f2085a;
        if (c0115n2 != null) {
            return c0115n2;
        }
        synchronized (C0115n.class) {
            try {
                c0115n = f2085a;
                if (c0115n == null) {
                    Class cls = AbstractC0114m.f2084a;
                    C0115n c0115n3 = null;
                    if (cls != null) {
                        try {
                            c0115n3 = (C0115n) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    c0115n = c0115n3 != null ? c0115n3 : f2086b;
                    f2085a = c0115n;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0115n;
    }
}
