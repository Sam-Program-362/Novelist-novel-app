package k;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class L implements View.OnTouchListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ M f3612k;

    public L(M m3) {
        this.f3612k = m3;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r rVar;
        M m3 = this.f3612k;
        J j3 = m3.x;
        Handler handler = m3.f3616B;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && (rVar = m3.f3620F) != null && rVar.isShowing() && x >= 0 && x < m3.f3620F.getWidth() && y >= 0 && y < m3.f3620F.getHeight()) {
            handler.postDelayed(j3, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(j3);
        return false;
    }
}
