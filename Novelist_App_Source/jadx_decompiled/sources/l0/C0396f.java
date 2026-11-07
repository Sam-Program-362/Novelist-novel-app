package l0;

import android.animation.ValueAnimator;

/* renamed from: l0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0396f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0397g f3969a;

    public C0396f(C0397g c0397g) {
        this.f3969a = c0397g;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0397g c0397g = this.f3969a;
        c0397g.f3971b.setAlpha(floatValue);
        c0397g.f3972c.setAlpha(floatValue);
        c0397g.n.invalidate();
    }
}
