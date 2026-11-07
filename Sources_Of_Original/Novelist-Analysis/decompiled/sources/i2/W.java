package i2;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class W implements N, a0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2990k = AtomicReferenceFieldUpdater.newUpdater(W.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2991l = AtomicReferenceFieldUpdater.newUpdater(W.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public W(boolean z3) {
        this._state$volatile = z3 ? AbstractC0212u.f3034i : AbstractC0212u.f3033h;
    }

    public static C0203k H(n2.j jVar) {
        while (jVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n2.j.f4162b;
            n2.j jVarF = jVar.f();
            if (jVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (n2.j) obj;
                    if (!jVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = jVarF;
            }
        }
        while (true) {
            jVar = jVar.h();
            if (!jVar.i()) {
                if (jVar instanceof C0203k) {
                    return (C0203k) jVar;
                }
                if (jVar instanceof X) {
                    return null;
                }
            }
        }
    }

    public static String O(Object obj) {
        if (!(obj instanceof V)) {
            if (obj instanceof K) {
                return ((K) obj).a() ? "Active" : "New";
            }
            return obj instanceof C0207o ? "Cancelled" : "Completed";
        }
        V v3 = (V) obj;
        if (v3.e()) {
            return "Cancelling";
        }
        return V.f2986b.get(v3) != 0 ? "Completing" : "Active";
    }

    public boolean A(Throwable th) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [i2.S, i2.k, java.lang.Object, n2.j] */
    /* JADX WARN: Type inference failed for: r3v3, types: [i2.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v8, types: [i2.X, n2.j] */
    public final void C(N n) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        int iN;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2991l;
        Y y = Y.f2992a;
        if (n == null) {
            atomicReferenceFieldUpdater2.set(this, y);
            return;
        }
        W w3 = (W) n;
        do {
            atomicReferenceFieldUpdater = f2990k;
            iN = w3.N(atomicReferenceFieldUpdater.get(w3));
            if (iN == 0) {
                break;
            }
        } while (iN != 1);
        ?? c0203k = new C0203k(this);
        c0203k.f2980d = w3;
        loop1: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(w3);
            if (!(obj instanceof D)) {
                Throwable thC = null;
                if (obj instanceof K) {
                    ?? D2 = ((K) obj).d();
                    if (D2 != 0) {
                        if (!D2.e(c0203k, 7)) {
                            boolean zE = D2.e(c0203k, 3);
                            Object obj2 = atomicReferenceFieldUpdater.get(w3);
                            if (obj2 instanceof V) {
                                thC = ((V) obj2).c();
                            } else {
                                C0207o c0207o = obj2 instanceof C0207o ? (C0207o) obj2 : null;
                                if (c0207o != null) {
                                    thC = c0207o.f3017a;
                                }
                            }
                            c0203k.l(thC);
                            if (!zE) {
                                break;
                            } else {
                                break;
                            }
                        }
                        break;
                    }
                    a2.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    w3.M((S) obj);
                } else {
                    Object obj3 = atomicReferenceFieldUpdater.get(w3);
                    C0207o c0207o2 = obj3 instanceof C0207o ? (C0207o) obj3 : null;
                    c0203k.l(c0207o2 != null ? c0207o2.f3017a : null);
                }
                c0203k = y;
                break;
            }
            D d3 = (D) obj;
            if (d3.f2966a) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(w3, obj, c0203k)) {
                        break loop1;
                    }
                } while (atomicReferenceFieldUpdater.get(w3) == obj);
            } else {
                w3.L(d3);
            }
        }
        atomicReferenceFieldUpdater2.set(this, c0203k);
        if (atomicReferenceFieldUpdater.get(this) instanceof K) {
            return;
        }
        c0203k.b();
        atomicReferenceFieldUpdater2.set(this, y);
    }

    public final B D(boolean z3, S s3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z4;
        boolean zE;
        s3.f2980d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f2990k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z5 = obj instanceof D;
            Y y = Y.f2992a;
            z4 = true;
            if (!z5) {
                if (!(obj instanceof K)) {
                    z4 = false;
                    break;
                }
                K k3 = (K) obj;
                X xD = k3.d();
                if (xD == null) {
                    a2.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    M((S) obj);
                } else {
                    if (s3.k()) {
                        V v3 = k3 instanceof V ? (V) k3 : null;
                        Throwable thC = v3 != null ? v3.c() : null;
                        if (thC == null) {
                            zE = xD.e(s3, 5);
                        } else if (z3) {
                            s3.l(thC);
                            return y;
                        }
                    } else {
                        zE = xD.e(s3, 1);
                    }
                    if (zE) {
                        break;
                    }
                }
            } else {
                D d3 = (D) obj;
                if (d3.f2966a) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, s3)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    L(d3);
                }
            }
            return y;
        }
        if (z4) {
            return s3;
        }
        if (z3) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0207o c0207o = obj2 instanceof C0207o ? (C0207o) obj2 : null;
            s3.l(c0207o != null ? c0207o.f3017a : null);
        }
        return y;
    }

    public boolean E() {
        return this instanceof C0195c;
    }

    public final boolean F(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objP;
        do {
            objP = P(f2990k.get(this), obj);
            if (objP == AbstractC0212u.f3028c) {
                return false;
            }
            if (objP == AbstractC0212u.f3029d) {
                return true;
            }
        } while (objP == AbstractC0212u.f3030e);
        m(objP);
        return true;
    }

    public final Object G(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objP;
        do {
            objP = P(f2990k.get(this), obj);
            if (objP == AbstractC0212u.f3028c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0207o c0207o = obj instanceof C0207o ? (C0207o) obj : null;
                throw new IllegalStateException(str, c0207o != null ? c0207o.f3017a : null);
            }
        } while (objP == AbstractC0212u.f3030e);
        return objP;
    }

    public final void I(X x, Throwable th) throws IllegalAccessException, InvocationTargetException {
        x.e(new n2.h(4), 4);
        Object obj = n2.j.f4161a.get(x);
        a2.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        D0.a aVar = null;
        for (n2.j jVarH = (n2.j) obj; !jVarH.equals(x); jVarH = jVarH.h()) {
            if ((jVarH instanceof S) && ((S) jVarH).k()) {
                try {
                    ((S) jVarH).l(th);
                } catch (Throwable th2) {
                    if (aVar != null) {
                        E2.a.b(aVar, th2);
                    } else {
                        aVar = new D0.a("Exception in completion handler " + jVarH + " for " + this, th2);
                    }
                }
            }
        }
        if (aVar != null) {
            B(aVar);
        }
        q(th);
    }

    public final void L(D d3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        X x = new X();
        Object j3 = x;
        if (!d3.f2966a) {
            j3 = new J(x);
        }
        do {
            atomicReferenceFieldUpdater = f2990k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, d3, j3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == d3);
    }

    public final void M(S s3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        X x = new X();
        s3.getClass();
        n2.j.f4162b.set(x, s3);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = n2.j.f4161a;
        atomicReferenceFieldUpdater2.set(x, s3);
        loop0: while (atomicReferenceFieldUpdater2.get(s3) == s3) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(s3, s3, x)) {
                    x.g(s3);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(s3) == s3);
        }
        n2.j jVarH = s3.h();
        do {
            atomicReferenceFieldUpdater = f2990k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, s3, jVarH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == s3);
    }

    public final int N(Object obj) {
        boolean z3 = obj instanceof D;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2990k;
        if (z3) {
            if (((D) obj).f2966a) {
                return 0;
            }
            D d3 = AbstractC0212u.f3034i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, d3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof J)) {
            return 0;
        }
        X x = ((J) obj).f2974a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object P(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        if (!(obj instanceof K)) {
            return AbstractC0212u.f3028c;
        }
        if (((obj instanceof D) || (obj instanceof S)) && !(obj instanceof C0203k) && !(obj2 instanceof C0207o)) {
            K k3 = (K) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2990k;
            Object l3 = obj2 instanceof K ? new L((K) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, k3, l3)) {
                if (atomicReferenceFieldUpdater.get(this) != k3) {
                    return AbstractC0212u.f3030e;
                }
            }
            J(obj2);
            t(k3, obj2);
            return obj2;
        }
        K k4 = (K) obj;
        X xZ = z(k4);
        if (xZ == null) {
            return AbstractC0212u.f3030e;
        }
        V v3 = k4 instanceof V ? (V) k4 : null;
        if (v3 == null) {
            v3 = new V(xZ, null);
        }
        synchronized (v3) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = V.f2986b;
            if (atomicIntegerFieldUpdater.get(v3) != 0) {
                return AbstractC0212u.f3028c;
            }
            atomicIntegerFieldUpdater.set(v3, 1);
            if (v3 != k4) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2990k;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, k4, v3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != k4) {
                        return AbstractC0212u.f3030e;
                    }
                }
            }
            boolean zE = v3.e();
            C0207o c0207o = obj2 instanceof C0207o ? (C0207o) obj2 : null;
            if (c0207o != null) {
                v3.b(c0207o.f3017a);
            }
            Throwable thC = zE ? null : v3.c();
            if (thC != null) {
                I(xZ, thC);
            }
            C0203k c0203kH = H(xZ);
            if (c0203kH != null && Q(v3, c0203kH, obj2)) {
                return AbstractC0212u.f3029d;
            }
            xZ.e(new n2.h(2), 2);
            C0203k c0203kH2 = H(xZ);
            return (c0203kH2 == null || !Q(v3, c0203kH2, obj2)) ? v(v3, obj2) : AbstractC0212u.f3029d;
        }
    }

    public final boolean Q(V v3, C0203k c0203k, Object obj) {
        while (AbstractC0212u.f(c0203k.f3010e, false, new U(this, v3, c0203k, obj)) == Y.f2992a) {
            c0203k = H(c0203k);
            if (c0203k == null) {
                return false;
            }
        }
        return true;
    }

    @Override // i2.N
    public boolean a() {
        Object obj = f2990k.get(this);
        return (obj instanceof K) && ((K) obj).a();
    }

    @Override // i2.N
    public void b(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        if (cancellationException == null) {
            cancellationException = new O(r(), null, this);
        }
        p(cancellationException);
    }

    @Override // R1.h
    public final R1.f e(R1.g gVar) {
        return E2.a.s(this, gVar);
    }

    @Override // R1.h
    public final Object f(Object obj, Z1.p pVar) {
        return pVar.e(obj, this);
    }

    @Override // R1.f
    public final R1.g getKey() {
        return r.f3022l;
    }

    @Override // R1.h
    public final R1.h i(R1.h hVar) {
        a2.h.e(hVar, "context");
        return hVar == R1.i.f1255k ? this : (R1.h) hVar.f(this, new N.d(4));
    }

    @Override // R1.h
    public final R1.h j(R1.g gVar) {
        return E2.a.D(this, gVar);
    }

    public void n(Object obj) {
        m(obj);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[PHI: r0
      0x0041: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x0052, B:29:0x0067, B:34:0x006f, B:36:0x0078, B:37:0x007c), top: B:81:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006f A[Catch: all -> 0x006d, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x0052, B:29:0x0067, B:34:0x006f, B:36:0x0078, B:37:0x007c), top: B:81:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0078 A[Catch: all -> 0x006d, TryCatch #0 {, blocks: (B:24:0x0052, B:29:0x0067, B:34:0x006f, B:36:0x0078, B:37:0x007c), top: B:81:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x010c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:2: B:56:0x00ba->B:98:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0045, please report this as an issue */
    public final boolean o(Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thU;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        V v3;
        boolean z3;
        Throwable thC;
        B1.g gVar;
        K k3;
        X xZ;
        V v4;
        Object objP;
        Object objP2 = AbstractC0212u.f3028c;
        if (y()) {
            do {
                Object obj3 = f2990k.get(this);
                if (obj3 instanceof K) {
                    if (obj3 instanceof V) {
                        V v5 = (V) obj3;
                        v5.getClass();
                        if (V.f2986b.get(v5) != 0) {
                        }
                    }
                    objP2 = P(obj3, new C0207o(u(obj), false));
                }
                objP2 = AbstractC0212u.f3028c;
                break;
            } while (objP2 == AbstractC0212u.f3030e);
            if (objP2 != AbstractC0212u.f3029d) {
                if (objP2 == AbstractC0212u.f3028c) {
                    thU = null;
                    loop1: while (true) {
                        atomicReferenceFieldUpdater = f2990k;
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof V) {
                            synchronized (obj2) {
                                v3 = (V) obj2;
                                v3.getClass();
                                if (V.f2988d.get(v3) == AbstractC0212u.f3032g) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    gVar = AbstractC0212u.f3031f;
                                } else {
                                    boolean zE = ((V) obj2).e();
                                    if (thU == null) {
                                        thU = u(obj);
                                    }
                                    ((V) obj2).b(thU);
                                    thC = zE ? null : ((V) obj2).c();
                                    if (thC != null) {
                                        I(((V) obj2).f2989a, thC);
                                    }
                                    gVar = AbstractC0212u.f3028c;
                                }
                            }
                        } else if (obj2 instanceof K) {
                            if (thU == null) {
                                thU = u(obj);
                            }
                            k3 = (K) obj2;
                            if (k3.a()) {
                                xZ = z(k3);
                                if (xZ == null) {
                                    continue;
                                } else {
                                    v4 = new V(xZ, thU);
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, k3, v4)) {
                                            I(xZ, thU);
                                            gVar = AbstractC0212u.f3028c;
                                        } else if (atomicReferenceFieldUpdater.get(this) != k3) {
                                        }
                                    }
                                }
                            } else {
                                objP = P(obj2, new C0207o(thU, false));
                                if (objP != AbstractC0212u.f3028c) {
                                    throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                                }
                                if (objP != AbstractC0212u.f3030e) {
                                    objP2 = objP;
                                    break;
                                }
                            }
                        } else {
                            gVar = AbstractC0212u.f3031f;
                        }
                        objP2 = gVar;
                        break;
                    }
                }
                if (objP2 != AbstractC0212u.f3028c && objP2 != AbstractC0212u.f3029d) {
                    if (objP2 == AbstractC0212u.f3031f) {
                        return false;
                    }
                    m(objP2);
                    return true;
                }
            }
        } else {
            if (objP2 == AbstractC0212u.f3028c) {
                thU = null;
                loop1: while (true) {
                    atomicReferenceFieldUpdater = f2990k;
                    obj2 = atomicReferenceFieldUpdater.get(this);
                    if (obj2 instanceof V) {
                        synchronized (obj2) {
                            v3 = (V) obj2;
                            v3.getClass();
                            if (V.f2988d.get(v3) == AbstractC0212u.f3032g) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                gVar = AbstractC0212u.f3031f;
                            } else {
                                boolean zE2 = ((V) obj2).e();
                                if (thU == null) {
                                    thU = u(obj);
                                }
                                ((V) obj2).b(thU);
                                if (zE2) {
                                }
                                if (thC != null) {
                                    I(((V) obj2).f2989a, thC);
                                }
                                gVar = AbstractC0212u.f3028c;
                            }
                        }
                    } else if (obj2 instanceof K) {
                        if (thU == null) {
                            thU = u(obj);
                        }
                        k3 = (K) obj2;
                        if (k3.a()) {
                            xZ = z(k3);
                            if (xZ == null) {
                                continue;
                            } else {
                                v4 = new V(xZ, thU);
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, k3, v4)) {
                                        I(xZ, thU);
                                        gVar = AbstractC0212u.f3028c;
                                    } else if (atomicReferenceFieldUpdater.get(this) != k3) {
                                    }
                                }
                            }
                        } else {
                            objP = P(obj2, new C0207o(thU, false));
                            if (objP != AbstractC0212u.f3028c) {
                                throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                            }
                            if (objP != AbstractC0212u.f3030e) {
                                objP2 = objP;
                                break;
                            }
                        }
                    } else {
                        gVar = AbstractC0212u.f3031f;
                    }
                    objP2 = gVar;
                    break;
                }
            }
            if (objP2 != AbstractC0212u.f3028c) {
                if (objP2 == AbstractC0212u.f3031f) {
                    return false;
                }
                m(objP2);
                return true;
            }
        }
        return true;
    }

    public void p(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        o(cancellationException);
    }

    public final boolean q(Throwable th) {
        if (E()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        InterfaceC0202j interfaceC0202j = (InterfaceC0202j) f2991l.get(this);
        if (interfaceC0202j == null || interfaceC0202j == Y.f2992a) {
            return z3;
        }
        return interfaceC0202j.c(th) || z3;
    }

    public String r() {
        return "Job was cancelled";
    }

    public boolean s(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return o(th) && x();
    }

    public final void t(K k3, Object obj) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2991l;
        InterfaceC0202j interfaceC0202j = (InterfaceC0202j) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0202j != null) {
            interfaceC0202j.b();
            atomicReferenceFieldUpdater.set(this, Y.f2992a);
        }
        D0.a aVar = null;
        C0207o c0207o = obj instanceof C0207o ? (C0207o) obj : null;
        Throwable th = c0207o != null ? c0207o.f3017a : null;
        if (k3 instanceof S) {
            try {
                ((S) k3).l(th);
                return;
            } catch (Throwable th2) {
                B(new D0.a("Exception in completion handler " + k3 + " for " + this, th2));
                return;
            }
        }
        X xD = k3.d();
        if (xD != null) {
            xD.e(new n2.h(1), 1);
            Object obj2 = n2.j.f4161a.get(xD);
            a2.h.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (n2.j jVarH = (n2.j) obj2; !jVarH.equals(xD); jVarH = jVarH.h()) {
                if (jVarH instanceof S) {
                    try {
                        ((S) jVarH).l(th);
                    } catch (Throwable th3) {
                        if (aVar != null) {
                            E2.a.b(aVar, th3);
                        } else {
                            aVar = new D0.a("Exception in completion handler " + jVarH + " for " + this, th3);
                        }
                    }
                }
            }
            if (aVar != null) {
                B(aVar);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + O(f2990k.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC0212u.c(this));
        return sb.toString();
    }

    public final Throwable u(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        W w3 = (W) ((a0) obj);
        Object obj2 = f2990k.get(w3);
        if (obj2 instanceof V) {
            thC = ((V) obj2).c();
        } else if (obj2 instanceof C0207o) {
            thC = ((C0207o) obj2).f3017a;
        } else {
            if (obj2 instanceof K) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new O("Parent job is ".concat(O(obj2)), thC, w3) : cancellationException;
    }

    public final Object v(V v3, Object obj) throws IllegalAccessException, InvocationTargetException {
        Object obj2 = null;
        Throwable o2 = null;
        C0207o c0207o = obj instanceof C0207o ? (C0207o) obj : null;
        Throwable th = c0207o != null ? c0207o.f3017a : null;
        synchronized (v3) {
            v3.e();
            ArrayList arrayListF = v3.f(th);
            if (!arrayListF.isEmpty()) {
                int size = arrayListF.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj3 = arrayListF.get(i3);
                    i3++;
                    if (!(((Throwable) obj3) instanceof CancellationException)) {
                        obj2 = obj3;
                        break;
                    }
                }
                o2 = (Throwable) obj2;
                if (o2 == null) {
                    o2 = (Throwable) arrayListF.get(0);
                }
            } else if (v3.e()) {
                o2 = new O(r(), null, this);
            }
            if (o2 != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                int size2 = arrayListF.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj4 = arrayListF.get(i4);
                    i4++;
                    Throwable th2 = (Throwable) obj4;
                    if (th2 != o2 && th2 != o2 && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        E2.a.b(o2, th2);
                    }
                }
            }
        }
        if (o2 != null && o2 != th) {
            obj = new C0207o(o2, false);
        }
        if (o2 != null && (q(o2) || A(o2))) {
            a2.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0207o.f3016b.compareAndSet((C0207o) obj, 0, 1);
        }
        J(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2990k;
        Object l3 = obj instanceof K ? new L((K) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, v3, l3) && atomicReferenceFieldUpdater.get(this) == v3) {
        }
        t(v3, obj);
        return obj;
    }

    public final CancellationException w() {
        CancellationException cancellationException;
        Object obj = f2990k.get(this);
        if (!(obj instanceof V)) {
            if (obj instanceof K) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C0207o)) {
                return new O(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0207o) obj).f3017a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new O(r(), th, this) : cancellationException;
        }
        Throwable thC = ((V) obj).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = r();
        }
        return new O(strConcat, thC, this);
    }

    public boolean x() {
        return true;
    }

    public boolean y() {
        return this instanceof C0205m;
    }

    public final X z(K k3) {
        X xD = k3.d();
        if (xD != null) {
            return xD;
        }
        if (k3 instanceof D) {
            return new X();
        }
        if (k3 instanceof S) {
            M((S) k3);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + k3).toString());
    }

    public void K() {
    }

    public void B(D0.a aVar) {
        throw aVar;
    }

    public void J(Object obj) {
    }

    public void m(Object obj) {
    }
}
