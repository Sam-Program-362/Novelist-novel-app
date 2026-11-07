package k2;

import V.InterfaceC0084h;
import i2.AbstractC0212u;
import i2.C0199g;
import i2.InterfaceC0197e;
import i2.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class c implements g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3873l = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3874m = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater n = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3875o = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3876p = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3877q = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3878r = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3879s = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3880t = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
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
        Object objB;
        c cVar2;
        k kVar2 = e.f3883a;
        d dVar = d.f3882s;
        loop0: while (true) {
            objB = n2.a.b(kVar, j3, dVar);
            if (!n2.a.e(objB)) {
                n2.r rVarC = n2.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3876p;
                    n2.r rVar = (n2.r) atomicReferenceFieldUpdater.get(cVar);
                    if (rVar.f4176c >= rVarC.f4176c) {
                        break loop0;
                    }
                    if (!rVarC.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(cVar, rVar, rVarC)) {
                            if (!rVar.e()) {
                                break loop0;
                            }
                            rVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(cVar) == rVar);
                    if (rVarC.e()) {
                        rVarC.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = n2.a.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3874m;
        if (zE) {
            cVar.s();
            if (kVar.f4176c * ((long) e.f3884b) < atomicLongFieldUpdater.get(cVar)) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) n2.a.c(objB);
            long j4 = kVar3.f4176c;
            if (j4 <= j3) {
                return kVar3;
            }
            long j5 = ((long) e.f3884b) * j4;
            while (true) {
                long j6 = f3873l.get(cVar);
                long j7 = 1152921504606846975L & j6;
                if (j7 >= j5) {
                    cVar2 = cVar;
                    break;
                }
                cVar2 = cVar;
                if (f3873l.compareAndSet(cVar2, j6, (((long) ((int) (j6 >> 60))) << 60) + j7)) {
                    break;
                }
                cVar = cVar2;
            }
            if (j4 * ((long) e.f3884b) < atomicLongFieldUpdater.get(cVar2)) {
                kVar3.a();
            }
        }
        return null;
    }

    public static final void c(c cVar, Object obj, C0199g c0199g) {
        c0199g.resumeWith(H2.h.i(cVar.o()));
    }

    public static final int d(c cVar, k kVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        kVar.m(i3, obj);
        if (z3) {
            return cVar.B(kVar, i3, obj, j3, obj2, z3);
        }
        Object objK = kVar.k(i3);
        if (objK == null) {
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
        } else if (objK instanceof i0) {
            kVar.m(i3, null);
            if (cVar.y(objK, obj)) {
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
        if (!(obj instanceof InterfaceC0197e)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        a2.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC0197e interfaceC0197e = (InterfaceC0197e) obj;
        k kVar = e.f3883a;
        B1.g gVarK = interfaceC0197e.k(O1.g.f1211a, null);
        if (gVarK == null) {
            return false;
        }
        interfaceC0197e.l(gVarK);
        return true;
    }

    public final Object A(k kVar, int i3, long j3, Object obj) {
        AtomicReferenceArray atomicReferenceArray = kVar.f3907f;
        Object objK = kVar.k(i3);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3873l;
        if (objK == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.n;
                }
                if (kVar.j(objK, obj, i3)) {
                    k();
                    return e.f3895m;
                }
            }
        } else if (objK == e.f3886d && kVar.j(objK, e.f3891i, i3)) {
            k();
            Object obj2 = atomicReferenceArray.get(i3 * 2);
            kVar.m(i3, null);
            return obj2;
        }
        while (true) {
            Object objK2 = kVar.k(i3);
            if (objK2 == null || objK2 == e.f3887e) {
                if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (kVar.j(objK2, e.f3890h, i3)) {
                        k();
                        return e.f3896o;
                    }
                } else {
                    if (obj == null) {
                        return e.n;
                    }
                    if (kVar.j(objK2, obj, i3)) {
                        k();
                        return e.f3895m;
                    }
                }
            } else if (objK2 != e.f3886d) {
                B1.g gVar = e.f3892j;
                if (objK2 == gVar) {
                    return e.f3896o;
                }
                if (objK2 == e.f3890h) {
                    return e.f3896o;
                }
                if (objK2 == e.f3894l) {
                    k();
                    return e.f3896o;
                }
                if (objK2 != e.f3889g && kVar.j(objK2, e.f3888f, i3)) {
                    boolean z3 = objK2 instanceof t;
                    if (z3) {
                        objK2 = ((t) objK2).f3911a;
                    }
                    if (z(objK2)) {
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
            } else if (kVar.j(objK2, e.f3891i, i3)) {
                k();
                Object obj4 = atomicReferenceArray.get(i3 * 2);
                kVar.m(i3, null);
                return obj4;
            }
        }
    }

    public final int B(k kVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        while (true) {
            Object objK = kVar.k(i3);
            if (objK == null) {
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
                if (objK != e.f3887e) {
                    B1.g gVar = e.f3893k;
                    if (objK == gVar) {
                        kVar.m(i3, null);
                        return 5;
                    }
                    if (objK == e.f3890h) {
                        kVar.m(i3, null);
                        return 5;
                    }
                    if (objK == e.f3894l) {
                        kVar.m(i3, null);
                        s();
                        return 4;
                    }
                    kVar.m(i3, null);
                    if (objK instanceof t) {
                        objK = ((t) objK).f3911a;
                    }
                    if (y(objK, obj)) {
                        kVar.n(i3, e.f3891i);
                        return 0;
                    }
                    if (kVar.f3907f.getAndSet((i3 * 2) + 1, gVar) != gVar) {
                        kVar.l(i3, true);
                    }
                    return 5;
                }
                if (kVar.j(objK, e.f3886d, i3)) {
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

    public final boolean f(Throwable th, boolean z3) {
        c cVar;
        boolean z4;
        long j3;
        long j4;
        long j5;
        Object obj;
        long j6;
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3873l;
        if (!z3) {
            cVar = this;
            break;
        }
        do {
            j7 = atomicLongFieldUpdater.get(this);
            if (((int) (j7 >> 60)) != 0) {
                cVar = this;
                break;
            }
            k kVar = e.f3883a;
            cVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(cVar, j7, (j7 & 1152921504606846975L) + (((long) 1) << 60)));
        B1.g gVar = e.f3900s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3879s;
            if (atomicReferenceFieldUpdater.compareAndSet(this, gVar, th)) {
                z4 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != gVar) {
                z4 = false;
                break;
            }
        }
        if (z3) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j6, (((long) 3) << 60) + (j6 & 1152921504606846975L)));
        } else {
            do {
                j3 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j3 >> 60);
                if (i3 == 0) {
                    j4 = j3 & 1152921504606846975L;
                    j5 = 2;
                } else {
                    if (i3 != 1) {
                        break;
                    }
                    j4 = j3 & 1152921504606846975L;
                    j5 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j3, (j5 << 60) + j4));
        }
        s();
        if (z4) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3880t;
                obj = atomicReferenceFieldUpdater2.get(this);
                B1.g gVar2 = obj == null ? e.f3898q : e.f3899r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, gVar2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                a2.r.a(1, obj);
                ((Z1.l) obj).f(m());
                return z4;
            }
        }
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x0160  */
    /* JADX WARN: Code duplicated, block: B:95:0x0163 A[RETURN] */
    @Override // k2.s
    public Object g(R1.c cVar, Object obj) throws Throwable {
        O1.g gVar;
        Object objR;
        Object obj2;
        c cVar2;
        k kVar;
        int i3;
        c cVar3 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3876p;
        k kVar2 = (k) atomicReferenceFieldUpdater.get(cVar3);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3873l;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar3);
            long j3 = andIncrement & 1152921504606846975L;
            boolean zR = cVar3.r(andIncrement, false);
            int i4 = e.f3884b;
            long j4 = i4;
            long j5 = j3 / j4;
            int i5 = (int) (j3 % j4);
            long j6 = kVar2.f4176c;
            S1.a aVar = S1.a.f1260k;
            gVar = O1.g.f1211a;
            if (j6 != j5) {
                k kVarA = a(cVar3, j5, kVar2);
                if (kVarA != null) {
                    kVar2 = kVarA;
                } else if (zR) {
                    Object objW = w(cVar, obj);
                    if (objW != aVar) {
                        break;
                    }
                    return objW;
                }
            }
            int iD = d(cVar3, kVar2, i5, obj, j3, null, zR);
            if (iD == 0) {
                kVar2.a();
                return gVar;
            }
            if (iD == 1) {
                break;
            }
            if (iD != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3874m;
                if (iD == 3) {
                    C0199g c0199gD = AbstractC0212u.d(H2.h.s(cVar));
                    Object obj3 = obj;
                    try {
                        int iD2 = d(cVar3, kVar2, i5, obj3, j3, c0199gD, false);
                        try {
                            if (iD2 != 0) {
                                if (iD2 == 1) {
                                    c0199gD.resumeWith(gVar);
                                } else if (iD2 != 2) {
                                    if (iD2 != 4) {
                                        String str = "unexpected";
                                        if (iD2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        kVar2.a();
                                        k kVar3 = (k) atomicReferenceFieldUpdater.get(cVar3);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(cVar3);
                                            long j7 = andIncrement2 & 1152921504606846975L;
                                            boolean zR2 = cVar3.r(andIncrement2, false);
                                            int i6 = e.f3884b;
                                            long j8 = i6;
                                            str = str;
                                            long j9 = j7 / j8;
                                            int i7 = (int) (j7 % j8);
                                            if (kVar3.f4176c != j9) {
                                                k kVarA2 = a(cVar3, j9, kVar3);
                                                if (kVarA2 != null) {
                                                    i3 = i6;
                                                    kVar = kVarA2;
                                                } else if (zR2) {
                                                    c(cVar3, obj3, c0199gD);
                                                    break;
                                                }
                                            } else {
                                                kVar = kVar3;
                                                i3 = i6;
                                            }
                                            int iD3 = d(cVar3, kVar, i7, obj3, j7, c0199gD, zR2);
                                            Object obj4 = obj3;
                                            cVar2 = cVar3;
                                            k kVar4 = kVar;
                                            obj2 = obj4;
                                            if (iD3 == 0) {
                                                kVar4.a();
                                            } else if (iD3 != 1) {
                                                if (iD3 == 2) {
                                                    if (!zR2) {
                                                        c0199gD.a(kVar4, i7 + i3);
                                                        break;
                                                    }
                                                    kVar4.h();
                                                } else {
                                                    if (iD3 == 3) {
                                                        throw new IllegalStateException(str);
                                                    }
                                                    if (iD3 != 4) {
                                                        if (iD3 == 5) {
                                                            kVar4.a();
                                                        }
                                                        kVar3 = kVar4;
                                                        cVar3 = cVar2;
                                                        obj3 = obj2;
                                                    } else if (j7 < atomicLongFieldUpdater2.get(cVar2)) {
                                                        kVar4.a();
                                                    }
                                                }
                                            }
                                        }
                                        c0199gD.y();
                                        throw th;
                                    }
                                    obj2 = obj3;
                                    cVar2 = cVar3;
                                    if (j3 < atomicLongFieldUpdater2.get(cVar2)) {
                                        kVar2.a();
                                    }
                                    c(cVar2, obj2, c0199gD);
                                    break;
                                } else {
                                    c0199gD.a(kVar2, i5 + i4);
                                }
                                objR = c0199gD.r();
                                if (objR != aVar) {
                                    objR = gVar;
                                }
                                if (objR == aVar) {
                                    return objR;
                                }
                            } else {
                                kVar2.a();
                            }
                            c0199gD.resumeWith(gVar);
                            objR = c0199gD.r();
                            if (objR != aVar) {
                                objR = gVar;
                            }
                            if (objR == aVar) {
                                return objR;
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (iD == 4) {
                        if (j3 < atomicLongFieldUpdater2.get(cVar3)) {
                            kVar2.a();
                        }
                        Object objW2 = w(cVar, obj);
                        if (objW2 != aVar) {
                            break;
                        }
                        return objW2;
                    }
                    if (iD == 5) {
                        kVar2.a();
                    }
                }
            } else if (zR) {
                kVar2.h();
                Object objW3 = w(cVar, obj);
                if (objW3 == aVar) {
                    return objW3;
                }
            }
            return gVar;
        }
        return gVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x007d A[SYNTHETIC] */
    @Override // k2.s
    public Object h(Object obj) {
        int iD;
        O1.g gVar;
        i0 i0Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3873l;
        long j3 = atomicLongFieldUpdater.get(this);
        boolean z3 = false;
        long j4 = 1152921504606846975L;
        boolean z4 = r(j3, false) ? false : !e(j3 & 1152921504606846975L);
        i iVar = j.f3905a;
        if (z4) {
            return iVar;
        }
        InterfaceC0084h interfaceC0084h = e.f3892j;
        k kVar = (k) f3876p.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = andIncrement & j4;
            boolean zR = r(andIncrement, z3);
            int i3 = e.f3884b;
            long j6 = i3;
            long j7 = j5 / j6;
            int i4 = (int) (j5 % j6);
            if (kVar.f4176c == j7) {
                iD = d(this, kVar, i4, obj, j5, interfaceC0084h, zR);
                gVar = O1.g.f1211a;
                if (iD != 0) {
                    kVar.a();
                    return gVar;
                }
                if (iD != 1) {
                    return gVar;
                }
                if (iD != 2) {
                    if (zR) {
                        kVar.h();
                        return new h(o());
                    }
                    if (interfaceC0084h instanceof i0) {
                        i0Var = (i0) interfaceC0084h;
                    } else {
                        i0Var = null;
                    }
                    if (i0Var != null) {
                        i0Var.a(kVar, i4 + i3);
                    }
                    kVar.h();
                    return iVar;
                }
                if (iD != 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iD != 4) {
                    if (j5 < f3874m.get(this)) {
                        kVar.a();
                    }
                    return new h(o());
                }
                if (iD == 5) {
                    kVar.a();
                }
                z3 = false;
            } else {
                k kVarA = a(this, j7, kVar);
                if (kVarA != null) {
                    kVar = kVarA;
                    iD = d(this, kVar, i4, obj, j5, interfaceC0084h, zR);
                    gVar = O1.g.f1211a;
                    if (iD != 0) {
                        kVar.a();
                        return gVar;
                    }
                    if (iD != 1) {
                        return gVar;
                    }
                    if (iD != 2) {
                        if (zR) {
                            kVar.h();
                            return new h(o());
                        }
                        if (interfaceC0084h instanceof i0) {
                            i0Var = (i0) interfaceC0084h;
                        } else {
                            i0Var = null;
                        }
                        if (i0Var != null) {
                            i0Var.a(kVar, i4 + i3);
                        }
                        kVar.h();
                        return iVar;
                    }
                    if (iD != 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iD != 4) {
                        if (j5 < f3874m.get(this)) {
                            kVar.a();
                        }
                        return new h(o());
                    }
                    if (iD == 5) {
                        kVar.a();
                    }
                    z3 = false;
                } else {
                    if (zR) {
                        return new h(o());
                    }
                    z3 = false;
                }
            }
            j4 = 1152921504606846975L;
        }
    }

    public final k i(long j3) {
        Object objF;
        long j4;
        Object obj = f3878r.get(this);
        k kVar = (k) f3876p.get(this);
        if (kVar.f4176c > ((k) obj).f4176c) {
            obj = kVar;
        }
        k kVar2 = (k) f3877q.get(this);
        if (kVar2.f4176c > ((k) obj).f4176c) {
            obj = kVar2;
        }
        n2.b bVar = (n2.b) obj;
        loop0: while (true) {
            bVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n2.b.f4147a;
            Object obj2 = atomicReferenceFieldUpdater.get(bVar);
            B1.g gVar = n2.a.f4140a;
            objF = null;
            if (obj2 == gVar) {
                break;
            }
            n2.b bVar2 = (n2.b) obj2;
            if (bVar2 == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(bVar, null, gVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(bVar) == null);
            } else {
                bVar = bVar2;
            }
        }
        k kVar3 = (k) bVar;
        if (t()) {
            k kVar4 = kVar3;
            loop2: while (true) {
                int i3 = e.f3884b - 1;
                while (true) {
                    if (-1 < i3) {
                        j4 = (kVar4.f4176c * ((long) e.f3884b)) + ((long) i3);
                        if (j4 >= f3874m.get(this)) {
                            while (true) {
                                Object objK = kVar4.k(i3);
                                if (objK != null && objK != e.f3887e) {
                                    if (objK != e.f3886d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (kVar4.j(objK, e.f3894l, i3)) {
                                    kVar4.h();
                                    break;
                                }
                            }
                            i3--;
                        }
                    } else {
                        kVar4 = (k) ((n2.b) n2.b.f4148b.get(kVar4));
                        if (kVar4 == null) {
                        }
                    }
                    j4 = -1;
                    break;
                }
            }
            if (j4 != -1) {
                j(j4);
            }
        }
        loop5: for (k kVar5 = kVar3; kVar5 != null; kVar5 = (k) ((n2.b) n2.b.f4148b.get(kVar5))) {
            for (int i4 = e.f3884b - 1; -1 < i4; i4--) {
                if ((kVar5.f4176c * ((long) e.f3884b)) + ((long) i4) < j3) {
                    break loop5;
                }
                while (true) {
                    Object objK2 = kVar5.k(i4);
                    if (objK2 != null && objK2 != e.f3887e) {
                        if (!(objK2 instanceof t)) {
                            if (!(objK2 instanceof i0)) {
                                break;
                            }
                            if (kVar5.j(objK2, e.f3894l, i4)) {
                                objF = n2.a.f(objF, objK2);
                                kVar5.l(i4, true);
                                break;
                            }
                        } else {
                            if (kVar5.j(objK2, e.f3894l, i4)) {
                                objF = n2.a.f(objF, ((t) objK2).f3911a);
                                kVar5.l(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (kVar5.j(objK2, e.f3894l, i4)) {
                            kVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (objF != null) {
            if (!(objF instanceof ArrayList)) {
                x((i0) objF, true);
                return kVar3;
            }
            ArrayList arrayList = (ArrayList) objF;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                x((i0) arrayList.get(size), true);
            }
        }
        return kVar3;
    }

    public final void j(long j3) {
        k kVar = (k) f3877q.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3874m;
            long j4 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(((long) this.f3881k) + j4, n.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j4, 1 + j4)) {
                long j5 = e.f3884b;
                long j6 = j4 / j5;
                int i3 = (int) (j4 % j5);
                if (kVar.f4176c != j6) {
                    k kVarL = l(j6, kVar);
                    if (kVarL != null) {
                        kVar = kVarL;
                    }
                }
                k kVar2 = kVar;
                if (A(kVar2, i3, j4, null) != e.f3896o || j4 < p()) {
                    kVar2.a();
                }
                kVar = kVar2;
            }
        }
    }

    public final void k() {
        Object objB;
        if (u()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3878r;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = n.getAndIncrement(this);
            long j3 = andIncrement / ((long) e.f3884b);
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
                    objB = n2.a.b(kVar, j3, dVar);
                    if (!n2.a.e(objB)) {
                        n2.r rVarC = n2.a.c(objB);
                        while (true) {
                            n2.r rVar = (n2.r) atomicReferenceFieldUpdater.get(this);
                            if (rVar.f4176c >= rVarC.f4176c) {
                                break;
                            }
                            if (!rVarC.i()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                                    if (!rVar.e()) {
                                        break;
                                    }
                                    rVar.d();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == rVar);
                            if (rVarC.e()) {
                                rVarC.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                k kVar2 = null;
                if (n2.a.e(objB)) {
                    s();
                    v(j3, kVar);
                    q(this);
                } else {
                    k kVar3 = (k) n2.a.c(objB);
                    long j4 = kVar3.f4176c;
                    if (j4 > j3) {
                        long j5 = j4 * ((long) e.f3884b);
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
            int i3 = (int) (andIncrement % ((long) e.f3884b));
            Object objK = kVar.k(i3);
            boolean z3 = objK instanceof i0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3874m;
            if (!z3 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(objK, e.f3889g, i3)) {
                while (true) {
                    Object objK2 = kVar.k(i3);
                    if (objK2 instanceof i0) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (kVar.j(objK2, new t((i0) objK2), i3)) {
                                q(this);
                                return;
                            }
                        } else if (kVar.j(objK2, e.f3889g, i3)) {
                            if (!z(objK2)) {
                                kVar.n(i3, e.f3892j);
                                kVar.h();
                                break;
                            } else {
                                kVar.n(i3, e.f3886d);
                                q(this);
                                return;
                            }
                        }
                    } else {
                        if (objK2 == e.f3892j) {
                            break;
                        }
                        if (objK2 == null) {
                            if (kVar.j(objK2, e.f3887e, i3)) {
                                q(this);
                                return;
                            }
                        } else if (objK2 == e.f3886d || objK2 == e.f3890h || objK2 == e.f3891i || objK2 == e.f3893k || objK2 == e.f3894l) {
                            q(this);
                            return;
                        } else if (objK2 != e.f3888f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objK2).toString());
                        }
                    }
                }
                q(this);
            } else if (z(objK)) {
                kVar.n(i3, e.f3886d);
                q(this);
                return;
            } else {
                kVar.n(i3, e.f3892j);
                kVar.h();
                q(this);
            }
        }
    }

    public final k l(long j3, k kVar) {
        Object objB;
        long j4;
        k kVar2 = e.f3883a;
        d dVar = d.f3882s;
        loop0: while (true) {
            objB = n2.a.b(kVar, j3, dVar);
            if (!n2.a.e(objB)) {
                n2.r rVarC = n2.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3877q;
                    n2.r rVar = (n2.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f4176c >= rVarC.f4176c) {
                        break loop0;
                    }
                    if (!rVarC.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, rVarC)) {
                            if (!rVar.e()) {
                                break loop0;
                            }
                            rVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == rVar);
                    if (rVarC.e()) {
                        rVarC.d();
                    }
                }
            } else {
                break;
            }
        }
        if (n2.a.e(objB)) {
            s();
            if (kVar.f4176c * ((long) e.f3884b) < p()) {
                kVar.a();
                return null;
            }
        } else {
            k kVar3 = (k) n2.a.c(objB);
            long j5 = kVar3.f4176c;
            if (!u() && j3 <= n.get(this) / ((long) e.f3884b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3878r;
                    n2.r rVar2 = (n2.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.f4176c >= j5 || !kVar3.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, kVar3)) {
                            if (!rVar2.e()) {
                                break loop3;
                            }
                            rVar2.d();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == rVar2);
                    if (kVar3.e()) {
                        kVar3.d();
                    }
                }
            }
            if (j5 <= j3) {
                return kVar3;
            }
            long j6 = j5 * ((long) e.f3884b);
            do {
                j4 = f3874m.get(this);
                if (j4 >= j6) {
                    break;
                }
            } while (!f3874m.compareAndSet(this, j4, j6));
            if (j5 * ((long) e.f3884b) < p()) {
                kVar3.a();
            }
        }
        return null;
    }

    public final Throwable m() {
        return (Throwable) f3879s.get(this);
    }

    public final Throwable n() {
        Throwable thM = m();
        return thM == null ? new l("Channel was closed") : thM;
    }

    public final Throwable o() {
        Throwable thM = m();
        return thM == null ? new p019g1.a("Channel was closed") : thM;
    }

    public final long p() {
        return f3873l.get(this) & 1152921504606846975L;
    }

    public final boolean r(long j3, boolean z3) {
        int i3 = (int) (j3 >> 60);
        if (i3 != 0 && i3 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3874m;
            if (i3 == 2) {
                i(1152921504606846975L & j3);
                if (z3) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3877q;
                        k kVarL = (k) atomicReferenceFieldUpdater.get(this);
                        long j4 = atomicLongFieldUpdater.get(this);
                        if (p() <= j4) {
                            break;
                        }
                        long j5 = e.f3884b;
                        long j6 = j4 / j5;
                        if (kVarL.f4176c != j6 && (kVarL = l(j6, kVarL)) == null) {
                            if (((k) atomicReferenceFieldUpdater.get(this)).f4176c < j6) {
                                break;
                            }
                        } else {
                            kVarL.a();
                            int i4 = (int) (j4 % j5);
                            while (true) {
                                Object objK = kVarL.k(i4);
                                if (objK != null && objK != e.f3887e) {
                                    if (objK != e.f3886d && (objK == e.f3892j || objK == e.f3894l || objK == e.f3891i || objK == e.f3890h || (objK != e.f3889g && (objK == e.f3888f || j4 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (kVarL.j(objK, e.f3890h, i4)) {
                                    k();
                                    break;
                                }
                            }
                            f3874m.compareAndSet(this, j4, j4 + 1);
                        }
                    }
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException(B1.e.g("unexpected close status: ", i3).toString());
                }
                k kVarI = i(1152921504606846975L & j3);
                Object objF = null;
                loop0: do {
                    for (int i5 = e.f3884b - 1; -1 < i5; i5--) {
                        long j7 = (kVarI.f4176c * ((long) e.f3884b)) + ((long) i5);
                        while (true) {
                            Object objK2 = kVarI.k(i5);
                            if (objK2 == e.f3891i) {
                                break loop0;
                            }
                            if (objK2 != e.f3886d) {
                                if (objK2 != e.f3887e && objK2 != null) {
                                    if (!(objK2 instanceof i0) && !(objK2 instanceof t)) {
                                        B1.g gVar = e.f3889g;
                                        if (objK2 == gVar || objK2 == e.f3888f) {
                                            break loop0;
                                        }
                                        if (objK2 != gVar) {
                                            break;
                                        }
                                    } else {
                                        if (j7 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        i0 i0Var = objK2 instanceof t ? ((t) objK2).f3911a : (i0) objK2;
                                        if (kVarI.j(objK2, e.f3894l, i5)) {
                                            objF = n2.a.f(objF, i0Var);
                                            kVarI.m(i5, null);
                                            kVarI.h();
                                            break;
                                        }
                                    }
                                } else {
                                    if (kVarI.j(objK2, e.f3894l, i5)) {
                                        kVarI.h();
                                        break;
                                    }
                                }
                            } else {
                                if (j7 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (kVarI.j(objK2, e.f3894l, i5)) {
                                    kVarI.m(i5, null);
                                    kVarI.h();
                                    break;
                                }
                            }
                        }
                    }
                    kVarI = (k) ((n2.b) n2.b.f4148b.get(kVarI));
                } while (kVarI != null);
                if (objF != null) {
                    if (objF instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objF;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            x((i0) arrayList.get(size), false);
                        }
                    } else {
                        x((i0) objF, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean s() {
        return r(f3873l.get(this), false);
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i3 = (int) (f3873l.get(this) >> 60);
        if (i3 == 2) {
            sb.append("closed,");
        } else if (i3 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f3881k + ',');
        sb.append("data=[");
        int i4 = 0;
        boolean z3 = true;
        List listD0 = P1.f.d0(f3877q.get(this), f3876p.get(this), f3878r.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD0) {
            if (((k) obj) != e.f3883a) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it2.next();
        if (it2.hasNext()) {
            long j3 = ((k) next).f4176c;
            do {
                Object next2 = it2.next();
                long j4 = ((k) next2).f4176c;
                if (j3 > j4) {
                    next = next2;
                    j3 = j4;
                }
            } while (it2.hasNext());
        }
        k kVar = (k) next;
        long j5 = f3874m.get(this);
        long jP = p();
        loop2: while (true) {
            int i5 = e.f3884b;
            int i6 = i4;
            while (i6 < i5) {
                long j6 = (kVar.f4176c * ((long) e.f3884b)) + ((long) i6);
                if (j6 >= jP && j6 >= j5) {
                    break loop2;
                }
                Object objK = kVar.k(i6);
                boolean z4 = z3;
                Object obj2 = kVar.f3907f.get(i6 * 2);
                if (objK instanceof InterfaceC0197e) {
                    string = (j6 >= j5 || j6 < jP) ? (j6 >= jP || j6 < j5) ? "cont" : "send" : "receive";
                } else if (objK instanceof t) {
                    string = "EB(" + objK + ')';
                } else if (a2.h.a(objK, e.f3888f) || a2.h.a(objK, e.f3889g)) {
                    string = "resuming_sender";
                } else {
                    if (objK != null && !objK.equals(e.f3887e) && !objK.equals(e.f3891i) && !objK.equals(e.f3890h) && !objK.equals(e.f3893k) && !objK.equals(e.f3892j) && !objK.equals(e.f3894l)) {
                        string = objK.toString();
                    }
                    i6++;
                    z3 = z4;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i6++;
                z3 = z4;
            }
            boolean z5 = z3;
            kVar = (k) kVar.b();
            if (kVar == null) {
                break;
            }
            z3 = z5;
            i4 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(p024h2.d.a0(sb)) == ',') {
            a2.h.d(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean u() {
        long j3 = n.get(this);
        return j3 == 0 || j3 == Long.MAX_VALUE;
    }

    public final void v(long j3, k kVar) {
        k kVar2;
        k kVar3;
        while (kVar.f4176c < j3 && (kVar3 = (k) kVar.b()) != null) {
            kVar = kVar3;
        }
        while (true) {
            if (!kVar.c() || (kVar2 = (k) kVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3878r;
                    n2.r rVar = (n2.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.f4176c >= kVar.f4176c) {
                        return;
                    }
                    if (!kVar.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, rVar, kVar)) {
                            if (rVar.e()) {
                                rVar.d();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == rVar);
                    if (kVar.e()) {
                        kVar.d();
                    }
                }
            } else {
                kVar = kVar2;
            }
        }
    }

    public final Object w(R1.c cVar, Object obj) throws Throwable {
        C0199g c0199g = new C0199g(1, H2.h.s(cVar));
        c0199g.s();
        c0199g.resumeWith(H2.h.i(o()));
        Object objR = c0199g.r();
        return objR == S1.a.f1260k ? objR : O1.g.f1211a;
    }

    public final void x(i0 i0Var, boolean z3) {
        if (i0Var instanceof InterfaceC0197e) {
            ((R1.c) i0Var).resumeWith(H2.h.i(z3 ? n() : o()));
            return;
        }
        if (!(i0Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + i0Var).toString());
        }
        b bVar = (b) i0Var;
        C0199g c0199g = bVar.f3871l;
        a2.h.b(c0199g);
        bVar.f3871l = null;
        bVar.f3870k = e.f3894l;
        Throwable thM = bVar.f3872m.m();
        if (thM == null) {
            c0199g.resumeWith(Boolean.FALSE);
        } else {
            c0199g.resumeWith(H2.h.i(thM));
        }
    }

    public final boolean y(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof InterfaceC0197e)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            a2.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0197e interfaceC0197e = (InterfaceC0197e) obj;
            k kVar = e.f3883a;
            B1.g gVarK = interfaceC0197e.k(obj2, null);
            if (gVarK == null) {
                return false;
            }
            interfaceC0197e.l(gVarK);
            return true;
        }
        a2.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        b bVar = (b) obj;
        C0199g c0199g = bVar.f3871l;
        a2.h.b(c0199g);
        bVar.f3871l = null;
        bVar.f3870k = obj2;
        Boolean bool = Boolean.TRUE;
        k kVar2 = e.f3883a;
        B1.g gVarK2 = c0199g.k(bool, null);
        if (gVarK2 == null) {
            return false;
        }
        c0199g.l(gVarK2);
        return true;
    }
}
