package g2;

import I1.l;
import M1.P;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: g2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0256b implements Iterator, b2.a {

    /* renamed from: k, reason: collision with root package name */
    public Object f2850k;

    /* renamed from: l, reason: collision with root package name */
    public int f2851l = -2;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f2852m;

    public C0256b(c cVar) {
        this.f2852m = cVar;
    }

    public final void a() {
        Object f3;
        int i3 = this.f2851l;
        c cVar = this.f2852m;
        if (i3 == -2) {
            f3 = ((l) cVar.f2854b).a();
        } else {
            P p3 = (P) cVar.f2855c;
            Object obj = this.f2850k;
            a2.h.b(obj);
            f3 = p3.f(obj);
        }
        this.f2850k = f3;
        this.f2851l = f3 == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2851l < 0) {
            a();
        }
        return this.f2851l == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2851l < 0) {
            a();
        }
        if (this.f2851l == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f2850k;
        a2.h.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f2851l = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
