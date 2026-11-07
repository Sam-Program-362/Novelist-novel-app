package a1;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ListIterator, Iterator {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f1685k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1686l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f1687m;

    public b(e eVar, int i3) {
        int size = eVar.size();
        if (i3 < 0 || i3 > size) {
            throw new IndexOutOfBoundsException(p000a.a.V(i3, "index", size));
        }
        this.f1685k = size;
        this.f1686l = i3;
        this.f1687m = eVar;
    }

    public final Object a(int i3) {
        return this.f1687m.get(i3);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f1686l < this.f1685k;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1686l > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f1686l;
        this.f1686l = i3 + 1;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1686l;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f1686l - 1;
        this.f1686l = i3;
        return a(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1686l - 1;
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
