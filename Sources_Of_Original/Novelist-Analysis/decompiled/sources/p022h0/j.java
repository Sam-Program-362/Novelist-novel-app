package p022h0;

import android.window.OnBackInvokedCallback;
import p052r1.AbstractActivityC0262b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2888b;

    public /* synthetic */ j(Object obj, int i3) {
        this.f2887a = i3;
        this.f2888b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f2887a) {
            case 0:
                ((i) this.f2888b).a();
                break;
            default:
                ((AbstractActivityC0262b) this.f2888b).onBackPressed();
                break;
        }
    }
}
