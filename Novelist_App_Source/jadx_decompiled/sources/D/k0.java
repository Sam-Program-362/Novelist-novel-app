package D;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class k0 extends E2.a {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsController f249e;

    /* renamed from: f, reason: collision with root package name */
    public final Window f250f;

    public k0(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f249e = insetsController;
        this.f250f = window;
    }

    @Override // E2.a
    public void M(boolean z3) {
        c0(16, 16, z3);
    }

    @Override // E2.a
    public void N(boolean z3) {
        c0(8192, 8, z3);
    }

    public final void c0(int i3, int i4, boolean z3) {
        Window window = this.f250f;
        if (window == null) {
            if (z3) {
                this.f249e.setSystemBarsAppearance(i4, i4);
                return;
            } else {
                this.f249e.setSystemBarsAppearance(0, i4);
                return;
            }
        }
        if (z3) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i3 | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i3) & decorView2.getSystemUiVisibility());
        }
    }
}
