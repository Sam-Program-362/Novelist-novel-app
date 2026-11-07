package K1;

/* JADX INFO: renamed from: K1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0035k extends T1.h implements Z1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f728o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y.d f729p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f730q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0035k(Y.d dVar, String str, R1.c cVar) {
        super(2, cVar);
        this.f729p = dVar;
        this.f730q = str;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        C0035k c0035k = (C0035k) i((R1.c) obj2, (Y.b) obj);
        O1.g gVar = O1.g.f1211a;
        c0035k.m(gVar);
        return gVar;
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        C0035k c0035k = new C0035k(this.f729p, this.f730q, cVar);
        c0035k.f728o = obj;
        return c0035k;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        Y.b bVar = (Y.b) this.f728o;
        H2.h.E(obj);
        bVar.d(this.f729p, this.f730q);
        return O1.g.f1211a;
    }
}
