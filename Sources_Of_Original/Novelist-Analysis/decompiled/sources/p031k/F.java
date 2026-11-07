package p031k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import p028j.a;

/* JADX INFO: loaded from: classes.dex */
public final class F implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3592k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f3593l;

    public /* synthetic */ F(a aVar, int i3) {
        this.f3592k = i3;
        this.f3593l = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3592k) {
            case 0:
                ViewParent parent = this.f3593l.n.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                a aVar = this.f3593l;
                aVar.a();
                View view = aVar.n;
                if (view.isEnabled() && !view.isLongClickable() && aVar.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    aVar.f3390q = true;
                    break;
                }
                break;
        }
    }
}
