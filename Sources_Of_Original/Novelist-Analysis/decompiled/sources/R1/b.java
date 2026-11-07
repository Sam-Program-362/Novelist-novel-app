package R1;

import Z1.p;
import java.io.Serializable;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class b implements h, Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h f1252k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f1253l;

    public b(h hVar, f fVar) {
        a2.h.e(hVar, "left");
        a2.h.e(fVar, "element");
        this.f1252k = hVar;
        this.f1253l = fVar;
    }

    @Override // R1.h
    public final f e(g gVar) {
        a2.h.e(gVar, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        b bVar = this;
        while (true) {
            f fVarE = bVar.f1253l.e(gVar);
            if (fVarE != null) {
                return fVarE;
            }
            h hVar = bVar.f1252k;
            if (!(hVar instanceof b)) {
                return hVar.e(gVar);
            }
            bVar = (b) hVar;
        }
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            bVar.getClass();
            int i3 = 2;
            b bVar2 = bVar;
            int i4 = 2;
            while (true) {
                h hVar = bVar2.f1252k;
                bVar2 = hVar instanceof b ? (b) hVar : null;
                if (bVar2 == null) {
                    break;
                }
                i4++;
            }
            b bVar3 = this;
            while (true) {
                h hVar2 = bVar3.f1252k;
                bVar3 = hVar2 instanceof b ? (b) hVar2 : null;
                if (bVar3 == null) {
                    break;
                }
                i3++;
            }
            if (i4 == i3) {
                b bVar4 = this;
                while (true) {
                    f fVar = bVar4.f1253l;
                    if (!a2.h.a(bVar.e(fVar.getKey()), fVar)) {
                        zA = false;
                        break;
                    }
                    h hVar3 = bVar4.f1252k;
                    if (!(hVar3 instanceof b)) {
                        a2.h.c(hVar3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        f fVar2 = (f) hVar3;
                        zA = a2.h.a(bVar.e(fVar2.getKey()), fVar2);
                        break;
                    }
                    bVar4 = (b) hVar3;
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // R1.h
    public final Object f(Object obj, p pVar) {
        return pVar.e(this.f1252k.f(obj, pVar), this.f1253l);
    }

    public final int hashCode() {
        return this.f1253l.hashCode() + this.f1252k.hashCode();
    }

    @Override // R1.h
    public final h i(h hVar) {
        a2.h.e(hVar, "context");
        return hVar == i.f1255k ? this : (h) hVar.f(this, new N.d(4));
    }

    @Override // R1.h
    public final h j(g gVar) {
        a2.h.e(gVar, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        f fVar = this.f1253l;
        f fVarE = fVar.e(gVar);
        h hVar = this.f1252k;
        if (fVarE != null) {
            return hVar;
        }
        h hVarJ = hVar.j(gVar);
        if (hVarJ == hVar) {
            return this;
        }
        return hVarJ == i.f1255k ? fVar : new b(hVarJ, fVar);
    }

    public final String toString() {
        return "[" + ((String) f(StringUtils.EMPTY, new N.d(3))) + ']';
    }
}
