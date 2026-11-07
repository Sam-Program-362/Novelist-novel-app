package C1;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f171a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A0.j f172b;

    public g(A0.j jVar) {
        this.f172b = jVar;
    }

    public final void a(Serializable serializable) {
        if (this.f171a.get()) {
            return;
        }
        A0.j jVar = this.f172b;
        if (((AtomicReference) jVar.f58m).get() != this) {
            return;
        }
        A0.j jVar2 = (A0.j) jVar.n;
        ((f) jVar2.f57l).h((String) jVar2.f58m, ((n) jVar2.n).a(serializable));
    }
}
