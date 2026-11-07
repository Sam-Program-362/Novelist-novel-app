package i2;

/* JADX INFO: loaded from: classes.dex */
public final class U extends S {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final W f2982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final V f2983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0203k f2984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f2985h;

    public U(W w3, V v3, C0203k c0203k, Object obj) {
        this.f2982e = w3;
        this.f2983f = v3;
        this.f2984g = c0203k;
        this.f2985h = obj;
    }

    @Override // i2.S
    public final boolean k() {
        return false;
    }

    @Override // i2.S
    public final void l(Throwable th) {
        C0203k c0203k = this.f2984g;
        C0203k c0203kH = W.H(c0203k);
        W w3 = this.f2982e;
        V v3 = this.f2983f;
        Object obj = this.f2985h;
        if (c0203kH == null || !w3.Q(v3, c0203kH, obj)) {
            v3.f2989a.e(new n2.h(2), 2);
            C0203k c0203kH2 = W.H(c0203k);
            if (c0203kH2 == null || !w3.Q(v3, c0203kH2, obj)) {
                w3.m(w3.v(v3, obj));
            }
        }
    }
}
