package p052r1;

import android.view.SurfaceHolder;
import io.flutter.embedding.engine.renderer.k;

/* JADX INFO: loaded from: classes.dex */
public final class g implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f4371a;

    public g(h hVar) {
        this.f4371a = hVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
        h hVar = this.f4371a;
        k kVar = hVar.f4374m;
        if (kVar == null || hVar.f4373l) {
            return;
        }
        if (kVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        kVar.f3083a.onSurfaceChanged(i4, i5);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        h hVar = this.f4371a;
        hVar.f4372k = true;
        if (hVar.f4374m == null || hVar.f4373l) {
            return;
        }
        hVar.e();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        h hVar = this.f4371a;
        hVar.f4372k = false;
        k kVar = hVar.f4374m;
        if (kVar == null || hVar.f4373l) {
            return;
        }
        if (kVar == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        kVar.j();
    }
}
