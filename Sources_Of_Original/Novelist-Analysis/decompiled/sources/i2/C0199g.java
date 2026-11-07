package i2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: i2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0199g extends AbstractC0217z implements InterfaceC0197e, T1.d, i0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3001p = AtomicIntegerFieldUpdater.newUpdater(C0199g.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3002q = AtomicReferenceFieldUpdater.newUpdater(C0199g.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3003r = AtomicReferenceFieldUpdater.newUpdater(C0199g.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final R1.c n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final R1.h f3004o;

    public C0199g(int i3, R1.c cVar) {
        super(i3);
        this.n = cVar;
        this.f3004o = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0194b.f2994a;
    }

    public static Object B(Z z3, Object obj, int i3, Z1.q qVar) {
        if (obj instanceof C0207o) {
            return obj;
        }
        if (i3 != 1 && i3 != 2) {
            return obj;
        }
        if (qVar != null || (z3 instanceof C)) {
            return new C0206n(obj, z3 instanceof C ? (C) z3 : null, qVar, (CancellationException) null, 16);
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
            if (!(obj2 instanceof Z)) {
                if (obj2 instanceof C0200h) {
                    C0200h c0200h = (C0200h) obj2;
                    c0200h.getClass();
                    if (C0200h.f3006c.compareAndSet(c0200h, 0, 1)) {
                        if (qVar != null) {
                            j(qVar, c0200h.f3017a, obj);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objB = B((Z) obj2, obj, i3, qVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objB)) {
                    if (!v()) {
                        o();
                    }
                    p(i3);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
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

    @Override // i2.AbstractC0217z
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3002q;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof Z) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0207o) {
                return;
            }
            if (!(obj instanceof C0206n)) {
                cancellationException2 = cancellationException;
                C0206n c0206n = new C0206n(obj, (C) null, (Z1.q) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0206n)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C0206n c0206n2 = (C0206n) obj;
            if (c0206n2.f3015e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0206n c0206nA = C0206n.a(c0206n2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0206nA)) {
                    C c3 = c0206n2.f3012b;
                    if (c3 != null) {
                        i(c3);
                    }
                    Z1.q qVar = c0206n2.f3013c;
                    if (qVar != null) {
                        j(qVar, cancellationException, c0206n2.f3011a);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cancellationException2 = cancellationException;
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

    @Override // i2.AbstractC0217z
    public final R1.c d() {
        return this.n;
    }

    @Override // i2.AbstractC0217z
    public final Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // i2.AbstractC0217z
    public final Object f(Object obj) {
        return obj instanceof C0206n ? ((C0206n) obj).f3011a : obj;
    }

    @Override // R1.c
    public final R1.h getContext() {
        return this.f3004o;
    }

    @Override // i2.AbstractC0217z
    public final Object h() {
        return f3002q.get(this);
    }

    public final void i(C c3) {
        try {
            c3.f2965a.b();
        } catch (Throwable th) {
            AbstractC0212u.e(this.f3004o, new D0.a("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    public final void j(Z1.q qVar, Throwable th, Object obj) {
        R1.h hVar = this.f3004o;
        try {
            qVar.d(th, obj, hVar);
        } catch (Throwable th2) {
            AbstractC0212u.e(hVar, new D0.a("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // i2.InterfaceC0197e
    public final B1.g k(Object obj, Z1.q qVar) {
        B1.g gVar = AbstractC0212u.f3026a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3002q;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof Z)) {
                return null;
            }
            Object objB = B((Z) obj2, obj, this.f3038m, qVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objB)) {
                    if (!v()) {
                        o();
                    }
                    return gVar;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // i2.InterfaceC0197e
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
            AbstractC0212u.e(hVar, new D0.a("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3002q;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof Z)) {
                return;
            }
            C0200h c0200h = new C0200h(this, th, (obj instanceof C) || (obj instanceof n2.r));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0200h)) {
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
            } while (atomicReferenceFieldUpdater.get(this) == obj);
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
                        AbstractC0209q abstractC0209q = fVar.n;
                        R1.h context = fVar.f4153o.getContext();
                        if (abstractC0209q.d(context)) {
                            abstractC0209q.c(context, this);
                            return;
                        }
                        G gA = e0.a();
                        if (gA.f2971m >= 4294967296L) {
                            P1.c cVar2 = gA.f2972o;
                            if (cVar2 == null) {
                                cVar2 = new P1.c();
                                gA.f2972o = cVar2;
                            }
                            cVar2.addLast(this);
                            return;
                        }
                        gA.l(true);
                        try {
                            AbstractC0212u.i(this, cVar, true);
                            do {
                            } while (gA.n());
                        } catch (Throwable th) {
                            try {
                                g(th);
                            } finally {
                                gA.h(true);
                            }
                        }
                        return;
                    }
                }
                AbstractC0212u.i(this, cVar, z3);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 1073741824 + (536870911 & i4)));
    }

    public Throwable q(W w3) {
        return w3.w();
    }

    public final Object r() throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        N n;
        boolean zV = v();
        do {
            atomicIntegerFieldUpdater = f3001p;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zV) {
                    y();
                }
                Object obj = f3002q.get(this);
                if (obj instanceof C0207o) {
                    throw ((C0207o) obj).f3017a;
                }
                int i5 = this.f3038m;
                if ((i5 != 1 && i5 != 2) || (n = (N) this.f3004o.e(r.f3022l)) == null || n.a()) {
                    return f(obj);
                }
                CancellationException cancellationExceptionW = ((W) n).w();
                b(cancellationExceptionW);
                throw cancellationExceptionW;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 536870912 + (536870911 & i3)));
        if (((B) f3003r.get(this)) == null) {
            t();
        }
        if (zV) {
            y();
        }
        return S1.a.f1260k;
    }

    @Override // R1.c
    public final void resumeWith(Object obj) {
        Throwable thA = O1.d.a(obj);
        if (thA != null) {
            obj = new C0207o(thA, false);
        }
        A(obj, this.f3038m, null);
    }

    public final void s() {
        B bT = t();
        if (bT == null || (f3002q.get(this) instanceof Z)) {
            return;
        }
        bT.b();
        f3003r.set(this, Y.f2992a);
    }

    public final B t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        N n = (N) this.f3004o.e(r.f3022l);
        if (n == null) {
            return null;
        }
        B bF = AbstractC0212u.f(n, true, new C0201i(this, 0));
        do {
            atomicReferenceFieldUpdater = f3003r;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, bF)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return bF;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(x());
        sb.append('(');
        sb.append(AbstractC0212u.k(this.n));
        sb.append("){");
        Object obj = f3002q.get(this);
        if (obj instanceof Z) {
            str = "Active";
        } else {
            str = obj instanceof C0200h ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC0212u.c(this));
        return sb.toString();
    }

    public final void u(Z z3) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3002q;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0194b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, z3)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if ((obj instanceof C) || (obj instanceof n2.r)) {
                w(z3, obj);
                throw null;
            }
            if (obj instanceof C0207o) {
                C0207o c0207o = (C0207o) obj;
                c0207o.getClass();
                if (!C0207o.f3016b.compareAndSet(c0207o, 0, 1)) {
                    w(z3, obj);
                    throw null;
                }
                if (obj instanceof C0200h) {
                    if (obj == null) {
                        c0207o = null;
                    }
                    Throwable th = c0207o != null ? c0207o.f3017a : null;
                    if (z3 instanceof C) {
                        i((C) z3);
                        return;
                    } else {
                        m((n2.r) z3, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0206n)) {
                if (z3 instanceof n2.r) {
                    return;
                }
                C0206n c0206n = new C0206n(obj, (C) z3, (Z1.q) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0206n)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C0206n c0206n2 = (C0206n) obj;
            if (c0206n2.f3012b != null) {
                w(z3, obj);
                throw null;
            }
            if (z3 instanceof n2.r) {
                return;
            }
            C c3 = (C) z3;
            if (c0206n2.f3015e != null) {
                i(c3);
                return;
            }
            C0206n c0206nA = C0206n.a(c0206n2, c3, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0206nA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
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
                if (obj != gVar) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(fVar, gVar, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(fVar) == gVar);
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
