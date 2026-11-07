package D;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class X extends W {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public w.b f217s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public w.b f218t;
    public w.b u;

    public X(h0 h0Var, WindowInsets windowInsets) {
        super(h0Var, windowInsets);
        this.f217s = null;
        this.f218t = null;
        this.u = null;
    }

    @Override // D.d0
    public w.b i() {
        if (this.f218t == null) {
            this.f218t = w.b.c(this.f206c.getMandatorySystemGestureInsets());
        }
        return this.f218t;
    }

    @Override // D.d0
    public w.b k() {
        if (this.f217s == null) {
            this.f217s = w.b.c(this.f206c.getSystemGestureInsets());
        }
        return this.f217s;
    }

    @Override // D.d0
    public w.b m() {
        if (this.u == null) {
            this.u = w.b.c(this.f206c.getTappableElementInsets());
        }
        return this.u;
    }

    @Override // D.U, D.d0
    public h0 p(int i3, int i4, int i5, int i6) {
        return h0.c(this.f206c.inset(i3, i4, i5, i6), null);
    }

    @Override // D.V, D.d0
    public void w(w.b bVar) {
    }
}
