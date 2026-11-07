package p052r1;

import io.flutter.embedding.engine.renderer.k;
import io.flutter.embedding.engine.renderer.l;

/* JADX INFO: loaded from: classes.dex */
public final class A implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f4334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f4335b;

    public A(C c3, Runnable runnable) {
        this.f4335b = c3;
        this.f4334a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b() {
        this.f4334a.run();
        k kVar = this.f4335b.f4337b;
        if (kVar != null) {
            kVar.g(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a() {
    }
}
