package D;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {
    public static h0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        h0 h0VarC = h0.c(rootWindowInsets, null);
        d0 d0Var = h0VarC.f241a;
        d0Var.v(h0VarC);
        View rootView = view.getRootView();
        d0Var.d(rootView);
        d0Var.n(rootView);
        d0Var.o();
        return h0VarC;
    }
}
