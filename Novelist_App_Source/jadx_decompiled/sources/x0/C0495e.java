package x0;

import V.S;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import t0.C0472a;

/* renamed from: x0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0495e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f4695a;

    /* renamed from: b, reason: collision with root package name */
    public final C0472a f4696b;

    /* renamed from: c, reason: collision with root package name */
    public final C0472a f4697c;

    public C0495e(ClassLoader classLoader, C0472a c0472a) {
        this.f4695a = classLoader;
        this.f4696b = c0472a;
        this.f4697c = new C0472a(classLoader);
    }

    public final WindowLayoutComponent a() {
        C0472a c0472a = this.f4697c;
        c0472a.getClass();
        boolean z3 = false;
        try {
            a2.h.d(c0472a.f4546a.loadClass("androidx.window.extensions.WindowExtensionsProvider"), "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            if (S0.a.I("WindowExtensionsProvider#getWindowExtensions is not valid", new S(c0472a, 3)) && S0.a.I("WindowExtensions#getWindowLayoutComponent is not valid", new C0494d(this, 3)) && S0.a.I("FoldingFeature class is not valid", new C0494d(this, 0))) {
                int a3 = u0.e.a();
                if (a3 == 1) {
                    z3 = b();
                } else if (2 <= a3 && a3 <= Integer.MAX_VALUE && b()) {
                    if (S0.a.I("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new C0494d(this, 2))) {
                        z3 = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!z3) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return S0.a.I("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new C0494d(this, 1));
    }
}
