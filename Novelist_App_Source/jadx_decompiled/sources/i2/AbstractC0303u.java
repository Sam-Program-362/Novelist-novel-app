package i2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: i2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0303u {

    /* renamed from: a, reason: collision with root package name */
    public static final B1.g f3026a;

    /* renamed from: b, reason: collision with root package name */
    public static final B1.g f3027b;

    /* renamed from: c, reason: collision with root package name */
    public static final B1.g f3028c;

    /* renamed from: d, reason: collision with root package name */
    public static final B1.g f3029d;

    /* renamed from: e, reason: collision with root package name */
    public static final B1.g f3030e;

    /* renamed from: f, reason: collision with root package name */
    public static final B1.g f3031f;

    /* renamed from: g, reason: collision with root package name */
    public static final B1.g f3032g;

    /* renamed from: h, reason: collision with root package name */
    public static final D f3033h = new D(false);

    /* renamed from: i, reason: collision with root package name */
    public static final D f3034i = new D(true);

    static {
        int i3 = 18;
        f3026a = new B1.g("RESUME_TOKEN", i3);
        f3027b = new B1.g("CLOSED_EMPTY", i3);
        f3028c = new B1.g("COMPLETING_ALREADY", i3);
        f3029d = new B1.g("COMPLETING_WAITING_CHILDREN", i3);
        f3030e = new B1.g("COMPLETING_RETRY", i3);
        f3031f = new B1.g("TOO_LATE_TO_CANCEL", i3);
        f3032g = new B1.g("SEALED", i3);
    }

    public static final n2.c a(R1.h hVar) {
        if (hVar.e(r.f3022l) == null) {
            hVar = hVar.i(new P());
        }
        return new n2.c(hVar);
    }

    public static final R1.h b(R1.h hVar, R1.h hVar2, boolean z3) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) hVar.f(bool, new N.d(7))).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.f(bool, new N.d(7))).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.i(hVar2);
        }
        N.d dVar = new N.d(5);
        R1.i iVar = R1.i.f1255k;
        R1.h hVar3 = (R1.h) hVar.f(iVar, dVar);
        Object obj = hVar2;
        if (booleanValue2) {
            obj = hVar2.f(iVar, new N.d(6));
        }
        return hVar3.i((R1.h) obj);
    }

    public static final String c(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0290g d(R1.c cVar) {
        C0290g c0290g;
        C0290g c0290g2;
        if (!(cVar instanceof n2.f)) {
            return new C0290g(1, cVar);
        }
        n2.f fVar = (n2.f) cVar;
        B1.g gVar = n2.a.f4142c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n2.f.f4152r;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            c0290g = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, gVar);
                c0290g2 = null;
                break;
            }
            if (obj instanceof C0290g) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, gVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                c0290g2 = (C0290g) obj;
                break loop0;
            }
            if (obj != gVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0290g2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0290g.f3002q;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0290g2);
            if (!(obj2 instanceof C0297n) || ((C0297n) obj2).f3014d == null) {
                C0290g.f3001p.set(c0290g2, 536870911);
                atomicReferenceFieldUpdater2.set(c0290g2, C0285b.f2994a);
                c0290g = c0290g2;
            } else {
                c0290g2.o();
            }
            if (c0290g != null) {
                return c0290g;
            }
        }
        return new C0290g(2, cVar);
    }

    public static final void e(R1.h hVar, Throwable th) {
        try {
            j2.b bVar = (j2.b) hVar.e(r.f3021k);
            if (bVar != null) {
                bVar.c(th);
            } else {
                n2.a.d(hVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                E2.a.b(runtimeException, th);
                th = runtimeException;
            }
            n2.a.d(hVar, th);
        }
    }

    public static final B f(N n, boolean z3, S s3) {
        if (n instanceof W) {
            return ((W) n).D(z3, s3);
        }
        boolean k3 = s3.k();
        Q q3 = new Q(1, s3, S.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0);
        return ((W) n).D(z3, k3 ? new M(q3) : new C0292i(q3, 1));
    }

    public static b0 g(InterfaceC0301s interfaceC0301s, Z1.p pVar) {
        R1.h b3 = b(interfaceC0301s.d(), R1.i.f1255k, true);
        p2.e eVar = A.f2964a;
        if (b3 != eVar && b3.e(R1.d.f1254k) == null) {
            b3 = b3.i(eVar);
        }
        b0 b0Var = new b0(b3, true);
        b0Var.T(EnumC0302t.f3023k, b0Var, pVar);
        return b0Var;
    }

    public static final Object h(Object obj) {
        return obj instanceof C0298o ? H2.h.i(((C0298o) obj).f3017a) : obj;
    }

    public static final void i(C0290g c0290g, R1.c cVar, boolean z3) {
        Object obj = C0290g.f3002q.get(c0290g);
        Throwable e3 = c0290g.e(obj);
        Object i3 = e3 != null ? H2.h.i(e3) : c0290g.f(obj);
        if (!z3) {
            cVar.resumeWith(i3);
            return;
        }
        a2.h.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        n2.f fVar = (n2.f) cVar;
        T1.c cVar2 = fVar.f4153o;
        Object obj2 = fVar.f4155q;
        R1.h context = cVar2.getContext();
        Object l3 = n2.a.l(context, obj2);
        g0 m3 = l3 != n2.a.f4143d ? m(cVar2, context, l3) : null;
        try {
            cVar2.resumeWith(i3);
            if (m3 == null || m3.U()) {
                n2.a.g(context, l3);
            }
        } catch (Throwable th) {
            if (m3 == null || m3.U()) {
                n2.a.g(context, l3);
            }
            throw th;
        }
    }

    public static Object j(Z1.p pVar) {
        Thread currentThread = Thread.currentThread();
        G a3 = e0.a();
        R1.h b3 = b(R1.i.f1255k, a3, true);
        p2.e eVar = A.f2964a;
        if (b3 != eVar && b3.e(R1.d.f1254k) == null) {
            b3 = b3.i(eVar);
        }
        C0286c c0286c = new C0286c(b3, currentThread, a3);
        c0286c.T(EnumC0302t.f3023k, c0286c, pVar);
        G g3 = c0286c.f2995o;
        if (g3 != null) {
            int i3 = G.f2970p;
            g3.l(false);
        }
        while (!Thread.interrupted()) {
            try {
                long m3 = g3 != null ? g3.m() : Long.MAX_VALUE;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = W.f2990k;
                if (!(atomicReferenceFieldUpdater.get(c0286c) instanceof K)) {
                    if (g3 != null) {
                        int i4 = G.f2970p;
                        g3.h(false);
                    }
                    Object l3 = l(atomicReferenceFieldUpdater.get(c0286c));
                    C0298o c0298o = l3 instanceof C0298o ? (C0298o) l3 : null;
                    if (c0298o == null) {
                        return l3;
                    }
                    throw c0298o.f3017a;
                }
                LockSupport.parkNanos(c0286c, m3);
            } catch (Throwable th) {
                if (g3 != null) {
                    int i5 = G.f2970p;
                    g3.h(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0286c.o(interruptedException);
        throw interruptedException;
    }

    public static final String k(R1.c cVar) {
        Object i3;
        if (cVar instanceof n2.f) {
            return ((n2.f) cVar).toString();
        }
        try {
            i3 = cVar + '@' + c(cVar);
        } catch (Throwable th) {
            i3 = H2.h.i(th);
        }
        if (O1.d.a(i3) != null) {
            i3 = cVar.getClass().getName() + '@' + c(cVar);
        }
        return (String) i3;
    }

    public static final Object l(Object obj) {
        K k3;
        L l3 = obj instanceof L ? (L) obj : null;
        return (l3 == null || (k3 = l3.f2975a) == null) ? obj : k3;
    }

    public static final g0 m(R1.c cVar, R1.h hVar, Object obj) {
        g0 g0Var = null;
        if ((cVar instanceof T1.d) && hVar.e(h0.f3007k) != null) {
            T1.d dVar = (T1.d) cVar;
            while (true) {
                if ((dVar instanceof C0307y) || (dVar = dVar.c()) == null) {
                    break;
                }
                if (dVar instanceof g0) {
                    g0Var = (g0) dVar;
                    break;
                }
            }
            if (g0Var != null) {
                g0Var.V(hVar, obj);
            }
        }
        return g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object n(R1.h hVar, Z1.p pVar, T1.h hVar2) {
        R1.h hVar3 = hVar2.f1277l;
        a2.h.b(hVar3);
        R1.h i3 = !((Boolean) hVar.f(Boolean.FALSE, new N.d(7))).booleanValue() ? hVar3.i(hVar) : b(hVar3, hVar, false);
        N n = (N) i3.e(r.f3022l);
        if (n != null && !n.a()) {
            throw ((W) n).w();
        }
        if (i3 == hVar3) {
            n2.q qVar = new n2.q(hVar2, i3);
            return H2.h.C(qVar, qVar, pVar);
        }
        R1.d dVar = R1.d.f1254k;
        if (a2.h.a(i3.e(dVar), hVar3.e(dVar))) {
            g0 g0Var = new g0(i3, hVar2);
            R1.h hVar4 = g0Var.f2993m;
            Object l3 = n2.a.l(hVar4, null);
            try {
                return H2.h.C(g0Var, g0Var, pVar);
            } finally {
                n2.a.g(hVar4, l3);
            }
        }
        C0307y c0307y = new C0307y(hVar2, i3);
        try {
            n2.a.h(H2.h.s(((T1.a) pVar).i(c0307y, c0307y)), O1.g.f1211a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0307y.f3037o;
            do {
                int i4 = atomicIntegerFieldUpdater.get(c0307y);
                if (i4 != 0) {
                    if (i4 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object l4 = l(W.f2990k.get(c0307y));
                    if (l4 instanceof C0298o) {
                        throw ((C0298o) l4).f3017a;
                    }
                    return l4;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c0307y, 0, 1));
            return S1.a.f1260k;
        } catch (Throwable th) {
            c0307y.resumeWith(H2.h.i(th));
            throw th;
        }
    }
}
