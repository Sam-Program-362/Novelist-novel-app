package k2;

import V.InterfaceC0084h;
import i2.i0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends c {
    public final a u;

    public m(int i3, a aVar) {
        super(i3);
        this.u = aVar;
        if (aVar != a.f3867k) {
            if (i3 < 1) {
                throw new IllegalArgumentException(B1.e.h("Buffered channel capacity must be at least 1, but ", i3, " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + a2.p.a(c.class).c() + " instead").toString());
        }
    }

    public final Object D(Object obj, boolean z3) {
        a aVar = this.u;
        a aVar2 = a.f3869m;
        O1.g gVar = O1.g.f1211a;
        if (aVar == aVar2) {
            Object objH = super.h(obj);
            return (!(objH instanceof i) || (objH instanceof h)) ? objH : gVar;
        }
        InterfaceC0084h interfaceC0084h = e.f3886d;
        k kVar = (k) c.f3876p.get(this);
        while (true) {
            long andIncrement = c.f3873l.getAndIncrement(this);
            long j3 = 1152921504606846975L & andIncrement;
            boolean zR = r(andIncrement, false);
            int i3 = e.f3884b;
            long j4 = i3;
            long j5 = j3 / j4;
            int i4 = (int) (j3 % j4);
            if (kVar.f4176c != j5) {
                k kVarA = c.a(this, j5, kVar);
                if (kVarA != null) {
                    kVar = kVarA;
                } else if (zR) {
                    return new h(o());
                }
            }
            int iD = c.d(this, kVar, i4, obj, j3, interfaceC0084h, zR);
            if (iD == 0) {
                kVar.a();
                return gVar;
            }
            if (iD != 1) {
                if (iD != 2) {
                    if (iD == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iD == 4) {
                        if (j3 < c.f3874m.get(this)) {
                            kVar.a();
                        }
                        return new h(o());
                    }
                    if (iD == 5) {
                        kVar.a();
                    }
                } else {
                    if (zR) {
                        kVar.h();
                        return new h(o());
                    }
                    i0 i0Var = interfaceC0084h instanceof i0 ? (i0) interfaceC0084h : null;
                    if (i0Var != null) {
                        i0Var.a(kVar, i4 + i3);
                    }
                    j((kVar.f4176c * j4) + ((long) i4));
                }
            }
            return gVar;
        }
    }

    @Override // k2.c, k2.s
    public final Object g(R1.c cVar, Object obj) throws Throwable {
        if (D(obj, true) instanceof h) {
            throw o();
        }
        return O1.g.f1211a;
    }

    @Override // k2.c, k2.s
    public final Object h(Object obj) {
        return D(obj, false);
    }

    @Override // k2.c
    public final boolean t() {
        return this.u == a.f3868l;
    }
}
