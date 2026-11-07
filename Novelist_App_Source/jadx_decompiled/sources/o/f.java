package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p.AbstractC0443a;

/* loaded from: classes.dex */
public final class f implements Collection, Set, b2.a {

    /* renamed from: k, reason: collision with root package name */
    public int[] f4193k = AbstractC0443a.f4237a;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f4194l = AbstractC0443a.f4238b;

    /* renamed from: m, reason: collision with root package name */
    public int f4195m;

    public f(int i3) {
        if (i3 > 0) {
            h.a(this, i3);
        }
    }

    public final Object a(int i3) {
        int i4 = this.f4195m;
        Object[] objArr = this.f4194l;
        Object obj = objArr[i3];
        if (i4 <= 1) {
            clear();
            return obj;
        }
        int i5 = i4 - 1;
        int[] iArr = this.f4193k;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            if (i3 < i5) {
                int i6 = i3 + 1;
                P1.d.W(i3, i6, i4, iArr, iArr);
                Object[] objArr2 = this.f4194l;
                P1.d.X(i3, i6, i4, objArr2, objArr2);
            }
            this.f4194l[i5] = null;
        } else {
            int i7 = i4 > 8 ? i4 + (i4 >> 1) : 8;
            int[] iArr2 = new int[i7];
            this.f4193k = iArr2;
            this.f4194l = new Object[i7];
            if (i3 > 0) {
                P1.d.W(0, 0, i3, iArr, iArr2);
                P1.d.Y(0, i3, 6, objArr, this.f4194l);
            }
            if (i3 < i5) {
                int i8 = i3 + 1;
                P1.d.W(i3, i8, i4, iArr, this.f4193k);
                P1.d.X(i3, i8, i4, objArr, this.f4194l);
            }
        }
        if (i4 != this.f4195m) {
            throw new ConcurrentModificationException();
        }
        this.f4195m = i5;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i3;
        int b3;
        int i4 = this.f4195m;
        if (obj == null) {
            b3 = h.b(this, null, 0);
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            b3 = h.b(this, obj, hashCode);
        }
        if (b3 >= 0) {
            return false;
        }
        int i5 = ~b3;
        int[] iArr = this.f4193k;
        if (i4 >= iArr.length) {
            int i6 = 8;
            if (i4 >= 8) {
                i6 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.f4194l;
            int[] iArr2 = new int[i6];
            this.f4193k = iArr2;
            this.f4194l = new Object[i6];
            if (i4 != this.f4195m) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                P1.d.W(0, 0, iArr.length, iArr, iArr2);
                P1.d.Y(0, objArr.length, 6, objArr, this.f4194l);
            }
        }
        if (i5 < i4) {
            int[] iArr3 = this.f4193k;
            int i7 = i5 + 1;
            P1.d.W(i7, i5, i4, iArr3, iArr3);
            Object[] objArr2 = this.f4194l;
            P1.d.X(i7, i5, i4, objArr2, objArr2);
        }
        int i8 = this.f4195m;
        if (i4 == i8) {
            int[] iArr4 = this.f4193k;
            if (i5 < iArr4.length) {
                iArr4[i5] = i3;
                this.f4194l[i5] = obj;
                this.f4195m = i8 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        a2.h.e(collection, "elements");
        int size = collection.size() + this.f4195m;
        int i3 = this.f4195m;
        int[] iArr = this.f4193k;
        boolean z3 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f4194l;
            int[] iArr2 = new int[size];
            this.f4193k = iArr2;
            this.f4194l = new Object[size];
            if (i3 > 0) {
                P1.d.W(0, 0, i3, iArr, iArr2);
                P1.d.Y(0, this.f4195m, 6, objArr, this.f4194l);
            }
        }
        if (this.f4195m != i3) {
            throw new ConcurrentModificationException();
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            z3 |= add(it2.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f4195m != 0) {
            this.f4193k = AbstractC0443a.f4237a;
            this.f4194l = AbstractC0443a.f4238b;
            this.f4195m = 0;
        }
        if (this.f4195m != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? h.b(this, null, 0) : h.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        a2.h.e(collection, "elements");
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (!contains(it2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f4195m != ((Set) obj).size()) {
            return false;
        }
        try {
            int i3 = this.f4195m;
            for (int i4 = 0; i4 < i3; i4++) {
                if (!((Set) obj).contains(this.f4194l[i4])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f4193k;
        int i3 = this.f4195m;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += iArr[i5];
        }
        return i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4195m <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0436a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int b3 = obj == null ? h.b(this, null, 0) : h.b(this, obj, obj.hashCode());
        if (b3 < 0) {
            return false;
        }
        a(b3);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        a2.h.e(collection, "elements");
        Iterator it2 = collection.iterator();
        boolean z3 = false;
        while (it2.hasNext()) {
            z3 |= remove(it2.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        a2.h.e(collection, "elements");
        boolean z3 = false;
        for (int i3 = this.f4195m - 1; -1 < i3; i3--) {
            if (!collection.contains(this.f4194l[i3])) {
                a(i3);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f4195m;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return P1.d.Z(this.f4194l, 0, this.f4195m);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4195m * 14);
        sb.append('{');
        int i3 = this.f4195m;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = this.f4194l[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        a2.h.d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        a2.h.e(objArr, "array");
        int i3 = this.f4195m;
        if (objArr.length < i3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
        } else if (objArr.length > i3) {
            objArr[i3] = null;
        }
        P1.d.X(0, 0, this.f4195m, this.f4194l, objArr);
        return objArr;
    }
}
