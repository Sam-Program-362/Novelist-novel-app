package h0;

import a.AbstractC0102a;

/* renamed from: h0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264g extends AbstractC0102a {

    /* renamed from: m, reason: collision with root package name */
    public final C0259b f2882m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0264g(C0259b c0259b) {
        super(19);
        a2.h.e(c0259b, "latestEvent");
        this.f2882m = c0259b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0264g.class == obj.getClass() && a2.h.a(this.f2882m, ((C0264g) obj).f2882m);
    }

    public final int hashCode() {
        return this.f2882m.hashCode() - 31;
    }

    @Override // a.AbstractC0102a
    public final String toString() {
        return "InProgress(latestEvent=" + this.f2882m + ", direction=-1)";
    }
}
