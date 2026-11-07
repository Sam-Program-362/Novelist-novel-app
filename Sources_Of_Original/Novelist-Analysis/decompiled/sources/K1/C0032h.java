package K1;

/* JADX INFO: renamed from: K1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0032h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
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
        return p000a.a.s(this.f721a, c0032h.f721a) && p000a.a.s(Boolean.valueOf(this.f722b), Boolean.valueOf(c0032h.f722b));
    }

    public final int hashCode() {
        return p000a.a.t(Boolean.valueOf(this.f722b)) + ((p000a.a.t(this.f721a) + (C0032h.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f721a + ", useDataStore=" + this.f722b + ")";
    }
}
