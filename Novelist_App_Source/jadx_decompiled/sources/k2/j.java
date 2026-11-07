package k2;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final i f3905a = new i();

    public static c a(int i3, a aVar, int i4) {
        int i5 = i4 & 2;
        a aVar2 = a.f3867k;
        if (i5 != 0) {
            aVar = aVar2;
        }
        if (i3 == -2) {
            if (aVar != aVar2) {
                return new m(1, aVar);
            }
            g.f3903h.getClass();
            return new c(f.f3902b);
        }
        if (i3 != -1) {
            return i3 != 0 ? i3 != Integer.MAX_VALUE ? aVar == aVar2 ? new c(i3) : new m(i3, aVar) : new c(Integer.MAX_VALUE) : aVar == aVar2 ? new c(0) : new m(1, aVar);
        }
        if (aVar == aVar2) {
            return new m(1, a.f3868l);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(k2.q r4, X.b r5, T1.c r6) {
        /*
            boolean r0 = r6 instanceof k2.n
            if (r0 == 0) goto L13
            r0 = r6
            k2.n r0 = (k2.n) r0
            int r1 = r0.f3909p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3909p = r1
            goto L18
        L13:
            k2.n r0 = new k2.n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f3908o
            int r1 = r0.f3909p
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            X.b r5 = r0.n
            H2.h.E(r6)     // Catch: java.lang.Throwable -> L27
            goto L64
        L27:
            r4 = move-exception
            goto L6a
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            H2.h.E(r6)
            R1.h r6 = r0.f1277l
            a2.h.b(r6)
            i2.r r1 = i2.r.f3022l
            R1.f r6 = r6.e(r1)
            if (r6 != r4) goto L6e
            r0.n = r5     // Catch: java.lang.Throwable -> L27
            r0.f3909p = r2     // Catch: java.lang.Throwable -> L27
            i2.g r6 = new i2.g     // Catch: java.lang.Throwable -> L27
            R1.c r0 = H2.h.s(r0)     // Catch: java.lang.Throwable -> L27
            r6.<init>(r2, r0)     // Catch: java.lang.Throwable -> L27
            r6.s()     // Catch: java.lang.Throwable -> L27
            k2.o r0 = new k2.o     // Catch: java.lang.Throwable -> L27
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L27
            k2.p r4 = (k2.p) r4     // Catch: java.lang.Throwable -> L27
            r4.U(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r6.r()     // Catch: java.lang.Throwable -> L27
            S1.a r6 = S1.a.f1260k
            if (r4 != r6) goto L64
            return r6
        L64:
            r5.a()
            O1.g r4 = O1.g.f1211a
            return r4
        L6a:
            r5.a()
            throw r4
        L6e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.j.b(k2.q, X.b, T1.c):java.lang.Object");
    }
}
