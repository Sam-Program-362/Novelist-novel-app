package p031k;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends TouchDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f3667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f3668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f3669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f3670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3672f;

    public f0(Rect rect, Rect rect2, View view) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f3671e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f3668b = rect3;
        Rect rect4 = new Rect();
        this.f3670d = rect4;
        Rect rect5 = new Rect();
        this.f3669c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i3 = -scaledTouchSlop;
        rect4.inset(i3, i3);
        rect5.set(rect2);
        this.f3667a = view;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z4;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z5 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z4 = this.f3672f;
                if (z4 && !this.f3670d.contains(x, y)) {
                    z5 = z4;
                    z3 = false;
                }
            } else if (action != 3) {
                z3 = true;
                z5 = false;
            } else {
                z4 = this.f3672f;
                this.f3672f = false;
            }
            z5 = z4;
            z3 = true;
        } else if (this.f3668b.contains(x, y)) {
            this.f3672f = true;
            z3 = true;
        } else {
            z3 = true;
            z5 = false;
        }
        if (!z5) {
            return false;
        }
        Rect rect = this.f3669c;
        View view = this.f3667a;
        if (!z3 || rect.contains(x, y)) {
            motionEvent.setLocation(x - rect.left, y - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
