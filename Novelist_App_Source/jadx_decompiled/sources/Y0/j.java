package Y0;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class j implements ListIterator, Iterator {

    /* renamed from: k, reason: collision with root package name */
    public final int f1597k;

    /* renamed from: l, reason: collision with root package name */
    public int f1598l;

    /* renamed from: m, reason: collision with root package name */
    public final l f1599m;

    public j(l lVar, int i3) {
        int size = lVar.size();
        if (i3 < 0 || i3 > size) {
            throw new IndexOutOfBoundsException(f.f(i3, "index", size));
        }
        this.f1597k = size;
        this.f1598l = i3;
        this.f1599m = lVar;
    }

    public final Object a(int i3) {
        return this.f1599m.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f1598l < this.f1597k;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1598l > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f1598l;
        this.f1598l = i3 + 1;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1598l;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f1598l - 1;
        this.f1598l = i3;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1598l - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
