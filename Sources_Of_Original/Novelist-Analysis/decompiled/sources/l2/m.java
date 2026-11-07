package l2;

import K1.C0038n;

/* JADX INFO: loaded from: classes.dex */
public final class m extends T1.c {
    public C0038n n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f4064o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4065p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0038n f4066q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f4067r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C0038n c0038n, R1.c cVar) {
        super(cVar);
        this.f4066q = c0038n;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f4064o = obj;
        this.f4065p |= Integer.MIN_VALUE;
        return this.f4066q.g(null, this);
    }
}
