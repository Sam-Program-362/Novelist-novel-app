package l2;

import K1.C0038n;
import b1.C0192Q;

/* loaded from: classes.dex */
public final class l extends T1.c {
    public /* synthetic */ Object n;

    /* renamed from: o, reason: collision with root package name */
    public int f4061o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0192Q f4062p;

    /* renamed from: q, reason: collision with root package name */
    public C0038n f4063q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(C0192Q c0192q, R1.c cVar) {
        super(cVar);
        this.f4062p = c0192q;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.n = obj;
        this.f4061o |= Integer.MIN_VALUE;
        return this.f4062p.h(null, this);
    }
}
