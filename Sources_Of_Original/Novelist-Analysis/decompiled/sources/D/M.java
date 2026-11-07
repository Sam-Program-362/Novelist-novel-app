package D;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class M extends T {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowInsets.Builder f197e;

    public M() {
        this.f197e = L.f();
    }

    @Override // D.T
    public h0 b() {
        a();
        h0 h0VarC = h0.c(this.f197e.build(), null);
        w.b[] bVarArr = this.f199b;
        d0 d0Var = h0VarC.f241a;
        d0Var.u(bVarArr);
        d0Var.t(null);
        d0Var.y(this.f200c);
        d0Var.z(this.f201d);
        return h0VarC;
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
        WindowInsets.Builder builderF;
        super(h0Var);
        WindowInsets windowInsetsB = h0Var.b();
        if (windowInsetsB != null) {
            builderF = L.g(windowInsetsB);
        } else {
            builderF = L.f();
        }
        this.f197e = builderF;
    }
}
