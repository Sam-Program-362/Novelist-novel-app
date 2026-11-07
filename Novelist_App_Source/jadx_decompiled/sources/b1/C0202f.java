package b1;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: b1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202f extends AbstractC0222z implements ListIterator {

    /* renamed from: k, reason: collision with root package name */
    public final int f2617k;

    /* renamed from: l, reason: collision with root package name */
    public int f2618l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC0205i f2619m;

    public C0202f(AbstractC0205i abstractC0205i, int i3) {
        int size = abstractC0205i.size();
        if (i3 < 0 || i3 > size) {
            throw new IndexOutOfBoundsException(AbstractC0197a.n(i3, "index", size));
        }
        this.f2617k = size;
        this.f2618l = i3;
        this.f2619m = abstractC0205i;
    }

    public final Object a(int i3) {
        return this.f2619m.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f2618l < this.f2617k;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2618l > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f2618l;
        this.f2618l = i3 + 1;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2618l;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f2618l - 1;
        this.f2618l = i3;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2618l - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
