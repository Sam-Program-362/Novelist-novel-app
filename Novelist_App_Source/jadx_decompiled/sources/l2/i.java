package l2;

import V.C0093q;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ H0.i f4050k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0093q f4051l;

    public i(H0.i iVar, C0093q c0093q) {
        this.f4050k = iVar;
        this.f4051l = c0093q;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // l2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(l2.e r9, R1.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof l2.h
            if (r0 == 0) goto L13
            r0 = r10
            l2.h r0 = (l2.h) r0
            int r1 = r0.f4046o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4046o = r1
            goto L18
        L13:
            l2.h r0 = new l2.h
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.n
            int r1 = r0.f4046o
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            S1.a r6 = S1.a.f1260k
            if (r1 == 0) goto L50
            if (r1 == r4) goto L44
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L34
            java.lang.Object r9 = r0.f4048q
            m2.l r9 = (m2.l) r9
            H2.h.E(r10)     // Catch: java.lang.Throwable -> L32
            goto L7d
        L32:
            r10 = move-exception
            goto L87
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f4048q
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            H2.h.E(r10)
            goto La1
        L44:
            l2.e r9 = r0.f4049r
            java.lang.Object r1 = r0.f4048q
            l2.i r1 = (l2.i) r1
            H2.h.E(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8d
        L50:
            H2.h.E(r10)
            H0.i r10 = r8.f4050k     // Catch: java.lang.Throwable -> L8b
            r0.f4048q = r8     // Catch: java.lang.Throwable -> L8b
            r0.f4049r = r9     // Catch: java.lang.Throwable -> L8b
            r0.f4046o = r4     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r10 = r10.h(r9, r0)     // Catch: java.lang.Throwable -> L8b
            if (r10 != r6) goto L62
            goto La0
        L62:
            r1 = r8
        L63:
            m2.l r10 = new m2.l
            R1.h r3 = r0.f1277l
            a2.h.b(r3)
            r10.<init>(r9, r3)
            V.q r9 = r1.f4051l     // Catch: java.lang.Throwable -> L83
            r0.f4048q = r10     // Catch: java.lang.Throwable -> L83
            r0.f4049r = r5     // Catch: java.lang.Throwable -> L83
            r0.f4046o = r2     // Catch: java.lang.Throwable -> L83
            java.lang.Object r9 = r9.d(r10, r5, r0)     // Catch: java.lang.Throwable -> L83
            if (r9 != r6) goto L7c
            goto La0
        L7c:
            r9 = r10
        L7d:
            r9.n()
            O1.g r9 = O1.g.f1211a
            return r9
        L83:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L87:
            r9.n()
            throw r10
        L8b:
            r9 = move-exception
            r1 = r8
        L8d:
            l2.t r10 = new l2.t
            r10.<init>(r9)
            V.q r1 = r1.f4051l
            r0.f4048q = r9
            r0.f4049r = r5
            r0.f4046o = r3
            java.lang.Object r10 = l2.r.a(r10, r1, r9, r0)
            if (r10 != r6) goto La1
        La0:
            return r6
        La1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.i.h(l2.e, R1.c):java.lang.Object");
    }
}
