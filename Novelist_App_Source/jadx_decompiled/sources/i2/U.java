package i2;

/* loaded from: classes.dex */
public final class U extends S {

    /* renamed from: e, reason: collision with root package name */
    public final W f2982e;

    /* renamed from: f, reason: collision with root package name */
    public final V f2983f;

    /* renamed from: g, reason: collision with root package name */
    public final C0294k f2984g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2985h;

    public U(W w3, V v3, C0294k c0294k, Object obj) {
        this.f2982e = w3;
        this.f2983f = v3;
        this.f2984g = c0294k;
        this.f2985h = obj;
    }

    @Override // i2.S
    public final boolean k() {
        return false;
    }

    @Override // i2.S
    public final void l(Throwable th) {
        C0294k c0294k = this.f2984g;
        C0294k H3 = W.H(c0294k);
        W w3 = this.f2982e;
        V v3 = this.f2983f;
        Object obj = this.f2985h;
        if (H3 == null || !w3.Q(v3, H3, obj)) {
            v3.f2989a.e(new n2.h(2), 2);
            C0294k H4 = W.H(c0294k);
            if (H4 == null || !w3.Q(v3, H4, obj)) {
                w3.m(w3.v(v3, obj));
            }
        }
    }
}
