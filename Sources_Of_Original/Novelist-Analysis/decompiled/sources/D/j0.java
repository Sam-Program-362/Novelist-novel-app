package D;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends i0 {
    @Override // E2.a
    public final void M(boolean z3) {
        Window window = this.f243e;
        if (!z3) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        } else {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
        }
    }
}
