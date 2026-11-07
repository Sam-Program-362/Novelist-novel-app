package I1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f493b;

    public g(boolean z3, boolean z4) {
        this.f492a = z3;
        this.f493b = z4;
    }

    public final List a() {
        return P1.f.d0(Boolean.valueOf(this.f492a), Boolean.valueOf(this.f493b));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return S0.a.m(a(), ((g) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "GetCredentialRequestGoogleIdOptionParams(filterToAuthorized=" + this.f492a + ", autoSelectEnabled=" + this.f493b + ")";
    }
}
