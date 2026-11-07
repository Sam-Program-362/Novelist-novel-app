package V;

import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class O extends T1.c {
    public Object n;

    /* renamed from: o, reason: collision with root package name */
    public FileInputStream f1351o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1352p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P f1353q;

    /* renamed from: r, reason: collision with root package name */
    public int f1354r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(P p3, T1.c cVar) {
        super(cVar);
        this.f1353q = p3;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f1352p = obj;
        this.f1354r |= Integer.MIN_VALUE;
        return P.a(this.f1353q, this);
    }
}
