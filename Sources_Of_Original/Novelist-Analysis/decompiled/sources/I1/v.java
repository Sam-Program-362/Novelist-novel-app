package I1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f525d;

    public v(List list, String str, String str2, String str3) {
        this.f522a = list;
        this.f523b = str;
        this.f524c = str2;
        this.f525d = str3;
    }

    public final List a() {
        return P1.f.d0(this.f522a, this.f523b, this.f524c, this.f525d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return S0.a.m(a(), ((v) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "PlatformAuthorizationRequest(scopes=" + this.f522a + ", hostedDomain=" + this.f523b + ", accountEmail=" + this.f524c + ", serverClientIdForForcedRefreshToken=" + this.f525d + ")";
    }
}
