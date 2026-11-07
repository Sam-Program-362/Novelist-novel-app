package p2;

import i2.H;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public abstract class h extends H {

    /* renamed from: m, reason: collision with root package name */
    public c f4264m;

    @Override // i2.AbstractC0300q
    public final void c(R1.h hVar, Runnable runnable) {
        c cVar = this.f4264m;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f4253r;
        cVar.b(runnable, false);
    }
}
