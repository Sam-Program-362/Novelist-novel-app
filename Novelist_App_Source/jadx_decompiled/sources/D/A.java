package D;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class A {
    public static h0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        h0 c3 = h0.c(rootWindowInsets, null);
        d0 d0Var = c3.f241a;
        d0Var.v(c3);
        View rootView = view.getRootView();
        d0Var.d(rootView);
        d0Var.n(rootView);
        d0Var.o();
        return c3;
    }
}
