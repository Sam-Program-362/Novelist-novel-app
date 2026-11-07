package androidx.recyclerview.widget;

import B1.e;
import M1.A;
import S0.a;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import p008d0.b;
import p035l0.B;
import p035l0.C0259l;
import p035l0.C0260m;
import p035l0.t;
import p035l0.u;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public A f2201i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f2202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f2204l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2205m = false;
    public final boolean n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0260m f2206o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f2200h = 1;
        this.f2203k = false;
        C0259l c0259l = new C0259l(0);
        c0259l.f4005b = -1;
        c0259l.f4006c = Integer.MIN_VALUE;
        c0259l.f4007d = false;
        c0259l.f4008e = false;
        C0259l c0259lW = t.w(context, attributeSet, i3, i4);
        int i5 = c0259lW.f4005b;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException(e.g("invalid orientation:", i5));
        }
        a(null);
        if (i5 != this.f2200h || this.f2202j == null) {
            this.f2202j = b.a(this, i5);
            this.f2200h = i5;
            H();
        }
        boolean z3 = c0259lW.f4007d;
        a(null);
        if (z3 != this.f2203k) {
            this.f2203k = z3;
            H();
        }
        Q(c0259lW.f4008e);
    }

    @Override // p035l0.t
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View viewP = P(0, p(), false);
            if (viewP != null) {
                ((u) viewP.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View viewP2 = P(p() - 1, -1, false);
            if (viewP2 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((u) viewP2.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // p035l0.t
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0260m) {
            this.f2206o = (C0260m) parcelable;
            H();
        }
    }

    @Override // p035l0.t
    public final Parcelable C() {
        C0260m c0260m = this.f2206o;
        if (c0260m != null) {
            C0260m c0260m2 = new C0260m();
            c0260m2.f4009k = c0260m.f4009k;
            c0260m2.f4010l = c0260m.f4010l;
            c0260m2.f4011m = c0260m.f4011m;
            return c0260m2;
        }
        C0260m c0260m3 = new C0260m();
        if (p() <= 0) {
            c0260m3.f4009k = -1;
            return c0260m3;
        }
        M();
        boolean z3 = this.f2204l;
        c0260m3.f4011m = z3;
        if (!z3) {
            t.v(o(z3 ? p() - 1 : 0));
            throw null;
        }
        View viewO = o(z3 ? 0 : p() - 1);
        c0260m3.f4010l = this.f2202j.d() - this.f2202j.b(viewO);
        t.v(viewO);
        throw null;
    }

    public final int J(B b3) {
        if (p() == 0) {
            return 0;
        }
        M();
        boolean z3 = !this.n;
        return a.g(b3, this.f2202j, O(z3), N(z3), this, this.n);
    }

    public final void K(B b3) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z3 = !this.n;
        View viewO = O(z3);
        View viewN = N(z3);
        if (p() == 0 || b3.a() == 0 || viewO == null || viewN == null) {
            return;
        }
        ((u) viewO.getLayoutParams()).getClass();
        throw null;
    }

    public final int L(B b3) {
        if (p() == 0) {
            return 0;
        }
        M();
        boolean z3 = !this.n;
        return a.h(b3, this.f2202j, O(z3), N(z3), this, this.n);
    }

    public final void M() {
        if (this.f2201i == null) {
            this.f2201i = new A(21);
        }
    }

    public final View N(boolean z3) {
        return this.f2204l ? P(0, p(), z3) : P(p() - 1, -1, z3);
    }

    public final View O(boolean z3) {
        return this.f2204l ? P(p() - 1, -1, z3) : P(0, p(), z3);
    }

    public final View P(int i3, int i4, boolean z3) {
        M();
        int i5 = z3 ? 24579 : 320;
        return this.f2200h == 0 ? this.f4019c.u(i3, i4, i5, 320) : this.f4020d.u(i3, i4, i5, 320);
    }

    public void Q(boolean z3) {
        a(null);
        if (this.f2205m == z3) {
            return;
        }
        this.f2205m = z3;
        H();
    }

    @Override // p035l0.t
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f2206o != null || (recyclerView = this.f4018b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // p035l0.t
    public final boolean b() {
        return this.f2200h == 0;
    }

    @Override // p035l0.t
    public final boolean c() {
        return this.f2200h == 1;
    }

    @Override // p035l0.t
    public final int f(B b3) {
        return J(b3);
    }

    @Override // p035l0.t
    public final void g(B b3) {
        K(b3);
    }

    @Override // p035l0.t
    public final int h(B b3) {
        return L(b3);
    }

    @Override // p035l0.t
    public final int i(B b3) {
        return J(b3);
    }

    @Override // p035l0.t
    public final void j(B b3) {
        K(b3);
    }

    @Override // p035l0.t
    public final int k(B b3) {
        return L(b3);
    }

    @Override // p035l0.t
    public u l() {
        return new u(-2, -2);
    }

    @Override // p035l0.t
    public final boolean y() {
        return true;
    }

    @Override // p035l0.t
    public final void z(RecyclerView recyclerView) {
    }
}
