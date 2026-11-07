package V;

import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class X extends T1.c {
    public FileOutputStream n;

    /* renamed from: o, reason: collision with root package name */
    public FileOutputStream f1380o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f1381p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y f1382q;

    /* renamed from: r, reason: collision with root package name */
    public int f1383r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(Y y, T1.c cVar) {
        super(cVar);
        this.f1382q = y;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f1381p = obj;
        this.f1383r |= Integer.MIN_VALUE;
        return this.f1382q.b(null, this);
    }
}
