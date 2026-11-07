package b0;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;
import b.C0148a;

/* renamed from: b0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0161h extends T {

    /* renamed from: b, reason: collision with root package name */
    public final C0159f f2476b;

    /* renamed from: c, reason: collision with root package name */
    public AnimatorSet f2477c;

    public C0161h(C0159f c0159f) {
        this.f2476b = c0159f;
    }

    @Override // b0.T
    public final void a(ViewGroup viewGroup) {
        a2.h.e(viewGroup, "container");
        AnimatorSet animatorSet = this.f2477c;
        animatorSet.getClass();
        animatorSet.start();
        if (I.J(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((Object) null) + " has started.");
        }
    }

    @Override // b0.T
    public final void b(C0148a c0148a, ViewGroup viewGroup) {
        a2.h.e(viewGroup, "container");
        this.f2477c.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // b0.T
    public final void c(ViewGroup viewGroup) {
        a2.h.e(viewGroup, "container");
        C0159f c0159f = this.f2476b;
        if (c0159f.t()) {
            return;
        }
        Context context = viewGroup.getContext();
        a2.h.d(context, "context");
        A.c S = c0159f.S(context);
        this.f2477c = S != null ? (AnimatorSet) S.f7m : null;
        throw null;
    }
}
