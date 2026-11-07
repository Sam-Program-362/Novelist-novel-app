package i2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class I extends H implements InterfaceC0306x {

    /* renamed from: m, reason: collision with root package name */
    public final Executor f2973m;

    public I(Executor executor) {
        this.f2973m = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // i2.AbstractC0300q
    public final void c(R1.h hVar, Runnable runnable) {
        try {
            this.f2973m.execute(runnable);
        } catch (RejectedExecutionException e3) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e3);
            N n = (N) hVar.e(r.f3022l);
            if (n != null) {
                n.b(cancellationException);
            }
            p2.e eVar = A.f2964a;
            p2.d.f4262m.c(hVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f2973m;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof I) && ((I) obj).f2973m == this.f2973m;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2973m);
    }

    @Override // i2.AbstractC0300q
    public final String toString() {
        return this.f2973m.toString();
    }
}
