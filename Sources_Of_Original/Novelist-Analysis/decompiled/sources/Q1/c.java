package Q1;

import B1.e;
import P1.d;
import a2.h;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class c extends P1.a implements RandomAccess, Serializable {
    public static final c n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object[] f1240k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1241l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1242m;

    static {
        c cVar = new c(0);
        cVar.f1242m = true;
        n = cVar;
    }

    public c(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f1240k = new Object[i3];
    }

    @Override // P1.a
    public final int a() {
        return this.f1241l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        f();
        int i3 = this.f1241l;
        ((AbstractList) this).modCount++;
        g(i3, 1);
        this.f1240k[i3] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        h.e(collection, "elements");
        f();
        int size = collection.size();
        d(this.f1241l, collection, size);
        return size > 0;
    }

    @Override // P1.a
    public final Object b(int i3) {
        f();
        int i4 = this.f1241l;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(e.i("index: ", i3, ", size: ", i4));
        }
        return i(i3);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        f();
        j(0, this.f1241l);
    }

    public final void d(int i3, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        g(i3, i4);
        Iterator it2 = collection.iterator();
        for (int i5 = 0; i5 < i4; i5++) {
            this.f1240k[i3 + i5] = it2.next();
        }
    }

    public final void e(int i3, Object obj) {
        ((AbstractList) this).modCount++;
        g(i3, 1);
        this.f1240k[i3] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f1240k;
            int i3 = this.f1241l;
            if (i3 == list.size()) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (h.a(objArr[i4], list.get(i4))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.f1242m) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(int i3, int i4) {
        int i5 = this.f1241l + i4;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f1240k;
        if (i5 > objArr.length) {
            int length = objArr.length;
            int i6 = length + (length >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i6);
            h.d(objArrCopyOf, "copyOf(...)");
            this.f1240k = objArrCopyOf;
        }
        Object[] objArr2 = this.f1240k;
        d.X(i3 + i4, i3, this.f1241l, objArr2, objArr2);
        this.f1241l += i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        int i4 = this.f1241l;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(e.i("index: ", i3, ", size: ", i4));
        }
        return this.f1240k[i3];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f1240k;
        int i3 = this.f1241l;
        int iHashCode = 1;
        for (int i4 = 0; i4 < i3; i4++) {
            Object obj = objArr[i4];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Object i(int i3) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f1240k;
        Object obj = objArr[i3];
        d.X(i3, i3 + 1, this.f1241l, objArr, objArr);
        Object[] objArr2 = this.f1240k;
        int i4 = this.f1241l - 1;
        h.e(objArr2, "<this>");
        objArr2[i4] = null;
        this.f1241l--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i3 = 0; i3 < this.f1241l; i3++) {
            if (h.a(this.f1240k[i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f1241l == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i3, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f1240k;
        d.X(i3, i3 + i4, this.f1241l, objArr, objArr);
        Object[] objArr2 = this.f1240k;
        int i5 = this.f1241l;
        h.e(objArr2, "<this>");
        for (int i6 = i5 - i4; i6 < i5; i6++) {
            objArr2[i6] = null;
        }
        this.f1241l -= i4;
    }

    public final int k(int i3, int i4, Collection collection, boolean z3) {
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            int i7 = i3 + i5;
            if (collection.contains(this.f1240k[i7]) == z3) {
                Object[] objArr = this.f1240k;
                i5++;
                objArr[i6 + i3] = objArr[i7];
                i6++;
            } else {
                i5++;
            }
        }
        int i8 = i4 - i6;
        Object[] objArr2 = this.f1240k;
        d.X(i3 + i6, i4 + i3, this.f1241l, objArr2, objArr2);
        Object[] objArr3 = this.f1240k;
        int i9 = this.f1241l;
        h.e(objArr3, "<this>");
        for (int i10 = i9 - i8; i10 < i9; i10++) {
            objArr3[i10] = null;
        }
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f1241l -= i8;
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i3 = this.f1241l - 1; i3 >= 0; i3--) {
            if (h.a(this.f1240k[i3], obj)) {
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
        f();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        h.e(collection, "elements");
        f();
        return k(0, this.f1241l, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        h.e(collection, "elements");
        f();
        return k(0, this.f1241l, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        f();
        int i4 = this.f1241l;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(e.i("index: ", i3, ", size: ", i4));
        }
        Object[] objArr = this.f1240k;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i3, int i4) {
        S0.a.e(i3, i4, this.f1241l);
        return new b(this.f1240k, i3, i4 - i3, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        h.e(objArr, "array");
        int length = objArr.length;
        int i3 = this.f1241l;
        if (length < i3) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f1240k, 0, i3, objArr.getClass());
            h.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        d.X(0, 0, i3, this.f1240k, objArr);
        int i4 = this.f1241l;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return p000a.a.j(this.f1240k, 0, this.f1241l, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        int i4 = this.f1241l;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(e.i("index: ", i3, ", size: ", i4));
        }
        return new a(this, i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        h.e(collection, "elements");
        f();
        int i4 = this.f1241l;
        if (i3 >= 0 && i3 <= i4) {
            int size = collection.size();
            d(i3, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(e.i("index: ", i3, ", size: ", i4));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        f();
        int i4 = this.f1241l;
        if (i3 >= 0 && i3 <= i4) {
            ((AbstractList) this).modCount++;
            g(i3, 1);
            this.f1240k[i3] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(e.i("index: ", i3, ", size: ", i4));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return d.Z(this.f1240k, 0, this.f1241l);
    }
}
