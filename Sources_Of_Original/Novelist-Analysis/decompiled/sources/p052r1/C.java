package p052r1;

import B1.g;
import H0.i;
import android.os.Build;
import android.view.SurfaceHolder;
import io.flutter.embedding.engine.renderer.a;
import io.flutter.embedding.engine.renderer.k;

/* JADX INFO: loaded from: classes.dex */
public final class C implements SurfaceHolder.Callback2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f4336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f4337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f4338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f4339d = new a(this, 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B f4340e;

    public C(g gVar, h hVar, k kVar) {
        boolean z3 = Build.VERSION.SDK_INT < 26;
        this.f4340e = z3 ? new i(this, 26) : new g(this, 19);
        this.f4338c = gVar;
        this.f4337b = kVar;
        this.f4336a = hVar;
        if (z3) {
            hVar.setAlpha(0.0f);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i3, int i4, int i5) {
        g gVar = this.f4338c;
        if (gVar != null) {
            gVar.surfaceChanged(surfaceHolder, i3, i4, i5);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        g gVar = this.f4338c;
        if (gVar != null) {
            gVar.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        g gVar = this.f4338c;
        if (gVar != null) {
            gVar.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        k kVar = this.f4337b;
        if (kVar == null) {
            return;
        }
        kVar.a(new A(this, runnable));
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
