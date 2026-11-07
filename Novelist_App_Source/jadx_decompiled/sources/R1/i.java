package R1;

import Z1.p;
import java.io.Serializable;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* loaded from: classes.dex */
public final class i implements h, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public static final i f1255k = new i();

    @Override // R1.h
    public final f e(g gVar) {
        a2.h.e(gVar, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // R1.h
    public final h i(h hVar) {
        a2.h.e(hVar, "context");
        return hVar;
    }

    @Override // R1.h
    public final h j(g gVar) {
        a2.h.e(gVar, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        return this;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // R1.h
    public final Object f(Object obj, p pVar) {
        return obj;
    }
}
