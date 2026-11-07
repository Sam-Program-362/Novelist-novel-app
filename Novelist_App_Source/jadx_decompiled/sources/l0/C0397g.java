package l0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* renamed from: l0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0397g {
    public static final int[] x = {R.attr.state_pressed};
    public static final int[] y = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f3970a;

    /* renamed from: b, reason: collision with root package name */
    public final StateListDrawable f3971b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f3972c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3973d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3974e;

    /* renamed from: f, reason: collision with root package name */
    public final StateListDrawable f3975f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f3976g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3977h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3978i;

    /* renamed from: j, reason: collision with root package name */
    public float f3979j;

    /* renamed from: k, reason: collision with root package name */
    public float f3980k;
    public final RecyclerView n;
    public final ValueAnimator u;

    /* renamed from: v, reason: collision with root package name */
    public int f3989v;

    /* renamed from: w, reason: collision with root package name */
    public final A.b f3990w;

    /* renamed from: l, reason: collision with root package name */
    public int f3981l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f3982m = 0;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f3983o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f3984p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f3985q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f3986r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f3987s = new int[2];

    /* renamed from: t, reason: collision with root package name */
    public final int[] f3988t = new int[2];

    public C0397g(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i3, int i4, int i5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.u = ofFloat;
        this.f3989v = 0;
        A.b bVar = new A.b(this, 12);
        this.f3990w = bVar;
        C0394d c0394d = new C0394d();
        this.f3971b = stateListDrawable;
        this.f3972c = drawable;
        this.f3975f = stateListDrawable2;
        this.f3976g = drawable2;
        this.f3973d = Math.max(i3, stateListDrawable.getIntrinsicWidth());
        this.f3974e = Math.max(i3, drawable.getIntrinsicWidth());
        this.f3977h = Math.max(i3, stateListDrawable2.getIntrinsicWidth());
        this.f3978i = Math.max(i3, drawable2.getIntrinsicWidth());
        this.f3970a = i5;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0395e(this));
        ofFloat.addUpdateListener(new C0396f(this));
        RecyclerView recyclerView2 = this.n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f2257t;
            AbstractC0410t abstractC0410t = recyclerView2.f2256s;
            if (abstractC0410t != null) {
                abstractC0410t.a("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.n;
            recyclerView3.u.remove(this);
            if (recyclerView3.f2258v == this) {
                recyclerView3.f2258v = null;
            }
            ArrayList arrayList2 = this.n.f2240i0;
            if (arrayList2 != null) {
                arrayList2.remove(c0394d);
            }
            this.n.removeCallbacks(bVar);
        }
        this.n = recyclerView;
        ArrayList arrayList3 = recyclerView.f2257t;
        AbstractC0410t abstractC0410t2 = recyclerView.f2256s;
        if (abstractC0410t2 != null) {
            abstractC0410t2.a("Cannot add item decoration during a scroll  or layout");
        }
        if (arrayList3.isEmpty()) {
            recyclerView.setWillNotDraw(false);
        }
        arrayList3.add(this);
        recyclerView.m();
        recyclerView.requestLayout();
        this.n.u.add(this);
        RecyclerView recyclerView4 = this.n;
        if (recyclerView4.f2240i0 == null) {
            recyclerView4.f2240i0 = new ArrayList();
        }
        recyclerView4.f2240i0.add(c0394d);
    }

    public static int d(float f3, float f4, int[] iArr, int i3, int i4, int i5) {
        int i6 = iArr[1] - iArr[0];
        if (i6 != 0) {
            int i7 = i3 - i5;
            int i8 = (int) (((f4 - f3) / i6) * i7);
            int i9 = i4 + i8;
            if (i9 < i7 && i9 >= 0) {
                return i8;
            }
        }
        return 0;
    }

    public final boolean a(float f3, float f4) {
        return f4 >= ((float) (this.f3982m - this.f3977h)) && f3 >= ((float) (0 - (0 / 2))) && f3 <= ((float) ((0 / 2) + 0));
    }

    public final boolean b(float f3, float f4) {
        Field field = D.G.f187a;
        int layoutDirection = this.n.getLayoutDirection();
        int i3 = this.f3973d;
        if (layoutDirection != 1 ? f3 >= this.f3981l - i3 : f3 <= i3 / 2) {
            int i4 = 0 / 2;
            if (f4 >= 0 - i4 && f4 <= i4 + 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(MotionEvent motionEvent) {
        int i3 = this.f3985q;
        if (i3 != 1) {
            return i3 == 2;
        }
        boolean b3 = b(motionEvent.getX(), motionEvent.getY());
        boolean a3 = a(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!b3 && !a3) {
            return false;
        }
        if (a3) {
            this.f3986r = 1;
            this.f3980k = (int) motionEvent.getX();
        } else if (b3) {
            this.f3986r = 2;
            this.f3979j = (int) motionEvent.getY();
        }
        e(2);
        return true;
    }

    public final void e(int i3) {
        A.b bVar = this.f3990w;
        StateListDrawable stateListDrawable = this.f3971b;
        if (i3 == 2 && this.f3985q != 2) {
            stateListDrawable.setState(x);
            this.n.removeCallbacks(bVar);
        }
        if (i3 == 0) {
            this.n.invalidate();
        } else {
            f();
        }
        if (this.f3985q == 2 && i3 != 2) {
            stateListDrawable.setState(y);
            this.n.removeCallbacks(bVar);
            this.n.postDelayed(bVar, 1200);
        } else if (i3 == 1) {
            this.n.removeCallbacks(bVar);
            this.n.postDelayed(bVar, 1500);
        }
        this.f3985q = i3;
    }

    public final void f() {
        int i3 = this.f3989v;
        ValueAnimator valueAnimator = this.u;
        if (i3 != 0) {
            if (i3 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f3989v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
