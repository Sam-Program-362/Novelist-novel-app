package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$GLTextureConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.q;

/* loaded from: classes.dex */
public final class o implements TextureRegistry$SurfaceProducer, TextureRegistry$GLTextureConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final long f3091a;

    /* renamed from: b, reason: collision with root package name */
    public int f3092b;

    /* renamed from: c, reason: collision with root package name */
    public int f3093c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3094d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f3095e;

    /* renamed from: f, reason: collision with root package name */
    public final h f3096f;

    /* renamed from: g, reason: collision with root package name */
    public final Handler f3097g;

    /* renamed from: h, reason: collision with root package name */
    public final FlutterJNI f3098h;

    public o(long j3, Handler handler, FlutterJNI flutterJNI, h hVar) {
        this.f3091a = j3;
        this.f3097g = handler;
        this.f3098h = flutterJNI;
        this.f3096f = hVar;
    }

    public final void finalize() {
        try {
            if (this.f3094d) {
                return;
            }
            release();
            this.f3097g.post(new i(this.f3091a, this.f3098h));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getForcedNewSurface() {
        this.f3095e = null;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getHeight() {
        return this.f3093c;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final Surface getSurface() {
        Surface surface = this.f3095e;
        if (surface == null || !surface.isValid()) {
            this.f3095e = new Surface(this.f3096f.f3055b.surfaceTexture());
        }
        return this.f3095e;
    }

    @Override // io.flutter.view.TextureRegistry$GLTextureConsumer
    public final SurfaceTexture getSurfaceTexture() {
        return this.f3096f.f3055b.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final int getWidth() {
        return this.f3092b;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final long id() {
        return this.f3091a;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void release() {
        this.f3096f.release();
        this.f3095e.release();
        this.f3095e = null;
        this.f3094d = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void scheduleFrame() {
        this.f3098h.markTextureFrameAvailable(this.f3091a);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setCallback(q qVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public final void setSize(int i3, int i4) {
        this.f3092b = i3;
        this.f3093c = i4;
        this.f3096f.f3055b.surfaceTexture().setDefaultBufferSize(i3, i4);
    }
}
