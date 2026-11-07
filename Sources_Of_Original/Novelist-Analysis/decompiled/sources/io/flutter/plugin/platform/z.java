package io.flutter.plugin.platform;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class z implements h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.h f3252k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SurfaceTexture f3253l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Surface f3254m;
    public int n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3255o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3256p = false;

    public z(io.flutter.embedding.engine.renderer.h hVar) {
        y yVar = new y(this);
        this.f3252k = hVar;
        this.f3253l = hVar.f3055b.surfaceTexture();
        hVar.f3057d = yVar;
    }

    @Override // io.flutter.plugin.platform.h
    public final void b(int i3, int i4) {
        this.n = i3;
        this.f3255o = i4;
        SurfaceTexture surfaceTexture = this.f3253l;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i3, i4);
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final int getHeight() {
        return this.f3255o;
    }

    @Override // io.flutter.plugin.platform.h
    public final long getId() {
        return this.f3252k.f3054a;
    }

    @Override // io.flutter.plugin.platform.h
    public final Surface getSurface() {
        Surface surface = this.f3254m;
        if (surface == null || this.f3256p) {
            if (surface != null) {
                surface.release();
                this.f3254m = null;
            }
            this.f3254m = new Surface(this.f3253l);
            this.f3256p = false;
        }
        SurfaceTexture surfaceTexture = this.f3253l;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            return null;
        }
        return this.f3254m;
    }

    @Override // io.flutter.plugin.platform.h
    public final int getWidth() {
        return this.n;
    }

    @Override // io.flutter.plugin.platform.h
    public final void release() {
        this.f3253l = null;
        Surface surface = this.f3254m;
        if (surface != null) {
            surface.release();
            this.f3254m = null;
        }
    }
}
