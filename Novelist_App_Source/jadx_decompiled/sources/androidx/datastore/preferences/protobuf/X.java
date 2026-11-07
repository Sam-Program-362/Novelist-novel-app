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

/* loaded from: classes.dex */
public final class X extends AbstractMap {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f2015p = 0;

    /* renamed from: k, reason: collision with root package name */
    public List f2016k;

    /* renamed from: l, reason: collision with root package name */
    public Map f2017l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2018m;
    public volatile a0 n;

    /* renamed from: o, reason: collision with root package name */
    public Map f2019o;

    public static X f() {
        X x = new X();
        x.f2016k = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        x.f2017l = map;
        x.f2019o = map;
        return x;
    }

    public final int a(Comparable comparable) {
        int i3;
        int size = this.f2016k.size();
        int i4 = size - 1;
        if (i4 >= 0) {
            int compareTo = comparable.compareTo(((Y) this.f2016k.get(i4)).f2020k);
            if (compareTo > 0) {
                i3 = size + 1;
                return -i3;
            }
            if (compareTo == 0) {
                return i4;
            }
        }
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) / 2;
            int compareTo2 = comparable.compareTo(((Y) this.f2016k.get(i6)).f2020k);
            if (compareTo2 < 0) {
                i4 = i6 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i6;
                }
                i5 = i6 + 1;
            }
        }
        i3 = i5 + 1;
        return -i3;
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
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a3 = a(comparable);
        if (a3 >= 0) {
            return ((Y) this.f2016k.get(a3)).setValue(obj);
        }
        b();
        if (this.f2016k.isEmpty() && !(this.f2016k instanceof ArrayList)) {
            this.f2016k = new ArrayList(16);
        }
        int i3 = -(a3 + 1);
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
        int a3 = a(comparable);
        return a3 >= 0 ? ((Y) this.f2016k.get(a3)).f2021l : this.f2017l.get(comparable);
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
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += ((Y) this.f2016k.get(i4)).hashCode();
        }
        return this.f2017l.size() > 0 ? this.f2017l.hashCode() + i3 : i3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a3 = a(comparable);
        if (a3 >= 0) {
            return h(a3);
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
