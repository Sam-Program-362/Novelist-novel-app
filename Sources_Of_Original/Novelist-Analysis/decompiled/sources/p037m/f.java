package p037m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f4093k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f4094l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WeakHashMap f4095m = new WeakHashMap();
    public int n = 0;

    public c a(Object obj) {
        c cVar = this.f4093k;
        while (cVar != null && !cVar.f4087k.equals(obj)) {
            cVar = cVar.f4089m;
        }
        return cVar;
    }

    public Object b(Object obj) {
        c cVarA = a(obj);
        if (cVarA == null) {
            return null;
        }
        this.n--;
        WeakHashMap weakHashMap = this.f4095m;
        if (!weakHashMap.isEmpty()) {
            Iterator it2 = weakHashMap.keySet().iterator();
            while (it2.hasNext()) {
                ((e) it2.next()).a(cVarA);
            }
        }
        c cVar = cVarA.n;
        if (cVar != null) {
            cVar.f4089m = cVarA.f4089m;
        } else {
            this.f4093k = cVarA.f4089m;
        }
        c cVar2 = cVarA.f4089m;
        if (cVar2 != null) {
            cVar2.n = cVar;
        } else {
            this.f4094l = cVar;
        }
        cVarA.f4089m = null;
        cVarA.n = null;
        return cVarA.f4088l;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.n != fVar.n) {
            return false;
        }
        Iterator it2 = iterator();
        Iterator it3 = fVar.iterator();
        while (true) {
            bVar = (b) it2;
            if (!bVar.hasNext()) {
                break;
            }
            b bVar2 = (b) it3;
            if (!bVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            Object next = bVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (bVar.hasNext() || ((b) it3).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it2 = iterator();
        int iHashCode = 0;
        while (true) {
            b bVar = (b) it2;
            if (!bVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f4093k, this.f4094l, 0);
        this.f4095m.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it2 = iterator();
        while (true) {
            b bVar = (b) it2;
            if (!bVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) bVar.next()).toString());
            if (bVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
