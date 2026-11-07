package g0;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC0252b implements Callable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ RunnableC0251a f2832k;

    public CallableC0252b(RunnableC0251a runnableC0251a) {
        this.f2832k = runnableC0251a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        RunnableC0251a runnableC0251a = this.f2832k;
        runnableC0251a.n.set(true);
        try {
            Process.setThreadPriority(10);
            runnableC0251a.f2831o.d();
            Binder.flushPendingCommands();
            return null;
        } finally {
        }
    }
}
