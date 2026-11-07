package K1;

import V.C0091o;

/* JADX INFO: renamed from: K1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0038n implements l2.e {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f736k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l2.e f737l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f738m;

    public /* synthetic */ C0038n(l2.e eVar, Y.d dVar, int i3) {
        this.f736k = i3;
        this.f737l = eVar;
        this.f738m = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x0127  */
    /* JADX WARN: Code duplicated, block: B:89:0x0171  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // l2.e
    public final Object g(Object obj, R1.c cVar) {
        C0037m c0037m;
        t tVar;
        x xVar;
        z zVar;
        l2.m mVar;
        Object obj2;
        Object obj3;
        C0038n c0038n;
        switch (this.f736k) {
            case 0:
                if (cVar instanceof C0037m) {
                    c0037m = (C0037m) cVar;
                    int i3 = c0037m.f734o;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c0037m.f734o = i3 - Integer.MIN_VALUE;
                    } else {
                        c0037m = new C0037m(this, cVar);
                    }
                } else {
                    c0037m = new C0037m(this, cVar);
                }
                Object obj4 = c0037m.n;
                int i4 = c0037m.f734o;
                if (i4 == 0) {
                    H2.h.E(obj4);
                    Object objC = ((Y.b) obj).c((Y.d) this.f738m);
                    c0037m.f734o = 1;
                    Object objG = this.f737l.g(objC, c0037m);
                    S1.a aVar = S1.a.f1260k;
                    if (objG == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    H2.h.E(obj4);
                }
                return O1.g.f1211a;
            case 1:
                if (cVar instanceof t) {
                    tVar = (t) cVar;
                    int i5 = tVar.f757o;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        tVar.f757o = i5 - Integer.MIN_VALUE;
                    } else {
                        tVar = new t(this, cVar);
                    }
                } else {
                    tVar = new t(this, cVar);
                }
                Object obj5 = tVar.n;
                int i6 = tVar.f757o;
                if (i6 == 0) {
                    H2.h.E(obj5);
                    Object objC2 = ((Y.b) obj).c((Y.d) this.f738m);
                    tVar.f757o = 1;
                    Object objG2 = this.f737l.g(objC2, tVar);
                    S1.a aVar2 = S1.a.f1260k;
                    if (objG2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    H2.h.E(obj5);
                }
                return O1.g.f1211a;
            case 2:
                if (cVar instanceof x) {
                    xVar = (x) cVar;
                    int i7 = xVar.f773o;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        xVar.f773o = i7 - Integer.MIN_VALUE;
                    } else {
                        xVar = new x(this, cVar);
                    }
                } else {
                    xVar = new x(this, cVar);
                }
                Object obj6 = xVar.n;
                int i8 = xVar.f773o;
                if (i8 == 0) {
                    H2.h.E(obj6);
                    Object objC3 = ((Y.b) obj).c((Y.d) this.f738m);
                    xVar.f773o = 1;
                    Object objG3 = this.f737l.g(objC3, xVar);
                    S1.a aVar3 = S1.a.f1260k;
                    if (objG3 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    H2.h.E(obj6);
                }
                return O1.g.f1211a;
            case 3:
                if (cVar instanceof z) {
                    zVar = (z) cVar;
                    int i9 = zVar.f780o;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        zVar.f780o = i9 - Integer.MIN_VALUE;
                    } else {
                        zVar = new z(this, cVar);
                    }
                } else {
                    zVar = new z(this, cVar);
                }
                Object obj7 = zVar.n;
                int i10 = zVar.f780o;
                if (i10 == 0) {
                    H2.h.E(obj7);
                    Object objC4 = ((Y.b) obj).c((Y.d) this.f738m);
                    zVar.f780o = 1;
                    Object objG4 = this.f737l.g(objC4, zVar);
                    S1.a aVar4 = S1.a.f1260k;
                    if (objG4 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    H2.h.E(obj7);
                }
                return O1.g.f1211a;
            default:
                if (cVar instanceof l2.m) {
                    mVar = (l2.m) cVar;
                    int i11 = mVar.f4065p;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        mVar.f4065p = i11 - Integer.MIN_VALUE;
                    } else {
                        mVar = new l2.m(this, cVar);
                    }
                } else {
                    mVar = new l2.m(this, cVar);
                }
                Object obj8 = mVar.f4064o;
                int i12 = mVar.f4065p;
                boolean z3 = true;
                S1.a aVar5 = S1.a.f1260k;
                if (i12 != 0) {
                    if (i12 == 1) {
                        Object obj9 = mVar.f4067r;
                        C0038n c0038n2 = mVar.n;
                        H2.h.E(obj8);
                        obj3 = obj9;
                        c0038n = c0038n2;
                        obj2 = obj8;
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0038n = mVar.n;
                        H2.h.E(obj8);
                    }
                    if (z3) {
                        return O1.g.f1211a;
                    }
                    throw new m2.a(c0038n);
                }
                H2.h.E(obj8);
                C0091o c0091o = (C0091o) this.f738m;
                mVar.n = this;
                mVar.f4067r = obj;
                mVar.f4065p = 1;
                Object objE = c0091o.e(obj, mVar);
                if (objE == aVar5) {
                    return aVar5;
                }
                obj2 = objE;
                obj3 = obj;
                c0038n = this;
                if (((Boolean) obj2).booleanValue()) {
                    l2.e eVar = c0038n.f737l;
                    mVar.n = c0038n;
                    mVar.f4067r = null;
                    mVar.f4065p = 2;
                    if (eVar.g(obj3, mVar) == aVar5) {
                        return aVar5;
                    }
                } else {
                    z3 = false;
                }
                if (z3) {
                    return O1.g.f1211a;
                }
                throw new m2.a(c0038n);
        }
    }

    public C0038n(C0091o c0091o, l2.e eVar) {
        this.f736k = 4;
        this.f738m = c0091o;
        this.f737l = eVar;
    }
}
