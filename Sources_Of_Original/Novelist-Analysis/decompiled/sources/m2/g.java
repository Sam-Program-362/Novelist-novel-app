package m2;

import K1.r;
import i2.AbstractC0212u;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e {
    public final l2.d n;

    public g(l2.d dVar, R1.h hVar, int i3, k2.a aVar) {
        super(hVar, i3, aVar);
        this.n = dVar;
    }

    @Override // m2.e
    public final Object a(k2.q qVar, R1.c cVar) {
        Object objH = this.n.h(new o(qVar), cVar);
        O1.g gVar = O1.g.f1211a;
        S1.a aVar = S1.a.f1260k;
        if (objH != aVar) {
            objH = gVar;
        }
        return objH == aVar ? objH : gVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075 A[RETURN] */
    @Override // m2.e, l2.d
    public final Object h(l2.e eVar, R1.c cVar) throws Throwable {
        Object objH;
        int i3 = this.f4112l;
        S1.a aVar = S1.a.f1260k;
        O1.g gVar = O1.g.f1211a;
        if (i3 == -3) {
            R1.h context = cVar.getContext();
            Boolean bool = Boolean.FALSE;
            N.d dVar = new N.d(7);
            R1.h hVar = this.f4111k;
            R1.h hVarI = !((Boolean) hVar.f(bool, dVar)).booleanValue() ? context.i(hVar) : AbstractC0212u.b(context, hVar, false);
            if (a2.h.a(hVarI, context)) {
                Object objH2 = this.n.h(eVar, cVar);
                if (objH2 != aVar) {
                    objH2 = gVar;
                }
                if (objH2 == aVar) {
                    return objH2;
                }
            } else {
                R1.d dVar2 = R1.d.f1254k;
                if (a2.h.a(hVarI.e(dVar2), context.e(dVar2))) {
                    R1.h context2 = cVar.getContext();
                    if (!(eVar instanceof o)) {
                        eVar = new r(eVar, context2);
                    }
                    Object objB = k.b(hVarI, eVar, n2.a.k(hVarI), new f(this, null), cVar);
                    if (objB == aVar) {
                        return objB;
                    }
                } else {
                    objH = super.h(eVar, cVar);
                    if (objH == aVar) {
                        return objH;
                    }
                }
            }
        } else {
            objH = super.h(eVar, cVar);
            if (objH == aVar) {
                return objH;
            }
        }
        return gVar;
    }

    @Override // m2.e
    public final String toString() {
        return this.n + " -> " + super.toString();
    }
}
