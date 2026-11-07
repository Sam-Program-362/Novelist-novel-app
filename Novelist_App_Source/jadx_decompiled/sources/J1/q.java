package J1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Double f619a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f620b;

    /* renamed from: c, reason: collision with root package name */
    public final long f621c;

    public q(Double d3, Double d4, long j3) {
        this.f619a = d3;
        this.f620b = d4;
        this.f621c = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(q.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        q qVar = (q) obj;
        return H2.h.k(this.f619a, qVar.f619a) && H2.h.k(this.f620b, qVar.f620b) && H2.h.k(Long.valueOf(this.f621c), Long.valueOf(qVar.f621c));
    }

    public final int hashCode() {
        return H2.h.l(Long.valueOf(this.f621c)) + ((H2.h.l(this.f620b) + ((H2.h.l(this.f619a) + (q.class.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImageSelectionOptions(maxWidth=" + this.f619a + ", maxHeight=" + this.f620b + ", quality=" + this.f621c + ")";
    }
}
