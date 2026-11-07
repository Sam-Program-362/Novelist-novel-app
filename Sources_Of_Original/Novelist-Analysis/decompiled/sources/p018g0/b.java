package p018g0;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Callable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a f2832k;

    public b(a aVar) {
        this.f2832k = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        a aVar = this.f2832k;
        aVar.n.set(true);
        try {
            Process.setThreadPriority(10);
            aVar.f2831o.d();
            Binder.flushPendingCommands();
            aVar.a(null);
            return null;
        } catch (Throwable th) {
            try {
                aVar.f2830m.set(true);
                throw th;
            } catch (Throwable th2) {
                aVar.a(null);
                throw th2;
            }
        }
    }
}
