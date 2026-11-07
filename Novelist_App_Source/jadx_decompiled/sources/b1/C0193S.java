package b1;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: b1.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193S extends AbstractC0196V {

    /* renamed from: k, reason: collision with root package name */
    public final int f2601k;

    /* renamed from: l, reason: collision with root package name */
    public final C0211o f2602l;

    public C0193S(C0211o c0211o) {
        c0211o.getClass();
        this.f2602l = c0211o;
        AbstractC0222z d3 = c0211o.entrySet().d();
        int i3 = 0;
        while (d3.hasNext()) {
            Map.Entry entry = (Map.Entry) d3.next();
            int b3 = ((AbstractC0196V) entry.getKey()).b();
            i3 = i3 < b3 ? b3 : i3;
            int b4 = ((AbstractC0196V) entry.getValue()).b();
            if (i3 < b4) {
                i3 = b4;
            }
        }
        int i4 = i3 + 1;
        this.f2601k = i4;
        if (i4 > 8) {
            throw new X1.b("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // b1.AbstractC0196V
    public final int a() {
        return AbstractC0196V.d((byte) -96);
    }

    @Override // b1.AbstractC0196V
    public final int b() {
        return this.f2601k;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compareTo;
        AbstractC0196V abstractC0196V = (AbstractC0196V) obj;
        int a3 = abstractC0196V.a();
        int d3 = AbstractC0196V.d((byte) -96);
        if (d3 != a3) {
            return d3 - abstractC0196V.a();
        }
        C0211o c0211o = ((C0193S) abstractC0196V).f2602l;
        C0211o c0211o2 = this.f2602l;
        if (c0211o2.n.size() != c0211o.n.size()) {
            return c0211o2.n.size() - c0211o.n.size();
        }
        AbstractC0222z d4 = c0211o2.entrySet().d();
        AbstractC0222z d5 = c0211o.entrySet().d();
        do {
            if (!d4.hasNext() && !d5.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) d4.next();
            Map.Entry entry2 = (Map.Entry) d5.next();
            int compareTo2 = ((AbstractC0196V) entry.getKey()).compareTo((AbstractC0196V) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((AbstractC0196V) entry.getValue()).compareTo((AbstractC0196V) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0193S.class == obj.getClass()) {
            return this.f2602l.equals(((C0193S) obj).f2602l);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(AbstractC0196V.d((byte) -96)), this.f2602l});
    }

    public final String toString() {
        C0211o c0211o = this.f2602l;
        if (c0211o.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC0222z d3 = c0211o.entrySet().d();
        while (d3.hasNext()) {
            Map.Entry entry = (Map.Entry) d3.next();
            linkedHashMap.put(((AbstractC0196V) entry.getKey()).toString().replace("\n", "\n  "), ((AbstractC0196V) entry.getValue()).toString().replace("\n", "\n  "));
        }
        M1.A a3 = new M1.A(13);
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            AbstractC0197a.g(sb, linkedHashMap.entrySet().iterator(), a3);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }
}
