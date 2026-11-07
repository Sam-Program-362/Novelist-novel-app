package D;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class M extends T {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsets.Builder f197e;

    public M() {
        this.f197e = L.f();
    }

    @Override // D.T
    public h0 b() {
        WindowInsets build;
        a();
        build = this.f197e.build();
        h0 c3 = h0.c(build, null);
        w.b[] bVarArr = this.f199b;
        d0 d0Var = c3.f241a;
        d0Var.u(bVarArr);
        d0Var.t(null);
        d0Var.y(this.f200c);
        d0Var.z(this.f201d);
        return c3;
    }

    @Override // D.T
    public void e(w.b bVar) {
        this.f197e.setMandatorySystemGestureInsets(bVar.d());
    }

    @Override // D.T
    public void f(w.b bVar) {
        this.f197e.setStableInsets(bVar.d());
    }

    @Override // D.T
    public void g(w.b bVar) {
        this.f197e.setSystemGestureInsets(bVar.d());
    }

    @Override // D.T
    public void h(w.b bVar) {
        this.f197e.setSystemWindowInsets(bVar.d());
    }

    @Override // D.T
    public void i(w.b bVar) {
        this.f197e.setTappableElementInsets(bVar.d());
    }

    public M(h0 h0Var) {
        super(h0Var);
        WindowInsets.Builder f3;
        WindowInsets b3 = h0Var.b();
        if (b3 != null) {
            f3 = L.g(b3);
        } else {
            f3 = L.f();
        }
        this.f197e = f3;
    }
}
