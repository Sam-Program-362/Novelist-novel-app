package p064x0;

import Z1.a;
import a2.h;
import a2.i;
import androidx.window.extensions.layout.WindowLayoutComponent;
import p058u0.e;
import p069z0.c;
import p069z0.d;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f f4698l = new f(0);

    @Override // Z1.a
    public final Object a() {
        WindowLayoutComponent windowLayoutComponentA;
        try {
            ClassLoader classLoader = h.class.getClassLoader();
            e eVar = classLoader != null ? new e(classLoader, new p056t0.a(classLoader)) : null;
            if (eVar == null || (windowLayoutComponentA = eVar.a()) == null) {
                return null;
            }
            h.d(classLoader, "loader");
            p056t0.a aVar = new p056t0.a(classLoader);
            int iA = e.a();
            if (iA >= 2) {
                return new d(windowLayoutComponentA);
            }
            return iA == 1 ? new c(windowLayoutComponentA, aVar) : new p069z0.a();
        } catch (Throwable unused) {
            g gVar = g.f4699a;
            return null;
        }
    }
}
