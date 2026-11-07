package i2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: i2.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0212u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B1.g f3026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B1.g f3027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B1.g f3028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B1.g f3029d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B1.g f3030e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final B1.g f3031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final B1.g f3032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final D f3033h = new D(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
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
        boolean zBooleanValue = ((Boolean) hVar.f(bool, new N.d(7))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) hVar2.f(bool, new N.d(7))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return hVar.i(hVar2);
        }
        N.d dVar = new N.d(5);
        R1.i iVar = R1.i.f1255k;
        R1.h hVar3 = (R1.h) hVar.f(iVar, dVar);
        Object objF = hVar2;
        if (zBooleanValue2) {
            objF = hVar2.f(iVar, new N.d(6));
        }
        return hVar3.i((R1.h) objF);
    }

    public static final String c(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0199g d(R1.c cVar) {
        C0199g c0199g;
        C0199g c0199g2;
        if (!(cVar instanceof n2.f)) {
            return new C0199g(1, cVar);
        }
        n2.f fVar = (n2.f) cVar;
        B1.g gVar = n2.a.f4142c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n2.f.f4152r;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            c0199g = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, gVar);
                c0199g2 = null;
                break;
            }
            if (obj instanceof C0199g) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(fVar, obj, gVar)) {
                        c0199g2 = (C0199g) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(fVar) == obj);
            } else if (obj != gVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0199g2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0199g.f3002q;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0199g2);
            if (!(obj2 instanceof C0206n) || ((C0206n) obj2).f3014d == null) {
                C0199g.f3001p.set(c0199g2, 536870911);
                atomicReferenceFieldUpdater2.set(c0199g2, C0194b.f2994a);
                c0199g = c0199g2;
            } else {
                c0199g2.o();
            }
            if (c0199g != null) {
                return c0199g;
            }
        }
        return new C0199g(2, cVar);
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
        boolean zK = s3.k();
        Q q3 = new Q(1, s3, S.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0);
        return ((W) n).D(z3, zK ? new M(q3) : new C0201i(q3, 1));
    }

    public static b0 g(InterfaceC0210s interfaceC0210s, Z1.p pVar) {
        R1.h hVarB = b(interfaceC0210s.d(), R1.i.f1255k, true);
        p2.e eVar = A.f2964a;
        if (hVarB != eVar && hVarB.e(R1.d.f1254k) == null) {
            hVarB = hVarB.i(eVar);
        }
        b0 b0Var = new b0(hVarB, true);
        b0Var.T(EnumC0211t.f3023k, b0Var, pVar);
        return b0Var;
    }

    public static final Object h(Object obj) {
        return obj instanceof C0207o ? H2.h.i(((C0207o) obj).f3017a) : obj;
    }

    public static final void i(C0199g c0199g, R1.c cVar, boolean z3) {
        Object obj = C0199g.f3002q.get(c0199g);
        Throwable thE = c0199g.e(obj);
        Object objI = thE != null ? H2.h.i(thE) : c0199g.f(obj);
        if (!z3) {
            cVar.resumeWith(objI);
            return;
        }
        a2.h.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        n2.f fVar = (n2.f) cVar;
        T1.c cVar2 = fVar.f4153o;
        Object obj2 = fVar.f4155q;
        R1.h context = cVar2.getContext();
        Object objL = n2.a.l(context, obj2);
        g0 g0VarM = objL != n2.a.f4143d ? m(cVar2, context, objL) : null;
        try {
            cVar2.resumeWith(objI);
        } finally {
            if (g0VarM == null || g0VarM.U()) {
                n2.a.g(context, objL);
            }
        }
    }

    public static Object j(Z1.p pVar) throws Throwable {
        Thread threadCurrentThread = Thread.currentThread();
        G gA = e0.a();
        R1.h hVarB = b(R1.i.f1255k, gA, true);
        p2.e eVar = A.f2964a;
        if (hVarB != eVar && hVarB.e(R1.d.f1254k) == null) {
            hVarB = hVarB.i(eVar);
        }
        C0195c c0195c = new C0195c(hVarB, threadCurrentThread, gA);
        c0195c.T(EnumC0211t.f3023k, c0195c, pVar);
        G g3 = c0195c.f2995o;
        if (g3 != null) {
            int i3 = G.f2970p;
            g3.l(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jM = g3 != null ? g3.m() : Long.MAX_VALUE;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = W.f2990k;
                if (!(atomicReferenceFieldUpdater.get(c0195c) instanceof K)) {
                    if (g3 != null) {
                        int i4 = G.f2970p;
                        g3.h(false);
                    }
                    Object objL = l(atomicReferenceFieldUpdater.get(c0195c));
                    C0207o c0207o = objL instanceof C0207o ? (C0207o) objL : null;
                    if (c0207o == null) {
                        return objL;
                    }
                    throw c0207o.f3017a;
                }
                LockSupport.parkNanos(c0195c, jM);
            } catch (Throwable th) {
                if (g3 != null) {
                    int i5 = G.f2970p;
                    g3.h(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0195c.o(interruptedException);
        throw interruptedException;
    }

    public static final String k(R1.c cVar) {
        Object objI;
        if (cVar instanceof n2.f) {
            return ((n2.f) cVar).toString();
        }
        try {
            objI = cVar + '@' + c(cVar);
        } catch (Throwable th) {
            objI = H2.h.i(th);
        }
        if (O1.d.a(objI) != null) {
            objI = cVar.getClass().getName() + '@' + c(cVar);
        }
        return (String) objI;
    }

    public static final Object l(Object obj) {
        K k3;
        L l3 = obj instanceof L ? (L) obj : null;
        return (l3 == null || (k3 = l3.f2975a) == null) ? obj : k3;
    }

    public static final g0 m(R1.c cVar, R1.h hVar, Object obj) {
        g0 g0Var = null;
        if ((cVar instanceof T1.d) && hVar.e(h0.f3007k) != null) {
            T1.d dVarC = (T1.d) cVar;
            while (!(dVarC instanceof C0216y) && (dVarC = dVarC.c()) != null) {
                if (dVarC instanceof g0) {
                    g0Var = (g0) dVarC;
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
    public static final Object n(R1.h hVar, Z1.p pVar, T1.h hVar2) throws Throwable {
        R1.h hVar3 = hVar2.f1277l;
        a2.h.b(hVar3);
        R1.h hVarI = !((Boolean) hVar.f(Boolean.FALSE, new N.d(7))).booleanValue() ? hVar3.i(hVar) : b(hVar3, hVar, false);
        N n = (N) hVarI.e(r.f3022l);
        if (n != null && !n.a()) {
            throw ((W) n).w();
        }
        if (hVarI == hVar3) {
            n2.q qVar = new n2.q(hVar2, hVarI);
            return H2.h.C(qVar, qVar, pVar);
        }
        R1.d dVar = R1.d.f1254k;
        if (a2.h.a(hVarI.e(dVar), hVar3.e(dVar))) {
            g0 g0Var = new g0(hVarI, hVar2);
            R1.h hVar4 = g0Var.f2993m;
            Object objL = n2.a.l(hVar4, null);
            try {
                return H2.h.C(g0Var, g0Var, pVar);
            } finally {
                n2.a.g(hVar4, objL);
            }
        }
        C0216y c0216y = new C0216y(hVar2, hVarI);
        try {
            n2.a.h(H2.h.s(((T1.a) pVar).i(c0216y, c0216y)), O1.g.f1211a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0216y.f3037o;
            do {
                int i3 = atomicIntegerFieldUpdater.get(c0216y);
                if (i3 != 0) {
                    if (i3 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object objL2 = l(W.f2990k.get(c0216y));
                    if (objL2 instanceof C0207o) {
                        throw ((C0207o) objL2).f3017a;
                    }
                    return objL2;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c0216y, 0, 1));
            return S1.a.f1260k;
        } catch (Throwable th) {
            c0216y.resumeWith(H2.h.i(th));
            throw th;
        }
    }
}
