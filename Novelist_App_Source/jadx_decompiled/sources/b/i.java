package b;

import M1.RunnableC0053b;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.concurrent.Executor;
import org.apache.tika.pipes.PipesConfigBase;

/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: k, reason: collision with root package name */
    public final long f2297k = SystemClock.uptimeMillis() + PipesConfigBase.DEFAULT_MAX_FILES_PROCESSED_PER_PROCESS;

    /* renamed from: l, reason: collision with root package name */
    public Runnable f2298l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2299m;
    public final /* synthetic */ SignInHubActivity n;

    public i(SignInHubActivity signInHubActivity) {
        this.n = signInHubActivity;
    }

    public final void a(View view) {
        if (this.f2299m) {
            return;
        }
        this.f2299m = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a2.h.e(runnable, "runnable");
        this.f2298l = runnable;
        View decorView = this.n.getWindow().getDecorView();
        a2.h.d(decorView, "getDecorView(...)");
        if (!this.f2299m) {
            decorView.postOnAnimation(new RunnableC0053b(this, 4));
        } else if (a2.h.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z3;
        Runnable runnable = this.f2298l;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f2297k) {
                this.f2299m = false;
                this.n.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f2298l = null;
        n nVar = (n) this.n.f2313q.a();
        synchronized (nVar.f2326b) {
            z3 = nVar.f2327c;
        }
        if (z3) {
            this.f2299m = false;
            this.n.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.n.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
