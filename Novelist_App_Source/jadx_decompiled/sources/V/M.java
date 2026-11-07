package V;

/* loaded from: classes.dex */
public final class M extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public a2.n f1335o;

    /* renamed from: p, reason: collision with root package name */
    public int f1336p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1337q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a2.n f1338r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ N f1339s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1340t;
    public final /* synthetic */ boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(a2.n nVar, N n, Object obj, boolean z3, R1.c cVar) {
        super(2, cVar);
        this.f1338r = nVar;
        this.f1339s = n;
        this.f1340t = obj;
        this.u = z3;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((M) i((R1.c) obj2, (Y) obj)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        M m3 = new M(this.f1338r, this.f1339s, this.f1340t, this.u, cVar);
        m3.f1337q = obj;
        return m3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r5.b(r1, r7) == r6) goto L16;
     */
    @Override // T1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f1336p
            java.lang.Object r1 = r7.f1340t
            V.N r2 = r7.f1339s
            a2.n r3 = r7.f1338r
            r4 = 2
            r5 = 1
            S1.a r6 = S1.a.f1260k
            if (r0 == 0) goto L28
            if (r0 == r5) goto L1e
            if (r0 != r4) goto L16
            H2.h.E(r8)
            goto L65
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            a2.n r0 = r7.f1335o
            java.lang.Object r5 = r7.f1337q
            V.Y r5 = (V.Y) r5
            H2.h.E(r8)
            goto L4f
        L28:
            H2.h.E(r8)
            java.lang.Object r8 = r7.f1337q
            V.Y r8 = (V.Y) r8
            V.i0 r0 = r2.g()
            r7.f1337q = r8
            r7.f1335o = r3
            r7.f1336p = r5
            B1.g r0 = r0.f1426b
            java.lang.Object r0 = r0.f90l
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            int r0 = r0.incrementAndGet()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r0)
            if (r5 != r6) goto L4b
            goto L64
        L4b:
            r0 = r5
            r5 = r8
            r8 = r0
            r0 = r3
        L4f:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r0.f1712k = r8
            r8 = 0
            r7.f1337q = r8
            r7.f1335o = r8
            r7.f1336p = r4
            java.lang.Object r8 = r5.b(r1, r7)
            if (r8 != r6) goto L65
        L64:
            return r6
        L65:
            boolean r8 = r7.u
            if (r8 == 0) goto L7d
            B1.a r8 = r2.f1347r
            V.c r0 = new V.c
            if (r1 == 0) goto L74
            int r2 = r1.hashCode()
            goto L75
        L74:
            r2 = 0
        L75:
            int r3 = r3.f1712k
            r0.<init>(r1, r2, r3)
            r8.m(r0)
        L7d:
            O1.g r8 = O1.g.f1211a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: V.M.m(java.lang.Object):java.lang.Object");
    }
}
