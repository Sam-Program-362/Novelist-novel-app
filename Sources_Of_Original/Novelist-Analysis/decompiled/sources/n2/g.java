package n2;

import i2.AbstractC0209q;
import i2.AbstractC0214w;
import i2.InterfaceC0215x;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0209q implements InterfaceC0215x {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4156q = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AbstractC0209q f4157m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final k f4158o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f4159p;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g(AbstractC0209q abstractC0209q, int i3) {
        if ((abstractC0209q instanceof InterfaceC0215x ? (InterfaceC0215x) abstractC0209q : null) == null) {
            int i4 = AbstractC0214w.f3036a;
        }
        this.f4157m = abstractC0209q;
        this.n = i3;
        this.f4158o = new k();
        this.f4159p = new Object();
    }

    @Override // i2.AbstractC0209q
    public final void c(R1.h hVar, Runnable runnable) {
        this.f4158o.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4156q;
        if (atomicIntegerFieldUpdater.get(this) < this.n) {
            synchronized (this.f4159p) {
                if (atomicIntegerFieldUpdater.get(this) >= this.n) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableH = h();
                if (runnableH == null) {
                    return;
                }
                this.f4157m.c(this, new A.a(this, runnableH, 9, false));
            }
        }
    }

    public final Runnable h() {
        while (true) {
            Runnable runnable = (Runnable) this.f4158o.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f4159p) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4156q;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f4158o.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // i2.AbstractC0209q
    public final String toString() {
        return this.f4157m + ".limitedParallelism(" + this.n + ')';
    }
}
