package I1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f528c;

    public w(String str, List list, String str2) {
        a2.h.e(list, "grantedScopes");
        this.f526a = str;
        this.f527b = str2;
        this.f528c = list;
    }

    public final List a() {
        return P1.f.d0(this.f526a, this.f527b, this.f528c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return S0.a.m(a(), ((w) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "PlatformAuthorizationResult(accessToken=" + this.f526a + ", serverAuthCode=" + this.f527b + ", grantedScopes=" + this.f528c + ")";
    }
}
