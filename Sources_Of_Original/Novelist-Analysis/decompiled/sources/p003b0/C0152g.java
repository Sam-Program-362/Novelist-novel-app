package p003b0;

import a2.h;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* JADX INFO: renamed from: b0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0152g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0153h f2475c;

    public C0152g(ViewGroup viewGroup, boolean z3, U u, C0153h c0153h) {
        this.f2473a = viewGroup;
        this.f2474b = z3;
        this.f2475c = c0153h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h.e(animator, "anim");
        this.f2473a.endViewTransition(null);
        if (!this.f2474b) {
            throw null;
        }
        throw null;
    }
}
