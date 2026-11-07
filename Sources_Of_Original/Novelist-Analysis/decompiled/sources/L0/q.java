package L0;

import java.util.Arrays;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0041a f836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J0.c f837b;

    public /* synthetic */ q(C0041a c0041a, J0.c cVar) {
        this.f836a = c0041a;
        this.f837b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof q)) {
            q qVar = (q) obj;
            if (M0.r.i(this.f836a, qVar.f836a) && M0.r.i(this.f837b, qVar.f837b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f836a, this.f837b});
    }

    public final String toString() {
        A.c cVar = new A.c(this);
        cVar.h(this.f836a, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        cVar.h(this.f837b, "feature");
        return cVar.toString();
    }
}
