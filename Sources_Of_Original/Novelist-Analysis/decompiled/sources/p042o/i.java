package p042o;

import M1.A;
import a2.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H0.i f4202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f4203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4206f;

    public i(int i3) {
        this.f4201a = i3;
        if (i3 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f4202b = new H0.i();
        this.f4203c = new A(27);
    }

    public final Object a(Object obj) {
        h.e(obj, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        synchronized (this.f4203c) {
            H0.i iVar = this.f4202b;
            iVar.getClass();
            Object obj2 = ((LinkedHashMap) iVar.f443l).get(obj);
            if (obj2 != null) {
                this.f4205e++;
                return obj2;
            }
            this.f4206f++;
            return null;
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object objPut;
        h.e(obj, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        synchronized (this.f4203c) {
            this.f4204d++;
            H0.i iVar = this.f4202b;
            iVar.getClass();
            objPut = ((LinkedHashMap) iVar.f443l).put(obj, obj2);
            if (objPut != null) {
                this.f4204d--;
            }
        }
        int i3 = this.f4201a;
        while (true) {
            synchronized (this.f4203c) {
                try {
                    if (this.f4204d < 0 || (((LinkedHashMap) this.f4202b.f443l).isEmpty() && this.f4204d != 0)) {
                        break;
                    }
                    if (this.f4204d > i3 && !((LinkedHashMap) this.f4202b.f443l).isEmpty()) {
                        Set setEntrySet = ((LinkedHashMap) this.f4202b.f443l).entrySet();
                        h.d(setEntrySet, "map.entries");
                        Object next = null;
                        if (setEntrySet instanceof List) {
                            List list = (List) setEntrySet;
                            if (!list.isEmpty()) {
                                next = list.get(0);
                            }
                        } else {
                            Iterator it2 = setEntrySet.iterator();
                            if (it2.hasNext()) {
                                next = it2.next();
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry == null) {
                            return objPut;
                        }
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        H0.i iVar2 = this.f4202b;
                        iVar2.getClass();
                        h.e(key, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
                        ((LinkedHashMap) iVar2.f443l).remove(key);
                        int i4 = this.f4204d;
                        h.e(value, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
                        this.f4204d = i4 - 1;
                    }
                    return objPut;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.f4203c) {
            try {
                int i3 = this.f4205e;
                int i4 = this.f4206f + i3;
                str = "LruCache[maxSize=" + this.f4201a + ",hits=" + this.f4205e + ",misses=" + this.f4206f + ",hitRate=" + (i4 != 0 ? (i3 * 100) / i4 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
