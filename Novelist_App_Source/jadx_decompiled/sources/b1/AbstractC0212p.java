package b1;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: b1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0212p extends AbstractC0207k implements NavigableSet, InterfaceC0221y {
    public final transient Comparator n;

    /* renamed from: o, reason: collision with root package name */
    public transient AbstractC0212p f2633o;

    public AbstractC0212p(Comparator comparator) {
        this.n = comparator;
    }

    public static C0218v k(Comparator comparator) {
        if (C0214r.f2636l.equals(comparator)) {
            return C0218v.f2647q;
        }
        C0202f c0202f = AbstractC0205i.f2623l;
        return new C0218v(C0216t.f2639o, comparator);
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.n;
    }

    @Override // java.util.SortedSet
    public abstract Object first();

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        C0218v c0218v = (C0218v) this;
        return c0218v.n(0, c0218v.l(obj, false));
    }

    @Override // java.util.NavigableSet
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final AbstractC0212p descendingSet() {
        AbstractC0212p abstractC0212p = this.f2633o;
        if (abstractC0212p == null) {
            C0218v c0218v = (C0218v) this;
            Comparator reverseOrder = Collections.reverseOrder(c0218v.n);
            abstractC0212p = c0218v.isEmpty() ? k(reverseOrder) : new C0218v(c0218v.f2648p.f(), reverseOrder);
            this.f2633o = abstractC0212p;
            abstractC0212p.f2633o = this;
        }
        return abstractC0212p;
    }

    @Override // java.util.NavigableSet
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final C0218v subSet(Object obj, boolean z3, Object obj2, boolean z4) {
        obj.getClass();
        obj2.getClass();
        if (this.n.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        C0218v c0218v = (C0218v) this;
        C0218v n = c0218v.n(c0218v.m(obj, z3), c0218v.f2648p.size());
        return n.n(0, n.l(obj2, z4));
    }

    @Override // java.util.SortedSet
    public abstract Object last();

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        C0218v c0218v = (C0218v) this;
        return c0218v.n(c0218v.m(obj, true), c0218v.f2648p.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z3) {
        obj.getClass();
        C0218v c0218v = (C0218v) this;
        return c0218v.n(0, c0218v.l(obj, z3));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z3) {
        obj.getClass();
        C0218v c0218v = (C0218v) this;
        return c0218v.n(c0218v.m(obj, z3), c0218v.f2648p.size());
    }
}
