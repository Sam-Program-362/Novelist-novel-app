package i2;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: i2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0195c extends AbstractC0193a {
    public final Thread n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final G f2995o;

    public C0195c(R1.h hVar, Thread thread, G g3) {
        super(hVar, true);
        this.n = thread;
        this.f2995o = g3;
    }

    @Override // i2.W
    public final void m(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.n;
        if (a2.h.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
