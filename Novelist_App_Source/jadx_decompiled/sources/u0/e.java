package u0;

import a2.p;
import androidx.window.extensions.WindowExtensionsProvider;

/* loaded from: classes.dex */
public abstract class e {
    static {
        p.a(e.class).c();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
