package D;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends a0 {
    public c0(h0 h0Var, WindowInsets windowInsets) {
        super(h0Var, windowInsets);
    }

    @Override // D.U, D.d0
    public List<Rect> e(int i3) {
        return this.f206c.getBoundingRects(g0.a(i3));
    }

    @Override // D.U, D.d0
    public List<Rect> f(int i3) {
        return this.f206c.getBoundingRectsIgnoringVisibility(g0.a(i3));
    }

    @Override // D.U, D.d0
    public void o() {
    }
}
