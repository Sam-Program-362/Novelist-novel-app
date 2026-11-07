package J1;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f575a;

    /* renamed from: b, reason: collision with root package name */
    public final String f576b;

    public a(String str, String str2) {
        a2.h.e(str, "code");
        this.f575a = str;
        this.f576b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(a.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        a aVar = (a) obj;
        return H2.h.k(this.f575a, aVar.f575a) && H2.h.k(this.f576b, aVar.f576b);
    }

    public final int hashCode() {
        return H2.h.l(this.f576b) + ((H2.h.l(this.f575a) + (a.class.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CacheRetrievalError(code=" + this.f575a + ", message=" + this.f576b + ")";
    }
}
