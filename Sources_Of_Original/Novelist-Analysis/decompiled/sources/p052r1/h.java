package p052r1;

import E2.a;
import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.k;
import io.flutter.embedding.engine.renderer.n;

/* JADX INFO: loaded from: classes.dex */
public final class h extends SurfaceView implements n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4373l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f4374m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C f4375o;

    public h(AbstractActivityC0262b abstractActivityC0262b, boolean z3) {
        super(abstractActivityC0262b, null);
        this.f4372k = false;
        this.f4373l = false;
        this.n = false;
        C c3 = new C(new g(this), this, this.f4374m);
        this.f4375o = c3;
        if (z3) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        this.n = a.A(getContext());
        getHolder().addCallback(c3);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void a() {
        if (this.f4374m == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            k kVar = this.f4374m;
            if (kVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            kVar.j();
        }
        this.f4375o.f4340e.g();
        this.f4374m = null;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void b() {
        if (this.f4374m == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f4375o.f4340e.m();
        if (this.f4372k) {
            e();
        }
        this.f4373l = false;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void c(k kVar) {
        k kVar2 = this.f4374m;
        if (kVar2 != null) {
            kVar2.j();
        }
        this.f4374m = kVar;
        this.f4375o.f4340e.r(kVar);
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public final void d() {
        if (this.f4374m == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f4373l = true;
        }
    }

    public final void e() {
        if (this.f4374m == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        k kVar = this.f4374m;
        Surface surface = getHolder().getSurface();
        boolean z3 = this.f4373l;
        FlutterJNI flutterJNI = kVar.f3083a;
        if (!z3) {
            kVar.j();
        }
        kVar.f3085c = surface;
        if (z3) {
            flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            flutterJNI.onSurfaceCreated(surface);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i3 = iArr[0];
        region.op(i3, iArr[1], (getRight() + i3) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public k getAttachedRenderer() {
        return this.f4374m;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i3, int i4) {
        if (!this.n) {
            super.onMeasure(i3, i4);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i3), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i4), View.MeasureSpec.getMode(i4) == 0 ? 1 : 0));
    }
}
