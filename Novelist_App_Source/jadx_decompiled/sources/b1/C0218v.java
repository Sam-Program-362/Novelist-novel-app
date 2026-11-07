package b1;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: b1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218v extends AbstractC0212p {

    /* renamed from: q, reason: collision with root package name */
    public static final C0218v f2647q;

    /* renamed from: p, reason: collision with root package name */
    public final transient AbstractC0205i f2648p;

    static {
        C0202f c0202f = AbstractC0205i.f2623l;
        f2647q = new C0218v(C0216t.f2639o, C0214r.f2636l);
    }

    public C0218v(AbstractC0205i abstractC0205i, Comparator comparator) {
        super(comparator);
        this.f2648p = abstractC0205i;
    }

    @Override // b1.AbstractC0201e
    public final int a(Object[] objArr) {
        return this.f2648p.a(objArr);
    }

    @Override // b1.AbstractC0201e
    public final int b() {
        return this.f2648p.b();
    }

    @Override // b1.AbstractC0201e
    public final int c() {
        return this.f2648p.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int m3 = m(obj, true);
        AbstractC0205i abstractC0205i = this.f2648p;
        if (m3 == abstractC0205i.size()) {
            return null;
        }
        return abstractC0205i.get(m3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f2648p, obj, this.n) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Comparator comparator = this.n;
        if (!AbstractC0197a.i(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C0202f listIterator = this.f2648p.listIterator(0);
        Iterator it2 = collection.iterator();
        if (listIterator.hasNext()) {
            Object next = it2.next();
            Object next2 = listIterator.next();
            while (true) {
                try {
                    int compare = comparator.compare(next2, next);
                    if (compare >= 0) {
                        if (compare != 0) {
                            break;
                        }
                        if (!it2.hasNext()) {
                            return true;
                        }
                        next = it2.next();
                    } else {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        next2 = listIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // b1.AbstractC0201e
    public final AbstractC0222z d() {
        return this.f2648p.listIterator(0);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f2648p.f().listIterator(0);
    }

    @Override // b1.AbstractC0201e
    public final Object[] e() {
        return this.f2648p.e();
    }

    @Override // b1.AbstractC0207k, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            AbstractC0205i abstractC0205i = this.f2648p;
            if (abstractC0205i.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.n;
                if (!AbstractC0197a.i(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it2 = set.iterator();
                try {
                    C0202f listIterator = abstractC0205i.listIterator(0);
                    while (listIterator.hasNext()) {
                        Object next = listIterator.next();
                        Object next2 = it2.next();
                        if (next2 != null && comparator.compare(next, next2) == 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // b1.AbstractC0207k
    public final AbstractC0205i f() {
        return this.f2648p;
    }

    @Override // b1.AbstractC0212p, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f2648p.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int l3 = l(obj, true) - 1;
        if (l3 == -1) {
            return null;
        }
        return this.f2648p.get(l3);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int m3 = m(obj, false);
        AbstractC0205i abstractC0205i = this.f2648p;
        if (m3 == abstractC0205i.size()) {
            return null;
        }
        return abstractC0205i.get(m3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f2648p.listIterator(0);
    }

    public final int l(Object obj, boolean z3) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f2648p, obj, this.n);
        return binarySearch >= 0 ? z3 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    @Override // b1.AbstractC0212p, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f2648p.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int l3 = l(obj, false) - 1;
        if (l3 == -1) {
            return null;
        }
        return this.f2648p.get(l3);
    }

    public final int m(Object obj, boolean z3) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f2648p, obj, this.n);
        return binarySearch >= 0 ? z3 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final C0218v n(int i3, int i4) {
        AbstractC0205i abstractC0205i = this.f2648p;
        if (i3 == 0) {
            if (i4 == abstractC0205i.size()) {
                return this;
            }
            i3 = 0;
        }
        Comparator comparator = this.n;
        return i3 < i4 ? new C0218v(abstractC0205i.subList(i3, i4), comparator) : AbstractC0212p.k(comparator);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2648p.size();
    }
}
