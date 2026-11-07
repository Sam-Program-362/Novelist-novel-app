package p003b0;

import a2.h;
import android.view.ViewGroup;

/* JADX INFO: renamed from: b0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0150e extends T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0151f f2469b;

    public C0150e(C0151f c0151f) {
        this.f2469b = c0151f;
    }

    @Override // p003b0.T
    public final void a(ViewGroup viewGroup) {
        h.e(viewGroup, "container");
        if (this.f2469b.t()) {
            throw null;
        }
        viewGroup.getContext();
        throw null;
    }
}
