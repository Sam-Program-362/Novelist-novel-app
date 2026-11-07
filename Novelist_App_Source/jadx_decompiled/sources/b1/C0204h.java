package b1;

/* renamed from: b1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204h extends AbstractC0205i {

    /* renamed from: m, reason: collision with root package name */
    public final transient int f2621m;
    public final transient int n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0205i f2622o;

    public C0204h(AbstractC0205i abstractC0205i, int i3, int i4) {
        this.f2622o = abstractC0205i;
        this.f2621m = i3;
        this.n = i4;
    }

    @Override // b1.AbstractC0201e
    public final int b() {
        return this.f2622o.c() + this.f2621m + this.n;
    }

    @Override // b1.AbstractC0201e
    public final int c() {
        return this.f2622o.c() + this.f2621m;
    }

    @Override // b1.AbstractC0201e
    public final Object[] e() {
        return this.f2622o.e();
    }

    @Override // b1.AbstractC0205i, java.util.List
    /* renamed from: g */
    public final AbstractC0205i subList(int i3, int i4) {
        AbstractC0197a.m(i3, i4, this.n);
        int i5 = this.f2621m;
        return this.f2622o.subList(i3 + i5, i4 + i5);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0197a.e(i3, this.n);
        return this.f2622o.get(i3 + this.f2621m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
