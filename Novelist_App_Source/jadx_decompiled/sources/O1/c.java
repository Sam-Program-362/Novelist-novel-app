package O1;

import a2.h;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Throwable f1205k;

    public c(Throwable th) {
        h.e(th, "exception");
        this.f1205k = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            return h.a(this.f1205k, ((c) obj).f1205k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1205k.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f1205k + ')';
    }
}
