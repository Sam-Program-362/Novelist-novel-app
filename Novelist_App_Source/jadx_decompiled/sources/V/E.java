package V;

/* loaded from: classes.dex */
public final class E extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public Object f1308o;

    /* renamed from: p, reason: collision with root package name */
    public int f1309p;

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ boolean f1310q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ N f1311r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1312s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(N n, int i3, R1.c cVar) {
        super(2, cVar);
        this.f1311r = n;
        this.f1312s = i3;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((E) i((R1.c) obj2, bool)).m(O1.g.f1211a);
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        E e3 = new E(this.f1311r, this.f1312s, cVar);
        e3.f1310q = ((Boolean) obj).booleanValue();
        return e3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        if (r7 == r4) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    @Override // T1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f1309p
            V.N r1 = r6.f1311r
            r2 = 2
            r3 = 1
            S1.a r4 = S1.a.f1260k
            if (r0 == 0) goto L22
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L14
            java.lang.Object r0 = r6.f1308o
            H2.h.E(r7)
            goto L46
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            boolean r0 = r6.f1310q
            H2.h.E(r7)
            goto L32
        L22:
            H2.h.E(r7)
            boolean r0 = r6.f1310q
            r6.f1310q = r0
            r6.f1309p = r3
            java.lang.Object r7 = r1.i(r6)
            if (r7 != r4) goto L32
            goto L42
        L32:
            if (r0 == 0) goto L4d
            V.i0 r0 = r1.g()
            r6.f1308o = r7
            r6.f1309p = r2
            java.lang.Integer r0 = r0.a()
            if (r0 != r4) goto L43
        L42:
            return r4
        L43:
            r5 = r0
            r0 = r7
            r7 = r5
        L46:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            goto L52
        L4d:
            int r0 = r6.f1312s
            r5 = r0
            r0 = r7
            r7 = r5
        L52:
            V.c r1 = new V.c
            if (r0 == 0) goto L5b
            int r2 = r0.hashCode()
            goto L5c
        L5b:
            r2 = 0
        L5c:
            r1.<init>(r0, r2, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: V.E.m(java.lang.Object):java.lang.Object");
    }
}
