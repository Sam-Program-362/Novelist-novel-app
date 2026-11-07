package g0;

import H0.d;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0251a implements Runnable {

    /* renamed from: p, reason: collision with root package name */
    public static Handler f2827p;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d f2831o;

    /* renamed from: l, reason: collision with root package name */
    public volatile int f2829l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f2830m = new AtomicBoolean();
    public final AtomicBoolean n = new AtomicBoolean();

    /* renamed from: k, reason: collision with root package name */
    public final C0253c f2828k = new C0253c(this, new CallableC0252b(this));

    public RunnableC0251a(d dVar) {
        this.f2831o = dVar;
    }

    public final void a(Object obj) {
        Handler handler;
        synchronized (RunnableC0251a.class) {
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
