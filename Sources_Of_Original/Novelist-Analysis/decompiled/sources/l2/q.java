package l2;

import i2.C0199g;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class q extends m2.b implements d, e, m2.i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4078o = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int n;

    public q(Object obj) {
        this._state$volatile = obj;
    }

    public final Object a() {
        Object obj = f4078o.get(this);
        if (obj == m2.k.f4120a) {
            return null;
        }
        return obj;
    }

    public final void b(Object obj) {
        if (obj == null) {
            obj = m2.k.f4120a;
        }
        c(null, obj);
    }

    public final boolean c(Object obj, Object obj2) {
        int i3;
        s[] sVarArr;
        B1.g gVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4078o;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !a2.h.a(obj3, obj)) {
                return false;
            }
            if (a2.h.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i4 = this.n;
            if ((i4 & 1) != 0) {
                this.n = i4 + 2;
                return true;
            }
            int i5 = i4 + 1;
            this.n = i5;
            s[] sVarArr2 = this.f4101k;
            while (true) {
                if (sVarArr2 != null) {
                    for (s sVar : sVarArr2) {
                        if (sVar != null) {
                            AtomicReference atomicReference = sVar.f4081a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (gVar = r.f4080b)) {
                                    break;
                                }
                                B1.g gVar2 = r.f4079a;
                                if (obj4 != gVar2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, gVar2)) {
                                            ((C0199g) obj4).resumeWith(O1.g.f1211a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, gVar)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i3 = this.n;
                    if (i3 == i5) {
                        this.n = i5 + 1;
                        return true;
                    }
                    sVarArr = this.f4101k;
                }
                sVarArr2 = sVarArr;
                i5 = i3;
            }
        }
    }

    @Override // l2.e
    public final Object g(Object obj, R1.c cVar) {
        b(obj);
        return O1.g.f1211a;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00cf A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x0039, B:50:0x00c7, B:52:0x00cf, B:55:0x00d6, B:56:0x00dc, B:58:0x00df, B:68:0x0100, B:71:0x0110, B:72:0x012c, B:78:0x013c, B:75:0x0133, B:77:0x0139, B:60:0x00e5, B:64:0x00ec, B:21:0x0054, B:24:0x005f, B:49:0x00b7), top: B:102:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00df A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:14:0x0039, B:50:0x00c7, B:52:0x00cf, B:55:0x00d6, B:56:0x00dc, B:58:0x00df, B:68:0x0100, B:71:0x0110, B:72:0x012c, B:78:0x013c, B:75:0x0133, B:77:0x0139, B:60:0x00e5, B:64:0x00ec, B:21:0x0054, B:24:0x005f, B:49:0x00b7), top: B:102:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ff A[PHI: r4 r5 r8 r10 r11 r12 r13
      0x00ff: PHI (r4v14 java.lang.Object) = (r4v20 java.lang.Object), (r4v22 java.lang.Object) binds: [B:65:0x00fc, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r5v1 int) = (r5v6 int), (r5v0 int) binds: [B:65:0x00fc, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r8v1 int) = (r8v6 int), (r8v0 int) binds: [B:65:0x00fc, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r10v6 i2.N) = (r10v8 i2.N), (r10v11 i2.N) binds: [B:65:0x00fc, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r11v5 l2.s) = (r11v7 l2.s), (r11v10 l2.s) binds: [B:65:0x00fc, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r12v2 l2.e) = (r12v4 l2.e), (r12v6 l2.e) binds: [B:65:0x00fc, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
      0x00ff: PHI (r13v3 l2.q) = (r13v5 l2.q), (r13v8 l2.q) binds: [B:65:0x00fc, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x010f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x010f -> B:50:0x00c7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // l2.d
    public final java.lang.Object h(l2.e r18, R1.c r19) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.q.h(l2.e, R1.c):java.lang.Object");
    }
}
