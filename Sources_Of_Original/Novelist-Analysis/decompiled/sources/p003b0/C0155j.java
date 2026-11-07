package p003b0;

import a2.h;
import android.animation.AnimatorSet;

/* JADX INFO: renamed from: b0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0155j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0155j f2479a = new C0155j();

    public final void a(AnimatorSet animatorSet) {
        h.e(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j3) {
        h.e(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j3);
    }
}
