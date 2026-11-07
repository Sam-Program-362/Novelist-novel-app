package a1;

import a.AbstractC0102a;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: m, reason: collision with root package name */
    public final transient int f1689m;
    public final transient int n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e f1690o;

    public d(e eVar, int i3, int i4) {
        this.f1690o = eVar;
        this.f1689m = i3;
        this.n = i4;
    }

    @Override // a1.a
    public final Object[] a() {
        return this.f1690o.a();
    }

    @Override // a1.a
    public final int b() {
        return this.f1690o.b() + this.f1689m;
    }

    @Override // a1.a
    public final int c() {
        return this.f1690o.b() + this.f1689m + this.n;
    }

    @Override // a1.e, java.util.List
    /* renamed from: f */
    public final e subList(int i3, int i4) {
        AbstractC0102a.U(i3, i4, this.n);
        int i5 = this.f1689m;
        return this.f1690o.subList(i3 + i5, i4 + i5);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0102a.T(i3, this.n);
        return this.f1690o.get(i3 + this.f1689m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
