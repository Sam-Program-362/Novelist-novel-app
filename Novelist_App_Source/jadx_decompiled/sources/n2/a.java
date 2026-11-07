package n2;

import i2.AbstractC0300q;
import i2.AbstractC0303u;
import i2.C0298o;
import i2.G;
import i2.N;
import i2.W;
import i2.d0;
import i2.e0;
import i2.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final B1.g f4140a;

    /* renamed from: b, reason: collision with root package name */
    public static final B1.g f4141b;

    /* renamed from: c, reason: collision with root package name */
    public static final B1.g f4142c;

    /* renamed from: d, reason: collision with root package name */
    public static final B1.g f4143d;

    /* renamed from: e, reason: collision with root package name */
    public static final N.d f4144e = new N.d(9);

    /* renamed from: f, reason: collision with root package name */
    public static final N.d f4145f = new N.d(10);

    /* renamed from: g, reason: collision with root package name */
    public static final N.d f4146g = new N.d(11);

    static {
        int i3 = 18;
        f4140a = new B1.g("CLOSED", i3);
        f4141b = new B1.g("UNDEFINED", i3);
        f4142c = new B1.g("REUSABLE_CLAIMED", i3);
        f4143d = new B1.g("NO_THREAD_ELEMENTS", i3);
    }

    public static final void a(int i3) {
        if (i3 < 1) {
            throw new IllegalArgumentException(B1.e.g("Expected positive parallelism level, but got ", i3).toString());
        }
    }

    public static final Object b(r rVar, long j3, Z1.p pVar) {
        while (true) {
            if (rVar.f4176c >= j3 && !rVar.c()) {
                return rVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f4147a;
            Object obj = atomicReferenceFieldUpdater.get(rVar);
            B1.g gVar = f4140a;
            if (obj == gVar) {
                return gVar;
            }
            r rVar2 = (r) ((b) obj);
            if (rVar2 == null) {
                rVar2 = (r) pVar.e(Long.valueOf(rVar.f4176c + 1), rVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                    if (atomicReferenceFieldUpdater.get(rVar) != null) {
                        break;
                    }
                }
                if (rVar.c()) {
                    rVar.d();
                }
            }
            rVar = rVar2;
        }
    }

    public static final r c(Object obj) {
        if (obj != f4140a) {
            return (r) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(R1.h hVar, Throwable th) {
        Throwable runtimeException;
        Iterator it2 = d.f4150a.iterator();
        while (it2.hasNext()) {
            try {
                ((j2.b) it2.next()).c(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    E2.a.b(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            E2.a.b(th, new e(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f4140a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(R1.h hVar, Object obj) {
        if (obj == f4143d) {
            return;
        }
        if (!(obj instanceof v)) {
            Object f3 = hVar.f(null, f4145f);
            a2.h.c(f3, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            B1.e.p(f3);
            throw null;
        }
        v vVar = (v) obj;
        d0[] d0VarArr = vVar.f4181b;
        int length = d0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        d0 d0Var = d0VarArr[length];
        a2.h.b(null);
        Object obj2 = vVar.f4180a[length];
        throw null;
    }

    public static final void h(R1.c cVar, Object obj) {
        if (!(cVar instanceof f)) {
            cVar.resumeWith(obj);
            return;
        }
        f fVar = (f) cVar;
        AbstractC0300q abstractC0300q = fVar.n;
        Throwable a3 = O1.d.a(obj);
        Object c0298o = a3 == null ? obj : new C0298o(a3, false);
        T1.c cVar2 = fVar.f4153o;
        if (abstractC0300q.d(cVar2.getContext())) {
            fVar.f4154p = c0298o;
            fVar.f3038m = 1;
            abstractC0300q.c(cVar2.getContext(), fVar);
            return;
        }
        G a4 = e0.a();
        if (a4.f2971m >= 4294967296L) {
            fVar.f4154p = c0298o;
            fVar.f3038m = 1;
            P1.c cVar3 = a4.f2972o;
            if (cVar3 == null) {
                cVar3 = new P1.c();
                a4.f2972o = cVar3;
            }
            cVar3.addLast(fVar);
            return;
        }
        a4.l(true);
        try {
            N n = (N) cVar2.getContext().e(i2.r.f3022l);
            if (n == null || n.a()) {
                Object obj2 = fVar.f4155q;
                R1.h context = cVar2.getContext();
                Object l3 = l(context, obj2);
                g0 m3 = l3 != f4143d ? AbstractC0303u.m(cVar2, context, l3) : null;
                try {
                    cVar2.resumeWith(obj);
                } finally {
                    if (m3 == null || m3.U()) {
                        g(context, l3);
                    }
                }
            } else {
                fVar.resumeWith(H2.h.i(((W) n).w()));
            }
            while (a4.n()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long i(java.lang.String r22, long r23, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.a.i(java.lang.String, long, long, long):long");
    }

    public static int j(int i3, String str, int i4) {
        return (int) i(str, i3, 1, (i4 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object k(R1.h hVar) {
        Object f3 = hVar.f(0, f4144e);
        a2.h.b(f3);
        return f3;
    }

    public static final Object l(R1.h hVar, Object obj) {
        if (obj == null) {
            obj = k(hVar);
        }
        if (obj == 0) {
            return f4143d;
        }
        if (obj instanceof Integer) {
            return hVar.f(new v(((Number) obj).intValue(), hVar), f4146g);
        }
        B1.e.p(obj);
        throw null;
    }
}
