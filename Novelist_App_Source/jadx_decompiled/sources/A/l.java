package A;

import M0.r;
import java.util.ArrayList;
import java.util.Collections;
import r1.w;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f33a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f34b;

    public l(J0.a aVar, int i3) {
        r.f(aVar);
        this.f34b = aVar;
        this.f33a = i3;
    }

    public l(int i3, w[] wVarArr) {
        this.f33a = i3;
        this.f34b = wVarArr;
    }

    public l(int i3) {
        if (i3 > 0) {
            this.f34b = new Object[i3];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public l() {
        this.f33a = 1;
        this.f34b = Collections.singletonList(null);
    }

    public l(ArrayList arrayList) {
        this.f33a = 0;
        this.f34b = arrayList;
    }
}
