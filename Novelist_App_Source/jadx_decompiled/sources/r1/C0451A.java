package r1;

/* renamed from: r1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0451A implements io.flutter.embedding.engine.renderer.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f4334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurfaceHolderCallback2C0453C f4335b;

    public C0451A(SurfaceHolderCallback2C0453C surfaceHolderCallback2C0453C, Runnable runnable) {
        this.f4335b = surfaceHolderCallback2C0453C;
        this.f4334a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b() {
        this.f4334a.run();
        io.flutter.embedding.engine.renderer.k kVar = this.f4335b.f4337b;
        if (kVar != null) {
            kVar.g(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a() {
    }
}
