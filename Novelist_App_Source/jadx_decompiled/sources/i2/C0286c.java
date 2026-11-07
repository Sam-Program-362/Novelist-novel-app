package i2;

import java.util.concurrent.locks.LockSupport;

/* renamed from: i2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286c extends AbstractC0284a {
    public final Thread n;

    /* renamed from: o, reason: collision with root package name */
    public final G f2995o;

    public C0286c(R1.h hVar, Thread thread, G g3) {
        super(hVar, true);
        this.n = thread;
        this.f2995o = g3;
    }

    @Override // i2.W
    public final void m(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.n;
        if (a2.h.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
