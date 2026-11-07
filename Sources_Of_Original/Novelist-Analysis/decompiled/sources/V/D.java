package V;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class D extends T1.c {
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f1301o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Serializable f1302p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a2.o f1303q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f1304r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1305s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f1306t;
    public final /* synthetic */ N u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1307v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(N n, T1.c cVar) {
        super(cVar);
        this.u = n;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f1306t = obj;
        this.f1307v |= Integer.MIN_VALUE;
        return N.f(this.u, false, this);
    }
}
