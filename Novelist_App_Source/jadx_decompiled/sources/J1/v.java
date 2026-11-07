package J1;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Long f631a;

    public v(Long l3) {
        this.f631a = l3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(v.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return H2.h.k(this.f631a, ((v) obj).f631a);
    }

    public final int hashCode() {
        return H2.h.l(this.f631a) + (v.class.hashCode() * 31);
    }

    public final String toString() {
        return "VideoSelectionOptions(maxDurationSeconds=" + this.f631a + ")";
    }
}
