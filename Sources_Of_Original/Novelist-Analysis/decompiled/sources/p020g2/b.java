package p020g2;

import I1.l;
import M1.P;
import a2.h;
import b2.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f2850k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2851l = -2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f2852m;

    public b(c cVar) {
        this.f2852m = cVar;
    }

    public final void a() {
        Object objF;
        int i3 = this.f2851l;
        c cVar = this.f2852m;
        if (i3 == -2) {
            objF = ((l) cVar.f2854b).a();
        } else {
            P p3 = (P) cVar.f2855c;
            Object obj = this.f2850k;
            h.b(obj);
            objF = p3.f(obj);
        }
        this.f2850k = objF;
        this.f2851l = objF == null ? 0 : 1;
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
        h.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f2851l = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
