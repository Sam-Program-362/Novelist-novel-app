package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final long f3059k;

    /* renamed from: l, reason: collision with root package name */
    public final FlutterJNI f3060l;

    public i(long j3, FlutterJNI flutterJNI) {
        this.f3059k = j3;
        this.f3060l = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.f3060l;
        if (flutterJNI.isAttached()) {
            flutterJNI.unregisterTexture(this.f3059k);
        }
    }
}
