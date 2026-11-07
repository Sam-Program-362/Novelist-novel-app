package a2;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends c implements p016f2.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f1710q;

    public l(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, true);
        this.f1710q = false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return g().equals(lVar.g()) && this.n.equals(lVar.n) && this.f1701o.equals(lVar.f1701o) && h.a(this.f1699l, lVar.f1699l);
        }
        if (obj instanceof p016f2.c) {
            return obj.equals(i());
        }
        return false;
    }

    public final int hashCode() {
        return this.f1701o.hashCode() + ((this.n.hashCode() + (g().hashCode() * 31)) * 31);
    }

    public final p016f2.a i() {
        if (this.f1710q) {
            return this;
        }
        p016f2.a aVar = this.f1698k;
        if (aVar != null) {
            return aVar;
        }
        p016f2.a aVarC = c();
        this.f1698k = aVarC;
        return aVarC;
    }

    public final String toString() {
        p016f2.a aVarI = i();
        return aVarI != this ? aVarI.toString() : B1.e.m(new StringBuilder("property "), this.n, " (Kotlin reflection is not available)");
    }
}
