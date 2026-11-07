package androidx.recyclerview.widget;

import A.b;
import B1.g;
import D.G;
import M1.A;
import S0.a;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import d0.AbstractC0231b;
import io.flutter.plugin.platform.C0311c;
import java.lang.reflect.Field;
import java.util.BitSet;
import l0.AbstractC0410t;
import l0.C0379B;
import l0.C0384G;
import l0.C0386I;
import l0.C0387J;
import l0.C0402l;
import l0.C0411u;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0410t {

    /* renamed from: h, reason: collision with root package name */
    public final int f2261h;

    /* renamed from: i, reason: collision with root package name */
    public final C0387J[] f2262i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0231b f2263j;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0231b f2264k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2265l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f2266m;
    public final boolean n = false;

    /* renamed from: o, reason: collision with root package name */
    public final g f2267o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2268p;

    /* renamed from: q, reason: collision with root package name */
    public C0386I f2269q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f2270r;

    /* renamed from: s, reason: collision with root package name */
    public final b f2271s;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f2261h = -1;
        this.f2266m = false;
        g gVar = new g(17);
        this.f2267o = gVar;
        this.f2268p = 2;
        new Rect();
        new A(this, 25);
        this.f2270r = true;
        this.f2271s = new b(this, 14);
        C0402l w3 = AbstractC0410t.w(context, attributeSet, i3, i4);
        int i5 = w3.f4005b;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i5 != this.f2265l) {
            this.f2265l = i5;
            AbstractC0231b abstractC0231b = this.f2263j;
            this.f2263j = this.f2264k;
            this.f2264k = abstractC0231b;
            H();
        }
        int i6 = w3.f4006c;
        a(null);
        if (i6 != this.f2261h) {
            gVar.f90l = null;
            H();
            this.f2261h = i6;
            new BitSet(this.f2261h);
            this.f2262i = new C0387J[this.f2261h];
            for (int i7 = 0; i7 < this.f2261h; i7++) {
                this.f2262i[i7] = new C0387J(this, i7);
            }
            H();
        }
        boolean z3 = w3.f4007d;
        a(null);
        C0386I c0386i = this.f2269q;
        if (c0386i != null && c0386i.f3941r != z3) {
            c0386i.f3941r = z3;
        }
        this.f2266m = z3;
        H();
        this.f2263j = AbstractC0231b.a(this, this.f2265l);
        this.f2264k = AbstractC0231b.a(this, 1 - this.f2265l);
    }

    @Override // l0.AbstractC0410t
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View M2 = M(false);
            View L2 = L(false);
            if (M2 == null || L2 == null) {
                return;
            }
            ((C0411u) M2.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // l0.AbstractC0410t
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0386I) {
            this.f2269q = (C0386I) parcelable;
            H();
        }
    }

    @Override // l0.AbstractC0410t
    public final Parcelable C() {
        C0386I c0386i = this.f2269q;
        if (c0386i != null) {
            C0386I c0386i2 = new C0386I();
            c0386i2.f3937m = c0386i.f3937m;
            c0386i2.f3935k = c0386i.f3935k;
            c0386i2.f3936l = c0386i.f3936l;
            c0386i2.n = c0386i.n;
            c0386i2.f3938o = c0386i.f3938o;
            c0386i2.f3939p = c0386i.f3939p;
            c0386i2.f3941r = c0386i.f3941r;
            c0386i2.f3942s = c0386i.f3942s;
            c0386i2.f3943t = c0386i.f3943t;
            c0386i2.f3940q = c0386i.f3940q;
            return c0386i2;
        }
        C0386I c0386i3 = new C0386I();
        c0386i3.f3941r = this.f2266m;
        c0386i3.f3942s = false;
        c0386i3.f3943t = false;
        c0386i3.f3938o = 0;
        if (p() <= 0) {
            c0386i3.f3935k = -1;
            c0386i3.f3936l = -1;
            c0386i3.f3937m = 0;
            return c0386i3;
        }
        N();
        c0386i3.f3935k = 0;
        View L2 = this.n ? L(true) : M(true);
        if (L2 != null) {
            ((C0411u) L2.getLayoutParams()).getClass();
            throw null;
        }
        c0386i3.f3936l = -1;
        int i3 = this.f2261h;
        c0386i3.f3937m = i3;
        c0386i3.n = new int[i3];
        for (int i4 = 0; i4 < this.f2261h; i4++) {
            C0387J c0387j = this.f2262i[i4];
            int i5 = c0387j.f3945b;
            if (i5 == Integer.MIN_VALUE) {
                if (c0387j.f3944a.size() == 0) {
                    i5 = Integer.MIN_VALUE;
                } else {
                    View view = (View) c0387j.f3944a.get(0);
                    C0384G c0384g = (C0384G) view.getLayoutParams();
                    c0387j.f3945b = c0387j.f3948e.f2263j.c(view);
                    c0384g.getClass();
                    i5 = c0387j.f3945b;
                }
            }
            if (i5 != Integer.MIN_VALUE) {
                i5 -= this.f2263j.e();
            }
            c0386i3.n[i4] = i5;
        }
        return c0386i3;
    }

    @Override // l0.AbstractC0410t
    public final void D(int i3) {
        if (i3 == 0) {
            J();
        }
    }

    public final boolean J() {
        if (p() == 0 || this.f2268p == 0 || !this.f4021e) {
            return false;
        }
        boolean z3 = this.n;
        if (z3) {
            O();
            N();
        } else {
            N();
            O();
        }
        int p3 = p();
        int i3 = p3 - 1;
        int i4 = this.f2261h;
        new BitSet(i4).set(0, i4, true);
        if (this.f2265l == 1) {
            RecyclerView recyclerView = this.f4018b;
            Field field = G.f187a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z3) {
            p3 = -1;
        } else {
            i3 = 0;
        }
        if (i3 == p3) {
            return false;
        }
        ((C0384G) o(i3).getLayoutParams()).getClass();
        throw null;
    }

    public final void K(C0379B c0379b) {
        if (p() == 0) {
            return;
        }
        boolean z3 = !this.f2270r;
        View M2 = M(z3);
        View L2 = L(z3);
        if (p() == 0 || c0379b.a() == 0 || M2 == null || L2 == null) {
            return;
        }
        ((C0411u) M2.getLayoutParams()).getClass();
        throw null;
    }

    public final View L(boolean z3) {
        int e3 = this.f2263j.e();
        int d3 = this.f2263j.d();
        View view = null;
        for (int p3 = p() - 1; p3 >= 0; p3--) {
            View o2 = o(p3);
            int c3 = this.f2263j.c(o2);
            int b3 = this.f2263j.b(o2);
            if (b3 > e3 && c3 < d3) {
                if (b3 <= d3 || !z3) {
                    return o2;
                }
                if (view == null) {
                    view = o2;
                }
            }
        }
        return view;
    }

    public final View M(boolean z3) {
        int e3 = this.f2263j.e();
        int d3 = this.f2263j.d();
        int p3 = p();
        View view = null;
        for (int i3 = 0; i3 < p3; i3++) {
            View o2 = o(i3);
            int c3 = this.f2263j.c(o2);
            if (this.f2263j.b(o2) > e3 && c3 < d3) {
                if (c3 >= e3 || !z3) {
                    return o2;
                }
                if (view == null) {
                    view = o2;
                }
            }
        }
        return view;
    }

    public final void N() {
        if (p() == 0) {
            return;
        }
        AbstractC0410t.v(o(0));
        throw null;
    }

    public final void O() {
        int p3 = p();
        if (p3 == 0) {
            return;
        }
        AbstractC0410t.v(o(p3 - 1));
        throw null;
    }

    @Override // l0.AbstractC0410t
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f2269q != null || (recyclerView = this.f4018b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // l0.AbstractC0410t
    public final boolean b() {
        return this.f2265l == 0;
    }

    @Override // l0.AbstractC0410t
    public final boolean c() {
        return this.f2265l == 1;
    }

    @Override // l0.AbstractC0410t
    public final boolean d(C0411u c0411u) {
        return c0411u instanceof C0384G;
    }

    @Override // l0.AbstractC0410t
    public final int f(C0379B c0379b) {
        if (p() == 0) {
            return 0;
        }
        boolean z3 = !this.f2270r;
        return a.g(c0379b, this.f2263j, M(z3), L(z3), this, this.f2270r);
    }

    @Override // l0.AbstractC0410t
    public final void g(C0379B c0379b) {
        K(c0379b);
    }

    @Override // l0.AbstractC0410t
    public final int h(C0379B c0379b) {
        if (p() == 0) {
            return 0;
        }
        boolean z3 = !this.f2270r;
        return a.h(c0379b, this.f2263j, M(z3), L(z3), this, this.f2270r);
    }

    @Override // l0.AbstractC0410t
    public final int i(C0379B c0379b) {
        if (p() == 0) {
            return 0;
        }
        boolean z3 = !this.f2270r;
        return a.g(c0379b, this.f2263j, M(z3), L(z3), this, this.f2270r);
    }

    @Override // l0.AbstractC0410t
    public final void j(C0379B c0379b) {
        K(c0379b);
    }

    @Override // l0.AbstractC0410t
    public final int k(C0379B c0379b) {
        if (p() == 0) {
            return 0;
        }
        boolean z3 = !this.f2270r;
        return a.h(c0379b, this.f2263j, M(z3), L(z3), this, this.f2270r);
    }

    @Override // l0.AbstractC0410t
    public final C0411u l() {
        return this.f2265l == 0 ? new C0384G(-2, -1) : new C0384G(-1, -2);
    }

    @Override // l0.AbstractC0410t
    public final C0411u m(Context context, AttributeSet attributeSet) {
        return new C0384G(context, attributeSet);
    }

    @Override // l0.AbstractC0410t
    public final C0411u n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0384G((ViewGroup.MarginLayoutParams) layoutParams) : new C0384G(layoutParams);
    }

    @Override // l0.AbstractC0410t
    public final int q(C0311c c0311c, C0379B c0379b) {
        if (this.f2265l == 1) {
            return this.f2261h;
        }
        super.q(c0311c, c0379b);
        return 1;
    }

    @Override // l0.AbstractC0410t
    public final int x(C0311c c0311c, C0379B c0379b) {
        if (this.f2265l == 0) {
            return this.f2261h;
        }
        super.x(c0311c, c0379b);
        return 1;
    }

    @Override // l0.AbstractC0410t
    public final boolean y() {
        return this.f2268p != 0;
    }

    @Override // l0.AbstractC0410t
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4018b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2271s);
        }
        for (int i3 = 0; i3 < this.f2261h; i3++) {
            C0387J c0387j = this.f2262i[i3];
            c0387j.f3944a.clear();
            c0387j.f3945b = Integer.MIN_VALUE;
            c0387j.f3946c = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}
