package I1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f469c;

    public a(b bVar, String str, String str2) {
        this.f467a = bVar;
        this.f468b = str;
        this.f469c = str2;
    }

    public final List a() {
        return P1.f.d0(this.f467a, this.f468b, this.f469c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return S0.a.m(a(), ((a) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorizeFailure(type=");
        sb.append(this.f467a);
        sb.append(", message=");
        sb.append(this.f468b);
        sb.append(", details=");
        return B1.e.m(sb, this.f469c, ")");
    }
}
