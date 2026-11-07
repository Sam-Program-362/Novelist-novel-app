package D;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class X extends W {

    /* renamed from: s, reason: collision with root package name */
    public w.b f217s;

    /* renamed from: t, reason: collision with root package name */
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
        Insets mandatorySystemGestureInsets;
        if (this.f218t == null) {
            mandatorySystemGestureInsets = this.f206c.getMandatorySystemGestureInsets();
            this.f218t = w.b.c(mandatorySystemGestureInsets);
        }
        return this.f218t;
    }

    @Override // D.d0
    public w.b k() {
        Insets systemGestureInsets;
        if (this.f217s == null) {
            systemGestureInsets = this.f206c.getSystemGestureInsets();
            this.f217s = w.b.c(systemGestureInsets);
        }
        return this.f217s;
    }

    @Override // D.d0
    public w.b m() {
        Insets tappableElementInsets;
        if (this.u == null) {
            tappableElementInsets = this.f206c.getTappableElementInsets();
            this.u = w.b.c(tappableElementInsets);
        }
        return this.u;
    }

    @Override // D.U, D.d0
    public h0 p(int i3, int i4, int i5, int i6) {
        WindowInsets inset;
        inset = this.f206c.inset(i3, i4, i5, i6);
        return h0.c(inset, null);
    }

    @Override // D.V, D.d0
    public void w(w.b bVar) {
    }
}
