package b0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* renamed from: b0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0161h f2475c;

    public C0160g(ViewGroup viewGroup, boolean z3, U u, C0161h c0161h) {
        this.f2473a = viewGroup;
        this.f2474b = z3;
        this.f2475c = c0161h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a2.h.e(animator, "anim");
        this.f2473a.endViewTransition(null);
        if (!this.f2474b) {
            throw null;
        }
        throw null;
    }
}
