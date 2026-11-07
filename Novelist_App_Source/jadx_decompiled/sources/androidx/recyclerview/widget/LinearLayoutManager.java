package androidx.recyclerview.widget;

import B1.e;
import M1.A;
import S0.a;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import d0.AbstractC0231b;
import l0.AbstractC0410t;
import l0.C0379B;
import l0.C0402l;
import l0.C0403m;
import l0.C0411u;

/* loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0410t {

    /* renamed from: h, reason: collision with root package name */
    public final int f2200h;

    /* renamed from: i, reason: collision with root package name */
    public A f2201i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0231b f2202j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f2203k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f2204l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2205m = false;
    public final boolean n = true;

    /* renamed from: o, reason: collision with root package name */
    public C0403m f2206o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f2200h = 1;
        this.f2203k = false;
        C0402l c0402l = new C0402l(0);
        c0402l.f4005b = -1;
        c0402l.f4006c = Integer.MIN_VALUE;
        c0402l.f4007d = false;
        c0402l.f4008e = false;
        C0402l w3 = AbstractC0410t.w(context, attributeSet, i3, i4);
        int i5 = w3.f4005b;
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException(e.g("invalid orientation:", i5));
        }
        a(null);
        if (i5 != this.f2200h || this.f2202j == null) {
            this.f2202j = AbstractC0231b.a(this, i5);
            this.f2200h = i5;
            H();
        }
        boolean z3 = w3.f4007d;
        a(null);
        if (z3 != this.f2203k) {
            this.f2203k = z3;
            H();
        }
        Q(w3.f4008e);
    }

    @Override // l0.AbstractC0410t
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View P2 = P(0, p(), false);
            if (P2 != null) {
                ((C0411u) P2.getLayoutParams()).getClass();
                throw null;
            }
            accessibilityEvent.setFromIndex(-1);
            View P3 = P(p() - 1, -1, false);
            if (P3 == null) {
                accessibilityEvent.setToIndex(-1);
            } else {
                ((C0411u) P3.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // l0.AbstractC0410t
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof C0403m) {
            this.f2206o = (C0403m) parcelable;
            H();
        }
    }

    @Override // l0.AbstractC0410t
    public final Parcelable C() {
        C0403m c0403m = this.f2206o;
        if (c0403m != null) {
            C0403m c0403m2 = new C0403m();
            c0403m2.f4009k = c0403m.f4009k;
            c0403m2.f4010l = c0403m.f4010l;
            c0403m2.f4011m = c0403m.f4011m;
            return c0403m2;
        }
        C0403m c0403m3 = new C0403m();
        if (p() <= 0) {
            c0403m3.f4009k = -1;
            return c0403m3;
        }
        M();
        boolean z3 = this.f2204l;
        c0403m3.f4011m = z3;
        if (!z3) {
            AbstractC0410t.v(o(z3 ? p() - 1 : 0));
            throw null;
        }
        View o2 = o(z3 ? 0 : p() - 1);
        c0403m3.f4010l = this.f2202j.d() - this.f2202j.b(o2);
        AbstractC0410t.v(o2);
        throw null;
    }

    public final int J(C0379B c0379b) {
        if (p() == 0) {
            return 0;
        }
        M();
        boolean z3 = !this.n;
        return a.g(c0379b, this.f2202j, O(z3), N(z3), this, this.n);
    }

    public final void K(C0379B c0379b) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z3 = !this.n;
        View O2 = O(z3);
        View N2 = N(z3);
        if (p() == 0 || c0379b.a() == 0 || O2 == null || N2 == null) {
            return;
        }
        ((C0411u) O2.getLayoutParams()).getClass();
        throw null;
    }

    public final int L(C0379B c0379b) {
        if (p() == 0) {
            return 0;
        }
        M();
        boolean z3 = !this.n;
        return a.h(c0379b, this.f2202j, O(z3), N(z3), this, this.n);
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

    @Override // l0.AbstractC0410t
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f2206o != null || (recyclerView = this.f4018b) == null) {
            return;
        }
        recyclerView.b(str);
    }

    @Override // l0.AbstractC0410t
    public final boolean b() {
        return this.f2200h == 0;
    }

    @Override // l0.AbstractC0410t
    public final boolean c() {
        return this.f2200h == 1;
    }

    @Override // l0.AbstractC0410t
    public final int f(C0379B c0379b) {
        return J(c0379b);
    }

    @Override // l0.AbstractC0410t
    public final void g(C0379B c0379b) {
        K(c0379b);
    }

    @Override // l0.AbstractC0410t
    public final int h(C0379B c0379b) {
        return L(c0379b);
    }

    @Override // l0.AbstractC0410t
    public final int i(C0379B c0379b) {
        return J(c0379b);
    }

    @Override // l0.AbstractC0410t
    public final void j(C0379B c0379b) {
        K(c0379b);
    }

    @Override // l0.AbstractC0410t
    public final int k(C0379B c0379b) {
        return L(c0379b);
    }

    @Override // l0.AbstractC0410t
    public C0411u l() {
        return new C0411u(-2, -2);
    }

    @Override // l0.AbstractC0410t
    public final boolean y() {
        return true;
    }

    @Override // l0.AbstractC0410t
    public final void z(RecyclerView recyclerView) {
    }
}
