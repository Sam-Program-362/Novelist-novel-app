package i2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public abstract class F extends G implements InterfaceC0215x {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2967q = AtomicReferenceFieldUpdater.newUpdater(F.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2968r = AtomicReferenceFieldUpdater.newUpdater(F.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2969s = AtomicIntegerFieldUpdater.newUpdater(F.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // i2.AbstractC0209q
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
                if (obj instanceof n2.m) {
                    n2.m mVar = (n2.m) obj;
                    Object objD = mVar.d();
                    if (objD != n2.m.f4168g) {
                        runnable = (Runnable) objD;
                        break;
                    }
                    n2.m mVarC = mVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else {
                    if (obj == AbstractC0212u.f3027b) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            runnable = (Runnable) obj;
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            P1.c cVar = this.f2972o;
            if (((cVar == null || cVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f2967q.get(this);
                if (obj2 == null) {
                } else if (obj2 instanceof n2.m) {
                    long j3 = n2.m.f4167f.get((n2.m) obj2);
                    if (((int) (1073741823 & j3)) != ((int) ((j3 & 1152921503533105152L) >> 30))) {
                        return 0L;
                    }
                } else if (obj2 == AbstractC0212u.f3027b) {
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void o(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2967q;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f2969s.get(this) == 0) {
                if (obj == null) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == null);
                } else if (obj instanceof n2.m) {
                    n2.m mVar = (n2.m) obj;
                    int iA = mVar.a(runnable);
                    if (iA == 0) {
                        break;
                    }
                    if (iA == 1) {
                        n2.m mVarC = mVar.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (iA != 2) {
                    }
                } else if (obj != AbstractC0212u.f3027b) {
                    n2.m mVar2 = new n2.m(8, true);
                    mVar2.a((Runnable) obj);
                    mVar2.a(runnable);
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar2)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                }
            }
            RunnableC0213v.f3035t.o(runnable);
            return;
        }
        Thread threadK = k();
        if (Thread.currentThread() != threadK) {
            LockSupport.unpark(threadK);
        }
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
                if (obj == AbstractC0212u.f3027b) {
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
        B1.g gVar = AbstractC0212u.f3027b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2967q;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, gVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof n2.m) {
                ((n2.m) obj).b();
                break;
            } else {
                if (obj == gVar) {
                    break;
                }
                n2.m mVar = new n2.m(8, true);
                mVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (m() <= 0) {
        }
        System.nanoTime();
    }
}
