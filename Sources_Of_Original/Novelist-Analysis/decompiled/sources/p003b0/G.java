package p003b0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class G implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f2352b;

    public G(I i3, int i4) {
        this.f2352b = i3;
        this.f2351a = i4;
    }

    @Override // p003b0.F
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        I i3 = this.f2352b;
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s = i3.y;
        int i4 = this.f2351a;
        if (abstractComponentCallbacksC0163s == null || i4 >= 0 || !abstractComponentCallbacksC0163s.g().Q()) {
            return i3.R(arrayList, arrayList2, i4, 1);
        }
        return false;
    }
}
