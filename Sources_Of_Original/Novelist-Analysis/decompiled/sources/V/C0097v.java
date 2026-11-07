package V;

import i2.C0205m;

/* JADX INFO: renamed from: V.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0097v extends T1.c {
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public N f1474o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0205m f1475p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f1476q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ N f1477r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1478s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0097v(N n, T1.c cVar) {
        super(cVar);
        this.f1477r = n;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f1476q = obj;
        this.f1478s |= Integer.MIN_VALUE;
        return N.b(this.f1477r, null, this);
    }
}
