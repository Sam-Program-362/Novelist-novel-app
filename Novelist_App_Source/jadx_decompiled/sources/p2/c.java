package p2;

import i2.AbstractC0303u;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import n2.p;

/* loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4253r = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4254s = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4255t = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final B1.g u = new B1.g("NOT_IN_STACK", 18);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: k, reason: collision with root package name */
    public final int f4256k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4257l;

    /* renamed from: m, reason: collision with root package name */
    public final long f4258m;
    public final String n;

    /* renamed from: o, reason: collision with root package name */
    public final f f4259o;

    /* renamed from: p, reason: collision with root package name */
    public final f f4260p;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: q, reason: collision with root package name */
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
        this.controlState$volatile = i3 << 42;
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
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f4265k = nanoTime;
            jVar.f4266l = z3;
        } else {
            jVar = new j(runnable, nanoTime, z3);
        }
        boolean z4 = jVar.f4266l;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4254s;
        long addAndGet = z4 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread currentThread = Thread.currentThread();
        a aVar = currentThread instanceof a ? (a) currentThread : null;
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
            if (e() || d(addAndGet)) {
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
                    Object c3 = aVar.c();
                    while (true) {
                        if (c3 == u) {
                            i5 = -1;
                            break;
                        }
                        if (c3 == null) {
                            i5 = 0;
                            break;
                        }
                        a aVar2 = (a) c3;
                        int b3 = aVar2.b();
                        if (b3 != 0) {
                            i5 = b3;
                            break;
                        }
                        c3 = aVar2.c();
                    }
                } else {
                    i5 = i4;
                }
            }
            if (i5 >= 0) {
                if (f4253r.compareAndSet(this, j3, i5 | j4)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p2.c.f4255t
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof p2.a
            r3 = 0
            if (r1 == 0) goto L17
            p2.a r0 = (p2.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            p2.c r1 = r0.f4247r
            boolean r1 = a2.h.a(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            n2.p r1 = r8.f4261q
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = p2.c.f4254s     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            n2.p r5 = r8.f4261q
            java.lang.Object r5 = r5.b(r1)
            a2.h.b(r5)
            p2.a r5 = (p2.a) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            p2.m r5 = r5.f4241k
            p2.f r6 = r8.f4260p
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = p2.m.f4275b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            p2.i r7 = (p2.i) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            p2.i r7 = r5.a()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            p2.f r1 = r8.f4260p
            r1.b()
            p2.f r1 = r8.f4259o
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            p2.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            p2.f r1 = r8.f4259o
            java.lang.Object r1 = r1.d()
            p2.i r1 = (p2.i) r1
            if (r1 != 0) goto Lb2
            p2.f r1 = r8.f4260p
            java.lang.Object r1 = r1.d()
            p2.i r1 = (p2.i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            p2.b r1 = p2.b.f4251o
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p2.c.f4253r
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p2.c.f4254s
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.c.close():void");
    }

    public final boolean d(long j3) {
        int i3 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = this.f4256k;
        if (i3 < i4) {
            int a3 = a();
            if (a3 == 1 && i4 > 1) {
                a();
            }
            if (a3 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        B1.g gVar;
        int i3;
        while (true) {
            long j3 = f4253r.get(this);
            a aVar = (a) this.f4261q.b((int) (2097151 & j3));
            if (aVar == null) {
                aVar = null;
            } else {
                long j4 = (2097152 + j3) & (-2097152);
                Object c3 = aVar.c();
                while (true) {
                    gVar = u;
                    if (c3 == gVar) {
                        i3 = -1;
                        break;
                    }
                    if (c3 == null) {
                        i3 = 0;
                        break;
                    }
                    a aVar2 = (a) c3;
                    i3 = aVar2.b();
                    if (i3 != 0) {
                        break;
                    }
                    c3 = aVar2.c();
                }
                if (i3 >= 0) {
                    if (f4253r.compareAndSet(this, j3, i3 | j4)) {
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
        int a3 = pVar.a();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 1; i8 < a3; i8++) {
            a aVar = (a) pVar.b(i8);
            if (aVar != null) {
                m mVar = aVar.f4241k;
                mVar.getClass();
                int i9 = m.f4275b.get(mVar) != null ? (m.f4276c.get(mVar) - m.f4277d.get(mVar)) + 1 : m.f4276c.get(mVar) - m.f4277d.get(mVar);
                int ordinal = aVar.f4243m.ordinal();
                if (ordinal == 0) {
                    i3++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i9);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (ordinal == 1) {
                    i4++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i9);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (ordinal == 2) {
                    i5++;
                } else if (ordinal == 3) {
                    i6++;
                    if (i9 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i9);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (ordinal != 4) {
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
        sb4.append(AbstractC0303u.c(this));
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
