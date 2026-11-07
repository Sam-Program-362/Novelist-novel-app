package p022h0;

import a2.h;
import p000a.a;

/* JADX INFO: loaded from: classes.dex */
public final class g extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f2882m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar) {
        super(19);
        h.e(bVar, "latestEvent");
        this.f2882m = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && g.class == obj.getClass() && h.a(this.f2882m, ((g) obj).f2882m);
    }

    public final int hashCode() {
        return this.f2882m.hashCode() - 31;
    }

    @Override // p000a.a
    public final String toString() {
        return "InProgress(latestEvent=" + this.f2882m + ", direction=-1)";
    }
}
