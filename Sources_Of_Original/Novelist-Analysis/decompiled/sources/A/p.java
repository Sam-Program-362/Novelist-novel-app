package A;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Executor {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f42k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f43l;

    public /* synthetic */ p(Handler handler, int i3) {
        this.f42k = i3;
        this.f43l = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f42k) {
            case 0:
                runnable.getClass();
                Handler handler = this.f43l;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 1:
                this.f43l.post(runnable);
                return;
            case 2:
                runnable.getClass();
                Handler handler2 = this.f43l;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
            default:
                ((Z0.d) this.f43l).post(runnable);
                return;
        }
    }

    public p() {
        this.f42k = 3;
        Z0.d dVar = new Z0.d(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f43l = dVar;
    }
}
