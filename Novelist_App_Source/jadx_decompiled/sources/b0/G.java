package b0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class G implements F {

    /* renamed from: a, reason: collision with root package name */
    public final int f2351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f2352b;

    public G(I i3, int i4) {
        this.f2352b = i3;
        this.f2351a = i4;
    }

    @Override // b0.F
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        I i3 = this.f2352b;
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s = i3.y;
        int i4 = this.f2351a;
        if (abstractComponentCallbacksC0171s == null || i4 >= 0 || !abstractComponentCallbacksC0171s.g().Q()) {
            return i3.R(arrayList, arrayList2, i4, 1);
        }
        return false;
    }
}
