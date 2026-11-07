package K1;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N f708b;

    public P(String str, N n) {
        this.f707a = str;
        this.f708b = n;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(P.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        P p3 = (P) obj;
        return p000a.a.s(this.f707a, p3.f707a) && p000a.a.s(this.f708b, p3.f708b);
    }

    public final int hashCode() {
        return p000a.a.t(this.f708b) + ((p000a.a.t(this.f707a) + (P.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f707a + ", type=" + this.f708b + ")";
    }
}
