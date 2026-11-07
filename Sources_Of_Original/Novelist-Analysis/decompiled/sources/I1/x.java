package I1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f534f;

    public x(String str, String str2, String str3, String str4, String str5, String str6) {
        a2.h.e(str4, "email");
        a2.h.e(str5, "idToken");
        this.f529a = str;
        this.f530b = str2;
        this.f531c = str3;
        this.f532d = str4;
        this.f533e = str5;
        this.f534f = str6;
    }

    public final List a() {
        return P1.f.d0(this.f529a, this.f530b, this.f531c, this.f532d, this.f533e, this.f534f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return S0.a.m(a(), ((x) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "PlatformGoogleIdTokenCredential(displayName=" + this.f529a + ", familyName=" + this.f530b + ", givenName=" + this.f531c + ", email=" + this.f532d + ", idToken=" + this.f533e + ", profilePictureUri=" + this.f534f + ")";
    }
}
