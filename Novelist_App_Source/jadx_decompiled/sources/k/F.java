package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import j.ViewOnTouchListenerC0314a;

/* loaded from: classes.dex */
public final class F implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3592k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ViewOnTouchListenerC0314a f3593l;

    public /* synthetic */ F(ViewOnTouchListenerC0314a viewOnTouchListenerC0314a, int i3) {
        this.f3592k = i3;
        this.f3593l = viewOnTouchListenerC0314a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3592k) {
            case 0:
                ViewParent parent = this.f3593l.n.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                ViewOnTouchListenerC0314a viewOnTouchListenerC0314a = this.f3593l;
                viewOnTouchListenerC0314a.a();
                View view = viewOnTouchListenerC0314a.n;
                if (view.isEnabled() && !view.isLongClickable() && viewOnTouchListenerC0314a.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    viewOnTouchListenerC0314a.f3390q = true;
                    break;
                }
                break;
        }
    }
}
