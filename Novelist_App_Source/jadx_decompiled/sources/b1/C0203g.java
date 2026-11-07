package b1;

/* renamed from: b1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203g extends AbstractC0205i {

    /* renamed from: m, reason: collision with root package name */
    public final transient AbstractC0205i f2620m;

    public C0203g(AbstractC0205i abstractC0205i) {
        this.f2620m = abstractC0205i;
    }

    @Override // b1.AbstractC0205i, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f2620m.contains(obj);
    }

    @Override // b1.AbstractC0205i
    public final AbstractC0205i f() {
        return this.f2620m;
    }

    @Override // b1.AbstractC0205i, java.util.List
    /* renamed from: g */
    public final AbstractC0205i subList(int i3, int i4) {
        AbstractC0205i abstractC0205i = this.f2620m;
        AbstractC0197a.m(i3, i4, abstractC0205i.size());
        return abstractC0205i.subList(abstractC0205i.size() - i4, abstractC0205i.size() - i3).f();
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0205i abstractC0205i = this.f2620m;
        AbstractC0197a.e(i3, abstractC0205i.size());
        return abstractC0205i.get((abstractC0205i.size() - 1) - i3);
    }

    @Override // b1.AbstractC0205i, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f2620m.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // b1.AbstractC0205i, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f2620m.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2620m.size();
    }
}
