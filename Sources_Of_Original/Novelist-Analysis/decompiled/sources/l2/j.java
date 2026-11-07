package l2;

import p004b1.Q;

/* JADX INFO: loaded from: classes.dex */
public final class j extends T1.c {
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4052o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Q f4053p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Q f4054q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public e f4055r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m2.l f4056s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Q q3, R1.c cVar) {
        super(cVar);
        this.f4053p = q3;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.n = obj;
        this.f4052o |= Integer.MIN_VALUE;
        return this.f4053p.h(null, this);
    }
}
