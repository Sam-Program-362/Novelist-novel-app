package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class T extends AbstractC0105b implements RandomAccess {
    public static final T n = new T(new Object[0], 0, false);

    /* renamed from: l, reason: collision with root package name */
    public Object[] f2006l;

    /* renamed from: m, reason: collision with root package name */
    public int f2007m;

    public T(Object[] objArr, int i3, boolean z3) {
        this.f2028k = z3;
        this.f2006l = objArr;
        this.f2007m = i3;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i3 = this.f2007m;
        Object[] objArr = this.f2006l;
        if (i3 == objArr.length) {
            this.f2006l = Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f2006l;
        int i4 = this.f2007m;
        this.f2007m = i4 + 1;
        objArr2[i4] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i3) {
        if (i3 < 0 || i3 >= this.f2007m) {
            throw new IndexOutOfBoundsException("Index:" + i3 + ", Size:" + this.f2007m);
        }
    }

    public final T c(int i3) {
        if (i3 >= this.f2007m) {
            return new T(Arrays.copyOf(this.f2006l, i3), this.f2007m, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        b(i3);
        return this.f2006l[i3];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0105b, java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        a();
        b(i3);
        Object[] objArr = this.f2006l;
        Object obj = objArr[i3];
        if (i3 < this.f2007m - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (r2 - i3) - 1);
        }
        this.f2007m--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        a();
        b(i3);
        Object[] objArr = this.f2006l;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2007m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        a();
        if (i3 >= 0 && i3 <= (i4 = this.f2007m)) {
            Object[] objArr = this.f2006l;
            if (i4 < objArr.length) {
                System.arraycopy(objArr, i3, objArr, i3 + 1, i4 - i3);
            } else {
                Object[] objArr2 = new Object[((i4 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(this.f2006l, i3, objArr2, i3 + 1, this.f2007m - i3);
                this.f2006l = objArr2;
            }
            this.f2006l[i3] = obj;
            this.f2007m++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + i3 + ", Size:" + this.f2007m);
    }
}
