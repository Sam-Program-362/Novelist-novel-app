package x0;

/* renamed from: x0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493c {

    /* renamed from: a, reason: collision with root package name */
    public final u0.b f4690a;

    /* renamed from: b, reason: collision with root package name */
    public final C0492b f4691b;

    /* renamed from: c, reason: collision with root package name */
    public final C0492b f4692c;

    public C0493c(u0.b bVar, C0492b c0492b, C0492b c0492b2) {
        int i3 = bVar.f4586b;
        this.f4690a = bVar;
        this.f4691b = c0492b;
        this.f4692c = c0492b2;
        int i4 = bVar.f4587c;
        int i5 = bVar.f4585a;
        if (i4 - i5 == 0 && bVar.f4588d - i3 == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (i5 != 0 && i3 != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0493c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        a2.h.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        C0493c c0493c = (C0493c) obj;
        return a2.h.a(this.f4690a, c0493c.f4690a) && a2.h.a(this.f4691b, c0493c.f4691b) && a2.h.a(this.f4692c, c0493c.f4692c);
    }

    public final int hashCode() {
        return this.f4692c.hashCode() + ((this.f4691b.hashCode() + (this.f4690a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return C0493c.class.getSimpleName() + " { " + this.f4690a + ", type=" + this.f4691b + ", state=" + this.f4692c + " }";
    }
}
