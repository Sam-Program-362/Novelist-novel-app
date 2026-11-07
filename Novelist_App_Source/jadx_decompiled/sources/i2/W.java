package i2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class W implements N, a0 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2990k = AtomicReferenceFieldUpdater.newUpdater(W.class, Object.class, "_state$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2991l = AtomicReferenceFieldUpdater.newUpdater(W.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public W(boolean z3) {
        this._state$volatile = z3 ? AbstractC0303u.f3034i : AbstractC0303u.f3033h;
    }

    public static C0294k H(n2.j jVar) {
        while (jVar.i()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n2.j.f4162b;
            n2.j f3 = jVar.f();
            if (f3 == null) {
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (n2.j) obj;
                    if (!jVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = f3;
            }
        }
        while (true) {
            jVar = jVar.h();
            if (!jVar.i()) {
                if (jVar instanceof C0294k) {
                    return (C0294k) jVar;
                }
                if (jVar instanceof X) {
                    return null;
                }
            }
        }
    }

    public static String O(Object obj) {
        if (!(obj instanceof V)) {
            return obj instanceof K ? ((K) obj).a() ? "Active" : "New" : obj instanceof C0298o ? "Cancelled" : "Completed";
        }
        V v3 = (V) obj;
        return v3.e() ? "Cancelling" : V.f2986b.get(v3) != 0 ? "Completing" : "Active";
    }

    public boolean A(Throwable th) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
    
        if (r4 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        r3 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [i2.S, i2.k, java.lang.Object, n2.j] */
    /* JADX WARN: Type inference failed for: r3v3, types: [i2.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v8, types: [i2.X, n2.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(i2.N r8) {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = i2.W.f2991l
            i2.Y r1 = i2.Y.f2992a
            if (r8 != 0) goto La
            r0.set(r7, r1)
            return
        La:
            i2.W r8 = (i2.W) r8
        Lc:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = i2.W.f2990k
            java.lang.Object r3 = r2.get(r8)
            int r3 = r8.N(r3)
            if (r3 == 0) goto L1c
            r4 = 1
            if (r3 == r4) goto L1c
            goto Lc
        L1c:
            i2.k r3 = new i2.k
            r3.<init>(r7)
            r3.f2980d = r8
        L23:
            java.lang.Object r4 = r2.get(r8)
            boolean r5 = r4 instanceof i2.D
            if (r5 == 0) goto L45
            r5 = r4
            i2.D r5 = (i2.D) r5
            boolean r6 = r5.f2966a
            if (r6 == 0) goto L41
        L32:
            boolean r5 = r2.compareAndSet(r8, r4, r3)
            if (r5 == 0) goto L3a
            goto La2
        L3a:
            java.lang.Object r5 = r2.get(r8)
            if (r5 == r4) goto L32
            goto L23
        L41:
            r8.L(r5)
            goto L23
        L45:
            boolean r5 = r4 instanceof i2.K
            r6 = 0
            if (r5 == 0) goto L8e
            r5 = r4
            i2.K r5 = (i2.K) r5
            i2.X r5 = r5.d()
            if (r5 != 0) goto L5e
            java.lang.String r5 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            a2.h.c(r4, r5)
            i2.S r4 = (i2.S) r4
            r8.M(r4)
            goto L23
        L5e:
            r4 = 7
            boolean r4 = r5.e(r3, r4)
            if (r4 == 0) goto L66
            goto La2
        L66:
            r4 = 3
            boolean r4 = r5.e(r3, r4)
            java.lang.Object r8 = r2.get(r8)
            boolean r5 = r8 instanceof i2.V
            if (r5 == 0) goto L7a
            i2.V r8 = (i2.V) r8
            java.lang.Throwable r6 = r8.c()
            goto L86
        L7a:
            boolean r5 = r8 instanceof i2.C0298o
            if (r5 == 0) goto L81
            i2.o r8 = (i2.C0298o) r8
            goto L82
        L81:
            r8 = r6
        L82:
            if (r8 == 0) goto L86
            java.lang.Throwable r6 = r8.f3017a
        L86:
            r3.l(r6)
            if (r4 == 0) goto L8c
            goto La2
        L8c:
            r3 = r1
            goto La2
        L8e:
            java.lang.Object r8 = r2.get(r8)
            boolean r4 = r8 instanceof i2.C0298o
            if (r4 == 0) goto L99
            i2.o r8 = (i2.C0298o) r8
            goto L9a
        L99:
            r8 = r6
        L9a:
            if (r8 == 0) goto L9e
            java.lang.Throwable r6 = r8.f3017a
        L9e:
            r3.l(r6)
            goto L8c
        La2:
            r0.set(r7, r3)
            java.lang.Object r8 = r2.get(r7)
            boolean r8 = r8 instanceof i2.K
            if (r8 != 0) goto Lb3
            r3.b()
            r0.set(r7, r1)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.W.C(i2.N):void");
    }

    public final B D(boolean z3, S s3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Y y;
        boolean z4;
        boolean e3;
        s3.f2980d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f2990k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z5 = obj instanceof D;
            y = Y.f2992a;
            z4 = true;
            if (!z5) {
                if (!(obj instanceof K)) {
                    z4 = false;
                    break;
                }
                K k3 = (K) obj;
                X d3 = k3.d();
                if (d3 == null) {
                    a2.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    M((S) obj);
                } else {
                    if (s3.k()) {
                        V v3 = k3 instanceof V ? (V) k3 : null;
                        Throwable c3 = v3 != null ? v3.c() : null;
                        if (c3 == null) {
                            e3 = d3.e(s3, 5);
                        } else if (z3) {
                            s3.l(c3);
                            return y;
                        }
                    } else {
                        e3 = d3.e(s3, 1);
                    }
                    if (e3) {
                        break;
                    }
                }
            } else {
                D d4 = (D) obj;
                if (d4.f2966a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, s3)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                L(d4);
            }
        }
        if (z4) {
            return s3;
        }
        if (z3) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0298o c0298o = obj2 instanceof C0298o ? (C0298o) obj2 : null;
            s3.l(c0298o != null ? c0298o.f3017a : null);
        }
        return y;
    }

    public boolean E() {
        return this instanceof C0286c;
    }

    public final boolean F(Object obj) {
        Object P2;
        do {
            P2 = P(f2990k.get(this), obj);
            if (P2 == AbstractC0303u.f3028c) {
                return false;
            }
            if (P2 == AbstractC0303u.f3029d) {
                return true;
            }
        } while (P2 == AbstractC0303u.f3030e);
        m(P2);
        return true;
    }

    public final Object G(Object obj) {
        Object P2;
        do {
            P2 = P(f2990k.get(this), obj);
            if (P2 == AbstractC0303u.f3028c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0298o c0298o = obj instanceof C0298o ? (C0298o) obj : null;
                throw new IllegalStateException(str, c0298o != null ? c0298o.f3017a : null);
            }
        } while (P2 == AbstractC0303u.f3030e);
        return P2;
    }

    public final void I(X x, Throwable th) {
        x.e(new n2.h(4), 4);
        Object obj = n2.j.f4161a.get(x);
        a2.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        D0.a aVar = null;
        for (n2.j jVar = (n2.j) obj; !jVar.equals(x); jVar = jVar.h()) {
            if ((jVar instanceof S) && ((S) jVar).k()) {
                try {
                    ((S) jVar).l(th);
                } catch (Throwable th2) {
                    if (aVar != null) {
                        E2.a.b(aVar, th2);
                    } else {
                        aVar = new D0.a("Exception in completion handler " + jVar + " for " + this, th2);
                    }
                }
            }
        }
        if (aVar != null) {
            B(aVar);
        }
        q(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [i2.J] */
    public final void L(D d3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        X x = new X();
        if (!d3.f2966a) {
            x = new J(x);
        }
        do {
            atomicReferenceFieldUpdater = f2990k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, d3, x)) {
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
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(s3) == s3) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(s3, s3, x)) {
                    if (atomicReferenceFieldUpdater2.get(s3) != s3) {
                        break;
                    }
                }
                x.g(s3);
                break loop0;
            }
            break;
        }
        n2.j h3 = s3.h();
        do {
            atomicReferenceFieldUpdater = f2990k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, s3, h3)) {
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
            D d3 = AbstractC0303u.f3034i;
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

    public final Object P(Object obj, Object obj2) {
        if (!(obj instanceof K)) {
            return AbstractC0303u.f3028c;
        }
        if (((obj instanceof D) || (obj instanceof S)) && !(obj instanceof C0294k) && !(obj2 instanceof C0298o)) {
            K k3 = (K) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2990k;
            Object l3 = obj2 instanceof K ? new L((K) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, k3, l3)) {
                if (atomicReferenceFieldUpdater.get(this) != k3) {
                    return AbstractC0303u.f3030e;
                }
            }
            J(obj2);
            t(k3, obj2);
            return obj2;
        }
        K k4 = (K) obj;
        X z3 = z(k4);
        if (z3 == null) {
            return AbstractC0303u.f3030e;
        }
        V v3 = k4 instanceof V ? (V) k4 : null;
        if (v3 == null) {
            v3 = new V(z3, null);
        }
        synchronized (v3) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = V.f2986b;
            if (atomicIntegerFieldUpdater.get(v3) != 0) {
                return AbstractC0303u.f3028c;
            }
            atomicIntegerFieldUpdater.set(v3, 1);
            if (v3 != k4) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2990k;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, k4, v3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != k4) {
                        return AbstractC0303u.f3030e;
                    }
                }
            }
            boolean e3 = v3.e();
            C0298o c0298o = obj2 instanceof C0298o ? (C0298o) obj2 : null;
            if (c0298o != null) {
                v3.b(c0298o.f3017a);
            }
            Throwable c3 = e3 ? null : v3.c();
            if (c3 != null) {
                I(z3, c3);
            }
            C0294k H3 = H(z3);
            if (H3 != null && Q(v3, H3, obj2)) {
                return AbstractC0303u.f3029d;
            }
            z3.e(new n2.h(2), 2);
            C0294k H4 = H(z3);
            return (H4 == null || !Q(v3, H4, obj2)) ? v(v3, obj2) : AbstractC0303u.f3029d;
        }
    }

    public final boolean Q(V v3, C0294k c0294k, Object obj) {
        while (AbstractC0303u.f(c0294k.f3010e, false, new U(this, v3, c0294k, obj)) == Y.f2992a) {
            c0294k = H(c0294k);
            if (c0294k == null) {
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
    public void b(CancellationException cancellationException) {
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

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r0 == i2.AbstractC0303u.f3029d) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.W.o(java.lang.Object):boolean");
    }

    public void p(CancellationException cancellationException) {
        o(cancellationException);
    }

    public final boolean q(Throwable th) {
        if (E()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        InterfaceC0293j interfaceC0293j = (InterfaceC0293j) f2991l.get(this);
        return (interfaceC0293j == null || interfaceC0293j == Y.f2992a) ? z3 : interfaceC0293j.c(th) || z3;
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

    public final void t(K k3, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2991l;
        InterfaceC0293j interfaceC0293j = (InterfaceC0293j) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0293j != null) {
            interfaceC0293j.b();
            atomicReferenceFieldUpdater.set(this, Y.f2992a);
        }
        D0.a aVar = null;
        C0298o c0298o = obj instanceof C0298o ? (C0298o) obj : null;
        Throwable th = c0298o != null ? c0298o.f3017a : null;
        if (k3 instanceof S) {
            try {
                ((S) k3).l(th);
                return;
            } catch (Throwable th2) {
                B(new D0.a("Exception in completion handler " + k3 + " for " + this, th2));
                return;
            }
        }
        X d3 = k3.d();
        if (d3 != null) {
            d3.e(new n2.h(1), 1);
            Object obj2 = n2.j.f4161a.get(d3);
            a2.h.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (n2.j jVar = (n2.j) obj2; !jVar.equals(d3); jVar = jVar.h()) {
                if (jVar instanceof S) {
                    try {
                        ((S) jVar).l(th);
                    } catch (Throwable th3) {
                        if (aVar != null) {
                            E2.a.b(aVar, th3);
                        } else {
                            aVar = new D0.a("Exception in completion handler " + jVar + " for " + this, th3);
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
        sb.append(AbstractC0303u.c(this));
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable u(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        W w3 = (W) ((a0) obj);
        Object obj2 = f2990k.get(w3);
        if (obj2 instanceof V) {
            cancellationException = ((V) obj2).c();
        } else if (obj2 instanceof C0298o) {
            cancellationException = ((C0298o) obj2).f3017a;
        } else {
            if (obj2 instanceof K) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new O("Parent job is ".concat(O(obj2)), cancellationException, w3) : cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object v(V v3, Object obj) {
        Throwable th = null;
        C0298o c0298o = obj instanceof C0298o ? (C0298o) obj : null;
        Throwable th2 = c0298o != null ? c0298o.f3017a : null;
        synchronized (v3) {
            v3.e();
            ArrayList f3 = v3.f(th2);
            if (!f3.isEmpty()) {
                int size = f3.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    }
                    Object obj2 = f3.get(i3);
                    i3++;
                    if (!(((Throwable) obj2) instanceof CancellationException)) {
                        th = obj2;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = (Throwable) f3.get(0);
                }
            } else if (v3.e()) {
                th = new O(r(), null, this);
            }
            if (th != null && f3.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f3.size()));
                int size2 = f3.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj3 = f3.get(i4);
                    i4++;
                    Throwable th3 = (Throwable) obj3;
                    if (th3 != th && th3 != th && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        E2.a.b(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new C0298o(th, false);
        }
        if (th != null && (q(th) || A(th))) {
            a2.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0298o.f3016b.compareAndSet((C0298o) obj, 0, 1);
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
            if (!(obj instanceof C0298o)) {
                return new O(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0298o) obj).f3017a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new O(r(), th, this) : cancellationException;
        }
        Throwable c3 = ((V) obj).c();
        if (c3 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c3 instanceof CancellationException ? (CancellationException) c3 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = r();
        }
        return new O(concat, c3, this);
    }

    public boolean x() {
        return true;
    }

    public boolean y() {
        return this instanceof C0296m;
    }

    public final X z(K k3) {
        X d3 = k3.d();
        if (d3 != null) {
            return d3;
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
