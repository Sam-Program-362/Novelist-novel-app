package g0;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0253c extends FutureTask {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ RunnableC0251a f2833k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0253c(RunnableC0251a runnableC0251a, CallableC0252b callableC0252b) {
        super(callableC0252b);
        this.f2833k = runnableC0251a;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        RunnableC0251a runnableC0251a = this.f2833k;
        AtomicBoolean atomicBoolean = runnableC0251a.n;
        try {
            Object obj = get();
            if (atomicBoolean.get()) {
                return;
            }
            runnableC0251a.a(obj);
        } catch (InterruptedException e3) {
            Log.w("AsyncTask", e3);
        } catch (CancellationException unused) {
            if (atomicBoolean.get()) {
                return;
            }
            runnableC0251a.a(null);
        } catch (ExecutionException e4) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e4.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
