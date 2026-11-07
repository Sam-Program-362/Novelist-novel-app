package n2;

import i2.AbstractC0300q;
import i2.AbstractC0305w;
import i2.InterfaceC0306x;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class g extends AbstractC0300q implements InterfaceC0306x {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4156q = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC0300q f4157m;
    public final int n;

    /* renamed from: o, reason: collision with root package name */
    public final k f4158o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f4159p;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g(AbstractC0300q abstractC0300q, int i3) {
        if ((abstractC0300q instanceof InterfaceC0306x ? (InterfaceC0306x) abstractC0300q : null) == null) {
            int i4 = AbstractC0305w.f3036a;
        }
        this.f4157m = abstractC0300q;
        this.n = i3;
        this.f4158o = new k();
        this.f4159p = new Object();
    }

    @Override // i2.AbstractC0300q
    public final void c(R1.h hVar, Runnable runnable) {
        this.f4158o.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4156q;
        if (atomicIntegerFieldUpdater.get(this) < this.n) {
            synchronized (this.f4159p) {
                if (atomicIntegerFieldUpdater.get(this) >= this.n) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable h3 = h();
                if (h3 == null) {
                    return;
                }
                this.f4157m.c(this, new A.a(this, h3, 9, false));
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

    @Override // i2.AbstractC0300q
    public final String toString() {
        return this.f4157m + ".limitedParallelism(" + this.n + ')';
    }
}
