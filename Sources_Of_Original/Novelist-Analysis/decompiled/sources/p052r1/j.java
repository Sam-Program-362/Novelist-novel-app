package p052r1;

import E2.a;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.k;
import io.flutter.embedding.engine.renderer.n;

/* JADX INFO: loaded from: classes.dex */
public final class j extends TextureView implements n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f4379m;
    public Surface n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f4380o;

    public j(AbstractActivityC0262b abstractActivityC0262b) {
        super(abstractActivityC0262b, null);
        this.f4377k = false;
        this.f4378l = false;
        this.f4380o = false;
        setSurfaceTextureListener(new i(this));
        this.f4380o = a.A(getContext());
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a() {
        if (this.f4379m == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            k kVar = this.f4379m;
            if (kVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            kVar.j();
            Surface surface = this.n;
            if (surface != null) {
                surface.release();
                this.n = null;
            }
        }
        this.f4379m = null;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b() {
        if (this.f4379m == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f4377k) {
            e();
        }
        this.f4378l = false;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void c(k kVar) {
        k kVar2 = this.f4379m;
        if (kVar2 != null) {
            kVar2.j();
        }
        this.f4379m = kVar;
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void d() {
        if (this.f4379m == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f4378l = true;
        }
    }

    public final void e() {
        if (this.f4379m == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.n;
        if (surface != null) {
            surface.release();
            this.n = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.n = surface2;
        k kVar = this.f4379m;
        boolean z3 = this.f4378l;
        FlutterJNI flutterJNI = kVar.f3083a;
        if (!z3) {
            kVar.j();
        }
        kVar.f3085c = surface2;
        if (z3) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public k getAttachedRenderer() {
        return this.f4379m;
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        if (!this.f4380o) {
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i3), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i4), View.MeasureSpec.getMode(i4) == 0 ? 1 : 0));
    }

    public void setRenderSurface(Surface surface) {
        this.n = surface;
    }
}
