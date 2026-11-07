package V;

import i2.C0296m;
import i2.C0298o;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public final class d0 extends a2.i implements Z1.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J f1399l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ B1.s f1400m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(J j3, B1.s sVar) {
        super(1);
        this.f1399l = j3;
        this.f1400m = sVar;
    }

    @Override // Z1.l
    public final Object f(Object obj) {
        Object hVar;
        O1.g gVar;
        O1.g gVar2;
        Throwable th = (Throwable) obj;
        this.f1399l.f(th);
        k2.c cVar = (k2.c) this.f1400m.f146m;
        cVar.f(th, false);
        do {
            cVar.getClass();
            AtomicLongFieldUpdater atomicLongFieldUpdater = k2.c.f3874m;
            long j3 = atomicLongFieldUpdater.get(cVar);
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = k2.c.f3873l;
            long j4 = atomicLongFieldUpdater2.get(cVar);
            if (cVar.r(j4, true)) {
                hVar = new k2.h(cVar.m());
            } else {
                long j5 = j4 & 1152921504606846975L;
                k2.i iVar = k2.j.f3905a;
                if (j3 < j5) {
                    Object obj2 = k2.e.f3893k;
                    k2.k kVar = (k2.k) k2.c.f3877q.get(cVar);
                    while (true) {
                        if (cVar.r(atomicLongFieldUpdater2.get(cVar), true)) {
                            hVar = new k2.h(cVar.m());
                            break;
                        }
                        long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar);
                        long j6 = k2.e.f3884b;
                        long j7 = andIncrement / j6;
                        int i3 = (int) (andIncrement % j6);
                        if (kVar.f4176c != j7) {
                            k2.k l3 = cVar.l(j7, kVar);
                            if (l3 == null) {
                                continue;
                            } else {
                                kVar = l3;
                            }
                        }
                        Object A2 = cVar.A(kVar, i3, andIncrement, obj2);
                        if (A2 == k2.e.f3895m) {
                            i2.i0 i0Var = obj2 instanceof i2.i0 ? (i2.i0) obj2 : null;
                            if (i0Var != null) {
                                i0Var.a(kVar, i3);
                            }
                            cVar.C(andIncrement);
                            kVar.h();
                        } else if (A2 == k2.e.f3896o) {
                            if (andIncrement < cVar.p()) {
                                kVar.a();
                            }
                        } else {
                            if (A2 == k2.e.n) {
                                throw new IllegalStateException("unexpected");
                            }
                            kVar.a();
                            hVar = A2;
                        }
                    }
                }
                hVar = iVar;
            }
            gVar = null;
            if (hVar instanceof k2.i) {
                hVar = null;
            }
            gVar2 = O1.g.f1211a;
            if (hVar != null) {
                C0296m c0296m = ((a0) hVar).f1386b;
                Throwable cancellationException = th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th;
                c0296m.getClass();
                c0296m.F(new C0298o(cancellationException, false));
                gVar = gVar2;
            }
        } while (gVar != null);
        return gVar2;
    }
}
