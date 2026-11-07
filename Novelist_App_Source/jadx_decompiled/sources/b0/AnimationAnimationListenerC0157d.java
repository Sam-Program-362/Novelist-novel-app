package b0;

import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: b0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0157d implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2467a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0158e f2468b;

    public AnimationAnimationListenerC0157d(U u, ViewGroup viewGroup, C0158e c0158e) {
        this.f2467a = viewGroup;
        this.f2468b = c0158e;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        a2.h.e(animation, "animation");
        ViewGroup viewGroup = this.f2467a;
        viewGroup.post(new M.c(viewGroup, this.f2468b, 13));
        if (I.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        a2.h.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        a2.h.e(animation, "animation");
        if (I.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has reached onAnimationStart.");
        }
    }
}
