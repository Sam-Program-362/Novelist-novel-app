package h0;

import android.window.OnBackInvokedCallback;
import r1.AbstractActivityC0455b;

/* renamed from: h0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0267j implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2887a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2888b;

    public /* synthetic */ C0267j(Object obj, int i3) {
        this.f2887a = i3;
        this.f2888b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f2887a) {
            case 0:
                ((C0266i) this.f2888b).a();
                break;
            default:
                ((AbstractActivityC0455b) this.f2888b).onBackPressed();
                break;
        }
    }
}
