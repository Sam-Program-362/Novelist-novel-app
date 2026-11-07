package K1;

/* JADX INFO: loaded from: classes.dex */
public final class I extends T1.h implements Z1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f686o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y.d f687p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f688q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Y.d dVar, long j3, R1.c cVar) {
        super(2, cVar);
        this.f687p = dVar;
        this.f688q = j3;
    }

    @Override // Z1.p
    public final Object e(Object obj, Object obj2) {
        I i3 = (I) i((R1.c) obj2, (Y.b) obj);
        O1.g gVar = O1.g.f1211a;
        i3.m(gVar);
        return gVar;
    }

    @Override // T1.a
    public final R1.c i(R1.c cVar, Object obj) {
        I i3 = new I(this.f687p, this.f688q, cVar);
        i3.f686o = obj;
        return i3;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        Y.b bVar = (Y.b) this.f686o;
        H2.h.E(obj);
        bVar.d(this.f687p, new Long(this.f688q));
        return O1.g.f1211a;
    }
}
