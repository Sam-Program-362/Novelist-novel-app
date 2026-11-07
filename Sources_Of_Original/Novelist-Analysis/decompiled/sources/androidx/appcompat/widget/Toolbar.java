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
import it.returntrue.novelist.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p025i.d;
import p028j.k;
import p031k.A;
import p031k.C0228f;
import p031k.C0231i;
import p031k.C0238p;
import p031k.C0239q;
import p031k.C0242u;
import p031k.T;
import p031k.m0;
import p031k.n0;
import p031k.o0;
import p031k.p0;
import p031k.q0;
import p031k.r0;
import p031k.x0;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f1870A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f1871B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f1872C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public T f1873D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f1874E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f1875F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int f1876G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public CharSequence f1877H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public CharSequence f1878I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ColorStateList f1879J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ColorStateList f1880K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f1881L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f1882M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final ArrayList f1883N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final ArrayList f1884O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final int[] f1885P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final g f1886Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public r0 f1887R;
    public n0 S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f1888T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final A.b f1889U;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ActionMenuView f1890k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0242u f1891l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0242u f1892m;
    public C0238p n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0239q f1893o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Drawable f1894p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CharSequence f1895q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0238p f1896r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f1897s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Context f1898t;
    public int u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1899v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1900w;
    public final int x;
    public final int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
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
        int[] iArr = p013f.a.u;
        j jVarF = j.F(context2, attributeSet, iArr, R.attr.toolbarStyle);
        G.b(this, context, iArr, attributeSet, (TypedArray) jVarF.f58m, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) jVarF.f58m;
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
        this.f1894p = jVarF.y(4);
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
        Drawable drawableY = jVarF.y(16);
        if (drawableY != null) {
            setNavigationIcon(drawableY);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableY2 = jVarF.y(11);
        if (drawableY2 != null) {
            setLogo(drawableY2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(jVarF.x(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(jVarF.x(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        jVarF.J();
    }

    public static o0 g() {
        o0 o0Var = new o0(-2, -2);
        o0Var.f3744b = 0;
        o0Var.f3743a = 8388627;
        return o0Var;
    }

    private MenuInflater getMenuInflater() {
        return new d(getContext());
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
        o0 o0VarH;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            o0VarH = g();
        } else {
            o0VarH = !checkLayoutParams(layoutParams) ? h(layoutParams) : (o0) layoutParams;
        }
        o0VarH.f3744b = 1;
        if (!z3 || this.f1897s == null) {
            addView(view, o0VarH);
        } else {
            view.setLayoutParams(o0VarH);
            this.f1884O.add(view);
        }
    }

    public final void c() {
        if (this.f1896r == null) {
            C0238p c0238p = new C0238p(getContext());
            this.f1896r = c0238p;
            c0238p.setImageDrawable(this.f1894p);
            this.f1896r.setContentDescription(this.f1895q);
            o0 o0VarG = g();
            o0VarG.f3743a = (this.x & 112) | 8388611;
            o0VarG.f3744b = 2;
            this.f1896r.setLayoutParams(o0VarG);
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
            o0 o0VarG = g();
            o0VarG.f3743a = (this.x & 112) | 8388613;
            this.f1890k.setLayoutParams(o0VarG);
            b(this.f1890k, false);
        }
        ActionMenuView actionMenuView2 = this.f1890k;
        if (actionMenuView2.f1784z == null) {
            p028j.j jVar = (p028j.j) actionMenuView2.getMenu();
            if (this.S == null) {
                this.S = new n0(this);
            }
            this.f1890k.setExpandedActionViewsExclusive(true);
            jVar.b(this.S, this.f1898t);
        }
    }

    public final void f() {
        if (this.n == null) {
            this.n = new C0238p(getContext());
            o0 o0VarG = g();
            o0VarG.f3743a = (this.x & 112) | 8388611;
            this.n.setLayoutParams(o0VarG);
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
        C0238p c0238p = this.f1896r;
        if (c0238p != null) {
            return c0238p.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0238p c0238p = this.f1896r;
        if (c0238p != null) {
            return c0238p.getDrawable();
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
        p028j.j jVar;
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
        C0239q c0239q = this.f1893o;
        if (c0239q != null) {
            return c0239q.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0239q c0239q = this.f1893o;
        if (c0239q != null) {
            return c0239q.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1890k.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        C0238p c0238p = this.n;
        if (c0238p != null) {
            return c0238p.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0238p c0238p = this.n;
        if (c0238p != null) {
            return c0238p.getDrawable();
        }
        return null;
    }

    public C0231i getOuterActionMenuPresenter() {
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

    public A getWrapper() {
        Drawable drawable;
        if (this.f1887R == null) {
            r0 r0Var = new r0();
            r0Var.f3761l = 0;
            r0Var.f3750a = this;
            r0Var.f3757h = getTitle();
            r0Var.f3758i = getSubtitle();
            r0Var.f3756g = r0Var.f3757h != null;
            r0Var.f3755f = getNavigationIcon();
            j jVarF = j.F(getContext(), null, p013f.a.f2789a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) jVarF.f58m;
            r0Var.f3762m = jVarF.y(15);
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
            Drawable drawableY = jVarF.y(20);
            if (drawableY != null) {
                r0Var.f3754e = drawableY;
                r0Var.c();
            }
            Drawable drawableY2 = jVarF.y(17);
            if (drawableY2 != null) {
                r0Var.f3753d = drawableY2;
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
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = r0Var.f3752c;
                if (view != null && (r0Var.f3751b & 16) != 0) {
                    removeView(view);
                }
                r0Var.f3752c = viewInflate;
                if (viewInflate != null && (r0Var.f3751b & 16) != 0) {
                    addView(viewInflate);
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
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f1873D.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1899v = resourceId2;
                C0242u c0242u = this.f1891l;
                if (c0242u != null) {
                    c0242u.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1900w = resourceId3;
                C0242u c0242u2 = this.f1892m;
                if (c0242u2 != null) {
                    c0242u2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            jVarF.J();
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
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = ((ViewGroup.MarginLayoutParams) o0Var).topMargin;
        if (iMax < i6) {
            iMax = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i8 = ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin;
            if (i7 < i8) {
                iMax = Math.max(0, iMax - (i8 - i7));
            }
        }
        return paddingTop + iMax;
    }

    public final boolean l(View view) {
        return view.getParent() == this || this.f1884O.contains(view);
    }

    public final int m(View view, int i3, int i4, int[] iArr) {
        o0 o0Var = (o0) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) o0Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i5) + i3;
        iArr[0] = Math.max(0, -i5);
        int i6 = i(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, i6, iMax + measuredWidth, view.getMeasuredHeight() + i6);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) o0Var).rightMargin + iMax;
    }

    public final int n(View view, int i3, int i4, int[] iArr) {
        o0 o0Var = (o0) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) o0Var).rightMargin - iArr[1];
        int iMax = i3 - Math.max(0, i5);
        iArr[1] = Math.max(0, -i5);
        int i6 = i(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, i6, iMax, view.getMeasuredHeight() + i6);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) o0Var).leftMargin);
    }

    public final int o(View view, int i3, int i4, int i5, int i6, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i7 = marginLayoutParams.leftMargin - iArr[0];
        int i8 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i8) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i7);
        iArr[1] = Math.max(0, -i8);
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + iMax + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
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
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f1882M = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f1882M = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027d  */
    /* JADX WARN: Code duplicated, block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x030d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x030f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0313  */
    /* JADX WARN: Code duplicated, block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x017b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0187  */
    /* JADX WARN: Code duplicated, block: B:72:0x0193  */
    /* JADX WARN: Code duplicated, block: B:73:0x019d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x020d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0210  */
    /* JADX WARN: Code duplicated, block: B:88:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x021a  */
    /* JADX WARN: Code duplicated, block: B:91:0x021e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Code duplicated, block: B:95:0x0255  */
    /* JADX WARN: Code duplicated, block: B:97:0x0258  */
    /* JADX WARN: Code duplicated, block: B:98:0x027a  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int iM;
        int iN;
        int iMax;
        int iMin;
        boolean zQ;
        boolean zQ2;
        int measuredHeight;
        C0242u c0242u;
        C0242u c0242u2;
        o0 o0Var;
        o0 o0Var2;
        int i7;
        boolean z4;
        int i8;
        int i9;
        int paddingTop;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iMax2;
        int i16;
        int i17;
        int i18;
        int i19;
        ArrayList arrayList;
        int size;
        int iM2;
        int i20;
        int size2;
        int i21;
        int i22;
        int size3;
        int i23;
        int i24;
        int measuredWidth;
        int i25;
        int i26;
        int i27;
        int size4;
        Field field = G.f187a;
        boolean z5 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i28 = width - paddingRight;
        int[] iArr = this.f1885P;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i6 - i4) : 0;
        if (q(this.n)) {
            if (z5) {
                iN = n(this.n, i28, iMin2, iArr);
                iM = paddingLeft;
            } else {
                iM = m(this.n, paddingLeft, iMin2, iArr);
            }
            if (q(this.f1896r)) {
                if (z5) {
                    iN = n(this.f1896r, iN, iMin2, iArr);
                } else {
                    iM = m(this.f1896r, iM, iMin2, iArr);
                }
            }
            if (q(this.f1890k)) {
                if (z5) {
                    iM = m(this.f1890k, iM, iMin2, iArr);
                } else {
                    iN = n(this.f1890k, iN, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iM);
            iArr[1] = Math.max(0, currentContentInsetRight - (i28 - iN));
            iMax = Math.max(iM, currentContentInsetLeft);
            iMin = Math.min(iN, i28 - currentContentInsetRight);
            if (q(this.f1897s)) {
                if (z5) {
                    iMin = n(this.f1897s, iMin, iMin2, iArr);
                } else {
                    iMax = m(this.f1897s, iMax, iMin2, iArr);
                }
            }
            if (q(this.f1893o)) {
                if (z5) {
                    iMin = n(this.f1893o, iMin, iMin2, iArr);
                } else {
                    iMax = m(this.f1893o, iMax, iMin2, iArr);
                }
            }
            zQ = q(this.f1891l);
            zQ2 = q(this.f1892m);
            if (zQ) {
                o0 o0Var3 = (o0) this.f1891l.getLayoutParams();
                measuredHeight = this.f1891l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) o0Var3).topMargin + ((ViewGroup.MarginLayoutParams) o0Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zQ2) {
                o0 o0Var4 = (o0) this.f1892m.getLayoutParams();
                measuredHeight = this.f1892m.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) o0Var4).topMargin + ((ViewGroup.MarginLayoutParams) o0Var4).bottomMargin + measuredHeight;
            }
            if (zQ || zQ2) {
                if (zQ) {
                    c0242u = this.f1891l;
                } else {
                    c0242u = this.f1892m;
                }
                if (zQ2) {
                    c0242u2 = this.f1892m;
                } else {
                    c0242u2 = this.f1891l;
                }
                o0Var = (o0) c0242u.getLayoutParams();
                o0Var2 = (o0) c0242u2.getLayoutParams();
                i7 = measuredHeight;
                z4 = (!zQ && this.f1891l.getMeasuredWidth() > 0) || (zQ2 && this.f1892m.getMeasuredWidth() > 0);
                i8 = this.f1876G & 112;
                i9 = iMax;
                if (i8 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) o0Var).topMargin + this.f1871B;
                } else if (i8 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i7) / 2;
                    i16 = ((ViewGroup.MarginLayoutParams) o0Var).topMargin + this.f1871B;
                    if (iMax2 < i16) {
                        iMax2 = i16;
                    } else {
                        i17 = (((height - paddingBottom) - i7) - iMax2) - paddingTop2;
                        i18 = ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin;
                        i19 = this.f1872C;
                        if (i17 < i18 + i19) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin + i19) - i17));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin) - this.f1872C) - i7;
                }
                if (z5) {
                    if (z4) {
                        i13 = this.f1901z;
                    } else {
                        i13 = 0;
                    }
                    int i29 = i13 - iArr[1];
                    iMin -= Math.max(0, i29);
                    iArr[1] = Math.max(0, -i29);
                    if (zQ) {
                        o0 o0Var5 = (o0) this.f1891l.getLayoutParams();
                        int measuredWidth2 = iMin - this.f1891l.getMeasuredWidth();
                        int measuredHeight2 = this.f1891l.getMeasuredHeight() + paddingTop;
                        this.f1891l.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i14 = measuredWidth2 - this.f1870A;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) o0Var5).bottomMargin;
                    } else {
                        i14 = iMin;
                    }
                    if (zQ2) {
                        int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((o0) this.f1892m.getLayoutParams())).topMargin;
                        this.f1892m.layout(iMin - this.f1892m.getMeasuredWidth(), i30, iMin, this.f1892m.getMeasuredHeight() + i30);
                        i15 = iMin - this.f1870A;
                    } else {
                        i15 = iMin;
                    }
                    if (z4) {
                        iMin = Math.min(i14, i15);
                    }
                    iMax = i9;
                } else {
                    if (z4) {
                        i10 = this.f1901z;
                    } else {
                        i10 = 0;
                    }
                    int i31 = i10 - iArr[0];
                    iMax = Math.max(0, i31) + i9;
                    iArr[0] = Math.max(0, -i31);
                    if (zQ) {
                        o0 o0Var6 = (o0) this.f1891l.getLayoutParams();
                        int measuredWidth3 = this.f1891l.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f1891l.getMeasuredHeight() + paddingTop;
                        this.f1891l.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i11 = measuredWidth3 + this.f1870A;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) o0Var6).bottomMargin;
                    } else {
                        i11 = iMax;
                    }
                    if (zQ2) {
                        int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((o0) this.f1892m.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f1892m.getMeasuredWidth() + iMax;
                        this.f1892m.layout(iMax, i32, measuredWidth4, this.f1892m.getMeasuredHeight() + i32);
                        i12 = measuredWidth4 + this.f1870A;
                    } else {
                        i12 = iMax;
                    }
                    if (z4) {
                        iMax = Math.max(i11, i12);
                    }
                }
            }
            arrayList = this.f1883N;
            a(arrayList, 3);
            size = arrayList.size();
            iM2 = iMax;
            for (i20 = 0; i20 < size; i20++) {
                iM2 = m((View) arrayList.get(i20), iM2, iMin2, iArr);
            }
            a(arrayList, 5);
            size2 = arrayList.size();
            for (i21 = 0; i21 < size2; i21++) {
                iMin = n((View) arrayList.get(i21), iMin, iMin2, iArr);
            }
            a(arrayList, 1);
            int i33 = iArr[0];
            i22 = iArr[1];
            size3 = arrayList.size();
            i23 = i33;
            i24 = 0;
            measuredWidth = 0;
            while (i24 < size3) {
                View view = (View) arrayList.get(i24);
                o0 o0Var7 = (o0) view.getLayoutParams();
                int i34 = i22;
                int i35 = ((ViewGroup.MarginLayoutParams) o0Var7).leftMargin - i23;
                int i36 = ((ViewGroup.MarginLayoutParams) o0Var7).rightMargin - i34;
                int iMax3 = Math.max(0, i35);
                int iMax4 = Math.max(0, i36);
                int iMax5 = Math.max(0, -i35);
                int iMax6 = Math.max(0, -i36);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i24++;
                i23 = iMax5;
                i22 = iMax6;
            }
            i26 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i27 = measuredWidth + i26;
            if (i26 >= iM2) {
                if (i27 > iMin) {
                    iM2 = i26 - (i27 - iMin);
                } else {
                    iM2 = i26;
                }
            }
            size4 = arrayList.size();
            for (i25 = 0; i25 < size4; i25++) {
                iM2 = m((View) arrayList.get(i25), iM2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iM = paddingLeft;
        iN = i28;
        if (q(this.f1896r)) {
            if (z5) {
                iN = n(this.f1896r, iN, iMin2, iArr);
            } else {
                iM = m(this.f1896r, iM, iMin2, iArr);
            }
        }
        if (q(this.f1890k)) {
            if (z5) {
                iM = m(this.f1890k, iM, iMin2, iArr);
            } else {
                iN = n(this.f1890k, iN, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i28 - iN));
        iMax = Math.max(iM, currentContentInsetLeft2);
        iMin = Math.min(iN, i28 - currentContentInsetRight2);
        if (q(this.f1897s)) {
            if (z5) {
                iMin = n(this.f1897s, iMin, iMin2, iArr);
            } else {
                iMax = m(this.f1897s, iMax, iMin2, iArr);
            }
        }
        if (q(this.f1893o)) {
            if (z5) {
                iMin = n(this.f1893o, iMin, iMin2, iArr);
            } else {
                iMax = m(this.f1893o, iMax, iMin2, iArr);
            }
        }
        zQ = q(this.f1891l);
        zQ2 = q(this.f1892m);
        if (zQ) {
            o0 o0Var8 = (o0) this.f1891l.getLayoutParams();
            measuredHeight = this.f1891l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) o0Var8).topMargin + ((ViewGroup.MarginLayoutParams) o0Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zQ2) {
            o0 o0Var9 = (o0) this.f1892m.getLayoutParams();
            measuredHeight = this.f1892m.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) o0Var9).topMargin + ((ViewGroup.MarginLayoutParams) o0Var9).bottomMargin + measuredHeight;
        }
        if (zQ) {
            if (zQ) {
                c0242u = this.f1891l;
            } else {
                c0242u = this.f1892m;
            }
            if (zQ2) {
                c0242u2 = this.f1892m;
            } else {
                c0242u2 = this.f1891l;
            }
            o0Var = (o0) c0242u.getLayoutParams();
            o0Var2 = (o0) c0242u2.getLayoutParams();
            i7 = measuredHeight;
            if (zQ) {
            }
            i8 = this.f1876G & 112;
            i9 = iMax;
            if (i8 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) o0Var).topMargin + this.f1871B;
            } else if (i8 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i7) / 2;
                i16 = ((ViewGroup.MarginLayoutParams) o0Var).topMargin + this.f1871B;
                if (iMax2 < i16) {
                    iMax2 = i16;
                } else {
                    i17 = (((height - paddingBottom) - i7) - iMax2) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin;
                    i19 = this.f1872C;
                    if (i17 < i18 + i19) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin) - this.f1872C) - i7;
            }
            if (z5) {
                if (z4) {
                    i13 = this.f1901z;
                } else {
                    i13 = 0;
                }
                int i210 = i13 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zQ) {
                    o0 o0Var10 = (o0) this.f1891l.getLayoutParams();
                    int measuredWidth5 = iMin - this.f1891l.getMeasuredWidth();
                    int measuredHeight4 = this.f1891l.getMeasuredHeight() + paddingTop;
                    this.f1891l.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i14 = measuredWidth5 - this.f1870A;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) o0Var10).bottomMargin;
                } else {
                    i14 = iMin;
                }
                if (zQ2) {
                    int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((o0) this.f1892m.getLayoutParams())).topMargin;
                    this.f1892m.layout(iMin - this.f1892m.getMeasuredWidth(), i37, iMin, this.f1892m.getMeasuredHeight() + i37);
                    i15 = iMin - this.f1870A;
                } else {
                    i15 = iMin;
                }
                if (z4) {
                    iMin = Math.min(i14, i15);
                }
                iMax = i9;
            } else {
                if (z4) {
                    i10 = this.f1901z;
                } else {
                    i10 = 0;
                }
                int i38 = i10 - iArr[0];
                iMax = Math.max(0, i38) + i9;
                iArr[0] = Math.max(0, -i38);
                if (zQ) {
                    o0 o0Var11 = (o0) this.f1891l.getLayoutParams();
                    int measuredWidth6 = this.f1891l.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f1891l.getMeasuredHeight() + paddingTop;
                    this.f1891l.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i11 = measuredWidth6 + this.f1870A;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) o0Var11).bottomMargin;
                } else {
                    i11 = iMax;
                }
                if (zQ2) {
                    int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((o0) this.f1892m.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f1892m.getMeasuredWidth() + iMax;
                    this.f1892m.layout(iMax, i39, measuredWidth7, this.f1892m.getMeasuredHeight() + i39);
                    i12 = measuredWidth7 + this.f1870A;
                } else {
                    i12 = iMax;
                }
                if (z4) {
                    iMax = Math.max(i11, i12);
                }
            }
        } else {
            if (zQ) {
                c0242u = this.f1891l;
            } else {
                c0242u = this.f1892m;
            }
            if (zQ2) {
                c0242u2 = this.f1892m;
            } else {
                c0242u2 = this.f1891l;
            }
            o0Var = (o0) c0242u.getLayoutParams();
            o0Var2 = (o0) c0242u2.getLayoutParams();
            i7 = measuredHeight;
            if (zQ) {
            }
            i8 = this.f1876G & 112;
            i9 = iMax;
            if (i8 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) o0Var).topMargin + this.f1871B;
            } else if (i8 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i7) / 2;
                i16 = ((ViewGroup.MarginLayoutParams) o0Var).topMargin + this.f1871B;
                if (iMax2 < i16) {
                    iMax2 = i16;
                } else {
                    i17 = (((height - paddingBottom) - i7) - iMax2) - paddingTop2;
                    i18 = ((ViewGroup.MarginLayoutParams) o0Var).bottomMargin;
                    i19 = this.f1872C;
                    if (i17 < i18 + i19) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin + i19) - i17));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) o0Var2).bottomMargin) - this.f1872C) - i7;
            }
            if (z5) {
                if (z4) {
                    i13 = this.f1901z;
                } else {
                    i13 = 0;
                }
                int i211 = i13 - iArr[1];
                iMin -= Math.max(0, i211);
                iArr[1] = Math.max(0, -i211);
                if (zQ) {
                    o0 o0Var12 = (o0) this.f1891l.getLayoutParams();
                    int measuredWidth8 = iMin - this.f1891l.getMeasuredWidth();
                    int measuredHeight6 = this.f1891l.getMeasuredHeight() + paddingTop;
                    this.f1891l.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i14 = measuredWidth8 - this.f1870A;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) o0Var12).bottomMargin;
                } else {
                    i14 = iMin;
                }
                if (zQ2) {
                    int i310 = paddingTop + ((ViewGroup.MarginLayoutParams) ((o0) this.f1892m.getLayoutParams())).topMargin;
                    this.f1892m.layout(iMin - this.f1892m.getMeasuredWidth(), i310, iMin, this.f1892m.getMeasuredHeight() + i310);
                    i15 = iMin - this.f1870A;
                } else {
                    i15 = iMin;
                }
                if (z4) {
                    iMin = Math.min(i14, i15);
                }
                iMax = i9;
            } else {
                if (z4) {
                    i10 = this.f1901z;
                } else {
                    i10 = 0;
                }
                int i311 = i10 - iArr[0];
                iMax = Math.max(0, i311) + i9;
                iArr[0] = Math.max(0, -i311);
                if (zQ) {
                    o0 o0Var13 = (o0) this.f1891l.getLayoutParams();
                    int measuredWidth9 = this.f1891l.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f1891l.getMeasuredHeight() + paddingTop;
                    this.f1891l.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i11 = measuredWidth9 + this.f1870A;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) o0Var13).bottomMargin;
                } else {
                    i11 = iMax;
                }
                if (zQ2) {
                    int i312 = paddingTop + ((ViewGroup.MarginLayoutParams) ((o0) this.f1892m.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f1892m.getMeasuredWidth() + iMax;
                    this.f1892m.layout(iMax, i312, measuredWidth10, this.f1892m.getMeasuredHeight() + i312);
                    i12 = measuredWidth10 + this.f1870A;
                } else {
                    i12 = iMax;
                }
                if (z4) {
                    iMax = Math.max(i11, i12);
                }
            }
        }
        arrayList = this.f1883N;
        a(arrayList, 3);
        size = arrayList.size();
        iM2 = iMax;
        while (i20 < size) {
            iM2 = m((View) arrayList.get(i20), iM2, iMin2, iArr);
        }
        a(arrayList, 5);
        size2 = arrayList.size();
        while (i21 < size2) {
            iMin = n((View) arrayList.get(i21), iMin, iMin2, iArr);
        }
        a(arrayList, 1);
        int i313 = iArr[0];
        i22 = iArr[1];
        size3 = arrayList.size();
        i23 = i313;
        i24 = 0;
        measuredWidth = 0;
        while (i24 < size3) {
            View view2 = (View) arrayList.get(i24);
            o0 o0Var14 = (o0) view2.getLayoutParams();
            int i314 = i22;
            int i315 = ((ViewGroup.MarginLayoutParams) o0Var14).leftMargin - i23;
            int i316 = ((ViewGroup.MarginLayoutParams) o0Var14).rightMargin - i314;
            int iMax7 = Math.max(0, i315);
            int iMax8 = Math.max(0, i316);
            int iMax9 = Math.max(0, -i315);
            int iMax10 = Math.max(0, -i316);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i24++;
            i23 = iMax9;
            i22 = iMax10;
        }
        i26 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i27 = measuredWidth + i26;
        if (i26 >= iM2) {
            if (i27 > iMin) {
                iM2 = i26 - (i27 - iMin);
            } else {
                iM2 = i26;
            }
        }
        size4 = arrayList.size();
        while (i25 < size4) {
            iM2 = m((View) arrayList.get(i25), iM2, iMin2, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        int iJ;
        int iMax;
        int iCombineMeasuredStates;
        int iJ2;
        int iK;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zA = x0.a(this);
        int i5 = !zA ? 1 : 0;
        int i6 = 0;
        if (q(this.n)) {
            p(this.n, i3, 0, i4, this.y);
            iJ = j(this.n) + this.n.getMeasuredWidth();
            iMax = Math.max(0, k(this.n) + this.n.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.n.getMeasuredState());
        } else {
            iJ = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (q(this.f1896r)) {
            p(this.f1896r, i3, 0, i4, this.y);
            iJ = j(this.f1896r) + this.f1896r.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.f1896r) + this.f1896r.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1896r.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iJ);
        int iMax4 = Math.max(0, currentContentInsetStart - iJ);
        int[] iArr = this.f1885P;
        iArr[zA ? 1 : 0] = iMax4;
        if (q(this.f1890k)) {
            p(this.f1890k, i3, iMax3, i4, this.y);
            iJ2 = j(this.f1890k) + this.f1890k.getMeasuredWidth();
            iMax = Math.max(iMax, k(this.f1890k) + this.f1890k.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1890k.getMeasuredState());
        } else {
            iJ2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iJ2);
        iArr[i5] = Math.max(0, currentContentInsetEnd - iJ2);
        if (q(this.f1897s)) {
            iMax5 += o(this.f1897s, i3, iMax5, i4, 0, iArr);
            iMax = Math.max(iMax, k(this.f1897s) + this.f1897s.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1897s.getMeasuredState());
        }
        if (q(this.f1893o)) {
            iMax5 += o(this.f1893o, i3, iMax5, i4, 0, iArr);
            iMax = Math.max(iMax, k(this.f1893o) + this.f1893o.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1893o.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (((o0) childAt.getLayoutParams()).f3744b == 0 && q(childAt)) {
                iMax5 += o(childAt, i3, iMax5, i4, 0, iArr);
                int iMax6 = Math.max(iMax, k(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i8 = iMax5;
        int i9 = this.f1871B + this.f1872C;
        int i10 = this.f1901z + this.f1870A;
        if (q(this.f1891l)) {
            o(this.f1891l, i3, i8 + i10, i4, i9, iArr);
            int iJ3 = j(this.f1891l) + this.f1891l.getMeasuredWidth();
            iK = k(this.f1891l) + this.f1891l.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1891l.getMeasuredState());
            iMax2 = iJ3;
        } else {
            iK = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (q(this.f1892m)) {
            iMax2 = Math.max(iMax2, o(this.f1892m, i3, i8 + i10, i4, i9 + iK, iArr));
            iK += k(this.f1892m) + this.f1892m.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1892m.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iK);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i8 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i3, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, iCombineMeasuredStates2 << 16);
        if (!this.f1888T) {
            i6 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = getChildAt(i11);
            if (q(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i6 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i6);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof q0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        q0 q0Var = (q0) parcelable;
        super.onRestoreInstanceState(q0Var.f1286k);
        ActionMenuView actionMenuView = this.f1890k;
        p028j.j jVar = actionMenuView != null ? actionMenuView.f1784z : null;
        int i3 = q0Var.f3749m;
        if (i3 != 0 && this.S != null && jVar != null && (menuItemFindItem = jVar.findItem(i3)) != null) {
            menuItemFindItem.expandActionView();
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
        C0231i c0231i;
        C0228f c0228f;
        k kVar;
        q0 q0Var = new q0(super.onSaveInstanceState());
        n0 n0Var = this.S;
        if (n0Var != null && (kVar = n0Var.f3738l) != null) {
            q0Var.f3749m = kVar.f3452a;
        }
        ActionMenuView actionMenuView = this.f1890k;
        q0Var.n = (actionMenuView == null || (c0231i = actionMenuView.f1778C) == null || (c0228f = c0231i.f3695B) == null || !c0228f.b()) ? false : true;
        return q0Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1881L = false;
        }
        if (!this.f1881L) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
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
        setCollapseIcon(p017g.a.a(getContext(), i3));
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
        setLogo(p017g.a.a(getContext(), i3));
    }

    public void setLogoDescription(int i3) {
        setLogoDescription(getContext().getText(i3));
    }

    public void setNavigationContentDescription(int i3) {
        setNavigationContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setNavigationIcon(int i3) {
        setNavigationIcon(p017g.a.a(getContext(), i3));
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p013f.a.f2790b);
        o0Var.f3743a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        o0Var.f3744b = 0;
        return o0Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0238p c0238p = this.f1896r;
        if (c0238p != null) {
            c0238p.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f1896r.setImageDrawable(drawable);
        } else {
            C0238p c0238p = this.f1896r;
            if (c0238p != null) {
                c0238p.setImageDrawable(this.f1894p);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1893o == null) {
                this.f1893o = new C0239q(getContext(), 0);
            }
            if (!l(this.f1893o)) {
                b(this.f1893o, true);
            }
        } else {
            C0239q c0239q = this.f1893o;
            if (c0239q != null && l(c0239q)) {
                removeView(this.f1893o);
                this.f1884O.remove(this.f1893o);
            }
        }
        C0239q c0239q2 = this.f1893o;
        if (c0239q2 != null) {
            c0239q2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1893o == null) {
            this.f1893o = new C0239q(getContext(), 0);
        }
        C0239q c0239q = this.f1893o;
        if (c0239q != null) {
            c0239q.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C0238p c0238p = this.n;
        if (c0238p != null) {
            c0238p.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!l(this.n)) {
                b(this.n, true);
            }
        } else {
            C0238p c0238p = this.n;
            if (c0238p != null && l(c0238p)) {
                removeView(this.n);
                this.f1884O.remove(this.n);
            }
        }
        C0238p c0238p2 = this.n;
        if (c0238p2 != null) {
            c0238p2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0242u c0242u = this.f1892m;
            if (c0242u != null && l(c0242u)) {
                removeView(this.f1892m);
                this.f1884O.remove(this.f1892m);
            }
        } else {
            if (this.f1892m == null) {
                Context context = getContext();
                C0242u c0242u2 = new C0242u(context, null);
                this.f1892m = c0242u2;
                c0242u2.setSingleLine();
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
        C0242u c0242u3 = this.f1892m;
        if (c0242u3 != null) {
            c0242u3.setText(charSequence);
        }
        this.f1878I = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1880K = colorStateList;
        C0242u c0242u = this.f1892m;
        if (c0242u != null) {
            c0242u.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0242u c0242u = this.f1891l;
            if (c0242u != null && l(c0242u)) {
                removeView(this.f1891l);
                this.f1884O.remove(this.f1891l);
            }
        } else {
            if (this.f1891l == null) {
                Context context = getContext();
                C0242u c0242u2 = new C0242u(context, null);
                this.f1891l = c0242u2;
                c0242u2.setSingleLine();
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
        C0242u c0242u3 = this.f1891l;
        if (c0242u3 != null) {
            c0242u3.setText(charSequence);
        }
        this.f1877H = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1879J = colorStateList;
        C0242u c0242u = this.f1891l;
        if (c0242u != null) {
            c0242u.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(p0 p0Var) {
    }
}
