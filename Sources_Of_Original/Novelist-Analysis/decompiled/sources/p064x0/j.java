package p064x0;

import P1.e;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4707a;

    public j(List list) {
        this.f4707a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !j.class.equals(obj.getClass())) {
            return false;
        }
        return this.f4707a.equals(((j) obj).f4707a);
    }

    public final int hashCode() {
        return this.f4707a.hashCode();
    }

    public final String toString() {
        return e.i0((Collection) this.f4707a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
