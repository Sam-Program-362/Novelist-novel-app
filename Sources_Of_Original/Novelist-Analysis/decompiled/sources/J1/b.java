package J1;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f579c;

    public b(c cVar, a aVar, List list) {
        this.f577a = cVar;
        this.f578b = aVar;
        this.f579c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(b.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        b bVar = (b) obj;
        return H2.h.k(this.f577a, bVar.f577a) && H2.h.k(this.f578b, bVar.f578b) && H2.h.k(this.f579c, bVar.f579c);
    }

    public final int hashCode() {
        return H2.h.l(this.f579c) + ((H2.h.l(this.f578b) + ((H2.h.l(this.f577a) + (b.class.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CacheRetrievalResult(type=" + this.f577a + ", error=" + this.f578b + ", paths=" + this.f579c + ")";
    }
}
