package p018g0;

import H0.d;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Handler f2827p;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d f2831o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile int f2829l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f2830m = new AtomicBoolean();
    public final AtomicBoolean n = new AtomicBoolean();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f2828k = new c(this, new b(this));

    public a(d dVar) {
        this.f2831o = dVar;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (a.class) {
            try {
                if (f2827p == null) {
                    f2827p = new Handler(Looper.getMainLooper());
                }
                handler = f2827p;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new A.a(this, obj, 4, false));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2831o.b();
    }
}
