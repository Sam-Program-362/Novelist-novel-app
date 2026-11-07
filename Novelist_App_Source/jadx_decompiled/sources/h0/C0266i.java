package h0;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* renamed from: h0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266i extends AbstractC0261d {

    /* renamed from: c, reason: collision with root package name */
    public final OnBackInvokedDispatcher f2883c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2884d;

    /* renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f2885e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2886f;

    public C0266i(OnBackInvokedDispatcher onBackInvokedDispatcher, int i3) {
        this.f2883c = onBackInvokedDispatcher;
        this.f2884d = i3;
        this.f2885e = Build.VERSION.SDK_INT == 33 ? new C0267j(this, 0) : new C0268k(this, 0);
    }

    @Override // h0.AbstractC0261d
    public final void b(boolean z3) {
        if (z3 && !this.f2886f) {
            this.f2883c.registerOnBackInvokedCallback(this.f2884d, this.f2885e);
            this.f2886f = true;
        } else {
            if (z3 || !this.f2886f) {
                return;
            }
            this.f2883c.unregisterOnBackInvokedCallback(this.f2885e);
            this.f2886f = false;
        }
    }
}
