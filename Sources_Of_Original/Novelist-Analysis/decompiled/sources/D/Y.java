package D;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class Y extends X {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final h0 f219v = h0.c(WindowInsets.CONSUMED, null);

    public Y(h0 h0Var, WindowInsets windowInsets) {
        super(h0Var, windowInsets);
    }

    @Override // D.U
    public w.b F(int i3) {
        return w.b.c(this.f206c.getInsetsIgnoringVisibility(e0.a(i3)));
    }

    @Override // D.U, D.d0
    public w.b h(int i3) {
        return w.b.c(this.f206c.getInsets(e0.a(i3)));
    }

    @Override // D.U, D.d0
    public boolean s(int i3) {
        return this.f206c.isVisible(e0.a(i3));
    }

    @Override // D.U, D.d0
    public final void d(View view) {
    }
}
