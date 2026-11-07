package Y0;

/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: m, reason: collision with root package name */
    public final transient int f1600m;
    public final transient int n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f1601o;

    public k(l lVar, int i3, int i4) {
        this.f1601o = lVar;
        this.f1600m = i3;
        this.n = i4;
    }

    @Override // Y0.i
    public final Object[] a() {
        return this.f1601o.a();
    }

    @Override // Y0.i
    public final int b() {
        return this.f1601o.b() + this.f1600m;
    }

    @Override // Y0.i
    public final int c() {
        return this.f1601o.b() + this.f1600m + this.n;
    }

    @Override // Y0.i
    public final boolean d() {
        return true;
    }

    @Override // Y0.l, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final l subList(int i3, int i4) {
        f.e(i3, i4, this.n);
        int i5 = this.f1600m;
        return this.f1601o.subList(i3 + i5, i4 + i5);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        f.c(i3, this.n);
        return this.f1601o.get(i3 + this.f1600m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
