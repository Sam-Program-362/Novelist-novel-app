package t1;

/* renamed from: t1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474b {

    /* renamed from: a, reason: collision with root package name */
    public final String f4547a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4548b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4549c;

    public C0474b(String str, String str2) {
        this.f4547a = str;
        this.f4548b = null;
        this.f4549c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0474b.class != obj.getClass()) {
            return false;
        }
        C0474b c0474b = (C0474b) obj;
        if (this.f4547a.equals(c0474b.f4547a)) {
            return this.f4549c.equals(c0474b.f4549c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4549c.hashCode() + (this.f4547a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DartEntrypoint( bundle path: ");
        sb.append(this.f4547a);
        sb.append(", function: ");
        return B1.e.m(sb, this.f4549c, " )");
    }

    public C0474b(String str, String str2, String str3) {
        this.f4547a = str;
        this.f4548b = str2;
        this.f4549c = str3;
    }
}
