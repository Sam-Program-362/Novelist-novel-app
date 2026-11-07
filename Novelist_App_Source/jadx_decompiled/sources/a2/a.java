package a2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator, b2.a {

    /* renamed from: k, reason: collision with root package name */
    public final Object[] f1695k;

    /* renamed from: l, reason: collision with root package name */
    public int f1696l;

    public a(Object[] objArr) {
        this.f1695k = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1696l < this.f1695k.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            Object[] objArr = this.f1695k;
            int i3 = this.f1696l;
            this.f1696l = i3 + 1;
            return objArr[i3];
        } catch (ArrayIndexOutOfBoundsException e3) {
            this.f1696l--;
            throw new NoSuchElementException(e3.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
