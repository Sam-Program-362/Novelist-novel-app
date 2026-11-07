package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class X extends AbstractMap {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f2015p = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f2016k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Map f2017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f2018m;
    public volatile a0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Map f2019o;

    public static X f() {
        X x = new X();
        x.f2016k = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        x.f2017l = map;
        x.f2019o = map;
        return x;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i3;
        int i4;
        int i5;
        int iCompareTo;
        int size = this.f2016k.size();
        int i6 = size - 1;
        if (i6 < 0) {
            i3 = 0;
            while (i3 <= i6) {
                i5 = (i3 + i6) / 2;
                iCompareTo = comparable.compareTo(((Y) this.f2016k.get(i5)).f2020k);
                if (iCompareTo < 0) {
                    i6 = i5 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i5;
                    }
                    i3 = i5 + 1;
                }
            }
            i4 = i3 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((Y) this.f2016k.get(i6)).f2020k);
            if (iCompareTo2 > 0) {
                i4 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i6;
                }
                i3 = 0;
                while (i3 <= i6) {
                    i5 = (i3 + i6) / 2;
                    iCompareTo = comparable.compareTo(((Y) this.f2016k.get(i5)).f2020k);
                    if (iCompareTo < 0) {
                        i6 = i5 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i5;
                        }
                        i3 = i5 + 1;
                    }
                }
                i4 = i3 + 1;
            }
        }
        return -i4;
    }

    public final void b() {
        if (this.f2018m) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i3) {
        return (Map.Entry) this.f2016k.get(i3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f2016k.isEmpty()) {
            this.f2016k.clear();
        }
        if (this.f2017l.isEmpty()) {
            return;
        }
        this.f2017l.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f2017l.containsKey(comparable);
    }

    public final Set d() {
        return this.f2017l.isEmpty() ? Collections.EMPTY_SET : this.f2017l.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f2017l.isEmpty() && !(this.f2017l instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2017l = treeMap;
            this.f2019o = treeMap.descendingMap();
        }
        return (SortedMap) this.f2017l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.n == null) {
            this.n = new a0(0, this);
        }
        return this.n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return super.equals(obj);
        }
        X x = (X) obj;
        int size = size();
        if (size == x.size()) {
            int size2 = this.f2016k.size();
            if (size2 != x.f2016k.size()) {
                return ((AbstractSet) entrySet()).equals(x.entrySet());
            }
            for (int i3 = 0; i3 < size2; i3++) {
                if (c(i3).equals(x.c(i3))) {
                }
            }
            if (size2 != size) {
                return this.f2017l.equals(x.f2017l);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((Y) this.f2016k.get(iA)).setValue(obj);
        }
        b();
        if (this.f2016k.isEmpty() && !(this.f2016k instanceof ArrayList)) {
            this.f2016k = new ArrayList(16);
        }
        int i3 = -(iA + 1);
        if (i3 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f2016k.size() == 16) {
            Y y = (Y) this.f2016k.remove(15);
            e().put(y.f2020k, y.f2021l);
        }
        this.f2016k.add(i3, new Y(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((Y) this.f2016k.get(iA)).f2021l : this.f2017l.get(comparable);
    }

    public final Object h(int i3) {
        b();
        Object obj = ((Y) this.f2016k.remove(i3)).f2021l;
        if (!this.f2017l.isEmpty()) {
            Iterator it2 = e().entrySet().iterator();
            List list = this.f2016k;
            Map.Entry entry = (Map.Entry) it2.next();
            list.add(new Y(this, (Comparable) entry.getKey(), entry.getValue()));
            it2.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f2016k.size();
        int iHashCode = 0;
        for (int i3 = 0; i3 < size; i3++) {
            iHashCode += ((Y) this.f2016k.get(i3)).hashCode();
        }
        return this.f2017l.size() > 0 ? this.f2017l.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.f2017l.isEmpty()) {
            return null;
        }
        return this.f2017l.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2017l.size() + this.f2016k.size();
    }
}
