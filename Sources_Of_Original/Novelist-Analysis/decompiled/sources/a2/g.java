package a2;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends c implements f, p016f2.a, O1.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f1705q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1706r;

    public g(int i3, Class cls, String str, String str2, int i4) {
        this(i3, b.f1697k, cls, str, str2, i4, 0);
    }

    @Override // a2.f
    public final int b() {
        return this.f1705q;
    }

    @Override // a2.c
    public final p016f2.a c() {
        p.f1714a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.n.equals(gVar.n) && this.f1701o.equals(gVar.f1701o) && this.f1706r == gVar.f1706r && this.f1705q == gVar.f1705q && h.a(this.f1699l, gVar.f1699l) && g().equals(gVar.g());
        }
        if (!(obj instanceof g)) {
            return false;
        }
        p016f2.a aVar = this.f1698k;
        if (aVar == null) {
            c();
            this.f1698k = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    public final int hashCode() {
        g();
        return this.f1701o.hashCode() + ((this.n.hashCode() + (g().hashCode() * 31)) * 31);
    }

    public final String toString() {
        p016f2.a aVar = this.f1698k;
        if (aVar == null) {
            c();
            this.f1698k = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.n;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : p055t.a.b("function ", str, " (Kotlin reflection is not available)");
    }

    public g(int i3, Object obj, Class cls, String str, String str2, int i4, int i5) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.f1705q = i3;
        this.f1706r = 0;
    }
}
