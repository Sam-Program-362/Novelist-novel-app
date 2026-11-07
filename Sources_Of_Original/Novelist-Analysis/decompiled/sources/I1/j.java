package I1;

/* JADX INFO: loaded from: classes.dex */
public final class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f499a;

    public j(x xVar) {
        this.f499a = xVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return S0.a.m(E2.a.B(this.f499a), E2.a.B(((j) obj).f499a));
    }

    public final int hashCode() {
        return E2.a.B(this.f499a).hashCode();
    }

    public final String toString() {
        return "GetCredentialSuccess(credential=" + this.f499a + ")";
    }
}
