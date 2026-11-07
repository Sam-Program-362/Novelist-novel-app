package L1;

import java.util.Map;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f879a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f880b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f881c;

    public k(boolean z3, boolean z4, Map map) {
        this.f879a = z3;
        this.f880b = z4;
        this.f881c = map;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(k.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        k kVar = (k) obj;
        return S0.a.n(Boolean.valueOf(this.f879a), Boolean.valueOf(kVar.f879a)) && S0.a.n(Boolean.valueOf(this.f880b), Boolean.valueOf(kVar.f880b)) && S0.a.n(this.f881c, kVar.f881c);
    }

    public final int hashCode() {
        return S0.a.o(this.f881c) + ((S0.a.o(Boolean.valueOf(this.f880b)) + ((S0.a.o(Boolean.valueOf(this.f879a)) + (k.class.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WebViewOptions(enableJavaScript=" + this.f879a + ", enableDomStorage=" + this.f880b + ", headers=" + this.f881c + ")";
    }
}
