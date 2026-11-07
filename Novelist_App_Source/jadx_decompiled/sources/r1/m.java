package r1;

import M1.RunnableC0053b;

/* loaded from: classes.dex */
public final class m implements io.flutter.embedding.engine.renderer.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.k f4384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RunnableC0053b f4385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f4386c;

    public m(n nVar, io.flutter.embedding.engine.renderer.k kVar, RunnableC0053b runnableC0053b) {
        this.f4386c = nVar;
        this.f4384a = kVar;
        this.f4385b = runnableC0053b;
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void b() {
        C0459f c0459f;
        this.f4384a.g(this);
        this.f4385b.run();
        n nVar = this.f4386c;
        if ((nVar.f4402o instanceof C0459f) || (c0459f = nVar.n) == null) {
            return;
        }
        c0459f.a();
        C0459f c0459f2 = nVar.n;
        if (c0459f2 != null) {
            c0459f2.f4365k.close();
            nVar.removeView(nVar.n);
            nVar.n = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.l
    public final void a() {
    }
}
