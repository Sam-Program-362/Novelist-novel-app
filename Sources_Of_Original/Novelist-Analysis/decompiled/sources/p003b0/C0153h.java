package p003b0;

import A.c;
import a2.h;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;
import p002b.a;

/* JADX INFO: renamed from: b0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0153h extends T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0151f f2476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AnimatorSet f2477c;

    public C0153h(C0151f c0151f) {
        this.f2476b = c0151f;
    }

    @Override // p003b0.T
    public final void a(ViewGroup viewGroup) {
        h.e(viewGroup, "container");
        AnimatorSet animatorSet = this.f2477c;
        animatorSet.getClass();
        animatorSet.start();
        if (I.J(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((Object) null) + " has started.");
        }
    }

    @Override // p003b0.T
    public final void b(a aVar, ViewGroup viewGroup) {
        h.e(viewGroup, "container");
        this.f2477c.getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            throw null;
        }
    }

    @Override // p003b0.T
    public final void c(ViewGroup viewGroup) {
        h.e(viewGroup, "container");
        C0151f c0151f = this.f2476b;
        if (c0151f.t()) {
            return;
        }
        Context context = viewGroup.getContext();
        h.d(context, "context");
        c cVarS = c0151f.S(context);
        this.f2477c = cVarS != null ? (AnimatorSet) cVarS.f7m : null;
        throw null;
    }
}
