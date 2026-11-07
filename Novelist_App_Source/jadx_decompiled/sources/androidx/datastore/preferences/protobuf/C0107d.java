package androidx.datastore.preferences.protobuf;

import b1.C0185J;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0107d implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2037k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f2038l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f2039m;
    public final /* synthetic */ Object n;

    public C0107d(C0185J c0185j) {
        this.n = c0185j;
        this.f2039m = c0185j.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2037k) {
            case 0:
                if (this.f2038l < this.f2039m) {
                }
                break;
            default:
                if (this.f2038l < this.f2039m) {
                }
                break;
        }
        return false;
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
                return Byte.valueOf(((C0110g) this.n).f(i3));
            default:
                int i4 = this.f2038l;
                if (i4 >= this.f2039m) {
                    throw new NoSuchElementException();
                }
                this.f2038l = i4 + 1;
                return Byte.valueOf(((C0185J) this.n).b(i4));
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

    public C0107d(C0110g c0110g) {
        this.n = c0110g;
        this.f2039m = c0110g.size();
    }
}
