package I1;

import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f494a;

    /* renamed from: b, reason: collision with root package name */
    public final g f495b;

    /* renamed from: c, reason: collision with root package name */
    public final String f496c;

    /* renamed from: d, reason: collision with root package name */
    public final String f497d;

    /* renamed from: e, reason: collision with root package name */
    public final String f498e;

    public h(boolean z3, g gVar, String str, String str2, String str3) {
        this.f494a = z3;
        this.f495b = gVar;
        this.f496c = str;
        this.f497d = str2;
        this.f498e = str3;
    }

    public final List a() {
        return P1.f.d0(Boolean.valueOf(this.f494a), this.f495b, this.f496c, this.f497d, this.f498e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return S0.a.m(a(), ((h) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetCredentialRequestParams(useButtonFlow=");
        sb.append(this.f494a);
        sb.append(", googleIdOptionParams=");
        sb.append(this.f495b);
        sb.append(", serverClientId=");
        sb.append(this.f496c);
        sb.append(", hostedDomain=");
        sb.append(this.f497d);
        sb.append(", nonce=");
        return B1.e.m(sb, this.f498e, ")");
    }
}
