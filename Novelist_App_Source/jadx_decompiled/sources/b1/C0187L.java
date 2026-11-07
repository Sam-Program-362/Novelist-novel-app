package b1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: b1.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187L extends AbstractC0196V {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0205i f2593k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2594l;

    public C0187L(C0216t c0216t) {
        c0216t.getClass();
        this.f2593k = c0216t;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            AbstractC0205i abstractC0205i = this.f2593k;
            if (i3 >= abstractC0205i.size()) {
                break;
            }
            int b3 = ((AbstractC0196V) abstractC0205i.get(i3)).b();
            if (i4 < b3) {
                i4 = b3;
            }
            i3++;
        }
        int i5 = i4 + 1;
        this.f2594l = i5;
        if (i5 > 8) {
            throw new X1.b("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // b1.AbstractC0196V
    public final int a() {
        return AbstractC0196V.d(Byte.MIN_VALUE);
    }

    @Override // b1.AbstractC0196V
    public final int b() {
        return this.f2594l;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC0196V abstractC0196V = (AbstractC0196V) obj;
        int a3 = abstractC0196V.a();
        int d3 = AbstractC0196V.d(Byte.MIN_VALUE);
        if (d3 != a3) {
            return d3 - abstractC0196V.a();
        }
        AbstractC0205i abstractC0205i = ((C0187L) abstractC0196V).f2593k;
        AbstractC0205i abstractC0205i2 = this.f2593k;
        if (abstractC0205i2.size() != abstractC0205i.size()) {
            return abstractC0205i2.size() - abstractC0205i.size();
        }
        for (int i3 = 0; i3 < abstractC0205i2.size(); i3++) {
            int compareTo = ((AbstractC0196V) abstractC0205i2.get(i3)).compareTo((AbstractC0196V) abstractC0205i.get(i3));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0187L.class == obj.getClass()) {
            return this.f2593k.equals(((C0187L) obj).f2593k);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC0196V.d(Byte.MIN_VALUE)), this.f2593k});
    }

    public final String toString() {
        AbstractC0205i abstractC0205i = this.f2593k;
        if (abstractC0205i.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = abstractC0205i.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((AbstractC0196V) abstractC0205i.get(i3)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it2 = arrayList.iterator();
        try {
            if (it2.hasNext()) {
                sb.append(M1.A.m(it2.next()));
                while (it2.hasNext()) {
                    sb.append((CharSequence) ",\n  ");
                    sb.append(M1.A.m(it2.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }
}
