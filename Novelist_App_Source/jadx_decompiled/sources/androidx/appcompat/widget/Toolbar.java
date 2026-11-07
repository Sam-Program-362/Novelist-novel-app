package androidx.appcompat.widget;

import A0.j;
import B1.g;
import D.G;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import f.AbstractC0243a;
import g.AbstractC0250a;
import i.C0281d;
import it.returntrue.novelist.R;
import j.k;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k.C0343f;
import k.C0346i;
import k.C0353p;
import k.C0354q;
import k.C0357u;
import k.InterfaceC0335A;
import k.T;
import k.m0;
import k.n0;
import k.o0;
import k.p0;
import k.q0;
import k.r0;
import k.x0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public int f1870A;

    /* renamed from: B, reason: collision with root package name */
    public int f1871B;

    /* renamed from: C, reason: collision with root package name */
    public int f1872C;

    /* renamed from: D, reason: collision with root package name */
    public T f1873D;

    /* renamed from: E, reason: collision with root package name */
    public int f1874E;

    /* renamed from: F, reason: collision with root package name */
    public int f1875F;

    /* renamed from: G, reason: collision with root package name */
    public final int f1876G;

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f1877H;

    /* renamed from: I, reason: collision with root package name */
    public CharSequence f1878I;

    /* renamed from: J, reason: collision with root package name */
    public ColorStateList f1879J;

    /* renamed from: K, reason: collision with root package name */
    public ColorStateList f1880K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f1881L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1882M;

    /* renamed from: N, reason: collision with root package name */
    public final ArrayList f1883N;

    /* renamed from: O, reason: collision with root package name */
    public final ArrayList f1884O;

    /* renamed from: P, reason: collision with root package name */
    public final int[] f1885P;

    /* renamed from: Q, reason: collision with root package name */
    public final g f1886Q;

    /* renamed from: R, reason: collision with root package name */
    public r0 f1887R;
    public n0 S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f1888T;

    /* renamed from: U, reason: collision with root package name */
    public final A.b f1889U;

    /* renamed from: k, reason: collision with root package name */
    public ActionMenuView f1890k;

    /* renamed from: l, reason: collision with root package name */
    public C0357u f1891l;

    /* renamed from: m, reason: collision with root package name */
    public C0357u f1892m;
    public C0353p n;

    /* renamed from: o, reason: collision with root package name */
    public C0354q f1893o;

    /* renamed from: p, reason: collision with root package name */
    public final Drawable f1894p;

    /* renamed from: q, reason: collision with root package name */
    public final CharSequence f1895q;

    /* renamed from: r, reason: collision with root package name */
    public C0353p f1896r;

    /* renamed from: s, reason: collision with root package name */
    public View f1897s;

    /* renamed from: t, reason: collision with root package name */
    public Context f1898t;
    public int u;

    /* renamed from: v, reason: collision with root package name */
    public int f1899v;

    /* renamed from: w, reason: collision with root package name */
    public int f1900w;
    public final int x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public int f1901z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1876G = 8388627;
        this.f1883N = new ArrayList();
        this.f1884O = new ArrayList();
        this.f1885P = new int[2];
        this.f1886Q = new g(this, 15);
        this.f1889U = new A.b(this, 11);
        Context context2 = getContext();
        int[] iArr = AbstractC0243a.u;
        j F3 = j.F(context2, attributeSet, iArr, R.attr.toolbarStyle);
        G.b(this, context, iArr, attributeSet, (TypedArray) F3.f58m, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) F3.f58m;
        this.f1899v = typedArray.getResourceId(28, 0);
        this.f1900w = typedArray.getResourceId(19, 0);
        this.f1876G = typedArray.getInteger(0, 8388627);
        this.x = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1872C = dimensionPixelOffset;
        this.f1871B = dimensionPixelOffset;
        this.f1870A = dimensionPixelOffset;
        this.f1901z = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1901z = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1870A = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1871B = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1872C = dimensionPixelOffset5;
        }
        this.y = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        T t3 = this.f1873D;
        t3.f3652h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            t3.f3649e = dimensionPixelSize;
            t3.f3645a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            t3.f3650f = dimensionPixelSize2;
            t3.f3646b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            t3.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1874E = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1875F = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1894p = F3.y(4);
        this.f1895q = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1898t = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable y = F3.y(16);
        if (y != null) {
            setNavigationIcon(y);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable y3 = F3.y(11);
        if (y3 != null) {
            setLogo(y3);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(F3.x(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(F3.x(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        F3.J();
    }

    public static o0 g() {
        o0 o0Var = new o0(-2, -2);
        o0Var.f3744b = 0;
        o0Var.f3743a = 8388627;
        return o0Var;
    }

    private MenuInflater getMenuInflater() {
        return new C0281d(getContext());
    }

    public static o0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z3 = layoutParams instanceof o0;
        if (z3) {
            o0 o0Var = (o0) layoutParams;
            o0 o0Var2 = new o0(o0Var);
            o0Var2.f3744b = 0;
            o0Var2.f3744b = o0Var.f3744b;
            return o0Var2;
        }
        if (z3) {
            o0 o0Var3 = new o0((o0) layoutParams);
            o0Var3.f3744b = 0;
            return o0Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            o0 o0Var4 = new o0(layoutParams);
            o0Var4.f3744b = 0;
            return o0Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        o0 o0Var5 = new o0(marginLayoutParams);
        o0Var5.f3744b = 0;
        ((ViewGroup.MarginLayoutParams) o0Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) o0Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) o0Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) o0Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return o0Var5;
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i3) {
        Field field = G.f187a;
        boolean z3 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, getLayoutDirection());
        arrayList.clear();
        if (!z3) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                o0 o0Var = (o0) childAt.getLayoutParams();
                if (o0Var.f3744b == 0 && q(childAt)) {
                    int i5 = o0Var.f3743a;
                    Field field2 = G.f187a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            o0 o0Var2 = (o0) childAt2.getLayoutParams();
            if (o0Var2.f3744b == 0 && q(childAt2)) {
                int i7 = o0Var2.f3743a;
                Field field3 = G.f187a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i7, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o0 g3 = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (o0) layoutParams;
        g3.f3744b = 1;
        if (!z3 || this.f1897s == null) {
            addView(view, g3);
        } else {
            view.setLayoutParams(g3);
            this.f1884O.add(view);
        }
    }

    public final void c() {
        if (this.f1896r == null) {
            C0353p c0353p = new C0353p(getContext());
            this.f1896r = c0353p;
            c0353p.setImageDrawable(this.f1894p);
            this.f1896r.setContentDescription(this.f1895q);
            o0 g3 = g();
            g3.f3743a = (this.x & 112) | 8388611;
            g3.f3744b = 2;
            this.f1896r.setLayoutParams(g3);
            this.f1896r.setOnClickListener(new m0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof o0);
    }

    public final void d() {
        if (this.f1873D == null) {
            T t3 = new T();
            t3.f3645a = 0;
            t3.f3646b = 0;
            t3.f3647c = Integer.MIN_VALUE;
            t3.f3648d = Integer.MIN_VALUE;
            t3.f3649e = 0;
            t3.f3650f = 0;
            t3.f3651g = false;
            t3.f3652h = false;
            this.f1873D = t3;
        }
    }

    public final void e() {
        if (this.f1890k == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1890k = actionMenuView;
            actionMenuView.setPopupTheme(this.u);
            this.f1890k.setOnMenuItemClickListener(this.f1886Q);
            this.f1890k.getClass();
            o0 g3 = g();
            g3.f3743a = (this.x & 112) | 8388613;
            this.f1890k.setLayoutParams(g3);
            b(this.f1890k, false);
        }
        ActionMenuView actionMenuView2 = this.f1890k;
        if (actionMenuView2.f1784z == null) {
            j.j jVar = (j.j) actionMenuView2.getMenu();
            if (this.S == null) {
                this.S = new n0(this);
            }
            this.f1890k.setExpandedActionViewsExclusive(true);
            jVar.b(this.S, this.f1898t);
        }
    }

    public final void f() {
        if (this.n == null) {
            this.n = new C0353p(getContext());
            o0 g3 = g();
            g3.f3743a = (this.x & 112) | 8388611;
            this.n.setLayoutParams(g3);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0353p c0353p = this.f1896r;
        if (c0353p != null) {
            return c0353p.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0353p c0353p = this.f1896r;
        if (c0353p != null) {
            return c0353p.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        T t3 = this.f1873D;
        if (t3 != null) {
            return t3.f3651g ? t3.f3645a : t3.f3646b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i3 = this.f1875F;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        T t3 = this.f1873D;
        if (t3 != null) {
            return t3.f3645a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        T t3 = this.f1873D;
        if (t3 != null) {
            return t3.f3646b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        T t3 = this.f1873D;
        if (t3 != null) {
            return t3.f3651g ? t3.f3646b : t3.f3645a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i3 = this.f1874E;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        j.j jVar;
        ActionMenuView actionMenuView = this.f1890k;
        return (actionMenuView == null || (jVar = actionMenuView.f1784z) == null || !jVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1875F, 0));
    }

    public int getCurrentContentInsetLeft() {
        Field field = G.f187a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = G.f187a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1874E, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0354q c0354q = this.f1893o;
        if (c0354q != null) {
            return c0354q.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0354q c0354q = this.f1893o;
        if (c0354q != null) {
            return c0354q.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1890k.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        C0353p c0353p = this.n;
        if (c0353p != null) {
            return c0353p.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0353p c0353p = this.n;
        if (c0353p != null) {
            return c0353p.getDrawable();
        }
        return null;
    }

    public C0346i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1890k.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1898t;
    }

    public int getPopupTheme() {
        return this.u;
    }

    public CharSequence getSubtitle() {
        return this.f1878I;
    }

    public final TextView getSubtitleTextView() {
        return this.f1892m;
    }

    public CharSequence getTitle() {
        return this.f1877H;
    }

    public int getTitleMarginBottom() {
        return this.f1872C;
    }

    public int getTitleMarginEnd() {
        return this.f1870A;
    }

    public int getTitleMarginStart() {
        return this.f1901z;
    }

    public int getTitleMarginTop() {
        return this.f1871B;
    }

    public final TextView getTitleTextView() {
        return this.f1891l;
    }

    public InterfaceC0335A getWrapper() {
        Drawable drawable;
        if (this.f1887R == null) {
            r0 r0Var = new r0();
            r0Var.f3761l = 0;
            r0Var.f3750a = this;
            r0Var.f3757h = getTitle();
            r0Var.f3758i = getSubtitle();
            r0Var.f3756g = r0Var.f3757h != null;
            r0Var.f3755f = getNavigationIcon();
            j F3 = j.F(getContext(), null, AbstractC0243a.f2789a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) F3.f58m;
            r0Var.f3762m = F3.y(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                r0Var.f3756g = true;
                r0Var.f3757h = text;
                if ((r0Var.f3751b & 8) != 0) {
                    r0Var.f3750a.setTitle(text);
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                r0Var.f3758i = text2;
                if ((r0Var.f3751b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable y = F3.y(20);
            if (y != null) {
                r0Var.f3754e = y;
                r0Var.c();
            }
            Drawable y3 = F3.y(17);
            if (y3 != null) {
                r0Var.f3753d = y3;
                r0Var.c();
            }
            if (r0Var.f3755f == null && (drawable = r0Var.f3762m) != null) {
                r0Var.f3755f = drawable;
                Toolbar toolbar = r0Var.f3750a;
                if ((r0Var.f3751b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            r0Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = r0Var.f3752c;
                if (view != null && (r0Var.f3751b & 16) != 0) {
                    removeView(view);
                }
                r0Var.f3752c = inflate;
                if (inflate != null && (r0Var.f3751b & 16) != 0) {
                    addView(inflate);
                }
                r0Var.a(r0Var.f3751b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f1873D.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1899v = resourceId2;
                C0357u c0357u = this.f1891l;
                if (c0357u != null) {
                    c0357u.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1900w = resourceId3;
                C0357u c0357u2 = this.f1892m;
                if (c0357u2 != null) {
                    c0357u2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            F3.J();
            if (R.string.abc_action_bar_up_description != r0Var.f3761l) {
                r0Var.f3761l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = r0Var.f3761l;
                    r0Var.f3759j = i3 != 0 ? getContext().getString(i3) : null;
                    r0Var.b();
                }
            }
            r0Var.f3759j = getNavigationContentDescription();
            setNavigationOnClickListener(new m0(r0Var));
            this.f1887R = r0Var;
        }
        return this.f1887R;
    }

    public final int i(View view, int i3) {
        o0 o0Var = (o0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i3 > 0 ? (measuredHeight - i3) / 2 : 0;
        int i5 = o0Var.f3743a & 112;
        if (i5 != 16 && i5 != 48 && i5 != 80) {
            i5 = this.f1876G & 112;
        }
        if (i5 == 48) {
            return getPaddingTop() - i4;
        }
        if (i5 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin) - i4;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i6 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i7 = ((ViewGroup.MarginLayoutParams) o0Var).topMargin;
        if (i6 < i7) {
            i6 = i7;
        } else {
            int i8 = (((height - paddingBottom) - measuredHeight) - i6) - paddingTop;
            int i9 = ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin;
            if (i8 < i9) {
                i6 = Math.max(0, i6 - (i9 - i8));
            }
        }
        return paddingTop + i6;
    }

    public final boolean l(View view) {
        return view.getParent() == this || this.f1884O.contains(view);
    }

    public final int m(View view, int i3, int i4, int[] iArr) {
        o0 o0Var = (o0) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) o0Var).leftMargin - iArr[0];
        int max = Math.max(0, i5) + i3;
        iArr[0] = Math.max(0, -i5);
        int i6 = i(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i6, max + measuredWidth, view.getMeasuredHeight() + i6);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin + max;
    }

    public final int n(View view, int i3, int i4, int[] iArr) {
        o0 o0Var = (o0) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) o0Var).rightMargin - iArr[1];
        int max = i3 - Math.max(0, i5);
        iArr[1] = Math.max(0, -i5);
        int i6 = i(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i6, max, view.getMeasuredHeight() + i6);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) o0Var).leftMargin);
    }

    public final int o(View view, int i3, int i4, int i5, int i6, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i7 = marginLayoutParams.leftMargin - iArr[0];
        int i8 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i8) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i7);
        iArr[1] = Math.max(0, -i8);
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + max + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1889U);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1882M = false;
        }
        if (!this.f1882M) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1882M = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1882M = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028f A[LOOP:0: B:39:0x028d->B:40:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a7 A[LOOP:1: B:43:0x02a5->B:44:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02c7 A[LOOP:2: B:47:0x02c5->B:48:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x031a A[LOOP:3: B:56:0x0318->B:57:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean a3 = x0.a(this);
        int i12 = !a3 ? 1 : 0;
        int i13 = 0;
        if (q(this.n)) {
            p(this.n, i3, 0, i4, this.y);
            i5 = j(this.n) + this.n.getMeasuredWidth();
            i6 = Math.max(0, k(this.n) + this.n.getMeasuredHeight());
            i7 = View.combineMeasuredStates(0, this.n.getMeasuredState());
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (q(this.f1896r)) {
            p(this.f1896r, i3, 0, i4, this.y);
            i5 = j(this.f1896r) + this.f1896r.getMeasuredWidth();
            i6 = Math.max(i6, k(this.f1896r) + this.f1896r.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f1896r.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5);
        int max2 = Math.max(0, currentContentInsetStart - i5);
        int[] iArr = this.f1885P;
        iArr[a3 ? 1 : 0] = max2;
        if (q(this.f1890k)) {
            p(this.f1890k, i3, max, i4, this.y);
            i8 = j(this.f1890k) + this.f1890k.getMeasuredWidth();
            i6 = Math.max(i6, k(this.f1890k) + this.f1890k.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f1890k.getMeasuredState());
        } else {
            i8 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i8);
        iArr[i12] = Math.max(0, currentContentInsetEnd - i8);
        if (q(this.f1897s)) {
            max3 += o(this.f1897s, i3, max3, i4, 0, iArr);
            i6 = Math.max(i6, k(this.f1897s) + this.f1897s.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f1897s.getMeasuredState());
        }
        if (q(this.f1893o)) {
            max3 += o(this.f1893o, i3, max3, i4, 0, iArr);
            i6 = Math.max(i6, k(this.f1893o) + this.f1893o.getMeasuredHeight());
            i7 = View.combineMeasuredStates(i7, this.f1893o.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (((o0) childAt.getLayoutParams()).f3744b == 0 && q(childAt)) {
                max3 += o(childAt, i3, max3, i4, 0, iArr);
                int max4 = Math.max(i6, k(childAt) + childAt.getMeasuredHeight());
                i7 = View.combineMeasuredStates(i7, childAt.getMeasuredState());
                i6 = max4;
            } else {
                max3 = max3;
            }
        }
        int i15 = max3;
        int i16 = this.f1871B + this.f1872C;
        int i17 = this.f1901z + this.f1870A;
        if (q(this.f1891l)) {
            o(this.f1891l, i3, i15 + i17, i4, i16, iArr);
            int j3 = j(this.f1891l) + this.f1891l.getMeasuredWidth();
            i9 = k(this.f1891l) + this.f1891l.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i7, this.f1891l.getMeasuredState());
            i11 = j3;
        } else {
            i9 = 0;
            i10 = i7;
            i11 = 0;
        }
        if (q(this.f1892m)) {
            i11 = Math.max(i11, o(this.f1892m, i3, i15 + i17, i4, i16 + i9, iArr));
            i9 += k(this.f1892m) + this.f1892m.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i10, this.f1892m.getMeasuredState());
        }
        int max5 = Math.max(i6, i9);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i15 + i11;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max5;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i3, (-16777216) & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, i10 << 16);
        if (this.f1888T) {
            int childCount2 = getChildCount();
            for (int i18 = 0; i18 < childCount2; i18++) {
                View childAt2 = getChildAt(i18);
                if (!q(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i13);
        }
        i13 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i13);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof q0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        q0 q0Var = (q0) parcelable;
        super.onRestoreInstanceState(q0Var.f1286k);
        ActionMenuView actionMenuView = this.f1890k;
        j.j jVar = actionMenuView != null ? actionMenuView.f1784z : null;
        int i3 = q0Var.f3749m;
        if (i3 != 0 && this.S != null && jVar != null && (findItem = jVar.findItem(i3)) != null) {
            findItem.expandActionView();
        }
        if (q0Var.n) {
            A.b bVar = this.f1889U;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        d();
        T t3 = this.f1873D;
        boolean z3 = i3 == 1;
        if (z3 == t3.f3651g) {
            return;
        }
        t3.f3651g = z3;
        if (!t3.f3652h) {
            t3.f3645a = t3.f3649e;
            t3.f3646b = t3.f3650f;
            return;
        }
        if (z3) {
            int i4 = t3.f3648d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = t3.f3649e;
            }
            t3.f3645a = i4;
            int i5 = t3.f3647c;
            if (i5 == Integer.MIN_VALUE) {
                i5 = t3.f3650f;
            }
            t3.f3646b = i5;
            return;
        }
        int i6 = t3.f3647c;
        if (i6 == Integer.MIN_VALUE) {
            i6 = t3.f3649e;
        }
        t3.f3645a = i6;
        int i7 = t3.f3648d;
        if (i7 == Integer.MIN_VALUE) {
            i7 = t3.f3650f;
        }
        t3.f3646b = i7;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0346i c0346i;
        C0343f c0343f;
        k kVar;
        q0 q0Var = new q0(super.onSaveInstanceState());
        n0 n0Var = this.S;
        if (n0Var != null && (kVar = n0Var.f3738l) != null) {
            q0Var.f3749m = kVar.f3452a;
        }
        ActionMenuView actionMenuView = this.f1890k;
        q0Var.n = (actionMenuView == null || (c0346i = actionMenuView.f1778C) == null || (c0343f = c0346i.f3695B) == null || !c0343f.b()) ? false : true;
        return q0Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1881L = false;
        }
        if (!this.f1881L) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1881L = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f1881L = false;
        return true;
    }

    public final void p(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(int i3) {
        setCollapseContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setCollapseIcon(int i3) {
        setCollapseIcon(AbstractC0250a.a(getContext(), i3));
    }

    public void setCollapsible(boolean z3) {
        this.f1888T = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f1875F) {
            this.f1875F = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f1874E) {
            this.f1874E = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i3) {
        setLogo(AbstractC0250a.a(getContext(), i3));
    }

    public void setLogoDescription(int i3) {
        setLogoDescription(getContext().getText(i3));
    }

    public void setNavigationContentDescription(int i3) {
        setNavigationContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setNavigationIcon(int i3) {
        setNavigationIcon(AbstractC0250a.a(getContext(), i3));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.n.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1890k.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i3) {
        if (this.u != i3) {
            this.u = i3;
            if (i3 == 0) {
                this.f1898t = getContext();
            } else {
                this.f1898t = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setSubtitle(int i3) {
        setSubtitle(getContext().getText(i3));
    }

    public void setSubtitleTextColor(int i3) {
        setSubtitleTextColor(ColorStateList.valueOf(i3));
    }

    public void setTitle(int i3) {
        setTitle(getContext().getText(i3));
    }

    public void setTitleMarginBottom(int i3) {
        this.f1872C = i3;
        requestLayout();
    }

    public void setTitleMarginEnd(int i3) {
        this.f1870A = i3;
        requestLayout();
    }

    public void setTitleMarginStart(int i3) {
        this.f1901z = i3;
        requestLayout();
    }

    public void setTitleMarginTop(int i3) {
        this.f1871B = i3;
        requestLayout();
    }

    public void setTitleTextColor(int i3) {
        setTitleTextColor(ColorStateList.valueOf(i3));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        o0 o0Var = new o0(context, attributeSet);
        o0Var.f3743a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0243a.f2790b);
        o0Var.f3743a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        o0Var.f3744b = 0;
        return o0Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0353p c0353p = this.f1896r;
        if (c0353p != null) {
            c0353p.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1896r.setImageDrawable(drawable);
        } else {
            C0353p c0353p = this.f1896r;
            if (c0353p != null) {
                c0353p.setImageDrawable(this.f1894p);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1893o == null) {
                this.f1893o = new C0354q(getContext(), 0);
            }
            if (!l(this.f1893o)) {
                b(this.f1893o, true);
            }
        } else {
            C0354q c0354q = this.f1893o;
            if (c0354q != null && l(c0354q)) {
                removeView(this.f1893o);
                this.f1884O.remove(this.f1893o);
            }
        }
        C0354q c0354q2 = this.f1893o;
        if (c0354q2 != null) {
            c0354q2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1893o == null) {
            this.f1893o = new C0354q(getContext(), 0);
        }
        C0354q c0354q = this.f1893o;
        if (c0354q != null) {
            c0354q.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C0353p c0353p = this.n;
        if (c0353p != null) {
            c0353p.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!l(this.n)) {
                b(this.n, true);
            }
        } else {
            C0353p c0353p = this.n;
            if (c0353p != null && l(c0353p)) {
                removeView(this.n);
                this.f1884O.remove(this.n);
            }
        }
        C0353p c0353p2 = this.n;
        if (c0353p2 != null) {
            c0353p2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0357u c0357u = this.f1892m;
            if (c0357u != null && l(c0357u)) {
                removeView(this.f1892m);
                this.f1884O.remove(this.f1892m);
            }
        } else {
            if (this.f1892m == null) {
                Context context = getContext();
                C0357u c0357u2 = new C0357u(context, null);
                this.f1892m = c0357u2;
                c0357u2.setSingleLine();
                this.f1892m.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f1900w;
                if (i3 != 0) {
                    this.f1892m.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f1880K;
                if (colorStateList != null) {
                    this.f1892m.setTextColor(colorStateList);
                }
            }
            if (!l(this.f1892m)) {
                b(this.f1892m, true);
            }
        }
        C0357u c0357u3 = this.f1892m;
        if (c0357u3 != null) {
            c0357u3.setText(charSequence);
        }
        this.f1878I = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1880K = colorStateList;
        C0357u c0357u = this.f1892m;
        if (c0357u != null) {
            c0357u.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0357u c0357u = this.f1891l;
            if (c0357u != null && l(c0357u)) {
                removeView(this.f1891l);
                this.f1884O.remove(this.f1891l);
            }
        } else {
            if (this.f1891l == null) {
                Context context = getContext();
                C0357u c0357u2 = new C0357u(context, null);
                this.f1891l = c0357u2;
                c0357u2.setSingleLine();
                this.f1891l.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f1899v;
                if (i3 != 0) {
                    this.f1891l.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f1879J;
                if (colorStateList != null) {
                    this.f1891l.setTextColor(colorStateList);
                }
            }
            if (!l(this.f1891l)) {
                b(this.f1891l, true);
            }
        }
        C0357u c0357u3 = this.f1891l;
        if (c0357u3 != null) {
            c0357u3.setText(charSequence);
        }
        this.f1877H = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1879J = colorStateList;
        C0357u c0357u = this.f1891l;
        if (c0357u != null) {
            c0357u.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(p0 p0Var) {
    }
}
