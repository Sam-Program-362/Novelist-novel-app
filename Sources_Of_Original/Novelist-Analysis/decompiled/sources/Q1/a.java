package Q1;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ListIterator, b2.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1233l;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final P1.a f1235o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1232k = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f1234m = -1;

    public a(c cVar, int i3) {
        this.f1235o = cVar;
        this.f1233l = i3;
        this.n = ((AbstractList) cVar).modCount;
    }

    public void a() {
        if (((AbstractList) ((b) this.f1235o).f1239o).modCount != this.n) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f1232k) {
            case 0:
                a();
                b bVar = (b) this.f1235o;
                int i3 = this.f1233l;
                this.f1233l = i3 + 1;
                bVar.add(i3, obj);
                this.f1234m = -1;
                this.n = ((AbstractList) bVar).modCount;
                break;
            default:
                b();
                c cVar = (c) this.f1235o;
                int i4 = this.f1233l;
                this.f1233l = i4 + 1;
                cVar.add(i4, obj);
                this.f1234m = -1;
                this.n = ((AbstractList) cVar).modCount;
                break;
        }
    }

    public void b() {
        if (((AbstractList) ((c) this.f1235o)).modCount != this.n) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f1232k) {
            case 0:
                return this.f1233l < ((b) this.f1235o).f1238m;
            default:
                return this.f1233l < ((c) this.f1235o).f1241l;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f1232k) {
            case 0:
                return this.f1233l > 0;
            default:
                return this.f1233l > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f1232k) {
            case 0:
                a();
                int i3 = this.f1233l;
                b bVar = (b) this.f1235o;
                if (i3 >= bVar.f1238m) {
                    throw new NoSuchElementException();
                }
                this.f1233l = i3 + 1;
                this.f1234m = i3;
                return bVar.f1236k[bVar.f1237l + i3];
            default:
                b();
                int i4 = this.f1233l;
                c cVar = (c) this.f1235o;
                if (i4 >= cVar.f1241l) {
                    throw new NoSuchElementException();
                }
                this.f1233l = i4 + 1;
                this.f1234m = i4;
                return cVar.f1240k[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f1232k) {
            case 0:
                break;
        }
        return this.f1233l;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f1232k) {
            case 0:
                a();
                int i3 = this.f1233l;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.f1233l = i4;
                this.f1234m = i4;
                b bVar = (b) this.f1235o;
                return bVar.f1236k[bVar.f1237l + i4];
            default:
                b();
                int i5 = this.f1233l;
                if (i5 <= 0) {
                    throw new NoSuchElementException();
                }
                int i6 = i5 - 1;
                this.f1233l = i6;
                this.f1234m = i6;
                return ((c) this.f1235o).f1240k[i6];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i3;
        switch (this.f1232k) {
            case 0:
                i3 = this.f1233l;
                break;
            default:
                i3 = this.f1233l;
                break;
        }
        return i3 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f1232k) {
            case 0:
                b bVar = (b) this.f1235o;
                a();
                int i3 = this.f1234m;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                bVar.b(i3);
                this.f1233l = this.f1234m;
                this.f1234m = -1;
                this.n = ((AbstractList) bVar).modCount;
                return;
            default:
                c cVar = (c) this.f1235o;
                b();
                int i4 = this.f1234m;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.b(i4);
                this.f1233l = this.f1234m;
                this.f1234m = -1;
                this.n = ((AbstractList) cVar).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f1232k) {
            case 0:
                a();
                int i3 = this.f1234m;
                if (i3 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((b) this.f1235o).set(i3, obj);
                return;
            default:
                b();
                int i4 = this.f1234m;
                if (i4 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f1235o).set(i4, obj);
                return;
        }
    }

    public a(b bVar, int i3) {
        this.f1235o = bVar;
        this.f1233l = i3;
        this.n = ((AbstractList) bVar).modCount;
    }
}
