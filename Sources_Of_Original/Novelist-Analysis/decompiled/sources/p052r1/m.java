package p052r1;

import M1.RunnableC0053b;
import io.flutter.embedding.engine.renderer.k;
import io.flutter.embedding.engine.renderer.l;

/* JADX INFO: loaded from: classes.dex */
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f4384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RunnableC0053b f4385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f4386c;

    public m(n nVar, k kVar, RunnableC0053b runnableC0053b) {
        this.f4386c = nVar;
        this.f4384a = kVar;
        this.f4385b = runnableC0053b;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b() {
        f fVar;
        this.f4384a.g(this);
        this.f4385b.run();
        n nVar = this.f4386c;
        if ((nVar.f4402o instanceof f) || (fVar = nVar.n) == null) {
            return;
        }
        fVar.a();
        f fVar2 = nVar.n;
        if (fVar2 != null) {
            fVar2.f4365k.close();
            nVar.removeView(nVar.n);
            nVar.n = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a() {
    }
}
