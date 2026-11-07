package I1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f481c;

    public e(f fVar, String str, String str2) {
        this.f479a = fVar;
        this.f480b = str;
        this.f481c = str2;
    }

    public final List a() {
        return P1.f.d0(this.f479a, this.f480b, this.f481c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return S0.a.m(a(), ((e) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetCredentialFailure(type=");
        sb.append(this.f479a);
        sb.append(", message=");
        sb.append(this.f480b);
        sb.append(", details=");
        return B1.e.m(sb, this.f481c, ")");
    }
}
