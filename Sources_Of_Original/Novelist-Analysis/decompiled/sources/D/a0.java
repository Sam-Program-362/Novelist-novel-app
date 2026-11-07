package D;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends Z {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h0 f221w = h0.c(WindowInsets.CONSUMED, null);

    public a0(h0 h0Var, WindowInsets windowInsets) {
        super(h0Var, windowInsets);
    }

    @Override // D.Y, D.U
    public w.b F(int i3) {
        return w.b.c(this.f206c.getInsetsIgnoringVisibility(g0.a(i3)));
    }

    @Override // D.Y, D.U, D.d0
    public w.b h(int i3) {
        return w.b.c(this.f206c.getInsets(g0.a(i3)));
    }

    @Override // D.Y, D.U, D.d0
    public boolean s(int i3) {
        return this.f206c.isVisible(g0.a(i3));
    }

    @Override // D.U, D.d0
    public void n(View view) {
    }
}
