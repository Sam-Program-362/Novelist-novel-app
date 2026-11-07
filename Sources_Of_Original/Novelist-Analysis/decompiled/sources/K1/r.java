package K1;

import V.C0092p;

/* JADX INFO: loaded from: classes.dex */
public final class r implements l2.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f749k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f750l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f751m;
    public final Object n;

    public r(a2.m mVar, l2.e eVar, C0092p c0092p) {
        this.f751m = mVar;
        this.f750l = eVar;
        this.n = c0092p;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8  */
    @Override // l2.e
    public final Object g(Object obj, R1.c cVar) {
        q qVar;
        l2.k kVar;
        r rVar;
        switch (this.f749k) {
            case 0:
                if (cVar instanceof q) {
                    qVar = (q) cVar;
                    int i3 = qVar.f747o;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        qVar.f747o = i3 - Integer.MIN_VALUE;
                    } else {
                        qVar = new q(this, cVar);
                    }
                } else {
                    qVar = new q(this, cVar);
                }
                Object obj2 = qVar.n;
                int i4 = qVar.f747o;
                if (i4 == 0) {
                    H2.h.E(obj2);
                    l2.e eVar = (l2.e) this.f750l;
                    Double d3 = (Double) M.c(((Y.b) obj).c((Y.d) this.f751m), ((L) this.n).f699m);
                    qVar.f747o = 1;
                    Object objG = eVar.g(d3, qVar);
                    S1.a aVar = S1.a.f1260k;
                    if (objG == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    H2.h.E(obj2);
                }
                return O1.g.f1211a;
            case 1:
                if (cVar instanceof l2.k) {
                    kVar = (l2.k) cVar;
                    int i5 = kVar.f4060r;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        kVar.f4060r = i5 - Integer.MIN_VALUE;
                    } else {
                        kVar = new l2.k(this, cVar);
                    }
                } else {
                    kVar = new l2.k(this, cVar);
                }
                Object objE = kVar.f4058p;
                int i6 = kVar.f4060r;
                O1.g gVar = O1.g.f1211a;
                S1.a aVar2 = S1.a.f1260k;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            obj = kVar.f4057o;
                            rVar = kVar.n;
                            H2.h.E(objE);
                        } else if (i6 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    H2.h.E(objE);
                    return gVar;
                }
                H2.h.E(objE);
                if (((a2.m) this.f751m).f1711k) {
                    l2.e eVar2 = (l2.e) this.f750l;
                    kVar.f4060r = 1;
                    if (eVar2.g(obj, kVar) != aVar2) {
                        return gVar;
                    }
                } else {
                    C0092p c0092p = (C0092p) this.n;
                    kVar.n = this;
                    kVar.f4057o = obj;
                    kVar.f4060r = 2;
                    objE = c0092p.e(obj, kVar);
                    if (objE != aVar2) {
                        rVar = this;
                    }
                }
                return aVar2;
                if (((Boolean) objE).booleanValue()) {
                    return gVar;
                }
                ((a2.m) rVar.f751m).f1711k = true;
                l2.e eVar3 = (l2.e) rVar.f750l;
                kVar.n = null;
                kVar.f4057o = null;
                kVar.f4060r = 3;
                if (eVar3.g(obj, kVar) != aVar2) {
                    return gVar;
                }
                return aVar2;
            default:
                Object objB = m2.k.b((R1.h) this.f750l, obj, this.f751m, (m2.q) this.n, cVar);
                return objB == S1.a.f1260k ? objB : O1.g.f1211a;
        }
    }

    public r(l2.e eVar, Y.d dVar, L l3) {
        this.f750l = eVar;
        this.f751m = dVar;
        this.n = l3;
    }

    public r(l2.e eVar, R1.h hVar) {
        this.f750l = hVar;
        this.f751m = n2.a.k(hVar);
        this.n = new m2.q(eVar, null);
    }
}
