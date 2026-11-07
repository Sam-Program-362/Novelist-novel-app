package p035l0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0252e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3967a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0254g f3968b;

    public C0252e(C0254g c0254g) {
        this.f3968b = c0254g;
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
        C0254g c0254g = this.f3968b;
        if (((Float) c0254g.u.getAnimatedValue()).floatValue() == 0.0f) {
            c0254g.f3989v = 0;
            c0254g.e(0);
        } else {
            c0254g.f3989v = 2;
            c0254g.n.invalidate();
        }
    }
}
