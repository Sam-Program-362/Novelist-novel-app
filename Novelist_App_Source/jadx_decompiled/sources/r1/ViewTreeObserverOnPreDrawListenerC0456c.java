package r1;

import android.view.ViewTreeObserver;

/* renamed from: r1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0456c implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n f4351k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0458e f4352l;

    public ViewTreeObserverOnPreDrawListenerC0456c(C0458e c0458e, n nVar) {
        this.f4352l = c0458e;
        this.f4351k = nVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0458e c0458e = this.f4352l;
        if (c0458e.f4360h && c0458e.f4358f != null) {
            this.f4351k.getViewTreeObserver().removeOnPreDrawListener(this);
            c0458e.f4358f = null;
        }
        return c0458e.f4360h;
    }
}
