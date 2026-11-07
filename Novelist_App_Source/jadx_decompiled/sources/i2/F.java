package i2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class F extends G implements InterfaceC0306x {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2967q = AtomicReferenceFieldUpdater.newUpdater(F.class, Object.class, "_queue$volatile");

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2968r = AtomicReferenceFieldUpdater.newUpdater(F.class, Object.class, "_delayed$volatile");

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2969s = AtomicIntegerFieldUpdater.newUpdater(F.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // i2.AbstractC0300q
    public final void c(R1.h hVar, Runnable runnable) {
        o(runnable);
    }

    @Override // i2.G
    public final long m() {
        Runnable runnable;
        if (!n()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2967q;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                runnable = null;
                if (obj == null) {
                    break;
                }
                if (!(obj instanceof n2.m)) {
                    if (obj != AbstractC0303u.f3027b) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        runnable = (Runnable) obj;
                        break loop0;
                    }
                    break;
                }
                n2.m mVar = (n2.m) obj;
                Object d3 = mVar.d();
                if (d3 != n2.m.f4168g) {
                    runnable = (Runnable) d3;
                    break;
                }
                n2.m c3 = mVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            P1.c cVar = this.f2972o;
            if (((cVar == null || cVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f2967q.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof n2.m) {
                        long j3 = n2.m.f4167f.get((n2.m) obj2);
                        if (((int) (1073741823 & j3)) != ((int) ((j3 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == AbstractC0303u.f3027b) {
                        return Long.MAX_VALUE;
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        r6 = k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (java.lang.Thread.currentThread() == r6) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        java.util.concurrent.locks.LockSupport.unpark(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(java.lang.Runnable r6) {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = i2.F.f2968r
            java.lang.Object r0 = r0.get(r5)
            i2.E r0 = (i2.E) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = i2.F.f2967q
        La:
            java.lang.Object r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = i2.F.f2969s
            int r2 = r2.get(r5)
            if (r2 == 0) goto L17
            goto L52
        L17:
            if (r1 != 0) goto L28
        L19:
            r1 = 0
            boolean r1 = r0.compareAndSet(r5, r1, r6)
            if (r1 == 0) goto L21
            goto L6e
        L21:
            java.lang.Object r1 = r0.get(r5)
            if (r1 == 0) goto L19
            goto La
        L28:
            boolean r2 = r1 instanceof n2.m
            r3 = 1
            if (r2 == 0) goto L4e
            r2 = r1
            n2.m r2 = (n2.m) r2
            int r4 = r2.a(r6)
            if (r4 == 0) goto L6e
            if (r4 == r3) goto L3c
            r1 = 2
            if (r4 == r1) goto L52
            goto La
        L3c:
            n2.m r2 = r2.c()
        L40:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L47
            goto La
        L47:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L40
            goto La
        L4e:
            B1.g r2 = i2.AbstractC0303u.f3027b
            if (r1 != r2) goto L58
        L52:
            i2.v r0 = i2.RunnableC0304v.f3035t
            r0.o(r6)
            return
        L58:
            n2.m r2 = new n2.m
            r4 = 8
            r2.<init>(r4, r3)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r6)
        L68:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L7c
        L6e:
            java.lang.Thread r6 = r5.k()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r6) goto L7b
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L7b:
            return
        L7c:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L68
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.F.o(java.lang.Runnable):void");
    }

    public final boolean p() {
        P1.c cVar = this.f2972o;
        if (cVar != null ? cVar.isEmpty() : true) {
            Object obj = f2967q.get(this);
            if (obj != null) {
                if (obj instanceof n2.m) {
                    long j3 = n2.m.f4167f.get((n2.m) obj);
                    return ((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30));
                }
                if (obj == AbstractC0303u.f3027b) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // i2.G
    public void shutdown() {
        e0.f2997a.set(null);
        f2969s.set(this, 1);
        B1.g gVar = AbstractC0303u.f3027b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2967q;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof n2.m)) {
                    if (obj != gVar) {
                        n2.m mVar = new n2.m(8, true);
                        mVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((n2.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, gVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (m() <= 0) {
        }
        System.nanoTime();
    }
}
