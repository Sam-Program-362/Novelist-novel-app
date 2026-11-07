package p004b1;

import B1.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: b1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0182o extends AbstractC0177j implements NavigableMap {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C0182o f2630p;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient C0188v f2631m;
    public final transient AbstractC0176i n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient C0182o f2632o;

    static {
        C0188v c0188vK = AbstractC0183p.k(r.f2636l);
        C0173f c0173f = AbstractC0176i.f2623l;
        f2630p = new C0182o(c0188vK, C0186t.f2639o, null);
    }

    public C0182o(C0188v c0188v, AbstractC0176i abstractC0176i, C0182o c0182o) {
        this.f2631m = c0188v;
        this.n = abstractC0176i;
        this.f2632o = c0182o;
    }

    public static C0182o b(TreeMap treeMap) {
        r rVar = r.f2636l;
        Comparator comparator = treeMap.comparator();
        int i3 = 1;
        boolean zEquals = comparator == null ? true : rVar.equals(comparator);
        Collection collectionEntrySet = treeMap.entrySet();
        if (collectionEntrySet == null) {
            Iterator it2 = collectionEntrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it2.getClass();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            collectionEntrySet = arrayList;
        }
        Map.Entry[] entryArr = (Map.Entry[]) collectionEntrySet.toArray(AbstractC0177j.f2624l);
        int length = entryArr.length;
        if (length == 0) {
            return c(rVar);
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
                    throw new NullPointerException(e.g("at index ", i5));
                }
            }
            C0188v c0188v = new C0188v(AbstractC0176i.i(1, objArr), rVar);
            Object[] objArr2 = {value};
            while (i4 < 1) {
                if (objArr2[i4] == null) {
                    throw new NullPointerException(e.g("at index ", i4));
                }
                i4++;
            }
            return new C0182o(c0188v, AbstractC0176i.i(1, objArr2), null);
        }
        Object[] objArr3 = new Object[length];
        Object[] objArr4 = new Object[length];
        if (zEquals) {
            while (i4 < length) {
                Map.Entry entry2 = entryArr[i4];
                Objects.requireNonNull(entry2);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                AbstractC0168a.f(key2, value2);
                objArr3[i4] = key2;
                objArr4[i4] = value2;
                i4++;
            }
        } else {
            Arrays.sort(entryArr, 0, length, new C0179l(0));
            Map.Entry entry3 = entryArr[0];
            Objects.requireNonNull(entry3);
            Object key3 = entry3.getKey();
            objArr3[0] = key3;
            Object value3 = entry3.getValue();
            objArr4[0] = value3;
            AbstractC0168a.f(objArr3[0], value3);
            while (i3 < length) {
                Map.Entry entry4 = entryArr[i3 - 1];
                Objects.requireNonNull(entry4);
                Map.Entry entry5 = entryArr[i3];
                Objects.requireNonNull(entry5);
                Object key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                AbstractC0168a.f(key4, value4);
                objArr3[i3] = key4;
                objArr4[i3] = value4;
                if (rVar.compare(key3, key4) == 0) {
                    throw new IllegalArgumentException(e.k("Multiple entries with same key: ", String.valueOf(entry4), " and ", String.valueOf(entry5)));
                }
                i3++;
                key3 = key4;
            }
        }
        return new C0182o(new C0188v(AbstractC0176i.i(length, objArr3), rVar), AbstractC0176i.i(length, objArr4), null);
    }

    public static C0182o c(Comparator comparator) {
        if (r.f2636l.equals(comparator)) {
            return f2630p;
        }
        C0188v c0188vK = AbstractC0183p.k(comparator);
        C0173f c0173f = AbstractC0176i.f2623l;
        return new C0182o(c0188vK, C0186t.f2639o, null);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry entryCeilingEntry = ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return entryCeilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f2631m.n;
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C0182o headMap(Object obj, boolean z3) {
        obj.getClass();
        return g(0, this.f2631m.l(obj, z3));
    }

    @Override // java.util.NavigableMap
    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.f2631m.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final /* bridge */ /* synthetic */ NavigableMap descendingMap() {
        C0182o c0182o = this.f2632o;
        if (c0182o != null) {
            return c0182o;
        }
        boolean zIsEmpty = isEmpty();
        C0188v c0188v = this.f2631m;
        if (!zIsEmpty) {
            return new C0182o((C0188v) c0188v.descendingSet(), this.n.f(), this);
        }
        Comparator comparator = c0188v.n;
        return c((comparator instanceof AbstractC0185s ? (AbstractC0185s) comparator : new C0171d(comparator)).a());
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C0182o subMap(Object obj, boolean z3, Object obj2, boolean z4) {
        obj.getClass();
        obj2.getClass();
        if (this.f2631m.n.compare(obj, obj2) <= 0) {
            return headMap(obj2, z4).tailMap(obj, z3);
        }
        throw new IllegalArgumentException(AbstractC0168a.d("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final C0182o tailMap(Object obj, boolean z3) {
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
        Map.Entry entryFloorEntry = floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getKey();
    }

    public final C0182o g(int i3, int i4) {
        AbstractC0176i abstractC0176i = this.n;
        if (i3 == 0) {
            if (i4 == abstractC0176i.size()) {
                return this;
            }
            i3 = 0;
        }
        C0188v c0188v = this.f2631m;
        return i3 == i4 ? c(c0188v.n) : new C0182o(c0188v.n(i3, i4), abstractC0176i.subList(i3, i4), null);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005  */
    @Override // p004b1.AbstractC0177j, java.util.Map
    public final Object get(Object obj) {
        int iBinarySearch;
        C0188v c0188v = this.f2631m;
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(c0188v.f2648p, obj, c0188v.n);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.n.get(iBinarySearch);
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
        Map.Entry entryHigherEntry = higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return entryHigherEntry.getKey();
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
        Map.Entry entryLowerEntry = lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return entryLowerEntry.getKey();
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
