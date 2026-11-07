package k2;

import i2.AbstractC0303u;
import i2.C0290g;
import i2.i0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class b implements i0 {

    /* renamed from: k, reason: collision with root package name */
    public Object f3870k = e.f3897p;

    /* renamed from: l, reason: collision with root package name */
    public C0290g f3871l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f3872m;

    public b(c cVar) {
        this.f3872m = cVar;
    }

    @Override // i2.i0
    public final void a(n2.r rVar, int i3) {
        C0290g c0290g = this.f3871l;
        if (c0290g != null) {
            c0290g.a(rVar, i3);
        }
    }

    public final Object b(l2.f fVar) {
        k kVar;
        Boolean bool;
        k kVar2;
        Object obj = this.f3870k;
        boolean z3 = true;
        if (obj == e.f3897p || obj == e.f3894l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f3877q;
            c cVar = this.f3872m;
            k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar);
            while (!cVar.r(c.f3873l.get(cVar), true)) {
                long andIncrement = c.f3874m.getAndIncrement(cVar);
                long j3 = e.f3884b;
                long j4 = andIncrement / j3;
                int i3 = (int) (andIncrement % j3);
                if (kVar3.f4176c != j4) {
                    k l3 = cVar.l(j4, kVar3);
                    if (l3 == null) {
                        continue;
                    } else {
                        kVar = l3;
                    }
                } else {
                    kVar = kVar3;
                }
                Object A2 = cVar.A(kVar, i3, andIncrement, null);
                B1.g gVar = e.f3895m;
                if (A2 == gVar) {
                    throw new IllegalStateException("unreachable");
                }
                B1.g gVar2 = e.f3896o;
                if (A2 == gVar2) {
                    if (andIncrement < cVar.p()) {
                        kVar.a();
                    }
                    kVar3 = kVar;
                } else {
                    if (A2 != e.n) {
                        kVar.a();
                        this.f3870k = A2;
                        return Boolean.valueOf(z3);
                    }
                    C0290g d3 = AbstractC0303u.d(H2.h.s(fVar));
                    try {
                        this.f3871l = d3;
                        try {
                            Object A3 = cVar.A(kVar, i3, andIncrement, this);
                            if (A3 == gVar) {
                                a(kVar, i3);
                            } else {
                                if (A3 == gVar2) {
                                    if (andIncrement < cVar.p()) {
                                        kVar.a();
                                    }
                                    k kVar4 = (k) c.f3877q.get(cVar);
                                    while (true) {
                                        if (cVar.r(c.f3873l.get(cVar), true)) {
                                            C0290g c0290g = this.f3871l;
                                            a2.h.b(c0290g);
                                            this.f3871l = null;
                                            this.f3870k = e.f3894l;
                                            Throwable m3 = cVar.m();
                                            if (m3 == null) {
                                                c0290g.resumeWith(Boolean.FALSE);
                                            } else {
                                                c0290g.resumeWith(H2.h.i(m3));
                                            }
                                        } else {
                                            long andIncrement2 = c.f3874m.getAndIncrement(cVar);
                                            long j5 = e.f3884b;
                                            long j6 = andIncrement2 / j5;
                                            int i4 = (int) (andIncrement2 % j5);
                                            if (kVar4.f4176c != j6) {
                                                kVar2 = cVar.l(j6, kVar4);
                                                if (kVar2 == null) {
                                                }
                                            } else {
                                                kVar2 = kVar4;
                                            }
                                            Object A4 = cVar.A(kVar2, i4, andIncrement2, this);
                                            if (A4 == e.f3895m) {
                                                a(kVar2, i4);
                                                break;
                                            }
                                            if (A4 == e.f3896o) {
                                                if (andIncrement2 < cVar.p()) {
                                                    kVar2.a();
                                                }
                                                kVar4 = kVar2;
                                            } else {
                                                if (A4 == e.n) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                kVar2.a();
                                                this.f3870k = A4;
                                                this.f3871l = null;
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                    }
                                } else {
                                    kVar.a();
                                    this.f3870k = A3;
                                    this.f3871l = null;
                                    bool = Boolean.TRUE;
                                }
                                d3.z(bool, null);
                            }
                            return d3.r();
                        } catch (Throwable th) {
                            th = th;
                            d3.y();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
            this.f3870k = e.f3894l;
            Throwable m4 = cVar.m();
            if (m4 != null) {
                int i5 = n2.s.f4177a;
                throw m4;
            }
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}
