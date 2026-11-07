package l0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: l0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0395e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3967a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0397g f3968b;

    public C0395e(C0397g c0397g) {
        this.f3968b = c0397g;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f3967a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f3967a) {
            this.f3967a = false;
            return;
        }
        C0397g c0397g = this.f3968b;
        if (((Float) c0397g.u.getAnimatedValue()).floatValue() == 0.0f) {
            c0397g.f3989v = 0;
            c0397g.e(0);
        } else {
            c0397g.f3989v = 2;
            c0397g.n.invalidate();
        }
    }
}
