package p004b1;

/* JADX INFO: renamed from: b1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0175h extends AbstractC0176i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient int f2621m;
    public final transient int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0176i f2622o;

    public C0175h(AbstractC0176i abstractC0176i, int i3, int i4) {
        this.f2622o = abstractC0176i;
        this.f2621m = i3;
        this.n = i4;
    }

    @Override // p004b1.AbstractC0172e
    public final int b() {
        return this.f2622o.c() + this.f2621m + this.n;
    }

    @Override // p004b1.AbstractC0172e
    public final int c() {
        return this.f2622o.c() + this.f2621m;
    }

    @Override // p004b1.AbstractC0172e
    public final Object[] e() {
        return this.f2622o.e();
    }

    @Override // p004b1.AbstractC0176i, java.util.List
    /* JADX INFO: renamed from: g */
    public final AbstractC0176i subList(int i3, int i4) {
        AbstractC0168a.m(i3, i4, this.n);
        int i5 = this.f2621m;
        return this.f2622o.subList(i3 + i5, i4 + i5);
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0168a.e(i3, this.n);
        return this.f2622o.get(i3 + this.f2621m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
