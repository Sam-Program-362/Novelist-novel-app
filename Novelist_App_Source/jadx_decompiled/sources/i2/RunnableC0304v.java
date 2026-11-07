package i2;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: i2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0304v extends F implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: t, reason: collision with root package name */
    public static final RunnableC0304v f3035t;
    public static final long u;

    static {
        Long l3;
        RunnableC0304v runnableC0304v = new RunnableC0304v();
        f3035t = runnableC0304v;
        runnableC0304v.l(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        u = timeUnit.toNanos(l3.longValue());
    }

    @Override // i2.G
    public final Thread k() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f3035t.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // i2.F
    public final void o(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.o(runnable);
    }

    public final synchronized void q() {
        int i3 = debugStatus;
        if (i3 == 2 || i3 == 3) {
            debugStatus = 3;
            F.f2967q.set(this, null);
            F.f2968r.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean p3;
        e0.f2997a.set(this);
        try {
            synchronized (this) {
                int i3 = debugStatus;
                if (i3 == 2 || i3 == 3) {
                    if (p3) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j3 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long m3 = m();
                    if (m3 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j3 == Long.MAX_VALUE) {
                            j3 = u + nanoTime;
                        }
                        long j4 = j3 - nanoTime;
                        if (j4 <= 0) {
                            _thread = null;
                            q();
                            if (p()) {
                                return;
                            }
                            k();
                            return;
                        }
                        if (m3 > j4) {
                            m3 = j4;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (m3 > 0) {
                        int i4 = debugStatus;
                        if (i4 == 2 || i4 == 3) {
                            _thread = null;
                            q();
                            if (p()) {
                                return;
                            }
                            k();
                            return;
                        }
                        LockSupport.parkNanos(this, m3);
                    }
                }
            }
        } finally {
            _thread = null;
            q();
            if (!p()) {
                k();
            }
        }
    }

    @Override // i2.F, i2.G
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // i2.AbstractC0300q
    public final String toString() {
        return "DefaultExecutor";
    }
}
