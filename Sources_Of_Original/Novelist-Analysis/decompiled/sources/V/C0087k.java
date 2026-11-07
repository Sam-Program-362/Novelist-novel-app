package V;

/* JADX INFO: renamed from: V.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0087k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q2.a f1435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a2.m f1436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2.o f1437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N f1438d;

    public C0087k(q2.a aVar, a2.m mVar, a2.o oVar, N n) {
        this.f1435a = aVar;
        this.f1436b = mVar;
        this.f1437c = oVar;
        this.f1438d = n;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ae, B:38:0x00b6), top: B:54:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(C0083g c0083g, T1.c cVar) throws Throwable {
        C0086j c0086j;
        N n;
        a2.m mVar;
        a2.o oVar;
        q2.a aVar;
        Z1.p pVar;
        q2.a aVar2;
        q2.a aVar3;
        N n3;
        Object obj;
        q2.a aVar4;
        if (cVar instanceof C0086j) {
            c0086j = (C0086j) cVar;
            int i3 = c0086j.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0086j.u = i3 - Integer.MIN_VALUE;
            } else {
                c0086j = new C0086j(this, cVar);
            }
        } else {
            c0086j = new C0086j(this, cVar);
        }
        Object obj2 = c0086j.f1432s;
        int i4 = c0086j.u;
        S1.a aVar5 = S1.a.f1260k;
        try {
            if (i4 == 0) {
                H2.h.E(obj2);
                c0086j.n = c0083g;
                q2.a aVar6 = this.f1435a;
                c0086j.f1428o = aVar6;
                a2.m mVar2 = this.f1436b;
                c0086j.f1429p = mVar2;
                a2.o oVar2 = this.f1437c;
                c0086j.f1430q = oVar2;
                n = this.f1438d;
                c0086j.f1431r = n;
                c0086j.u = 1;
                q2.c cVar2 = (q2.c) aVar6;
                if (cVar2.c(c0086j) != aVar5) {
                    mVar = mVar2;
                    oVar = oVar2;
                    pVar = c0083g;
                    aVar = cVar2;
                }
                return aVar5;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c0086j.f1429p;
                    oVar = (a2.o) c0086j.f1428o;
                    aVar2 = (q2.a) c0086j.n;
                    try {
                        H2.h.E(obj2);
                        aVar4 = aVar2;
                        oVar.f1713k = obj;
                        aVar2 = aVar4;
                        Object obj3 = oVar.f1713k;
                        ((q2.c) aVar2).e(null);
                        return obj3;
                    } catch (Throwable th) {
                        th = th;
                        ((q2.c) aVar2).e(null);
                        throw th;
                    }
                }
                n3 = (N) c0086j.f1429p;
                oVar = (a2.o) c0086j.f1428o;
                aVar3 = (q2.a) c0086j.n;
                try {
                    H2.h.E(obj2);
                    aVar3 = aVar3;
                    if (!a2.h.a(obj2, oVar.f1713k)) {
                        c0086j.n = aVar3;
                        c0086j.f1428o = oVar;
                        c0086j.f1429p = obj2;
                        c0086j.u = 3;
                        if (n3.j(obj2, false, c0086j) != aVar5) {
                            obj = obj2;
                            aVar4 = aVar3;
                            oVar.f1713k = obj;
                            aVar2 = aVar4;
                        }
                        return aVar5;
                    }
                    aVar2 = aVar3;
                    Object obj4 = oVar.f1713k;
                    ((q2.c) aVar2).e(null);
                    return obj4;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar3;
                    ((q2.c) aVar2).e(null);
                    throw th;
                }
            }
            N n4 = c0086j.f1431r;
            oVar = c0086j.f1430q;
            mVar = (a2.m) c0086j.f1429p;
            q2.a aVar7 = (q2.a) c0086j.f1428o;
            Z1.p pVar2 = (Z1.p) c0086j.n;
            H2.h.E(obj2);
            n = n4;
            pVar = pVar2;
            aVar = aVar7;
            if (mVar.f1711k) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = oVar.f1713k;
            c0086j.n = aVar;
            c0086j.f1428o = oVar;
            c0086j.f1429p = n;
            c0086j.f1430q = null;
            c0086j.f1431r = null;
            c0086j.u = 2;
            Object objE = pVar.e(obj5, c0086j);
            if (objE != aVar5) {
                aVar3 = aVar;
                obj2 = objE;
                n3 = n;
                if (!a2.h.a(obj2, oVar.f1713k)) {
                    c0086j.n = aVar3;
                    c0086j.f1428o = oVar;
                    c0086j.f1429p = obj2;
                    c0086j.u = 3;
                    if (n3.j(obj2, false, c0086j) != aVar5) {
                        obj = obj2;
                        aVar4 = aVar3;
                        oVar.f1713k = obj;
                        aVar2 = aVar4;
                    }
                } else {
                    aVar2 = aVar3;
                }
                Object obj6 = oVar.f1713k;
                ((q2.c) aVar2).e(null);
                return obj6;
            }
            return aVar5;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            ((q2.c) aVar2).e(null);
            throw th;
        }
    }
}
