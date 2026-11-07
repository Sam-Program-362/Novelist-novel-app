package p028j;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p031k.C0228f;
import p031k.C0229g;
import p031k.C0230h;
import p031k.C0231i;
import p031k.D;
import p031k.F;

/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f3385k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f3386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f3387m;
    public final View n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public F f3388o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public F f3389p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3390q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f3391r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f3392s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f3393t;
    public final /* synthetic */ View u;

    public a(View view) {
        this.f3392s = new int[2];
        this.n = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f3385k = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f3386l = tapTimeout;
        this.f3387m = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        F f3 = this.f3389p;
        View view = this.n;
        if (f3 != null) {
            view.removeCallbacks(f3);
        }
        F f4 = this.f3388o;
        if (f4 != null) {
            view.removeCallbacks(f4);
        }
    }

    public final l b() {
        C0228f c0228f;
        switch (this.f3393t) {
            case 0:
                b bVar = ((ActionMenuItemView) this.u).f1720t;
                if (bVar == null || (c0228f = ((C0229g) bVar).f3673a.f3696C) == null) {
                    return null;
                }
                return c0228f.a();
            default:
                C0228f c0228f2 = ((C0230h) this.u).f3679m.f3695B;
                if (c0228f2 == null) {
                    return null;
                }
                return c0228f2.a();
        }
    }

    public final boolean c() {
        l lVarB;
        switch (this.f3393t) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.u;
                i iVar = actionMenuItemView.f1718r;
                return iVar != null && iVar.a(actionMenuItemView.f1715o) && (lVarB = b()) != null && lVarB.h();
            default:
                ((C0230h) this.u).f3679m.h();
                return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z3;
        C0231i c0231i;
        boolean z4;
        l lVarB;
        D d3;
        boolean z5 = this.f3390q;
        View view2 = this.n;
        if (z5) {
            l lVarB2 = b();
            if (lVarB2 == null || !lVarB2.h() || (d3 = (D) lVarB2.e()) == null || !d3.isShown()) {
                switch (this.f3393t) {
                    case 1:
                        c0231i = ((C0230h) this.u).f3679m;
                        if (c0231i.f3697D != null) {
                            c0231i.e();
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        break;
                    default:
                        lVarB = b();
                        if (lVarB != null && lVarB.h()) {
                            lVarB.dismiss();
                        }
                        z4 = true;
                        break;
                }
                if (z4) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f3392s;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                d3.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zB = d3.b(this.f3391r, motionEventObtainNoHistory);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z6 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zB && z6) {
                    z3 = true;
                } else {
                    switch (this.f3393t) {
                        case 1:
                            c0231i = ((C0230h) this.u).f3679m;
                            if (c0231i.f3697D != null) {
                                c0231i.e();
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            break;
                        default:
                            lVarB = b();
                            if (lVarB != null) {
                                lVarB.dismiss();
                            }
                            z4 = true;
                            break;
                    }
                    if (z4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f3391r = motionEvent.getPointerId(0);
                    if (this.f3388o == null) {
                        this.f3388o = new F(this, 0);
                    }
                    view2.postDelayed(this.f3388o, this.f3386l);
                    if (this.f3389p == null) {
                        this.f3389p = new F(this, 1);
                    }
                    view2.postDelayed(this.f3389p, this.f3387m);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f3391r);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f3 = this.f3385k;
                        float f4 = -f3;
                        if (x < f4 || y < f4 || x >= (view2.getRight() - view2.getLeft()) + f3 || y >= (view2.getBottom() - view2.getTop()) + f3) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z3 = c();
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
            }
            if (z3) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f3390q = z3;
        return z3 || z5;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f3390q = false;
        this.f3391r = -1;
        F f3 = this.f3388o;
        if (f3 != null) {
            this.n.removeCallbacks(f3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.f3393t = 0;
        this.u = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(C0230h c0230h, C0230h c0230h2) {
        this(c0230h2);
        this.f3393t = 1;
        this.u = c0230h;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
