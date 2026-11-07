package e0;

import B1.e;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: e0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238a {

    /* renamed from: a, reason: collision with root package name */
    public final C0239b f2776a = new C0239b();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2777b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f2778c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f2779d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                e.o(autoCloseable);
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        }
    }
}
