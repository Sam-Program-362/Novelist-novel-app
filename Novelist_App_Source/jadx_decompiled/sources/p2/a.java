package p2;

import a2.o;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4240s = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    private volatile int indexInArray;

    /* renamed from: k, reason: collision with root package name */
    public final m f4241k;

    /* renamed from: l, reason: collision with root package name */
    public final o f4242l;

    /* renamed from: m, reason: collision with root package name */
    public b f4243m;
    public long n;
    private volatile Object nextParkedWorker;

    /* renamed from: o, reason: collision with root package name */
    public long f4244o;

    /* renamed from: p, reason: collision with root package name */
    public int f4245p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4246q;

    /* renamed from: r, reason: collision with root package name */
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
        int nanoTime = (int) System.nanoTime();
        this.f4245p = nanoTime == 0 ? 42 : nanoTime;
        f(i3);
    }

    public final i a(boolean z3) {
        i e3;
        i e4;
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
                        if (iVar2 != null && iVar2.f4266l) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                    break;
                                }
                            }
                            iVar = iVar2;
                            break loop1;
                        }
                    }
                    int i3 = m.f4277d.get(mVar);
                    int i4 = m.f4276c.get(mVar);
                    while (true) {
                        if (i3 == i4 || m.f4278e.get(mVar) == 0) {
                            break;
                        }
                        i4--;
                        i b3 = mVar.b(i4, true);
                        if (b3 != null) {
                            iVar = b3;
                            break;
                        }
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
            if (z4 && (e4 = e()) != null) {
                return e4;
            }
            mVar.getClass();
            i iVar4 = (i) m.f4275b.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.a();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z4 && (e3 = e()) != null) {
                return e3;
            }
        } else {
            i e5 = e();
            if (e5 != null) {
                return e5;
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
        int d3 = d(2);
        c cVar = this.f4247r;
        if (d3 == 0) {
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
        i iVar;
        long j4;
        long j5;
        i iVar2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f4254s;
        c cVar = this.f4247r;
        int i4 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar3 = null;
        if (i4 < 2) {
            return null;
        }
        int d3 = d(i4);
        int i5 = 0;
        long j6 = Long.MAX_VALUE;
        while (i5 < i4) {
            d3++;
            if (d3 > i4) {
                d3 = 1;
            }
            a aVar = (a) cVar.f4261q.b(d3);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f4241k;
                if (i3 == 3) {
                    iVar = mVar.a();
                    j3 = 0;
                } else {
                    mVar.getClass();
                    int i6 = m.f4277d.get(mVar);
                    int i7 = m.f4276c.get(mVar);
                    boolean z3 = i3 == 1;
                    while (true) {
                        if (i6 == i7) {
                            j3 = 0;
                            break;
                        }
                        j3 = 0;
                        if (!z3 || m.f4278e.get(mVar) != 0) {
                            int i8 = i6 + 1;
                            iVar = mVar.b(i6, z3);
                            if (iVar != null) {
                                break;
                            }
                            i6 = i8;
                        } else {
                            break;
                        }
                    }
                    iVar = iVar3;
                }
                o oVar = this.f4242l;
                if (iVar != null) {
                    oVar.f1713k = iVar;
                    iVar2 = iVar3;
                    j5 = -1;
                    j4 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f4275b;
                        i iVar4 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar4 == null) {
                            j4 = -1;
                            break;
                        }
                        j4 = -1;
                        if (((iVar4.f4266l ? 1 : 2) & i3) == 0) {
                            break;
                        }
                        k.f4273f.getClass();
                        m mVar2 = mVar;
                        long nanoTime = System.nanoTime() - iVar4.f4265k;
                        long j7 = k.f4269b;
                        if (nanoTime < j7) {
                            j5 = j7 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar4, null)) {
                                oVar.f1713k = iVar4;
                                j5 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar2) == iVar4);
                        mVar = mVar2;
                        iVar3 = null;
                    }
                    j5 = -2;
                    iVar2 = iVar3;
                }
                if (j5 == j4) {
                    i iVar5 = (i) oVar.f1713k;
                    oVar.f1713k = iVar2;
                    return iVar5;
                }
                if (j5 > j3) {
                    j6 = Math.min(j6, j5);
                }
            }
            i5++;
            iVar3 = null;
        }
        if (j6 == Long.MAX_VALUE) {
            j6 = 0;
        }
        this.f4244o = j6;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.a.run():void");
    }
}
