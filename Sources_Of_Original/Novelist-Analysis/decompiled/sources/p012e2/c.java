package p012e2;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    public static final c n = new c(1, 0, 1);

    @Override // p012e2.a
    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.f2783k == cVar.f2783k && this.f2784l == cVar.f2784l;
    }

    @Override // p012e2.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2783k * 31) + this.f2784l;
    }

    @Override // p012e2.a
    public final boolean isEmpty() {
        return this.f2783k > this.f2784l;
    }

    @Override // p012e2.a
    public final String toString() {
        return this.f2783k + ".." + this.f2784l;
    }
}
