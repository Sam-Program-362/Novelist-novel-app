package J1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f588c;

    public e(boolean z3, boolean z4, Long l3) {
        this.f586a = z3;
        this.f587b = z4;
        this.f588c = l3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(e.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        e eVar = (e) obj;
        return H2.h.k(Boolean.valueOf(this.f586a), Boolean.valueOf(eVar.f586a)) && H2.h.k(Boolean.valueOf(this.f587b), Boolean.valueOf(eVar.f587b)) && H2.h.k(this.f588c, eVar.f588c);
    }

    public final int hashCode() {
        return H2.h.l(this.f588c) + ((H2.h.l(Boolean.valueOf(this.f587b)) + ((H2.h.l(Boolean.valueOf(this.f586a)) + (e.class.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GeneralOptions(allowMultiple=" + this.f586a + ", usePhotoPicker=" + this.f587b + ", limit=" + this.f588c + ")";
    }
}
