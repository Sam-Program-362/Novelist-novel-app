package H0;

import K0.l;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import f0.C0244a;
import g0.RunnableC0251a;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public C0244a f427a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f428b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f429c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f430d = true;

    /* renamed from: e, reason: collision with root package name */
    public boolean f431e = false;

    /* renamed from: f, reason: collision with root package name */
    public Executor f432f;

    /* renamed from: g, reason: collision with root package name */
    public volatile RunnableC0251a f433g;

    /* renamed from: h, reason: collision with root package name */
    public volatile RunnableC0251a f434h;

    /* renamed from: i, reason: collision with root package name */
    public final Semaphore f435i;

    /* renamed from: j, reason: collision with root package name */
    public final Set f436j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.f435i = new Semaphore(0);
        this.f436j = set;
    }

    public final void a() {
        if (this.f433g != null) {
            boolean z3 = this.f428b;
            if (!z3) {
                if (z3) {
                    c();
                } else {
                    this.f431e = true;
                }
            }
            if (this.f434h != null) {
                this.f433g.getClass();
                this.f433g = null;
                return;
            }
            this.f433g.getClass();
            RunnableC0251a runnableC0251a = this.f433g;
            runnableC0251a.f2830m.set(true);
            if (runnableC0251a.f2828k.cancel(false)) {
                this.f434h = this.f433g;
            }
            this.f433g = null;
        }
    }

    public final void b() {
        if (this.f434h != null || this.f433g == null) {
            return;
        }
        this.f433g.getClass();
        if (this.f432f == null) {
            this.f432f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        RunnableC0251a runnableC0251a = this.f433g;
        Executor executor = this.f432f;
        if (runnableC0251a.f2829l == 1) {
            runnableC0251a.f2829l = 2;
            executor.execute(runnableC0251a.f2828k);
            return;
        }
        int a3 = X.j.a(runnableC0251a.f2829l);
        if (a3 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (a3 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void c() {
        a();
        this.f433g = new RunnableC0251a(this);
        b();
    }

    public final void d() {
        Iterator it2 = this.f436j.iterator();
        if (it2.hasNext()) {
            ((l) it2.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            this.f435i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e3) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e3);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
