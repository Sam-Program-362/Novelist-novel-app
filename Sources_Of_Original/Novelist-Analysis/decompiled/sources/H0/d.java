package H0;

import K0.l;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p014f0.a f427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f428b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f429c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f430d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f431e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile p018g0.a f433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile p018g0.a f434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Semaphore f435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
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
            p018g0.a aVar = this.f433g;
            aVar.f2830m.set(true);
            if (aVar.f2828k.cancel(false)) {
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
        p018g0.a aVar = this.f433g;
        Executor executor = this.f432f;
        if (aVar.f2829l == 1) {
            aVar.f2829l = 2;
            executor.execute(aVar.f2828k);
            return;
        }
        int iA = X.j.a(aVar.f2829l);
        if (iA == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (iA == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void c() {
        a();
        this.f433g = new p018g0.a(this);
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
