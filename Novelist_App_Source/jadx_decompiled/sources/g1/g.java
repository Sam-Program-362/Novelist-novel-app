package g1;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f2838b;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2840d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2837a = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2839c = new Object();

    public g(Executor executor, b bVar) {
        this.f2838b = executor;
        this.f2840d = bVar;
    }

    public final void a(i iVar) {
        switch (this.f2837a) {
            case 0:
                synchronized (this.f2839c) {
                }
                this.f2838b.execute(new A.a(this, iVar, 5, false));
                return;
            case 1:
                if (iVar.d()) {
                    return;
                }
                synchronized (this.f2839c) {
                }
                this.f2838b.execute(new A.a(this, iVar, 6, false));
                return;
            default:
                if (iVar.d()) {
                    synchronized (this.f2839c) {
                    }
                    this.f2838b.execute(new A.a(this, iVar, 7, false));
                    return;
                }
                return;
        }
    }

    public g(Executor executor, c cVar) {
        this.f2838b = executor;
        this.f2840d = cVar;
    }

    public g(Executor executor, d dVar) {
        this.f2838b = executor;
        this.f2840d = dVar;
    }
}
