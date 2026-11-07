package V;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2.c f1425a = new q2.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B1.g f1426b = new B1.g(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B1.a f1427c = new B1.a(new h0(2, null));

    public i0(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f1426b.f90l).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Z1.l lVar, T1.c cVar) {
        f0 f0Var;
        q2.c cVar2;
        Throwable th;
        q2.a aVar;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i3 = f0Var.f1411r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f0Var.f1411r = i3 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        Object obj = f0Var.f1409p;
        int i4 = f0Var.f1411r;
        S1.a aVar2 = S1.a.f1260k;
        try {
            if (i4 == 0) {
                H2.h.E(obj);
                f0Var.n = lVar;
                cVar2 = this.f1425a;
                f0Var.f1408o = cVar2;
                f0Var.f1411r = 1;
                if (cVar2.c(f0Var) != aVar2) {
                }
                return aVar2;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (q2.a) f0Var.n;
                try {
                    H2.h.E(obj);
                    ((q2.c) aVar).e(null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    ((q2.c) aVar).e(null);
                    throw th;
                }
            }
            q2.c cVar3 = f0Var.f1408o;
            Z1.l lVar2 = (Z1.l) f0Var.n;
            H2.h.E(obj);
            cVar2 = cVar3;
            lVar = lVar2;
            f0Var.n = cVar2;
            f0Var.f1408o = null;
            f0Var.f1411r = 2;
            Object objF = lVar.f(f0Var);
            if (objF != aVar2) {
                q2.c cVar4 = cVar2;
                obj = objF;
                aVar = cVar4;
                ((q2.c) aVar).e(null);
                return obj;
            }
            return aVar2;
        } catch (Throwable th3) {
            q2.c cVar5 = cVar2;
            th = th3;
            aVar = cVar5;
            ((q2.c) aVar).e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Z1.p pVar, T1.c cVar) throws Throwable {
        g0 g0Var;
        q2.c cVar2;
        Throwable th;
        boolean z3;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i3 = g0Var.f1421r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g0Var.f1421r = i3 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(this, cVar);
            }
        } else {
            g0Var = new g0(this, cVar);
        }
        Object obj = g0Var.f1419p;
        int i4 = g0Var.f1421r;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z3 = g0Var.f1418o;
            cVar2 = g0Var.n;
            try {
                H2.h.E(obj);
                if (z3) {
                    cVar2.e(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z3) {
                    cVar2.e(null);
                }
                throw th;
            }
        }
        H2.h.E(obj);
        q2.c cVar3 = this.f1425a;
        boolean zD = cVar3.d();
        try {
            Object objValueOf = Boolean.valueOf(zD);
            g0Var.n = cVar3;
            g0Var.f1418o = zD;
            g0Var.f1421r = 1;
            Object objE = pVar.e(objValueOf, g0Var);
            Object obj2 = S1.a.f1260k;
            if (objE == obj2) {
                return obj2;
            }
            cVar2 = cVar3;
            obj = objE;
            z3 = zD;
            if (z3) {
                cVar2.e(null);
            }
            return obj;
        } catch (Throwable th3) {
            cVar2 = cVar3;
            th = th3;
            z3 = zD;
            if (z3) {
                cVar2.e(null);
            }
            throw th;
        }
    }
}
