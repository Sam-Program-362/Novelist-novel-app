package k2;

import V.InterfaceC0084h;
import g1.C0254a;
import i2.C0290g;
import i2.InterfaceC0288e;
import i2.i0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class c implements g {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3873l = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3874m = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3875o = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3876p = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3877q = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3878r = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3879s = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3880t = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: k, reason: collision with root package name */
    public final int f3881k;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public c(int i3) {
        this.f3881k = i3;
        if (i3 < 0) {
            throw new IllegalArgumentException(B1.e.h("Invalid channel capacity: ", i3, ", should be >=0").toString());
        }
        k kVar = e.f3883a;
        this.bufferEnd$volatile = i3 != 0 ? i3 != Integer.MAX_VALUE ? i3 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = n.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment$volatile = kVar2;
        this.receiveSegment$volatile = kVar2;
        if (u()) {
            kVar2 = e.f3883a;
            a2.h.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = kVar2;
        this._closeCause$volatile = e.f3900s;
    }

    public static final k a(c cVar, long j3, k kVar) {
        Object b3;
        c cVar2;
        k kVar2 = e.f3883a;
        d dVar = d.f3882s;
        loop0: while (true) {
            b3 = n2.a.b(kVar, j3, dVar);
            if (!n2.a.e(b3)) {
                n2.r c3 = n2.a.c(b3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3876p;
                    n2.r rVar = (n2.r) atomicReferenceFieldUpdater.get(cVar);
                    if (rVar.f4176c >= c3.f4176c) {
                        break loop0;
                    }
                    if (!c3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, rVar, c3)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != rVar) {
                            if (c3.e()) {
                                c3.d();
                            }
                        }
                    }
                    if (rVar.e()) {
                        rVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean e3 = n2.a.e(b3);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3874m;
        if (e3) {
            cVar.s();
            if (kVar.f4176c * e.f3884b < atomicLongFieldUpdater.get(cVar)) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) n2.a.c(b3);
            long j4 = kVar3.f4176c;
            if (j4 <= j3) {
                return kVar3;
            }
            long j5 = e.f3884b * j4;
            while (true) {
                long j6 = f3873l.get(cVar);
                long j7 = 1152921504606846975L & j6;
                if (j7 >= j5) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (f3873l.compareAndSet(cVar2, j6, (((int) (j6 >> 60)) << 60) + j7)) {
                    break;
                }
                cVar = cVar2;
            }
            if (j4 * e.f3884b < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.a();
            }
        }
        return null;
    }

    public static final void c(c cVar, Object obj, C0290g c0290g) {
        c0290g.resumeWith(H2.h.i(cVar.o()));
    }

    public static final int d(c cVar, k kVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        kVar.m(i3, obj);
        if (z3) {
            return cVar.B(kVar, i3, obj, j3, obj2, z3);
        }
        Object k3 = kVar.k(i3);
        if (k3 == null) {
            if (cVar.e(j3)) {
                if (kVar.j(null, e.f3886d, i3)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (kVar.j(null, obj2, i3)) {
                    return 2;
                }
            }
        } else if (k3 instanceof i0) {
            kVar.m(i3, null);
            if (cVar.y(k3, obj)) {
                kVar.n(i3, e.f3891i);
                return 0;
            }
            B1.g gVar = e.f3893k;
            if (kVar.f3907f.getAndSet((i3 * 2) + 1, gVar) == gVar) {
                return 5;
            }
            kVar.l(i3, true);
            return 5;
        }
        return cVar.B(kVar, i3, obj, j3, obj2, z3);
    }

    public static void q(c cVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3875o;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean z(Object obj) {
        if (!(obj instanceof InterfaceC0288e)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        a2.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC0288e interfaceC0288e = (InterfaceC0288e) obj;
        k kVar = e.f3883a;
        B1.g k3 = interfaceC0288e.k(O1.g.f1211a, null);
        if (k3 == null) {
            return false;
        }
        interfaceC0288e.l(k3);
        return true;
    }

    public final Object A(k kVar, int i3, long j3, Object obj) {
        AtomicReferenceArray atomicReferenceArray = kVar.f3907f;
        Object k3 = kVar.k(i3);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3873l;
        if (k3 == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.n;
                }
                if (kVar.j(k3, obj, i3)) {
                    k();
                    return e.f3895m;
                }
            }
        } else if (k3 == e.f3886d && kVar.j(k3, e.f3891i, i3)) {
            k();
            Object obj2 = atomicReferenceArray.get(i3 * 2);
            kVar.m(i3, null);
            return obj2;
        }
        while (true) {
            Object k4 = kVar.k(i3);
            if (k4 == null || k4 == e.f3887e) {
                if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(k4, e.f3890h, i3)) {
                        k();
                        return e.f3896o;
                    }
                } else {
                    if (obj == null) {
                        return e.n;
                    }
                    if (kVar.j(k4, obj, i3)) {
                        k();
                        return e.f3895m;
                    }
                }
            } else if (k4 != e.f3886d) {
                B1.g gVar = e.f3892j;
                if (k4 == gVar) {
                    return e.f3896o;
                }
                if (k4 == e.f3890h) {
                    return e.f3896o;
                }
                if (k4 == e.f3894l) {
                    k();
                    return e.f3896o;
                }
                if (k4 != e.f3889g && kVar.j(k4, e.f3888f, i3)) {
                    boolean z3 = k4 instanceof t;
                    if (z3) {
                        k4 = ((t) k4).f3911a;
                    }
                    if (z(k4)) {
                        kVar.n(i3, e.f3891i);
                        k();
                        Object obj3 = atomicReferenceArray.get(i3 * 2);
                        kVar.m(i3, null);
                        return obj3;
                    }
                    kVar.n(i3, gVar);
                    kVar.h();
                    if (z3) {
                        k();
                    }
                    return e.f3896o;
                }
            } else if (kVar.j(k4, e.f3891i, i3)) {
                k();
                Object obj4 = atomicReferenceArray.get(i3 * 2);
                kVar.m(i3, null);
                return obj4;
            }
        }
    }

    public final int B(k kVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        while (true) {
            Object k3 = kVar.k(i3);
            if (k3 == null) {
                if (!e(j3) || z3) {
                    if (z3) {
                        if (kVar.j(null, e.f3892j, i3)) {
                            kVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.j(null, obj2, i3)) {
                            return 2;
                        }
                    }
                } else if (kVar.j(null, e.f3886d, i3)) {
                    break;
                }
            } else {
                if (k3 != e.f3887e) {
                    B1.g gVar = e.f3893k;
                    if (k3 == gVar) {
                        kVar.m(i3, null);
                        return 5;
                    }
                    if (k3 == e.f3890h) {
                        kVar.m(i3, null);
                        return 5;
                    }
                    if (k3 == e.f3894l) {
                        kVar.m(i3, null);
                        s();
                        return 4;
                    }
                    kVar.m(i3, null);
                    if (k3 instanceof t) {
                        k3 = ((t) k3).f3911a;
                    }
                    if (y(k3, obj)) {
                        kVar.n(i3, e.f3891i);
                        return 0;
                    }
                    if (kVar.f3907f.getAndSet((i3 * 2) + 1, gVar) != gVar) {
                        kVar.l(i3, true);
                    }
                    return 5;
                }
                if (kVar.j(k3, e.f3886d, i3)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void C(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        c cVar = this;
        if (cVar.u()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = n;
            if (atomicLongFieldUpdater.get(cVar) > j3) {
                break;
            } else {
                cVar = this;
            }
        }
        int i3 = e.f3885c;
        int i4 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3875o;
            if (i4 < i3) {
                long j4 = atomicLongFieldUpdater.get(cVar);
                if (j4 == (4611686018427387903L & atomicLongFieldUpdater2.get(cVar)) && j4 == atomicLongFieldUpdater.get(cVar)) {
                    return;
                } else {
                    i4++;
                }
            } else {
                while (true) {
                    long j5 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j5, (j5 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        cVar = this;
                    }
                }
                while (true) {
                    long j6 = atomicLongFieldUpdater.get(cVar);
                    long j7 = atomicLongFieldUpdater2.get(cVar);
                    long j8 = j7 & 4611686018427387903L;
                    boolean z3 = (j7 & 4611686018427387904L) != 0;
                    if (j6 == j8 && j6 == atomicLongFieldUpdater.get(cVar)) {
                        break;
                    }
                    if (z3) {
                        cVar = this;
                    } else {
                        cVar = this;
                        atomicLongFieldUpdater2.compareAndSet(cVar, j7, 4611686018427387904L + j8);
                    }
                }
                while (true) {
                    long j9 = atomicLongFieldUpdater2.get(cVar);
                    if (atomicLongFieldUpdater2.compareAndSet(cVar, j9, j9 & 4611686018427387903L)) {
                        return;
                    } else {
                        cVar = this;
                    }
                }
            }
        }
    }

    @Override // k2.r
    public final void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(cancellationException, true);
    }

    public final boolean e(long j3) {
        return j3 < n.get(this) || j3 < f3874m.get(this) + ((long) this.f3881k);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(java.lang.Throwable r13, boolean r14) {
        /*
            r12 = this;
            r0 = 60
            r1 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = k2.c.f3873l
            r9 = 1
            if (r14 == 0) goto L24
        Lc:
            long r5 = r3.get(r12)
            long r7 = r5 >> r0
            int r4 = (int) r7
            if (r4 != 0) goto L24
            long r7 = r5 & r1
            k2.k r4 = k2.e.f3883a
            long r10 = (long) r9
            long r10 = r10 << r0
            long r7 = r7 + r10
            r4 = r12
            boolean r5 = r3.compareAndSet(r4, r5, r7)
            if (r5 == 0) goto Lc
            goto L25
        L24:
            r4 = r12
        L25:
            B1.g r5 = k2.e.f3900s
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = k2.c.f3879s
            boolean r7 = r6.compareAndSet(r12, r5, r13)
            if (r7 == 0) goto L31
            r10 = r9
            goto L39
        L31:
            java.lang.Object r6 = r6.get(r12)
            if (r6 == r5) goto L27
            r13 = 0
            r10 = r13
        L39:
            r11 = 3
            if (r14 == 0) goto L4c
        L3c:
            long r5 = r3.get(r12)
            long r13 = r5 & r1
            long r7 = (long) r11
            long r7 = r7 << r0
            long r7 = r7 + r13
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L3c
            goto L69
        L4c:
            long r5 = r3.get(r12)
            long r13 = r5 >> r0
            int r13 = (int) r13
            if (r13 == 0) goto L5e
            if (r13 == r9) goto L58
            goto L69
        L58:
            long r13 = r5 & r1
            long r7 = (long) r11
        L5b:
            long r7 = r7 << r0
            long r7 = r7 + r13
            goto L63
        L5e:
            long r13 = r5 & r1
            r7 = 2
            long r7 = (long) r7
            goto L5b
        L63:
            boolean r13 = r3.compareAndSet(r4, r5, r7)
            if (r13 == 0) goto L4c
        L69:
            r12.s()
            if (r10 == 0) goto L98
        L6e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = k2.c.f3880t
            java.lang.Object r14 = r13.get(r12)
            if (r14 != 0) goto L79
            B1.g r0 = k2.e.f3898q
            goto L7b
        L79:
            B1.g r0 = k2.e.f3899r
        L7b:
            boolean r1 = r13.compareAndSet(r12, r14, r0)
            if (r1 == 0) goto L91
            if (r14 != 0) goto L84
            goto L98
        L84:
            a2.r.a(r9, r14)
            Z1.l r14 = (Z1.l) r14
            java.lang.Throwable r13 = r12.m()
            r14.f(r13)
            return r10
        L91:
            java.lang.Object r1 = r13.get(r12)
            if (r1 == r14) goto L7b
            goto L6e
        L98:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.c.f(java.lang.Throwable, boolean):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0177, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c2, code lost:
    
        c(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163 A[RETURN] */
    @Override // k2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(R1.c r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.c.g(R1.c, java.lang.Object):java.lang.Object");
    }

    @Override // k2.s
    public Object h(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3873l;
        boolean z3 = false;
        long j3 = 1152921504606846975L;
        boolean z4 = r(atomicLongFieldUpdater.get(this), false) ? false : !e(r1 & 1152921504606846975L);
        i iVar = j.f3905a;
        if (z4) {
            return iVar;
        }
        InterfaceC0084h interfaceC0084h = e.f3892j;
        k kVar = (k) f3876p.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = andIncrement & j3;
            boolean r3 = r(andIncrement, z3);
            int i3 = e.f3884b;
            long j5 = i3;
            long j6 = j4 / j5;
            int i4 = (int) (j4 % j5);
            if (kVar.f4176c != j6) {
                k a3 = a(this, j6, kVar);
                if (a3 != null) {
                    kVar = a3;
                } else {
                    if (r3) {
                        return new h(o());
                    }
                    z3 = false;
                    j3 = 1152921504606846975L;
                }
            }
            int d3 = d(this, kVar, i4, obj, j4, interfaceC0084h, r3);
            O1.g gVar = O1.g.f1211a;
            if (d3 == 0) {
                kVar.a();
                return gVar;
            }
            if (d3 == 1) {
                return gVar;
            }
            if (d3 == 2) {
                if (r3) {
                    kVar.h();
                    return new h(o());
                }
                i0 i0Var = interfaceC0084h instanceof i0 ? (i0) interfaceC0084h : null;
                if (i0Var != null) {
                    i0Var.a(kVar, i4 + i3);
                }
                kVar.h();
                return iVar;
            }
            if (d3 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (d3 == 4) {
                if (j4 < f3874m.get(this)) {
                    kVar.a();
                }
                return new h(o());
            }
            if (d3 == 5) {
                kVar.a();
            }
            z3 = false;
            j3 = 1152921504606846975L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (k2.k) ((n2.b) n2.b.f4148b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k2.k i(long r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.c.i(long):k2.k");
    }

    public final void j(long j3) {
        k kVar = (k) f3877q.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3874m;
            long j4 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(this.f3881k + j4, n.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j4, 1 + j4)) {
                long j5 = e.f3884b;
                long j6 = j4 / j5;
                int i3 = (int) (j4 % j5);
                if (kVar.f4176c != j6) {
                    k l3 = l(j6, kVar);
                    if (l3 != null) {
                        kVar = l3;
                    }
                }
                k kVar2 = kVar;
                if (A(kVar2, i3, j4, null) != e.f3896o) {
                    kVar2.a();
                } else if (j4 < p()) {
                    kVar2.a();
                }
                kVar = kVar2;
            }
        }
    }

    public final void k() {
        Object b3;
        if (u()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3878r;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = n.getAndIncrement(this);
            long j3 = andIncrement / e.f3884b;
            if (p() <= andIncrement) {
                if (kVar.f4176c < j3 && kVar.b() != null) {
                    v(j3, kVar);
                }
                q(this);
                return;
            }
            if (kVar.f4176c != j3) {
                d dVar = d.f3882s;
                while (true) {
                    b3 = n2.a.b(kVar, j3, dVar);
                    if (!n2.a.e(b3)) {
                        n2.r c3 = n2.a.c(b3);
                        while (true) {
                            n2.r rVar = (n2.r) atomicReferenceFieldUpdater.get(this);
                            if (rVar.f4176c >= c3.f4176c) {
                                break;
                            }
                            if (!c3.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c3)) {
                                if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                    if (c3.e()) {
                                        c3.d();
                                    }
                                }
                            }
                            if (rVar.e()) {
                                rVar.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                k kVar2 = null;
                if (n2.a.e(b3)) {
                    s();
                    v(j3, kVar);
                    q(this);
                } else {
                    k kVar3 = (k) n2.a.c(b3);
                    long j4 = kVar3.f4176c;
                    if (j4 > j3) {
                        long j5 = j4 * e.f3884b;
                        if (n.compareAndSet(this, 1 + andIncrement, j5)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f3875o;
                            if ((atomicLongFieldUpdater.addAndGet(this, j5 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            q(this);
                        }
                    } else {
                        kVar2 = kVar3;
                    }
                }
                if (kVar2 == null) {
                    continue;
                } else {
                    kVar = kVar2;
                }
            }
            int i3 = (int) (andIncrement % e.f3884b);
            Object k3 = kVar.k(i3);
            boolean z3 = k3 instanceof i0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3874m;
            if (!z3 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(k3, e.f3889g, i3)) {
                while (true) {
                    Object k4 = kVar.k(i3);
                    if (!(k4 instanceof i0)) {
                        if (k4 != e.f3892j) {
                            if (k4 != null) {
                                if (k4 == e.f3886d || k4 == e.f3890h || k4 == e.f3891i || k4 == e.f3893k || k4 == e.f3894l) {
                                    break loop0;
                                }
                                if (k4 != e.f3888f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + k4).toString());
                                }
                            } else if (kVar.j(k4, e.f3887e, i3)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (kVar.j(k4, new t((i0) k4), i3)) {
                            break loop0;
                        }
                    } else if (kVar.j(k4, e.f3889g, i3)) {
                        if (z(k4)) {
                            kVar.n(i3, e.f3886d);
                            break;
                        } else {
                            kVar.n(i3, e.f3892j);
                            kVar.h();
                        }
                    }
                }
            } else if (z(k3)) {
                kVar.n(i3, e.f3886d);
                break;
            } else {
                kVar.n(i3, e.f3892j);
                kVar.h();
                q(this);
            }
        }
        q(this);
    }

    public final k l(long j3, k kVar) {
        Object b3;
        long j4;
        k kVar2 = e.f3883a;
        d dVar = d.f3882s;
        loop0: while (true) {
            b3 = n2.a.b(kVar, j3, dVar);
            if (!n2.a.e(b3)) {
                n2.r c3 = n2.a.c(b3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3877q;
                    n2.r rVar = (n2.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f4176c >= c3.f4176c) {
                        break loop0;
                    }
                    if (!c3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, c3)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (c3.e()) {
                                c3.d();
                            }
                        }
                    }
                    if (rVar.e()) {
                        rVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (n2.a.e(b3)) {
            s();
            if (kVar.f4176c * e.f3884b < p()) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) n2.a.c(b3);
            long j5 = kVar3.f4176c;
            if (!u() && j3 <= n.get(this) / e.f3884b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3878r;
                    n2.r rVar2 = (n2.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.f4176c >= j5 || !kVar3.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, kVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                            if (kVar3.e()) {
                                kVar3.d();
                            }
                        }
                    }
                    if (rVar2.e()) {
                        rVar2.d();
                    }
                }
            }
            if (j5 <= j3) {
                return kVar3;
            }
            long j6 = j5 * e.f3884b;
            do {
                j4 = f3874m.get(this);
                if (j4 >= j6) {
                    break;
                }
            } while (!f3874m.compareAndSet(this, j4, j6));
            if (j5 * e.f3884b < p()) {
                kVar3.a();
            }
        }
        return null;
    }

    public final Throwable m() {
        return (Throwable) f3879s.get(this);
    }

    public final Throwable n() {
        Throwable m3 = m();
        return m3 == null ? new l("Channel was closed") : m3;
    }

    public final Throwable o() {
        Throwable m3 = m();
        return m3 == null ? new C0254a("Channel was closed") : m3;
    }

    public final long p() {
        return f3873l.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (k2.k) ((n2.b) n2.b.f4148b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(long r14, boolean r16) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.c.r(long, boolean):boolean");
    }

    public final boolean s() {
        return r(f3873l.get(this), false);
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0194, code lost:
    
        r16 = r7;
        r3 = (k2.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019d, code lost:
    
        if (r3 != null) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.c.toString():java.lang.String");
    }

    public final boolean u() {
        long j3 = n.get(this);
        return j3 == 0 || j3 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(long r5, k2.k r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f4176c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            n2.b r0 = r7.b()
            k2.k r0 = (k2.k) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            n2.b r5 = r7.b()
            k2.k r5 = (k2.k) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = k2.c.f3878r
            java.lang.Object r6 = r5.get(r4)
            n2.r r6 = (n2.r) r6
            long r0 = r6.f4176c
            long r2 = r7.f4176c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.e()
            if (r5 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.c.v(long, k2.k):void");
    }

    public final Object w(R1.c cVar, Object obj) {
        C0290g c0290g = new C0290g(1, H2.h.s(cVar));
        c0290g.s();
        c0290g.resumeWith(H2.h.i(o()));
        Object r3 = c0290g.r();
        return r3 == S1.a.f1260k ? r3 : O1.g.f1211a;
    }

    public final void x(i0 i0Var, boolean z3) {
        if (i0Var instanceof InterfaceC0288e) {
            ((R1.c) i0Var).resumeWith(H2.h.i(z3 ? n() : o()));
            return;
        }
        if (!(i0Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + i0Var).toString());
        }
        b bVar = (b) i0Var;
        C0290g c0290g = bVar.f3871l;
        a2.h.b(c0290g);
        bVar.f3871l = null;
        bVar.f3870k = e.f3894l;
        Throwable m3 = bVar.f3872m.m();
        if (m3 == null) {
            c0290g.resumeWith(Boolean.FALSE);
        } else {
            c0290g.resumeWith(H2.h.i(m3));
        }
    }

    public final boolean y(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof InterfaceC0288e)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            a2.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0288e interfaceC0288e = (InterfaceC0288e) obj;
            k kVar = e.f3883a;
            B1.g k3 = interfaceC0288e.k(obj2, null);
            if (k3 == null) {
                return false;
            }
            interfaceC0288e.l(k3);
            return true;
        }
        a2.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        b bVar = (b) obj;
        C0290g c0290g = bVar.f3871l;
        a2.h.b(c0290g);
        bVar.f3871l = null;
        bVar.f3870k = obj2;
        Boolean bool = Boolean.TRUE;
        k kVar2 = e.f3883a;
        B1.g k4 = c0290g.k(bool, null);
        if (k4 == null) {
            return false;
        }
        c0290g.l(k4);
        return true;
    }
}
