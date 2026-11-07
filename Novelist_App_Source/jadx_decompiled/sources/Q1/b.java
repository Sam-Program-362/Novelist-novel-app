package Q1;

import B1.e;
import P1.d;
import a.AbstractC0102a;
import a2.h;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b extends P1.a implements RandomAccess, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public Object[] f1236k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1237l;

    /* renamed from: m, reason: collision with root package name */
    public int f1238m;
    public final b n;

    /* renamed from: o, reason: collision with root package name */
    public final c f1239o;

    public b(Object[] objArr, int i3, int i4, b bVar, c cVar) {
        int i5;
        h.e(objArr, "backing");
        h.e(cVar, "root");
        this.f1236k = objArr;
        this.f1237l = i3;
        this.f1238m = i4;
        this.n = bVar;
        this.f1239o = cVar;
        i5 = ((AbstractList) cVar).modCount;
        ((AbstractList) this).modCount = i5;
    }

    @Override // P1.a
    public final int a() {
        f();
        return this.f1238m;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        f();
        e(this.f1237l + this.f1238m, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        h.e(collection, "elements");
        g();
        f();
        int size = collection.size();
        d(this.f1237l + this.f1238m, collection, size);
        return size > 0;
    }

    @Override // P1.a
    public final Object b(int i3) {
        g();
        f();
        int i4 = this.f1238m;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(e.i("index: ", i3, ", size: ", i4));
        }
        return i(this.f1237l + i3);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        f();
        j(this.f1237l, this.f1238m);
    }

    public final void d(int i3, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        c cVar = this.f1239o;
        b bVar = this.n;
        if (bVar != null) {
            bVar.d(i3, collection, i4);
        } else {
            c cVar2 = c.n;
            cVar.d(i3, collection, i4);
        }
        this.f1236k = cVar.f1240k;
        this.f1238m += i4;
    }

    public final void e(int i3, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f1239o;
        b bVar = this.n;
        if (bVar != null) {
            bVar.e(i3, obj);
        } else {
            c cVar2 = c.n;
            cVar.e(i3, obj);
        }
        this.f1236k = cVar.f1240k;
        this.f1238m++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        f();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f1236k;
            int i3 = this.f1238m;
            if (i3 == list.size()) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (h.a(objArr[this.f1237l + i4], list.get(i4))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        int i3;
        i3 = ((AbstractList) this.f1239o).modCount;
        if (i3 != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void g() {
        if (this.f1239o.f1242m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        f();
        int i4 = this.f1238m;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(e.i("index: ", i3, ", size: ", i4));
        }
        return this.f1236k[this.f1237l + i3];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        f();
        Object[] objArr = this.f1236k;
        int i3 = this.f1238m;
        int i4 = 1;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[this.f1237l + i5];
            i4 = (i4 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i4;
    }

    public final Object i(int i3) {
        Object i4;
        ((AbstractList) this).modCount++;
        b bVar = this.n;
        if (bVar != null) {
            i4 = bVar.i(i3);
        } else {
            c cVar = c.n;
            i4 = this.f1239o.i(i3);
        }
        this.f1238m--;
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        f();
        for (int i3 = 0; i3 < this.f1238m; i3++) {
            if (h.a(this.f1236k[this.f1237l + i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        f();
        return this.f1238m == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i3, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.n;
        if (bVar != null) {
            bVar.j(i3, i4);
        } else {
            c cVar = c.n;
            this.f1239o.j(i3, i4);
        }
        this.f1238m -= i4;
    }

    public final int k(int i3, int i4, Collection collection, boolean z3) {
        int k3;
        b bVar = this.n;
        if (bVar != null) {
            k3 = bVar.k(i3, i4, collection, z3);
        } else {
            c cVar = c.n;
            k3 = this.f1239o.k(i3, i4, collection, z3);
        }
        if (k3 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f1238m -= k3;
        return k3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        f();
        for (int i3 = this.f1238m - 1; i3 >= 0; i3--) {
            if (h.a(this.f1236k[this.f1237l + i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        g();
        f();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            b(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        h.e(collection, "elements");
        g();
        f();
        return k(this.f1237l, this.f1238m, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        h.e(collection, "elements");
        g();
        f();
        return k(this.f1237l, this.f1238m, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        g();
        f();
        int i4 = this.f1238m;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(e.i("index: ", i3, ", size: ", i4));
        }
        Object[] objArr = this.f1236k;
        int i5 = this.f1237l;
        Object obj2 = objArr[i5 + i3];
        objArr[i5 + i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i3, int i4) {
        S0.a.e(i3, i4, this.f1238m);
        return new b(this.f1236k, this.f1237l + i3, i4 - i3, this, this.f1239o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        h.e(objArr, "array");
        f();
        int length = objArr.length;
        int i3 = this.f1238m;
        int i4 = this.f1237l;
        if (length < i3) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f1236k, i4, i3 + i4, objArr.getClass());
            h.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        d.X(0, i4, i3 + i4, this.f1236k, objArr);
        int i5 = this.f1238m;
        if (i5 < objArr.length) {
            objArr[i5] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        f();
        return AbstractC0102a.j(this.f1236k, this.f1237l, this.f1238m, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        f();
        int i4 = this.f1238m;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(e.i("index: ", i3, ", size: ", i4));
        }
        return new a(this, i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        g();
        f();
        int i4 = this.f1238m;
        if (i3 >= 0 && i3 <= i4) {
            e(this.f1237l + i3, obj);
            return;
        }
        throw new IndexOutOfBoundsException(e.i("index: ", i3, ", size: ", i4));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        h.e(collection, "elements");
        g();
        f();
        int i4 = this.f1238m;
        if (i3 >= 0 && i3 <= i4) {
            int size = collection.size();
            d(this.f1237l + i3, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(e.i("index: ", i3, ", size: ", i4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        f();
        Object[] objArr = this.f1236k;
        int i3 = this.f1238m;
        int i4 = this.f1237l;
        return d.Z(objArr, i4, i3 + i4);
    }
}
