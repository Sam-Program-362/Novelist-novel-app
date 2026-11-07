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
import j.i;
import j.j;
import j.k;
import k.C0343f;
import k.C0345h;
import k.C0346i;
import k.C0348k;
import k.G;
import k.H;
import k.InterfaceC0347j;
import k.InterfaceC0349l;
import k.x0;

/* loaded from: classes.dex */
public class ActionMenuView extends H implements i {

    /* renamed from: A, reason: collision with root package name */
    public Context f1776A;

    /* renamed from: B, reason: collision with root package name */
    public int f1777B;

    /* renamed from: C, reason: collision with root package name */
    public C0346i f1778C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1779D;

    /* renamed from: E, reason: collision with root package name */
    public int f1780E;

    /* renamed from: F, reason: collision with root package name */
    public final int f1781F;

    /* renamed from: G, reason: collision with root package name */
    public final int f1782G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC0349l f1783H;

    /* renamed from: z, reason: collision with root package name */
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

    public static C0348k h() {
        C0348k c0348k = new C0348k(-2);
        c0348k.f3719c = false;
        c0348k.f3595b = 16;
        return c0348k;
    }

    public static C0348k i(ViewGroup.LayoutParams layoutParams) {
        C0348k c0348k;
        if (layoutParams == null) {
            return h();
        }
        if (layoutParams instanceof C0348k) {
            C0348k c0348k2 = (C0348k) layoutParams;
            c0348k = new C0348k(c0348k2);
            c0348k.f3719c = c0348k2.f3719c;
        } else {
            c0348k = new C0348k(layoutParams);
        }
        if (c0348k.f3595b <= 0) {
            c0348k.f3595b = 16;
        }
        return c0348k;
    }

    @Override // j.i
    public final boolean a(k kVar) {
        return this.f1784z.p(kVar, null, 0);
    }

    @Override // k.H, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0348k;
    }

    @Override // k.H
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ G generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // k.H
    /* renamed from: e */
    public final G generateLayoutParams(AttributeSet attributeSet) {
        return new C0348k(getContext(), attributeSet);
    }

    @Override // k.H
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ G generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // k.H, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // k.H, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1784z == null) {
            Context context = getContext();
            j jVar = new j(context);
            this.f1784z = jVar;
            jVar.f3435e = new B1.a(this, 19);
            C0346i c0346i = new C0346i(context);
            this.f1778C = c0346i;
            c0346i.u = true;
            c0346i.f3709v = true;
            c0346i.f3703o = new A(20);
            this.f1784z.b(c0346i, this.f1776A);
            C0346i c0346i2 = this.f1778C;
            c0346i2.f3705q = this;
            this.f1784z = c0346i2.f3702m;
        }
        return this.f1784z;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0346i c0346i = this.f1778C;
        C0345h c0345h = c0346i.f3706r;
        if (c0345h != null) {
            return c0345h.getDrawable();
        }
        if (c0346i.f3708t) {
            return c0346i.f3707s;
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
        boolean z3 = false;
        if (i3 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i3 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i3);
        if (i3 < getChildCount() && (childAt instanceof InterfaceC0347j)) {
            z3 = ((InterfaceC0347j) childAt).b();
        }
        return (i3 <= 0 || !(childAt2 instanceof InterfaceC0347j)) ? z3 : ((InterfaceC0347j) childAt2).c() | z3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0346i c0346i = this.f1778C;
        if (c0346i != null) {
            c0346i.d();
            C0343f c0343f = this.f1778C.f3695B;
            if (c0343f == null || !c0343f.b()) {
                return;
            }
            this.f1778C.e();
            this.f1778C.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0346i c0346i = this.f1778C;
        if (c0346i != null) {
            c0346i.e();
            C0343f c0343f = c0346i.f3696C;
            if (c0343f == null || !c0343f.b()) {
                return;
            }
            c0343f.f3484i.dismiss();
        }
    }

    @Override // k.H, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int width;
        int i7;
        if (!this.f1779D) {
            super.onLayout(z3, i3, i4, i5, i6);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i6 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i5 - i3;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean a3 = x0.a(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C0348k c0348k = (C0348k) childAt.getLayoutParams();
                if (c0348k.f3719c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a3) {
                        i7 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0348k).leftMargin;
                        width = i7 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0348k).rightMargin;
                        i7 = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i7, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0348k).leftMargin) + ((ViewGroup.MarginLayoutParams) c0348k).rightMargin;
                    j(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (a3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                C0348k c0348k2 = (C0348k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0348k2.f3719c) {
                    int i18 = width2 - ((ViewGroup.MarginLayoutParams) c0348k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0348k2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            C0348k c0348k3 = (C0348k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0348k3.f3719c) {
                int i21 = paddingLeft + ((ViewGroup.MarginLayoutParams) c0348k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = measuredWidth4 + ((ViewGroup.MarginLayoutParams) c0348k3).rightMargin + max + i21;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // k.H, android.view.View
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
                C0348k c0348k = (C0348k) getChildAt(i9).getLayoutParams();
                ((ViewGroup.MarginLayoutParams) c0348k).rightMargin = 0;
                ((ViewGroup.MarginLayoutParams) c0348k).leftMargin = 0;
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
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z5 = false;
        int i19 = 0;
        long j3 = 0;
        while (true) {
            i5 = this.f1782G;
            if (i18 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i18);
            int i20 = size3;
            int i21 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i7 = i14;
            } else {
                boolean z6 = childAt instanceof ActionMenuItemView;
                i16++;
                if (z6) {
                    childAt.setPadding(i5, 0, i5, 0);
                }
                C0348k c0348k2 = (C0348k) childAt.getLayoutParams();
                c0348k2.f3724h = false;
                c0348k2.f3721e = 0;
                c0348k2.f3720d = 0;
                c0348k2.f3722f = false;
                ((ViewGroup.MarginLayoutParams) c0348k2).leftMargin = 0;
                ((ViewGroup.MarginLayoutParams) c0348k2).rightMargin = 0;
                c0348k2.f3723g = z6 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i22 = c0348k2.f3719c ? 1 : i12;
                C0348k c0348k3 = (C0348k) childAt.getLayoutParams();
                int i23 = i12;
                i7 = i14;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i21, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z6 ? (ActionMenuItemView) childAt : null;
                boolean z7 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z8 = z7;
                if (i22 <= 0 || (z7 && i22 < 2)) {
                    i8 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i22, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i8 = measuredWidth / i7;
                    if (measuredWidth % i7 != 0) {
                        i8++;
                    }
                    if (z8 && i8 < 2) {
                        i8 = 2;
                    }
                }
                c0348k3.f3722f = !c0348k3.f3719c && z8;
                c0348k3.f3720d = i8;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i8 * i7, 1073741824), makeMeasureSpec);
                i17 = Math.max(i17, i8);
                if (c0348k2.f3722f) {
                    i19++;
                }
                if (c0348k2.f3719c) {
                    z5 = true;
                }
                i12 = i23 - i8;
                i15 = Math.max(i15, childAt.getMeasuredHeight());
                if (i8 == 1) {
                    j3 |= 1 << i18;
                }
            }
            i18++;
            size3 = i20;
            paddingBottom = i21;
            i14 = i7;
        }
        int i24 = size3;
        int i25 = i12;
        int i26 = i14;
        boolean z9 = z5 && i16 == 2;
        int i27 = i25;
        boolean z10 = false;
        while (i19 > 0 && i27 > 0) {
            int i28 = Integer.MAX_VALUE;
            long j4 = 0;
            int i29 = 0;
            int i30 = 0;
            while (i30 < childCount2) {
                int i31 = i15;
                C0348k c0348k4 = (C0348k) getChildAt(i30).getLayoutParams();
                boolean z11 = z9;
                if (c0348k4.f3722f) {
                    int i32 = c0348k4.f3720d;
                    if (i32 < i28) {
                        j4 = 1 << i30;
                        i28 = i32;
                        i29 = 1;
                    } else if (i32 == i28) {
                        j4 |= 1 << i30;
                        i29++;
                    }
                }
                i30++;
                z9 = z11;
                i15 = i31;
            }
            i6 = i15;
            boolean z12 = z9;
            j3 |= j4;
            if (i29 > i27) {
                break;
            }
            int i33 = i28 + 1;
            int i34 = 0;
            while (i34 < childCount2) {
                View childAt2 = getChildAt(i34);
                C0348k c0348k5 = (C0348k) childAt2.getLayoutParams();
                boolean z13 = z5;
                long j5 = 1 << i34;
                if ((j4 & j5) != 0) {
                    if (z12 && c0348k5.f3723g) {
                        r11 = 1;
                        r11 = 1;
                        if (i27 == 1) {
                            childAt2.setPadding(i5 + i26, 0, i5, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    c0348k5.f3720d += r11;
                    c0348k5.f3724h = r11;
                    i27--;
                } else if (c0348k5.f3720d == i33) {
                    j3 |= j5;
                }
                i34++;
                z5 = z13;
            }
            z9 = z12;
            i15 = i6;
            z10 = true;
        }
        i6 = i15;
        boolean z14 = !z5 && i16 == 1;
        if (i27 > 0 && j3 != 0 && (i27 < i16 - 1 || z14 || i17 > 1)) {
            float bitCount = Long.bitCount(j3);
            if (!z14) {
                if ((j3 & 1) != 0 && !((C0348k) getChildAt(0).getLayoutParams()).f3723g) {
                    bitCount -= 0.5f;
                }
                int i35 = childCount2 - 1;
                if ((j3 & (1 << i35)) != 0 && !((C0348k) getChildAt(i35).getLayoutParams()).f3723g) {
                    bitCount -= 0.5f;
                }
            }
            int i36 = bitCount > 0.0f ? (int) ((i27 * i26) / bitCount) : 0;
            boolean z15 = z10;
            for (int i37 = 0; i37 < childCount2; i37++) {
                if ((j3 & (1 << i37)) != 0) {
                    View childAt3 = getChildAt(i37);
                    C0348k c0348k6 = (C0348k) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0348k6.f3721e = i36;
                        c0348k6.f3724h = true;
                        if (i37 == 0 && !c0348k6.f3723g) {
                            ((ViewGroup.MarginLayoutParams) c0348k6).leftMargin = (-i36) / 2;
                        }
                        z15 = true;
                    } else if (c0348k6.f3719c) {
                        c0348k6.f3721e = i36;
                        c0348k6.f3724h = true;
                        ((ViewGroup.MarginLayoutParams) c0348k6).rightMargin = (-i36) / 2;
                        z15 = true;
                    } else {
                        if (i37 != 0) {
                            ((ViewGroup.MarginLayoutParams) c0348k6).leftMargin = i36 / 2;
                        }
                        if (i37 != childCount2 - 1) {
                            ((ViewGroup.MarginLayoutParams) c0348k6).rightMargin = i36 / 2;
                        }
                    }
                }
            }
            z10 = z15;
        }
        if (z10) {
            for (int i38 = 0; i38 < childCount2; i38++) {
                View childAt4 = getChildAt(i38);
                C0348k c0348k7 = (C0348k) childAt4.getLayoutParams();
                if (c0348k7.f3724h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0348k7.f3720d * i26) + c0348k7.f3721e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i10, mode != 1073741824 ? i6 : i24);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f1778C.f3711z = z3;
    }

    public void setOnMenuItemClickListener(InterfaceC0349l interfaceC0349l) {
        this.f1783H = interfaceC0349l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0346i c0346i = this.f1778C;
        C0345h c0345h = c0346i.f3706r;
        if (c0345h != null) {
            c0345h.setImageDrawable(drawable);
        } else {
            c0346i.f3708t = true;
            c0346i.f3707s = drawable;
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

    public void setPresenter(C0346i c0346i) {
        this.f1778C = c0346i;
        c0346i.f3705q = this;
        this.f1784z = c0346i.f3702m;
    }

    @Override // k.H, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0348k(getContext(), attributeSet);
    }
}
