package l2;

import V.C0093q;

/* JADX INFO: loaded from: classes.dex */
public final class i implements d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ H0.i f4050k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0093q f4051l;

    public i(H0.i iVar, C0093q c0093q) {
        this.f4050k = iVar;
        this.f4051l = c0093q;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // l2.d
    public final Object h(e eVar, R1.c cVar) throws Throwable {
        h hVar;
        i iVar;
        t tVar;
        C0093q c0093q;
        m2.l lVar;
        Throwable th;
        m2.l lVar2;
        C0093q c0093q2;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i3 = hVar.f4046o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.f4046o = i3 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj = hVar.n;
        int i4 = hVar.f4046o;
        S1.a aVar = S1.a.f1260k;
        if (i4 == 0) {
            H2.h.E(obj);
            try {
                H0.i iVar2 = this.f4050k;
                hVar.f4048q = this;
                hVar.f4049r = eVar;
                hVar.f4046o = 1;
                if (iVar2.h(eVar, hVar) != aVar) {
                    iVar = this;
                    R1.h hVar2 = hVar.f1277l;
                    a2.h.b(hVar2);
                    lVar = new m2.l(eVar, hVar2);
                    c0093q2 = iVar.f4051l;
                    hVar.f4048q = lVar;
                    hVar.f4049r = null;
                    hVar.f4046o = 3;
                    if (c0093q2.d(lVar, null, hVar) != aVar) {
                        lVar2 = lVar;
                        lVar2.n();
                        return O1.g.f1211a;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                iVar = this;
                tVar = new t(th);
                c0093q = iVar.f4051l;
                hVar.f4048q = th;
                hVar.f4049r = null;
                hVar.f4046o = 2;
                if (r.a(tVar, c0093q, th, hVar) == aVar) {
                    throw th;
                }
            }
            return aVar;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                Throwable th3 = (Throwable) hVar.f4048q;
                H2.h.E(obj);
                throw th3;
            }
            if (i4 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar2 = (m2.l) hVar.f4048q;
            try {
                H2.h.E(obj);
                lVar2.n();
                return O1.g.f1211a;
            } catch (Throwable th4) {
                th = th4;
                lVar2.n();
                throw th;
            }
        }
        eVar = hVar.f4049r;
        iVar = (i) hVar.f4048q;
        try {
            H2.h.E(obj);
            R1.h hVar3 = hVar.f1277l;
            a2.h.b(hVar3);
            lVar = new m2.l(eVar, hVar3);
            try {
                c0093q2 = iVar.f4051l;
                hVar.f4048q = lVar;
                hVar.f4049r = null;
                hVar.f4046o = 3;
                if (c0093q2.d(lVar, null, hVar) != aVar) {
                    lVar2 = lVar;
                    lVar2.n();
                    return O1.g.f1211a;
                }
            } catch (Throwable th5) {
                th = th5;
                lVar2 = lVar;
                lVar2.n();
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            tVar = new t(th);
            c0093q = iVar.f4051l;
            hVar.f4048q = th;
            hVar.f4049r = null;
            hVar.f4046o = 2;
            if (r.a(tVar, c0093q, th, hVar) == aVar) {
                throw th;
            }
        }
        return aVar;
    }
}
