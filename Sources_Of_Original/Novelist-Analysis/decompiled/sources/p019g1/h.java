package p019g1;

import B1.p;
import android.os.Bundle;
import androidx.lifecycle.EnumC0139m;
import androidx.lifecycle.u;
import java.util.ArrayDeque;
import java.util.Map;
import p037m.d;
import p037m.f;
import p038m0.b;
import p038m0.e;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f2843c;

    public h() {
        this.f2842b = new Object();
    }

    public void a(double d3, double d4) {
        double[] dArr = (double[]) this.f2842b;
        double d5 = 1.0d;
        if (!this.f2841a) {
            d5 = 1.0d / (((dArr[7] * d4) + (dArr[3] * d3)) + dArr[15]);
        }
        double d6 = ((dArr[4] * d4) + (dArr[0] * d3) + dArr[12]) * d5;
        double d7 = ((dArr[5] * d4) + (dArr[1] * d3) + dArr[13]) * d5;
        double[] dArr2 = (double[]) this.f2843c;
        if (d6 < dArr2[0]) {
            dArr2[0] = d6;
        } else if (d6 > dArr2[1]) {
            dArr2[1] = d6;
        }
        if (d7 < dArr2[2]) {
            dArr2[2] = d7;
        } else if (d7 > dArr2[3]) {
            dArr2[3] = d7;
        }
    }

    public void b() {
        e eVar = (e) this.f2842b;
        u uVarH = eVar.h();
        if (uVarH.f2160c != EnumC0139m.f2151l) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        uVarH.a(new b(eVar, 0));
        p pVar = (p) this.f2843c;
        pVar.getClass();
        if (pVar.f133a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        uVarH.a(new p002b.e(pVar, 2));
        pVar.f133a = true;
        this.f2841a = true;
    }

    public void c(Bundle bundle) {
        if (!this.f2841a) {
            b();
        }
        u uVarH = ((e) this.f2842b).h();
        if (uVarH.f2160c.compareTo(EnumC0139m.n) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + uVarH.f2160c).toString());
        }
        p pVar = (p) this.f2843c;
        if (!pVar.f133a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (pVar.f134b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        pVar.f137e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        pVar.f134b = true;
    }

    public void d(Bundle bundle) {
        p pVar = (p) this.f2843c;
        pVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) pVar.f137e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        f fVar = (f) pVar.f136d;
        fVar.getClass();
        d dVar = new d(fVar);
        fVar.f4095m.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((p038m0.d) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void e(g gVar) {
        synchronized (this.f2842b) {
            try {
                if (((ArrayDeque) this.f2843c) == null) {
                    this.f2843c = new ArrayDeque();
                }
                ((ArrayDeque) this.f2843c).add(gVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(i iVar) {
        g gVar;
        synchronized (this.f2842b) {
            if (((ArrayDeque) this.f2843c) != null && !this.f2841a) {
                this.f2841a = true;
                while (true) {
                    synchronized (this.f2842b) {
                        try {
                            gVar = (g) ((ArrayDeque) this.f2843c).poll();
                            if (gVar == null) {
                                this.f2841a = false;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    gVar.a(iVar);
                }
            }
        }
    }

    public h(e eVar) {
        this.f2842b = eVar;
        p pVar = new p();
        pVar.f136d = new f();
        pVar.f135c = true;
        this.f2843c = pVar;
    }

    public h(boolean z3, double[] dArr, double[] dArr2) {
        this.f2841a = z3;
        this.f2842b = dArr;
        this.f2843c = dArr2;
    }
}
