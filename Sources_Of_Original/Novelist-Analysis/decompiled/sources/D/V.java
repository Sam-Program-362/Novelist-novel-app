package D;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class V extends U {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public w.b f216r;

    public V(h0 h0Var, WindowInsets windowInsets) {
        super(h0Var, windowInsets);
        this.f216r = null;
    }

    @Override // D.d0
    public h0 b() {
        return h0.c(this.f206c.consumeStableInsets(), null);
    }

    @Override // D.d0
    public h0 c() {
        return h0.c(this.f206c.consumeSystemWindowInsets(), null);
    }

    @Override // D.d0
    public final w.b j() {
        if (this.f216r == null) {
            WindowInsets windowInsets = this.f206c;
            this.f216r = w.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f216r;
    }

    @Override // D.d0
    public boolean q() {
        return this.f206c.isConsumed();
    }

    @Override // D.d0
    public void w(w.b bVar) {
        this.f216r = bVar;
    }
}
