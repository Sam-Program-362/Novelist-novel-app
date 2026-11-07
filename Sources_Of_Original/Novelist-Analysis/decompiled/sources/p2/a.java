package p2;

import a2.o;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4240s = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    private volatile int indexInArray;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m f4241k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f4242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f4243m;
    public long n;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f4244o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4245p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4246q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f4247r;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i3) {
        this.f4247r = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f4241k = new m();
        this.f4242l = new o();
        this.f4243m = b.n;
        this.nextParkedWorker = c.u;
        int iNanoTime = (int) System.nanoTime();
        this.f4245p = iNanoTime == 0 ? 42 : iNanoTime;
        f(i3);
    }

    public final i a(boolean z3) {
        i iVarE;
        i iVarE2;
        long j3;
        b bVar = this.f4243m;
        c cVar = this.f4247r;
        i iVar = null;
        m mVar = this.f4241k;
        b bVar2 = b.f4248k;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f4254s;
            do {
                j3 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f4275b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null || !iVar2.f4266l) {
                            int i3 = m.f4277d.get(mVar);
                            int i4 = m.f4276c.get(mVar);
                            while (i3 != i4 && m.f4278e.get(mVar) != 0) {
                                i4--;
                                i iVarB = mVar.b(i4, true);
                                if (iVarB != null) {
                                    iVar = iVarB;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                iVar = iVar2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == iVar2);
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar.f4260p.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.f4254s.compareAndSet(cVar, j3, j3 - 4398046511104L));
            this.f4243m = bVar2;
        }
        if (z3) {
            boolean z4 = d(cVar.f4256k * 2) == 0;
            if (z4 && (iVarE2 = e()) != null) {
                return iVarE2;
            }
            mVar.getClass();
            i iVarA = (i) m.f4275b.getAndSet(mVar, null);
            if (iVarA == null) {
                iVarA = mVar.a();
            }
            if (iVarA != null) {
                return iVarA;
            }
            if (!z4 && (iVarE = e()) != null) {
                return iVarE;
            }
        } else {
            i iVarE3 = e();
            if (iVarE3 != null) {
                return iVarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i3) {
        int i4 = this.f4245p;
        int i5 = i4 ^ (i4 << 13);
        int i6 = i5 ^ (i5 >> 17);
        int i7 = i6 ^ (i6 << 5);
        this.f4245p = i7;
        int i8 = i3 - 1;
        return (i8 & i3) == 0 ? i7 & i8 : (i7 & Integer.MAX_VALUE) % i3;
    }

    public final i e() {
        int iD = d(2);
        c cVar = this.f4247r;
        if (iD == 0) {
            i iVar = (i) cVar.f4259o.d();
            return iVar != null ? iVar : (i) cVar.f4260p.d();
        }
        i iVar2 = (i) cVar.f4260p.d();
        return iVar2 != null ? iVar2 : (i) cVar.f4259o.d();
    }

    public final void f(int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4247r.n);
        sb.append("-worker-");
        sb.append(i3 == 0 ? "TERMINATED" : String.valueOf(i3));
        setName(sb.toString());
        this.indexInArray = i3;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f4243m;
        boolean z3 = bVar2 == b.f4248k;
        if (z3) {
            c.f4254s.addAndGet(this.f4247r, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f4243m = bVar;
        }
        return z3;
    }

    public final i i(int i3) {
        long j3;
        i iVarB;
        long j4;
        long j5;
        i iVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f4254s;
        c cVar = this.f4247r;
        int i4 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar2 = null;
        if (i4 < 2) {
            return null;
        }
        int iD = d(i4);
        int i5 = 0;
        long jMin = Long.MAX_VALUE;
        while (i5 < i4) {
            iD++;
            if (iD > i4) {
                iD = 1;
            }
            a aVar = (a) cVar.f4261q.b(iD);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f4241k;
                if (i3 != 3) {
                    mVar.getClass();
                    int i6 = m.f4277d.get(mVar);
                    int i7 = m.f4276c.get(mVar);
                    boolean z3 = i3 == 1;
                    while (true) {
                        if (i6 != i7) {
                            j3 = 0;
                            if (!z3 || m.f4278e.get(mVar) != 0) {
                                int i8 = i6 + 1;
                                iVarB = mVar.b(i6, z3);
                                if (iVarB != null) {
                                    break;
                                }
                                i6 = i8;
                            }
                        } else {
                            j3 = 0;
                        }
                        iVarB = iVar2;
                        break;
                    }
                } else {
                    iVarB = mVar.a();
                    j3 = 0;
                }
                o oVar = this.f4242l;
                if (iVarB == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f4275b;
                        i iVar3 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar3 == null) {
                            j4 = -1;
                        } else {
                            j4 = -1;
                            if (((iVar3.f4266l ? 1 : 2) & i3) != 0) {
                                k.f4273f.getClass();
                                m mVar2 = mVar;
                                long jNanoTime = System.nanoTime() - iVar3.f4265k;
                                long j6 = k.f4269b;
                                if (jNanoTime < j6) {
                                    j5 = j6 - jNanoTime;
                                    iVar = null;
                                    break;
                                }
                                do {
                                    iVar = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar3, null)) {
                                        oVar.f1713k = iVar3;
                                        j5 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(mVar2) == iVar3);
                                mVar = mVar2;
                                iVar2 = null;
                            }
                        }
                        j5 = -2;
                        iVar = iVar2;
                        break;
                    }
                } else {
                    oVar.f1713k = iVarB;
                    iVar = iVar2;
                    j5 = -1;
                    j4 = -1;
                }
                if (j5 == j4) {
                    i iVar4 = (i) oVar.f1713k;
                    oVar.f1713k = iVar;
                    return iVar4;
                }
                if (j5 > j3) {
                    jMin = Math.min(jMin, j5);
                }
            }
            i5++;
            iVar2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f4244o = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j3;
        loop0: while (true) {
            boolean z3 = false;
            while (true) {
                if (c.f4255t.get(this.f4247r) == 0) {
                    b bVar = this.f4243m;
                    b bVar2 = b.f4251o;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i iVarA = a(this.f4246q);
                    if (iVarA != null) {
                        this.f4244o = 0L;
                        c cVar = this.f4247r;
                        this.n = 0L;
                        if (this.f4243m == b.f4250m) {
                            this.f4243m = b.f4249l;
                        }
                        if (!iVarA.f4266l) {
                            try {
                                iVarA.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (h(b.f4249l) && !cVar.e() && !cVar.d(c.f4254s.get(cVar))) {
                            cVar.e();
                        }
                        try {
                            iVarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        c.f4254s.addAndGet(cVar, -2097152L);
                        if (this.f4243m == bVar2) {
                            break;
                        }
                        this.f4243m = b.n;
                        break;
                    }
                    this.f4246q = false;
                    if (this.f4244o == 0) {
                        Object obj = this.nextParkedWorker;
                        B1.g gVar = c.u;
                        if (obj != gVar) {
                            f4240s.set(this, -1);
                            while (this.nextParkedWorker != c.u) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4240s;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                c cVar2 = this.f4247r;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f4255t;
                                if (atomicIntegerFieldUpdater2.get(cVar2) != 0) {
                                    break;
                                }
                                b bVar3 = this.f4243m;
                                b bVar4 = b.f4251o;
                                if (bVar3 == bVar4) {
                                    break;
                                }
                                h(b.f4250m);
                                Thread.interrupted();
                                if (this.n == 0) {
                                    j3 = 2097151;
                                    this.n = System.nanoTime() + this.f4247r.f4258m;
                                } else {
                                    j3 = 2097151;
                                }
                                LockSupport.parkNanos(this.f4247r.f4258m);
                                if (System.nanoTime() - this.n >= 0) {
                                    this.n = 0L;
                                    c cVar3 = this.f4247r;
                                    synchronized (cVar3.f4261q) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(cVar3) != 0)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = c.f4254s;
                                                if (((int) (atomicLongFieldUpdater.get(cVar3) & j3)) > cVar3.f4256k) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i3 = this.indexInArray;
                                                        f(0);
                                                        cVar3.c(this, i3, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar3) & j3);
                                                        if (andDecrement != i3) {
                                                            Object objB = cVar3.f4261q.b(andDecrement);
                                                            a2.h.b(objB);
                                                            a aVar = (a) objB;
                                                            cVar3.f4261q.c(i3, aVar);
                                                            aVar.f(i3);
                                                            cVar3.c(aVar, andDecrement, i3);
                                                        }
                                                        cVar3.f4261q.c(andDecrement, null);
                                                        this.f4243m = bVar4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        } else {
                            c cVar4 = this.f4247r;
                            if (this.nextParkedWorker == gVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f4253r;
                                while (true) {
                                    long j4 = atomicLongFieldUpdater2.get(cVar4);
                                    int i4 = this.indexInArray;
                                    this.nextParkedWorker = cVar4.f4261q.b((int) (j4 & 2097151));
                                    c cVar5 = cVar4;
                                    if (c.f4253r.compareAndSet(cVar5, j4, ((j4 + 2097152) & (-2097152)) | ((long) i4))) {
                                        break;
                                    } else {
                                        cVar4 = cVar5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z3) {
                            h(b.f4250m);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f4244o);
                            this.f4244o = 0L;
                            break;
                        }
                        z3 = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f4251o);
    }
}
