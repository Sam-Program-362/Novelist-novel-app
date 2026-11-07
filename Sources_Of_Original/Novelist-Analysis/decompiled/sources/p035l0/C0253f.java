package p035l0;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0253f implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0254g f3969a;

    public C0253f(C0254g c0254g) {
        this.f3969a = c0254g;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        C0254g c0254g = this.f3969a;
        c0254g.f3971b.setAlpha(iFloatValue);
        c0254g.f3972c.setAlpha(iFloatValue);
        c0254g.n.invalidate();
    }
}
