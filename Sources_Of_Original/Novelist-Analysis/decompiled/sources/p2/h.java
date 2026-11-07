package p2;

import i2.H;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends H {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f4264m;

    @Override // i2.AbstractC0209q
    public final void c(R1.h hVar, Runnable runnable) {
        c cVar = this.f4264m;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f4253r;
        cVar.b(runnable, false);
    }
}
