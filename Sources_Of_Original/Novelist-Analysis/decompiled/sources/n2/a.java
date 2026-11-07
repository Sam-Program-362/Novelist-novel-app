package n2;

import i2.AbstractC0209q;
import i2.AbstractC0212u;
import i2.C0207o;
import i2.G;
import i2.N;
import i2.W;
import i2.d0;
import i2.e0;
import i2.g0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B1.g f4140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B1.g f4141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B1.g f4142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B1.g f4143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final N.d f4144e = new N.d(9);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final N.d f4145f = new N.d(10);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
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
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                        if (rVar.c()) {
                            rVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(rVar) == null);
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

    public static final void d(R1.h hVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
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
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            E2.a.b(th, new e(hVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
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
            Object objF = hVar.f(null, f4145f);
            a2.h.c(objF, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            B1.e.p(objF);
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
        AbstractC0209q abstractC0209q = fVar.n;
        Throwable thA = O1.d.a(obj);
        Object c0207o = thA == null ? obj : new C0207o(thA, false);
        T1.c cVar2 = fVar.f4153o;
        if (abstractC0209q.d(cVar2.getContext())) {
            fVar.f4154p = c0207o;
            fVar.f3038m = 1;
            abstractC0209q.c(cVar2.getContext(), fVar);
            return;
        }
        G gA = e0.a();
        if (gA.f2971m >= 4294967296L) {
            fVar.f4154p = c0207o;
            fVar.f3038m = 1;
            P1.c cVar3 = gA.f2972o;
            if (cVar3 == null) {
                cVar3 = new P1.c();
                gA.f2972o = cVar3;
            }
            cVar3.addLast(fVar);
            return;
        }
        gA.l(true);
        try {
            N n = (N) cVar2.getContext().e(i2.r.f3022l);
            if (n == null || n.a()) {
                Object obj2 = fVar.f4155q;
                R1.h context = cVar2.getContext();
                Object objL = l(context, obj2);
                g0 g0VarM = objL != f4143d ? AbstractC0212u.m(cVar2, context, objL) : null;
                try {
                    cVar2.resumeWith(obj);
                    if (g0VarM == null || g0VarM.U()) {
                        g(context, objL);
                    }
                } catch (Throwable th) {
                    if (g0VarM == null || g0VarM.U()) {
                        g(context, objL);
                    }
                    throw th;
                }
            } else {
                fVar.resumeWith(H2.h.i(((W) n).w()));
            }
            while (gA.n()) {
            }
        } catch (Throwable th2) {
            try {
                fVar.g(th2);
            } finally {
                gA.h(true);
            }
        }
    }

    public static final long i(String str, long j3, long j4, long j5) {
        String property;
        Long lValueOf;
        boolean z3;
        int i3 = t.f4178a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j3;
        }
        int length = property.length();
        if (length != 0) {
            int i4 = 0;
            char cCharAt = property.charAt(0);
            long j6 = -9223372036854775807L;
            if (cCharAt < '0') {
                z3 = true;
                if (length != 1) {
                    if (cCharAt == '+') {
                        z3 = false;
                        i4 = 1;
                    } else if (cCharAt == '-') {
                        j6 = Long.MIN_VALUE;
                        i4 = 1;
                    }
                }
                lValueOf = null;
                break;
            }
            z3 = false;
            long j7 = 0;
            long j8 = -256204778801521550L;
            while (true) {
                if (i4 >= length) {
                    if (!z3) {
                        lValueOf = Long.valueOf(-j7);
                        break;
                    }
                    lValueOf = Long.valueOf(j7);
                    break;
                }
                int iDigit = Character.digit((int) property.charAt(i4), 10);
                if (iDigit >= 0) {
                    if (j7 < j8) {
                        if (j8 == -256204778801521550L) {
                            j8 = j6 / ((long) 10);
                            if (j7 < j8) {
                            }
                        }
                    }
                    long j9 = j7 * ((long) 10);
                    long j10 = iDigit;
                    if (j9 >= j6 + j10) {
                        j7 = j9 - j10;
                        i4++;
                        length = length;
                    }
                }
                lValueOf = null;
                break;
            }
        }
        lValueOf = null;
        break;
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j4 <= jLongValue && jLongValue <= j5) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j4 + ".." + j5 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int j(int i3, String str, int i4) {
        return (int) i(str, i3, 1, (i4 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object k(R1.h hVar) {
        Object objF = hVar.f(0, f4144e);
        a2.h.b(objF);
        return objF;
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
