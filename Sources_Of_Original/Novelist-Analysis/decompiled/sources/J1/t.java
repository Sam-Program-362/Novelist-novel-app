package J1;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f627b;

    public t(u uVar, s sVar) {
        this.f626a = uVar;
        this.f627b = sVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(t.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        t tVar = (t) obj;
        return H2.h.k(this.f626a, tVar.f626a) && H2.h.k(this.f627b, tVar.f627b);
    }

    public final int hashCode() {
        return H2.h.l(this.f627b) + ((H2.h.l(this.f626a) + (t.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SourceSpecification(type=" + this.f626a + ", camera=" + this.f627b + ")";
    }
}
