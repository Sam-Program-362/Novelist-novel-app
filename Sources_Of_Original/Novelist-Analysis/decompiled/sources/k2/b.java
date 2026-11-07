package k2;

import i2.AbstractC0212u;
import i2.C0199g;
import i2.i0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class b implements i0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f3870k = e.f3897p;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0199g f3871l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f3872m;

    public b(c cVar) {
        this.f3872m = cVar;
    }

    @Override // i2.i0
    public final void a(n2.r rVar, int i3) {
        C0199g c0199g = this.f3871l;
        if (c0199g != null) {
            c0199g.a(rVar, i3);
        }
    }

    public final Object b(l2.f fVar) throws Throwable {
        k kVar;
        Boolean bool;
        k kVarL;
        Object obj = this.f3870k;
        boolean z3 = true;
        if (obj == e.f3897p || obj == e.f3894l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f3877q;
            c cVar = this.f3872m;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar);
            while (!cVar.r(c.f3873l.get(cVar), true)) {
                long andIncrement = c.f3874m.getAndIncrement(cVar);
                long j3 = e.f3884b;
                long j4 = andIncrement / j3;
                int i3 = (int) (andIncrement % j3);
                if (kVar2.f4176c != j4) {
                    k kVarL2 = cVar.l(j4, kVar2);
                    if (kVarL2 == null) {
                        continue;
                    } else {
                        kVar = kVarL2;
                    }
                } else {
                    kVar = kVar2;
                }
                Object objA = cVar.A(kVar, i3, andIncrement, null);
                B1.g gVar = e.f3895m;
                if (objA == gVar) {
                    throw new IllegalStateException("unreachable");
                }
                B1.g gVar2 = e.f3896o;
                if (objA == gVar2) {
                    if (andIncrement < cVar.p()) {
                        kVar.a();
                    }
                    kVar2 = kVar;
                } else if (objA == e.n) {
                    C0199g c0199gD = AbstractC0212u.d(H2.h.s(fVar));
                    try {
                        this.f3871l = c0199gD;
                        try {
                            Object objA2 = cVar.A(kVar, i3, andIncrement, this);
                            if (objA2 != gVar) {
                                if (objA2 == gVar2) {
                                    if (andIncrement < cVar.p()) {
                                        kVar.a();
                                    }
                                    k kVar3 = (k) c.f3877q.get(cVar);
                                    while (true) {
                                        if (cVar.r(c.f3873l.get(cVar), true)) {
                                            C0199g c0199g = this.f3871l;
                                            a2.h.b(c0199g);
                                            this.f3871l = null;
                                            this.f3870k = e.f3894l;
                                            Throwable thM = cVar.m();
                                            if (thM != null) {
                                                c0199g.resumeWith(H2.h.i(thM));
                                                break;
                                            }
                                            c0199g.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = c.f3874m.getAndIncrement(cVar);
                                        long j5 = e.f3884b;
                                        long j6 = andIncrement2 / j5;
                                        int i4 = (int) (andIncrement2 % j5);
                                        if (kVar3.f4176c != j6) {
                                            kVarL = cVar.l(j6, kVar3);
                                            if (kVarL == null) {
                                            }
                                        } else {
                                            kVarL = kVar3;
                                        }
                                        Object objA3 = cVar.A(kVarL, i4, andIncrement2, this);
                                        if (objA3 == e.f3895m) {
                                            a(kVarL, i4);
                                            break;
                                        }
                                        if (objA3 == e.f3896o) {
                                            if (andIncrement2 < cVar.p()) {
                                                kVarL.a();
                                            }
                                            kVar3 = kVarL;
                                        } else {
                                            if (objA3 == e.n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            kVarL.a();
                                            this.f3870k = objA3;
                                            this.f3871l = null;
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                } else {
                                    kVar.a();
                                    this.f3870k = objA2;
                                    this.f3871l = null;
                                    bool = Boolean.TRUE;
                                }
                                c0199gD.z(bool, null);
                                break;
                            }
                            a(kVar, i3);
                            return c0199gD.r();
                        } catch (Throwable th) {
                            th = th;
                            c0199gD.y();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    kVar.a();
                    this.f3870k = objA;
                }
            }
            this.f3870k = e.f3894l;
            Throwable thM2 = cVar.m();
            if (thM2 != null) {
                int i5 = n2.s.f4177a;
                throw thM2;
            }
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}
