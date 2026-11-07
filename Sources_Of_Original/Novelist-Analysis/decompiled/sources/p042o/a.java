package p042o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator, b2.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4182k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4183l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4184m;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f4185o;

    public a(int i3) {
        this.f4182k = i3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4183l < this.f4182k;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objE;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i3 = this.f4183l;
        switch (this.n) {
            case 0:
                objE = ((e) this.f4185o).e(i3);
                break;
            case 1:
                objE = ((e) this.f4185o).h(i3);
                break;
            default:
                objE = ((f) this.f4185o).f4194l[i3];
                break;
        }
        this.f4183l++;
        this.f4184m = true;
        return objE;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4184m) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i3 = this.f4183l - 1;
        this.f4183l = i3;
        switch (this.n) {
            case 0:
                ((e) this.f4185o).f(i3);
                break;
            case 1:
                ((e) this.f4185o).f(i3);
                break;
            default:
                ((f) this.f4185o).a(i3);
                break;
        }
        this.f4182k--;
        this.f4184m = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar.f4195m);
        this.n = 2;
        this.f4185o = fVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(e eVar, int i3) {
        this(eVar.f4209m);
        this.n = i3;
        switch (i3) {
            case 1:
                this.f4185o = eVar;
                this(eVar.f4209m);
                break;
            default:
                this.f4185o = eVar;
                break;
        }
    }
}
