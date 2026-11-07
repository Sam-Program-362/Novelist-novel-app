package Y;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f1572a;

    public d(String str) {
        a2.h.e(str, "name");
        this.f1572a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return a2.h.a(this.f1572a, ((d) obj).f1572a);
    }

    public final int hashCode() {
        return this.f1572a.hashCode();
    }

    public final String toString() {
        return this.f1572a;
    }
}
