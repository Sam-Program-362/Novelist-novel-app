package m2;

import a2.r;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final B1.g f4120a = new B1.g("NULL", 18);

    public static l2.d a(l2.c cVar, j2.c cVar2, int i3, k2.a aVar, int i4) {
        R1.h hVar = cVar2;
        if ((i4 & 1) != 0) {
            hVar = R1.i.f1255k;
        }
        if ((i4 & 2) != 0) {
            i3 = -3;
        }
        int i5 = i4 & 4;
        k2.a aVar2 = k2.a.f3867k;
        if (i5 != 0) {
            aVar = aVar2;
        }
        k2.a aVar3 = cVar.f4113m;
        int i6 = cVar.f4112l;
        R1.h hVar2 = cVar.f4111k;
        R1.h i7 = hVar.i(hVar2);
        if (aVar == aVar2) {
            if (i6 != -3) {
                if (i3 != -3) {
                    if (i6 != -2) {
                        if (i3 != -2) {
                            i3 += i6;
                            if (i3 < 0) {
                                i3 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i3 = i6;
            }
            aVar = aVar3;
        }
        return (a2.h.a(i7, hVar2) && i3 == i6 && aVar == aVar3) ? cVar : new l2.c(cVar.f4038o, i7, i3, aVar);
    }

    public static final Object b(R1.h hVar, Object obj, Object obj2, Z1.p pVar, R1.c cVar) {
        Object e3;
        Object l3 = n2.a.l(hVar, obj2);
        try {
            p pVar2 = new p(cVar, hVar);
            if (pVar == null) {
                e3 = H2.h.F(pVar, obj, pVar2);
            } else {
                r.a(2, pVar);
                e3 = pVar.e(obj, pVar2);
            }
            n2.a.g(hVar, l3);
            if (e3 == S1.a.f1260k) {
                a2.h.e(cVar, "frame");
            }
            return e3;
        } catch (Throwable th) {
            n2.a.g(hVar, l3);
            throw th;
        }
    }
}
