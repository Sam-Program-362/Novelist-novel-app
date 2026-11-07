package i2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: i2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0207o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3016b = AtomicIntegerFieldUpdater.newUpdater(C0207o.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f3017a;

    public C0207o(Throwable th, boolean z3) {
        this.f3017a = th;
        this._handled$volatile = z3 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f3017a + ']';
    }
}
