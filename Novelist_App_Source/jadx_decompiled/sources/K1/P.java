package K1;

import a.AbstractC0102a;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public final String f707a;

    /* renamed from: b, reason: collision with root package name */
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
        return AbstractC0102a.s(this.f707a, p3.f707a) && AbstractC0102a.s(this.f708b, p3.f708b);
    }

    public final int hashCode() {
        return AbstractC0102a.t(this.f708b) + ((AbstractC0102a.t(this.f707a) + (P.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f707a + ", type=" + this.f708b + ")";
    }
}
