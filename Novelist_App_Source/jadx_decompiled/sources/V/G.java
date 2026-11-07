package V;

import i2.InterfaceC0301s;

/* loaded from: classes.dex */
public final class G extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public int f1319o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ N f1320p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(N n, R1.c cVar) {
        super(2, cVar);
        this.f1320p = n;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((G) i((R1.c) obj2, (InterfaceC0301s) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        return new G(this.f1320p, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r7 == r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        if (r0.h(r6) == r5) goto L22;
     */
    @Override // T1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.Object r7) {
        /*
            r6 = this;
            V.N r0 = r6.f1320p
            B1.a r1 = r0.f1347r
            int r2 = r6.f1319o
            r3 = 2
            r4 = 1
            S1.a r5 = S1.a.f1260k
            if (r2 == 0) goto L22
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            H2.h.E(r7)
            goto L45
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            H2.h.E(r7)     // Catch: java.lang.Throwable -> L20
            goto L3b
        L20:
            r7 = move-exception
            goto L48
        L22:
            H2.h.E(r7)
            V.j0 r7 = r1.g()
            boolean r7 = r7 instanceof V.Z
            if (r7 == 0) goto L32
            V.j0 r7 = r1.g()
            return r7
        L32:
            r6.f1319o = r4     // Catch: java.lang.Throwable -> L20
            java.lang.Object r7 = r0.h(r6)     // Catch: java.lang.Throwable -> L20
            if (r7 != r5) goto L3b
            goto L44
        L3b:
            r6.f1319o = r3
            r7 = 0
            java.lang.Object r7 = V.N.e(r0, r7, r6)
            if (r7 != r5) goto L45
        L44:
            return r5
        L45:
            V.j0 r7 = (V.j0) r7
            return r7
        L48:
            V.b0 r0 = new V.b0
            r1 = -1
            r0.<init>(r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V.G.m(java.lang.Object):java.lang.Object");
    }
}
