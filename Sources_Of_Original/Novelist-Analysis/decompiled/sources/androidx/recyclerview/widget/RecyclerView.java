package androidx.recyclerview.widget;

import A.b;
import A.l;
import A0.j;
import B1.g;
import D.AbstractC0009j;
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
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import io.flutter.plugin.platform.C0220c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.utils.StringUtils;
import p032k0.a;
import p035l0.B;
import p035l0.C;
import p035l0.C0249b;
import p035l0.C0250c;
import p035l0.C0254g;
import p035l0.C0255h;
import p035l0.D;
import p035l0.F;
import p035l0.M;
import p035l0.RunnableC0257j;
import p035l0.o;
import p035l0.p;
import p035l0.q;
import p035l0.r;
import p035l0.s;
import p035l0.t;
import p035l0.u;
import p035l0.v;
import p035l0.w;
import p035l0.x;
import p035l0.y;
import p035l0.z;
import p068z.c;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int[] f2207r0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int[] f2208s0 = {R.attr.clipToPadding};

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final Class[] f2209t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final o f2210u0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f2211A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f2212B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f2213C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final AccessibilityManager f2214D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f2215E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f2216F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f2217G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f2218H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public r f2219I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public EdgeEffect f2220J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public EdgeEffect f2221K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public EdgeEffect f2222L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public EdgeEffect f2223M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public s f2224N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f2225O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f2226P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public VelocityTracker f2227Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f2228R;
    public int S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f2229T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f2230U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f2231V;
    public final int W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f2232a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final float f2233b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final float f2234c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f2235d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final D f2236e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public RunnableC0257j f2237f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final C0255h f2238g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final B f2239h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ArrayList f2240i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final A f2241j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0220c f2242k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public F f2243k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p035l0.A f2244l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public C0010k f2245l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j f2246m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final int[] f2247m0;
    public final j n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final int[] f2248n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final A f2249o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final int[] f2250o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2251p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ArrayList f2252p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f2253q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final b f2254q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f2255r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t f2256s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f2257t;
    public final ArrayList u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0254g f2258v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f2259w;
    public boolean x;
    public boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f2260z;

    static {
        Class cls = Integer.TYPE;
        f2209t0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f2210u0 = new o();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        float fA;
        Constructor constructor;
        super(context, attributeSet, 0);
        this.f2242k = new C0220c(this);
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
        this.f2219I = new r();
        C0250c c0250c = new C0250c();
        Object[] objArr = null;
        c0250c.f4013a = null;
        c0250c.f4014b = new ArrayList();
        c0250c.f4015c = 250L;
        c0250c.f4016d = 250L;
        c0250c.f3957e = new ArrayList();
        c0250c.f3958f = new ArrayList();
        c0250c.f3959g = new ArrayList();
        c0250c.f3960h = new ArrayList();
        c0250c.f3961i = new ArrayList();
        c0250c.f3962j = new ArrayList();
        c0250c.f3963k = new ArrayList();
        c0250c.f3964l = new ArrayList();
        c0250c.f3965m = new ArrayList();
        c0250c.n = new ArrayList();
        c0250c.f3966o = new ArrayList();
        this.f2224N = c0250c;
        this.f2225O = 0;
        this.f2226P = -1;
        this.f2233b0 = Float.MIN_VALUE;
        this.f2234c0 = Float.MIN_VALUE;
        boolean z3 = true;
        this.f2235d0 = true;
        this.f2236e0 = new D(this);
        this.f2238g0 = new C0255h();
        B b3 = new B();
        b3.f3919a = 0;
        b3.f3920b = false;
        b3.f3921c = false;
        b3.f3922d = false;
        b3.f3923e = false;
        this.f2239h0 = b3;
        A a3 = new A(24);
        this.f2241j0 = a3;
        this.f2247m0 = new int[2];
        this.f2248n0 = new int[2];
        this.f2250o0 = new int[2];
        this.f2252p0 = new ArrayList();
        this.f2254q0 = new b(this, 13);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2208s0, 0, 0);
            this.f2251p = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
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
            fA = AbstractC0009j.c(viewConfiguration);
        } else {
            fA = H.a(viewConfiguration, context);
        }
        this.f2233b0 = fA;
        this.f2234c0 = i3 >= 26 ? AbstractC0009j.d(viewConfiguration) : H.a(viewConfiguration, context);
        this.W = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2232a0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f2224N.f4013a = a3;
        this.f2246m = new j(new A(this, 23));
        this.n = new j(new g(this, 16));
        Field field = G.f187a;
        if ((i3 >= 26 ? D.B.a(this) : 0) == 0 && i3 >= 26) {
            D.B.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f2214D = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new F(this));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f3815a, 0, 0);
            String string = typedArrayObtainStyledAttributes2.getString(7);
            if (typedArrayObtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (typedArrayObtainStyledAttributes2.getBoolean(2, false)) {
                StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(5);
                Drawable drawable = typedArrayObtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = typedArrayObtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                    throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + h());
                }
                Resources resources = getContext().getResources();
                new C0254g(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(it.returntrue.novelist.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(it.returntrue.novelist.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(it.returntrue.novelist.R.dimen.fastscroll_margin));
            }
            typedArrayObtainStyledAttributes2.recycle();
            if (string != null) {
                String strTrim = string.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.charAt(0) == '.') {
                        strTrim = context.getPackageName() + strTrim;
                    } else if (!strTrim.contains(".")) {
                        strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                    }
                    String str = strTrim;
                    try {
                        Class<? extends U> clsAsSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(str).asSubclass(t.class);
                        try {
                            constructor = clsAsSubclass.getConstructor(f2209t0);
                            objArr = new Object[]{context, attributeSet, 0, 0};
                        } catch (NoSuchMethodException e3) {
                            try {
                                constructor = clsAsSubclass.getConstructor(null);
                            } catch (NoSuchMethodException e4) {
                                e4.initCause(e3);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e4);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((t) constructor.newInstance(objArr));
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
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f2207r0, 0, 0);
            z3 = typedArrayObtainStyledAttributes3.getBoolean(0, true);
            typedArrayObtainStyledAttributes3.recycle();
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
        ((u) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i3, int i4) {
        t tVar = this.f2256s;
        if (tVar != null) {
            tVar.getClass();
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
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f2220J;
        if (edgeEffect == null || edgeEffect.isFinished() || i3 <= 0) {
            zIsFinished = false;
        } else {
            this.f2220J.onRelease();
            zIsFinished = this.f2220J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2222L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i3 < 0) {
            this.f2222L.onRelease();
            zIsFinished |= this.f2222L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2221K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i4 > 0) {
            this.f2221K.onRelease();
            zIsFinished |= this.f2221K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2223M;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i4 < 0) {
            this.f2223M.onRelease();
            zIsFinished |= this.f2223M.isFinished();
        }
        if (zIsFinished) {
            Field field = G.f187a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof u) && this.f2256s.d((u) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        t tVar = this.f2256s;
        if (tVar != null && tVar.b()) {
            return this.f2256s.f(this.f2239h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        t tVar = this.f2256s;
        if (tVar != null && tVar.b()) {
            this.f2256s.g(this.f2239h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        t tVar = this.f2256s;
        if (tVar != null && tVar.b()) {
            return this.f2256s.h(this.f2239h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        t tVar = this.f2256s;
        if (tVar != null && tVar.c()) {
            return this.f2256s.i(this.f2239h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        t tVar = this.f2256s;
        if (tVar != null && tVar.c()) {
            this.f2256s.j(this.f2239h0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        t tVar = this.f2256s;
        if (tVar != null && tVar.c()) {
            return this.f2256s.k(this.f2239h0);
        }
        return 0;
    }

    public final void d() {
        if (!this.y || this.f2215E) {
            int i3 = c.f4734a;
            Trace.beginSection("RV FullInvalidate");
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            Trace.endSection();
            return;
        }
        j jVar = this.f2246m;
        if (((ArrayList) jVar.f58m).size() > 0) {
            jVar.getClass();
            if (((ArrayList) jVar.f58m).size() > 0) {
                int i4 = c.f4734a;
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
            C0254g c0254g = (C0254g) arrayList.get(i3);
            if (c0254g.f3981l != c0254g.n.getWidth() || c0254g.f3982m != c0254g.n.getHeight()) {
                c0254g.f3981l = c0254g.n.getWidth();
                c0254g.f3982m = c0254g.n.getHeight();
                c0254g.e(0);
            } else if (c0254g.f3989v != 0) {
                if (c0254g.f3983o) {
                    int i4 = c0254g.f3981l;
                    int i5 = c0254g.f3973d;
                    int i6 = i4 - i5;
                    int i7 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable = c0254g.f3971b;
                    stateListDrawable.setBounds(0, 0, i5, 0);
                    Drawable drawable = c0254g.f3972c;
                    drawable.setBounds(0, 0, c0254g.f3974e, c0254g.f3982m);
                    RecyclerView recyclerView = c0254g.n;
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
                if (c0254g.f3984p) {
                    int i8 = c0254g.f3982m;
                    int i9 = c0254g.f3977h;
                    int i10 = i8 - i9;
                    int i11 = 0 - (0 / 2);
                    StateListDrawable stateListDrawable2 = c0254g.f3975f;
                    stateListDrawable2.setBounds(0, 0, 0, i9);
                    Drawable drawable2 = c0254g.f3976g;
                    drawable2.setBounds(0, 0, c0254g.f3981l, c0254g.f3978i);
                    canvas.translate(0.0f, i10);
                    drawable2.draw(canvas);
                    canvas.translate(i11, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i11, -i10);
                }
            }
            i3++;
        }
        EdgeEffect edgeEffect = this.f2220J;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z3 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f2251p ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f2220J;
            z3 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f2221K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f2251p) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2221K;
            z3 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f2222L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f2251p ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f2222L;
            z3 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f2223M;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
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
            canvas.restoreToCount(iSave4);
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
        setMeasuredDimension(t.e(i3, paddingRight, getMinimumWidth()), t.e(i4, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i4, i5, iArr, iArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c2, code lost:
    
        if (r4 > 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e0, code lost:
    
        if (r7 > 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e3, code lost:
    
        if (r4 < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e6, code lost:
    
        if (r7 < 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ee, code lost:
    
        if ((r7 * r1) < 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f6, code lost:
    
        if ((r7 * r1) > 0) goto L83;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r13, int r14) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final boolean g(int[] iArr, int i3) {
        return getScrollingChildHelper().d(0, 0, 0, 0, iArr, i3, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        t tVar = this.f2256s;
        if (tVar != null) {
            return tVar.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        t tVar = this.f2256s;
        if (tVar != null) {
            return tVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public p getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        t tVar = this.f2256s;
        if (tVar == null) {
            return super.getBaseline();
        }
        tVar.getClass();
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

    public F getCompatAccessibilityDelegate() {
        return this.f2243k0;
    }

    public r getEdgeEffectFactory() {
        return this.f2219I;
    }

    public s getItemAnimator() {
        return this.f2224N;
    }

    public int getItemDecorationCount() {
        return this.f2257t.size();
    }

    public t getLayoutManager() {
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

    public v getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2235d0;
    }

    public y getRecycledViewPool() {
        C0220c c0220c = this.f2242k;
        if (((y) c0220c.f3171o) == null) {
            y yVar = new y();
            yVar.f4026a = new SparseArray();
            yVar.f4027b = 0;
            c0220c.f3171o = yVar;
        }
        return (y) c0220c.f3171o;
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

    public final View i(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
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
        int iB = this.n.B();
        for (int i3 = 0; i3 < iB; i3++) {
            ((u) this.n.A(i3).getLayoutParams()).f4025b = true;
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
        if (layoutParams instanceof u) {
            u uVar = (u) layoutParams;
            if (!uVar.f4025b) {
                Rect rect2 = uVar.f4024a;
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

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        boolean z3 = false;
        this.f2217G = 0;
        this.f2259w = true;
        if (this.y && !isLayoutRequested()) {
            z3 = true;
        }
        this.y = z3;
        t tVar = this.f2256s;
        if (tVar != null) {
            tVar.f4021e = true;
        }
        ThreadLocal threadLocal = RunnableC0257j.f3999o;
        RunnableC0257j runnableC0257j = (RunnableC0257j) threadLocal.get();
        this.f2237f0 = runnableC0257j;
        if (runnableC0257j == null) {
            RunnableC0257j runnableC0257j2 = new RunnableC0257j();
            runnableC0257j2.f4001k = new ArrayList();
            runnableC0257j2.n = new ArrayList();
            this.f2237f0 = runnableC0257j2;
            Field field = G.f187a;
            Display display = getDisplay();
            if (isInEditMode() || display == null) {
                refreshRate = 60.0f;
            } else {
                refreshRate = display.getRefreshRate();
                if (refreshRate < 30.0f) {
                    refreshRate = 60.0f;
                }
            }
            RunnableC0257j runnableC0257j3 = this.f2237f0;
            runnableC0257j3.f4003m = (long) (1.0E9f / refreshRate);
            threadLocal.set(runnableC0257j3);
        }
        this.f2237f0.f4001k.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object obj;
        super.onDetachedFromWindow();
        s sVar = this.f2224N;
        if (sVar != null) {
            sVar.a();
        }
        setScrollState(0);
        D d3 = this.f2236e0;
        d3.f3929q.removeCallbacks(d3);
        d3.f3926m.abortAnimation();
        this.f2259w = false;
        t tVar = this.f2256s;
        if (tVar != null) {
            tVar.f4021e = false;
            tVar.z(this);
        }
        this.f2252p0.clear();
        removeCallbacks(this.f2254q0);
        this.f2249o.getClass();
        do {
            l lVar = M.f3954a;
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
        RunnableC0257j runnableC0257j = this.f2237f0;
        if (runnableC0257j != null) {
            runnableC0257j.f4001k.remove(this);
            this.f2237f0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2257t;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0254g) arrayList.get(i3)).getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f3;
        float axisValue;
        if (this.f2256s != null && !this.f2211A && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.f2256s.c() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f2256s.b() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f2256s.c()) {
                    f3 = -axisValue2;
                } else if (this.f2256s.b()) {
                    axisValue = axisValue2;
                    f3 = 0.0f;
                } else {
                    f3 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f3 = 0.0f;
                axisValue = 0.0f;
            }
            if (f3 != 0.0f || axisValue != 0.0f) {
                q((int) (axisValue * this.f2233b0), (int) (f3 * this.f2234c0), motionEvent);
            }
        }
        return false;
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
                C0254g c0254g = (C0254g) arrayList.get(i3);
                if (c0254g.c(motionEvent) && action != 3) {
                    this.f2258v = c0254g;
                    p();
                    setScrollState(0);
                    return true;
                }
            }
            t tVar = this.f2256s;
            if (tVar != null) {
                boolean zB = tVar.b();
                boolean zC = this.f2256s.c();
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
                    int i4 = zB;
                    if (zC) {
                        i4 = (zB ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i4, 0);
                } else if (actionMasked == 1) {
                    this.f2227Q.clear();
                    s(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f2226P);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2226P + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f2225O != 1) {
                        int i5 = x3 - this.f2228R;
                        int i6 = y3 - this.S;
                        if (!zB || Math.abs(i5) <= this.f2231V) {
                            z3 = false;
                        } else {
                            this.f2229T = x3;
                            z3 = true;
                        }
                        if (zC && Math.abs(i6) > this.f2231V) {
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
        int i7 = c.f4734a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.y = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        t tVar = this.f2256s;
        if (tVar == null) {
            e(i3, i4);
            return;
        }
        if (tVar.y()) {
            View.MeasureSpec.getMode(i3);
            View.MeasureSpec.getMode(i4);
            this.f2256s.f4018b.e(i3, i4);
        } else {
            if (this.x) {
                this.f2256s.f4018b.e(i3, i4);
                return;
            }
            B b3 = this.f2239h0;
            if (b3.f3923e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            b3.getClass();
            this.f2260z++;
            this.f2256s.f4018b.e(i3, i4);
            if (this.f2260z < 1) {
                this.f2260z = 1;
            }
            this.f2260z--;
            b3.f3921c = false;
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
        if (!(parcelable instanceof p035l0.A)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p035l0.A a3 = (p035l0.A) parcelable;
        this.f2244l = a3;
        super.onRestoreInstanceState(a3.f1286k);
        t tVar = this.f2256s;
        if (tVar == null || (parcelable2 = this.f2244l.f3918m) == null) {
            return;
        }
        tVar.B(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        p035l0.A a3 = new p035l0.A(super.onSaveInstanceState());
        p035l0.A a4 = this.f2244l;
        if (a4 != null) {
            a3.f3918m = a4.f3918m;
            return a3;
        }
        t tVar = this.f2256s;
        if (tVar != null) {
            a3.f3918m = tVar.C();
            return a3;
        }
        a3.f3918m = null;
        return a3;
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

    /* JADX WARN: Code duplicated, block: B:100:0x0229  */
    /* JADX WARN: Code duplicated, block: B:101:0x022b  */
    /* JADX WARN: Code duplicated, block: B:103:0x022e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0231  */
    /* JADX WARN: Code duplicated, block: B:107:0x0239 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x023b  */
    /* JADX WARN: Code duplicated, block: B:109:0x023d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0241  */
    /* JADX WARN: Code duplicated, block: B:115:0x0248  */
    /* JADX WARN: Code duplicated, block: B:117:0x0254  */
    /* JADX WARN: Code duplicated, block: B:118:0x0256  */
    /* JADX WARN: Code duplicated, block: B:120:0x0259  */
    /* JADX WARN: Code duplicated, block: B:126:0x026a  */
    /* JADX WARN: Code duplicated, block: B:128:0x027b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0285  */
    /* JADX WARN: Code duplicated, block: B:131:0x0288  */
    /* JADX WARN: Code duplicated, block: B:132:0x0292  */
    /* JADX WARN: Code duplicated, block: B:137:0x029b  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:140:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:145:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:147:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:149:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:151:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:158:0x02db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:161:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:164:0x02e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:169:0x0329  */
    /* JADX WARN: Code duplicated, block: B:171:0x0345  */
    /* JADX WARN: Code duplicated, block: B:178:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0125  */
    /* JADX WARN: Code duplicated, block: B:58:0x012e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0143 A[LOOP:0: B:57:0x012c->B:63:0x0143, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x014c  */
    /* JADX WARN: Code duplicated, block: B:69:0x015a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0170  */
    /* JADX WARN: Code duplicated, block: B:75:0x0181  */
    /* JADX WARN: Code duplicated, block: B:77:0x0185 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0189  */
    /* JADX WARN: Code duplicated, block: B:81:0x018c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191  */
    /* JADX WARN: Code duplicated, block: B:85:0x0196  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:91:0x01db  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:96:0x021d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x021f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0227 A[DONT_INVERT] */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x01c2, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        t tVar;
        boolean zB;
        boolean zC;
        MotionEvent motionEventObtain;
        int actionMasked;
        int actionIndex;
        int[] iArr;
        int i3;
        int i4;
        float f3;
        float f4;
        int i5;
        int i6;
        t tVar2;
        boolean zB2;
        boolean zC2;
        float f5;
        float f6;
        boolean z3;
        int i7;
        int iFindPointerIndex;
        int x;
        int y;
        int i8;
        int i9;
        boolean zF;
        int[] iArr2;
        int i10;
        RunnableC0257j runnableC0257j;
        boolean z4;
        int iAbs;
        int i11;
        int iAbs2;
        int i12;
        ArrayList arrayList;
        int size;
        int i13;
        C0254g c0254g;
        if (!this.f2211A && !this.f2212B) {
            int action = motionEvent.getAction();
            C0254g c0254g2 = this.f2258v;
            if (c0254g2 == null) {
                if (action != 0) {
                    arrayList = this.u;
                    size = arrayList.size();
                    for (i13 = 0; i13 < size; i13++) {
                        c0254g = (C0254g) arrayList.get(i13);
                        if (c0254g.c(motionEvent)) {
                            this.f2258v = c0254g;
                        }
                    }
                }
                tVar = this.f2256s;
                if (tVar != null) {
                    zB = tVar.b();
                    zC = this.f2256s.c();
                    if (this.f2227Q == null) {
                        this.f2227Q = VelocityTracker.obtain();
                    }
                    motionEventObtain = MotionEvent.obtain(motionEvent);
                    actionMasked = motionEvent.getActionMasked();
                    actionIndex = motionEvent.getActionIndex();
                    iArr = this.f2250o0;
                    if (actionMasked == 0) {
                        iArr[1] = 0;
                        iArr[0] = 0;
                    }
                    motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                    if (actionMasked != 0) {
                        if (actionMasked != 1) {
                            this.f2227Q.addMovement(motionEventObtain);
                            VelocityTracker velocityTracker = this.f2227Q;
                            i4 = this.f2232a0;
                            velocityTracker.computeCurrentVelocity(PipesIterator.DEFAULT_QUEUE_SIZE, i4);
                            if (zB) {
                                f3 = -this.f2227Q.getXVelocity(this.f2226P);
                            } else {
                                f3 = 0.0f;
                            }
                            if (zC) {
                                f4 = -this.f2227Q.getYVelocity(this.f2226P);
                            } else {
                                f4 = 0.0f;
                            }
                            if (f3 == 0.0f || f4 != 0.0f) {
                                i5 = (int) f3;
                                i6 = (int) f4;
                                tVar2 = this.f2256s;
                                if (tVar2 == null) {
                                    Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                                } else if (!this.f2211A) {
                                    zB2 = tVar2.b();
                                    zC2 = this.f2256s.c();
                                    int i14 = this.W;
                                    if (zB2 || Math.abs(i5) < i14) {
                                        i5 = 0;
                                    }
                                    if (zC2 || Math.abs(i6) < i14) {
                                        i6 = 0;
                                    }
                                    if (i5 == 0 || i6 != 0) {
                                        f5 = i5;
                                        f6 = i6;
                                        if (!dispatchNestedPreFling(f5, f6)) {
                                            if (!zB2 || zC2) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            dispatchNestedFling(f5, f6, z3);
                                            i7 = zB2;
                                            if (z3) {
                                                if (zC2) {
                                                    i7 = (zB2 ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(i7, 1);
                                                int i15 = -i4;
                                                int iMax = Math.max(i15, Math.min(i5, i4));
                                                int iMax2 = Math.max(i15, Math.min(i6, i4));
                                                D d3 = this.f2236e0;
                                                d3.f3929q.setScrollState(2);
                                                d3.f3925l = 0;
                                                d3.f3924k = 0;
                                                d3.f3926m.fling(0, 0, iMax, iMax2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                d3.a();
                                            }
                                        }
                                    }
                                }
                                setScrollState(0);
                            } else {
                                setScrollState(0);
                            }
                            p();
                        } else if (actionMasked != 2) {
                            iFindPointerIndex = motionEvent.findPointerIndex(this.f2226P);
                            if (iFindPointerIndex < 0) {
                                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2226P + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                            y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                            i8 = this.f2229T - x;
                            i9 = this.f2230U - y;
                            zF = f(i8, i9, 0, this.f2248n0, this.f2247m0);
                            iArr2 = this.f2247m0;
                            if (zF) {
                                int[] iArr3 = this.f2248n0;
                                i8 -= iArr3[0];
                                i9 -= iArr3[1];
                                motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
                                iArr[0] = iArr[0] + iArr2[0];
                                iArr[1] = iArr[1] + iArr2[1];
                            }
                            if (this.f2225O != 1) {
                                if (zB) {
                                    iAbs2 = Math.abs(i8);
                                    i12 = this.f2231V;
                                    if (iAbs2 > i12) {
                                        if (i8 > 0) {
                                            i8 -= i12;
                                        } else {
                                            i8 += i12;
                                        }
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                }
                                if (zC) {
                                    iAbs = Math.abs(i9);
                                    i11 = this.f2231V;
                                    if (iAbs > i11) {
                                        if (i9 > 0) {
                                            i9 -= i11;
                                        } else {
                                            i9 += i11;
                                        }
                                        z4 = true;
                                    }
                                }
                                if (z4) {
                                    setScrollState(1);
                                }
                            }
                            if (this.f2225O == 1) {
                                this.f2229T = x - iArr2[0];
                                this.f2230U = y - iArr2[1];
                                if (zB) {
                                    i10 = i8;
                                } else {
                                    i10 = 0;
                                }
                                q(i10, zC ? i9 : 0, motionEventObtain);
                                runnableC0257j = this.f2237f0;
                                if (runnableC0257j != null && (i8 != 0 || i9 != 0)) {
                                    runnableC0257j.a(this, i8, i9);
                                }
                            }
                        } else if (actionMasked != 3) {
                            p();
                            setScrollState(0);
                        } else if (actionMasked != 5) {
                            this.f2226P = motionEvent.getPointerId(actionIndex);
                            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.f2229T = x3;
                            this.f2228R = x3;
                            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.f2230U = y3;
                            this.S = y3;
                        } else if (actionMasked == 6) {
                            n(motionEvent);
                        }
                        motionEventObtain.recycle();
                        return true;
                    }
                    this.f2226P = motionEvent.getPointerId(0);
                    int x4 = (int) (motionEvent.getX() + 0.5f);
                    this.f2229T = x4;
                    this.f2228R = x4;
                    int y4 = (int) (motionEvent.getY() + 0.5f);
                    this.f2230U = y4;
                    this.S = y4;
                    if (zC) {
                        i3 = zB;
                        i3 = (zB ? 1 : 0) | 2;
                    }
                    i3 = zB;
                    getScrollingChildHelper().g(i3, 0);
                    this.f2227Q.addMovement(motionEventObtain);
                    motionEventObtain.recycle();
                    return true;
                }
            } else if (action == 0) {
                this.f2258v = null;
                if (action != 0) {
                    arrayList = this.u;
                    size = arrayList.size();
                    while (i13 < size) {
                        c0254g = (C0254g) arrayList.get(i13);
                        if (c0254g.c(motionEvent)) {
                            this.f2258v = c0254g;
                        }
                    }
                }
                tVar = this.f2256s;
                if (tVar != null) {
                    zB = tVar.b();
                    zC = this.f2256s.c();
                    if (this.f2227Q == null) {
                        this.f2227Q = VelocityTracker.obtain();
                    }
                    motionEventObtain = MotionEvent.obtain(motionEvent);
                    actionMasked = motionEvent.getActionMasked();
                    actionIndex = motionEvent.getActionIndex();
                    iArr = this.f2250o0;
                    if (actionMasked == 0) {
                        iArr[1] = 0;
                        iArr[0] = 0;
                    }
                    motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                    if (actionMasked != 0) {
                        if (actionMasked != 1) {
                            this.f2227Q.addMovement(motionEventObtain);
                            VelocityTracker velocityTracker2 = this.f2227Q;
                            i4 = this.f2232a0;
                            velocityTracker2.computeCurrentVelocity(PipesIterator.DEFAULT_QUEUE_SIZE, i4);
                            if (zB) {
                                f3 = -this.f2227Q.getXVelocity(this.f2226P);
                            } else {
                                f3 = 0.0f;
                            }
                            if (zC) {
                                f4 = -this.f2227Q.getYVelocity(this.f2226P);
                            } else {
                                f4 = 0.0f;
                            }
                            if (f3 == 0.0f) {
                                i5 = (int) f3;
                                i6 = (int) f4;
                                tVar2 = this.f2256s;
                                if (tVar2 == null) {
                                    Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                                } else if (!this.f2211A) {
                                    zB2 = tVar2.b();
                                    zC2 = this.f2256s.c();
                                    int i16 = this.W;
                                    if (zB2) {
                                        i5 = 0;
                                    } else {
                                        i5 = 0;
                                    }
                                    if (zC2) {
                                        i6 = 0;
                                    } else {
                                        i6 = 0;
                                    }
                                    if (i5 == 0) {
                                        f5 = i5;
                                        f6 = i6;
                                        if (!dispatchNestedPreFling(f5, f6)) {
                                            if (zB2) {
                                                z3 = true;
                                            } else {
                                                z3 = true;
                                            }
                                            dispatchNestedFling(f5, f6, z3);
                                            i7 = zB2;
                                            if (z3) {
                                                if (zC2) {
                                                    i7 = (zB2 ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(i7, 1);
                                                int i17 = -i4;
                                                int iMax3 = Math.max(i17, Math.min(i5, i4));
                                                int iMax4 = Math.max(i17, Math.min(i6, i4));
                                                D d4 = this.f2236e0;
                                                d4.f3929q.setScrollState(2);
                                                d4.f3925l = 0;
                                                d4.f3924k = 0;
                                                d4.f3926m.fling(0, 0, iMax3, iMax4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                d4.a();
                                            }
                                        }
                                    } else {
                                        f5 = i5;
                                        f6 = i6;
                                        if (!dispatchNestedPreFling(f5, f6)) {
                                            if (zB2) {
                                                z3 = true;
                                            } else {
                                                z3 = true;
                                            }
                                            dispatchNestedFling(f5, f6, z3);
                                            i7 = zB2;
                                            if (z3) {
                                                if (zC2) {
                                                    i7 = (zB2 ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(i7, 1);
                                                int i18 = -i4;
                                                int iMax5 = Math.max(i18, Math.min(i5, i4));
                                                int iMax6 = Math.max(i18, Math.min(i6, i4));
                                                D d5 = this.f2236e0;
                                                d5.f3929q.setScrollState(2);
                                                d5.f3925l = 0;
                                                d5.f3924k = 0;
                                                d5.f3926m.fling(0, 0, iMax5, iMax6, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                d5.a();
                                            }
                                        }
                                    }
                                }
                                setScrollState(0);
                            } else {
                                i5 = (int) f3;
                                i6 = (int) f4;
                                tVar2 = this.f2256s;
                                if (tVar2 == null) {
                                    Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                                } else if (!this.f2211A) {
                                    zB2 = tVar2.b();
                                    zC2 = this.f2256s.c();
                                    int i19 = this.W;
                                    if (zB2) {
                                        i5 = 0;
                                    } else {
                                        i5 = 0;
                                    }
                                    if (zC2) {
                                        i6 = 0;
                                    } else {
                                        i6 = 0;
                                    }
                                    if (i5 == 0) {
                                        f5 = i5;
                                        f6 = i6;
                                        if (!dispatchNestedPreFling(f5, f6)) {
                                            if (zB2) {
                                                z3 = true;
                                            } else {
                                                z3 = true;
                                            }
                                            dispatchNestedFling(f5, f6, z3);
                                            i7 = zB2;
                                            if (z3) {
                                                if (zC2) {
                                                    i7 = (zB2 ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(i7, 1);
                                                int i110 = -i4;
                                                int iMax7 = Math.max(i110, Math.min(i5, i4));
                                                int iMax8 = Math.max(i110, Math.min(i6, i4));
                                                D d6 = this.f2236e0;
                                                d6.f3929q.setScrollState(2);
                                                d6.f3925l = 0;
                                                d6.f3924k = 0;
                                                d6.f3926m.fling(0, 0, iMax7, iMax8, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                d6.a();
                                            }
                                        }
                                    } else {
                                        f5 = i5;
                                        f6 = i6;
                                        if (!dispatchNestedPreFling(f5, f6)) {
                                            if (zB2) {
                                                z3 = true;
                                            } else {
                                                z3 = true;
                                            }
                                            dispatchNestedFling(f5, f6, z3);
                                            i7 = zB2;
                                            if (z3) {
                                                if (zC2) {
                                                    i7 = (zB2 ? 1 : 0) | 2;
                                                }
                                                getScrollingChildHelper().g(i7, 1);
                                                int i111 = -i4;
                                                int iMax9 = Math.max(i111, Math.min(i5, i4));
                                                int iMax10 = Math.max(i111, Math.min(i6, i4));
                                                D d7 = this.f2236e0;
                                                d7.f3929q.setScrollState(2);
                                                d7.f3925l = 0;
                                                d7.f3924k = 0;
                                                d7.f3926m.fling(0, 0, iMax9, iMax10, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
                                                d7.a();
                                            }
                                        }
                                    }
                                }
                                setScrollState(0);
                            }
                            p();
                        } else if (actionMasked != 2) {
                            iFindPointerIndex = motionEvent.findPointerIndex(this.f2226P);
                            if (iFindPointerIndex < 0) {
                                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2226P + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                            y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                            i8 = this.f2229T - x;
                            i9 = this.f2230U - y;
                            zF = f(i8, i9, 0, this.f2248n0, this.f2247m0);
                            iArr2 = this.f2247m0;
                            if (zF) {
                                int[] iArr4 = this.f2248n0;
                                i8 -= iArr4[0];
                                i9 -= iArr4[1];
                                motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
                                iArr[0] = iArr[0] + iArr2[0];
                                iArr[1] = iArr[1] + iArr2[1];
                            }
                            if (this.f2225O != 1) {
                                if (zB) {
                                    iAbs2 = Math.abs(i8);
                                    i12 = this.f2231V;
                                    if (iAbs2 > i12) {
                                        if (i8 > 0) {
                                            i8 -= i12;
                                        } else {
                                            i8 += i12;
                                        }
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                }
                                if (zC) {
                                    iAbs = Math.abs(i9);
                                    i11 = this.f2231V;
                                    if (iAbs > i11) {
                                        if (i9 > 0) {
                                            i9 -= i11;
                                        } else {
                                            i9 += i11;
                                        }
                                        z4 = true;
                                    }
                                }
                                if (z4) {
                                    setScrollState(1);
                                }
                            }
                            if (this.f2225O == 1) {
                                this.f2229T = x - iArr2[0];
                                this.f2230U = y - iArr2[1];
                                if (zB) {
                                    i10 = i8;
                                } else {
                                    i10 = 0;
                                }
                                q(i10, zC ? i9 : 0, motionEventObtain);
                                runnableC0257j = this.f2237f0;
                                if (runnableC0257j != null) {
                                    runnableC0257j.a(this, i8, i9);
                                }
                            }
                        } else if (actionMasked != 3) {
                            p();
                            setScrollState(0);
                        } else if (actionMasked != 5) {
                            this.f2226P = motionEvent.getPointerId(actionIndex);
                            int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.f2229T = x5;
                            this.f2228R = x5;
                            int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.f2230U = y5;
                            this.S = y5;
                        } else if (actionMasked == 6) {
                            n(motionEvent);
                        }
                        motionEventObtain.recycle();
                        return true;
                    }
                    this.f2226P = motionEvent.getPointerId(0);
                    int x6 = (int) (motionEvent.getX() + 0.5f);
                    this.f2229T = x6;
                    this.f2228R = x6;
                    int y6 = (int) (motionEvent.getY() + 0.5f);
                    this.f2230U = y6;
                    this.S = y6;
                    if (zC) {
                        i3 = zB;
                        i3 = (zB ? 1 : 0) | 2;
                    }
                    i3 = zB;
                    getScrollingChildHelper().g(i3, 0);
                    this.f2227Q.addMovement(motionEventObtain);
                    motionEventObtain.recycle();
                    return true;
                }
            } else {
                int i20 = c0254g2.f3970a;
                if (c0254g2.f3985q != 0) {
                    if (motionEvent.getAction() == 0) {
                        boolean zB3 = c0254g2.b(motionEvent.getX(), motionEvent.getY());
                        boolean zA = c0254g2.a(motionEvent.getX(), motionEvent.getY());
                        if (zB3 || zA) {
                            if (zA) {
                                c0254g2.f3986r = 1;
                                c0254g2.f3980k = (int) motionEvent.getX();
                            } else if (zB3) {
                                c0254g2.f3986r = 2;
                                c0254g2.f3979j = (int) motionEvent.getY();
                            }
                            c0254g2.e(2);
                        }
                    } else if (motionEvent.getAction() == 1 && c0254g2.f3985q == 2) {
                        c0254g2.f3979j = 0.0f;
                        c0254g2.f3980k = 0.0f;
                        c0254g2.e(1);
                        c0254g2.f3986r = 0;
                    } else if (motionEvent.getAction() == 2 && c0254g2.f3985q == 2) {
                        c0254g2.f();
                        if (c0254g2.f3986r == 1) {
                            float x7 = motionEvent.getX();
                            int[] iArr5 = c0254g2.f3988t;
                            iArr5[0] = i20;
                            int i21 = c0254g2.f3981l - i20;
                            iArr5[1] = i21;
                            float fMax = Math.max(i20, Math.min(i21, x7));
                            if (Math.abs(0 - fMax) >= 2.0f) {
                                float f7 = c0254g2.f3980k;
                                int iComputeHorizontalScrollRange = c0254g2.n.computeHorizontalScrollRange();
                                c0254g2.n.computeHorizontalScrollOffset();
                                int iD = C0254g.d(f7, fMax, iArr5, iComputeHorizontalScrollRange, 0, c0254g2.f3981l);
                                if (iD != 0) {
                                    c0254g2.n.scrollBy(iD, 0);
                                }
                                c0254g2.f3980k = fMax;
                            }
                        }
                        if (c0254g2.f3986r == 2) {
                            float y7 = motionEvent.getY();
                            int[] iArr6 = c0254g2.f3987s;
                            iArr6[0] = i20;
                            int i22 = c0254g2.f3982m - i20;
                            iArr6[1] = i22;
                            float fMax2 = Math.max(i20, Math.min(i22, y7));
                            if (Math.abs(0 - fMax2) >= 2.0f) {
                                float f8 = c0254g2.f3979j;
                                int iComputeVerticalScrollRange = c0254g2.n.computeVerticalScrollRange();
                                c0254g2.n.computeVerticalScrollOffset();
                                int iD2 = C0254g.d(f8, fMax2, iArr6, iComputeVerticalScrollRange, 0, c0254g2.f3982m);
                                if (iD2 != 0) {
                                    c0254g2.n.scrollBy(0, iD2);
                                }
                                c0254g2.f3979j = fMax2;
                            }
                        }
                    }
                }
                if (action == 3 || action == 1) {
                    this.f2258v = null;
                }
            }
            p();
            setScrollState(0);
            return true;
        }
        return false;
    }

    public final void p() {
        VelocityTracker velocityTracker = this.f2227Q;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        s(0);
        EdgeEffect edgeEffect = this.f2220J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f2220J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2221K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f2221K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2222L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f2222L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f2223M;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f2223M.isFinished();
        }
        if (zIsFinished) {
            Field field = G.f187a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x011a  */
    /* JADX WARN: Code duplicated, block: B:42:0x011f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0133  */
    /* JADX WARN: Code duplicated, block: B:45:0x0153  */
    /* JADX WARN: Code duplicated, block: B:47:0x0171  */
    /* JADX WARN: Code duplicated, block: B:49:0x0175  */
    /* JADX WARN: Code duplicated, block: B:52:0x017a  */
    /* JADX WARN: Code duplicated, block: B:54:0x018e  */
    /* JADX WARN: Code duplicated, block: B:55:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:57:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d6  */
    public final void q(int i3, int i4, MotionEvent motionEvent) {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        d();
        if (!this.f2257t.isEmpty()) {
            invalidate();
        }
        int[] iArr = this.f2247m0;
        boolean z3 = false;
        boolean z4 = true;
        if (g(iArr, 0)) {
            int i5 = this.f2229T;
            int i6 = iArr[0];
            this.f2229T = i5 - i6;
            int i7 = this.f2230U;
            int i8 = iArr[1];
            this.f2230U = i7 - i8;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i6, i8);
            }
            int[] iArr2 = this.f2250o0;
            iArr2[0] = iArr2[0] + iArr[0];
            iArr2[1] = iArr2[1] + iArr[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                float x = motionEvent.getX();
                float f3 = 0;
                float y = motionEvent.getY();
                if (f3 < 0.0f) {
                    if (this.f2220J == null) {
                        this.f2219I.getClass();
                        EdgeEffect edgeEffect3 = new EdgeEffect(getContext());
                        this.f2220J = edgeEffect3;
                        if (this.f2251p) {
                            edgeEffect3.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect3.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    this.f2220J.onPull((-f3) / getWidth(), 1.0f - (y / getHeight()));
                } else if (f3 <= 0.0f) {
                    if (f3 < 0.0f) {
                        if (this.f2221K == null) {
                            this.f2219I.getClass();
                            edgeEffect2 = new EdgeEffect(getContext());
                            this.f2221K = edgeEffect2;
                            if (this.f2251p) {
                                edgeEffect2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect2.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        this.f2221K.onPull((-f3) / getHeight(), x / getWidth());
                    } else if (f3 > 0.0f) {
                        if (this.f2223M == null) {
                            this.f2219I.getClass();
                            edgeEffect = new EdgeEffect(getContext());
                            this.f2223M = edgeEffect;
                            if (this.f2251p) {
                                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                            } else {
                                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
                            }
                        }
                        this.f2223M.onPull(f3 / getHeight(), 1.0f - (x / getWidth()));
                    } else {
                        z4 = z3;
                    }
                    if (z4 || f3 != 0.0f || f3 != 0.0f) {
                        Field field = G.f187a;
                        postInvalidateOnAnimation();
                    }
                } else {
                    if (this.f2222L == null) {
                        this.f2219I.getClass();
                        EdgeEffect edgeEffect4 = new EdgeEffect(getContext());
                        this.f2222L = edgeEffect4;
                        if (this.f2251p) {
                            edgeEffect4.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                        } else {
                            edgeEffect4.setSize(getMeasuredHeight(), getMeasuredWidth());
                        }
                    }
                    this.f2222L.onPull(f3 / getWidth(), y / getHeight());
                }
                z3 = true;
                if (f3 < 0.0f) {
                    if (this.f2221K == null) {
                        this.f2219I.getClass();
                        edgeEffect2 = new EdgeEffect(getContext());
                        this.f2221K = edgeEffect2;
                        if (this.f2251p) {
                            edgeEffect2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                        } else {
                            edgeEffect2.setSize(getMeasuredWidth(), getMeasuredHeight());
                        }
                    }
                    this.f2221K.onPull((-f3) / getHeight(), x / getWidth());
                } else if (f3 > 0.0f) {
                    if (this.f2223M == null) {
                        this.f2219I.getClass();
                        edgeEffect = new EdgeEffect(getContext());
                        this.f2223M = edgeEffect;
                        if (this.f2251p) {
                            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
                        } else {
                            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
                        }
                    }
                    this.f2223M.onPull(f3 / getHeight(), 1.0f - (x / getWidth()));
                } else {
                    z4 = z3;
                }
                if (z4) {
                    Field field2 = G.f187a;
                    postInvalidateOnAnimation();
                } else {
                    Field field3 = G.f187a;
                    postInvalidateOnAnimation();
                }
            }
            c(i3, i4);
        }
        if (awakenScrollBars()) {
            return;
        }
        invalidate();
    }

    public final void r(int i3, int i4) {
        int iRound;
        t tVar = this.f2256s;
        if (tVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2211A) {
            return;
        }
        int i5 = !tVar.b() ? 0 : i3;
        int i6 = !this.f2256s.c() ? 0 : i4;
        if (i5 == 0 && i6 == 0) {
            return;
        }
        D d3 = this.f2236e0;
        RecyclerView recyclerView = d3.f3929q;
        int iAbs = Math.abs(i5);
        int iAbs2 = Math.abs(i6);
        boolean z3 = iAbs > iAbs2;
        int iSqrt = (int) Math.sqrt(0);
        int iSqrt2 = (int) Math.sqrt((i6 * i6) + (i5 * i5));
        int width = z3 ? recyclerView.getWidth() : recyclerView.getHeight();
        int i7 = width / 2;
        float f3 = width;
        float f4 = i7;
        float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f3) - 0.5f) * 0.47123894f)) * f4) + f4;
        if (iSqrt > 0) {
            iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
        } else {
            if (!z3) {
                iAbs = iAbs2;
            }
            iRound = (int) (((iAbs / f3) + 1.0f) * 300.0f);
        }
        int iMin = Math.min(iRound, 2000);
        Interpolator interpolator = d3.n;
        o oVar = f2210u0;
        if (interpolator != oVar) {
            d3.n = oVar;
            d3.f3926m = new OverScroller(recyclerView.getContext(), oVar);
        }
        recyclerView.setScrollState(2);
        d3.f3925l = 0;
        d3.f3924k = 0;
        d3.f3926m.startScroll(0, 0, i5, i6, iMin);
        d3.a();
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
            ((C0254g) arrayList.get(i3)).getClass();
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
        t tVar = this.f2256s;
        if (tVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f2211A) {
            return;
        }
        boolean zB = tVar.b();
        boolean zC = this.f2256s.c();
        if (zB || zC) {
            if (!zB) {
                i3 = 0;
            }
            if (!zC) {
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

    public void setAccessibilityDelegateCompat(F f3) {
        this.f2243k0 = f3;
        G.c(this, f3);
    }

    public void setAdapter(p pVar) {
        setLayoutFrozen(false);
        s sVar = this.f2224N;
        if (sVar != null) {
            sVar.a();
        }
        t tVar = this.f2256s;
        C0220c c0220c = this.f2242k;
        if (tVar != null) {
            tVar.E();
            this.f2256s.F(c0220c);
        }
        ((ArrayList) c0220c.f3170m).clear();
        ArrayList arrayList = (ArrayList) c0220c.n;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            arrayList.get(size).getClass();
            throw new ClassCastException();
        }
        arrayList.clear();
        C0255h c0255h = ((RecyclerView) c0220c.f3172p).f2238g0;
        c0255h.getClass();
        c0255h.f3993c = 0;
        j jVar = this.f2246m;
        jVar.K((ArrayList) jVar.f58m);
        jVar.K((ArrayList) jVar.n);
        ArrayList arrayList2 = (ArrayList) c0220c.f3170m;
        RecyclerView recyclerView = (RecyclerView) c0220c.f3172p;
        ArrayList arrayList3 = (ArrayList) c0220c.n;
        arrayList2.clear();
        int size2 = arrayList3.size() - 1;
        if (size2 >= 0) {
            arrayList3.get(size2).getClass();
            throw new ClassCastException();
        }
        arrayList3.clear();
        C0255h c0255h2 = recyclerView.f2238g0;
        c0255h2.getClass();
        c0255h2.f3993c = 0;
        if (((y) c0220c.f3171o) == null) {
            y yVar = new y();
            yVar.f4026a = new SparseArray();
            yVar.f4027b = 0;
            c0220c.f3171o = yVar;
        }
        y yVar2 = (y) c0220c.f3171o;
        if (yVar2.f4027b == 0) {
            SparseArray sparseArray = yVar2.f4026a;
            if (sparseArray.size() > 0) {
                ((x) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f2239h0.f3920b = true;
        this.f2216F = this.f2216F;
        this.f2215E = true;
        int iB = this.n.B();
        for (int i3 = 0; i3 < iB; i3++) {
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
        C0255h c0255h3 = recyclerView.f2238g0;
        c0255h3.getClass();
        c0255h3.f3993c = 0;
        requestLayout();
    }

    public void setChildDrawingOrderCallback(q qVar) {
        if (qVar == null) {
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

    public void setEdgeEffectFactory(r rVar) {
        rVar.getClass();
        this.f2219I = rVar;
        this.f2223M = null;
        this.f2221K = null;
        this.f2222L = null;
        this.f2220J = null;
    }

    public void setHasFixedSize(boolean z3) {
        this.x = z3;
    }

    public void setItemAnimator(s sVar) {
        s sVar2 = this.f2224N;
        if (sVar2 != null) {
            sVar2.a();
            this.f2224N.f4013a = null;
        }
        this.f2224N = sVar;
        if (sVar != null) {
            sVar.f4013a = this.f2241j0;
        }
    }

    public void setItemViewCacheSize(int i3) {
        C0220c c0220c = this.f2242k;
        c0220c.f3168k = i3;
        c0220c.c();
    }

    public void setLayoutFrozen(boolean z3) {
        if (z3 != this.f2211A) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z3) {
                this.f2211A = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2211A = true;
            this.f2212B = true;
            setScrollState(0);
            D d3 = this.f2236e0;
            d3.f3929q.removeCallbacks(d3);
            d3.f3926m.abortAnimation();
        }
    }

    public void setLayoutManager(t tVar) {
        if (tVar == this.f2256s) {
            return;
        }
        setScrollState(0);
        D d3 = this.f2236e0;
        d3.f3929q.removeCallbacks(d3);
        d3.f3926m.abortAnimation();
        t tVar2 = this.f2256s;
        C0220c c0220c = this.f2242k;
        if (tVar2 != null) {
            s sVar = this.f2224N;
            if (sVar != null) {
                sVar.a();
            }
            this.f2256s.E();
            this.f2256s.F(c0220c);
            ((ArrayList) c0220c.f3170m).clear();
            ArrayList arrayList = (ArrayList) c0220c.n;
            int size = arrayList.size() - 1;
            if (size >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
            arrayList.clear();
            C0255h c0255h = ((RecyclerView) c0220c.f3172p).f2238g0;
            c0255h.getClass();
            c0255h.f3993c = 0;
            if (this.f2259w) {
                t tVar3 = this.f2256s;
                tVar3.f4021e = false;
                tVar3.z(this);
            }
            this.f2256s.I(null);
            this.f2256s = null;
        } else {
            ((ArrayList) c0220c.f3170m).clear();
            ArrayList arrayList2 = (ArrayList) c0220c.n;
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                arrayList2.get(size2).getClass();
                throw new ClassCastException();
            }
            arrayList2.clear();
            C0255h c0255h2 = ((RecyclerView) c0220c.f3172p).f2238g0;
            c0255h2.getClass();
            c0255h2.f3993c = 0;
        }
        j jVar = this.n;
        g gVar = (g) jVar.f57l;
        ((C0249b) jVar.f58m).c();
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
        this.f2256s = tVar;
        if (tVar != null) {
            if (tVar.f4018b != null) {
                throw new IllegalArgumentException("LayoutManager " + tVar + " is already attached to a RecyclerView:" + tVar.f4018b.h());
            }
            tVar.I(this);
            if (this.f2259w) {
                this.f2256s.f4021e = true;
            }
        }
        c0220c.c();
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

    public void setRecycledViewPool(y yVar) {
        C0220c c0220c = this.f2242k;
        y yVar2 = (y) c0220c.f3171o;
        if (yVar2 != null) {
            yVar2.f4027b--;
        }
        c0220c.f3171o = yVar;
        if (yVar != null) {
            ((RecyclerView) c0220c.f3172p).getAdapter();
        }
    }

    public void setScrollState(int i3) {
        if (i3 == this.f2225O) {
            return;
        }
        this.f2225O = i3;
        if (i3 != 2) {
            D d3 = this.f2236e0;
            d3.f3929q.removeCallbacks(d3);
            d3.f3926m.abortAnimation();
        }
        t tVar = this.f2256s;
        if (tVar != null) {
            tVar.D(i3);
        }
        ArrayList arrayList = this.f2240i0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((w) this.f2240i0.get(size)).getClass();
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

    public void setViewCacheExtension(C c3) {
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
        t tVar = this.f2256s;
        if (tVar != null) {
            return tVar.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public void setOnFlingListener(v vVar) {
    }

    @Deprecated
    public void setOnScrollListener(w wVar) {
    }

    public void setRecyclerListener(z zVar) {
    }
}
