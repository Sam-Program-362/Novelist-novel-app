package b;

import android.window.OnBackInvokedDispatcher;
import h0.C0266i;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f2342a;

    /* renamed from: b, reason: collision with root package name */
    public final O1.e f2343b = new O1.e(new q(this, 0));

    public t(Runnable runnable) {
        this.f2342a = runnable;
    }

    public final r a() {
        return (r) this.f2343b.a();
    }

    public final void b(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        a().f2338c.d(new C0266i(onBackInvokedDispatcher, 0), 1);
        a().f2338c.d(new C0266i(onBackInvokedDispatcher, 1000000), 0);
    }
}
