package androidx.core.widget;

import B1.a;
import D.AbstractC0019u;
import D.AbstractC0020v;
import D.C0003d;
import D.C0010k;
import D.C0013n;
import D.C0018t;
import D.C0021w;
import D.G;
import D.H;
import D.InterfaceC0012m;
import F.b;
import G.c;
import G.e;
import G.f;
import G.g;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.apache.tika.pipes.pipesiterator.PipesIterator;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0012m {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final float f1927M = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final e f1928N = new e();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int[] f1929O = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f1930A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f1931B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f1932C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int[] f1933D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int[] f1934E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f1935F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f1936G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public g f1937H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0013n f1938I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C0010k f1939J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public float f1940K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final C0003d f1941L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f1942k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f1943l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f1944m;
    public final OverScroller n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final EdgeEffect f1945o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EdgeEffect f1946p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0018t f1947q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1948r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1949s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f1950t;
    public View u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1951v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public VelocityTracker f1952w;
    public boolean x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f1953z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, it.returntrue.novelist.R.attr.nestedScrollViewStyle);
        this.f1944m = new Rect();
        this.f1949s = true;
        this.f1950t = false;
        this.u = null;
        this.f1951v = false;
        this.y = true;
        this.f1932C = -1;
        this.f1933D = new int[2];
        this.f1934E = new int[2];
        this.f1941L = new C0003d(getContext(), new a(this, 8));
        int i3 = Build.VERSION.SDK_INT;
        this.f1945o = i3 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f1946p = i3 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f1942k = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.n = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1953z = viewConfiguration.getScaledTouchSlop();
        this.f1930A = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1931B = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1929O, it.returntrue.novelist.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f1938I = new C0013n();
        this.f1939J = new C0010k(this);
        setNestedScrollingEnabled(true);
        G.c(this, f1928N);
    }

    private C0018t getScrollFeedbackProvider() {
        if (this.f1947q == null) {
            this.f1947q = new C0018t(this);
        }
        return this.f1947q;
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && k((View) parent, nestedScrollView);
    }

    @Override // D.InterfaceC0011l
    public final void a(View view, View view2, int i3, int i4) {
        C0013n c0013n = this.f1938I;
        if (i4 == 1) {
            c0013n.f253c = i3;
        } else {
            c0013n.f252b = i3;
        }
        this.f1939J.g(2, i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // D.InterfaceC0011l
    public final void b(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7) {
        m(i6, i7, null);
    }

    @Override // D.InterfaceC0011l
    public final void c(View view, int i3) {
        C0013n c0013n = this.f1938I;
        if (i3 == 1) {
            c0013n.f253c = 0;
        } else {
            c0013n.f252b = 0;
        }
        v(i3);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x0096  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00de  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fc  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i3;
        int scrollRange;
        int overScrollMode;
        if (this.n.isFinished()) {
            return;
        }
        this.n.computeScrollOffset();
        int currY = this.n.getCurrY();
        int i4 = currY - this.f1936G;
        int height = getHeight();
        EdgeEffect edgeEffect = this.f1945o;
        EdgeEffect edgeEffect2 = this.f1946p;
        if (i4 <= 0 || p000a.a.z(edgeEffect) == 0.0f) {
            if (i4 < 0 && p000a.a.z(edgeEffect2) != 0.0f) {
                float f3 = height;
                iRound = Math.round(p000a.a.N(edgeEffect2, (i4 * 4.0f) / f3, 0.5f) * (f3 / 4.0f));
                if (iRound != i4) {
                    edgeEffect2.finish();
                }
            }
            int i5 = i4;
            this.f1936G = currY;
            iArr = this.f1934E;
            iArr[1] = 0;
            this.f1939J.c(0, i5, 1, iArr, null);
            i3 = i5 - iArr[1];
            scrollRange = getScrollRange();
            if (Build.VERSION.SDK_INT >= 35) {
                b.a(this, Math.abs(this.n.getCurrVelocity()));
            }
            if (i3 != 0) {
                int scrollY = getScrollY();
                o(i3, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i6 = i3 - scrollY2;
                iArr[1] = 0;
                this.f1939J.d(0, scrollY2, 0, i6, this.f1933D, 1, iArr);
                i3 = i6 - iArr[1];
            }
            if (i3 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i3 < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) this.n.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) this.n.getCurrVelocity());
                    }
                }
                this.n.abortAnimation();
                v(1);
            }
            if (this.n.isFinished()) {
                v(1);
            } else {
                postInvalidateOnAnimation();
            }
        }
        iRound = Math.round(p000a.a.N(edgeEffect, ((-i4) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i4) {
            edgeEffect.finish();
        }
        i4 -= iRound;
        int i7 = i4;
        this.f1936G = currY;
        iArr = this.f1934E;
        iArr[1] = 0;
        this.f1939J.c(0, i7, 1, iArr, null);
        i3 = i7 - iArr[1];
        scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            b.a(this, Math.abs(this.n.getCurrVelocity()));
        }
        if (i3 != 0) {
            int scrollY3 = getScrollY();
            o(i3, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i8 = i3 - scrollY4;
            iArr[1] = 0;
            this.f1939J.d(0, scrollY4, 0, i8, this.f1933D, 1, iArr);
            i3 = i8 - iArr[1];
        }
        if (i3 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i3 < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) this.n.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) this.n.getCurrVelocity());
                }
            } else if (i3 < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) this.n.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) this.n.getCurrVelocity());
            }
            this.n.abortAnimation();
            v(1);
        }
        if (this.n.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            v(1);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // D.InterfaceC0011l
    public final void d(int i3, int i4, int[] iArr, int i5) {
        this.f1939J.c(i3, i4, i5, iArr, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zJ;
        if (!super.dispatchKeyEvent(keyEvent)) {
            this.f1944m.setEmpty();
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                    if (keyEvent.getAction() != 0) {
                        zJ = false;
                    } else {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyCode == 19) {
                            zJ = keyEvent.isAltPressed() ? j(33) : g(33);
                        } else if (keyCode != 20) {
                            if (keyCode == 62) {
                                p(keyEvent.isShiftPressed() ? 33 : 130);
                            } else if (keyCode == 92) {
                                zJ = j(33);
                            } else if (keyCode == 93) {
                                zJ = j(130);
                            } else if (keyCode == 122) {
                                p(33);
                            } else if (keyCode == 123) {
                                p(130);
                            }
                            zJ = false;
                        } else {
                            zJ = keyEvent.isAltPressed() ? j(130) : g(130);
                        }
                    }
                } else if (isFocused() || keyEvent.getKeyCode() == 4) {
                    zJ = false;
                } else {
                    View viewFindFocus = findFocus();
                    if (viewFindFocus == this) {
                        viewFindFocus = null;
                    }
                    View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                    if (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) {
                        zJ = false;
                    } else {
                        zJ = true;
                    }
                }
            } else if (isFocused()) {
                zJ = false;
            } else {
                zJ = false;
            }
            if (!zJ) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f4, boolean z3) {
        return this.f1939J.a(f3, f4, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f4) {
        return this.f1939J.b(f3, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return this.f1939J.c(i3, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return this.f1939J.d(i3, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1945o;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            } else {
                paddingLeft = 0;
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f1946p;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // D.InterfaceC0012m
    public final void e(ViewGroup viewGroup, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        m(i6, i7, iArr);
    }

    @Override // D.InterfaceC0011l
    public final boolean f(View view, View view2, int i3, int i4) {
        return (i3 & 2) != 0;
    }

    public final boolean g(int i3) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View view = viewFindFocus;
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i3);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !l(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i3 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i3 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i3 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, -1, null, 0, 1, true);
        } else {
            Rect rect = this.f1944m;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            r(h(rect), -1, null, 0, 1, true);
            viewFindNextFocus.requestFocus(i3);
        }
        if (view != null && view.isFocused() && !l(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0013n c0013n = this.f1938I;
        return c0013n.f253c | c0013n.f252b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f1940K == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1940K = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1940K;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i4, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        }
        if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i4 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1939J.f(0);
    }

    public final void i(int i3) {
        if (getChildCount() > 0) {
            this.n.fling(getScrollX(), getScrollY(), 0, i3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.f1939J.g(2, 1);
            this.f1936G = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                b.a(this, Math.abs(this.n.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1939J.f247d;
    }

    public final boolean j(int i3) {
        int childCount;
        boolean z3 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f1944m;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(i3, rect.top, rect.bottom);
    }

    public final boolean l(View view, int i3, int i4) {
        Rect rect = this.f1944m;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i3 >= getScrollY() && rect.top - i3 <= getScrollY() + i4;
    }

    public final void m(int i3, int i4, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i3);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1939J.d(0, scrollY2, 0, i3 - scrollY2, null, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1932C) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f1948r = (int) motionEvent.getY(i3);
            this.f1932C = motionEvent.getPointerId(i3);
            VelocityTracker velocityTracker = this.f1952w;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int i3, int i4, int i5, int i6) {
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i9 = i5 + i3;
        if (i4 <= 0 && i4 >= 0) {
            i7 = i4;
            z3 = false;
        } else {
            i7 = 0;
            z3 = true;
        }
        if (i9 <= i6) {
            if (i9 < 0) {
                i8 = 0;
            } else {
                i8 = i9;
                z4 = false;
            }
            if (z4 && !this.f1939J.f(1)) {
                this.n.springBack(i7, i8, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i7, i8);
            return !z3 || z4;
        }
        i8 = i6;
        z4 = true;
        if (z4) {
            this.n.springBack(i7, i8, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i7, i8);
        if (z3) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1950t = false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Code duplicated, block: B:70:0x012a  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f3;
        int i3;
        int width;
        int i4;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z3;
        NestedScrollView nestedScrollView;
        float yVelocity;
        NestedScrollView nestedScrollView2;
        float f4;
        long j3;
        float fSqrt;
        int i5;
        if (motionEvent.getAction() != 8 || this.f1951v) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            float axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
            i3 = 9;
            f3 = axisValue;
        } else if ((motionEvent.getSource() & 4194304) == 4194304) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            f3 = axisValue2;
            i3 = 26;
        } else {
            f3 = 0.0f;
            i3 = 0;
            width = 0;
        }
        if (f3 == 0.0f) {
            return false;
        }
        r(-((int) (getVerticalScrollFactorCompat() * f3)), i3, motionEvent, width, 1, (motionEvent.getSource() & 8194) == 8194);
        if (i3 != 0) {
            C0003d c0003d = this.f1941L;
            NestedScrollView nestedScrollView3 = (NestedScrollView) c0003d.f227b.f80l;
            int[] iArr = c0003d.f233h;
            int source = motionEvent.getSource();
            int deviceId = motionEvent.getDeviceId();
            int i6 = 1;
            if (c0003d.f231f == source && c0003d.f232g == deviceId && c0003d.f230e == i3) {
                z3 = false;
                i4 = 0;
            } else {
                Context context = c0003d.f226a;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int deviceId2 = motionEvent.getDeviceId();
                i4 = 0;
                int source2 = motionEvent.getSource();
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 34) {
                    Method method = H.f189a;
                    scaledMinimumFlingVelocity = AbstractC0019u.h(viewConfiguration, deviceId2, i3, source2);
                } else {
                    Method method2 = H.f189a;
                    InputDevice device = InputDevice.getDevice(deviceId2);
                    if (device == null || device.getMotionRange(i3, source2) == null) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    } else {
                        Resources resources = context.getResources();
                        int identifier = (source2 == 4194304 && i3 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier == -1) {
                            scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                        } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                            scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                        }
                    }
                }
                iArr[0] = scaledMinimumFlingVelocity;
                int deviceId3 = motionEvent.getDeviceId();
                int source3 = motionEvent.getSource();
                if (i7 >= 34) {
                    scaledMaximumFlingVelocity = AbstractC0019u.g(viewConfiguration, deviceId3, i3, source3);
                } else {
                    InputDevice device2 = InputDevice.getDevice(deviceId3);
                    if (device2 == null || device2.getMotionRange(i3, source3) == null) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    } else {
                        Resources resources2 = context.getResources();
                        int identifier2 = (source3 == 4194304 && i3 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                        Objects.requireNonNull(viewConfiguration);
                        if (identifier2 == -1) {
                            scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                        } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                            scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                        }
                    }
                }
                iArr[1] = scaledMaximumFlingVelocity;
                c0003d.f231f = source;
                c0003d.f232g = deviceId;
                c0003d.f230e = i3;
                z3 = true;
            }
            if (iArr[i4] == Integer.MAX_VALUE) {
                VelocityTracker velocityTracker = c0003d.f228c;
                if (velocityTracker == null) {
                    return true;
                }
                velocityTracker.recycle();
                c0003d.f228c = null;
                return true;
            }
            if (c0003d.f228c == null) {
                c0003d.f228c = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = c0003d.f228c;
            Map map = AbstractC0020v.f262a;
            velocityTracker2.addMovement(motionEvent);
            int i8 = 20;
            if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
                Map map2 = AbstractC0020v.f262a;
                if (!map2.containsKey(velocityTracker2)) {
                    map2.put(velocityTracker2, new C0021w());
                }
                C0021w c0021w = (C0021w) map2.get(velocityTracker2);
                long[] jArr = c0021w.f264b;
                long eventTime = motionEvent.getEventTime();
                if (c0021w.f266d != 0 && eventTime - jArr[c0021w.f267e] > 40) {
                    c0021w.f266d = i4;
                    c0021w.f265c = 0.0f;
                }
                int i9 = (c0021w.f267e + 1) % 20;
                c0021w.f267e = i9;
                int i10 = c0021w.f266d;
                if (i10 != 20) {
                    c0021w.f266d = i10 + 1;
                }
                c0021w.f263a[i9] = motionEvent.getAxisValue(26);
                jArr[c0021w.f267e] = eventTime;
            }
            velocityTracker2.computeCurrentVelocity(PipesIterator.DEFAULT_QUEUE_SIZE, Float.MAX_VALUE);
            C0021w c0021w2 = (C0021w) AbstractC0020v.f262a.get(velocityTracker2);
            if (c0021w2 != null) {
                float[] fArr = c0021w2.f263a;
                long[] jArr2 = c0021w2.f264b;
                int i11 = c0021w2.f266d;
                if (i11 < 2) {
                    nestedScrollView = nestedScrollView3;
                    i5 = 1000;
                    fSqrt = 0.0f;
                } else {
                    int i12 = c0021w2.f267e;
                    int i13 = ((i12 + 20) - (i11 - 1)) % 20;
                    long j4 = jArr2[i12];
                    while (true) {
                        j3 = jArr2[i13];
                        if (j4 - j3 <= 100) {
                            break;
                        }
                        c0021w2.f266d--;
                        i13 = (i13 + 1) % 20;
                    }
                    int i14 = c0021w2.f266d;
                    if (i14 < 2) {
                        nestedScrollView = nestedScrollView3;
                        i5 = 1000;
                        fSqrt = 0.0f;
                    } else if (i14 == 2) {
                        int i15 = (i13 + 1) % 20;
                        long j5 = jArr2[i15];
                        if (j3 == j5) {
                            nestedScrollView = nestedScrollView3;
                            i5 = 1000;
                            fSqrt = 0.0f;
                        } else {
                            nestedScrollView = nestedScrollView3;
                            i5 = 1000;
                            fSqrt = fArr[i15] / (j5 - j3);
                        }
                    } else {
                        float f5 = 0.0f;
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            if (i16 >= c0021w2.f266d - 1) {
                                break;
                            }
                            int i18 = i16 + i13;
                            long j6 = jArr2[i18 % 20];
                            int i19 = (i18 + 1) % i8;
                            if (jArr2[i19] != j6) {
                                i17++;
                                float fSqrt2 = (f5 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f5) * 2.0f));
                                float f6 = fArr[i19] / (jArr2[i19] - j6);
                                float fAbs = (Math.abs(f6) * (f6 - fSqrt2)) + f5;
                                if (i17 == i6) {
                                    fAbs *= 0.5f;
                                }
                                f5 = fAbs;
                            }
                            i16++;
                            nestedScrollView3 = nestedScrollView3;
                            i8 = 20;
                            i6 = 1;
                        }
                        nestedScrollView = nestedScrollView3;
                        fSqrt = ((float) Math.sqrt(Math.abs(f5) * 2.0f)) * (f5 < 0.0f ? -1.0f : 1.0f);
                        i5 = PipesIterator.DEFAULT_QUEUE_SIZE;
                    }
                }
                float f7 = fSqrt * i5;
                c0021w2.f265c = f7;
                if (f7 < (-Math.abs((float) r6))) {
                    c0021w2.f265c = -Math.abs(Float.MAX_VALUE);
                } else if (c0021w2.f265c > Math.abs((float) r6)) {
                    c0021w2.f265c = Math.abs((float) r6);
                }
            } else {
                nestedScrollView = nestedScrollView3;
            }
            if (Build.VERSION.SDK_INT >= 34) {
                yVelocity = AbstractC0019u.d(velocityTracker2, i3);
            } else if (i3 == 0) {
                yVelocity = velocityTracker2.getXVelocity();
            } else if (i3 == 1) {
                yVelocity = velocityTracker2.getYVelocity();
            } else {
                C0021w c0021w3 = (C0021w) AbstractC0020v.f262a.get(velocityTracker2);
                yVelocity = (c0021w3 == null || i3 != 26) ? 0.0f : c0021w3.f265c;
            }
            float f8 = yVelocity * (-nestedScrollView.getVerticalScrollFactorCompat());
            float fSignum = Math.signum(f8);
            if (z3 || !(fSignum == Math.signum(c0003d.f229d) || fSignum == 0.0f)) {
                nestedScrollView2 = nestedScrollView;
                nestedScrollView2.n.abortAnimation();
            } else {
                nestedScrollView2 = nestedScrollView;
            }
            if (Math.abs(f8) >= iArr[0]) {
                int i20 = iArr[1];
                float fMax = Math.max(-i20, Math.min(f8, i20));
                if (fMax == 0.0f) {
                    f4 = 0.0f;
                } else {
                    nestedScrollView2.n.abortAnimation();
                    nestedScrollView2.i((int) fMax);
                    f4 = fMax;
                }
                c0003d.f229d = f4;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0119  */
    /* JADX WARN: Code duplicated, block: B:70:0x012f  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action == 2 && this.f1951v) {
            return true;
        }
        int i3 = action & 255;
        if (i3 == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    if (!u(motionEvent) && this.n.isFinished()) {
                        z3 = false;
                    }
                    this.f1951v = z3;
                    velocityTracker = this.f1952w;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f1952w = null;
                    }
                } else {
                    this.f1948r = y;
                    this.f1932C = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f1952w;
                    if (velocityTracker3 == null) {
                        this.f1952w = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f1952w.addMovement(motionEvent);
                    this.n.computeScrollOffset();
                    if (!u(motionEvent) && this.n.isFinished()) {
                        z3 = false;
                    }
                    this.f1951v = z3;
                    this.f1939J.g(2, 0);
                }
            } else {
                if (!u(motionEvent)) {
                    z3 = false;
                }
                this.f1951v = z3;
                velocityTracker = this.f1952w;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f1952w = null;
                }
            }
        } else if (i3 == 1) {
            this.f1951v = false;
            this.f1932C = -1;
            velocityTracker2 = this.f1952w;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f1952w = null;
            }
            if (this.n.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            v(0);
        } else if (i3 == 2) {
            int i4 = this.f1932C;
            if (i4 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i4);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i4 + " in onInterceptTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y3 - this.f1948r) > this.f1953z && (2 & getNestedScrollAxes()) == 0) {
                        this.f1951v = true;
                        this.f1948r = y3;
                        if (this.f1952w == null) {
                            this.f1952w = VelocityTracker.obtain();
                        }
                        this.f1952w.addMovement(motionEvent);
                        this.f1935F = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i3 == 3) {
            this.f1951v = false;
            this.f1932C = -1;
            velocityTracker2 = this.f1952w;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f1952w = null;
            }
            if (this.n.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            v(0);
        } else if (i3 == 6) {
            n(motionEvent);
        }
        return this.f1951v;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int measuredHeight;
        super.onLayout(z3, i3, i4, i5, i6);
        int i7 = 0;
        this.f1949s = false;
        View view = this.u;
        if (view != null && k(view, this)) {
            View view2 = this.u;
            Rect rect = this.f1944m;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        this.u = null;
        if (!this.f1950t) {
            if (this.f1937H != null) {
                scrollTo(getScrollX(), this.f1937H.f377k);
                this.f1937H = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i7 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i7 != scrollY) {
                scrollTo(getScrollX(), i7);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1950t = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (this.x && View.MeasureSpec.getMode(i4) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f4, boolean z3) {
        if (z3) {
            return false;
        }
        dispatchNestedFling(0.0f, f4, true);
        i((int) f4);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f4) {
        return this.f1939J.b(f3, f4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
        this.f1939J.c(i3, i4, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        m(i6, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i3) {
        a(view, view2, i3, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i3, int i4, boolean z3, boolean z4) {
        super.scrollTo(i3, i4);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (i3 == 2) {
            i3 = 130;
        } else if (i3 == 1) {
            i3 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i3) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i3);
        if (viewFindNextFocus != null && l(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i3, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        this.f1937H = gVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        gVar.f377k = getScrollY();
        return gVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i3, int i4, int i5, int i6) {
        super.onScrollChanged(i3, i4, i5, i6);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !l(viewFindFocus, 0, i6)) {
            return;
        }
        Rect rect = this.f1944m;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iH = h(rect);
        if (iH != 0) {
            if (this.y) {
                t(0, iH, false);
            } else {
                scrollBy(0, iH);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i3) {
        return f(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0122  */
    /* JADX WARN: Code duplicated, block: B:56:0x0138  */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0143  */
    /* JADX WARN: Code duplicated, block: B:63:0x014a  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fN;
        int iRound;
        int i3;
        ViewParent parent2;
        if (this.f1952w == null) {
            this.f1952w = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1935F = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f3 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f1935F);
        C0010k c0010k = this.f1939J;
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f1945o;
            EdgeEffect edgeEffect2 = this.f1946p;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1952w;
                velocityTracker.computeCurrentVelocity(PipesIterator.DEFAULT_QUEUE_SIZE, this.f1931B);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1932C);
                if (Math.abs(yVelocity) >= this.f1930A) {
                    if (p000a.a.z(edgeEffect) != 0.0f) {
                        if (s(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (p000a.a.z(edgeEffect2) != 0.0f) {
                        int i4 = -yVelocity;
                        if (s(edgeEffect2, i4)) {
                            edgeEffect2.onAbsorb(i4);
                        } else {
                            i(i4);
                        }
                    } else {
                        int i5 = -yVelocity;
                        float f4 = i5;
                        if (!c0010k.b(0.0f, f4)) {
                            dispatchNestedFling(0.0f, f4, true);
                            i(i5);
                        }
                    }
                } else if (this.n.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1932C = -1;
                this.f1951v = false;
                VelocityTracker velocityTracker2 = this.f1952w;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1952w = null;
                }
                v(0);
                this.f1945o.onRelease();
                this.f1946p.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1932C);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1932C + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i6 = this.f1948r - y;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i6 / getHeight();
                    if (p000a.a.z(edgeEffect) != 0.0f) {
                        fN = -p000a.a.N(edgeEffect, -height, x);
                        if (p000a.a.z(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (p000a.a.z(edgeEffect2) != 0.0f) {
                        fN = p000a.a.N(edgeEffect2, height, 1.0f - x);
                        if (p000a.a.z(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f3 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i3 = i6 - iRound;
                        if (!this.f1951v && Math.abs(i3) > this.f1953z) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f1951v = true;
                            if (i3 > 0) {
                                i3 -= this.f1953z;
                            } else {
                                i3 += this.f1953z;
                            }
                        }
                        if (this.f1951v) {
                            int iR = r(i3, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f1948r = y - iR;
                            this.f1935F += iR;
                        }
                    }
                    f3 = fN;
                    iRound = Math.round(f3 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i3 = i6 - iRound;
                    if (!this.f1951v) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1951v = true;
                        if (i3 > 0) {
                            i3 -= this.f1953z;
                        } else {
                            i3 += this.f1953z;
                        }
                    }
                    if (this.f1951v) {
                        int iR2 = r(i3, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f1948r = y - iR2;
                        this.f1935F += iR2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1951v && getChildCount() > 0) {
                    if (this.n.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                }
                this.f1932C = -1;
                this.f1951v = false;
                VelocityTracker velocityTracker3 = this.f1952w;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1952w = null;
                }
                v(0);
                this.f1945o.onRelease();
                this.f1946p.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1948r = (int) motionEvent.getY(actionIndex);
                this.f1932C = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                n(motionEvent);
                this.f1948r = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1932C));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1951v && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.n.isFinished()) {
                this.n.abortAnimation();
                v(1);
            }
            int y3 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f1948r = y3;
            this.f1932C = pointerId;
            c0010k.g(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1952w;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(int i3) {
        boolean z3 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f1944m;
        if (z3) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i4 = rect.top;
        int i5 = height + i4;
        rect.bottom = i5;
        q(i3, i4, i5);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean q(int i3, int i4, int i5) {
        boolean z3;
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = height + scrollY;
        boolean z4 = i3 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z5 = false;
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = focusables.get(i7);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i4 < bottom && top < i5) {
                boolean z6 = i4 < top && bottom < i5;
                if (view == null) {
                    view = view2;
                    z5 = z6;
                } else {
                    boolean z7 = (z4 && top < view.getTop()) || (!z4 && bottom > view.getBottom());
                    if (z5) {
                        if (z6 && z7) {
                            view = view2;
                        }
                    } else if (z6) {
                        view = view2;
                        z5 = true;
                    } else if (z7) {
                        view = view2;
                    }
                }
            }
        }
        View view3 = view == null ? this : view;
        if (i4 < scrollY || i5 > i6) {
            r(z4 ? i4 - scrollY : i5 - i6, -1, null, 0, 1, true);
            z3 = true;
        } else {
            z3 = false;
        }
        if (view3 != findFocus()) {
            view3.requestFocus(i3);
        }
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    public final int r(int i3, int i4, MotionEvent motionEvent, int i5, int i6, boolean z3) {
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        VelocityTracker velocityTracker;
        C0010k c0010k = this.f1939J;
        if (i6 == 1) {
            c0010k.g(2, i6);
        }
        boolean zC = this.f1939J.c(0, i3, i6, this.f1934E, this.f1933D);
        int[] iArr = this.f1933D;
        int[] iArr2 = this.f1934E;
        if (zC) {
            i7 = i3 - iArr2[1];
            i8 = iArr[1];
        } else {
            i7 = i3;
            i8 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z6 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z3;
        boolean z7 = o(i7, 0, scrollY, scrollRange) && !c0010k.f(i6);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().f261a.onScrollProgress(motionEvent.getDeviceId(), motionEvent.getSource(), i4, scrollY2);
        }
        iArr2[1] = 0;
        this.f1939J.d(0, scrollY2, 0, i7 - scrollY2, this.f1933D, i6, iArr2);
        int i9 = i8 + iArr[1];
        int i10 = i7 - iArr2[1];
        int i11 = scrollY + i10;
        EdgeEffect edgeEffect = this.f1946p;
        EdgeEffect edgeEffect2 = this.f1945o;
        if (i11 >= 0) {
            if (i11 > scrollRange && z6) {
                p000a.a.N(edgeEffect, i10 / getHeight(), 1.0f - (i5 / getWidth()));
                if (motionEvent != null) {
                    z4 = false;
                    getScrollFeedbackProvider().f261a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i4, false);
                } else {
                    z4 = false;
                }
                if (!edgeEffect2.isFinished()) {
                    edgeEffect2.onRelease();
                }
            }
            if (edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
                postInvalidateOnAnimation();
                z5 = z4;
            } else {
                z5 = z7;
            }
            if (z5 && i6 == 0 && (velocityTracker = this.f1952w) != null) {
                velocityTracker.clear();
            }
            if (i6 == 1) {
                v(i6);
                edgeEffect2.onRelease();
                edgeEffect.onRelease();
            }
            return i9;
        }
        if (z6) {
            p000a.a.N(edgeEffect2, (-i10) / getHeight(), i5 / getWidth());
            if (motionEvent != null) {
                getScrollFeedbackProvider().f261a.onScrollLimit(motionEvent.getDeviceId(), motionEvent.getSource(), i4, true);
            }
            if (!edgeEffect.isFinished()) {
                edgeEffect.onRelease();
            }
        }
        z4 = false;
        if (edgeEffect2.isFinished()) {
            postInvalidateOnAnimation();
            z5 = z4;
        } else {
            postInvalidateOnAnimation();
            z5 = z4;
        }
        if (z5) {
            velocityTracker.clear();
        }
        if (i6 == 1) {
            v(i6);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f1949s) {
            this.u = view2;
        } else {
            Rect rect = this.f1944m;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iH = h(rect);
        boolean z4 = iH != 0;
        if (z4) {
            if (z3) {
                scrollBy(0, iH);
                return z4;
            }
            t(0, iH, false);
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        VelocityTracker velocityTracker;
        if (z3 && (velocityTracker = this.f1952w) != null) {
            velocityTracker.recycle();
            this.f1952w = null;
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1949s = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i3) {
        if (i3 > 0) {
            return true;
        }
        float fZ = p000a.a.z(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i3) * 0.35f;
        float f3 = this.f1942k * 0.015f;
        double dLog = Math.log(fAbs / f3);
        double d3 = f1927M;
        return ((float) (Math.exp((d3 / (d3 - 1.0d)) * dLog) * ((double) f3))) < fZ;
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i4) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i3 < 0) {
                i3 = 0;
            } else if (width + i3 > width2) {
                i3 = width2 - width;
            }
            if (height >= height2 || i4 < 0) {
                i4 = 0;
            } else if (height + i4 > height2) {
                i4 = height2 - height;
            }
            if (i3 == getScrollX() && i4 == getScrollY()) {
                return;
            }
            super.scrollTo(i3, i4);
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.x) {
            this.x = z3;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        C0010k c0010k = this.f1939J;
        if (c0010k.f247d) {
            ViewGroup viewGroup = c0010k.f246c;
            Field field = G.f187a;
            viewGroup.stopNestedScroll();
        }
        c0010k.f247d = z3;
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.y = z3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return this.f1939J.g(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        v(0);
    }

    public final void t(int i3, int i4, boolean z3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1943l > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i4 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.n.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z3) {
                this.f1939J.g(2, 1);
            } else {
                v(1);
            }
            this.f1936G = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.n.isFinished()) {
                this.n.abortAnimation();
                v(1);
            }
            scrollBy(i3, i4);
        }
        this.f1943l = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean u(MotionEvent motionEvent) {
        boolean z3;
        EdgeEffect edgeEffect = this.f1945o;
        if (p000a.a.z(edgeEffect) != 0.0f) {
            p000a.a.N(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z3 = true;
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.f1946p;
        if (p000a.a.z(edgeEffect2) == 0.0f) {
            return z3;
        }
        p000a.a.N(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void v(int i3) {
        this.f1939J.h(i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3) {
        if (getChildCount() <= 0) {
            super.addView(view, i3);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(f fVar) {
    }
}
