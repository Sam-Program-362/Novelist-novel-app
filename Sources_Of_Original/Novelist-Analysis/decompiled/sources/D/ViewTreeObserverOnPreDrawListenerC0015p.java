package D;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: D.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0015p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f254k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ViewTreeObserver f255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Runnable f256m;

    public ViewTreeObserverOnPreDrawListenerC0015p(View view, Runnable runnable) {
        this.f254k = view;
        this.f255l = view.getViewTreeObserver();
        this.f256m = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        ViewTreeObserverOnPreDrawListenerC0015p viewTreeObserverOnPreDrawListenerC0015p = new ViewTreeObserverOnPreDrawListenerC0015p(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0015p);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0015p);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f255l.isAlive();
        View view = this.f254k;
        if (zIsAlive) {
            this.f255l.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f256m.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f255l = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.f255l.isAlive();
        View view2 = this.f254k;
        if (zIsAlive) {
            this.f255l.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
