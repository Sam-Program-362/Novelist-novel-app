package O1;

import a2.h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f1203k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f1204l;

    public b(Object obj, Object obj2) {
        this.f1203k = obj;
        this.f1204l = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.f1203k, bVar.f1203k) && h.a(this.f1204l, bVar.f1204l);
    }

    public final int hashCode() {
        Object obj = this.f1203k;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f1204l;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f1203k + ", " + this.f1204l + ')';
    }
}
