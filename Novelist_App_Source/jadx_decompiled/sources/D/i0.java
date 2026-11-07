package D;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class i0 extends E2.a {

    /* renamed from: e, reason: collision with root package name */
    public final Window f243e;

    public i0(Window window) {
        this.f243e = window;
    }

    @Override // E2.a
    public final void N(boolean z3) {
        Window window = this.f243e;
        if (!z3) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}
