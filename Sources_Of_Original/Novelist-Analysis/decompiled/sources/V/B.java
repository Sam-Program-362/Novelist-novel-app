package V;

/* JADX INFO: loaded from: classes.dex */
public final class B extends T1.h implements Z1.l {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Throwable f1293o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1294p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ N f1295q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(N n, R1.c cVar) {
        super(1, cVar);
        this.f1295q = n;
    }

    @Override // Z1.l
    public final Object f(Object obj) {
        return new B(this.f1295q, (R1.c) obj).m(O1.g.f1211a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r6 == r4) goto L21;
     */
    @Override // T1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f1294p
            V.N r1 = r5.f1295q
            r2 = 2
            r3 = 1
            S1.a r4 = S1.a.f1260k
            if (r0 == 0) goto L23
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L14
            java.lang.Throwable r0 = r5.f1293o
            H2.h.E(r6)
            goto L41
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            H2.h.E(r6)     // Catch: java.lang.Throwable -> L20
            goto L2f
        L20:
            r6 = move-exception
            r0 = r6
            goto L32
        L23:
            H2.h.E(r6)
            r5.f1294p = r3     // Catch: java.lang.Throwable -> L20
            java.lang.Object r6 = V.N.f(r1, r3, r5)     // Catch: java.lang.Throwable -> L20
            if (r6 != r4) goto L2f
            goto L40
        L2f:
            V.j0 r6 = (V.j0) r6     // Catch: java.lang.Throwable -> L20
            goto L4d
        L32:
            V.i0 r6 = r1.g()
            r5.f1293o = r0
            r5.f1294p = r2
            java.lang.Integer r6 = r6.a()
            if (r6 != r4) goto L41
        L40:
            return r4
        L41:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            V.b0 r1 = new V.b0
            r1.<init>(r0, r6)
            r6 = r1
        L4d:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            O1.b r1 = new O1.b
            r1.<init>(r6, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: V.B.m(java.lang.Object):java.lang.Object");
    }
}
