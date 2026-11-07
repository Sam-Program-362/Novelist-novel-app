package L0;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f817a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S0.a f818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f819c;

    public l(A.c cVar, BasePendingResult basePendingResult) {
        this.f819c = cVar;
        this.f818b = basePendingResult;
    }

    public final void a(Status status) {
        K0.n nVar;
        switch (this.f817a) {
            case 0:
                ((Map) ((A.c) this.f819c).f6l).remove((BasePendingResult) this.f818b);
                return;
            default:
                if (!status.b()) {
                    ((g1.e) this.f819c).a(M0.r.j(status));
                    return;
                }
                S0.a aVar = this.f818b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                BasePendingResult basePendingResult = (BasePendingResult) aVar;
                M0.r.h("Result has already been consumed.", !basePendingResult.f2736i);
                try {
                    if (!basePendingResult.f2731d.await(0L, timeUnit)) {
                        basePendingResult.N(Status.f2724r);
                    }
                } catch (InterruptedException unused) {
                    basePendingResult.N(Status.f2722p);
                }
                M0.r.h("Result is not ready.", basePendingResult.O());
                synchronized (basePendingResult.f2730c) {
                    M0.r.h("Result has already been consumed.", !basePendingResult.f2736i);
                    M0.r.h("Result is not ready.", basePendingResult.O());
                    nVar = basePendingResult.f2734g;
                    basePendingResult.f2734g = null;
                    basePendingResult.f2736i = true;
                }
                if (basePendingResult.f2733f.getAndSet(null) != null) {
                    throw new ClassCastException();
                }
                M0.r.f(nVar);
                ((g1.e) this.f819c).b(null);
                return;
        }
    }

    public l(S0.a aVar, g1.e eVar, B1.b bVar) {
        this.f818b = aVar;
        this.f819c = eVar;
    }
}
