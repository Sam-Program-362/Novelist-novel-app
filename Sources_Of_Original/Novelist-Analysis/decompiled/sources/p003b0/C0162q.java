package p003b0;

import android.os.Bundle;
import androidx.lifecycle.L;

/* JADX INFO: renamed from: b0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0162q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC0163s f2502a;

    public C0162q(AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s) {
        this.f2502a = abstractComponentCallbacksC0163s;
    }

    public final void a() {
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = this.f2502a;
        abstractComponentCallbacksC0163s.f2536Y.b();
        L.d(abstractComponentCallbacksC0163s);
        Bundle bundle = abstractComponentCallbacksC0163s.f2540l;
        abstractComponentCallbacksC0163s.f2536Y.c(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
