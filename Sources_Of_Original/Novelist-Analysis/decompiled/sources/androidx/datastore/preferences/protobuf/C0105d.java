package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0105d implements Iterator {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2037k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2038l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2039m;
    public final /* synthetic */ Object n;

    public C0105d(p004b1.J j3) {
        this.n = j3;
        this.f2039m = j3.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2037k) {
            case 0:
                return this.f2038l < this.f2039m;
            default:
                return this.f2038l < this.f2039m;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2037k) {
            case 0:
                int i3 = this.f2038l;
                if (i3 >= this.f2039m) {
                    throw new NoSuchElementException();
                }
                this.f2038l = i3 + 1;
                return Byte.valueOf(((C0108g) this.n).f(i3));
            default:
                int i4 = this.f2038l;
                if (i4 >= this.f2039m) {
                    throw new NoSuchElementException();
                }
                this.f2038l = i4 + 1;
                return Byte.valueOf(((p004b1.J) this.n).b(i4));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f2037k) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0105d(C0108g c0108g) {
        this.n = c0108g;
        this.f2039m = c0108g.size();
    }
}
