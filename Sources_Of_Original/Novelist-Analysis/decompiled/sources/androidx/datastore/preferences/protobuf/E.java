package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0119s f1972b = new C0119s(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1973a;

    public E(C0113l c0113l) {
        AbstractC0124x.a(c0113l, "output");
        this.f1973a = c0113l;
        c0113l.f2078i = this;
    }

    public void a(int i3, Object obj, V v3) {
        C0113l c0113l = (C0113l) this.f1973a;
        c0113l.s0(i3, 3);
        v3.b((AbstractC0102a) obj, c0113l.f2078i);
        c0113l.s0(i3, 4);
    }

    public E() {
        K k3;
        S s3 = S.f2003c;
        try {
            k3 = (K) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            k3 = f1972b;
        }
        K[] kArr = {C0119s.f2110b, k3};
        D d3 = new D();
        d3.f1971a = kArr;
        Charset charset = AbstractC0124x.f2114a;
        this.f1973a = d3;
    }
}
