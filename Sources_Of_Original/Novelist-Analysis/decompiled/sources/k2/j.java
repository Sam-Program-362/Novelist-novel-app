package k2;

import i2.C0199g;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f3905a = new i();

    public static c a(int i3, a aVar, int i4) {
        int i5 = i4 & 2;
        a aVar2 = a.f3867k;
        if (i5 != 0) {
            aVar = aVar2;
        }
        if (i3 == -2) {
            if (aVar != aVar2) {
                return new m(1, aVar);
            }
            g.f3903h.getClass();
            return new c(f.f3902b);
        }
        if (i3 == -1) {
            if (aVar == aVar2) {
                return new m(1, a.f3868l);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i3 == 0) {
            return aVar == aVar2 ? new c(0) : new m(1, aVar);
        }
        if (i3 != Integer.MAX_VALUE) {
            return aVar == aVar2 ? new c(i3) : new m(i3, aVar);
        }
        return new c(Integer.MAX_VALUE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(q qVar, X.b bVar, T1.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i3 = nVar.f3909p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nVar.f3909p = i3 - Integer.MIN_VALUE;
            } else {
                nVar = new n(cVar);
            }
        } else {
            nVar = new n(cVar);
        }
        Object obj = nVar.f3908o;
        int i4 = nVar.f3909p;
        try {
            if (i4 == 0) {
                H2.h.E(obj);
                R1.h hVar = nVar.f1277l;
                a2.h.b(hVar);
                if (hVar.e(i2.r.f3022l) != qVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                nVar.n = bVar;
                nVar.f3909p = 1;
                C0199g c0199g = new C0199g(1, H2.h.s(nVar));
                c0199g.s();
                ((p) qVar).U(new o(c0199g));
                Object objR = c0199g.r();
                S1.a aVar = S1.a.f1260k;
                if (objR == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = nVar.n;
                H2.h.E(obj);
            }
            bVar.a();
            return O1.g.f1211a;
        } catch (Throwable th) {
            bVar.a();
            throw th;
        }
    }
}
