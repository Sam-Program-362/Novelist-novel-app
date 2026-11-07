package p004b1;

/* JADX INFO: renamed from: b1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0174g extends AbstractC0176i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient AbstractC0176i f2620m;

    public C0174g(AbstractC0176i abstractC0176i) {
        this.f2620m = abstractC0176i;
    }

    @Override // p004b1.AbstractC0176i, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f2620m.contains(obj);
    }

    @Override // p004b1.AbstractC0176i
    public final AbstractC0176i f() {
        return this.f2620m;
    }

    @Override // p004b1.AbstractC0176i, java.util.List
    /* JADX INFO: renamed from: g */
    public final AbstractC0176i subList(int i3, int i4) {
        AbstractC0176i abstractC0176i = this.f2620m;
        AbstractC0168a.m(i3, i4, abstractC0176i.size());
        return abstractC0176i.subList(abstractC0176i.size() - i4, abstractC0176i.size() - i3).f();
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0176i abstractC0176i = this.f2620m;
        AbstractC0168a.e(i3, abstractC0176i.size());
        return abstractC0176i.get((abstractC0176i.size() - 1) - i3);
    }

    @Override // p004b1.AbstractC0176i, java.util.List
    public final int indexOf(Object obj) {
        AbstractC0176i abstractC0176i = this.f2620m;
        int iLastIndexOf = abstractC0176i.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (abstractC0176i.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // p004b1.AbstractC0176i, java.util.List
    public final int lastIndexOf(Object obj) {
        AbstractC0176i abstractC0176i = this.f2620m;
        int iIndexOf = abstractC0176i.indexOf(obj);
        if (iIndexOf >= 0) {
            return (abstractC0176i.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2620m.size();
    }
}
