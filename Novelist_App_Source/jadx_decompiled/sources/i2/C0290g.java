package i2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: i2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0290g extends AbstractC0308z implements InterfaceC0288e, T1.d, i0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3001p = AtomicIntegerFieldUpdater.newUpdater(C0290g.class, "_decisionAndIndex$volatile");

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3002q = AtomicReferenceFieldUpdater.newUpdater(C0290g.class, Object.class, "_state$volatile");

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3003r = AtomicReferenceFieldUpdater.newUpdater(C0290g.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final R1.c n;

    /* renamed from: o, reason: collision with root package name */
    public final R1.h f3004o;

    public C0290g(int i3, R1.c cVar) {
        super(i3);
        this.n = cVar;
        this.f3004o = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0285b.f2994a;
    }

    public static Object B(Z z3, Object obj, int i3, Z1.q qVar) {
        if (obj instanceof C0298o) {
            return obj;
        }
        if (i3 != 1 && i3 != 2) {
            return obj;
        }
        if (qVar != null || (z3 instanceof C)) {
            return new C0297n(obj, z3 instanceof C ? (C) z3 : null, qVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void w(Z z3, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + z3 + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i3, Z1.q qVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3002q;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof Z) {
                Object B2 = B((Z) obj2, obj, i3, qVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, B2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!v()) {
                    o();
                }
                p(i3);
                return;
            }
            if (obj2 instanceof C0291h) {
                C0291h c0291h = (C0291h) obj2;
                c0291h.getClass();
                if (C0291h.f3006c.compareAndSet(c0291h, 0, 1)) {
                    if (qVar != null) {
                        j(qVar, c0291h.f3017a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // i2.i0
    public final void a(n2.r rVar, int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f3001p;
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, ((i4 >> 29) << 29) + i3));
        u(rVar);
    }

    @Override // i2.AbstractC0308z
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3002q;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof Z) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0298o) {
                return;
            }
            if (!(obj instanceof C0297n)) {
                cancellationException2 = cancellationException;
                C0297n c0297n = new C0297n(obj, (C) null, (Z1.q) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0297n)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0297n c0297n2 = (C0297n) obj;
            if (c0297n2.f3015e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0297n a3 = C0297n.a(c0297n2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            C c3 = c0297n2.f3012b;
            if (c3 != null) {
                i(c3);
            }
            Z1.q qVar = c0297n2.f3013c;
            if (qVar != null) {
                j(qVar, cancellationException, c0297n2.f3011a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // T1.d
    public final T1.d c() {
        R1.c cVar = this.n;
        if (cVar instanceof T1.d) {
            return (T1.d) cVar;
        }
        return null;
    }

    @Override // i2.AbstractC0308z
    public final R1.c d() {
        return this.n;
    }

    @Override // i2.AbstractC0308z
    public final Throwable e(Object obj) {
        Throwable e3 = super.e(obj);
        if (e3 != null) {
            return e3;
        }
        return null;
    }

    @Override // i2.AbstractC0308z
    public final Object f(Object obj) {
        return obj instanceof C0297n ? ((C0297n) obj).f3011a : obj;
    }

    @Override // R1.c
    public final R1.h getContext() {
        return this.f3004o;
    }

    @Override // i2.AbstractC0308z
    public final Object h() {
        return f3002q.get(this);
    }

    public final void i(C c3) {
        try {
            c3.f2965a.b();
        } catch (Throwable th) {
            AbstractC0303u.e(this.f3004o, new D0.a("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    public final void j(Z1.q qVar, Throwable th, Object obj) {
        R1.h hVar = this.f3004o;
        try {
            qVar.d(th, obj, hVar);
        } catch (Throwable th2) {
            AbstractC0303u.e(hVar, new D0.a("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // i2.InterfaceC0288e
    public final B1.g k(Object obj, Z1.q qVar) {
        B1.g gVar = AbstractC0303u.f3026a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3002q;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof Z)) {
                return null;
            }
            Object B2 = B((Z) obj2, obj, this.f3038m, qVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, B2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!v()) {
                o();
            }
            return gVar;
        }
    }

    @Override // i2.InterfaceC0288e
    public final void l(Object obj) {
        p(this.f3038m);
    }

    public final void m(n2.r rVar, Throwable th) {
        R1.h hVar = this.f3004o;
        int i3 = f3001p.get(this) & 536870911;
        if (i3 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            rVar.g(i3, hVar);
        } catch (Throwable th2) {
            AbstractC0303u.e(hVar, new D0.a("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3002q;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof Z) {
                C0291h c0291h = new C0291h(this, th, (obj instanceof C) || (obj instanceof n2.r));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0291h)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                Z z3 = (Z) obj;
                if (z3 instanceof C) {
                    i((C) obj);
                } else if (z3 instanceof n2.r) {
                    m((n2.r) obj, th);
                }
                if (!v()) {
                    o();
                }
                p(this.f3038m);
                return;
            }
            return;
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3003r;
        B b3 = (B) atomicReferenceFieldUpdater.get(this);
        if (b3 == null) {
            return;
        }
        b3.b();
        atomicReferenceFieldUpdater.set(this, Y.f2992a);
    }

    public final void p(int i3) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = f3001p;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z3 = i3 == 4;
                R1.c cVar = this.n;
                if (!z3 && (cVar instanceof n2.f)) {
                    boolean z4 = i3 == 1 || i3 == 2;
                    int i6 = this.f3038m;
                    if (z4 == (i6 == 1 || i6 == 2)) {
                        n2.f fVar = (n2.f) cVar;
                        AbstractC0300q abstractC0300q = fVar.n;
                        R1.h context = fVar.f4153o.getContext();
                        if (abstractC0300q.d(context)) {
                            abstractC0300q.c(context, this);
                            return;
                        }
                        G a3 = e0.a();
                        if (a3.f2971m >= 4294967296L) {
                            P1.c cVar2 = a3.f2972o;
                            if (cVar2 == null) {
                                cVar2 = new P1.c();
                                a3.f2972o = cVar2;
                            }
                            cVar2.addLast(this);
                            return;
                        }
                        a3.l(true);
                        try {
                            AbstractC0303u.i(this, cVar, true);
                            do {
                            } while (a3.n());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC0303u.i(this, cVar, z3);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1073741824 + (536870911 & i4)));
    }

    public Throwable q(W w3) {
        return w3.w();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        N n;
        boolean v3 = v();
        do {
            atomicIntegerFieldUpdater = f3001p;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (v3) {
                    y();
                }
                Object obj = f3002q.get(this);
                if (obj instanceof C0298o) {
                    throw ((C0298o) obj).f3017a;
                }
                int i5 = this.f3038m;
                if ((i5 != 1 && i5 != 2) || (n = (N) this.f3004o.e(r.f3022l)) == null || n.a()) {
                    return f(obj);
                }
                CancellationException w3 = ((W) n).w();
                b(w3);
                throw w3;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 536870912 + (536870911 & i3)));
        if (((B) f3003r.get(this)) == null) {
            t();
        }
        if (v3) {
            y();
        }
        return S1.a.f1260k;
    }

    @Override // R1.c
    public final void resumeWith(Object obj) {
        Throwable a3 = O1.d.a(obj);
        if (a3 != null) {
            obj = new C0298o(a3, false);
        }
        A(obj, this.f3038m, null);
    }

    public final void s() {
        B t3 = t();
        if (t3 == null || (f3002q.get(this) instanceof Z)) {
            return;
        }
        t3.b();
        f3003r.set(this, Y.f2992a);
    }

    public final B t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        N n = (N) this.f3004o.e(r.f3022l);
        if (n == null) {
            return null;
        }
        B f3 = AbstractC0303u.f(n, true, new C0292i(this, 0));
        do {
            atomicReferenceFieldUpdater = f3003r;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, f3)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return f3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(x());
        sb.append('(');
        sb.append(AbstractC0303u.k(this.n));
        sb.append("){");
        Object obj = f3002q.get(this);
        sb.append(obj instanceof Z ? "Active" : obj instanceof C0291h ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0303u.c(this));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00aa, code lost:
    
        w(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ad, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(i2.Z r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = i2.C0290g.f3002q
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof i2.C0285b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto La1
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof i2.C
            r3 = 0
            if (r1 != 0) goto Laa
            boolean r1 = r2 instanceof n2.r
            if (r1 != 0) goto Laa
            boolean r1 = r2 instanceof i2.C0298o
            if (r1 == 0) goto L56
            r0 = r2
            i2.o r0 = (i2.C0298o) r0
            r0.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = i2.C0298o.f3016b
            r4 = 0
            r5 = 1
            boolean r1 = r1.compareAndSet(r0, r4, r5)
            if (r1 == 0) goto L52
            boolean r1 = r2 instanceof i2.C0291h
            if (r1 == 0) goto La1
            if (r2 == 0) goto L3d
            goto L3e
        L3d:
            r0 = r3
        L3e:
            if (r0 == 0) goto L42
            java.lang.Throwable r3 = r0.f3017a
        L42:
            boolean r0 = r8 instanceof i2.C
            if (r0 == 0) goto L4c
            i2.C r8 = (i2.C) r8
            r7.i(r8)
            return
        L4c:
            n2.r r8 = (n2.r) r8
            r7.m(r8, r3)
            return
        L52:
            w(r8, r2)
            throw r3
        L56:
            boolean r1 = r2 instanceof i2.C0297n
            if (r1 == 0) goto L8a
            r1 = r2
            i2.n r1 = (i2.C0297n) r1
            i2.C r4 = r1.f3012b
            if (r4 != 0) goto L86
            boolean r4 = r8 instanceof n2.r
            if (r4 == 0) goto L66
            goto La1
        L66:
            r4 = r8
            i2.C r4 = (i2.C) r4
            java.lang.Throwable r5 = r1.f3015e
            if (r5 == 0) goto L71
            r7.i(r4)
            return
        L71:
            r5 = 29
            i2.n r1 = i2.C0297n.a(r1, r4, r3, r5)
        L77:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L7e
            goto La1
        L7e:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L77
            goto L0
        L86:
            w(r8, r2)
            throw r3
        L8a:
            boolean r1 = r8 instanceof n2.r
            if (r1 == 0) goto L8f
            goto La1
        L8f:
            r3 = r8
            i2.C r3 = (i2.C) r3
            i2.n r1 = new i2.n
            r5 = 0
            r6 = 28
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
        L9b:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto La2
        La1:
            return
        La2:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L9b
            goto L0
        Laa:
            w(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.C0290g.u(i2.Z):void");
    }

    public final boolean v() {
        if (this.f3038m != 2) {
            return false;
        }
        R1.c cVar = this.n;
        a2.h.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return n2.f.f4152r.get((n2.f) cVar) != null;
    }

    public String x() {
        return "CancellableContinuation";
    }

    public final void y() {
        R1.c cVar = this.n;
        Throwable th = null;
        n2.f fVar = cVar instanceof n2.f ? (n2.f) cVar : null;
        if (fVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n2.f.f4152r;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                B1.g gVar = n2.a.f4142c;
                if (obj == gVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, gVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != gVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            o();
            n(th);
        }
    }

    public final void z(Object obj, Z1.q qVar) {
        A(obj, this.f3038m, qVar);
    }
}
