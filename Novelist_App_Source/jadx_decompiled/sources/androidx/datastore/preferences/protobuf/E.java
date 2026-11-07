package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: b, reason: collision with root package name */
    public static final C0121s f1972b = new C0121s(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f1973a;

    public E(C0115l c0115l) {
        AbstractC0126x.a(c0115l, "output");
        this.f1973a = c0115l;
        c0115l.f2078i = this;
    }

    public void a(int i3, Object obj, V v3) {
        C0115l c0115l = (C0115l) this.f1973a;
        c0115l.s0(i3, 3);
        v3.b((AbstractC0104a) obj, c0115l.f2078i);
        c0115l.s0(i3, 4);
    }

    public E() {
        K k3;
        S s3 = S.f2003c;
        try {
            k3 = (K) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            k3 = f1972b;
        }
        K[] kArr = {C0121s.f2110b, k3};
        D d3 = new D();
        d3.f1971a = kArr;
        Charset charset = AbstractC0126x.f2114a;
        this.f1973a = d3;
    }
}
