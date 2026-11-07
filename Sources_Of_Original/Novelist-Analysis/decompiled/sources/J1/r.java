package J1;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f622a;

    public r(q qVar) {
        this.f622a = qVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(r.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return H2.h.k(this.f622a, ((r) obj).f622a);
    }

    public final int hashCode() {
        return H2.h.l(this.f622a) + (r.class.hashCode() * 31);
    }

    public final String toString() {
        return "MediaSelectionOptions(imageSelectionOptions=" + this.f622a + ")";
    }
}
