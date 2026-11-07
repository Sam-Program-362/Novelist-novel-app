package p037m;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f4090k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4091l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f4092m;

    public d(f fVar) {
        this.f4092m = fVar;
    }

    @Override // p037m.e
    public final void a(c cVar) {
        c cVar2 = this.f4090k;
        if (cVar == cVar2) {
            c cVar3 = cVar2.n;
            this.f4090k = cVar3;
            this.f4091l = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4091l) {
            return this.f4092m.f4093k != null;
        }
        c cVar = this.f4090k;
        return (cVar == null || cVar.f4089m == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4091l) {
            this.f4091l = false;
            this.f4090k = this.f4092m.f4093k;
        } else {
            c cVar = this.f4090k;
            this.f4090k = cVar != null ? cVar.f4089m : null;
        }
        return this.f4090k;
    }
}
