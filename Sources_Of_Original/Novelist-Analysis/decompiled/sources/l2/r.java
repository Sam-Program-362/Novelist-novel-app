package l2;

import V.C0093q;
import V.C0099x;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B1.g f4079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B1.g f4080b;

    static {
        int i3 = 18;
        f4079a = new B1.g("NONE", i3);
        f4080b = new B1.g("PENDING", i3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(t tVar, C0093q c0093q, Throwable th, T1.c cVar) throws IllegalAccessException, InvocationTargetException {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i3 = gVar.f4045p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.f4045p = i3 - Integer.MIN_VALUE;
            } else {
                gVar = new g(cVar);
            }
        } else {
            gVar = new g(cVar);
        }
        Object obj = gVar.f4044o;
        int i4 = gVar.f4045p;
        try {
            if (i4 == 0) {
                H2.h.E(obj);
                gVar.n = th;
                gVar.f4045p = 1;
                Object objD = c0093q.d(tVar, th, gVar);
                Object obj2 = S1.a.f1260k;
                if (objD == obj2) {
                    return obj2;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = gVar.n;
                H2.h.E(obj);
            }
            return O1.g.f1211a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                E2.a.b(th2, th);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0080 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0086 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0097 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:13:0x002f, B:25:0x005e, B:29:0x0072, B:31:0x007a, B:33:0x0080, B:35:0x0086, B:38:0x0097, B:39:0x009f, B:40:0x00a0, B:41:0x00a7, B:20:0x0049, B:24:0x0054), top: B:60:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (r1.g(r11, r0) == r5) goto L37;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0094 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(l2.e r8, k2.p r9, boolean r10, T1.c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.r.b(l2.e, k2.p, boolean, T1.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(d dVar, T1.c cVar) {
        n nVar;
        a2.o oVar;
        m2.a e3;
        C0099x c0099x;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i3 = nVar.f4070q;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nVar.f4070q = i3 - Integer.MIN_VALUE;
            } else {
                nVar = new n(cVar);
            }
        } else {
            nVar = new n(cVar);
        }
        Object obj = nVar.f4069p;
        int i4 = nVar.f4070q;
        if (i4 == 0) {
            H2.h.E(obj);
            a2.o oVar2 = new a2.o();
            C0099x c0099x2 = new C0099x(oVar2, 1);
            try {
                nVar.n = oVar2;
                nVar.f4068o = c0099x2;
                nVar.f4070q = 1;
                Object objH = dVar.h(c0099x2, nVar);
                Object obj2 = S1.a.f1260k;
                if (objH == obj2) {
                    return obj2;
                }
                oVar = oVar2;
            } catch (m2.a e4) {
                oVar = oVar2;
                e3 = e4;
                c0099x = c0099x2;
                if (e3.f4100k != c0099x) {
                    throw e3;
                }
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0099x = nVar.f4068o;
            oVar = nVar.n;
            try {
                H2.h.E(obj);
            } catch (m2.a e5) {
                e3 = e5;
                if (e3.f4100k != c0099x) {
                    throw e3;
                }
            }
        }
        return oVar.f1713k;
    }
}
