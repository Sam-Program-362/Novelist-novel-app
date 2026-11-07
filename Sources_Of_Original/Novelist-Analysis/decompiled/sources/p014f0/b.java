package p014f0;

import H0.d;
import M0.E;
import androidx.lifecycle.P;
import p003b0.K;
import p042o.k;

/* JADX INFO: loaded from: classes.dex */
public class b extends P {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final K f2812d = new K(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f2813b = new k();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2814c = false;

    @Override // androidx.lifecycle.P
    public final void b() {
        k kVar = this.f2813b;
        int i3 = kVar.f4212m;
        for (int i4 = 0; i4 < i3; i4++) {
            a aVar = (a) kVar.f4211l[i4];
            d dVar = aVar.f2810l;
            dVar.a();
            dVar.f429c = true;
            E e3 = aVar.n;
            if (e3 != null) {
                aVar.g(e3);
            }
            a aVar2 = dVar.f427a;
            if (aVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (aVar2 != aVar) {
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
