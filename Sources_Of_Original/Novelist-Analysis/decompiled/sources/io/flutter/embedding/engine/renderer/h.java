package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import io.flutter.view.p;

/* JADX INFO: loaded from: classes.dex */
public final class h implements TextureRegistry$SurfaceTextureEntry, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SurfaceTextureWrapper f3055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f3057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f3058e;

    public h(k kVar, long j3, SurfaceTexture surfaceTexture) {
        this.f3058e = kVar;
        this.f3054a = j3;
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture, new c(this, 1));
        this.f3055b = surfaceTextureWrapper;
        surfaceTextureWrapper.surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.g
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                h hVar = this.f3053a;
                FlutterJNI flutterJNI = hVar.f3058e.f3083a;
                if (hVar.f3056c || !flutterJNI.isAttached()) {
                    return;
                }
                hVar.f3055b.markDirty();
                flutterJNI.scheduleFrame();
            }
        }, new Handler());
    }

    public final void finalize() throws Throwable {
        try {
            if (this.f3056c) {
                return;
            }
            k kVar = this.f3058e;
            kVar.f3087e.post(new i(this.f3054a, kVar.f3083a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final long id() {
        return this.f3054a;
    }

    @Override // io.flutter.view.p
    public final void onTrimMemory(int i3) {
        p pVar = this.f3057d;
        if (pVar != null) {
            pVar.onTrimMemory(i3);
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void release() {
        if (this.f3056c) {
            return;
        }
        this.f3055b.release();
        long j3 = this.f3054a;
        k kVar = this.f3058e;
        kVar.f3083a.unregisterTexture(j3);
        kVar.h(this);
        this.f3056c = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnFrameConsumedListener(io.flutter.view.o oVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnTrimMemoryListener(p pVar) {
        this.f3057d = pVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final SurfaceTexture surfaceTexture() {
        return this.f3055b.surfaceTexture();
    }
}
