package p052r1;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: r1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0263c implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n f4351k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f4352l;

    public ViewTreeObserverOnPreDrawListenerC0263c(e eVar, n nVar) {
        this.f4352l = eVar;
        this.f4351k = nVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        e eVar = this.f4352l;
        if (eVar.f4360h && eVar.f4358f != null) {
            this.f4351k.getViewTreeObserver().removeOnPreDrawListener(this);
            eVar.f4358f = null;
        }
        return eVar.f4360h;
    }
}
