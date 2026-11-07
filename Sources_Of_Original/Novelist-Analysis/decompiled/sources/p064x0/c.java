package p064x0;

import a2.h;
import p058u0.b;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f4690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f4692c;

    public c(b bVar, b bVar2, b bVar3) {
        int i3 = bVar.f4586b;
        this.f4690a = bVar;
        this.f4691b = bVar2;
        this.f4692c = bVar3;
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
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        h.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return h.a(this.f4690a, cVar.f4690a) && h.a(this.f4691b, cVar.f4691b) && h.a(this.f4692c, cVar.f4692c);
    }

    public final int hashCode() {
        return this.f4692c.hashCode() + ((this.f4691b.hashCode() + (this.f4690a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f4690a + ", type=" + this.f4691b + ", state=" + this.f4692c + " }";
    }
}
