package V;

import i2.AbstractC0212u;

/* JADX INFO: renamed from: V.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0094s extends T1.h implements Z1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0079c f1464o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1465p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1466q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ N f1467r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0094s(N n, R1.c cVar) {
        super(2, cVar);
        this.f1467r = n;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((C0094s) i((R1.c) obj2, (l2.e) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        C0094s c0094s = new C0094s(this.f1467r, cVar);
        c0094s.f1466q = obj;
        return c0094s;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    @Override // T1.a
    public final Object m(Object obj) throws Throwable {
        l2.e eVar;
        j0 j0Var;
        l2.i iVar;
        Object objH;
        int i3 = this.f1465p;
        O1.g gVar = O1.g.f1211a;
        N n = this.f1467r;
        S1.a aVar = S1.a.f1260k;
        if (i3 == 0) {
            H2.h.E(obj);
            l2.e eVar2 = (l2.e) this.f1466q;
            this.f1466q = eVar2;
            this.f1465p = 1;
            Object objN = AbstractC0212u.n(n.f1343m.d(), new G(n, null), this);
            if (objN != aVar) {
                eVar = eVar2;
                obj = objN;
            }
            return aVar;
        }
        if (i3 == 1) {
            l2.e eVar3 = (l2.e) this.f1466q;
            H2.h.E(obj);
            eVar = eVar3;
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                H2.h.E(obj);
                return gVar;
            }
            j0Var = this.f1464o;
            eVar = (l2.e) this.f1466q;
            H2.h.E(obj);
        }
        iVar = new l2.i(new H0.i(new p004b1.Q(new p004b1.Q(new p004b1.Q(new C0090n(n, null), (l2.q) n.f1347r.f80l, 8), new C0091o(2, null), 10), new C0092p(j0Var, null), 9), 14), new C0093q(n, (R1.c) null));
        this.f1466q = null;
        this.f1464o = null;
        this.f1465p = 3;
        if (!(eVar instanceof l2.t)) {
            throw ((l2.t) eVar).f4082k;
        }
        objH = iVar.h(eVar, this);
        if (objH != aVar) {
            objH = gVar;
        }
        if (objH == aVar) {
            return aVar;
        }
        return gVar;
        j0Var = (j0) obj;
        if (j0Var instanceof C0079c) {
            Object obj2 = ((C0079c) j0Var).f1390b;
            this.f1466q = eVar;
            this.f1464o = (C0079c) j0Var;
            this.f1465p = 2;
            if (eVar.g(obj2, this) != aVar) {
            }
            return aVar;
        }
        if (j0Var instanceof k0) {
            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
        }
        if (j0Var instanceof b0) {
            throw ((b0) j0Var).f1389b;
        }
        if (!(j0Var instanceof Z)) {
        }
        return gVar;
        iVar = new l2.i(new H0.i(new p004b1.Q(new p004b1.Q(new p004b1.Q(new C0090n(n, null), (l2.q) n.f1347r.f80l, 8), new C0091o(2, null), 10), new C0092p(j0Var, null), 9), 14), new C0093q(n, (R1.c) null));
        this.f1466q = null;
        this.f1464o = null;
        this.f1465p = 3;
        if (!(eVar instanceof l2.t)) {
            throw ((l2.t) eVar).f4082k;
        }
        objH = iVar.h(eVar, this);
        if (objH != aVar) {
            objH = gVar;
        }
        if (objH == aVar) {
            return aVar;
        }
        return gVar;
    }
}
