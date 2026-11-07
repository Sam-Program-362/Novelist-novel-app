package io.flutter.plugin.platform;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class C implements ViewTreeObserver.OnDrawListener {

    /* renamed from: k, reason: collision with root package name */
    public final View f3153k;

    /* renamed from: l, reason: collision with root package name */
    public B f3154l;

    public C(View view, B b3) {
        this.f3153k = view;
        this.f3154l = b3;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        B b3 = this.f3154l;
        if (b3 == null) {
            return;
        }
        b3.run();
        this.f3154l = null;
        this.f3153k.post(new B(this, 1));
    }
}
