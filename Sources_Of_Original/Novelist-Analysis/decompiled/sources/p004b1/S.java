package p004b1;

import M1.A;
import X1.b;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class S extends V {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2601k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0182o f2602l;

    public S(C0182o c0182o) throws b {
        c0182o.getClass();
        this.f2602l = c0182o;
        AbstractC0192z abstractC0192zD = c0182o.entrySet().d();
        int i3 = 0;
        while (abstractC0192zD.hasNext()) {
            Map.Entry entry = (Map.Entry) abstractC0192zD.next();
            int iB = ((V) entry.getKey()).b();
            i3 = i3 < iB ? iB : i3;
            int iB2 = ((V) entry.getValue()).b();
            if (i3 < iB2) {
                i3 = iB2;
            }
        }
        int i4 = i3 + 1;
        this.f2601k = i4;
        if (i4 > 8) {
            throw new b("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // p004b1.V
    public final int a() {
        return V.d((byte) -96);
    }

    @Override // p004b1.V
    public final int b() {
        return this.f2601k;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompareTo;
        V v3 = (V) obj;
        int iA = v3.a();
        int iD = V.d((byte) -96);
        if (iD != iA) {
            return iD - v3.a();
        }
        C0182o c0182o = ((S) v3).f2602l;
        C0182o c0182o2 = this.f2602l;
        if (c0182o2.n.size() != c0182o.n.size()) {
            return c0182o2.n.size() - c0182o.n.size();
        }
        AbstractC0192z abstractC0192zD = c0182o2.entrySet().d();
        AbstractC0192z abstractC0192zD2 = c0182o.entrySet().d();
        do {
            if (!abstractC0192zD.hasNext() && !abstractC0192zD2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) abstractC0192zD.next();
            Map.Entry entry2 = (Map.Entry) abstractC0192zD2.next();
            int iCompareTo2 = ((V) entry.getKey()).compareTo((V) entry2.getKey());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            iCompareTo = ((V) entry.getValue()).compareTo((V) entry2.getValue());
        } while (iCompareTo == 0);
        return iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && S.class == obj.getClass()) {
            return this.f2602l.equals(((S) obj).f2602l);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(V.d((byte) -96)), this.f2602l});
    }

    public final String toString() {
        C0182o c0182o = this.f2602l;
        if (c0182o.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC0192z abstractC0192zD = c0182o.entrySet().d();
        while (abstractC0192zD.hasNext()) {
            Map.Entry entry = (Map.Entry) abstractC0192zD.next();
            linkedHashMap.put(((V) entry.getKey()).toString().replace("\n", "\n  "), ((V) entry.getValue()).toString().replace("\n", "\n  "));
        }
        A a3 = new A(13);
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            AbstractC0168a.g(sb, linkedHashMap.entrySet().iterator(), a3);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }
}
