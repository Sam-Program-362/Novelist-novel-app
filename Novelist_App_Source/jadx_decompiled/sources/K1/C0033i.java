package K1;

import java.util.List;

/* renamed from: K1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033i extends T1.h implements Z1.p {

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f723o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ List f724p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0033i(List list, R1.c cVar) {
        super(2, cVar);
        this.f724p = list;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        C0033i c0033i = (C0033i) i((R1.c) obj2, (Y.b) obj);
        O1.g gVar = O1.g.f1211a;
        c0033i.m(gVar);
        return gVar;
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        C0033i c0033i = new C0033i(this.f724p, cVar);
        c0033i.f723o = obj;
        return c0033i;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        Y.b bVar = (Y.b) this.f723o;
        H2.h.E(obj);
        List<String> list = this.f724p;
        if (list != null) {
            for (String str : list) {
                a2.h.e(str, "name");
                Y.d dVar = new Y.d(str);
                bVar.b();
                bVar.f1567a.remove(dVar);
            }
        } else {
            bVar.b();
            bVar.f1567a.clear();
        }
        return O1.g.f1211a;
    }
}
