package r1;

import android.view.SurfaceHolder;

/* renamed from: r1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallbackC0460g implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0461h f4371a;

    public SurfaceHolderCallbackC0460g(C0461h c0461h) {
        this.f4371a = c0461h;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
        C0461h c0461h = this.f4371a;
        io.flutter.embedding.engine.renderer.k kVar = c0461h.f4374m;
        if (kVar == null || c0461h.f4373l) {
            return;
        }
        if (kVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        kVar.f3083a.onSurfaceChanged(i4, i5);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C0461h c0461h = this.f4371a;
        c0461h.f4372k = true;
        if (c0461h.f4374m == null || c0461h.f4373l) {
            return;
        }
        c0461h.e();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C0461h c0461h = this.f4371a;
        c0461h.f4372k = false;
        io.flutter.embedding.engine.renderer.k kVar = c0461h.f4374m;
        if (kVar == null || c0461h.f4373l) {
            return;
        }
        if (kVar == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        kVar.j();
    }
}
