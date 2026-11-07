package Y;

import Z1.p;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h extends T1.h implements p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1575o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1576p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ T1.h f1577q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(p pVar, R1.c cVar) {
        super(2, cVar);
        this.f1577q = (T1.h) pVar;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        return ((h) i((R1.c) obj2, (b) obj)).m(O1.g.f1211a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T1.h, Z1.p] */
    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        h hVar = new h(this.f1577q, cVar);
        hVar.f1576p = obj;
        return hVar;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [T1.h, Z1.p] */
    @Override // T1.a
    public final Object m(Object obj) {
        int i3 = this.f1575o;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = (b) this.f1576p;
            H2.h.E(obj);
            return bVar;
        }
        H2.h.E(obj);
        b bVar2 = new b(new LinkedHashMap(((b) this.f1576p).a()), false);
        this.f1576p = bVar2;
        this.f1575o = 1;
        Object objE = this.f1577q.e(bVar2, this);
        S1.a aVar = S1.a.f1260k;
        return objE == aVar ? aVar : bVar2;
    }
}
