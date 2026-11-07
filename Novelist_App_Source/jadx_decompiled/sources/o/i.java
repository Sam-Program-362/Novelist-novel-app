package o;

import M1.A;
import java.util.LinkedHashMap;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f4201a;

    /* renamed from: b, reason: collision with root package name */
    public final H0.i f4202b;

    /* renamed from: c, reason: collision with root package name */
    public final A f4203c;

    /* renamed from: d, reason: collision with root package name */
    public int f4204d;

    /* renamed from: e, reason: collision with root package name */
    public int f4205e;

    /* renamed from: f, reason: collision with root package name */
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
        a2.h.e(obj, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
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

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b6, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            java.lang.String r0 = "key"
            a2.h.e(r6, r0)
            M1.A r0 = r5.f4203c
            monitor-enter(r0)
            int r1 = r5.f4204d     // Catch: java.lang.Throwable -> L24
            int r1 = r1 + 1
            r5.f4204d = r1     // Catch: java.lang.Throwable -> L24
            H0.i r1 = r5.f4202b     // Catch: java.lang.Throwable -> L24
            r1.getClass()     // Catch: java.lang.Throwable -> L24
            java.lang.Object r1 = r1.f443l     // Catch: java.lang.Throwable -> L24
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r1.put(r6, r7)     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L27
            int r7 = r5.f4204d     // Catch: java.lang.Throwable -> L24
            int r7 = r7 + (-1)
            r5.f4204d = r7     // Catch: java.lang.Throwable -> L24
            goto L27
        L24:
            r6 = move-exception
            goto Lc1
        L27:
            monitor-exit(r0)
            int r7 = r5.f4201a
        L2a:
            M1.A r0 = r5.f4203c
            monitor-enter(r0)
            int r1 = r5.f4204d     // Catch: java.lang.Throwable -> L42
            if (r1 < 0) goto Lb7
            H0.i r1 = r5.f4202b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.f443l     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L45
            int r1 = r5.f4204d     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto Lb7
            goto L45
        L42:
            r6 = move-exception
            goto Lbf
        L45:
            int r1 = r5.f4204d     // Catch: java.lang.Throwable -> L42
            if (r1 <= r7) goto Lb5
            H0.i r1 = r5.f4202b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.f443l     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L56
            goto Lb5
        L56:
            H0.i r1 = r5.f4202b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = r1.f443l     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L42
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "map.entries"
            a2.h.d(r1, r2)     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L42
            r3 = 0
            if (r2 == 0) goto L79
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L73
            goto L88
        L73:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L42
            goto L88
        L79:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L42
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L84
            goto L88
        L84:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L42
        L88:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L8e
            monitor-exit(r0)
            return r6
        L8e:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L42
            H0.i r3 = r5.f4202b     // Catch: java.lang.Throwable -> L42
            r3.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = "key"
            a2.h.e(r1, r4)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r3.f443l     // Catch: java.lang.Throwable -> L42
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L42
            r3.remove(r1)     // Catch: java.lang.Throwable -> L42
            int r1 = r5.f4204d     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "value"
            a2.h.e(r2, r3)     // Catch: java.lang.Throwable -> L42
            int r1 = r1 + (-1)
            r5.f4204d = r1     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            goto L2a
        Lb5:
            monitor-exit(r0)
            return r6
        Lb7:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L42
            throw r7     // Catch: java.lang.Throwable -> L42
        Lbf:
            monitor-exit(r0)
            throw r6
        Lc1:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.i.b(java.lang.Object, java.lang.Object):java.lang.Object");
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
