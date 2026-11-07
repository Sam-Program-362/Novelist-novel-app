package i2;

/* loaded from: classes.dex */
public final class T extends C0290g {

    /* renamed from: s, reason: collision with root package name */
    public final C0296m f2981s;

    public T(R1.c cVar, C0296m c0296m) {
        super(1, cVar);
        this.f2981s = c0296m;
    }

    @Override // i2.C0290g
    public final Throwable q(W w3) {
        Throwable c3;
        C0296m c0296m = this.f2981s;
        c0296m.getClass();
        Object obj = W.f2990k.get(c0296m);
        return (!(obj instanceof V) || (c3 = ((V) obj).c()) == null) ? obj instanceof C0298o ? ((C0298o) obj).f3017a : w3.w() : c3;
    }

    @Override // i2.C0290g
    public final String x() {
        return "AwaitContinuation";
    }
}
