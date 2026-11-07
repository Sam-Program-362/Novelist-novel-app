package a2;

import f2.InterfaceC0247a;
import t.AbstractC0468a;

/* loaded from: classes.dex */
public abstract class g extends c implements f, InterfaceC0247a, O1.a {

    /* renamed from: q, reason: collision with root package name */
    public final int f1705q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1706r;

    public g(int i3, Class cls, String str, String str2, int i4) {
        this(i3, b.f1697k, cls, str, str2, i4, 0);
    }

    @Override // a2.f
    public final int b() {
        return this.f1705q;
    }

    @Override // a2.c
    public final InterfaceC0247a c() {
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
        InterfaceC0247a interfaceC0247a = this.f1698k;
        if (interfaceC0247a == null) {
            c();
            this.f1698k = this;
            interfaceC0247a = this;
        }
        return obj.equals(interfaceC0247a);
    }

    public final int hashCode() {
        g();
        return this.f1701o.hashCode() + ((this.n.hashCode() + (g().hashCode() * 31)) * 31);
    }

    public final String toString() {
        InterfaceC0247a interfaceC0247a = this.f1698k;
        if (interfaceC0247a == null) {
            c();
            this.f1698k = this;
            interfaceC0247a = this;
        }
        if (interfaceC0247a != this) {
            return interfaceC0247a.toString();
        }
        String str = this.n;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC0468a.b("function ", str, " (Kotlin reflection is not available)");
    }

    public g(int i3, Object obj, Class cls, String str, String str2, int i4, int i5) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.f1705q = i3;
        this.f1706r = 0;
    }
}
