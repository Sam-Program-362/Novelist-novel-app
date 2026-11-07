package p004b1;

import java.util.AbstractMap;

/* JADX INFO: renamed from: b1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0180m extends AbstractC0176i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0181n f2629m;

    public C0180m(C0181n c0181n) {
        this.f2629m = c0181n;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i3) {
        C0181n c0181n = this.f2629m;
        return new AbstractMap.SimpleImmutableEntry(c0181n.n.f2631m.f2648p.get(i3), c0181n.n.n.get(i3));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2629m.n.n.size();
    }
}
