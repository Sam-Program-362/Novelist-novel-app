package k;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: k.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0340c implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3662k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f3663l;

    public /* synthetic */ RunnableC0340c(ActionBarOverlayLayout actionBarOverlayLayout, int i3) {
        this.f3662k = i3;
        this.f3663l = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3662k) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f3663l;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1759D = actionBarOverlayLayout.f1766m.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1760E);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f3663l;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1759D = actionBarOverlayLayout2.f1766m.animate().translationY(-actionBarOverlayLayout2.f1766m.getHeight()).setListener(actionBarOverlayLayout2.f1760E);
                break;
        }
    }
}
