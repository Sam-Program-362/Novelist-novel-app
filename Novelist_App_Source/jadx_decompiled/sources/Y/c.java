package Y;

import Z1.p;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c extends T1.h implements p {

    /* renamed from: o, reason: collision with root package name */
    public int f1569o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1570p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ T1.h f1571q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, R1.c cVar) {
        super(2, cVar);
        this.f1571q = (T1.h) pVar;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((c) i((R1.c) obj2, (b) obj)).m(O1.g.f1211a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T1.h, Z1.p] */
    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        c cVar2 = new c(this.f1571q, cVar);
        cVar2.f1570p = obj;
        return cVar2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T1.h, Z1.p] */
    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f1569o;
        if (i3 == 0) {
            H2.h.E(obj);
            b bVar = (b) this.f1570p;
            this.f1569o = 1;
            obj = this.f1571q.e(bVar, this);
            S1.a aVar = S1.a.f1260k;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H2.h.E(obj);
        }
        b bVar2 = (b) obj;
        a2.h.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) bVar2.f1568b.f80l).set(true);
        return bVar2;
    }
}
