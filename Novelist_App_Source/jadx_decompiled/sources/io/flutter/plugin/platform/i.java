package io.flutter.plugin.platform;

import M1.N;
import a.AbstractC0102a;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import x1.C0498a;

/* loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3182k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View.OnFocusChangeListener f3183l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f3184m;

    public i(View.OnFocusChangeListener onFocusChangeListener, C0498a c0498a) {
        this.f3183l = onFocusChangeListener;
        this.f3184m = c0498a;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.f3182k) {
            case 0:
                j jVar = (j) this.f3184m;
                this.f3183l.onFocusChange(jVar, AbstractC0102a.R(jVar, new N(13)));
                break;
            default:
                C0498a c0498a = (C0498a) this.f3184m;
                this.f3183l.onFocusChange(c0498a, AbstractC0102a.R(c0498a, new N(13)));
                break;
        }
    }

    public i(j jVar, View.OnFocusChangeListener onFocusChangeListener) {
        this.f3184m = jVar;
        this.f3183l = onFocusChangeListener;
    }
}
