package V;

import i2.AbstractC0212u;
import i2.C0201i;
import i2.C0205m;
import i2.InterfaceC0210s;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class N implements InterfaceC0084h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final T f1341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final M1.A f1342l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC0210s f1343m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1345p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i2.b0 f1346q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final B1.s f1348s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final O1.e f1349t;
    public final O1.e u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final B1.s f1350v;
    public final B1.a n = new B1.a(new C0094s(this, null));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final q2.c f1344o = new q2.c();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final B1.a f1347r = new B1.a(12);

    public N(T t3, List list, M1.A a3, InterfaceC0210s interfaceC0210s) {
        this.f1341k = t3;
        this.f1342l = a3;
        this.f1343m = interfaceC0210s;
        B1.s sVar = new B1.s();
        sVar.n = this;
        sVar.f144k = new q2.c();
        C0205m c0205m = new C0205m(true);
        c0205m.C(null);
        sVar.f145l = c0205m;
        sVar.f146m = P1.e.l0(list);
        this.f1348s = sVar;
        this.f1349t = new O1.e(new C0089m(this, 1));
        this.u = new O1.e(new C0089m(this, 0));
        J j3 = new J(this);
        K k3 = new K(this, null);
        B1.s sVar2 = new B1.s();
        sVar2.f144k = interfaceC0210s;
        sVar2.f145l = k3;
        sVar2.f146m = k2.j.a(Integer.MAX_VALUE, null, 6);
        sVar2.n = new B1.g(7);
        i2.N n = (i2.N) interfaceC0210s.d().e(i2.r.f3022l);
        if (n != null) {
            ((i2.W) n).D(true, new C0201i(new d0(j3, sVar2), 1));
        }
        this.f1350v = sVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(N n, T1.c cVar) {
        C0095t c0095t;
        q2.c cVar2;
        if (cVar instanceof C0095t) {
            c0095t = (C0095t) cVar;
            int i3 = c0095t.f1471r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0095t.f1471r = i3 - Integer.MIN_VALUE;
            } else {
                c0095t = new C0095t(n, cVar);
            }
        } else {
            c0095t = new C0095t(n, cVar);
        }
        Object obj = c0095t.f1469p;
        int i4 = c0095t.f1471r;
        if (i4 == 0) {
            H2.h.E(obj);
            cVar2 = n.f1344o;
            c0095t.n = n;
            c0095t.f1468o = cVar2;
            c0095t.f1471r = 1;
            Object objC = cVar2.c(c0095t);
            S1.a aVar = S1.a.f1260k;
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q2.c cVar3 = c0095t.f1468o;
            N n3 = c0095t.n;
            H2.h.E(obj);
            cVar2 = cVar3;
            n = n3;
        }
        try {
            int i5 = n.f1345p - 1;
            n.f1345p = i5;
            if (i5 == 0) {
                i2.b0 b0Var = n.f1346q;
                if (b0Var != null) {
                    b0Var.b(null);
                }
                n.f1346q = null;
            }
            return O1.g.f1211a;
        } finally {
            cVar2.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (r9 == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ba, code lost:
    
        if (r9 == r6) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T1.h, Z1.p] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T1.h, Z1.p] */
    /* JADX WARN: Type inference failed for: r9v0, types: [V.N] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v9, types: [V.N] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(V.N r9, V.a0 r10, T1.c r11) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V.N.b(V.N, V.a0, T1.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(N n, T1.c cVar) throws Throwable {
        C0098w c0098w;
        q2.c cVar2;
        if (cVar instanceof C0098w) {
            c0098w = (C0098w) cVar;
            int i3 = c0098w.f1482r;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0098w.f1482r = i3 - Integer.MIN_VALUE;
            } else {
                c0098w = new C0098w(n, cVar);
            }
        } else {
            c0098w = new C0098w(n, cVar);
        }
        Object obj = c0098w.f1480p;
        int i4 = c0098w.f1482r;
        if (i4 == 0) {
            H2.h.E(obj);
            cVar2 = n.f1344o;
            c0098w.n = n;
            c0098w.f1479o = cVar2;
            c0098w.f1482r = 1;
            Object objC = cVar2.c(c0098w);
            S1.a aVar = S1.a.f1260k;
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q2.c cVar3 = c0098w.f1479o;
            N n3 = c0098w.n;
            H2.h.E(obj);
            cVar2 = cVar3;
            n = n3;
        }
        try {
            int i5 = n.f1345p + 1;
            n.f1345p = i5;
            if (i5 == 1) {
                n.f1346q = AbstractC0212u.g(n.f1343m, new C0100y(n, null));
            }
            return O1.g.f1211a;
        } finally {
            cVar2.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(N n, boolean z3, R1.c cVar) throws Throwable {
        A a3;
        N n3;
        j0 j0Var;
        N n4;
        O1.b bVar;
        j0 j0Var2;
        if (cVar instanceof A) {
            a3 = (A) cVar;
            int i3 = a3.f1292s;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                a3.f1292s = i3 - Integer.MIN_VALUE;
            } else {
                a3 = new A(n, cVar);
            }
        } else {
            a3 = new A(n, cVar);
        }
        Object objC = a3.f1290q;
        int i4 = a3.f1292s;
        S1.a aVar = S1.a.f1260k;
        if (i4 == 0) {
            H2.h.E(objC);
            j0 j0VarG = n.f1347r.g();
            if (j0VarG instanceof k0) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            i0 i0VarG = n.g();
            a3.n = n;
            a3.f1288o = j0VarG;
            a3.f1289p = z3;
            a3.f1292s = 1;
            Integer numA = i0VarG.a();
            if (numA != aVar) {
                n3 = n;
                j0Var = j0VarG;
                objC = numA;
            }
            return aVar;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                n4 = a3.n;
                H2.h.E(objC);
                bVar = (O1.b) objC;
                j0Var2 = (j0) bVar.f1203k;
                if (((Boolean) bVar.f1204l).booleanValue()) {
                    n4.f1347r.m(j0Var2);
                }
                return j0Var2;
            }
            if (i4 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n4 = a3.n;
            H2.h.E(objC);
            bVar = (O1.b) objC;
            j0Var2 = (j0) bVar.f1203k;
            if (((Boolean) bVar.f1204l).booleanValue()) {
                n4.f1347r.m(j0Var2);
            }
            return j0Var2;
        }
        z3 = a3.f1289p;
        j0Var = a3.f1288o;
        n3 = a3.n;
        H2.h.E(objC);
        int iIntValue = ((Number) objC).intValue();
        boolean z4 = j0Var instanceof C0079c;
        int i5 = z4 ? j0Var.f1434a : -1;
        if (z4 && iIntValue == i5) {
            return j0Var;
        }
        if (z3) {
            i0 i0VarG2 = n3.g();
            B b3 = new B(n3, null);
            a3.n = n3;
            a3.f1288o = null;
            a3.f1292s = 2;
            objC = i0VarG2.b(b3, a3);
            if (objC != aVar) {
                n4 = n3;
                bVar = (O1.b) objC;
                j0Var2 = (j0) bVar.f1203k;
                if (((Boolean) bVar.f1204l).booleanValue()) {
                    n4.f1347r.m(j0Var2);
                }
                return j0Var2;
            }
        } else {
            i0 i0VarG3 = n3.g();
            C c3 = new C(n3, i5, null);
            a3.n = n3;
            a3.f1288o = null;
            a3.f1292s = 3;
            objC = i0VarG3.c(c3, a3);
            if (objC != aVar) {
                n4 = n3;
                bVar = (O1.b) objC;
                j0Var2 = (j0) bVar.f1203k;
                if (((Boolean) bVar.f1204l).booleanValue()) {
                    n4.f1347r.m(j0Var2);
                }
                return j0Var2;
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e6 A[Catch: b -> 0x00a7, TryCatch #1 {b -> 0x00a7, blocks: (B:36:0x00a2, B:70:0x0141, B:41:0x00b0, B:67:0x0124, B:49:0x00cd, B:57:0x00e6, B:58:0x00ea, B:53:0x00d6, B:64:0x0112), top: B:75:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0100  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013e, code lost:
    
        if (r11 == r4) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(V.N r9, boolean r10, T1.c r11) {
        /*
            Method dump skipped, instruction units count: 364
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
        return AbstractC0212u.n(new n0(n0Var, this), new I(this, pVar, null), hVar);
    }

    public final i0 g() {
        return (i0) this.u.a();
    }

    @Override // V.InterfaceC0084h
    public final l2.d getData() {
        return this.n;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r3.w(r0) == r4) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(T1.c r7) throws java.lang.Throwable {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(Object obj, boolean z3, T1.c cVar) throws Throwable {
        L l3;
        a2.n nVar;
        if (cVar instanceof L) {
            l3 = (L) cVar;
            int i3 = l3.f1334q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l3.f1334q = i3 - Integer.MIN_VALUE;
            } else {
                l3 = new L(this, cVar);
            }
        } else {
            l3 = new L(this, cVar);
        }
        Object obj2 = l3.f1332o;
        int i4 = l3.f1334q;
        if (i4 == 0) {
            H2.h.E(obj2);
            a2.n nVar2 = new a2.n();
            W w3 = (W) this.f1349t.a();
            M m3 = new M(nVar2, this, obj, z3, null);
            l3.n = nVar2;
            l3.f1334q = 1;
            Object objB = w3.b(m3, l3);
            S1.a aVar = S1.a.f1260k;
            if (objB == aVar) {
                return aVar;
            }
            nVar = nVar2;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = l3.n;
            H2.h.E(obj2);
        }
        return new Integer(nVar.f1712k);
    }
}
