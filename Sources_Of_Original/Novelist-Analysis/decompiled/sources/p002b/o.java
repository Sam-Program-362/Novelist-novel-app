package p002b;

import B1.s;
import a2.h;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p003b0.C0146a;
import p003b0.I;
import p003b0.z;
import p022h0.e;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f2329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f2331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f2332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2333e;

    public o(z zVar, p pVar) {
        h.e(zVar, "onBackPressedCallback");
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
        C0146a c0146a = i3.f2376h;
        if (c0146a != null) {
            c0146a.f2452q = false;
            c0146a.d(false);
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
        s sVar = this.f2331c;
        if (sVar == null || !((LinkedHashSet) sVar.f146m).remove(this)) {
            return;
        }
        e eVar = (e) sVar.f145l;
        eVar.getClass();
        if (equals(eVar.f2873f)) {
            if (eVar.f2874g == -1) {
                a();
            }
            eVar.f2873f = null;
            eVar.f2874g = 0;
            eVar.f2875h = null;
        }
        eVar.f2871d.remove(this);
        eVar.f2872e.remove(this);
        this.f2331c = null;
        eVar.b();
    }

    public final void c(boolean z3) {
        e eVar;
        if (this.f2330b == z3) {
            return;
        }
        this.f2330b = z3;
        s sVar = this.f2331c;
        if (sVar == null || (eVar = (e) sVar.f145l) == null) {
            return;
        }
        eVar.b();
    }

    public final void d(boolean z3) {
        this.f2333e = z3;
        c(z3 && this.f2332d.f2567b);
    }
}
