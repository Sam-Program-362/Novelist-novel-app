package androidx.recyclerview.widget;

import A.b;
import A.l;
import A0.j;
import B1.g;
import D.AbstractC0009j;
import D.B;
import D.C0010k;
import D.G;
import D.H;
import M1.A;
import a2.h;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import io.flutter.plugin.platform.C0311c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import k0.AbstractC0363a;
import l0.AbstractC0380C;
import l0.AbstractC0390M;
import l0.AbstractC0406p;
import l0.AbstractC0409s;
import l0.AbstractC0410t;
import l0.AbstractC0412v;
import l0.AbstractC0413w;
import l0.AbstractC0414x;
import l0.C0378A;
import l0.C0379B;
import l0.C0383F;
import l0.C0392b;
import l0.C0393c;
import l0.C0397g;
import l0.C0398h;
import l0.C0408r;
import l0.C0411u;
import l0.C0415y;
import l0.InterfaceC0407q;
import l0.InterfaceC0416z;
import l0.InterpolatorC0405o;
import l0.RunnableC0381D;
import l0.RunnableC0400j;
import org.apache.tika.utils.StringUtils;
import z.AbstractC0503c;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: r0, reason: collision with root package name */
    public static final int[] f2207r0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: s0, reason: collision with root package name */
    public static final int[] f2208s0 = {R.attr.clipToPadding};

    /* renamed from: t0, reason: collision with root package name */
    public static final Class[] f2209t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final InterpolatorC0405o f2210u0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f2211A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f2212B;

    /* renamed from: C, reason: collision with root package name */
    public int f2213C;

    /* renamed from: D, reason: collision with root package name */
    public final AccessibilityManager f2214D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2215E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f2216F;

    /* renamed from: G, reason: collision with root package name */
    public int f2217G;

    /* renamed from: H, reason: collision with root package name */
    public final int f2218H;

    /* renamed from: I, reason: collision with root package name */
    public C0408r f2219I;

    /* renamed from: J, reason: collision with root package name */
    public EdgeEffect f2220J;

    /* renamed from: K, reason: collision with root package name */
    public EdgeEffect f2221K;

    /* renamed from: L, reason: collision with root package name */
    public EdgeEffect f2222L;

    /* renamed from: M, reason: collision with root package name */
    public EdgeEffect f2223M;

    /* renamed from: N, reason: collision with root package name */
    public AbstractC0409s f2224N;

    /* renamed from: O, reason: collision with root package name */
    public int f2225O;

    /* renamed from: P, reason: collision with root package name */
    public int f2226P;

    /* renamed from: Q, reason: collision with root package name */
    public VelocityTracker f2227Q;

    /* renamed from: R, reason: collision with root package name */
    public int f2228R;
    public int S;

    /* renamed from: T, reason: collision with root package name */
    public int f2229T;

    /* renamed from: U, reason: collision with root package name */
    public int f2230U;

    /* renamed from: V, reason: collision with root package name */
    public int f2231V;
    public final int W;

    /* renamed from: a0, reason: collision with root package name */
    public final int f2232a0;

    /* renamed from: b0, reason: collision with root package name */
    public final float f2233b0;

    /* renamed from: c0, reason: collision with root package name */
    public final float f2234c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f2235d0;

    /* renamed from: e0, reason: collision with root package name */
    public final RunnableC0381D f2236e0;

    /* renamed from: f0, reason: collision with root package name */
    public RunnableC0400j f2237f0;

    /* renamed from: g0, reason: collision with root package name */
    public final C0398h f2238g0;

    /* renamed from: h0, reason: collision with root package name */
    public final C0379B f2239h0;

    /* renamed from: i0, reason: collision with root package name */
    public ArrayList f2240i0;

    /* renamed from: j0, reason: collision with root package name */
    public final A f2241j0;

    /* renamed from: k, reason: collision with root package name */
    public final C0311c f2242k;

    /* renamed from: k0, reason: collision with root package name */
    public C0383F f2243k0;

    /* renamed from: l, reason: collision with root package name */
    public C0378A f2244l;

    /* renamed from: l0, reason: collision with root package name */
    public C0010k f2245l0;

    /* renamed from: m, reason: collision with root package name */
    public final j f2246m;

    /* renamed from: m0, reason: collision with root package name */
    public final int[] f2247m0;
    public final j n;

    /* renamed from: n0, reason: collision with root package name */
    public final int[] f2248n0;

    /* renamed from: o, reason: collision with root package name */
    public final A f2249o;

    /* renamed from: o0, reason: collision with root package name */
    public final int[] f2250o0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2251p;

    /* renamed from: p0, reason: collision with root package name */
    public final ArrayList f2252p0;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f2253q;

    /* renamed from: q0, reason: collision with root package name */
    public final b f2254q0;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f2255r;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC0410t f2256s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f2257t;
    public final ArrayList u;

    /* renamed from: v, reason: collision with root package name */
    public C0397g f2258v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2259w;
    public boolean x;
    public boolean y;

    /* renamed from: z, reason: collision with root package name */
    public int f2260z;

    static {
        Class cls = Integer.TYPE;
        f2209t0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f2210u0 = new InterpolatorC0405o();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        float a3;
        Constructor constructor;
        this.f2242k = new C0311c(this);
        this.f2249o = new A();
        this.f2253q = new Rect();
        this.f2255r = new Rect();
        new RectF();
        this.f2257t = new ArrayList();
        this.u = new ArrayList();
        this.f2260z = 0;
        this.f2215E = false;
        this.f2216F = false;
        this.f2217G = 0;
        this.f2218H = 0;
        this.f2219I = new C0408r();
        C0393c c0393c = new C0393c();
        Object[] objArr = null;
        c0393c.f4013a = null;
        c0393c.f4014b = new ArrayList();
        c0393c.f4015c = 250L;
        c0393c.f4016d = 250L;
        c0393c.f3957e = new ArrayList();
        c0393c.f3958f = new ArrayList();
        c0393c.f3959g = new ArrayList();
        c0393c.f3960h = new ArrayList();
        c0393c.f3961i = new ArrayList();
        c0393c.f3962j = new ArrayList();
        c0393c.f3963k = new ArrayList();
        c0393c.f3964l = new ArrayList();
        c0393c.f3965m = new ArrayList();
        c0393c.n = new ArrayList();
        c0393c.f3966o = new ArrayList();
        this.f2224N = c0393c;
        this.f2225O = 0;
        this.f2226P = -1;
        this.f2233b0 = Float.MIN_VALUE;
        this.f2234c0 = Float.MIN_VALUE;
        boolean z3 = true;
        this.f2235d0 = true;
        this.f2236e0 = new RunnableC0381D(this);
        this.f2238g0 = new C0398h();
        C0379B c0379b = new C0379B();
        c0379b.f3919a = 0;
        c0379b.f3920b = false;
        c0379b.f3921c = false;
        c0379b.f3922d = false;
        c0379b.f3923e = false;
        this.f2239h0 = c0379b;
        A a4 = new A(24);
        this.f2241j0 = a4;
        this.f2247m0 = new int[2];
        this.f2248n0 = new int[2];
        this.f2250o0 = new int[2];
        this.f2252p0 = new ArrayList();
        this.f2254q0 = new b(this, 13);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2208s0, 0, 0);
            this.f2251p = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f2251p = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2231V = viewConfiguration.getScaledTouchSlop();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            Method method = H.f189a;
            a3 = AbstractC0009j.c(viewConfiguration);
        } else {
            a3 = H.a(viewConfiguration, context);
        }
        this.f2233b0 = a3;
        this.f2234c0 = i3 >= 26 ? AbstractC0009j.d(viewConfiguration) : H.a(viewConfiguration, context);
        this.W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2232a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2224N.f4013a = a4;
        this.f2246m = new j(new A(this, 23));
        this.n = new j(new g(this, 16));
        Field field = G.f187a;
        if ((i3 >= 26 ? B.a(this) : 0) == 0 && i3 >= 26) {
            B.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f2214D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0383F(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0363a.f3815a, 0, 0);
            String string = obtainStyledAttributes2.getString(7);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (obtainStyledAttributes2.getBoolean(2, false)) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(5);
                Drawable drawable = obtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + h());
                }
                Resources resources = getContext().getResources();
                new C0397g(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(it.returntrue.novelist.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(it.returntrue.novelist.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(it.returntrue.novelist.R.dimen.fastscroll_margin));
            }
            obtainStyledAttributes2.recycle();
            if (string != null) {
                String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(0) == '.') {
                        trim = context.getPackageName() + trim;
                    } else if (!trim.contains(".")) {
                        trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                    }
                    String str = trim;
                    try {
                        Class<? extends U> asSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(str).asSubclass(AbstractC0410t.class);
                        try {
                            constructor = asSubclass.getConstructor(f2209t0);
                            objArr = new Object[]{context, attributeSet, 0, 0};
                        } catch (NoSuchMethodException e3) {
                            try {
                                constructor = asSubclass.getConstructor(null);
                            } catch (NoSuchMethodException e4) {
                                e4.initCause(e3);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e4);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((AbstractC0410t) constructor.newInstance(objArr));
                    } catch (ClassCastException e5) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e5);
                    } catch (ClassNotFoundException e6) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e6);
                    } catch (IllegalAccessException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e7);
                    } catch (InstantiationException e8) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e8);
                    } catch (InvocationTargetException e9) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e9);
                    }
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f2207r0, 0, 0);
            z3 = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z3);
    }

    private C0010k getScrollingChildHelper() {
        if (this.f2245l0 == null) {
            this.f2245l0 = new C0010k(this);
        }
        return this.f2245l0;
    }

    public static void j(View view) {
        if (view == null) {
            return;
        }
        ((C0411u) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i3, int i4) {
        AbstractC0410t abstractC0410t = this.f2256s;
        if (abstractC0410t != null) {
            abstractC0410t.getClass();
        }
        super.addFocusables(arrayList, i3, i4);
    }

    public final void b(String str) {
        if (this.f2217G > 0) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
        }
        if (this.f2218H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(StringUtils.EMPTY + h()));
        }
    }

    public final void c(int i3, int i4) {
        boolean z3;
        EdgeEffect edgeEffect = this.f2220J;
        if (edgeEffect == null || edgeEffect.isFinished() || i3 <= 0) {
            z3 = false;
        } else {
            this.f2220J.onRelease();
            z3 = this.f2220J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2222L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i3 < 0) {
            this.f2222L.onRelease();
            z3 |= this.f2222L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2221K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i4 > 0) {
            this.f2221K.onRelease();
            z3 |= this.f2221K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2223M;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i4 < 0) {
            this.f2223M.onRelease();
            z3 |= this.f2223M.isFinished();
        }
        if (z3) {
            Field field = G.f187a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0411u) && this.f2256s.d((C0411u) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC0410t abstractC0410t = this.f2256s;
        if (abstractC0410t != null && abstractC0410t.b()) {
            return this.f2256s.f(this.f2239h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC0410t abstractC0410t = this.f2256s;
        if (abstractC0410t != null && abstractC0410t.b()) {
            this.f2256s.g(this.f2239h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC0410t abstractC0410t = this.f2256s;
        if (abstractC0410t != null && abstractC0410t.b()) {
            return this.f2256s.h(this.f2239h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC0410t abstractC0410t = this.f2256s;
        if (abstractC0410t != null && abstractC0410t.c()) {
            return this.f2256s.i(this.f2239h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC0410t abstractC0410t = this.f2256s;
        if (abstractC0410t != null && abstractC0410t.c()) {
            this.f2256s.j(this.f2239h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC0410t abstractC0410t = this.f2256s;
        if (abstractC0410t != null && abstractC0410t.c()) {
            return this.f2256s.k(this.f2239h0);
        }
        return 0;
    }

    public final void d() {
        if (!this.y || this.f2215E) {
            int i3 = AbstractC0503c.f4734a;
            Trace.beginSection("RV FullInvalidate");
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            Trace.endSection();
            return;
        }
        j jVar = this.f2246m;
        if (((ArrayList) jVar.f58m).size() > 0) {
            jVar.getClass();
            if (((ArrayList) jVar.f58m).size() > 0) {
                int i4 = AbstractC0503c.f4734a;
                Trace.beginSection("RV FullInvalidate");
                Log.e("RecyclerView", "No adapter attached; skipping layout");
                Trace.endSection();
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f3, float f4, boolean z3) {
        return getScrollingChildHelper().a(f3, f4, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f3, float f4) {
        return getScrollingChildHelper().b(f3, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i4, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return getScrollingChildHelper().d(i3, i4, i5, i6, iArr, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z3;
        super.draw(canvas);
        ArrayList arrayList = this.f2257t;
        int size = arrayList.size();
        boolean z4 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            C0397g c0397g = (C0397g) arrayList.get(i3);
            if (c0397g.f3981l != c0397g.n.getWidth() || c0397g.f3982m != c0397g.n.getHeight()) {
                c0397g.f3981l = c0397g.n.getWidth();
                c0397g.f3982m = c0397g.n.getHeight();
                c0397g.e(0);
            } else if (c0397g.f3989v != 0) {
                if (c0397g.f3983o) {
                    int i4 = c0397g.f3981l;
                    int i5 = c0397g.f3973d;
                    int i6 = i4 - i5;
                    int i7 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable = c0397g.f3971b;
                    stateListDrawable.setBounds(0, 0, i5, 0);
                    Drawable drawable = c0397g.f3972c;
                    drawable.setBounds(0, 0, c0397g.f3974e, c0397g.f3982m);
                    RecyclerView recyclerView = c0397g.n;
                    Field field = G.f187a;
                    if (recyclerView.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i5, i7);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        canvas.translate(-i5, -i7);
                    } else {
                        canvas.translate(i6, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i7);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i6, -i7);
                    }
                }
                if (c0397g.f3984p) {
                    int i8 = c0397g.f3982m;
                    int i9 = c0397g.f3977h;
                    int i10 = i8 - i9;
                    StateListDrawable stateListDrawable2 = c0397g.f3975f;
                    stateListDrawable2.setBounds(0, 0, 0, i9);
                    Drawable drawable2 = c0397g.f3976g;
                    drawable2.setBounds(0, 0, c0397g.f3981l, c0397g.f3978i);
                    canvas.translate(0.0f, i10);
                    drawable2.draw(canvas);
                    canvas.translate(0 - (0 / 2), 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-r8, -i10);
                }
            }
            i3++;
        }
        EdgeEffect edgeEffect = this.f2220J;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z3 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f2251p ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f2220J;
            z3 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f2221K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2251p) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2221K;
            z3 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f2222L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2251p ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f2222L;
            z3 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f2223M;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2251p) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f2223M;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z3 |= z4;
            canvas.restoreToCount(save4);
        }
        if ((z3 || this.f2224N == null || arrayList.size() <= 0 || !this.f2224N.b()) ? z3 : true) {
            Field field2 = G.f187a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e(int i3, int i4) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = G.f187a;
        setMeasuredDimension(AbstractC0410t.e(i3, paddingRight, getMinimumWidth()), AbstractC0410t.e(i4, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i4, i5, iArr, iArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
    
        if (r4 > 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e0, code lost:
    
        if (r7 > 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e3, code lost:
    
        if (r4 < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e6, code lost:
    
        if (r7 < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ee, code lost:
    
        if ((r7 * r1) < 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f6, code lost:
    
        if ((r7 * r1) > 0) goto L83;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r13, int r14) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final boolean g(int[] iArr, int i3) {
        return getScrollingChildHelper().d(0, 0, 0, 0, iArr, i3, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC0410t abstractC0410t = this.f2256s;
        if (abstractC0410t != null) {
            return abstractC0410t.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC0410t abstractC0410t = this.f2256s;
        if (abstractC0410t != null) {
            return abstractC0410t.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public AbstractC0406p getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC0410t abstractC0410t = this.f2256s;
        if (abstractC0410t == null) {
            return super.getBaseline();
        }
        abstractC0410t.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i3, int i4) {
        return super.getChildDrawingOrder(i3, i4);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2251p;
    }

    public C0383F getCompatAccessibilityDelegate() {
        return this.f2243k0;
    }

    public C0408r getEdgeEffectFactory() {
        return this.f2219I;
    }

    public AbstractC0409s getItemAnimator() {
        return this.f2224N;
    }

    public int getItemDecorationCount() {
        return this.f2257t.size();
    }

    public AbstractC0410t getLayoutManager() {
        return this.f2256s;
    }

    public int getMaxFlingVelocity() {
        return this.f2232a0;
    }

    public int getMinFlingVelocity() {
        return this.W;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public AbstractC0412v getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2235d0;
    }

    public C0415y getRecycledViewPool() {
        C0311c c0311c = this.f2242k;
        if (((C0415y) c0311c.f3171o) == null) {
            C0415y c0415y = new C0415y();
            c0415y.f4026a = new SparseArray();
            c0415y.f4027b = 0;
            c0311c.f3171o = c0415y;
        }
        return (C0415y) c0311c.f3171o;
    }

    public int getScrollState() {
        return this.f2225O;
    }

    public final String h() {
        return StringUtils.SPACE + super.toString() + ", adapter:null, layout:" + this.f2256s + ", context:" + getContext();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View i(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.i(android.view.View):android.view.View");
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2259w;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f247d;
    }

    public final boolean k() {
        return getScrollingChildHelper().f(1);
    }

    public final boolean l() {
        return !this.y || this.f2215E || ((ArrayList) this.f2246m.f58m).size() > 0;
    }

    public final void m() {
        int B2 = this.n.B();
        for (int i3 = 0; i3 < B2; i3++) {
            ((C0411u) this.n.A(i3).getLayoutParams()).f4025b = true;
        }
        ArrayList arrayList = (ArrayList) this.f2242k.n;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2226P) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f2226P = motionEvent.getPointerId(i3);
            int x = (int) (motionEvent.getX(i3) + 0.5f);
            this.f2229T = x;
            this.f2228R = x;
            int y = (int) (motionEvent.getY(i3) + 0.5f);
            this.f2230U = y;
            this.S = y;
        }
    }

    public final void o(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2253q;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0411u) {
            C0411u c0411u = (C0411u) layoutParams;
            if (!c0411u.f4025b) {
                Rect rect2 = c0411u.f4024a;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f2256s.G(this, view, this.f2253q, !this.y, view2 == null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (r1 >= 30.0f) goto L19;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f2217G = r0
            r1 = 1
            r5.f2259w = r1
            boolean r2 = r5.y
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            r0 = r1
        L14:
            r5.y = r0
            l0.t r0 = r5.f2256s
            if (r0 == 0) goto L1c
            r0.f4021e = r1
        L1c:
            java.lang.ThreadLocal r0 = l0.RunnableC0400j.f3999o
            java.lang.Object r1 = r0.get()
            l0.j r1 = (l0.RunnableC0400j) r1
            r5.f2237f0 = r1
            if (r1 != 0) goto L64
            l0.j r1 = new l0.j
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f4001k = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.n = r2
            r5.f2237f0 = r1
            java.lang.reflect.Field r1 = D.G.f187a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L56
            if (r1 == 0) goto L56
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L56
            goto L58
        L56:
            r1 = 1114636288(0x42700000, float:60.0)
        L58:
            l0.j r2 = r5.f2237f0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f4003m = r3
            r0.set(r2)
        L64:
            l0.j r0 = r5.f2237f0
            java.util.ArrayList r0 = r0.f4001k
            r0.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object obj;
        super.onDetachedFromWindow();
        AbstractC0409s abstractC0409s = this.f2224N;
        if (abstractC0409s != null) {
            abstractC0409s.a();
        }
        setScrollState(0);
        RunnableC0381D runnableC0381D = this.f2236e0;
        runnableC0381D.f3929q.removeCallbacks(runnableC0381D);
        runnableC0381D.f3926m.abortAnimation();
        this.f2259w = false;
        AbstractC0410t abstractC0410t = this.f2256s;
        if (abstractC0410t != null) {
            abstractC0410t.f4021e = false;
            abstractC0410t.z(this);
        }
        this.f2252p0.clear();
        removeCallbacks(this.f2254q0);
        this.f2249o.getClass();
        do {
            l lVar = AbstractC0390M.f3954a;
            Object[] objArr = (Object[]) lVar.f34b;
            int i3 = lVar.f33a;
            obj = null;
            if (i3 > 0) {
                int i4 = i3 - 1;
                Object obj2 = objArr[i4];
                h.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i4] = null;
                lVar.f33a--;
                obj = obj2;
            }
        } while (obj != null);
        RunnableC0400j runnableC0400j = this.f2237f0;
        if (runnableC0400j != null) {
            runnableC0400j.f4001k.remove(this);
            this.f2237f0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2257t;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0397g) arrayList.get(i3)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            l0.t r0 = r5.f2256s
            r1 = 0
            if (r0 != 0) goto L7
            goto L79
        L7:
            boolean r0 = r5.f2211A
            if (r0 == 0) goto Ld
            goto L79
        Ld:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L79
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L40
            l0.t r0 = r5.f2256s
            boolean r0 = r0.c()
            if (r0 == 0) goto L2e
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2f
        L2e:
            r0 = r2
        L2f:
            l0.t r3 = r5.f2256s
            boolean r3 = r3.b()
            if (r3 == 0) goto L3e
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L66
        L3e:
            r3 = r2
            goto L66
        L40:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L64
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            l0.t r3 = r5.f2256s
            boolean r3 = r3.c()
            if (r3 == 0) goto L59
            float r0 = -r0
            goto L3e
        L59:
            l0.t r3 = r5.f2256s
            boolean r3 = r3.b()
            if (r3 == 0) goto L64
            r3 = r0
            r0 = r2
            goto L66
        L64:
            r0 = r2
            r3 = r0
        L66:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6e
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L79
        L6e:
            float r2 = r5.f2233b0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f2234c0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.q(r2, r0, r6)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        if (!this.f2211A) {
            int action = motionEvent.getAction();
            if (action == 3 || action == 0) {
                this.f2258v = null;
            }
            ArrayList arrayList = this.u;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0397g c0397g = (C0397g) arrayList.get(i3);
                if (c0397g.c(motionEvent) && action != 3) {
                    this.f2258v = c0397g;
                    p();
                    setScrollState(0);
                    return true;
                }
            }
            AbstractC0410t abstractC0410t = this.f2256s;
            if (abstractC0410t != null) {
                boolean b3 = abstractC0410t.b();
                boolean c3 = this.f2256s.c();
                if (this.f2227Q == null) {
                    this.f2227Q = VelocityTracker.obtain();
                }
                this.f2227Q.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.f2212B) {
                        this.f2212B = false;
                    }
                    this.f2226P = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.f2229T = x;
                    this.f2228R = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.f2230U = y;
                    this.S = y;
                    if (this.f2225O == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                    }
                    int[] iArr = this.f2250o0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i4 = b3;
                    if (c3) {
                        i4 = (b3 ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i4, 0);
                } else if (actionMasked == 1) {
                    this.f2227Q.clear();
                    s(0);
                } else if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f2226P);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2226P + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f2225O != 1) {
                        int i5 = x3 - this.f2228R;
                        int i6 = y3 - this.S;
                        if (b3 == 0 || Math.abs(i5) <= this.f2231V) {
                            z3 = false;
                        } else {
                            this.f2229T = x3;
                            z3 = true;
                        }
                        if (c3 && Math.abs(i6) > this.f2231V) {
                            this.f2230U = y3;
                            z3 = true;
                        }
                        if (z3) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    p();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f2226P = motionEvent.getPointerId(actionIndex);
                    int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f2229T = x4;
                    this.f2228R = x4;
                    int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f2230U = y4;
                    this.S = y4;
                } else if (actionMasked == 6) {
                    n(motionEvent);
                }
                if (this.f2225O == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7 = AbstractC0503c.f4734a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.y = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        AbstractC0410t abstractC0410t = this.f2256s;
        if (abstractC0410t == null) {
            e(i3, i4);
            return;
        }
        if (abstractC0410t.y()) {
            View.MeasureSpec.getMode(i3);
            View.MeasureSpec.getMode(i4);
            this.f2256s.f4018b.e(i3, i4);
        } else {
            if (this.x) {
                this.f2256s.f4018b.e(i3, i4);
                return;
            }
            C0379B c0379b = this.f2239h0;
            if (c0379b.f3923e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            c0379b.getClass();
            this.f2260z++;
            this.f2256s.f4018b.e(i3, i4);
            if (this.f2260z < 1) {
                this.f2260z = 1;
            }
            this.f2260z--;
            c0379b.f3921c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (this.f2217G > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i3, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0378A)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0378A c0378a = (C0378A) parcelable;
        this.f2244l = c0378a;
        super.onRestoreInstanceState(c0378a.f1286k);
        AbstractC0410t abstractC0410t = this.f2256s;
        if (abstractC0410t == null || (parcelable2 = this.f2244l.f3918m) == null) {
            return;
        }
        abstractC0410t.B(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0378A c0378a = new C0378A(super.onSaveInstanceState());
        C0378A c0378a2 = this.f2244l;
        if (c0378a2 != null) {
            c0378a.f3918m = c0378a2.f3918m;
            return c0378a;
        }
        AbstractC0410t abstractC0410t = this.f2256s;
        if (abstractC0410t != null) {
            c0378a.f3918m = abstractC0410t.C();
            return c0378a;
        }
        c0378a.f3918m = null;
        return c0378a;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        if (i3 == i5 && i4 == i6) {
            return;
        }
        this.f2223M = null;
        this.f2221K = null;
        this.f2222L = null;
        this.f2220J = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0241  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        VelocityTracker velocityTracker = this.f2227Q;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z3 = false;
        s(0);
        EdgeEffect edgeEffect = this.f2220J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = this.f2220J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2221K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 |= this.f2221K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2222L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 |= this.f2222L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2223M;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z3 |= this.f2223M.isFinished();
        }
        if (z3) {
            Field field = G.f187a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(int r11, int r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q(int, int, android.view.MotionEvent):void");
    }

    public final void r(int i3, int i4) {
        int i5;
        AbstractC0410t abstractC0410t = this.f2256s;
        if (abstractC0410t == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2211A) {
            return;
        }
        int i6 = !abstractC0410t.b() ? 0 : i3;
        int i7 = !this.f2256s.c() ? 0 : i4;
        if (i6 == 0 && i7 == 0) {
            return;
        }
        RunnableC0381D runnableC0381D = this.f2236e0;
        RecyclerView recyclerView = runnableC0381D.f3929q;
        int abs = Math.abs(i6);
        int abs2 = Math.abs(i7);
        boolean z3 = abs > abs2;
        int sqrt = (int) Math.sqrt(0);
        int sqrt2 = (int) Math.sqrt((i7 * i7) + (i6 * i6));
        int width = z3 ? recyclerView.getWidth() : recyclerView.getHeight();
        int i8 = width / 2;
        float f3 = width;
        float f4 = i8;
        float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f3) - 0.5f) * 0.47123894f)) * f4) + f4;
        if (sqrt > 0) {
            i5 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
        } else {
            if (!z3) {
                abs = abs2;
            }
            i5 = (int) (((abs / f3) + 1.0f) * 300.0f);
        }
        int min = Math.min(i5, 2000);
        Interpolator interpolator = runnableC0381D.n;
        InterpolatorC0405o interpolatorC0405o = f2210u0;
        if (interpolator != interpolatorC0405o) {
            runnableC0381D.n = interpolatorC0405o;
            runnableC0381D.f3926m = new OverScroller(recyclerView.getContext(), interpolatorC0405o);
        }
        recyclerView.setScrollState(2);
        runnableC0381D.f3925l = 0;
        runnableC0381D.f3924k = 0;
        runnableC0381D.f3926m.startScroll(0, 0, i6, i7, min);
        runnableC0381D.a();
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z3) {
        j(view);
        view.clearAnimation();
        j(view);
        super.removeDetachedView(view, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f2256s.getClass();
        if (this.f2217G <= 0 && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.f2256s.G(this, view, rect, z3, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0397g) arrayList.get(i3)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2260z != 0 || this.f2211A) {
            return;
        }
        super.requestLayout();
    }

    public final void s(int i3) {
        getScrollingChildHelper().h(i3);
    }

    @Override // android.view.View
    public final void scrollBy(int i3, int i4) {
        AbstractC0410t abstractC0410t = this.f2256s;
        if (abstractC0410t == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2211A) {
            return;
        }
        boolean b3 = abstractC0410t.b();
        boolean c3 = this.f2256s.c();
        if (b3 || c3) {
            if (!b3) {
                i3 = 0;
            }
            if (!c3) {
                i4 = 0;
            }
            q(i3, i4, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i3, int i4) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (this.f2217G <= 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.f2213C |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(C0383F c0383f) {
        this.f2243k0 = c0383f;
        G.c(this, c0383f);
    }

    public void setAdapter(AbstractC0406p abstractC0406p) {
        setLayoutFrozen(false);
        AbstractC0409s abstractC0409s = this.f2224N;
        if (abstractC0409s != null) {
            abstractC0409s.a();
        }
        AbstractC0410t abstractC0410t = this.f2256s;
        C0311c c0311c = this.f2242k;
        if (abstractC0410t != null) {
            abstractC0410t.E();
            this.f2256s.F(c0311c);
        }
        ((ArrayList) c0311c.f3170m).clear();
        ArrayList arrayList = (ArrayList) c0311c.n;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            arrayList.get(size).getClass();
            throw new ClassCastException();
        }
        arrayList.clear();
        C0398h c0398h = ((RecyclerView) c0311c.f3172p).f2238g0;
        c0398h.getClass();
        c0398h.f3993c = 0;
        j jVar = this.f2246m;
        jVar.K((ArrayList) jVar.f58m);
        jVar.K((ArrayList) jVar.n);
        ArrayList arrayList2 = (ArrayList) c0311c.f3170m;
        RecyclerView recyclerView = (RecyclerView) c0311c.f3172p;
        ArrayList arrayList3 = (ArrayList) c0311c.n;
        arrayList2.clear();
        int size2 = arrayList3.size() - 1;
        if (size2 >= 0) {
            arrayList3.get(size2).getClass();
            throw new ClassCastException();
        }
        arrayList3.clear();
        C0398h c0398h2 = recyclerView.f2238g0;
        c0398h2.getClass();
        c0398h2.f3993c = 0;
        if (((C0415y) c0311c.f3171o) == null) {
            C0415y c0415y = new C0415y();
            c0415y.f4026a = new SparseArray();
            c0415y.f4027b = 0;
            c0311c.f3171o = c0415y;
        }
        C0415y c0415y2 = (C0415y) c0311c.f3171o;
        if (c0415y2.f4027b == 0) {
            SparseArray sparseArray = c0415y2.f4026a;
            if (sparseArray.size() > 0) {
                ((AbstractC0414x) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f2239h0.f3920b = true;
        this.f2216F = this.f2216F;
        this.f2215E = true;
        int B2 = this.n.B();
        for (int i3 = 0; i3 < B2; i3++) {
            j(this.n.A(i3));
        }
        m();
        int size3 = arrayList3.size();
        for (int i4 = 0; i4 < size3; i4++) {
            if (arrayList3.get(i4) != null) {
                throw new ClassCastException();
            }
        }
        int size4 = arrayList3.size() - 1;
        if (size4 >= 0) {
            arrayList3.get(size4).getClass();
            throw new ClassCastException();
        }
        arrayList3.clear();
        C0398h c0398h3 = recyclerView.f2238g0;
        c0398h3.getClass();
        c0398h3.f3993c = 0;
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0407q interfaceC0407q) {
        if (interfaceC0407q == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        if (z3 != this.f2251p) {
            this.f2223M = null;
            this.f2221K = null;
            this.f2222L = null;
            this.f2220J = null;
        }
        this.f2251p = z3;
        super.setClipToPadding(z3);
        if (this.y) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0408r c0408r) {
        c0408r.getClass();
        this.f2219I = c0408r;
        this.f2223M = null;
        this.f2221K = null;
        this.f2222L = null;
        this.f2220J = null;
    }

    public void setHasFixedSize(boolean z3) {
        this.x = z3;
    }

    public void setItemAnimator(AbstractC0409s abstractC0409s) {
        AbstractC0409s abstractC0409s2 = this.f2224N;
        if (abstractC0409s2 != null) {
            abstractC0409s2.a();
            this.f2224N.f4013a = null;
        }
        this.f2224N = abstractC0409s;
        if (abstractC0409s != null) {
            abstractC0409s.f4013a = this.f2241j0;
        }
    }

    public void setItemViewCacheSize(int i3) {
        C0311c c0311c = this.f2242k;
        c0311c.f3168k = i3;
        c0311c.c();
    }

    public void setLayoutFrozen(boolean z3) {
        if (z3 != this.f2211A) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z3) {
                this.f2211A = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2211A = true;
            this.f2212B = true;
            setScrollState(0);
            RunnableC0381D runnableC0381D = this.f2236e0;
            runnableC0381D.f3929q.removeCallbacks(runnableC0381D);
            runnableC0381D.f3926m.abortAnimation();
        }
    }

    public void setLayoutManager(AbstractC0410t abstractC0410t) {
        if (abstractC0410t == this.f2256s) {
            return;
        }
        setScrollState(0);
        RunnableC0381D runnableC0381D = this.f2236e0;
        runnableC0381D.f3929q.removeCallbacks(runnableC0381D);
        runnableC0381D.f3926m.abortAnimation();
        AbstractC0410t abstractC0410t2 = this.f2256s;
        C0311c c0311c = this.f2242k;
        if (abstractC0410t2 != null) {
            AbstractC0409s abstractC0409s = this.f2224N;
            if (abstractC0409s != null) {
                abstractC0409s.a();
            }
            this.f2256s.E();
            this.f2256s.F(c0311c);
            ((ArrayList) c0311c.f3170m).clear();
            ArrayList arrayList = (ArrayList) c0311c.n;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
            arrayList.clear();
            C0398h c0398h = ((RecyclerView) c0311c.f3172p).f2238g0;
            c0398h.getClass();
            c0398h.f3993c = 0;
            if (this.f2259w) {
                AbstractC0410t abstractC0410t3 = this.f2256s;
                abstractC0410t3.f4021e = false;
                abstractC0410t3.z(this);
            }
            this.f2256s.I(null);
            this.f2256s = null;
        } else {
            ((ArrayList) c0311c.f3170m).clear();
            ArrayList arrayList2 = (ArrayList) c0311c.n;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                arrayList2.get(size2).getClass();
                throw new ClassCastException();
            }
            arrayList2.clear();
            C0398h c0398h2 = ((RecyclerView) c0311c.f3172p).f2238g0;
            c0398h2.getClass();
            c0398h2.f3993c = 0;
        }
        j jVar = this.n;
        g gVar = (g) jVar.f57l;
        ((C0392b) jVar.f58m).c();
        ArrayList arrayList3 = (ArrayList) jVar.n;
        for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
            j((View) arrayList3.get(size3));
            arrayList3.remove(size3);
        }
        RecyclerView recyclerView = (RecyclerView) gVar.f90l;
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f2256s = abstractC0410t;
        if (abstractC0410t != null) {
            if (abstractC0410t.f4018b != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC0410t + " is already attached to a RecyclerView:" + abstractC0410t.f4018b.h());
            }
            abstractC0410t.I(this);
            if (this.f2259w) {
                this.f2256s.f4021e = true;
            }
        }
        c0311c.c();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        C0010k scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f247d) {
            ViewGroup viewGroup = scrollingChildHelper.f246c;
            Field field = G.f187a;
            viewGroup.stopNestedScroll();
        }
        scrollingChildHelper.f247d = z3;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.f2235d0 = z3;
    }

    public void setRecycledViewPool(C0415y c0415y) {
        C0311c c0311c = this.f2242k;
        if (((C0415y) c0311c.f3171o) != null) {
            r1.f4027b--;
        }
        c0311c.f3171o = c0415y;
        if (c0415y != null) {
            ((RecyclerView) c0311c.f3172p).getAdapter();
        }
    }

    public void setScrollState(int i3) {
        if (i3 == this.f2225O) {
            return;
        }
        this.f2225O = i3;
        if (i3 != 2) {
            RunnableC0381D runnableC0381D = this.f2236e0;
            runnableC0381D.f3929q.removeCallbacks(runnableC0381D);
            runnableC0381D.f3926m.abortAnimation();
        }
        AbstractC0410t abstractC0410t = this.f2256s;
        if (abstractC0410t != null) {
            abstractC0410t.D(i3);
        }
        ArrayList arrayList = this.f2240i0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((AbstractC0413w) this.f2240i0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int i3) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i3 != 0) {
            if (i3 == 1) {
                this.f2231V = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i3 + "; using default value");
        }
        this.f2231V = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0380C abstractC0380C) {
        this.f2242k.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i3) {
        return getScrollingChildHelper().g(i3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC0410t abstractC0410t = this.f2256s;
        if (abstractC0410t != null) {
            return abstractC0410t.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public void setOnFlingListener(AbstractC0412v abstractC0412v) {
    }

    @Deprecated
    public void setOnScrollListener(AbstractC0413w abstractC0413w) {
    }

    public void setRecyclerListener(InterfaceC0416z interfaceC0416z) {
    }
}
