package l2;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final B1.g f4079a;

    /* renamed from: b, reason: collision with root package name */
    public static final B1.g f4080b;

    static {
        int i3 = 18;
        f4079a = new B1.g("NONE", i3);
        f4080b = new B1.g("PENDING", i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(l2.t r4, V.C0093q r5, java.lang.Throwable r6, T1.c r7) {
        /*
            boolean r0 = r7 instanceof l2.g
            if (r0 == 0) goto L13
            r0 = r7
            l2.g r0 = (l2.g) r0
            int r1 = r0.f4045p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4045p = r1
            goto L18
        L13:
            l2.g r0 = new l2.g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f4044o
            int r1 = r0.f4045p
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.lang.Throwable r6 = r0.n
            H2.h.E(r7)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r4 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            H2.h.E(r7)
            r0.n = r6     // Catch: java.lang.Throwable -> L27
            r0.f4045p = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r5.d(r4, r6, r0)     // Catch: java.lang.Throwable -> L27
            S1.a r5 = S1.a.f1260k
            if (r4 != r5) goto L41
            return r5
        L41:
            O1.g r4 = O1.g.f1211a
            return r4
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            E2.a.b(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.r.a(l2.t, V.q, java.lang.Throwable, T1.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r1.g(r11, r0) == r5) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005e, B:20:0x0072, B:22:0x007a, B:24:0x0080, B:26:0x0086, B:28:0x0097, B:29:0x009f, B:30:0x00a0, B:31:0x00a7, B:39:0x0049, B:42:0x0054), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [k2.r] */
    /* JADX WARN: Type inference failed for: r9v6, types: [k2.r] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0094 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(l2.e r8, k2.p r9, boolean r10, T1.c r11) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.r.b(l2.e, k2.p, boolean, T1.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(l2.d r4, T1.c r5) {
        /*
            boolean r0 = r5 instanceof l2.n
            if (r0 == 0) goto L13
            r0 = r5
            l2.n r0 = (l2.n) r0
            int r1 = r0.f4070q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4070q = r1
            goto L18
        L13:
            l2.n r0 = new l2.n
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f4069p
            int r1 = r0.f4070q
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            V.x r4 = r0.f4068o
            a2.o r0 = r0.n
            H2.h.E(r5)     // Catch: m2.a -> L29
            goto L5a
        L29:
            r5 = move-exception
            goto L56
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            H2.h.E(r5)
            a2.o r5 = new a2.o
            r5.<init>()
            V.x r1 = new V.x
            r3 = 1
            r1.<init>(r5, r3)
            r0.n = r5     // Catch: m2.a -> L52
            r0.f4068o = r1     // Catch: m2.a -> L52
            r0.f4070q = r2     // Catch: m2.a -> L52
            java.lang.Object r4 = r4.h(r1, r0)     // Catch: m2.a -> L52
            S1.a r0 = S1.a.f1260k
            if (r4 != r0) goto L50
            return r0
        L50:
            r0 = r5
            goto L5a
        L52:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r1
        L56:
            java.lang.Object r1 = r5.f4100k
            if (r1 != r4) goto L5d
        L5a:
            java.lang.Object r4 = r0.f1713k
            return r4
        L5d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.r.c(l2.d, T1.c):java.lang.Object");
    }
}
