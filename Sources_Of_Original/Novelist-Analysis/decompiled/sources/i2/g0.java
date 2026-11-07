package i2;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends n2.q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ThreadLocal f3005o;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public g0(R1.h hVar, T1.h hVar2) {
        h0 h0Var = h0.f3007k;
        super(hVar2, hVar.e(h0Var) == null ? hVar.i(h0Var) : hVar);
        this.f3005o = new ThreadLocal();
        R1.h hVar3 = hVar2.f1277l;
        a2.h.b(hVar3);
        if (hVar3.e(R1.d.f1254k) instanceof AbstractC0209q) {
            return;
        }
        Object objL = n2.a.l(hVar, null);
        n2.a.g(hVar, objL);
        V(hVar, objL);
    }

    public final boolean U() {
        boolean z3 = this.threadLocalIsSet && this.f3005o.get() == null;
        this.f3005o.remove();
        return !z3;
    }

    public final void V(R1.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f3005o.set(new O1.b(hVar, obj));
    }

    @Override // n2.q, i2.W
    public final void n(Object obj) {
        if (this.threadLocalIsSet) {
            O1.b bVar = (O1.b) this.f3005o.get();
            if (bVar != null) {
                n2.a.g((R1.h) bVar.f1203k, bVar.f1204l);
            }
            this.f3005o.remove();
        }
        Object objH = AbstractC0212u.h(obj);
        R1.c cVar = this.n;
        R1.h context = cVar.getContext();
        Object objL = n2.a.l(context, null);
        g0 g0VarM = objL != n2.a.f4143d ? AbstractC0212u.m(cVar, context, objL) : null;
        try {
            this.n.resumeWith(objH);
        } finally {
            if (g0VarM == null || g0VarM.U()) {
                n2.a.g(context, objL);
            }
        }
    }
}
