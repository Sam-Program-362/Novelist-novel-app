package E0;

import M0.r;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c implements K0.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f287m;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f288k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f289l;

    static {
        A.c cVar = new A.c(14, false);
        cVar.f6l = Boolean.FALSE;
        f287m = new c(cVar);
    }

    public c(A.c cVar) {
        this.f288k = ((Boolean) cVar.f6l).booleanValue();
        this.f289l = (String) cVar.f7m;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return r.i(null, null) && this.f288k == cVar.f288k && r.i(this.f289l, cVar.f289l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f288k), this.f289l});
    }
}
