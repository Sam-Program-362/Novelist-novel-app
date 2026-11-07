package p004b1;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: renamed from: b1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0183p extends AbstractC0178k implements NavigableSet, InterfaceC0191y {
    public final transient Comparator n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient AbstractC0183p f2633o;

    public AbstractC0183p(Comparator comparator) {
        this.n = comparator;
    }

    public static C0188v k(Comparator comparator) {
        if (r.f2636l.equals(comparator)) {
            return C0188v.f2647q;
        }
        C0173f c0173f = AbstractC0176i.f2623l;
        return new C0188v(C0186t.f2639o, comparator);
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
        C0188v c0188v = (C0188v) this;
        return c0188v.n(0, c0188v.l(obj, false));
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final AbstractC0183p descendingSet() {
        AbstractC0183p abstractC0183pK = this.f2633o;
        if (abstractC0183pK == null) {
            C0188v c0188v = (C0188v) this;
            Comparator comparatorReverseOrder = Collections.reverseOrder(c0188v.n);
            abstractC0183pK = c0188v.isEmpty() ? k(comparatorReverseOrder) : new C0188v(c0188v.f2648p.f(), comparatorReverseOrder);
            this.f2633o = abstractC0183pK;
            abstractC0183pK.f2633o = this;
        }
        return abstractC0183pK;
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final C0188v subSet(Object obj, boolean z3, Object obj2, boolean z4) {
        obj.getClass();
        obj2.getClass();
        if (this.n.compare(obj, obj2) > 0) {
            throw new IllegalArgumentException();
        }
        C0188v c0188v = (C0188v) this;
        C0188v c0188vN = c0188v.n(c0188v.m(obj, z3), c0188v.f2648p.size());
        return c0188vN.n(0, c0188vN.l(obj2, z4));
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
        C0188v c0188v = (C0188v) this;
        return c0188v.n(c0188v.m(obj, true), c0188v.f2648p.size());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z3) {
        obj.getClass();
        C0188v c0188v = (C0188v) this;
        return c0188v.n(0, c0188v.l(obj, z3));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z3) {
        obj.getClass();
        C0188v c0188v = (C0188v) this;
        return c0188v.n(c0188v.m(obj, z3), c0188v.f2648p.size());
    }
}
