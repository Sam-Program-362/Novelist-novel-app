package k2;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f3904a;

    public h(Throwable th) {
        this.f3904a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return a2.h.a(this.f3904a, ((h) obj).f3904a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f3904a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // k2.i
    public final String toString() {
        return "Closed(" + this.f3904a + ')';
    }
}
