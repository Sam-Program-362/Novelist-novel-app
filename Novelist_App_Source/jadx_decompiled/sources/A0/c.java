package A0;

import androidx.window.sidecar.SidecarDisplayFeature;

/* loaded from: classes.dex */
public final class c extends a2.i implements Z1.l {

    /* renamed from: l, reason: collision with root package name */
    public static final c f47l = new c(1);

    @Override // Z1.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Boolean f(SidecarDisplayFeature sidecarDisplayFeature) {
        a2.h.e(sidecarDisplayFeature, "$this$require");
        boolean z3 = true;
        if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}
