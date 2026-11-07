package p031k;

import A0.j;
import D.G;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Field;
import p013f.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class H extends ViewGroup {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3597l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f3598m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3599o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3600p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f3601q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3602r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int[] f3603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f3604t;
    public Drawable u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3605v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3606w;
    public int x;
    public int y;

    public H(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3596k = true;
        this.f3597l = -1;
        this.f3598m = 0;
        this.f3599o = 8388659;
        int[] iArr = a.f2798j;
        j jVarF = j.F(context, attributeSet, iArr, i3);
        G.b(this, context, iArr, attributeSet, (TypedArray) jVarF.f58m, i3);
        TypedArray typedArray = (TypedArray) jVarF.f58m;
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
        setDividerDrawable(jVarF.y(5));
        this.x = typedArray.getInt(8, 0);
        this.y = typedArray.getDimensionPixelSize(6, 0);
        jVarF.J();
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
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
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
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public G generateLayoutParams(AttributeSet attributeSet) {
        return new G(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
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
        int bottom = this.f3598m;
        if (this.n == 1 && (i3 = this.f3599o & 112) != 48) {
            if (i3 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f3600p) / 2;
            } else if (i3 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f3600p;
            }
        }
        return bottom + ((ViewGroup.MarginLayoutParams) ((G) childAt.getLayoutParams())).topMargin + baseline;
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
        int bottom;
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
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f3606w;
                } else {
                    bottom = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((G) childAt2.getLayoutParams())).bottomMargin;
                }
                b(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zA = x0.a(this);
        while (i4 < virtualChildCount2) {
            View childAt3 = getChildAt(i4);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(i4)) {
                G g3 = (G) childAt3.getLayoutParams();
                c(canvas, zA ? childAt3.getRight() + ((ViewGroup.MarginLayoutParams) g3).rightMargin : (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) g3).leftMargin) - this.f3605v);
            }
            i4++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                G g4 = (G) childAt4.getLayoutParams();
                if (zA) {
                    left = childAt4.getLeft() - ((ViewGroup.MarginLayoutParams) g4).leftMargin;
                    i3 = this.f3605v;
                    right = left - i3;
                } else {
                    right = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) g4).rightMargin;
                }
            } else if (zA) {
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

    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0157  */
    /* JADX WARN: Code duplicated, block: B:61:0x0160  */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:66:0x016c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0174  */
    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:72:0x0187  */
    /* JADX WARN: Code duplicated, block: B:73:0x018e  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a6  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int paddingLeft;
        int i7;
        int i8;
        int i9;
        int i10;
        int baseline;
        int i11;
        int i12;
        int i13;
        int measuredHeight;
        int i14;
        int paddingTop;
        int i15;
        int i16;
        int i17;
        int i18 = 8;
        char c3 = 2;
        if (this.n == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i19 = i5 - i3;
            int paddingRight = i19 - getPaddingRight();
            int paddingRight2 = (i19 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i20 = this.f3599o;
            int i21 = i20 & 112;
            int i22 = 8388615 & i20;
            if (i21 != 16) {
                paddingTop = i21 != 80 ? getPaddingTop() : ((getPaddingTop() + i6) - i4) - this.f3600p;
            } else {
                paddingTop = getPaddingTop() + (((i6 - i4) - this.f3600p) / 2);
            }
            int i23 = 0;
            while (i23 < virtualChildCount) {
                View childAt = getChildAt(i23);
                if (childAt != null && childAt.getVisibility() != i18) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    G g3 = (G) childAt.getLayoutParams();
                    int i24 = g3.f3595b;
                    if (i24 < 0) {
                        i24 = i22;
                    }
                    Field field = G.f187a;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i24, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i17 = ((ViewGroup.MarginLayoutParams) g3).leftMargin + paddingLeft2;
                        } else {
                            i15 = paddingRight - measuredWidth;
                            i16 = ((ViewGroup.MarginLayoutParams) g3).rightMargin;
                        }
                        if (g(i23)) {
                            paddingTop += this.f3606w;
                        }
                        int i25 = paddingTop + ((ViewGroup.MarginLayoutParams) g3).topMargin;
                        childAt.layout(i17, i25, measuredWidth + i17, i25 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) g3).bottomMargin + i25;
                    } else {
                        i15 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((ViewGroup.MarginLayoutParams) g3).leftMargin;
                        i16 = ((ViewGroup.MarginLayoutParams) g3).rightMargin;
                    }
                    i17 = i15 - i16;
                    if (g(i23)) {
                        paddingTop += this.f3606w;
                    }
                    int i26 = paddingTop + ((ViewGroup.MarginLayoutParams) g3).topMargin;
                    childAt.layout(i17, i26, measuredWidth + i17, i26 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) g3).bottomMargin + i26;
                }
                i23++;
                c3 = c3;
                i18 = 8;
            }
            return;
        }
        boolean zA = x0.a(this);
        int paddingTop2 = getPaddingTop();
        int i27 = i6 - i4;
        int paddingBottom = i27 - getPaddingBottom();
        int paddingBottom2 = (i27 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i28 = this.f3599o;
        int i29 = 8388615 & i28;
        int i30 = i28 & 112;
        boolean z4 = this.f3596k;
        int[] iArr = this.f3603s;
        int[] iArr2 = this.f3604t;
        Field field2 = G.f187a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i29, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i5) - i3) - this.f3600p;
        } else {
            paddingLeft = getPaddingLeft() + (((i5 - i3) - this.f3600p) / 2);
        }
        if (zA) {
            i8 = virtualChildCount2 - 1;
            i7 = -1;
        } else {
            i7 = 1;
            i8 = 0;
        }
        int i31 = 0;
        while (i31 < virtualChildCount2) {
            int i32 = (i7 * i31) + i8;
            View childAt2 = getChildAt(i32);
            if (childAt2 == null) {
                i9 = i8;
            } else {
                i9 = i8;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    G g4 = (G) childAt2.getLayoutParams();
                    int i33 = paddingLeft;
                    if (z4) {
                        i10 = paddingTop2;
                        baseline = ((ViewGroup.MarginLayoutParams) g4).height != -1 ? childAt2.getBaseline() : -1;
                        i11 = g4.f3595b;
                        if (i11 < 0) {
                            i11 = i30;
                        }
                        i12 = i11 & 112;
                        if (i12 != 16) {
                            if (i12 != 48) {
                                i13 = i10 + ((ViewGroup.MarginLayoutParams) g4).topMargin;
                                if (baseline != -1) {
                                    i13 = (iArr[1] - baseline) + i13;
                                }
                            } else if (i12 != 80) {
                                i13 = i10;
                            } else {
                                i13 = (paddingBottom - measuredHeight3) - ((ViewGroup.MarginLayoutParams) g4).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            if (g(i32)) {
                                i14 = i33 + this.f3605v;
                            } else {
                                i14 = i33;
                            }
                            int i34 = i14 + ((ViewGroup.MarginLayoutParams) g4).leftMargin;
                            childAt2.layout(i34, i13, i34 + measuredWidth2, i13 + measuredHeight3);
                            paddingLeft = measuredWidth2 + ((ViewGroup.MarginLayoutParams) g4).rightMargin + i34;
                        } else {
                            i13 = ((paddingBottom2 - measuredHeight3) / 2) + i10 + ((ViewGroup.MarginLayoutParams) g4).topMargin;
                            measuredHeight = ((ViewGroup.MarginLayoutParams) g4).bottomMargin;
                        }
                        i13 -= measuredHeight;
                        if (g(i32)) {
                            i14 = i33 + this.f3605v;
                        } else {
                            i14 = i33;
                        }
                        int i35 = i14 + ((ViewGroup.MarginLayoutParams) g4).leftMargin;
                        childAt2.layout(i35, i13, i35 + measuredWidth2, i13 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((ViewGroup.MarginLayoutParams) g4).rightMargin + i35;
                    } else {
                        i10 = paddingTop2;
                    }
                    i11 = g4.f3595b;
                    if (i11 < 0) {
                        i11 = i30;
                    }
                    i12 = i11 & 112;
                    if (i12 != 16) {
                        if (i12 != 48) {
                            i13 = i10 + ((ViewGroup.MarginLayoutParams) g4).topMargin;
                            if (baseline != -1) {
                                i13 = (iArr[1] - baseline) + i13;
                            }
                        } else if (i12 != 80) {
                            i13 = i10;
                        } else {
                            i13 = (paddingBottom - measuredHeight3) - ((ViewGroup.MarginLayoutParams) g4).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (g(i32)) {
                            i14 = i33 + this.f3605v;
                        } else {
                            i14 = i33;
                        }
                        int i36 = i14 + ((ViewGroup.MarginLayoutParams) g4).leftMargin;
                        childAt2.layout(i36, i13, i36 + measuredWidth2, i13 + measuredHeight3);
                        paddingLeft = measuredWidth2 + ((ViewGroup.MarginLayoutParams) g4).rightMargin + i36;
                    } else {
                        i13 = ((paddingBottom2 - measuredHeight3) / 2) + i10 + ((ViewGroup.MarginLayoutParams) g4).topMargin;
                        measuredHeight = ((ViewGroup.MarginLayoutParams) g4).bottomMargin;
                    }
                    i13 -= measuredHeight;
                    if (g(i32)) {
                        i14 = i33 + this.f3605v;
                    } else {
                        i14 = i33;
                    }
                    int i37 = i14 + ((ViewGroup.MarginLayoutParams) g4).leftMargin;
                    childAt2.layout(i37, i13, i37 + measuredWidth2, i13 + measuredHeight3);
                    paddingLeft = measuredWidth2 + ((ViewGroup.MarginLayoutParams) g4).rightMargin + i37;
                }
                i31++;
                i8 = i9;
                paddingTop2 = i10;
            }
            i10 = paddingTop2;
            i31++;
            i8 = i9;
            paddingTop2 = i10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:227:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:230:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:232:0x0502  */
    /* JADX WARN: Code duplicated, block: B:234:0x0506  */
    /* JADX WARN: Code duplicated, block: B:236:0x0527  */
    /* JADX WARN: Code duplicated, block: B:242:0x0537  */
    /* JADX WARN: Code duplicated, block: B:245:0x053e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:247:0x0541  */
    /* JADX WARN: Code duplicated, block: B:249:0x0548 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:251:0x054b  */
    /* JADX WARN: Code duplicated, block: B:365:0x079d  */
    @Override // android.view.View
    public void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int iMax;
        int i8;
        int baseline;
        int i9;
        int i10;
        int[] iArr;
        int i11;
        int i12;
        boolean z3;
        boolean z4;
        G g3;
        View view;
        int i13;
        int[] iArr2;
        int i14;
        int i15;
        boolean z5;
        int i16;
        int measuredHeight;
        boolean z6;
        boolean z7;
        int iMax2;
        int i17;
        int baseline2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        float f3;
        int i24;
        int i25;
        boolean z8;
        View view2;
        boolean z9;
        H h3 = this;
        int iMax3 = 0;
        int i26 = 1073741824;
        int i27 = 8;
        if (h3.n == 1) {
            h3.f3600p = 0;
            int virtualChildCount = h3.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i3);
            int mode2 = View.MeasureSpec.getMode(i4);
            int i28 = h3.f3597l;
            boolean z10 = h3.f3602r;
            int i29 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z11 = false;
            int i30 = 0;
            boolean z12 = false;
            boolean z13 = true;
            float f4 = 0.0f;
            int iMax6 = 0;
            while (i29 < virtualChildCount) {
                int i31 = mode;
                View childAt = h3.getChildAt(i29);
                if (childAt == null) {
                    h3.f3600p = h3.f3600p;
                } else {
                    if (childAt.getVisibility() != i27) {
                        if (h3.g(i29)) {
                            h3.f3600p += h3.f3606w;
                        }
                        G g4 = (G) childAt.getLayoutParams();
                        float f5 = g4.f3594a;
                        f4 += f5;
                        if (mode2 == i26 && ((ViewGroup.MarginLayoutParams) g4).height == 0 && f5 > 0.0f) {
                            int i32 = h3.f3600p;
                            h3.f3600p = Math.max(i32, ((ViewGroup.MarginLayoutParams) g4).topMargin + i32 + ((ViewGroup.MarginLayoutParams) g4).bottomMargin);
                            view2 = childAt;
                            i25 = mode2;
                            z8 = z10;
                            i22 = i29;
                            z11 = true;
                            i23 = i31;
                            f3 = f5;
                            i24 = i28;
                        } else {
                            if (((ViewGroup.MarginLayoutParams) g4).height != 0 || f5 <= 0.0f) {
                                i21 = Integer.MIN_VALUE;
                            } else {
                                ((ViewGroup.MarginLayoutParams) g4).height = -2;
                                i21 = 0;
                            }
                            i22 = i29;
                            i23 = i31;
                            f3 = f5;
                            i24 = i28;
                            i25 = mode2;
                            z8 = z10;
                            h3.measureChildWithMargins(childAt, i3, 0, i4, f4 == 0.0f ? h3.f3600p : 0);
                            if (i21 != Integer.MIN_VALUE) {
                                ((ViewGroup.MarginLayoutParams) g4).height = i21;
                            }
                            int measuredHeight2 = childAt.getMeasuredHeight();
                            int i33 = h3.f3600p;
                            view2 = childAt;
                            h3.f3600p = Math.max(i33, i33 + measuredHeight2 + ((ViewGroup.MarginLayoutParams) g4).topMargin + ((ViewGroup.MarginLayoutParams) g4).bottomMargin);
                            if (z8) {
                                iMax6 = Math.max(measuredHeight2, iMax6);
                            }
                        }
                        if (i24 >= 0 && i24 == i22 + 1) {
                            h3.f3598m = h3.f3600p;
                        }
                        if (i22 < i24 && f3 > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i23 == 1073741824 || ((ViewGroup.MarginLayoutParams) g4).width != -1) {
                            z9 = false;
                        } else {
                            z9 = true;
                            z12 = true;
                        }
                        int i34 = ((ViewGroup.MarginLayoutParams) g4).leftMargin + ((ViewGroup.MarginLayoutParams) g4).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i34;
                        int iMax7 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z14 = z9;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i30, measuredState);
                        boolean z15 = z13 && ((ViewGroup.MarginLayoutParams) g4).width == -1;
                        if (f3 > 0.0f) {
                            if (!z14) {
                                i34 = measuredWidth;
                            }
                            iMax5 = Math.max(iMax5, i34);
                        } else {
                            if (!z14) {
                                i34 = measuredWidth;
                            }
                            iMax4 = Math.max(iMax4, i34);
                        }
                        i30 = iCombineMeasuredStates;
                        z13 = z15;
                        iMax3 = iMax7;
                    }
                    i29 = i22 + 1;
                    mode = i23;
                    i28 = i24;
                    z10 = z8;
                    mode2 = i25;
                    i26 = 1073741824;
                    i27 = 8;
                }
                i25 = mode2;
                i24 = i28;
                z8 = z10;
                i22 = i29;
                i23 = i31;
                i29 = i22 + 1;
                mode = i23;
                i28 = i24;
                z10 = z8;
                mode2 = i25;
                i26 = 1073741824;
                i27 = 8;
            }
            int i35 = mode;
            int i36 = mode2;
            boolean z16 = z10;
            int i37 = i30;
            int i38 = i4;
            if (h3.f3600p > 0 && h3.g(virtualChildCount)) {
                h3.f3600p += h3.f3606w;
            }
            if (z16 && (i36 == Integer.MIN_VALUE || i36 == 0)) {
                h3.f3600p = 0;
                for (int i39 = 0; i39 < virtualChildCount; i39++) {
                    View childAt2 = h3.getChildAt(i39);
                    if (childAt2 == null) {
                        h3.f3600p = h3.f3600p;
                    } else if (childAt2.getVisibility() != 8) {
                        G g5 = (G) childAt2.getLayoutParams();
                        int i40 = h3.f3600p;
                        h3.f3600p = Math.max(i40, i40 + iMax6 + ((ViewGroup.MarginLayoutParams) g5).topMargin + ((ViewGroup.MarginLayoutParams) g5).bottomMargin);
                    }
                }
            }
            int paddingBottom = h3.getPaddingBottom() + h3.getPaddingTop() + h3.f3600p;
            h3.f3600p = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, h3.getSuggestedMinimumHeight()), i38, 0);
            int i41 = (iResolveSizeAndState & 16777215) - h3.f3600p;
            if (z11 || (i41 != 0 && f4 > 0.0f)) {
                float f6 = h3.f3601q;
                if (f6 > 0.0f) {
                    f4 = f6;
                }
                h3.f3600p = 0;
                int iCombineMeasuredStates2 = i37;
                int i42 = 0;
                while (i42 < virtualChildCount) {
                    View childAt3 = h3.getChildAt(i42);
                    if (childAt3.getVisibility() == 8) {
                        i42 = i42;
                    } else {
                        G g6 = (G) childAt3.getLayoutParams();
                        float f7 = g6.f3594a;
                        if (f7 > 0.0f) {
                            int i43 = (int) ((i41 * f7) / f4);
                            f4 -= f7;
                            i41 -= i43;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, h3.getPaddingRight() + h3.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) g6).leftMargin + ((ViewGroup.MarginLayoutParams) g6).rightMargin, ((ViewGroup.MarginLayoutParams) g6).width);
                            if (((ViewGroup.MarginLayoutParams) g6).height == 0) {
                                i20 = 1073741824;
                                if (i36 == 1073741824) {
                                    if (i43 <= 0) {
                                        i43 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i43, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i20 = 1073741824;
                            }
                            int measuredHeight3 = childAt3.getMeasuredHeight() + i43;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i20));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        }
                        int i44 = ((ViewGroup.MarginLayoutParams) g6).leftMargin + ((ViewGroup.MarginLayoutParams) g6).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i44;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i35 != 1073741824) {
                            i19 = -1;
                            if (((ViewGroup.MarginLayoutParams) g6).width == -1) {
                                measuredWidth2 = i44;
                            }
                        } else {
                            i19 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z17 = z13 && ((ViewGroup.MarginLayoutParams) g6).width == i19;
                        int i45 = h3.f3600p;
                        h3.f3600p = Math.max(i45, childAt3.getMeasuredHeight() + i45 + ((ViewGroup.MarginLayoutParams) g6).topMargin + ((ViewGroup.MarginLayoutParams) g6).bottomMargin);
                        z13 = z17;
                    }
                    i42++;
                }
                h3.f3600p = h3.getPaddingBottom() + h3.getPaddingTop() + h3.f3600p;
                i37 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z16 && i36 != 1073741824) {
                    for (int i46 = 0; i46 < virtualChildCount; i46++) {
                        View childAt4 = h3.getChildAt(i46);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((G) childAt4.getLayoutParams()).f3594a > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z13 || i35 == 1073741824) {
                iMax4 = iMax3;
            }
            h3.setMeasuredDimension(View.resolveSizeAndState(Math.max(h3.getPaddingRight() + h3.getPaddingLeft() + iMax4, h3.getSuggestedMinimumWidth()), i3, i37), iResolveSizeAndState);
            if (z12) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(h3.getMeasuredWidth(), 1073741824);
                int i47 = 0;
                while (i47 < virtualChildCount) {
                    View childAt5 = h3.getChildAt(i47);
                    if (childAt5.getVisibility() != 8) {
                        G g7 = (G) childAt5.getLayoutParams();
                        if (((ViewGroup.MarginLayoutParams) g7).width == -1) {
                            int i48 = ((ViewGroup.MarginLayoutParams) g7).height;
                            ((ViewGroup.MarginLayoutParams) g7).height = childAt5.getMeasuredHeight();
                            h3.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i38, 0);
                            ((ViewGroup.MarginLayoutParams) g7).height = i48;
                        }
                    }
                    i47++;
                    i38 = i4;
                }
                return;
            }
            return;
        }
        int i49 = i3;
        h3.f3600p = 0;
        int virtualChildCount2 = h3.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i49);
        int mode4 = View.MeasureSpec.getMode(i4);
        if (h3.f3603s == null || h3.f3604t == null) {
            h3.f3603s = new int[4];
            h3.f3604t = new int[4];
        }
        int[] iArr3 = h3.f3603s;
        int[] iArr4 = h3.f3604t;
        iArr3[3] = -1;
        char c3 = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z18 = h3.f3596k;
        boolean z19 = h3.f3602r;
        boolean z20 = mode3 == 1073741824;
        float f8 = 0.0f;
        boolean z21 = true;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        int iMax8 = 0;
        int iMax9 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z22 = false;
        boolean z23 = false;
        while (i50 < virtualChildCount2) {
            char c4 = c3;
            View childAt6 = h3.getChildAt(i50);
            if (childAt6 == null) {
                h3.f3600p = h3.f3600p;
                i12 = i50;
                i17 = i52;
                iArr2 = iArr3;
                iArr = iArr4;
                z3 = z18;
                z4 = z19;
            } else {
                int i53 = i51;
                if (childAt6.getVisibility() == 8) {
                    i49 = i3;
                    i12 = i50;
                    i17 = i52;
                    iArr = iArr4;
                    z3 = z18;
                    z4 = z19;
                    i51 = i53;
                    iArr2 = iArr3;
                } else {
                    if (h3.g(i50)) {
                        h3.f3600p += h3.f3605v;
                    }
                    G g8 = (G) childAt6.getLayoutParams();
                    float f9 = g8.f3594a;
                    f8 += f9;
                    int i54 = i50;
                    if (mode3 == 1073741824 && ((ViewGroup.MarginLayoutParams) g8).width == 0 && f9 > 0.0f) {
                        if (z20) {
                            h3.f3600p = ((ViewGroup.MarginLayoutParams) g8).leftMargin + ((ViewGroup.MarginLayoutParams) g8).rightMargin + h3.f3600p;
                        } else {
                            int i55 = h3.f3600p;
                            h3.f3600p = Math.max(i55, ((ViewGroup.MarginLayoutParams) g8).leftMargin + i55 + ((ViewGroup.MarginLayoutParams) g8).rightMargin);
                        }
                        if (z18) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z3 = z18;
                            z4 = z19;
                            i13 = i53;
                            i12 = i54;
                            g3 = g8;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i49 = i3;
                            i14 = i52;
                            i11 = iMax8;
                        } else {
                            view = childAt6;
                            z3 = z18;
                            z4 = z19;
                            z23 = true;
                            i13 = i53;
                            i12 = i54;
                            i15 = 1073741824;
                            g3 = g8;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i49 = i3;
                            i14 = i52;
                            i11 = iMax8;
                        }
                        if (mode4 == i15 && ((ViewGroup.MarginLayoutParams) g3).height == -1) {
                            z5 = true;
                            z22 = true;
                        } else {
                            z5 = false;
                        }
                        i16 = ((ViewGroup.MarginLayoutParams) g3).topMargin + ((ViewGroup.MarginLayoutParams) g3).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i16;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z3) {
                            baseline2 = view.getBaseline();
                            z6 = z5;
                            if (baseline2 != -1) {
                                i18 = g3.f3595b;
                                if (i18 < 0) {
                                    i18 = h3.f3599o;
                                }
                                int i56 = (((i18 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i56] = Math.max(iArr2[i56], baseline2);
                                iArr[i56] = Math.max(iArr[i56], measuredHeight - baseline2);
                            }
                        } else {
                            z6 = z5;
                        }
                        int iMax10 = Math.max(i13, measuredHeight);
                        if (z21 || ((ViewGroup.MarginLayoutParams) g3).height != -1) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        if (g3.f3594a > 0.0f) {
                            if (!z6) {
                                i16 = measuredHeight;
                            }
                            iMax8 = Math.max(i11, i16);
                            iMax2 = i14;
                        } else {
                            if (!z6) {
                                i16 = measuredHeight;
                            }
                            iMax2 = Math.max(i14, i16);
                            iMax8 = i11;
                        }
                        int i57 = iMax2;
                        i51 = iMax10;
                        i17 = i57;
                        z21 = z7;
                    } else {
                        if (((ViewGroup.MarginLayoutParams) g8).width != 0 || f9 <= 0.0f) {
                            i10 = Integer.MIN_VALUE;
                        } else {
                            ((ViewGroup.MarginLayoutParams) g8).width = -2;
                            i10 = 0;
                        }
                        iArr = iArr4;
                        i11 = iMax8;
                        i12 = i54;
                        z3 = z18;
                        z4 = z19;
                        int i58 = i10;
                        g3 = g8;
                        view = childAt6;
                        i13 = i53;
                        i49 = i3;
                        iArr2 = iArr3;
                        i14 = i52;
                        h3.measureChildWithMargins(view, i49, f8 == 0.0f ? h3.f3600p : 0, i4, 0);
                        if (i58 != Integer.MIN_VALUE) {
                            ((ViewGroup.MarginLayoutParams) g3).width = i58;
                        }
                        int measuredWidth3 = view.getMeasuredWidth();
                        if (z20) {
                            h3.f3600p = ((ViewGroup.MarginLayoutParams) g3).leftMargin + measuredWidth3 + ((ViewGroup.MarginLayoutParams) g3).rightMargin + h3.f3600p;
                        } else {
                            int i59 = h3.f3600p;
                            h3.f3600p = Math.max(i59, i59 + measuredWidth3 + ((ViewGroup.MarginLayoutParams) g3).leftMargin + ((ViewGroup.MarginLayoutParams) g3).rightMargin);
                        }
                        if (z4) {
                            iMax9 = Math.max(measuredWidth3, iMax9);
                        }
                    }
                    i15 = 1073741824;
                    if (mode4 == i15) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    i16 = ((ViewGroup.MarginLayoutParams) g3).topMargin + ((ViewGroup.MarginLayoutParams) g3).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i16;
                    iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                    if (z3) {
                        baseline2 = view.getBaseline();
                        z6 = z5;
                        if (baseline2 != -1) {
                            i18 = g3.f3595b;
                            if (i18 < 0) {
                                i18 = h3.f3599o;
                            }
                            int i510 = (((i18 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i510] = Math.max(iArr2[i510], baseline2);
                            iArr[i510] = Math.max(iArr[i510], measuredHeight - baseline2);
                        }
                    } else {
                        z6 = z5;
                    }
                    int iMax11 = Math.max(i13, measuredHeight);
                    if (z21) {
                        z7 = false;
                    } else {
                        z7 = false;
                    }
                    if (g3.f3594a > 0.0f) {
                        if (!z6) {
                            i16 = measuredHeight;
                        }
                        iMax8 = Math.max(i11, i16);
                        iMax2 = i14;
                    } else {
                        if (!z6) {
                            i16 = measuredHeight;
                        }
                        iMax2 = Math.max(i14, i16);
                        iMax8 = i11;
                    }
                    int i511 = iMax2;
                    i51 = iMax11;
                    i17 = i511;
                    z21 = z7;
                }
            }
            i52 = i17;
            i50 = i12 + 1;
            c3 = c4;
            iArr3 = iArr2;
            iArr4 = iArr;
            z18 = z3;
            z19 = z4;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c5 = c3;
        boolean z24 = z18;
        boolean z25 = z19;
        int i60 = i51;
        int i61 = i52;
        int i62 = iMax8;
        if (h3.f3600p > 0 && h3.g(virtualChildCount2)) {
            h3.f3600p += h3.f3605v;
        }
        int i63 = iArr5[1];
        int iMax12 = (i63 == -1 && iArr5[0] == -1 && iArr5[c5] == -1 && iArr5[3] == -1) ? i60 : Math.max(i60, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c5]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i63, iArr5[c5]))));
        if (z25 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            h3.f3600p = 0;
            for (int i64 = 0; i64 < virtualChildCount2; i64++) {
                View childAt7 = h3.getChildAt(i64);
                if (childAt7 == null) {
                    h3.f3600p = h3.f3600p;
                } else if (childAt7.getVisibility() != 8) {
                    G g9 = (G) childAt7.getLayoutParams();
                    if (z20) {
                        h3.f3600p = ((ViewGroup.MarginLayoutParams) g9).leftMargin + iMax9 + ((ViewGroup.MarginLayoutParams) g9).rightMargin + h3.f3600p;
                    } else {
                        int i65 = h3.f3600p;
                        h3.f3600p = Math.max(i65, i65 + iMax9 + ((ViewGroup.MarginLayoutParams) g9).leftMargin + ((ViewGroup.MarginLayoutParams) g9).rightMargin);
                    }
                }
            }
        }
        int paddingRight = h3.getPaddingRight() + h3.getPaddingLeft() + h3.f3600p;
        h3.f3600p = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, h3.getSuggestedMinimumWidth()), i49, 0);
        int i66 = (iResolveSizeAndState2 & 16777215) - h3.f3600p;
        if (z23 || (i66 != 0 && f8 > 0.0f)) {
            float f10 = h3.f3601q;
            if (f10 > 0.0f) {
                f8 = f10;
            }
            iArr5[3] = -1;
            iArr5[c5] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c5] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            h3.f3600p = 0;
            iMax12 = -1;
            int i67 = 0;
            while (i67 < virtualChildCount2) {
                View childAt8 = h3.getChildAt(i67);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    iResolveSizeAndState2 = iResolveSizeAndState2;
                } else {
                    G g10 = (G) childAt8.getLayoutParams();
                    float f11 = g10.f3594a;
                    if (f11 > 0.0f) {
                        int i68 = (int) ((i66 * f11) / f8);
                        f8 -= f11;
                        i66 -= i68;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, h3.getPaddingBottom() + h3.getPaddingTop() + ((ViewGroup.MarginLayoutParams) g10).topMargin + ((ViewGroup.MarginLayoutParams) g10).bottomMargin, ((ViewGroup.MarginLayoutParams) g10).height);
                        if (((ViewGroup.MarginLayoutParams) g10).width == 0) {
                            i9 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i68 <= 0) {
                                    i68 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i68, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i9 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i68;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i9), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    }
                    if (z20) {
                        h3.f3600p = childAt8.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) g10).leftMargin + ((ViewGroup.MarginLayoutParams) g10).rightMargin + h3.f3600p;
                    } else {
                        int i69 = h3.f3600p;
                        h3.f3600p = Math.max(i69, childAt8.getMeasuredWidth() + i69 + ((ViewGroup.MarginLayoutParams) g10).leftMargin + ((ViewGroup.MarginLayoutParams) g10).rightMargin);
                    }
                    boolean z26 = mode4 != 1073741824 && ((ViewGroup.MarginLayoutParams) g10).height == -1;
                    int i70 = ((ViewGroup.MarginLayoutParams) g10).topMargin + ((ViewGroup.MarginLayoutParams) g10).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i70;
                    iMax12 = Math.max(iMax12, measuredHeight4);
                    if (!z26) {
                        i70 = measuredHeight4;
                    }
                    int iMax13 = Math.max(i61, i70);
                    if (z21) {
                        i8 = -1;
                        boolean z27 = ((ViewGroup.MarginLayoutParams) g10).height == -1;
                        if (!z24 && (baseline = childAt8.getBaseline()) != i8) {
                            int i71 = g10.f3595b;
                            if (i71 < 0) {
                                i71 = h3.f3599o;
                            }
                            int i72 = (((i71 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i72] = Math.max(iArr5[i72], baseline);
                            iArr6[i72] = Math.max(iArr6[i72], measuredHeight4 - baseline);
                        }
                        z21 = z27;
                        i61 = iMax13;
                    } else {
                        i8 = -1;
                    }
                    if (!z24) {
                    }
                    z21 = z27;
                    i61 = iMax13;
                }
                i67++;
                iResolveSizeAndState2 = iResolveSizeAndState2;
            }
            i5 = iResolveSizeAndState2;
            i6 = -16777216;
            h3.f3600p = h3.getPaddingRight() + h3.getPaddingLeft() + h3.f3600p;
            int i73 = iArr5[1];
            if (i73 == -1 && iArr5[0] == -1 && iArr5[c5] == -1 && iArr5[3] == -1) {
                i7 = 0;
            } else {
                i7 = 0;
                iMax12 = Math.max(iMax12, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c5]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i73, iArr5[c5]))));
            }
            iMax = i61;
        } else {
            iMax = Math.max(i61, i62);
            if (z25 && mode3 != 1073741824) {
                for (int i74 = 0; i74 < virtualChildCount2; i74++) {
                    View childAt9 = h3.getChildAt(i74);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((G) childAt9.getLayoutParams()).f3594a > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i5 = iResolveSizeAndState2;
            i6 = -16777216;
            i7 = 0;
        }
        if (!z21 && mode4 != 1073741824) {
            iMax12 = iMax;
        }
        h3.setMeasuredDimension(i5 | (iCombineMeasuredStates3 & i6), View.resolveSizeAndState(Math.max(h3.getPaddingBottom() + h3.getPaddingTop() + iMax12, h3.getSuggestedMinimumHeight()), i4, iCombineMeasuredStates3 << 16));
        if (z22) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(h3.getMeasuredHeight(), 1073741824);
            int i75 = i7;
            while (i75 < virtualChildCount2) {
                View childAt10 = h3.getChildAt(i75);
                if (childAt10.getVisibility() != 8) {
                    G g11 = (G) childAt10.getLayoutParams();
                    if (((ViewGroup.MarginLayoutParams) g11).height == -1) {
                        int i76 = ((ViewGroup.MarginLayoutParams) g11).width;
                        ((ViewGroup.MarginLayoutParams) g11).width = childAt10.getMeasuredWidth();
                        h3.measureChildWithMargins(childAt10, i49, 0, iMakeMeasureSpec3, 0);
                        ((ViewGroup.MarginLayoutParams) g11).width = i76;
                    }
                }
                i75++;
                h3 = this;
                i49 = i3;
            }
        }
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
