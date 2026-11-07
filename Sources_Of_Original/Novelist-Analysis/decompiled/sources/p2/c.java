package p2;

import i2.AbstractC0212u;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import n2.p;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4253r = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4254s = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4255t = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final B1.g u = new B1.g("NOT_IN_STACK", 18);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4256k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f4258m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f f4259o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f4260p;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p f4261q;

    public c(int i3, int i4, long j3, String str) {
        this.f4256k = i3;
        this.f4257l = i4;
        this.f4258m = j3;
        this.n = str;
        if (i3 < 1) {
            throw new IllegalArgumentException(B1.e.h("Core pool size ", i3, " should be at least 1").toString());
        }
        if (i4 < i3) {
            throw new IllegalArgumentException(B1.e.i("Max pool size ", i4, " should be greater than or equals to core pool size ", i3).toString());
        }
        if (i4 > 2097150) {
            throw new IllegalArgumentException(B1.e.h("Max pool size ", i4, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
        }
        this.f4259o = new f();
        this.f4260p = new f();
        this.f4261q = new p((i3 + 1) * 2);
        this.controlState$volatile = ((long) i3) << 42;
        this._isTerminated$volatile = 0;
    }

    public final int a() {
        synchronized (this.f4261q) {
            try {
                if (f4255t.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f4254s;
                long j3 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j3 & 2097151);
                int i4 = i3 - ((int) ((j3 & 4398044413952L) >> 21));
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i4 >= this.f4256k) {
                    return 0;
                }
                if (i3 >= this.f4257l) {
                    return 0;
                }
                int i5 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i5 <= 0 || this.f4261q.b(i5) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i5);
                this.f4261q.c(i5, aVar);
                if (i5 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i6 = i4 + 1;
                aVar.start();
                return i6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z3) {
        i jVar;
        b bVar;
        k.f4273f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f4265k = jNanoTime;
            jVar.f4266l = z3;
        } else {
            jVar = new j(runnable, jNanoTime, z3);
        }
        boolean z4 = jVar.f4266l;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4254s;
        long jAddAndGet = z4 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !a2.h.a(aVar.f4247r, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f4243m) != b.f4251o && (jVar.f4266l || bVar != b.f4249l)) {
            aVar.f4246q = true;
            m mVar = aVar.f4241k;
            mVar.getClass();
            jVar = (i) m.f4275b.getAndSet(mVar, jVar);
            if (jVar == null) {
                jVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = mVar.f4279a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = m.f4276c;
                if (atomicIntegerFieldUpdater.get(mVar) - m.f4277d.get(mVar) != 127) {
                    if (jVar.f4266l) {
                        m.f4278e.incrementAndGet(mVar);
                    }
                    int i3 = atomicIntegerFieldUpdater.get(mVar) & 127;
                    while (atomicReferenceArray.get(i3) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i3, jVar);
                    atomicIntegerFieldUpdater.incrementAndGet(mVar);
                    jVar = null;
                }
            }
        }
        if (jVar != null) {
            if (!(jVar.f4266l ? this.f4260p.a(jVar) : this.f4259o.a(jVar))) {
                throw new RejectedExecutionException(B1.e.m(new StringBuilder(), this.n, " was terminated"));
            }
        }
        if (z4) {
            if (e() || d(jAddAndGet)) {
                return;
            }
            e();
            return;
        }
        if (e() || d(atomicLongFieldUpdater.get(this))) {
            return;
        }
        e();
    }

    public final void c(a aVar, int i3, int i4) {
        while (true) {
            long j3 = f4253r.get(this);
            int i5 = (int) (2097151 & j3);
            long j4 = (2097152 + j3) & (-2097152);
            if (i5 == i3) {
                if (i4 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == u) {
                            i5 = -1;
                            break;
                        }
                        if (objC == null) {
                            i5 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i5 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i5 = i4;
                }
            }
            if (i5 >= 0) {
                if (f4253r.compareAndSet(this, j3, ((long) i5) | j4)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i3;
        i iVarA;
        if (f4255t.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !a2.h.a(aVar.f4247r, this)) {
                aVar = null;
            }
            synchronized (this.f4261q) {
                i3 = (int) (f4254s.get(this) & 2097151);
            }
            if (1 <= i3) {
                int i4 = 1;
                while (true) {
                    Object objB = this.f4261q.b(i4);
                    a2.h.b(objB);
                    a aVar2 = (a) objB;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f4241k;
                        f fVar = this.f4260p;
                        mVar.getClass();
                        i iVar = (i) m.f4275b.getAndSet(mVar, null);
                        if (iVar != null) {
                            fVar.a(iVar);
                        }
                        while (true) {
                            i iVarA2 = mVar.a();
                            if (iVarA2 == null) {
                                break;
                            } else {
                                fVar.a(iVarA2);
                            }
                        }
                    }
                    if (i4 == i3) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            this.f4260p.b();
            this.f4259o.b();
            while (true) {
                if (aVar != null) {
                    iVarA = aVar.a(true);
                    if (iVarA == null) {
                        iVarA = (i) this.f4259o.d();
                        if (iVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    iVarA = (i) this.f4259o.d();
                    if (iVarA == null && (iVarA = (i) this.f4260p.d()) == null) {
                        break;
                    }
                }
                try {
                    iVarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(b.f4251o);
            }
            f4253r.set(this, 0L);
            f4254s.set(this, 0L);
        }
    }

    public final boolean d(long j3) {
        int i3 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = this.f4256k;
        if (i3 < i4) {
            int iA = a();
            if (iA == 1 && i4 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        B1.g gVar;
        int iB;
        while (true) {
            long j3 = f4253r.get(this);
            a aVar = (a) this.f4261q.b((int) (2097151 & j3));
            if (aVar == null) {
                aVar = null;
            } else {
                long j4 = (2097152 + j3) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    gVar = u;
                    if (objC == gVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0) {
                    if (f4253r.compareAndSet(this, j3, ((long) iB) | j4)) {
                        aVar.g(gVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f4240s.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, false);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.f4261q;
        int iA = pVar.a();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 1; i8 < iA; i8++) {
            a aVar = (a) pVar.b(i8);
            if (aVar != null) {
                m mVar = aVar.f4241k;
                mVar.getClass();
                int i9 = m.f4275b.get(mVar) != null ? (m.f4276c.get(mVar) - m.f4277d.get(mVar)) + 1 : m.f4276c.get(mVar) - m.f4277d.get(mVar);
                int iOrdinal = aVar.f4243m.ordinal();
                if (iOrdinal == 0) {
                    i3++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i9);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i4++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i9);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i5++;
                } else if (iOrdinal == 3) {
                    i6++;
                    if (i9 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i9);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new D0.a();
                    }
                    i7++;
                }
            }
        }
        long j3 = f4254s.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.n);
        sb4.append('@');
        sb4.append(AbstractC0212u.c(this));
        sb4.append("[Pool Size {core = ");
        int i10 = this.f4256k;
        sb4.append(i10);
        sb4.append(", max = ");
        sb4.append(this.f4257l);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i3);
        sb4.append(", blocking = ");
        sb4.append(i4);
        sb4.append(", parked = ");
        sb4.append(i5);
        sb4.append(", dormant = ");
        sb4.append(i6);
        sb4.append(", terminated = ");
        sb4.append(i7);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f4259o.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f4260p.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j3));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j3) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i10 - ((int) ((j3 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
