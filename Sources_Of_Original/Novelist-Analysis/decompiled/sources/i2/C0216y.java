package i2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: i2.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0216y extends n2.q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3037o = AtomicIntegerFieldUpdater.newUpdater(C0216y.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // n2.q, i2.W
    public final void m(Object obj) {
        n(obj);
    }

    @Override // n2.q, i2.W
    public final void n(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f3037o;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                n2.a.h(H2.h.s(this.n), AbstractC0212u.h(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
