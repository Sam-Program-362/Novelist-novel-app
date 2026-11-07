package f0;

import H0.d;
import M0.E;
import androidx.lifecycle.P;
import b0.K;
import o.k;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0245b extends P {

    /* renamed from: d, reason: collision with root package name */
    public static final K f2812d = new K(1);

    /* renamed from: b, reason: collision with root package name */
    public final k f2813b = new k();

    /* renamed from: c, reason: collision with root package name */
    public boolean f2814c = false;

    @Override // androidx.lifecycle.P
    public final void b() {
        k kVar = this.f2813b;
        int i3 = kVar.f4212m;
        for (int i4 = 0; i4 < i3; i4++) {
            C0244a c0244a = (C0244a) kVar.f4211l[i4];
            d dVar = c0244a.f2810l;
            dVar.a();
            dVar.f429c = true;
            E e3 = c0244a.n;
            if (e3 != null) {
                c0244a.g(e3);
            }
            C0244a c0244a2 = dVar.f427a;
            if (c0244a2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (c0244a2 != c0244a) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            dVar.f427a = null;
            if (e3 != null) {
                boolean z3 = e3.f922l;
            }
            dVar.f430d = true;
            dVar.f428b = false;
            dVar.f429c = false;
            dVar.f431e = false;
        }
        int i5 = kVar.f4212m;
        Object[] objArr = kVar.f4211l;
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = null;
        }
        kVar.f4212m = 0;
    }
}
