package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0106c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f2029a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f2030b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f2029a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f2030b = cls2 != null;
    }

    public static boolean a() {
        return (f2029a == null || f2030b) ? false : true;
    }
}
