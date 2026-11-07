package p037m;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f4084k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f4085l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f4086m;

    public b(c cVar, c cVar2, int i3) {
        this.f4086m = i3;
        this.f4084k = cVar2;
        this.f4085l = cVar;
    }

    @Override // p037m.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f4084k == cVar && cVar == this.f4085l) {
            this.f4085l = null;
            this.f4084k = null;
        }
        c cVar3 = this.f4084k;
        if (cVar3 == cVar) {
            switch (this.f4086m) {
                case 0:
                    cVar2 = cVar3.n;
                    break;
                default:
                    cVar2 = cVar3.f4089m;
                    break;
            }
            this.f4084k = cVar2;
        }
        c cVar4 = this.f4085l;
        if (cVar4 == cVar) {
            c cVar5 = this.f4084k;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f4085l = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f4086m) {
            case 0:
                return cVar.f4089m;
            default:
                return cVar.n;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4085l != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f4085l;
        c cVar2 = this.f4084k;
        this.f4085l = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
