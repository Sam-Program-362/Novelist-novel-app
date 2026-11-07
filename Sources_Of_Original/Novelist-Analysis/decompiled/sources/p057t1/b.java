package p057t1;

import B1.e;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4549c;

    public b(String str, String str2) {
        this.f4547a = str;
        this.f4548b = null;
        this.f4549c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f4547a.equals(bVar.f4547a)) {
            return this.f4549c.equals(bVar.f4549c);
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
        return e.m(sb, this.f4549c, " )");
    }

    public b(String str, String str2, String str3) {
        this.f4547a = str;
        this.f4548b = str2;
        this.f4549c = str3;
    }
}
