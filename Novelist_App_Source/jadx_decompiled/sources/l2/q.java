package l2;

import i2.C0290g;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class q extends m2.b implements d, e, m2.i {

    /* renamed from: o, reason: collision with root package name */
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
                                if (obj4 != null && obj4 != (gVar = r.f4080b)) {
                                    B1.g gVar2 = r.f4079a;
                                    if (obj4 != gVar2) {
                                        while (!atomicReference.compareAndSet(obj4, gVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0290g) obj4).resumeWith(O1.g.f1211a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, gVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
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

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e3, code lost:
    
        if (r0.equals(r4) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0145, code lost:
    
        if (r5 == r3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0148, code lost:
    
        if (r4 != r3) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cf A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00c7, B:18:0x00cf, B:21:0x00d6, B:22:0x00dc, B:26:0x00df, B:28:0x0100, B:31:0x0110, B:32:0x012c, B:39:0x013c, B:34:0x0133, B:38:0x0139, B:47:0x00e5, B:50:0x00ec, B:58:0x0054, B:60:0x005f, B:61:0x00b7), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0110 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:16:0x00c7, B:18:0x00cf, B:21:0x00d6, B:22:0x00dc, B:26:0x00df, B:28:0x0100, B:31:0x0110, B:32:0x012c, B:39:0x013c, B:34:0x0133, B:38:0x0139, B:47:0x00e5, B:50:0x00ec, B:58:0x0054, B:60:0x005f, B:61:0x00b7), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x010f -> B:16:0x00c7). Please report as a decompilation issue!!! */
    @Override // l2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(l2.e r18, R1.c r19) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.q.h(l2.e, R1.c):java.lang.Object");
    }
}
