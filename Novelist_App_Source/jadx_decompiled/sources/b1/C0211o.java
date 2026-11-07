package b1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: b1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211o extends AbstractC0206j implements NavigableMap {

    /* renamed from: p, reason: collision with root package name */
    public static final C0211o f2630p;

    /* renamed from: m, reason: collision with root package name */
    public final transient C0218v f2631m;
    public final transient AbstractC0205i n;

    /* renamed from: o, reason: collision with root package name */
    public final transient C0211o f2632o;

    static {
        C0218v k3 = AbstractC0212p.k(C0214r.f2636l);
        C0202f c0202f = AbstractC0205i.f2623l;
        f2630p = new C0211o(k3, C0216t.f2639o, null);
    }

    public C0211o(C0218v c0218v, AbstractC0205i abstractC0205i, C0211o c0211o) {
        this.f2631m = c0218v;
        this.n = abstractC0205i;
        this.f2632o = c0211o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0211o b(TreeMap treeMap) {
        C0214r c0214r = C0214r.f2636l;
        Comparator comparator = treeMap.comparator();
        int i3 = 1;
        boolean equals = comparator == null ? true : c0214r.equals(comparator);
        Set entrySet = treeMap.entrySet();
        if (entrySet == null) {
            Iterator it2 = entrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it2.getClass();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            entrySet = arrayList;
        }
        Map.Entry[] entryArr = (Map.Entry[]) entrySet.toArray(AbstractC0206j.f2624l);
        int length = entryArr.length;
        if (length == 0) {
            return c(c0214r);
        }
        int i4 = 0;
        if (length == 1) {
            Map.Entry entry = entryArr[0];
            Objects.requireNonNull(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object[] objArr = {key};
            for (int i5 = 0; i5 < 1; i5++) {
                if (objArr[i5] == null) {
                    throw new NullPointerException(B1.e.g("at index ", i5));
                }
            }
            C0218v c0218v = new C0218v(AbstractC0205i.i(1, objArr), c0214r);
            Object[] objArr2 = {value};
            while (i4 < 1) {
                if (objArr2[i4] == null) {
                    throw new NullPointerException(B1.e.g("at index ", i4));
                }
                i4++;
            }
            return new C0211o(c0218v, AbstractC0205i.i(1, objArr2), null);
        }
        Object[] objArr3 = new Object[length];
        Object[] objArr4 = new Object[length];
        if (equals) {
            while (i4 < length) {
                Map.Entry entry2 = entryArr[i4];
                Objects.requireNonNull(entry2);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                AbstractC0197a.f(key2, value2);
                objArr3[i4] = key2;
                objArr4[i4] = value2;
                i4++;
            }
        } else {
            Arrays.sort(entryArr, 0, length, new C0208l(0));
            Map.Entry entry3 = entryArr[0];
            Objects.requireNonNull(entry3);
            Object key3 = entry3.getKey();
            objArr3[0] = key3;
            Object value3 = entry3.getValue();
            objArr4[0] = value3;
            AbstractC0197a.f(objArr3[0], value3);
            while (i3 < length) {
                Map.Entry entry4 = entryArr[i3 - 1];
                Objects.requireNonNull(entry4);
                Map.Entry entry5 = entryArr[i3];
                Objects.requireNonNull(entry5);
                Object key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                AbstractC0197a.f(key4, value4);
                objArr3[i3] = key4;
                objArr4[i3] = value4;
                if (c0214r.compare(key3, key4) == 0) {
                    throw new IllegalArgumentException(B1.e.k("Multiple entries with same key: ", String.valueOf(entry4), " and ", String.valueOf(entry5)));
                }
                i3++;
                key3 = key4;
            }
        }
        return new C0211o(new C0218v(AbstractC0205i.i(length, objArr3), c0214r), AbstractC0205i.i(length, objArr4), null);
    }

    public static C0211o c(Comparator comparator) {
        if (C0214r.f2636l.equals(comparator)) {
            return f2630p;
        }
        C0218v k3 = AbstractC0212p.k(comparator);
        C0202f c0202f = AbstractC0205i.f2623l;
        return new C0211o(k3, C0216t.f2639o, null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry ceilingEntry = ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return ceilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f2631m.n;
    }

    @Override // java.util.NavigableMap
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C0211o headMap(Object obj, boolean z3) {
        obj.getClass();
        return g(0, this.f2631m.l(obj, z3));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.f2631m.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        C0211o c0211o = this.f2632o;
        if (c0211o != null) {
            return c0211o;
        }
        boolean isEmpty = isEmpty();
        C0218v c0218v = this.f2631m;
        if (!isEmpty) {
            return new C0211o((C0218v) c0218v.descendingSet(), this.n.f(), this);
        }
        Comparator comparator = c0218v.n;
        return c((comparator instanceof AbstractC0215s ? (AbstractC0215s) comparator : new C0200d(comparator)).a());
    }

    @Override // java.util.NavigableMap
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C0211o subMap(Object obj, boolean z3, Object obj2, boolean z4) {
        obj.getClass();
        obj2.getClass();
        if (this.f2631m.n.compare(obj, obj2) <= 0) {
            return headMap(obj2, z4).tailMap(obj, z3);
        }
        throw new IllegalArgumentException(AbstractC0197a.d("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C0211o tailMap(Object obj, boolean z3) {
        obj.getClass();
        return g(this.f2631m.m(obj, z3), this.n.size());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().f().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f2631m.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Map.Entry floorEntry = floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getKey();
    }

    public final C0211o g(int i3, int i4) {
        AbstractC0205i abstractC0205i = this.n;
        if (i3 == 0) {
            if (i4 == abstractC0205i.size()) {
                return this;
            }
            i3 = 0;
        }
        C0218v c0218v = this.f2631m;
        return i3 == i4 ? c(c0218v.n) : new C0211o(c0218v.n(i3, i4), abstractC0205i.subList(i3, i4), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
    
        if (r4 < 0) goto L4;
     */
    @Override // b1.AbstractC0206j, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            b1.v r0 = r3.f2631m
            r1 = -1
            if (r4 != 0) goto L7
        L5:
            r4 = r1
            goto L12
        L7:
            b1.i r2 = r0.f2648p     // Catch: java.lang.ClassCastException -> L5
            java.util.Comparator r0 = r0.n     // Catch: java.lang.ClassCastException -> L5
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L5
            if (r4 >= 0) goto L12
            goto L5
        L12:
            if (r4 != r1) goto L16
            r4 = 0
            return r4
        L16:
            b1.i r0 = r3.n
            java.lang.Object r4 = r0.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C0211o.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Map.Entry higherEntry = higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return higherEntry.getKey();
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return this.f2631m;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().f().get(this.n.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f2631m.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Map.Entry lowerEntry = lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return lowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet navigableKeySet() {
        return this.f2631m;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.n.size();
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.Map, java.util.SortedMap
    public final /* synthetic */ Collection values() {
        return this.n;
    }
}
