package k2;

import i2.i0;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class k extends n2.r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f3906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f3907f;

    public k(long j3, k kVar, c cVar, int i3) {
        super(j3, kVar, i3);
        this.f3906e = cVar;
        this.f3907f = new AtomicReferenceArray(e.f3884b * 2);
    }

    @Override // n2.r
    public final int f() {
        return e.f3884b;
    }

    @Override // n2.r
    public final void g(int i3, R1.h hVar) {
        c cVar;
        int i4 = e.f3884b;
        boolean z3 = i3 >= i4;
        if (z3) {
            i3 -= i4;
        }
        this.f3907f.get(i3 * 2);
        while (true) {
            Object objK = k(i3);
            boolean z4 = objK instanceof i0;
            cVar = this.f3906e;
            if (z4 || (objK instanceof t)) {
                if (j(objK, z3 ? e.f3892j : e.f3893k, i3)) {
                    m(i3, null);
                    l(i3, !z3);
                    if (z3) {
                        a2.h.b(cVar);
                        return;
                    }
                    return;
                }
            } else {
                if (objK == e.f3892j || objK == e.f3893k) {
                    break;
                }
                if (objK != e.f3889g && objK != e.f3888f) {
                    if (objK == e.f3891i || objK == e.f3886d || objK == e.f3894l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objK).toString());
                }
            }
        }
        m(i3, null);
        if (z3) {
            a2.h.b(cVar);
        }
    }

    public final boolean j(Object obj, Object obj2, int i3) {
        AtomicReferenceArray atomicReferenceArray;
        int i4 = (i3 * 2) + 1;
        do {
            atomicReferenceArray = this.f3907f;
            if (atomicReferenceArray.compareAndSet(i4, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i4) == obj);
        return false;
    }

    public final Object k(int i3) {
        return this.f3907f.get((i3 * 2) + 1);
    }

    public final void l(int i3, boolean z3) {
        if (z3) {
            c cVar = this.f3906e;
            a2.h.b(cVar);
            cVar.C((this.f4176c * ((long) e.f3884b)) + ((long) i3));
        }
        h();
    }

    public final void m(int i3, Object obj) {
        this.f3907f.set(i3 * 2, obj);
    }

    public final void n(int i3, Object obj) {
        this.f3907f.set((i3 * 2) + 1, obj);
    }
}
