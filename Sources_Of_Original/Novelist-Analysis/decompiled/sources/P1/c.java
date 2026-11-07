package P1;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    public static final Object[] n = new Object[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object[] f1216l = n;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1217m;

    @Override // P1.a
    public final int a() {
        return this.f1217m;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int length;
        int i4 = this.f1217m;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(B1.e.i("index: ", i3, ", size: ", i4));
        }
        if (i3 == i4) {
            addLast(obj);
            return;
        }
        if (i3 == 0) {
            addFirst(obj);
            return;
        }
        j();
        d(this.f1217m + 1);
        int i5 = i(this.f1215k + i3);
        int i6 = this.f1217m;
        if (i3 < ((i6 + 1) >> 1)) {
            if (i5 == 0) {
                Object[] objArr = this.f1216l;
                a2.h.e(objArr, "<this>");
                i5 = objArr.length;
            }
            int i7 = i5 - 1;
            int i8 = this.f1215k;
            if (i8 == 0) {
                Object[] objArr2 = this.f1216l;
                a2.h.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i8 - 1;
            }
            int i9 = this.f1215k;
            if (i7 >= i9) {
                Object[] objArr3 = this.f1216l;
                objArr3[length] = objArr3[i9];
                d.X(i9, i9 + 1, i7 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f1216l;
                d.X(i9 - 1, i9, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f1216l;
                objArr5[objArr5.length - 1] = objArr5[0];
                d.X(0, 1, i7 + 1, objArr5, objArr5);
            }
            this.f1216l[i7] = obj;
            this.f1215k = length;
        } else {
            int i10 = i(i6 + this.f1215k);
            if (i5 < i10) {
                Object[] objArr6 = this.f1216l;
                d.X(i5 + 1, i5, i10, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f1216l;
                d.X(1, 0, i10, objArr7, objArr7);
                Object[] objArr8 = this.f1216l;
                objArr8[0] = objArr8[objArr8.length - 1];
                d.X(i5 + 1, i5, objArr8.length - 1, objArr8, objArr8);
            }
            this.f1216l[i5] = obj;
        }
        this.f1217m++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection collection) {
        a2.h.e(collection, "elements");
        int i4 = this.f1217m;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(B1.e.i("index: ", i3, ", size: ", i4));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i3 == this.f1217m) {
            return addAll(collection);
        }
        j();
        d(collection.size() + this.f1217m);
        int i5 = i(this.f1217m + this.f1215k);
        int i6 = i(this.f1215k + i3);
        int size = collection.size();
        if (i3 >= ((this.f1217m + 1) >> 1)) {
            int i7 = i6 + size;
            if (i6 < i5) {
                int i8 = size + i5;
                Object[] objArr = this.f1216l;
                if (i8 <= objArr.length) {
                    d.X(i7, i6, i5, objArr, objArr);
                } else if (i7 >= objArr.length) {
                    d.X(i7 - objArr.length, i6, i5, objArr, objArr);
                } else {
                    int length = i5 - (i8 - objArr.length);
                    d.X(0, length, i5, objArr, objArr);
                    Object[] objArr2 = this.f1216l;
                    d.X(i7, i6, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f1216l;
                d.X(size, 0, i5, objArr3, objArr3);
                Object[] objArr4 = this.f1216l;
                if (i7 >= objArr4.length) {
                    d.X(i7 - objArr4.length, i6, objArr4.length, objArr4, objArr4);
                } else {
                    d.X(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f1216l;
                    d.X(i7, i6, objArr5.length - size, objArr5, objArr5);
                }
            }
            c(i6, collection);
            return true;
        }
        int i9 = this.f1215k;
        int length2 = i9 - size;
        if (i6 < i9) {
            Object[] objArr6 = this.f1216l;
            d.X(length2, i9, objArr6.length, objArr6, objArr6);
            if (size >= i6) {
                Object[] objArr7 = this.f1216l;
                d.X(objArr7.length - size, 0, i6, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f1216l;
                d.X(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f1216l;
                d.X(0, size, i6, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.f1216l;
            d.X(length2, i9, i6, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f1216l;
            length2 += objArr11.length;
            int i10 = i6 - i9;
            int length3 = objArr11.length - length2;
            if (length3 >= i10) {
                d.X(length2, i9, i6, objArr11, objArr11);
            } else {
                d.X(length2, i9, i9 + length3, objArr11, objArr11);
                Object[] objArr12 = this.f1216l;
                d.X(0, this.f1215k + length3, i6, objArr12, objArr12);
            }
        }
        this.f1215k = length2;
        c(f(i6 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        j();
        d(this.f1217m + 1);
        int length = this.f1215k;
        if (length == 0) {
            Object[] objArr = this.f1216l;
            a2.h.e(objArr, "<this>");
            length = objArr.length;
        }
        int i3 = length - 1;
        this.f1215k = i3;
        this.f1216l[i3] = obj;
        this.f1217m++;
    }

    public final void addLast(Object obj) {
        j();
        d(a() + 1);
        this.f1216l[i(a() + this.f1215k)] = obj;
        this.f1217m = a() + 1;
    }

    @Override // P1.a
    public final Object b(int i3) {
        int i4 = this.f1217m;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(B1.e.i("index: ", i3, ", size: ", i4));
        }
        if (i3 == size() - 1) {
            return removeLast();
        }
        if (i3 == 0) {
            return removeFirst();
        }
        j();
        int i5 = i(this.f1215k + i3);
        Object[] objArr = this.f1216l;
        Object obj = objArr[i5];
        if (i3 < (this.f1217m >> 1)) {
            int i6 = this.f1215k;
            if (i5 >= i6) {
                d.X(i6 + 1, i6, i5, objArr, objArr);
            } else {
                d.X(1, 0, i5, objArr, objArr);
                Object[] objArr2 = this.f1216l;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i7 = this.f1215k;
                d.X(i7 + 1, i7, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f1216l;
            int i8 = this.f1215k;
            objArr3[i8] = null;
            this.f1215k = e(i8);
        } else {
            int i9 = i((size() - 1) + this.f1215k);
            if (i5 <= i9) {
                Object[] objArr4 = this.f1216l;
                d.X(i5, i5 + 1, i9 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f1216l;
                d.X(i5, i5 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f1216l;
                objArr6[objArr6.length - 1] = objArr6[0];
                d.X(0, 1, i9 + 1, objArr6, objArr6);
            }
            this.f1216l[i9] = null;
        }
        this.f1217m--;
        return obj;
    }

    public final void c(int i3, Collection collection) {
        Iterator it2 = collection.iterator();
        int length = this.f1216l.length;
        while (i3 < length && it2.hasNext()) {
            this.f1216l[i3] = it2.next();
            i3++;
        }
        int i4 = this.f1215k;
        for (int i5 = 0; i5 < i4 && it2.hasNext(); i5++) {
            this.f1216l[i5] = it2.next();
        }
        this.f1217m = collection.size() + this.f1217m;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            j();
            g(this.f1215k, i(a() + this.f1215k));
        }
        this.f1215k = 0;
        this.f1217m = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f1216l;
        if (i3 <= objArr.length) {
            return;
        }
        if (objArr == n) {
            if (i3 < 10) {
                i3 = 10;
            }
            this.f1216l = new Object[i3];
            return;
        }
        int length = objArr.length;
        int i4 = length + (length >> 1);
        if (i4 - i3 < 0) {
            i4 = i3;
        }
        if (i4 - 2147483639 > 0) {
            i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i4];
        d.X(0, this.f1215k, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f1216l;
        int length2 = objArr3.length;
        int i5 = this.f1215k;
        d.X(length2 - i5, 0, i5, objArr3, objArr2);
        this.f1215k = 0;
        this.f1216l = objArr2;
    }

    public final int e(int i3) {
        Object[] objArr = this.f1216l;
        a2.h.e(objArr, "<this>");
        if (i3 == objArr.length - 1) {
            return 0;
        }
        return i3 + 1;
    }

    public final int f(int i3) {
        return i3 < 0 ? i3 + this.f1216l.length : i3;
    }

    public final void g(int i3, int i4) {
        if (i3 < i4) {
            Object[] objArr = this.f1216l;
            a2.h.e(objArr, "<this>");
            Arrays.fill(objArr, i3, i4, (Object) null);
        } else {
            Object[] objArr2 = this.f1216l;
            Arrays.fill(objArr2, i3, objArr2.length, (Object) null);
            Object[] objArr3 = this.f1216l;
            a2.h.e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, i4, (Object) null);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        int iA = a();
        if (i3 < 0 || i3 >= iA) {
            throw new IndexOutOfBoundsException(B1.e.i("index: ", i3, ", size: ", iA));
        }
        return this.f1216l[i(this.f1215k + i3)];
    }

    public final int i(int i3) {
        Object[] objArr = this.f1216l;
        return i3 >= objArr.length ? i3 - objArr.length : i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i3;
        int i4 = i(a() + this.f1215k);
        int length = this.f1215k;
        if (length < i4) {
            while (length < i4) {
                if (a2.h.a(obj, this.f1216l[length])) {
                    i3 = this.f1215k;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < i4) {
            return -1;
        }
        int length2 = this.f1216l.length;
        while (length < length2) {
            if (a2.h.a(obj, this.f1216l[length])) {
                i3 = this.f1215k;
            } else {
                length++;
            }
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (a2.h.a(obj, this.f1216l[i5])) {
                length = i5 + this.f1216l.length;
                i3 = this.f1215k;
            }
        }
        return -1;
        return length - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final void j() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i3;
        int i4 = i(this.f1217m + this.f1215k);
        int i5 = this.f1215k;
        if (i5 < i4) {
            length = i4 - 1;
            if (i5 <= length) {
                while (!a2.h.a(obj, this.f1216l[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i3 = this.f1215k;
                return length - i3;
            }
            return -1;
        }
        if (i5 > i4) {
            for (int i6 = i4 - 1; -1 < i6; i6--) {
                if (a2.h.a(obj, this.f1216l[i6])) {
                    length = i6 + this.f1216l.length;
                    i3 = this.f1215k;
                    return length - i3;
                }
            }
            Object[] objArr = this.f1216l;
            a2.h.e(objArr, "<this>");
            length = objArr.length - 1;
            int i7 = this.f1215k;
            if (i7 <= length) {
                while (!a2.h.a(obj, this.f1216l[length])) {
                    if (length != i7) {
                        length--;
                    }
                }
                i3 = this.f1215k;
                return length - i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int i3;
        a2.h.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f1216l.length != 0) {
            int i4 = i(this.f1217m + this.f1215k);
            int i5 = this.f1215k;
            if (i5 < i4) {
                i3 = i5;
                while (i5 < i4) {
                    Object obj = this.f1216l[i5];
                    if (collection.contains(obj)) {
                        z3 = true;
                    } else {
                        this.f1216l[i3] = obj;
                        i3++;
                    }
                    i5++;
                }
                Object[] objArr = this.f1216l;
                a2.h.e(objArr, "<this>");
                Arrays.fill(objArr, i3, i4, (Object) null);
            } else {
                int length = this.f1216l.length;
                boolean z4 = false;
                int i6 = i5;
                while (i5 < length) {
                    Object[] objArr2 = this.f1216l;
                    Object obj2 = objArr2[i5];
                    objArr2[i5] = null;
                    if (collection.contains(obj2)) {
                        z4 = true;
                    } else {
                        this.f1216l[i6] = obj2;
                        i6++;
                    }
                    i5++;
                }
                i3 = i(i6);
                for (int i7 = 0; i7 < i4; i7++) {
                    Object[] objArr3 = this.f1216l;
                    Object obj3 = objArr3[i7];
                    objArr3[i7] = null;
                    if (collection.contains(obj3)) {
                        z4 = true;
                    } else {
                        this.f1216l[i3] = obj3;
                        i3 = e(i3);
                    }
                }
                z3 = z4;
            }
            if (z3) {
                j();
                this.f1217m = f(i3 - this.f1215k);
            }
        }
        return z3;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        Object[] objArr = this.f1216l;
        int i3 = this.f1215k;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f1215k = e(i3);
        this.f1217m = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        int i3 = i((size() - 1) + this.f1215k);
        Object[] objArr = this.f1216l;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f1217m = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i4) {
        S0.a.e(i3, i4, this.f1217m);
        int i5 = i4 - i3;
        if (i5 == 0) {
            return;
        }
        if (i5 == this.f1217m) {
            clear();
            return;
        }
        if (i5 == 1) {
            b(i3);
            return;
        }
        j();
        if (i3 < this.f1217m - i4) {
            int i6 = i(this.f1215k + (i3 - 1));
            int i7 = i(this.f1215k + (i4 - 1));
            while (i3 > 0) {
                int i8 = i6 + 1;
                int iMin = Math.min(i3, Math.min(i8, i7 + 1));
                Object[] objArr = this.f1216l;
                int i9 = i7 - iMin;
                int i10 = i6 - iMin;
                d.X(i9 + 1, i10 + 1, i8, objArr, objArr);
                i6 = f(i10);
                i7 = f(i9);
                i3 -= iMin;
            }
            int i11 = i(this.f1215k + i5);
            g(this.f1215k, i11);
            this.f1215k = i11;
        } else {
            int i12 = i(this.f1215k + i4);
            int i13 = i(this.f1215k + i3);
            int i14 = this.f1217m;
            while (true) {
                i14 -= i4;
                if (i14 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f1216l;
                i4 = Math.min(i14, Math.min(objArr2.length - i12, objArr2.length - i13));
                Object[] objArr3 = this.f1216l;
                int i15 = i12 + i4;
                d.X(i13, i12, i15, objArr3, objArr3);
                i12 = i(i15);
                i13 = i(i13 + i4);
            }
            int i16 = i(this.f1217m + this.f1215k);
            g(f(i16 - i5), i16);
        }
        this.f1217m -= i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int i3;
        a2.h.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f1216l.length != 0) {
            int i4 = i(this.f1217m + this.f1215k);
            int i5 = this.f1215k;
            if (i5 < i4) {
                i3 = i5;
                while (i5 < i4) {
                    Object obj = this.f1216l[i5];
                    if (collection.contains(obj)) {
                        this.f1216l[i3] = obj;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i5++;
                }
                Object[] objArr = this.f1216l;
                a2.h.e(objArr, "<this>");
                Arrays.fill(objArr, i3, i4, (Object) null);
            } else {
                int length = this.f1216l.length;
                boolean z4 = false;
                int i6 = i5;
                while (i5 < length) {
                    Object[] objArr2 = this.f1216l;
                    Object obj2 = objArr2[i5];
                    objArr2[i5] = null;
                    if (collection.contains(obj2)) {
                        this.f1216l[i6] = obj2;
                        i6++;
                    } else {
                        z4 = true;
                    }
                    i5++;
                }
                i3 = i(i6);
                for (int i7 = 0; i7 < i4; i7++) {
                    Object[] objArr3 = this.f1216l;
                    Object obj3 = objArr3[i7];
                    objArr3[i7] = null;
                    if (collection.contains(obj3)) {
                        this.f1216l[i3] = obj3;
                        i3 = e(i3);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                j();
                this.f1217m = f(i3 - this.f1215k);
            }
        }
        return z3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        int iA = a();
        if (i3 < 0 || i3 >= iA) {
            throw new IndexOutOfBoundsException(B1.e.i("index: ", i3, ", size: ", iA));
        }
        int i4 = i(this.f1215k + i3);
        Object[] objArr = this.f1216l;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        a2.h.e(objArr, "array");
        int length = objArr.length;
        int i3 = this.f1217m;
        if (length < i3) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i3);
            a2.h.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int i4 = i(this.f1217m + this.f1215k);
        int i5 = this.f1215k;
        if (i5 < i4) {
            d.Y(i5, i4, 2, this.f1216l, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f1216l;
            d.X(0, this.f1215k, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f1216l;
            d.X(objArr3.length - this.f1215k, 0, i4, objArr3, objArr);
        }
        int i6 = this.f1217m;
        if (i6 < objArr.length) {
            objArr[i6] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a2.h.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        j();
        d(collection.size() + a());
        c(i(a() + this.f1215k), collection);
        return true;
    }
}
