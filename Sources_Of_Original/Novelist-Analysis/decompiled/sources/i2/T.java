package i2;

/* JADX INFO: loaded from: classes.dex */
public final class T extends C0199g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0205m f2981s;

    public T(R1.c cVar, C0205m c0205m) {
        super(1, cVar);
        this.f2981s = c0205m;
    }

    @Override // i2.C0199g
    public final Throwable q(W w3) {
        Throwable thC;
        C0205m c0205m = this.f2981s;
        c0205m.getClass();
        Object obj = W.f2990k.get(c0205m);
        if (!(obj instanceof V) || (thC = ((V) obj).c()) == null) {
            return obj instanceof C0207o ? ((C0207o) obj).f3017a : w3.w();
        }
        return thC;
    }

    @Override // i2.C0199g
    public final String x() {
        return "AwaitContinuation";
    }
}
