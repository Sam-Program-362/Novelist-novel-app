package b1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: b1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0205i extends AbstractC0201e implements List, RandomAccess {

    /* renamed from: l, reason: collision with root package name */
    public static final C0202f f2623l = new C0202f(C0216t.f2639o, 0);

    public static C0216t i(int i3, Object[] objArr) {
        return i3 == 0 ? C0216t.f2639o : new C0216t(i3, objArr);
    }

    public static C0216t j(Object[] objArr) {
        if (objArr.length == 0) {
            return C0216t.f2639o;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (objArr2[i3] == null) {
                throw new NullPointerException(B1.e.g("at index ", i3));
            }
        }
        return i(length, objArr2);
    }

    @Override // b1.AbstractC0201e
    public int a(Object[] objArr) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3] = get(i3);
        }
        return size;
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // b1.AbstractC0201e
    public final AbstractC0222z d() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i3 = 0; i3 < size; i3++) {
                        if (AbstractC0197a.h(get(i3), list.get(i3))) {
                        }
                    }
                    return true;
                }
                C0202f listIterator = listIterator(0);
                Iterator it2 = list.iterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (!it2.hasNext() || !AbstractC0197a.h(listIterator.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public AbstractC0205i f() {
        return size() <= 1 ? this : new C0203g(this);
    }

    @Override // java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC0205i subList(int i3, int i4) {
        AbstractC0197a.m(i3, i4, size());
        int i5 = i4 - i3;
        return i5 == size() ? this : i5 == 0 ? C0216t.f2639o : new C0204h(this, i3, i5);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i3 = 1;
        for (int i4 = 0; i4 < size; i4++) {
            i3 = (i3 * 31) + get(i4).hashCode();
        }
        return i3;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (obj.equals(get(i3))) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final C0202f listIterator(int i3) {
        int size = size();
        if (i3 < 0 || i3 > size) {
            throw new IndexOutOfBoundsException(AbstractC0197a.n(i3, "index", size));
        }
        return isEmpty() ? f2623l : new C0202f(this, i3);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        throw new UnsupportedOperationException();
    }
}
