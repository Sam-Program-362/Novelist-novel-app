package androidx.appcompat.widget;

import D.G;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import f.AbstractC0243a;
import it.returntrue.novelist.R;
import java.lang.reflect.Field;
import k.C0338a;
import k.U;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public boolean f1737k;

    /* renamed from: l, reason: collision with root package name */
    public View f1738l;

    /* renamed from: m, reason: collision with root package name */
    public View f1739m;
    public Drawable n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f1740o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f1741p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f1742q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1743r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1744s;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0338a c0338a = new C0338a(this);
        Field field = G.f187a;
        setBackground(c0338a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0243a.f2789a);
        boolean z3 = false;
        this.n = obtainStyledAttributes.getDrawable(0);
        this.f1740o = obtainStyledAttributes.getDrawable(2);
        this.f1744s = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1742q = true;
            this.f1741p = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1742q ? !(this.n != null || this.f1740o != null) : this.f1741p == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.n;
        if (drawable != null && drawable.isStateful()) {
            this.n.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1740o;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1740o.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1741p;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1741p.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1740o;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1741p;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1738l = findViewById(R.id.action_bar);
        this.f1739m = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1737k || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        boolean z4 = true;
        if (this.f1742q) {
            Drawable drawable = this.f1741p;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z4 = false;
            }
        } else {
            if (this.n == null) {
                z4 = false;
            } else if (this.f1738l.getVisibility() == 0) {
                this.n.setBounds(this.f1738l.getLeft(), this.f1738l.getTop(), this.f1738l.getRight(), this.f1738l.getBottom());
            } else {
                View view = this.f1739m;
                if (view == null || view.getVisibility() != 0) {
                    this.n.setBounds(0, 0, 0, 0);
                } else {
                    this.n.setBounds(this.f1739m.getLeft(), this.f1739m.getTop(), this.f1739m.getRight(), this.f1739m.getBottom());
                }
            }
            this.f1743r = false;
        }
        if (z4) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        if (this.f1738l == null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE && (i5 = this.f1744s) >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i4)), Integer.MIN_VALUE);
        }
        super.onMeasure(i3, i4);
        if (this.f1738l == null) {
            return;
        }
        View.MeasureSpec.getMode(i4);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.n);
        }
        this.n = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1738l;
            if (view != null) {
                this.n.setBounds(view.getLeft(), this.f1738l.getTop(), this.f1738l.getRight(), this.f1738l.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f1742q ? !(this.n != null || this.f1740o != null) : this.f1741p == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1741p;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1741p);
        }
        this.f1741p = drawable;
        boolean z3 = this.f1742q;
        boolean z4 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z3 && (drawable2 = this.f1741p) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z3 ? !(this.n != null || this.f1740o != null) : this.f1741p == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1740o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1740o);
        }
        this.f1740o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1743r && this.f1740o != null) {
                throw null;
            }
        }
        boolean z3 = false;
        if (!this.f1742q ? !(this.n != null || this.f1740o != null) : this.f1741p == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z3) {
        this.f1737k = z3;
        setDescendantFocusability(z3 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z3 = i3 == 0;
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f1740o;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f1741p;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.n;
        boolean z3 = this.f1742q;
        if (drawable == drawable2 && !z3) {
            return true;
        }
        if (drawable == this.f1740o && this.f1743r) {
            return true;
        }
        return (drawable == this.f1741p && z3) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i3) {
        if (i3 != 0) {
            return super.startActionModeForChild(view, callback, i3);
        }
        return null;
    }

    public void setTabContainer(U u) {
    }
}
