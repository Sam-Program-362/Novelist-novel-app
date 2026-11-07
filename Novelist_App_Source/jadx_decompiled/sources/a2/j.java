package a2;

/* loaded from: classes.dex */
public final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Class f1709a;

    public j(Class cls) {
        this.f1709a = cls;
    }

    @Override // a2.d
    public final Class a() {
        return this.f1709a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            return h.a(this.f1709a, ((j) obj).f1709a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1709a.hashCode();
    }

    public final String toString() {
        return this.f1709a.toString() + " (Kotlin reflection is not available)";
    }
}
