package h2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: h2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271b implements Iterator, b2.a {

    /* renamed from: k, reason: collision with root package name */
    public int f2905k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f2906l;

    /* renamed from: m, reason: collision with root package name */
    public int f2907m;
    public e2.c n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g2.c f2908o;

    public C0271b(g2.c cVar) {
        this.f2908o = cVar;
        int length = ((CharSequence) cVar.f2854b).length();
        if (length < 0) {
            throw new IllegalArgumentException(B1.e.h("Cannot coerce value to an empty range: maximum ", length, " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f2906l = length;
        this.f2907m = length;
    }

    public final void a() {
        g2.c cVar = this.f2908o;
        CharSequence charSequence = (CharSequence) cVar.f2854b;
        int i3 = this.f2907m;
        if (i3 < 0) {
            this.f2905k = 0;
            this.n = null;
            return;
        }
        if (i3 > charSequence.length()) {
            this.n = new e2.c(this.f2906l, AbstractC0273d.a0(charSequence), 1);
            this.f2907m = -1;
        } else {
            O1.b bVar = (O1.b) ((m) cVar.f2855c).e(charSequence, Integer.valueOf(this.f2907m));
            if (bVar == null) {
                this.n = new e2.c(this.f2906l, AbstractC0273d.a0(charSequence), 1);
                this.f2907m = -1;
            } else {
                int intValue = ((Number) bVar.f1203k).intValue();
                int intValue2 = ((Number) bVar.f1204l).intValue();
                this.n = intValue <= Integer.MIN_VALUE ? e2.c.n : new e2.c(this.f2906l, intValue - 1, 1);
                int i4 = intValue + intValue2;
                this.f2906l = i4;
                this.f2907m = i4 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.f2905k = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2905k == -1) {
            a();
        }
        return this.f2905k == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2905k == -1) {
            a();
        }
        if (this.f2905k == 0) {
            throw new NoSuchElementException();
        }
        e2.c cVar = this.n;
        a2.h.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.n = null;
        this.f2905k = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
