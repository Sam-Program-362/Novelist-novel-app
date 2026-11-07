package p064x0;

import D.h0;
import a2.h;
import p058u0.b;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f4708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f4709b;

    public k(b bVar, h0 h0Var) {
        h.e(h0Var, "_windowInsetsCompat");
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
        h.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        k kVar = (k) obj;
        return h.a(this.f4708a, kVar.f4708a) && h.a(this.f4709b, kVar.f4709b);
    }

    public final int hashCode() {
        return this.f4709b.hashCode() + (this.f4708a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f4708a + ", windowInsetsCompat=" + this.f4709b + ')';
    }
}
