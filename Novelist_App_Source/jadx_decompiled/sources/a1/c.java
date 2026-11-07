package a1;

import a.AbstractC0102a;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: m, reason: collision with root package name */
    public final transient e f1688m;

    public c(e eVar) {
        this.f1688m = eVar;
    }

    @Override // a1.e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f1688m.contains(obj);
    }

    @Override // a1.e
    public final e e() {
        return this.f1688m;
    }

    @Override // a1.e, java.util.List
    /* renamed from: f */
    public final e subList(int i3, int i4) {
        e eVar = this.f1688m;
        AbstractC0102a.U(i3, i4, eVar.size());
        return eVar.subList(eVar.size() - i4, eVar.size() - i3).e();
    }

    @Override // java.util.List
    public final Object get(int i3) {
        e eVar = this.f1688m;
        AbstractC0102a.T(i3, eVar.size());
        return eVar.get((eVar.size() - 1) - i3);
    }

    @Override // a1.e, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f1688m.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // a1.e, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f1688m.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1688m.size();
    }
}
