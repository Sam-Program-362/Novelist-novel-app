package b0;

import android.os.Bundle;

/* renamed from: b0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0170q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0171s f2502a;

    public C0170q(AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s) {
        this.f2502a = abstractComponentCallbacksC0171s;
    }

    public final void a() {
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = this.f2502a;
        abstractComponentCallbacksC0171s.f2536Y.b();
        androidx.lifecycle.L.d(abstractComponentCallbacksC0171s);
        Bundle bundle = abstractComponentCallbacksC0171s.f2540l;
        abstractComponentCallbacksC0171s.f2536Y.c(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
