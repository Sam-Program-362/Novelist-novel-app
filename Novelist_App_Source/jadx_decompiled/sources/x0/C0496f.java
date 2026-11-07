package x0;

import androidx.window.extensions.layout.WindowLayoutComponent;
import t0.C0472a;
import z0.C0504a;
import z0.C0506c;
import z0.C0507d;

/* renamed from: x0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0496f extends a2.i implements Z1.a {

    /* renamed from: l, reason: collision with root package name */
    public static final C0496f f4698l = new C0496f(0);

    @Override // Z1.a
    public final Object a() {
        WindowLayoutComponent a3;
        try {
            ClassLoader classLoader = h.class.getClassLoader();
            C0495e c0495e = classLoader != null ? new C0495e(classLoader, new C0472a(classLoader)) : null;
            if (c0495e == null || (a3 = c0495e.a()) == null) {
                return null;
            }
            a2.h.d(classLoader, "loader");
            C0472a c0472a = new C0472a(classLoader);
            int a4 = u0.e.a();
            return a4 >= 2 ? new C0507d(a3) : a4 == 1 ? new C0506c(a3, c0472a) : new C0504a();
        } catch (Throwable unused) {
            C0497g c0497g = C0497g.f4699a;
            return null;
        }
    }
}
