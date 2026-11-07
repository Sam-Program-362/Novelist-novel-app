package V;

import i2.AbstractC0212u;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class F extends T1.h implements Z1.l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1313o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1314p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N f1315q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f1316r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1317s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Serializable f1318t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public F(N n, R1.h hVar, Z1.p pVar, R1.c cVar) {
        super(1, cVar);
        this.f1315q = n;
        this.f1317s = hVar;
        this.f1318t = (T1.h) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T1.h, Z1.p] */
    @Override // Z1.l
    public final Object f(Object obj) {
        R1.c cVar = (R1.c) obj;
        switch (this.f1313o) {
            case 0:
                return new F((a2.o) this.f1317s, this.f1315q, (a2.n) this.f1318t, cVar).m(O1.g.f1211a);
            default:
                return new F(this.f1315q, (R1.h) this.f1317s, (Z1.p) this.f1318t, cVar).m(O1.g.f1211a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v3, types: [T1.h, Z1.p] */
    @Override // T1.a
    public final Object m(Object obj) throws Throwable {
        a2.o oVar;
        a2.n nVar;
        C0079c c0079c;
        Object obj2;
        int iHashCode;
        switch (this.f1313o) {
            case 0:
                a2.n nVar2 = (a2.n) this.f1318t;
                a2.o oVar2 = (a2.o) this.f1317s;
                int i3 = this.f1314p;
                N n = this.f1315q;
                S1.a aVar = S1.a.f1260k;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            oVar = (a2.o) ((Serializable) this.f1316r);
                            H2.h.E(obj);
                        } else {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                nVar2 = (a2.n) ((Serializable) this.f1316r);
                                H2.h.E(obj);
                                nVar2.f1712k = ((Number) obj).intValue();
                                return O1.g.f1211a;
                            }
                            nVar = (a2.n) ((Serializable) this.f1316r);
                            H2.h.E(obj);
                        }
                        nVar.f1712k = ((Number) obj).intValue();
                        return O1.g.f1211a;
                    }
                    H2.h.E(obj);
                    this.f1316r = oVar2;
                    this.f1314p = 1;
                    obj = n.i(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    oVar = oVar2;
                    oVar.f1713k = obj;
                    i0 i0VarG = n.g();
                    this.f1316r = nVar2;
                    this.f1314p = 2;
                    obj = i0VarG.a();
                    if (obj == aVar) {
                        return aVar;
                    }
                    nVar = nVar2;
                    nVar.f1712k = ((Number) obj).intValue();
                    return O1.g.f1211a;
                } catch (C0078b unused) {
                    Object obj3 = oVar2.f1713k;
                    this.f1316r = nVar2;
                    this.f1314p = 3;
                    obj = n.j(obj3, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            default:
                int i4 = this.f1314p;
                N n3 = this.f1315q;
                S1.a aVar2 = S1.a.f1260k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        H2.h.E(obj);
                    } else {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.f1316r;
                            H2.h.E(obj);
                            return obj4;
                        }
                        c0079c = (C0079c) this.f1316r;
                        H2.h.E(obj);
                    }
                    obj2 = c0079c.f1390b;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    if (iHashCode == c0079c.f1391c) {
                        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    }
                    if (!a2.h.a(c0079c.f1390b, obj)) {
                        this.f1316r = obj;
                        this.f1314p = 3;
                        if (n3.j(obj, true, this) == aVar2) {
                            return aVar2;
                        }
                    }
                    return obj;
                }
                H2.h.E(obj);
                this.f1314p = 1;
                obj = N.f(n3, true, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                c0079c = (C0079c) obj;
                R1.h hVar = (R1.h) this.f1317s;
                H h3 = new H((T1.h) this.f1318t, c0079c, null);
                this.f1316r = c0079c;
                this.f1314p = 2;
                obj = AbstractC0212u.n(hVar, h3, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                obj2 = c0079c.f1390b;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                if (iHashCode == c0079c.f1391c) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (!a2.h.a(c0079c.f1390b, obj)) {
                    this.f1316r = obj;
                    this.f1314p = 3;
                    if (n3.j(obj, true, this) == aVar2) {
                        return aVar2;
                    }
                }
                return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(a2.o oVar, N n, a2.n nVar, R1.c cVar) {
        super(1, cVar);
        this.f1317s = oVar;
        this.f1315q = n;
        this.f1318t = nVar;
    }
}
