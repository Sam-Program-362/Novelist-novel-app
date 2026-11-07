package androidx.appcompat.widget;

import M1.A;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p028j.i;
import p028j.j;
import p028j.k;
import p031k.C0228f;
import p031k.C0230h;
import p031k.C0231i;
import p031k.C0233k;
import p031k.G;
import p031k.H;
import p031k.InterfaceC0232j;
import p031k.InterfaceC0234l;
import p031k.x0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends H implements i {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Context f1776A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f1777B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C0231i f1778C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f1779D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f1780E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f1781F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f1782G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public InterfaceC0234l f1783H;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public j f1784z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f1781F = (int) (56.0f * f3);
        this.f1782G = (int) (f3 * 4.0f);
        this.f1776A = context;
        this.f1777B = 0;
    }

    public static C0233k h() {
        C0233k c0233k = new C0233k(-2);
        c0233k.f3719c = false;
        c0233k.f3595b = 16;
        return c0233k;
    }

    public static C0233k i(ViewGroup.LayoutParams layoutParams) {
        C0233k c0233k;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof C0233k) {
            C0233k c0233k2 = (C0233k) layoutParams;
            c0233k = new C0233k(c0233k2);
            c0233k.f3719c = c0233k2.f3719c;
        } else {
            c0233k = new C0233k(layoutParams);
        }
        if (c0233k.f3595b <= 0) {
            c0233k.f3595b = 16;
        }
        return c0233k;
    }

    @Override // p028j.i
    public final boolean a(k kVar) {
        return this.f1784z.p(kVar, null, 0);
    }

    @Override // p031k.H, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0233k;
    }

    @Override // p031k.H
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ G generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p031k.H
    /* JADX INFO: renamed from: e */
    public final G generateLayoutParams(AttributeSet attributeSet) {
        return new C0233k(getContext(), attributeSet);
    }

    @Override // p031k.H
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ G generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // p031k.H, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // p031k.H, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1784z == null) {
            Context context = getContext();
            j jVar = new j(context);
            this.f1784z = jVar;
            jVar.f3435e = new B1.a(this, 19);
            C0231i c0231i = new C0231i(context);
            this.f1778C = c0231i;
            c0231i.u = true;
            c0231i.f3709v = true;
            c0231i.f3703o = new A(20);
            this.f1784z.b(c0231i, this.f1776A);
            C0231i c0231i2 = this.f1778C;
            c0231i2.f3705q = this;
            this.f1784z = c0231i2.f3702m;
        }
        return this.f1784z;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0231i c0231i = this.f1778C;
        C0230h c0230h = c0231i.f3706r;
        if (c0230h != null) {
            return c0230h.getDrawable();
        }
        if (c0231i.f3708t) {
            return c0231i.f3707s;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1777B;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int i3) {
        boolean zB = false;
        if (i3 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i3 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i3);
        if (i3 < getChildCount() && (childAt instanceof InterfaceC0232j)) {
            zB = ((InterfaceC0232j) childAt).b();
        }
        return (i3 <= 0 || !(childAt2 instanceof InterfaceC0232j)) ? zB : ((InterfaceC0232j) childAt2).c() | zB;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0231i c0231i = this.f1778C;
        if (c0231i != null) {
            c0231i.d();
            C0228f c0228f = this.f1778C.f3695B;
            if (c0228f == null || !c0228f.b()) {
                return;
            }
            this.f1778C.e();
            this.f1778C.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0231i c0231i = this.f1778C;
        if (c0231i != null) {
            c0231i.e();
            C0228f c0228f = c0231i.f3696C;
            if (c0228f == null || !c0228f.b()) {
                return;
            }
            c0228f.f3484i.dismiss();
        }
    }

    @Override // p031k.H, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int width;
        int paddingLeft;
        if (!this.f1779D) {
            super.onLayout(z3, i3, i4, i5, i6);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i6 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i5 - i3;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean zA = x0.a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0233k c0233k = (C0233k) childAt.getLayoutParams();
                if (c0233k.f3719c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0233k).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0233k).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0233k).leftMargin) + ((ViewGroup.MarginLayoutParams) c0233k).rightMargin;
                    j(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int iMax = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0233k c0233k2 = (C0233k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0233k2.f3719c) {
                    int i17 = width2 - ((ViewGroup.MarginLayoutParams) c0233k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0233k2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C0233k c0233k3 = (C0233k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0233k3.f3719c) {
                int i20 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) c0233k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft2 = measuredWidth4 + ((ViewGroup.MarginLayoutParams) c0233k3).rightMargin + iMax + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // p031k.H, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        ?? r11;
        int i7;
        int i8;
        j jVar;
        boolean z3 = this.f1779D;
        boolean z4 = View.MeasureSpec.getMode(i3) == 1073741824;
        this.f1779D = z4;
        if (z3 != z4) {
            this.f1780E = 0;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (this.f1779D && (jVar = this.f1784z) != null && size != this.f1780E) {
            this.f1780E = size;
            jVar.o(true);
        }
        int childCount = getChildCount();
        if (!this.f1779D || childCount <= 0) {
            for (int i9 = 0; i9 < childCount; i9++) {
                C0233k c0233k = (C0233k) getChildAt(i9).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) c0233k).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) c0233k).leftMargin = 0;
            }
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i3);
        int size3 = View.MeasureSpec.getSize(i4);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, paddingBottom, -2);
        int i10 = size2 - paddingRight;
        int i11 = this.f1781F;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (i12 == 0) {
            setMeasuredDimension(i10, 0);
            return;
        }
        int i14 = (i13 / i12) + i11;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i15 = 0;
        int iMax2 = 0;
        int i16 = 0;
        boolean z5 = false;
        int i17 = 0;
        long j3 = 0;
        while (true) {
            i5 = this.f1782G;
            if (i16 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i16);
            int i18 = size3;
            int i19 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i7 = i14;
            } else {
                boolean z6 = childAt instanceof ActionMenuItemView;
                i15++;
                if (z6) {
                    childAt.setPadding(i5, 0, i5, 0);
                }
                C0233k c0233k2 = (C0233k) childAt.getLayoutParams();
                c0233k2.f3724h = false;
                c0233k2.f3721e = 0;
                c0233k2.f3720d = 0;
                c0233k2.f3722f = false;
                ((ViewGroup.MarginLayoutParams) c0233k2).leftMargin = 0;
                ((ViewGroup.MarginLayoutParams) c0233k2).rightMargin = 0;
                c0233k2.f3723g = z6 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i20 = c0233k2.f3719c ? 1 : i12;
                C0233k c0233k3 = (C0233k) childAt.getLayoutParams();
                int i21 = i12;
                i7 = i14;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i19, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z6 ? (ActionMenuItemView) childAt : null;
                boolean z7 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z8 = z7;
                if (i20 <= 0 || (z7 && i20 < 2)) {
                    i8 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i20, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i8 = measuredWidth / i7;
                    if (measuredWidth % i7 != 0) {
                        i8++;
                    }
                    if (z8 && i8 < 2) {
                        i8 = 2;
                    }
                }
                c0233k3.f3722f = !c0233k3.f3719c && z8;
                c0233k3.f3720d = i8;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i8 * i7, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i8);
                if (c0233k2.f3722f) {
                    i17++;
                }
                if (c0233k2.f3719c) {
                    z5 = true;
                }
                i12 = i21 - i8;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i8 == 1) {
                    j3 |= (long) (1 << i16);
                }
            }
            i16++;
            size3 = i18;
            paddingBottom = i19;
            i14 = i7;
        }
        int i22 = size3;
        int i23 = i12;
        int i24 = i14;
        boolean z9 = z5 && i15 == 2;
        int i25 = i23;
        boolean z10 = false;
        while (true) {
            if (i17 <= 0 || i25 <= 0) {
                i6 = iMax;
                break;
            }
            int i26 = Integer.MAX_VALUE;
            long j4 = 0;
            int i27 = 0;
            int i28 = 0;
            while (i28 < childCount2) {
                int i29 = iMax;
                C0233k c0233k4 = (C0233k) getChildAt(i28).getLayoutParams();
                boolean z11 = z9;
                if (c0233k4.f3722f) {
                    int i30 = c0233k4.f3720d;
                    if (i30 < i26) {
                        j4 = 1 << i28;
                        i26 = i30;
                        i27 = 1;
                    } else if (i30 == i26) {
                        j4 |= 1 << i28;
                        i27++;
                    }
                }
                i28++;
                z9 = z11;
                iMax = i29;
            }
            i6 = iMax;
            boolean z12 = z9;
            j3 |= j4;
            if (i27 > i25) {
                break;
            }
            int i31 = i26 + 1;
            int i32 = 0;
            while (i32 < childCount2) {
                View childAt2 = getChildAt(i32);
                C0233k c0233k5 = (C0233k) childAt2.getLayoutParams();
                boolean z13 = z5;
                long j5 = 1 << i32;
                if ((j4 & j5) != 0) {
                    if (z12 && c0233k5.f3723g) {
                        r11 = 1;
                        r11 = 1;
                        if (i25 == 1) {
                            childAt2.setPadding(i5 + i24, 0, i5, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c0233k5.f3720d += r11;
                    c0233k5.f3724h = r11;
                    i25--;
                } else if (c0233k5.f3720d == i31) {
                    j3 |= j5;
                }
                i32++;
                z5 = z13;
            }
            z9 = z12;
            iMax = i6;
            z10 = true;
        }
        boolean z14 = !z5 && i15 == 1;
        if (i25 > 0 && j3 != 0 && (i25 < i15 - 1 || z14 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j3);
            if (!z14) {
                if ((j3 & 1) != 0 && !((C0233k) getChildAt(0).getLayoutParams()).f3723g) {
                    fBitCount -= 0.5f;
                }
                int i33 = childCount2 - 1;
                if ((j3 & ((long) (1 << i33))) != 0 && !((C0233k) getChildAt(i33).getLayoutParams()).f3723g) {
                    fBitCount -= 0.5f;
                }
            }
            int i34 = fBitCount > 0.0f ? (int) ((i25 * i24) / fBitCount) : 0;
            boolean z15 = z10;
            for (int i35 = 0; i35 < childCount2; i35++) {
                if ((j3 & ((long) (1 << i35))) != 0) {
                    View childAt3 = getChildAt(i35);
                    C0233k c0233k6 = (C0233k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0233k6.f3721e = i34;
                        c0233k6.f3724h = true;
                        if (i35 == 0 && !c0233k6.f3723g) {
                            ((ViewGroup.MarginLayoutParams) c0233k6).leftMargin = (-i34) / 2;
                        }
                        z15 = true;
                    } else if (c0233k6.f3719c) {
                        c0233k6.f3721e = i34;
                        c0233k6.f3724h = true;
                        ((ViewGroup.MarginLayoutParams) c0233k6).rightMargin = (-i34) / 2;
                        z15 = true;
                    } else {
                        if (i35 != 0) {
                            ((ViewGroup.MarginLayoutParams) c0233k6).leftMargin = i34 / 2;
                        }
                        if (i35 != childCount2 - 1) {
                            ((ViewGroup.MarginLayoutParams) c0233k6).rightMargin = i34 / 2;
                        }
                    }
                }
            }
            z10 = z15;
        }
        if (z10) {
            for (int i36 = 0; i36 < childCount2; i36++) {
                View childAt4 = getChildAt(i36);
                C0233k c0233k7 = (C0233k) childAt4.getLayoutParams();
                if (c0233k7.f3724h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0233k7.f3720d * i24) + c0233k7.f3721e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i10, mode != 1073741824 ? i6 : i22);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f1778C.f3711z = z3;
    }

    public void setOnMenuItemClickListener(InterfaceC0234l interfaceC0234l) {
        this.f1783H = interfaceC0234l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0231i c0231i = this.f1778C;
        C0230h c0230h = c0231i.f3706r;
        if (c0230h != null) {
            c0230h.setImageDrawable(drawable);
        } else {
            c0231i.f3708t = true;
            c0231i.f3707s = drawable;
        }
    }

    public void setOverflowReserved(boolean z3) {
    }

    public void setPopupTheme(int i3) {
        if (this.f1777B != i3) {
            this.f1777B = i3;
            if (i3 == 0) {
                this.f1776A = getContext();
            } else {
                this.f1776A = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setPresenter(C0231i c0231i) {
        this.f1778C = c0231i;
        c0231i.f3705q = this;
        this.f1784z = c0231i.f3702m;
    }

    @Override // p031k.H, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0233k(getContext(), attributeSet);
    }
}
