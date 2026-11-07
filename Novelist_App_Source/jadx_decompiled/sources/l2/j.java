package l2;

import b1.C0192Q;

/* loaded from: classes.dex */
public final class j extends T1.c {
    public /* synthetic */ Object n;

    /* renamed from: o, reason: collision with root package name */
    public int f4052o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0192Q f4053p;

    /* renamed from: q, reason: collision with root package name */
    public C0192Q f4054q;

    /* renamed from: r, reason: collision with root package name */
    public e f4055r;

    /* renamed from: s, reason: collision with root package name */
    public m2.l f4056s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C0192Q c0192q, R1.c cVar) {
        super(cVar);
        this.f4053p = c0192q;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.n = obj;
        this.f4052o |= Integer.MIN_VALUE;
        return this.f4053p.h(null, this);
    }
}
