package androidx.appcompat.widget;

import D.AbstractC0024z;
import D.C0013n;
import D.G;
import D.InterfaceC0011l;
import D.InterfaceC0012m;
import D.K;
import D.M;
import D.N;
import D.O;
import D.P;
import D.Q;
import D.S;
import D.T;
import D.d0;
import D.h0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import g.AbstractC0250a;
import it.returntrue.novelist.R;
import java.lang.reflect.Field;
import k.C0339b;
import k.C0342e;
import k.InterfaceC0335A;
import k.InterfaceC0341d;
import k.RunnableC0340c;
import k.r0;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0011l, InterfaceC0012m {

    /* renamed from: I, reason: collision with root package name */
    public static final int[] f1755I = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    public h0 f1756A;

    /* renamed from: B, reason: collision with root package name */
    public h0 f1757B;

    /* renamed from: C, reason: collision with root package name */
    public OverScroller f1758C;

    /* renamed from: D, reason: collision with root package name */
    public ViewPropertyAnimator f1759D;

    /* renamed from: E, reason: collision with root package name */
    public final C0339b f1760E;

    /* renamed from: F, reason: collision with root package name */
    public final RunnableC0340c f1761F;

    /* renamed from: G, reason: collision with root package name */
    public final RunnableC0340c f1762G;

    /* renamed from: H, reason: collision with root package name */
    public final C0013n f1763H;

    /* renamed from: k, reason: collision with root package name */
    public int f1764k;

    /* renamed from: l, reason: collision with root package name */
    public ContentFrameLayout f1765l;

    /* renamed from: m, reason: collision with root package name */
    public ActionBarContainer f1766m;
    public InterfaceC0335A n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f1767o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1768p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1769q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1770r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1771s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1772t;
    public int u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f1773v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f1774w;
    public final Rect x;
    public h0 y;

    /* renamed from: z, reason: collision with root package name */
    public h0 f1775z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1773v = new Rect();
        this.f1774w = new Rect();
        this.x = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        h0 h0Var = h0.f240b;
        this.y = h0Var;
        this.f1775z = h0Var;
        this.f1756A = h0Var;
        this.f1757B = h0Var;
        this.f1760E = new C0339b(this);
        this.f1761F = new RunnableC0340c(this, 0);
        this.f1762G = new RunnableC0340c(this, 1);
        i(context);
        this.f1763H = new C0013n();
    }

    public static boolean g(View view, Rect rect, boolean z3) {
        boolean z4;
        C0342e c0342e = (C0342e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0342e).leftMargin;
        int i4 = rect.left;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) c0342e).leftMargin = i4;
            z4 = true;
        } else {
            z4 = false;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) c0342e).topMargin;
        int i6 = rect.top;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) c0342e).topMargin = i6;
            z4 = true;
        }
        int i7 = ((ViewGroup.MarginLayoutParams) c0342e).rightMargin;
        int i8 = rect.right;
        if (i7 != i8) {
            ((ViewGroup.MarginLayoutParams) c0342e).rightMargin = i8;
            z4 = true;
        }
        if (z3) {
            int i9 = ((ViewGroup.MarginLayoutParams) c0342e).bottomMargin;
            int i10 = rect.bottom;
            if (i9 != i10) {
                ((ViewGroup.MarginLayoutParams) c0342e).bottomMargin = i10;
                return true;
            }
        }
        return z4;
    }

    @Override // D.InterfaceC0011l
    public final void a(View view, View view2, int i3, int i4) {
        if (i4 == 0) {
            onNestedScrollAccepted(view, view2, i3);
        }
    }

    @Override // D.InterfaceC0011l
    public final void b(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            onNestedScroll(viewGroup, i3, i4, i5, i6);
        }
    }

    @Override // D.InterfaceC0011l
    public final void c(View view, int i3) {
        if (i3 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0342e;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        if (this.f1767o == null || this.f1768p) {
            return;
        }
        if (this.f1766m.getVisibility() == 0) {
            i3 = (int) (this.f1766m.getTranslationY() + this.f1766m.getBottom() + 0.5f);
        } else {
            i3 = 0;
        }
        this.f1767o.setBounds(0, i3, getWidth(), this.f1767o.getIntrinsicHeight() + i3);
        this.f1767o.draw(canvas);
    }

    @Override // D.InterfaceC0012m
    public final void e(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        b(viewGroup, i3, i4, i5, i6, i7);
    }

    @Override // D.InterfaceC0011l
    public final boolean f(View view, View view2, int i3, int i4) {
        return i4 == 0 && onStartNestedScroll(view, view2, i3);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0342e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0342e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1766m;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0013n c0013n = this.f1763H;
        return c0013n.f253c | c0013n.f252b;
    }

    public CharSequence getTitle() {
        j();
        return ((r0) this.n).f3750a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1761F);
        removeCallbacks(this.f1762G);
        ViewPropertyAnimator viewPropertyAnimator = this.f1759D;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1755I);
        this.f1764k = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1767o = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f1768p = context.getApplicationInfo().targetSdkVersion < 19;
        this.f1758C = new OverScroller(context);
    }

    public final void j() {
        InterfaceC0335A wrapper;
        if (this.f1765l == null) {
            this.f1765l = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1766m = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0335A) {
                wrapper = (InterfaceC0335A) findViewById;
            } else {
                if (!(findViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) findViewById).getWrapper();
            }
            this.n = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        j();
        h0 c3 = h0.c(windowInsets, null);
        d0 d0Var = c3.f241a;
        boolean g3 = g(this.f1766m, new Rect(d0Var.l().f4635a, d0Var.l().f4636b, d0Var.l().f4637c, d0Var.l().f4638d), false);
        Field field = G.f187a;
        Rect rect = this.f1773v;
        AbstractC0024z.b(this, c3, rect);
        h0 p3 = d0Var.p(rect.left, rect.top, rect.right, rect.bottom);
        this.y = p3;
        boolean z3 = true;
        if (!this.f1775z.equals(p3)) {
            this.f1775z = this.y;
            g3 = true;
        }
        Rect rect2 = this.f1774w;
        if (rect2.equals(rect)) {
            z3 = g3;
        } else {
            rect2.set(rect);
        }
        if (z3) {
            requestLayout();
        }
        return d0Var.a().f241a.c().f241a.b().b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = G.f187a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C0342e c0342e = (C0342e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = ((ViewGroup.MarginLayoutParams) c0342e).leftMargin + paddingLeft;
                int i9 = ((ViewGroup.MarginLayoutParams) c0342e).topMargin + paddingTop;
                childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        int measuredHeight;
        j();
        measureChildWithMargins(this.f1766m, i3, 0, i4, 0);
        C0342e c0342e = (C0342e) this.f1766m.getLayoutParams();
        int max = Math.max(0, this.f1766m.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0342e).leftMargin + ((ViewGroup.MarginLayoutParams) c0342e).rightMargin);
        int max2 = Math.max(0, this.f1766m.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0342e).topMargin + ((ViewGroup.MarginLayoutParams) c0342e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1766m.getMeasuredState());
        Field field = G.f187a;
        boolean z3 = (getWindowSystemUiVisibility() & 256) != 0;
        if (z3) {
            measuredHeight = this.f1764k;
            if (this.f1770r && this.f1766m.getTabContainer() != null) {
                measuredHeight += this.f1764k;
            }
        } else {
            measuredHeight = this.f1766m.getVisibility() != 8 ? this.f1766m.getMeasuredHeight() : 0;
        }
        Rect rect = this.f1773v;
        Rect rect2 = this.x;
        rect2.set(rect);
        h0 h0Var = this.y;
        this.f1756A = h0Var;
        if (this.f1769q || z3) {
            w.b b3 = w.b.b(h0Var.f241a.l().f4635a, this.f1756A.f241a.l().f4636b + measuredHeight, this.f1756A.f241a.l().f4637c, this.f1756A.f241a.l().f4638d);
            h0 h0Var2 = this.f1756A;
            int i5 = Build.VERSION.SDK_INT;
            T s3 = i5 >= 36 ? new S(h0Var2) : i5 >= 35 ? new Q(h0Var2) : i5 >= 34 ? new P(h0Var2) : i5 >= 31 ? new O(h0Var2) : i5 >= 30 ? new N(h0Var2) : i5 >= 29 ? new M(h0Var2) : new K(h0Var2);
            s3.h(b3);
            this.f1756A = s3.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.f1756A = h0Var.f241a.p(0, measuredHeight, 0, 0);
        }
        g(this.f1765l, rect2, true);
        if (!this.f1757B.equals(this.f1756A)) {
            h0 h0Var3 = this.f1756A;
            this.f1757B = h0Var3;
            G.a(this.f1765l, h0Var3);
        }
        measureChildWithMargins(this.f1765l, i3, 0, i4, 0);
        C0342e c0342e2 = (C0342e) this.f1765l.getLayoutParams();
        int max3 = Math.max(max, this.f1765l.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0342e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0342e2).rightMargin);
        int max4 = Math.max(max2, this.f1765l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0342e2).topMargin + ((ViewGroup.MarginLayoutParams) c0342e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1765l.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i3, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i4, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f4, boolean z3) {
        if (!this.f1771s || !z3) {
            return false;
        }
        this.f1758C.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f1758C.getFinalY() > this.f1766m.getHeight()) {
            h();
            this.f1762G.run();
        } else {
            h();
            this.f1761F.run();
        }
        this.f1772t = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        int i7 = this.u + i4;
        this.u = i7;
        setActionBarHideOffset(i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        this.f1763H.f252b = i3;
        this.u = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        if ((i3 & 2) == 0 || this.f1766m.getVisibility() != 0) {
            return false;
        }
        return this.f1771s;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f1771s || this.f1772t) {
            return;
        }
        if (this.u <= this.f1766m.getHeight()) {
            h();
            postDelayed(this.f1761F, 600L);
        } else {
            h();
            postDelayed(this.f1762G, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i3) {
        super.onWindowSystemUiVisibilityChanged(i3);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
    }

    public void setActionBarHideOffset(int i3) {
        h();
        this.f1766m.setTranslationY(-Math.max(0, Math.min(i3, this.f1766m.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0341d interfaceC0341d) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f1770r = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f1771s) {
            this.f1771s = z3;
            if (z3) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i3) {
        j();
        r0 r0Var = (r0) this.n;
        r0Var.f3753d = i3 != 0 ? AbstractC0250a.a(r0Var.f3750a.getContext(), i3) : null;
        r0Var.c();
    }

    public void setLogo(int i3) {
        j();
        r0 r0Var = (r0) this.n;
        r0Var.f3754e = i3 != 0 ? AbstractC0250a.a(r0Var.f3750a.getContext(), i3) : null;
        r0Var.c();
    }

    public void setOverlayMode(boolean z3) {
        this.f1769q = z3;
        this.f1768p = z3 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int i3) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((r0) this.n).f3760k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        r0 r0Var = (r0) this.n;
        if (r0Var.f3756g) {
            return;
        }
        r0Var.f3757h = charSequence;
        if ((r0Var.f3751b & 8) != 0) {
            r0Var.f3750a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0342e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        r0 r0Var = (r0) this.n;
        r0Var.f3753d = drawable;
        r0Var.c();
    }

    @Override // D.InterfaceC0011l
    public final void d(int i3, int i4, int[] iArr, int i5) {
    }
}
