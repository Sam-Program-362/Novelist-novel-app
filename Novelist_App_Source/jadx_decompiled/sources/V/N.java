package V;

import i2.AbstractC0303u;
import i2.C0292i;
import i2.C0296m;
import i2.InterfaceC0301s;
import java.util.List;

/* loaded from: classes.dex */
public final class N implements InterfaceC0084h {

    /* renamed from: k, reason: collision with root package name */
    public final T f1341k;

    /* renamed from: l, reason: collision with root package name */
    public final M1.A f1342l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC0301s f1343m;

    /* renamed from: p, reason: collision with root package name */
    public int f1345p;

    /* renamed from: q, reason: collision with root package name */
    public i2.b0 f1346q;

    /* renamed from: s, reason: collision with root package name */
    public final B1.s f1348s;

    /* renamed from: t, reason: collision with root package name */
    public final O1.e f1349t;
    public final O1.e u;

    /* renamed from: v, reason: collision with root package name */
    public final B1.s f1350v;
    public final B1.a n = new B1.a(new C0094s(this, null));

    /* renamed from: o, reason: collision with root package name */
    public final q2.c f1344o = new q2.c();

    /* renamed from: r, reason: collision with root package name */
    public final B1.a f1347r = new B1.a(12);

    public N(T t3, List list, M1.A a3, InterfaceC0301s interfaceC0301s) {
        this.f1341k = t3;
        this.f1342l = a3;
        this.f1343m = interfaceC0301s;
        B1.s sVar = new B1.s();
        sVar.n = this;
        sVar.f144k = new q2.c();
        C0296m c0296m = new C0296m(true);
        c0296m.C(null);
        sVar.f145l = c0296m;
        sVar.f146m = P1.e.l0(list);
        this.f1348s = sVar;
        this.f1349t = new O1.e(new C0089m(this, 1));
        this.u = new O1.e(new C0089m(this, 0));
        J j3 = new J(this);
        K k3 = new K(this, null);
        B1.s sVar2 = new B1.s();
        sVar2.f144k = interfaceC0301s;
        sVar2.f145l = k3;
        sVar2.f146m = k2.j.a(Integer.MAX_VALUE, null, 6);
        sVar2.n = new B1.g(7);
        i2.N n = (i2.N) interfaceC0301s.d().e(i2.r.f3022l);
        if (n != null) {
            ((i2.W) n).D(true, new C0292i(new d0(j3, sVar2), 1));
        }
        this.f1350v = sVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:12:0x0048, B:14:0x0050, B:16:0x0054, B:17:0x005a), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(V.N r4, T1.c r5) {
        /*
            boolean r0 = r5 instanceof V.C0095t
            if (r0 == 0) goto L13
            r0 = r5
            V.t r0 = (V.C0095t) r0
            int r1 = r0.f1471r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1471r = r1
            goto L18
        L13:
            V.t r0 = new V.t
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f1469p
            int r1 = r0.f1471r
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            q2.c r4 = r0.f1468o
            V.N r0 = r0.n
            H2.h.E(r5)
            r5 = r4
            r4 = r0
            goto L47
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            H2.h.E(r5)
            q2.c r5 = r4.f1344o
            r0.n = r4
            r0.f1468o = r5
            r0.f1471r = r2
            java.lang.Object r0 = r5.c(r0)
            S1.a r1 = S1.a.f1260k
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            int r1 = r4.f1345p     // Catch: java.lang.Throwable -> L58
            int r1 = r1 + (-1)
            r4.f1345p = r1     // Catch: java.lang.Throwable -> L58
            if (r1 != 0) goto L5c
            i2.b0 r1 = r4.f1346q     // Catch: java.lang.Throwable -> L58
            if (r1 == 0) goto L5a
            r1.b(r0)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r4 = move-exception
            goto L62
        L5a:
            r4.f1346q = r0     // Catch: java.lang.Throwable -> L58
        L5c:
            r5.e(r0)
            O1.g r4 = O1.g.f1211a
            return r4
        L62:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: V.N.a(V.N, T1.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|(7:55|(1:(1:(1:59)(2:61|62))(3:63|64|65))(1:66)|60|17|(1:19)(1:23)|20|21)(5:8|9|10|(3:12|13|14)(3:30|(1:32)(1:53)|(2:34|(2:36|(1:38))(2:45|46))(2:47|(2:49|50)(2:51|52)))|24)|39|40|41))|68|6|(0)(0)|39|40|41|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        if (r9 == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
    
        if (r9 != r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0024 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
    /* JADX WARN: Type inference failed for: r1v3, types: [T1.h, Z1.p] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T1.h, Z1.p] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(V.N r9, V.a0 r10, T1.c r11) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V.N.b(V.N, V.a0, T1.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #0 {all -> 0x005d, blocks: (B:12:0x0048, B:14:0x004f), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(V.N r4, T1.c r5) {
        /*
            boolean r0 = r5 instanceof V.C0098w
            if (r0 == 0) goto L13
            r0 = r5
            V.w r0 = (V.C0098w) r0
            int r1 = r0.f1482r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1482r = r1
            goto L18
        L13:
            V.w r0 = new V.w
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f1480p
            int r1 = r0.f1482r
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            q2.c r4 = r0.f1479o
            V.N r0 = r0.n
            H2.h.E(r5)
            r5 = r4
            r4 = r0
            goto L47
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            H2.h.E(r5)
            q2.c r5 = r4.f1344o
            r0.n = r4
            r0.f1479o = r5
            r0.f1482r = r2
            java.lang.Object r0 = r5.c(r0)
            S1.a r1 = S1.a.f1260k
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            int r1 = r4.f1345p     // Catch: java.lang.Throwable -> L5d
            int r1 = r1 + r2
            r4.f1345p = r1     // Catch: java.lang.Throwable -> L5d
            if (r1 != r2) goto L5f
            i2.s r1 = r4.f1343m     // Catch: java.lang.Throwable -> L5d
            V.y r2 = new V.y     // Catch: java.lang.Throwable -> L5d
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L5d
            i2.b0 r1 = i2.AbstractC0303u.g(r1, r2)     // Catch: java.lang.Throwable -> L5d
            r4.f1346q = r1     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r4 = move-exception
            goto L65
        L5f:
            r5.e(r0)
            O1.g r4 = O1.g.f1211a
            return r4
        L65:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: V.N.c(V.N, T1.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(V.N r8, boolean r9, R1.c r10) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V.N.e(V.N, boolean, R1.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x013e, code lost:
    
        if (r11 != r4) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6 A[Catch: b -> 0x00a7, TryCatch #1 {b -> 0x00a7, blocks: (B:36:0x00a2, B:37:0x0141, B:40:0x00b0, B:41:0x0124, B:54:0x00cd, B:56:0x00e6, B:57:0x00ea, B:62:0x00d6, B:65:0x0112), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(V.N r9, boolean r10, T1.c r11) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V.N.f(V.N, boolean, T1.c):java.lang.Object");
    }

    @Override // V.InterfaceC0084h
    public final Object d(Z1.p pVar, T1.h hVar) {
        R1.h hVar2 = hVar.f1277l;
        a2.h.b(hVar2);
        n0 n0Var = (n0) hVar2.e(m0.f1451k);
        if (n0Var != null) {
            n0Var.c(this);
        }
        return AbstractC0303u.n(new n0(n0Var, this), new I(this, pVar, null), hVar);
    }

    public final i0 g() {
        return (i0) this.u.a();
    }

    @Override // V.InterfaceC0084h
    public final l2.d getData() {
        return this.n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r3.w(r0) != r4) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(T1.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof V.C0101z
            if (r0 == 0) goto L13
            r0 = r7
            V.z r0 = (V.C0101z) r0
            int r1 = r0.f1490r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1490r = r1
            goto L18
        L13:
            V.z r0 = new V.z
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f1488p
            int r1 = r0.f1490r
            r2 = 2
            r3 = 1
            S1.a r4 = S1.a.f1260k
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            int r1 = r0.f1487o
            V.N r0 = r0.n
            H2.h.E(r7)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r7 = move-exception
            goto L6e
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            V.N r1 = r0.n
            H2.h.E(r7)
            goto L51
        L3e:
            H2.h.E(r7)
            V.i0 r7 = r6.g()
            r0.n = r6
            r0.f1490r = r3
            java.lang.Integer r7 = r7.a()
            if (r7 != r4) goto L50
            goto L65
        L50:
            r1 = r6
        L51:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            B1.s r3 = r1.f1348s     // Catch: java.lang.Throwable -> L69
            r0.n = r1     // Catch: java.lang.Throwable -> L69
            r0.f1487o = r7     // Catch: java.lang.Throwable -> L69
            r0.f1490r = r2     // Catch: java.lang.Throwable -> L69
            java.lang.Object r7 = r3.w(r0)     // Catch: java.lang.Throwable -> L69
            if (r7 != r4) goto L66
        L65:
            return r4
        L66:
            O1.g r7 = O1.g.f1211a
            return r7
        L69:
            r0 = move-exception
            r5 = r1
            r1 = r7
            r7 = r0
            r0 = r5
        L6e:
            B1.a r0 = r0.f1347r
            V.b0 r2 = new V.b0
            r2.<init>(r7, r1)
            r0.m(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: V.N.h(T1.c):java.lang.Object");
    }

    public final Object i(T1.c cVar) {
        return ((W) this.f1349t.a()).a(new C0093q(3, (R1.c) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.Object r10, boolean r11, T1.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof V.L
            if (r0 == 0) goto L13
            r0 = r12
            V.L r0 = (V.L) r0
            int r1 = r0.f1334q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1334q = r1
            goto L18
        L13:
            V.L r0 = new V.L
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f1332o
            int r1 = r0.f1334q
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            a2.n r10 = r0.n
            H2.h.E(r12)
            goto L56
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            H2.h.E(r12)
            a2.n r4 = new a2.n
            r4.<init>()
            O1.e r12 = r9.f1349t
            java.lang.Object r12 = r12.a()
            V.W r12 = (V.W) r12
            V.M r3 = new V.M
            r8 = 0
            r5 = r9
            r6 = r10
            r7 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r0.n = r4
            r0.f1334q = r2
            java.lang.Object r10 = r12.b(r3, r0)
            S1.a r11 = S1.a.f1260k
            if (r10 != r11) goto L55
            return r11
        L55:
            r10 = r4
        L56:
            int r10 = r10.f1712k
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: V.N.j(java.lang.Object, boolean, T1.c):java.lang.Object");
    }
}
