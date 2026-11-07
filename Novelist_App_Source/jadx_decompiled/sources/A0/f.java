package A0;

import androidx.window.sidecar.SidecarDisplayFeature;

/* loaded from: classes.dex */
public final class f extends a2.i implements Z1.l {

    /* renamed from: l, reason: collision with root package name */
    public static final f f50l = new f(1);

    @Override // Z1.l
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Boolean f(SidecarDisplayFeature sidecarDisplayFeature) {
        a2.h.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
    }
}
