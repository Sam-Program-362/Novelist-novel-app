package p064x0;

import V.S;
import a2.h;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import p056t0.a;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f4695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f4696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f4697c;

    public e(ClassLoader classLoader, a aVar) {
        this.f4695a = classLoader;
        this.f4696b = aVar;
        this.f4697c = new a(classLoader);
    }

    public final WindowLayoutComponent a() {
        a aVar = this.f4697c;
        aVar.getClass();
        boolean zB = false;
        try {
            h.d(aVar.f4546a.loadClass("androidx.window.extensions.WindowExtensionsProvider"), "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            if (S0.a.I("WindowExtensionsProvider#getWindowExtensions is not valid", new S(aVar, 3)) && S0.a.I("WindowExtensions#getWindowLayoutComponent is not valid", new d(this, 3)) && S0.a.I("FoldingFeature class is not valid", new d(this, 0))) {
                int iA = p058u0.e.a();
                if (iA == 1) {
                    zB = b();
                } else if (2 <= iA && iA <= Integer.MAX_VALUE && b()) {
                    if (S0.a.I("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new d(this, 2))) {
                        zB = true;
                    }
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zB) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return S0.a.I("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new d(this, 1));
    }
}
