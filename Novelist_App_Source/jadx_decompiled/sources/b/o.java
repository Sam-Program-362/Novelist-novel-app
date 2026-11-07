package b;

import android.util.Log;
import b0.C0154a;
import b0.I;
import b0.z;
import h0.C0262e;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final p f2329a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2330b;

    /* renamed from: c, reason: collision with root package name */
    public B1.s f2331c;

    /* renamed from: d, reason: collision with root package name */
    public final z f2332d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2333e;

    public o(z zVar, p pVar) {
        a2.h.e(zVar, "onBackPressedCallback");
        boolean z3 = zVar.f2567b;
        this.f2329a = pVar;
        this.f2330b = z3;
        this.f2332d = zVar;
        this.f2333e = true;
    }

    public final void a() {
        I i3 = this.f2332d.f2569d;
        if (I.J(3)) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + i3);
        }
        C0154a c0154a = i3.f2376h;
        if (c0154a != null) {
            c0154a.f2452q = false;
            c0154a.d(false);
            i3.A(true);
            i3.D();
            Iterator it2 = i3.f2381m.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        i3.f2376h = null;
    }

    public final void b() {
        B1.s sVar = this.f2331c;
        if (sVar == null || !((LinkedHashSet) sVar.f146m).remove(this)) {
            return;
        }
        C0262e c0262e = (C0262e) sVar.f145l;
        c0262e.getClass();
        if (equals(c0262e.f2873f)) {
            if (c0262e.f2874g == -1) {
                a();
            }
            c0262e.f2873f = null;
            c0262e.f2874g = 0;
            c0262e.f2875h = null;
        }
        c0262e.f2871d.remove(this);
        c0262e.f2872e.remove(this);
        this.f2331c = null;
        c0262e.b();
    }

    public final void c(boolean z3) {
        C0262e c0262e;
        if (this.f2330b == z3) {
            return;
        }
        this.f2330b = z3;
        B1.s sVar = this.f2331c;
        if (sVar == null || (c0262e = (C0262e) sVar.f145l) == null) {
            return;
        }
        c0262e.b();
    }

    public final void d(boolean z3) {
        this.f2333e = z3;
        c(z3 && this.f2332d.f2567b);
    }
}
