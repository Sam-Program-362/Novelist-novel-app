package r1;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: r1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class TextureViewSurfaceTextureListenerC0462i implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f4376a;

    public TextureViewSurfaceTextureListenerC0462i(j jVar) {
        this.f4376a = jVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i4) {
        j jVar = this.f4376a;
        jVar.f4377k = true;
        if (jVar.f4379m == null || jVar.f4378l) {
            return;
        }
        jVar.e();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        j jVar = this.f4376a;
        jVar.f4377k = false;
        io.flutter.embedding.engine.renderer.k kVar = jVar.f4379m;
        if (kVar != null && !jVar.f4378l) {
            if (kVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            kVar.j();
            Surface surface = jVar.n;
            if (surface != null) {
                surface.release();
                jVar.n = null;
            }
        }
        Surface surface2 = jVar.n;
        if (surface2 == null) {
            return true;
        }
        surface2.release();
        jVar.n = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i4) {
        j jVar = this.f4376a;
        io.flutter.embedding.engine.renderer.k kVar = jVar.f4379m;
        if (kVar == null || jVar.f4378l) {
            return;
        }
        if (kVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        kVar.f3083a.onSurfaceChanged(i3, i4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
