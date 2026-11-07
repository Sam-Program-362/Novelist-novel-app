package p003b0;

import D.ViewTreeObserverOnPreDrawListenerC0015p;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: b0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0166v extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ViewGroup f2557k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f2558l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2559m;
    public boolean n;

    public RunnableC0166v(Animation animation, ViewGroup viewGroup) {
        super(false);
        this.n = true;
        this.f2557k = viewGroup;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j3, Transformation transformation) {
        this.n = true;
        if (this.f2558l) {
            return !this.f2559m;
        }
        if (!super.getTransformation(j3, transformation)) {
            this.f2558l = true;
            ViewTreeObserverOnPreDrawListenerC0015p.a(this.f2557k, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3 = this.f2558l;
        ViewGroup viewGroup = this.f2557k;
        if (z3 || !this.n) {
            viewGroup.endViewTransition(null);
            this.f2559m = true;
        } else {
            this.n = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j3, Transformation transformation, float f3) {
        this.n = true;
        if (this.f2558l) {
            return !this.f2559m;
        }
        if (!super.getTransformation(j3, transformation, f3)) {
            this.f2558l = true;
            ViewTreeObserverOnPreDrawListenerC0015p.a(this.f2557k, this);
        }
        return true;
    }
}
