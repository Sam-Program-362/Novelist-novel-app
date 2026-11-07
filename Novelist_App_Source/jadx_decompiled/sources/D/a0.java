package D;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class a0 extends Z {

    /* renamed from: w, reason: collision with root package name */
    public static final h0 f221w;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f221w = h0.c(windowInsets, null);
    }

    public a0(h0 h0Var, WindowInsets windowInsets) {
        super(h0Var, windowInsets);
    }

    @Override // D.Y, D.U
    public w.b F(int i3) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f206c.getInsetsIgnoringVisibility(g0.a(i3));
        return w.b.c(insetsIgnoringVisibility);
    }

    @Override // D.Y, D.U, D.d0
    public w.b h(int i3) {
        Insets insets;
        insets = this.f206c.getInsets(g0.a(i3));
        return w.b.c(insets);
    }

    @Override // D.Y, D.U, D.d0
    public boolean s(int i3) {
        boolean isVisible;
        isVisible = this.f206c.isVisible(g0.a(i3));
        return isVisible;
    }

    @Override // D.U, D.d0
    public void n(View view) {
    }
}
