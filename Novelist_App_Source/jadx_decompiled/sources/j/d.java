package j;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class d implements View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3396k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f3397l;

    public /* synthetic */ d(l lVar, int i3) {
        this.f3396k = i3;
        this.f3397l = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i3 = this.f3396k;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f3396k) {
            case 0:
                g gVar = (g) this.f3397l;
                ViewTreeObserver viewTreeObserver = gVar.f3412H;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.f3412H = view.getViewTreeObserver();
                    }
                    gVar.f3412H.removeGlobalOnLayoutListener(gVar.f3421s);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                s sVar = (s) this.f3397l;
                ViewTreeObserver viewTreeObserver2 = sVar.y;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sVar.y = view.getViewTreeObserver();
                    }
                    sVar.y.removeGlobalOnLayoutListener(sVar.f3497s);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
