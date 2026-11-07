package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: m.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0426f implements Iterable {

    /* renamed from: k, reason: collision with root package name */
    public C0423c f4093k;

    /* renamed from: l, reason: collision with root package name */
    public C0423c f4094l;

    /* renamed from: m, reason: collision with root package name */
    public final WeakHashMap f4095m = new WeakHashMap();
    public int n = 0;

    public C0423c a(Object obj) {
        C0423c c0423c = this.f4093k;
        while (c0423c != null && !c0423c.f4087k.equals(obj)) {
            c0423c = c0423c.f4089m;
        }
        return c0423c;
    }

    public Object b(Object obj) {
        C0423c a3 = a(obj);
        if (a3 == null) {
            return null;
        }
        this.n--;
        WeakHashMap weakHashMap = this.f4095m;
        if (!weakHashMap.isEmpty()) {
            Iterator it2 = weakHashMap.keySet().iterator();
            while (it2.hasNext()) {
                ((AbstractC0425e) it2.next()).a(a3);
            }
        }
        C0423c c0423c = a3.n;
        if (c0423c != null) {
            c0423c.f4089m = a3.f4089m;
        } else {
            this.f4093k = a3.f4089m;
        }
        C0423c c0423c2 = a3.f4089m;
        if (c0423c2 != null) {
            c0423c2.n = c0423c;
        } else {
            this.f4094l = c0423c;
        }
        a3.f4089m = null;
        a3.n = null;
        return a3.f4088l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((m.C0422b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof m.C0426f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            m.f r7 = (m.C0426f) r7
            int r1 = r6.n
            int r3 = r7.n
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            m.b r3 = (m.C0422b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            m.b r4 = (m.C0422b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            m.b r7 = (m.C0422b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m.C0426f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it2 = iterator();
        int i3 = 0;
        while (true) {
            C0422b c0422b = (C0422b) it2;
            if (!c0422b.hasNext()) {
                return i3;
            }
            i3 += ((Map.Entry) c0422b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0422b c0422b = new C0422b(this.f4093k, this.f4094l, 0);
        this.f4095m.put(c0422b, Boolean.FALSE);
        return c0422b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it2 = iterator();
        while (true) {
            C0422b c0422b = (C0422b) it2;
            if (!c0422b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c0422b.next()).toString());
            if (c0422b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
