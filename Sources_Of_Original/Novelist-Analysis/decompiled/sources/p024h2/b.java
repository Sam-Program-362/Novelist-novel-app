package p024h2;

import B1.e;
import a2.h;
import b2.a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p012e2.c;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2905k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2906l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2907m;
    public c n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p020g2.c f2908o;

    public b(p020g2.c cVar) {
        this.f2908o = cVar;
        int length = ((CharSequence) cVar.f2854b).length();
        if (length < 0) {
            throw new IllegalArgumentException(e.h("Cannot coerce value to an empty range: maximum ", length, " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f2906l = length;
        this.f2907m = length;
    }

    public final void a() {
        O1.b bVar;
        p020g2.c cVar = this.f2908o;
        CharSequence charSequence = (CharSequence) cVar.f2854b;
        int i3 = this.f2907m;
        if (i3 < 0) {
            this.f2905k = 0;
            this.n = null;
            return;
        }
        if (i3 <= charSequence.length() && (bVar = (O1.b) ((m) cVar.f2855c).e(charSequence, Integer.valueOf(this.f2907m))) != null) {
            int iIntValue = ((Number) bVar.f1203k).intValue();
            int iIntValue2 = ((Number) bVar.f1204l).intValue();
            this.n = iIntValue <= Integer.MIN_VALUE ? c.n : new c(this.f2906l, iIntValue - 1, 1);
            int i4 = iIntValue + iIntValue2;
            this.f2906l = i4;
            this.f2907m = i4 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.n = new c(this.f2906l, d.a0(charSequence), 1);
            this.f2907m = -1;
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
        c cVar = this.n;
        h.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.n = null;
        this.f2905k = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
