package io.flutter.plugin.platform;

import M1.N;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class i implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3182k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ View.OnFocusChangeListener f3183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f3184m;

    public i(View.OnFocusChangeListener onFocusChangeListener, p065x1.a aVar) {
        this.f3183l = onFocusChangeListener;
        this.f3184m = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        switch (this.f3182k) {
            case 0:
                j jVar = (j) this.f3184m;
                this.f3183l.onFocusChange(jVar, p000a.a.R(jVar, new N(13)));
                break;
            default:
                p065x1.a aVar = (p065x1.a) this.f3184m;
                this.f3183l.onFocusChange(aVar, p000a.a.R(aVar, new N(13)));
                break;
        }
    }

    public i(j jVar, View.OnFocusChangeListener onFocusChangeListener) {
        this.f3184m = jVar;
        this.f3183l = onFocusChangeListener;
    }
}
