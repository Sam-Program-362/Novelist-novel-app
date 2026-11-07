package x0;

import D.h0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final u0.b f4708a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f4709b;

    public k(u0.b bVar, h0 h0Var) {
        a2.h.e(h0Var, "_windowInsetsCompat");
        this.f4708a = bVar;
        this.f4709b = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!k.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        a2.h.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        k kVar = (k) obj;
        return a2.h.a(this.f4708a, kVar.f4708a) && a2.h.a(this.f4709b, kVar.f4709b);
    }

    public final int hashCode() {
        return this.f4709b.hashCode() + (this.f4708a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f4708a + ", windowInsetsCompat=" + this.f4709b + ')';
    }
}
