package m2;

import K1.r;
import i2.AbstractC0303u;

/* loaded from: classes.dex */
public final class g extends e {
    public final l2.d n;

    public g(l2.d dVar, R1.h hVar, int i3, k2.a aVar) {
        super(hVar, i3, aVar);
        this.n = dVar;
    }

    @Override // m2.e
    public final Object a(k2.q qVar, R1.c cVar) {
        Object h3 = this.n.h(new o(qVar), cVar);
        O1.g gVar = O1.g.f1211a;
        S1.a aVar = S1.a.f1260k;
        if (h3 != aVar) {
            h3 = gVar;
        }
        return h3 == aVar ? h3 : gVar;
    }

    @Override // m2.e, l2.d
    public final Object h(l2.e eVar, R1.c cVar) {
        int i3 = this.f4112l;
        S1.a aVar = S1.a.f1260k;
        O1.g gVar = O1.g.f1211a;
        if (i3 == -3) {
            R1.h context = cVar.getContext();
            Boolean bool = Boolean.FALSE;
            N.d dVar = new N.d(7);
            R1.h hVar = this.f4111k;
            R1.h i4 = !((Boolean) hVar.f(bool, dVar)).booleanValue() ? context.i(hVar) : AbstractC0303u.b(context, hVar, false);
            if (a2.h.a(i4, context)) {
                Object h3 = this.n.h(eVar, cVar);
                if (h3 != aVar) {
                    h3 = gVar;
                }
                if (h3 == aVar) {
                    return h3;
                }
            } else {
                R1.d dVar2 = R1.d.f1254k;
                if (a2.h.a(i4.e(dVar2), context.e(dVar2))) {
                    R1.h context2 = cVar.getContext();
                    if (!(eVar instanceof o)) {
                        eVar = new r(eVar, context2);
                    }
                    Object b3 = k.b(i4, eVar, n2.a.k(i4), new f(this, null), cVar);
                    if (b3 == aVar) {
                        return b3;
                    }
                }
            }
        }
        Object h4 = super.h(eVar, cVar);
        return h4 == aVar ? h4 : gVar;
    }

    @Override // m2.e
    public final String toString() {
        return this.n + " -> " + super.toString();
    }
}
