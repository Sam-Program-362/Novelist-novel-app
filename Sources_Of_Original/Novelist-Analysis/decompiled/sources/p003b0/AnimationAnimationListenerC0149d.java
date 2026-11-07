package p003b0;

import M.c;
import a2.h;
import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: renamed from: b0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC0149d implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0150e f2468b;

    public AnimationAnimationListenerC0149d(U u, ViewGroup viewGroup, C0150e c0150e) {
        this.f2467a = viewGroup;
        this.f2468b = c0150e;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        h.e(animation, "animation");
        ViewGroup viewGroup = this.f2467a;
        viewGroup.post(new c(viewGroup, this.f2468b, 13));
        if (I.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        h.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        h.e(animation, "animation");
        if (I.J(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((Object) null) + " has reached onAnimationStart.");
        }
    }
}
