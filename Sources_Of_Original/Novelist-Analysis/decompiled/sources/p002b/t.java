package p002b;

import O1.e;
import android.window.OnBackInvokedDispatcher;
import p022h0.i;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f2342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f2343b = new e(new q(this, 0));

    public t(Runnable runnable) {
        this.f2342a = runnable;
    }

    public final r a() {
        return (r) this.f2343b.a();
    }

    public final void b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        a().f2338c.d(new i(onBackInvokedDispatcher, 0), 1);
        a().f2338c.d(new i(onBackInvokedDispatcher, 1000000), 0);
    }
}
