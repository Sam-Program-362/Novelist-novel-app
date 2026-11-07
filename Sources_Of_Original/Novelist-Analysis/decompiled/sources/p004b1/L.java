package p004b1;

import M1.A;
import X1.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class L extends V {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractC0176i f2593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2594l;

    public L(C0186t c0186t) throws b {
        c0186t.getClass();
        this.f2593k = c0186t;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            AbstractC0176i abstractC0176i = this.f2593k;
            if (i3 >= abstractC0176i.size()) {
                break;
            }
            int iB = ((V) abstractC0176i.get(i3)).b();
            if (i4 < iB) {
                i4 = iB;
            }
            i3++;
        }
        int i5 = i4 + 1;
        this.f2594l = i5;
        if (i5 > 8) {
            throw new b("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // p004b1.V
    public final int a() {
        return V.d((byte) -128);
    }

    @Override // p004b1.V
    public final int b() {
        return this.f2594l;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        V v3 = (V) obj;
        int iA = v3.a();
        int iD = V.d((byte) -128);
        if (iD != iA) {
            return iD - v3.a();
        }
        AbstractC0176i abstractC0176i = ((L) v3).f2593k;
        AbstractC0176i abstractC0176i2 = this.f2593k;
        if (abstractC0176i2.size() != abstractC0176i.size()) {
            return abstractC0176i2.size() - abstractC0176i.size();
        }
        for (int i3 = 0; i3 < abstractC0176i2.size(); i3++) {
            int iCompareTo = ((V) abstractC0176i2.get(i3)).compareTo((V) abstractC0176i.get(i3));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && L.class == obj.getClass()) {
            return this.f2593k.equals(((L) obj).f2593k);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(V.d((byte) -128)), this.f2593k});
    }

    public final String toString() {
        AbstractC0176i abstractC0176i = this.f2593k;
        if (abstractC0176i.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = abstractC0176i.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((V) abstractC0176i.get(i3)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it2 = arrayList.iterator();
        try {
            if (it2.hasNext()) {
                sb.append(A.m(it2.next()));
                while (it2.hasNext()) {
                    sb.append((CharSequence) ",\n  ");
                    sb.append(A.m(it2.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }
}
