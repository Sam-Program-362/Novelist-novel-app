package e2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator, b2.a {

    /* renamed from: k, reason: collision with root package name */
    public final int f2786k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2787l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2788m;
    public int n;

    public b(int i3, int i4, int i5) {
        this.f2786k = i5;
        this.f2787l = i4;
        boolean z3 = false;
        if (i5 <= 0 ? i3 >= i4 : i3 <= i4) {
            z3 = true;
        }
        this.f2788m = z3;
        this.n = z3 ? i3 : i4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2788m;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i3 = this.n;
        if (i3 != this.f2787l) {
            this.n = this.f2786k + i3;
            return i3;
        }
        if (!this.f2788m) {
            throw new NoSuchElementException();
        }
        this.f2788m = false;
        return i3;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
