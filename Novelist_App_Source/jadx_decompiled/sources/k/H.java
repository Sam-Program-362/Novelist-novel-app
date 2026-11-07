package k;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import f.AbstractC0243a;

/* loaded from: classes.dex */
public abstract class H extends ViewGroup {

    /* renamed from: k, reason: collision with root package name */
    public boolean f3596k;

    /* renamed from: l, reason: collision with root package name */
    public int f3597l;

    /* renamed from: m, reason: collision with root package name */
    public int f3598m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f3599o;

    /* renamed from: p, reason: collision with root package name */
    public int f3600p;

    /* renamed from: q, reason: collision with root package name */
    public float f3601q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3602r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f3603s;

    /* renamed from: t, reason: collision with root package name */
    public int[] f3604t;
    public Drawable u;

    /* renamed from: v, reason: collision with root package name */
    public int f3605v;

    /* renamed from: w, reason: collision with root package name */
    public int f3606w;
    public int x;
    public int y;

    public H(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3596k = true;
        this.f3597l = -1;
        this.f3598m = 0;
        this.f3599o = 8388659;
        int[] iArr = AbstractC0243a.f2798j;
        A0.j F3 = A0.j.F(context, attributeSet, iArr, i3);
        D.G.b(this, context, iArr, attributeSet, (TypedArray) F3.f58m, i3);
        TypedArray typedArray = (TypedArray) F3.f58m;
        int i4 = typedArray.getInt(1, -1);
        if (i4 >= 0) {
            setOrientation(i4);
        }
        int i5 = typedArray.getInt(0, -1);
        if (i5 >= 0) {
            setGravity(i5);
        }
        boolean z3 = typedArray.getBoolean(2, true);
        if (!z3) {
            setBaselineAligned(z3);
        }
        this.f3601q = typedArray.getFloat(4, -1.0f);
        this.f3597l = typedArray.getInt(3, -1);
        this.f3602r = typedArray.getBoolean(7, false);
        setDividerDrawable(F3.y(5));
        this.x = typedArray.getInt(8, 0);
        this.y = typedArray.getDimensionPixelSize(6, 0);
        F3.J();
    }

    public final void b(Canvas canvas, int i3) {
        this.u.setBounds(getPaddingLeft() + this.y, i3, (getWidth() - getPaddingRight()) - this.y, this.f3606w + i3);
        this.u.draw(canvas);
    }

    public final void c(Canvas canvas, int i3) {
        this.u.setBounds(i3, getPaddingTop() + this.y, this.f3605v + i3, (getHeight() - getPaddingBottom()) - this.y);
        this.u.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof G;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public G generateDefaultLayoutParams() {
        int i3 = this.n;
        if (i3 == 0) {
            return new G(-2);
        }
        if (i3 == 1) {
            return new G(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public G generateLayoutParams(AttributeSet attributeSet) {
        return new G(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public G generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new G(layoutParams);
    }

    public final boolean g(int i3) {
        if (i3 == 0) {
            return (this.x & 1) != 0;
        }
        if (i3 == getChildCount()) {
            return (this.x & 4) != 0;
        }
        if ((this.x & 2) != 0) {
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                if (getChildAt(i4).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i3;
        if (this.f3597l < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i4 = this.f3597l;
        if (childCount <= i4) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i4);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f3597l == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i5 = this.f3598m;
        if (this.n == 1 && (i3 = this.f3599o & 112) != 48) {
            if (i3 == 16) {
                i5 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f3600p) / 2;
            } else if (i3 == 80) {
                i5 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f3600p;
            }
        }
        return i5 + ((ViewGroup.MarginLayoutParams) ((G) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f3597l;
    }

    public Drawable getDividerDrawable() {
        return this.u;
    }

    public int getDividerPadding() {
        return this.y;
    }

    public int getDividerWidth() {
        return this.f3605v;
    }

    public int getGravity() {
        return this.f3599o;
    }

    public int getOrientation() {
        return this.n;
    }

    public int getShowDividers() {
        return this.x;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f3601q;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i3;
        if (this.u == null) {
            return;
        }
        int i4 = 0;
        if (this.n == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i4 < virtualChildCount) {
                View childAt = getChildAt(i4);
                if (childAt != null && childAt.getVisibility() != 8 && g(i4)) {
                    b(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((G) childAt.getLayoutParams())).topMargin) - this.f3606w);
                }
                i4++;
            }
            if (g(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                b(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f3606w : childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((G) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a3 = x0.a(this);
        while (i4 < virtualChildCount2) {
            View childAt3 = getChildAt(i4);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i4)) {
                G g3 = (G) childAt3.getLayoutParams();
                c(canvas, a3 ? childAt3.getRight() + ((ViewGroup.MarginLayoutParams) g3).rightMargin : (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) g3).leftMargin) - this.f3605v);
            }
            i4++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                G g4 = (G) childAt4.getLayoutParams();
                if (a3) {
                    left = childAt4.getLeft() - ((ViewGroup.MarginLayoutParams) g4).leftMargin;
                    i3 = this.f3605v;
                    right = left - i3;
                } else {
                    right = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) g4).rightMargin;
                }
            } else if (a3) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i3 = this.f3605v;
                right = left - i3;
            }
            c(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.H.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:221:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0527  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2151
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k.H.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z3) {
        this.f3596k = z3;
    }

    public void setBaselineAlignedChildIndex(int i3) {
        if (i3 >= 0 && i3 < getChildCount()) {
            this.f3597l = i3;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.u) {
            return;
        }
        this.u = drawable;
        if (drawable != null) {
            this.f3605v = drawable.getIntrinsicWidth();
            this.f3606w = drawable.getIntrinsicHeight();
        } else {
            this.f3605v = 0;
            this.f3606w = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i3) {
        this.y = i3;
    }

    public void setGravity(int i3) {
        if (this.f3599o != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f3599o = i3;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i3) {
        int i4 = i3 & 8388615;
        int i5 = this.f3599o;
        if ((8388615 & i5) != i4) {
            this.f3599o = i4 | ((-8388616) & i5);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.f3602r = z3;
    }

    public void setOrientation(int i3) {
        if (this.n != i3) {
            this.n = i3;
            requestLayout();
        }
    }

    public void setShowDividers(int i3) {
        if (i3 != this.x) {
            requestLayout();
        }
        this.x = i3;
    }

    public void setVerticalGravity(int i3) {
        int i4 = i3 & 112;
        int i5 = this.f3599o;
        if ((i5 & 112) != i4) {
            this.f3599o = i4 | (i5 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f3) {
        this.f3601q = Math.max(0.0f, f3);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
