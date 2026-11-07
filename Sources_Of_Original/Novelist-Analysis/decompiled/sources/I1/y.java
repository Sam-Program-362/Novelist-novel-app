package I1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f536b;

    public y(String str, List list) {
        this.f535a = str;
        this.f536b = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        y yVar = (y) obj;
        return S0.a.m(P1.f.d0(this.f535a, this.f536b), P1.f.d0(yVar.f535a, yVar.f536b));
    }

    public final int hashCode() {
        return P1.f.d0(this.f535a, this.f536b).hashCode();
    }

    public final String toString() {
        return "PlatformRevokeAccessRequest(accountEmail=" + this.f535a + ", scopes=" + this.f536b + ")";
    }
}
