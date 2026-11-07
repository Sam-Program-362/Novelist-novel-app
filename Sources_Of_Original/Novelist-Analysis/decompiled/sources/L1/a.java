package L1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f867a;

    public a(boolean z3) {
        this.f867a = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(a.class)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return S0.a.n(Boolean.valueOf(this.f867a), Boolean.valueOf(((a) obj).f867a));
    }

    public final int hashCode() {
        return S0.a.o(Boolean.valueOf(this.f867a)) + (a.class.hashCode() * 31);
    }

    public final String toString() {
        return "BrowserOptions(showTitle=" + this.f867a + ")";
    }
}
