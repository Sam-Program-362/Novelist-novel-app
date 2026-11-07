package O1;

import a2.h;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f1206k;

    public /* synthetic */ d(Object obj) {
        this.f1206k = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof c) {
            return ((c) obj).f1205k;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return h.a(this.f1206k, ((d) obj).f1206k);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f1206k;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f1206k;
        if (obj instanceof c) {
            return ((c) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
