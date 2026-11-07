package D;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class Y extends X {

    /* renamed from: v, reason: collision with root package name */
    public static final h0 f219v;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f219v = h0.c(windowInsets, null);
    }

    public Y(h0 h0Var, WindowInsets windowInsets) {
        super(h0Var, windowInsets);
    }

    @Override // D.U
    public w.b F(int i3) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f206c.getInsetsIgnoringVisibility(e0.a(i3));
        return w.b.c(insetsIgnoringVisibility);
    }

    @Override // D.U, D.d0
    public w.b h(int i3) {
        Insets insets;
        insets = this.f206c.getInsets(e0.a(i3));
        return w.b.c(insets);
    }

    @Override // D.U, D.d0
    public boolean s(int i3) {
        boolean isVisible;
        isVisible = this.f206c.isVisible(e0.a(i3));
        return isVisible;
    }

    @Override // D.U, D.d0
    public final void d(View view) {
    }
}
