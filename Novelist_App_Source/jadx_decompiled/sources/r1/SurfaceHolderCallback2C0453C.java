package r1;

import android.os.Build;
import android.view.SurfaceHolder;

/* renamed from: r1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SurfaceHolderCallback2C0453C implements SurfaceHolder.Callback2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0461h f4336a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.k f4337b;

    /* renamed from: c, reason: collision with root package name */
    public final SurfaceHolderCallbackC0460g f4338c;

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.a f4339d = new io.flutter.embedding.engine.renderer.a(this, 3);

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0452B f4340e;

    public SurfaceHolderCallback2C0453C(SurfaceHolderCallbackC0460g surfaceHolderCallbackC0460g, C0461h c0461h, io.flutter.embedding.engine.renderer.k kVar) {
        boolean z3 = Build.VERSION.SDK_INT < 26;
        this.f4340e = z3 ? new H0.i(this, 26) : new B1.g(this, 19);
        this.f4338c = surfaceHolderCallbackC0460g;
        this.f4337b = kVar;
        this.f4336a = c0461h;
        if (z3) {
            c0461h.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
        SurfaceHolderCallbackC0460g surfaceHolderCallbackC0460g = this.f4338c;
        if (surfaceHolderCallbackC0460g != null) {
            surfaceHolderCallbackC0460g.surfaceChanged(surfaceHolder, i3, i4, i5);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC0460g surfaceHolderCallbackC0460g = this.f4338c;
        if (surfaceHolderCallbackC0460g != null) {
            surfaceHolderCallbackC0460g.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolderCallbackC0460g surfaceHolderCallbackC0460g = this.f4338c;
        if (surfaceHolderCallbackC0460g != null) {
            surfaceHolderCallbackC0460g.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.k kVar = this.f4337b;
        if (kVar == null) {
            return;
        }
        kVar.a(new C0451A(this, runnable));
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
