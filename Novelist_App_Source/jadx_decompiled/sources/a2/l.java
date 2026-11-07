package a2;

import f2.InterfaceC0247a;
import f2.InterfaceC0249c;

/* loaded from: classes.dex */
public abstract class l extends c implements InterfaceC0249c {

    /* renamed from: q, reason: collision with root package name */
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
        if (obj instanceof InterfaceC0249c) {
            return obj.equals(i());
        }
        return false;
    }

    public final int hashCode() {
        return this.f1701o.hashCode() + ((this.n.hashCode() + (g().hashCode() * 31)) * 31);
    }

    public final InterfaceC0247a i() {
        if (this.f1710q) {
            return this;
        }
        InterfaceC0247a interfaceC0247a = this.f1698k;
        if (interfaceC0247a != null) {
            return interfaceC0247a;
        }
        InterfaceC0247a c3 = c();
        this.f1698k = c3;
        return c3;
    }

    public final String toString() {
        InterfaceC0247a i3 = i();
        return i3 != this ? i3.toString() : B1.e.m(new StringBuilder("property "), this.n, " (Kotlin reflection is not available)");
    }
}
