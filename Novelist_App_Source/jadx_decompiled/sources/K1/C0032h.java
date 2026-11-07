package K1;

import a.AbstractC0102a;

/* renamed from: K1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032h {

    /* renamed from: a, reason: collision with root package name */
    public final String f721a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f722b;

    public C0032h(String str, boolean z3) {
        this.f721a = str;
        this.f722b = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(C0032h.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0032h c0032h = (C0032h) obj;
        return AbstractC0102a.s(this.f721a, c0032h.f721a) && AbstractC0102a.s(Boolean.valueOf(this.f722b), Boolean.valueOf(c0032h.f722b));
    }

    public final int hashCode() {
        return AbstractC0102a.t(Boolean.valueOf(this.f722b)) + ((AbstractC0102a.t(this.f721a) + (C0032h.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f721a + ", useDataStore=" + this.f722b + ")";
    }
}
