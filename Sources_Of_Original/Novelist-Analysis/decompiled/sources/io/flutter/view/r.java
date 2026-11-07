package io.flutter.view;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f3378b;

    public r(s sVar, long j3) {
        this.f3378b = sVar;
        this.f3377a = j3;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        long jNanoTime = System.nanoTime() - j3;
        long j4 = jNanoTime < 0 ? 0L : jNanoTime;
        s sVar = this.f3378b;
        sVar.f3382b.onVsync(j4, sVar.f3381a, this.f3377a);
        sVar.f3383c = this;
    }
}
