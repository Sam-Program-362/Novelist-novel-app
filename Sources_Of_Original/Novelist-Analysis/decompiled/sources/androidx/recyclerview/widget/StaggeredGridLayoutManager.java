package androidx.recyclerview.widget;

import B1.g;
import M1.A;
import S0.a;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import io.flutter.plugin.platform.C0220c;
import java.lang.reflect.Field;
import java.util.BitSet;
import p008d0.b;
import p035l0.B;
import p035l0.C0259l;
import p035l0.G;
import p035l0.I;
import p035l0.J;
import p035l0.t;
import p035l0.u;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final J[] f2262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f2263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f2264k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2265l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f2266m;
    public final boolean n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g f2267o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2268p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public I f2269q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f2270r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final A.b f2271s;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f2261h = -1;
        this.f2266m = false;
        g gVar = new g(17);
        this.f2267o = gVar;
        this.f2268p = 2;
        new Rect();
        new A(this, 25);
        this.f2270r = true;
        this.f2271s = new A.b(this, 14);
        C0259l c0259lW = t.w(context, attributeSet, i3, i4);
        int i5 = c0259lW.f4005b;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (i5 != this.f2265l) {
            this.f2265l = i5;
            b bVar = this.f2263j;
            this.f2263j = this.f2264k;
            this.f2264k = bVar;
            H();
        }
        int i6 = c0259lW.f4006c;
        a(null);
        if (i6 != this.f2261h) {
            gVar.f90l = null;
            H();
            this.f2261h = i6;
            new BitSet(this.f2261h);
            this.f2262i = new J[this.f2261h];
            for (int i7 = 0; i7 < this.f2261h; i7++) {
                this.f2262i[i7] = new J(this, i7);
            }
            H();
        }
        boolean z3 = c0259lW.f4007d;
        a(null);
        I i8 = this.f2269q;
        if (i8 != null && i8.f3941r != z3) {
            i8.f3941r = z3;
        }
        this.f2266m = z3;
        H();
        this.f2263j = b.a(this, this.f2265l);
        this.f2264k = b.a(this, 1 - this.f2265l);
    }

    @Override // p035l0.t
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View viewM = M(false);
            View viewL = L(false);
            if (viewM == null || viewL == null) {
                return;
            }
            ((u) viewM.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // p035l0.t
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof I) {
            this.f2269q = (I) parcelable;
            H();
        }
    }

    @Override // p035l0.t
    public final Parcelable C() {
        I i3 = this.f2269q;
        if (i3 != null) {
            I i4 = new I();
            i4.f3937m = i3.f3937m;
            i4.f3935k = i3.f3935k;
            i4.f3936l = i3.f3936l;
            i4.n = i3.n;
            i4.f3938o = i3.f3938o;
            i4.f3939p = i3.f3939p;
            i4.f3941r = i3.f3941r;
            i4.f3942s = i3.f3942s;
            i4.f3943t = i3.f3943t;
            i4.f3940q = i3.f3940q;
            return i4;
        }
        I i5 = new I();
        i5.f3941r = this.f2266m;
        i5.f3942s = false;
        i5.f3943t = false;
        i5.f3938o = 0;
        if (p() <= 0) {
            i5.f3935k = -1;
            i5.f3936l = -1;
            i5.f3937m = 0;
            return i5;
        }
        N();
        i5.f3935k = 0;
        View viewL = this.n ? L(true) : M(true);
        if (viewL != null) {
            ((u) viewL.getLayoutParams()).getClass();
            throw null;
        }
        i5.f3936l = -1;
        int i6 = this.f2261h;
        i5.f3937m = i6;
        i5.n = new int[i6];
        for (int i7 = 0; i7 < this.f2261h; i7++) {
            J j3 = this.f2262i[i7];
            int iE = j3.f3945b;
            if (iE == Integer.MIN_VALUE) {
                if (j3.f3944a.size() == 0) {
                    iE = Integer.MIN_VALUE;
                } else {
                    View view = (View) j3.f3944a.get(0);
                    G g3 = (G) view.getLayoutParams();
                    j3.f3945b = j3.f3948e.f2263j.c(view);
                    g3.getClass();
                    iE = j3.f3945b;
                }
            }
            if (iE != Integer.MIN_VALUE) {
                iE -= this.f2263j.e();
            }
            i5.n[i7] = iE;
        }
        return i5;
    }

    @Override // p035l0.t
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
        int iP = p();
        int i3 = iP - 1;
        int i4 = this.f2261h;
        new BitSet(i4).set(0, i4, true);
        if (this.f2265l == 1) {
            RecyclerView recyclerView = this.f4018b;
            Field field = D.G.f187a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z3) {
            iP = -1;
        } else {
            i3 = 0;
        }
        if (i3 == iP) {
            return false;
        }
        ((G) o(i3).getLayoutParams()).getClass();
        throw null;
    }

    public final void K(B b3) {
        if (p() == 0) {
            return;
        }
        boolean z3 = !this.f2270r;
        View viewM = M(z3);
        View viewL = L(z3);
        if (p() == 0 || b3.a() == 0 || viewM == null || viewL == null) {
            return;
        }
        ((u) viewM.getLayoutParams()).getClass();
        throw null;
    }

    public final View L(boolean z3) {
        int iE = this.f2263j.e();
        int iD = this.f2263j.d();
        View view = null;
        for (int iP = p() - 1; iP >= 0; iP--) {
            View viewO = o(iP);
            int iC = this.f2263j.c(viewO);
            int iB = this.f2263j.b(viewO);
            if (iB > iE && iC < iD) {
                if (iB <= iD || !z3) {
                    return viewO;
                }
                if (view == null) {
                    view = viewO;
                }
            }
        }
        return view;
    }

    public final View M(boolean z3) {
        int iE = this.f2263j.e();
        int iD = this.f2263j.d();
        int iP = p();
        View view = null;
        for (int i3 = 0; i3 < iP; i3++) {
            View viewO = o(i3);
            int iC = this.f2263j.c(viewO);
            if (this.f2263j.b(viewO) > iE && iC < iD) {
                if (iC >= iE || !z3) {
                    return viewO;
                }
                if (view == null) {
                    view = viewO;
                }
            }
        }
        return view;
    }

    public final void N() {
        if (p() == 0) {
            return;
        }
        t.v(o(0));
        throw null;
    }

    public final void O() {
        int iP = p();
        if (iP == 0) {
            return;
        }
        t.v(o(iP - 1));
        throw null;
    }

    @Override // p035l0.t
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f2269q != null || (recyclerView = this.f4018b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // p035l0.t
    public final boolean b() {
        return this.f2265l == 0;
    }

    @Override // p035l0.t
    public final boolean c() {
        return this.f2265l == 1;
    }

    @Override // p035l0.t
    public final boolean d(u uVar) {
        return uVar instanceof G;
    }

    @Override // p035l0.t
    public final int f(B b3) {
        if (p() == 0) {
            return 0;
        }
        boolean z3 = !this.f2270r;
        return a.g(b3, this.f2263j, M(z3), L(z3), this, this.f2270r);
    }

    @Override // p035l0.t
    public final void g(B b3) {
        K(b3);
    }

    @Override // p035l0.t
    public final int h(B b3) {
        if (p() == 0) {
            return 0;
        }
        boolean z3 = !this.f2270r;
        return a.h(b3, this.f2263j, M(z3), L(z3), this, this.f2270r);
    }

    @Override // p035l0.t
    public final int i(B b3) {
        if (p() == 0) {
            return 0;
        }
        boolean z3 = !this.f2270r;
        return a.g(b3, this.f2263j, M(z3), L(z3), this, this.f2270r);
    }

    @Override // p035l0.t
    public final void j(B b3) {
        K(b3);
    }

    @Override // p035l0.t
    public final int k(B b3) {
        if (p() == 0) {
            return 0;
        }
        boolean z3 = !this.f2270r;
        return a.h(b3, this.f2263j, M(z3), L(z3), this, this.f2270r);
    }

    @Override // p035l0.t
    public final u l() {
        return this.f2265l == 0 ? new G(-2, -1) : new G(-1, -2);
    }

    @Override // p035l0.t
    public final u m(Context context, AttributeSet attributeSet) {
        return new G(context, attributeSet);
    }

    @Override // p035l0.t
    public final u n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new G((ViewGroup.MarginLayoutParams) layoutParams) : new G(layoutParams);
    }

    @Override // p035l0.t
    public final int q(C0220c c0220c, B b3) {
        if (this.f2265l == 1) {
            return this.f2261h;
        }
        super.q(c0220c, b3);
        return 1;
    }

    @Override // p035l0.t
    public final int x(C0220c c0220c, B b3) {
        if (this.f2265l == 0) {
            return this.f2261h;
        }
        super.x(c0220c, b3);
        return 1;
    }

    @Override // p035l0.t
    public final boolean y() {
        return this.f2268p != 0;
    }

    @Override // p035l0.t
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4018b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2271s);
        }
        for (int i3 = 0; i3 < this.f2261h; i3++) {
            J j3 = this.f2262i[i3];
            j3.f3944a.clear();
            j3.f3945b = Integer.MIN_VALUE;
            j3.f3946c = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}
