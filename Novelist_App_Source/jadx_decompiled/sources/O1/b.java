package O1;

import a2.h;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Object f1203k;

    /* renamed from: l, reason: collision with root package name */
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
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f1204l;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f1203k + ", " + this.f1204l + ')';
    }
}
