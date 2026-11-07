package i2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class M extends S {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2976f = AtomicIntegerFieldUpdater.newUpdater(M.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Q f2977e;

    public M(Q q3) {
        this.f2977e = q3;
    }

    @Override // i2.S
    public final boolean k() {
        return true;
    }

    @Override // i2.S
    public final void l(Throwable th) {
        if (f2976f.compareAndSet(this, 0, 1)) {
            this.f2977e.f(th);
        }
    }
}
