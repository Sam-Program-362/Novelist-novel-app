package l2;

import K1.C0038n;
import p004b1.Q;

/* JADX INFO: loaded from: classes.dex */
public final class l extends T1.c {
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4061o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Q f4062p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C0038n f4063q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Q q3, R1.c cVar) {
        super(cVar);
        this.f4062p = q3;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.n = obj;
        this.f4061o |= Integer.MIN_VALUE;
        return this.f4062p.h(null, this);
    }
}
