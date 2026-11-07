package l2;

/* loaded from: classes.dex */
public final class c extends m2.e {
    public final x0.i n;

    /* renamed from: o, reason: collision with root package name */
    public final x0.i f4038o;

    public c(x0.i iVar, R1.h hVar, int i3, k2.a aVar) {
        super(hVar, i3, aVar);
        this.n = iVar;
        this.f4038o = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // m2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(k2.q r5, R1.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof l2.b
            if (r0 == 0) goto L13
            r0 = r6
            l2.b r0 = (l2.b) r0
            int r1 = r0.f4037q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4037q = r1
            goto L1a
        L13:
            l2.b r0 = new l2.b
            T1.c r6 = (T1.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.f4035o
            int r1 = r0.f4037q
            O1.g r2 = O1.g.f1211a
            r3 = 1
            if (r1 == 0) goto L33
            if (r1 != r3) goto L2b
            k2.q r5 = r0.n
            H2.h.E(r6)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            H2.h.E(r6)
            r0.n = r5
            r0.f4037q = r3
            x0.i r6 = r4.n
            java.lang.Object r6 = r6.e(r5, r0)
            S1.a r0 = S1.a.f1260k
            if (r6 != r0) goto L45
            goto L46
        L45:
            r6 = r2
        L46:
            if (r6 != r0) goto L49
            return r0
        L49:
            k2.p r5 = (k2.p) r5
            k2.c r5 = r5.n
            boolean r5 = r5.s()
            if (r5 == 0) goto L54
            return r2
        L54:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.c.a(k2.q, R1.c):java.lang.Object");
    }

    @Override // m2.e
    public final String toString() {
        return "block[" + this.n + "] -> " + super.toString();
    }
}
