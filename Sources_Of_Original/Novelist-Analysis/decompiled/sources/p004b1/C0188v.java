package p004b1;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: b1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0188v extends AbstractC0183p {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0188v f2647q;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final transient AbstractC0176i f2648p;

    static {
        C0173f c0173f = AbstractC0176i.f2623l;
        f2647q = new C0188v(C0186t.f2639o, r.f2636l);
    }

    public C0188v(AbstractC0176i abstractC0176i, Comparator comparator) {
        super(comparator);
        this.f2648p = abstractC0176i;
    }

    @Override // p004b1.AbstractC0172e
    public final int a(Object[] objArr) {
        return this.f2648p.a(objArr);
    }

    @Override // p004b1.AbstractC0172e
    public final int b() {
        return this.f2648p.b();
    }

    @Override // p004b1.AbstractC0172e
    public final int c() {
        return this.f2648p.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iM = m(obj, true);
        AbstractC0176i abstractC0176i = this.f2648p;
        if (iM == abstractC0176i.size()) {
            return null;
        }
        return abstractC0176i.get(iM);
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
        if (!AbstractC0168a.i(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        C0173f c0173fListIterator = this.f2648p.listIterator(0);
        Iterator it2 = collection.iterator();
        if (c0173fListIterator.hasNext()) {
            Object next = it2.next();
            Object next2 = c0173fListIterator.next();
            while (true) {
                try {
                    int iCompare = comparator.compare(next2, next);
                    if (iCompare >= 0) {
                        if (iCompare != 0) {
                            break;
                        }
                        if (!it2.hasNext()) {
                            return true;
                        }
                        next = it2.next();
                    } else {
                        if (!c0173fListIterator.hasNext()) {
                            break;
                        }
                        next2 = c0173fListIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // p004b1.AbstractC0172e
    public final AbstractC0192z d() {
        return this.f2648p.listIterator(0);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f2648p.f().listIterator(0);
    }

    @Override // p004b1.AbstractC0172e
    public final Object[] e() {
        return this.f2648p.e();
    }

    @Override // p004b1.AbstractC0178k, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            AbstractC0176i abstractC0176i = this.f2648p;
            if (abstractC0176i.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.n;
                if (!AbstractC0168a.i(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it2 = set.iterator();
                try {
                    C0173f c0173fListIterator = abstractC0176i.listIterator(0);
                    while (c0173fListIterator.hasNext()) {
                        Object next = c0173fListIterator.next();
                        Object next2 = it2.next();
                        if (next2 == null || comparator.compare(next, next2) != 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // p004b1.AbstractC0178k
    public final AbstractC0176i f() {
        return this.f2648p;
    }

    @Override // p004b1.AbstractC0183p, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f2648p.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iL = l(obj, true) - 1;
        if (iL == -1) {
            return null;
        }
        return this.f2648p.get(iL);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iM = m(obj, false);
        AbstractC0176i abstractC0176i = this.f2648p;
        if (iM == abstractC0176i.size()) {
            return null;
        }
        return abstractC0176i.get(iM);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f2648p.listIterator(0);
    }

    public final int l(Object obj, boolean z3) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f2648p, obj, this.n);
        if (iBinarySearch >= 0) {
            return z3 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    @Override // p004b1.AbstractC0183p, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        AbstractC0176i abstractC0176i = this.f2648p;
        return abstractC0176i.get(abstractC0176i.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iL = l(obj, false) - 1;
        if (iL == -1) {
            return null;
        }
        return this.f2648p.get(iL);
    }

    public final int m(Object obj, boolean z3) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f2648p, obj, this.n);
        if (iBinarySearch >= 0) {
            return z3 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    public final C0188v n(int i3, int i4) {
        AbstractC0176i abstractC0176i = this.f2648p;
        if (i3 == 0) {
            if (i4 == abstractC0176i.size()) {
                return this;
            }
            i3 = 0;
        }
        Comparator comparator = this.n;
        return i3 < i4 ? new C0188v(abstractC0176i.subList(i3, i4), comparator) : AbstractC0183p.k(comparator);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2648p.size();
    }
}
