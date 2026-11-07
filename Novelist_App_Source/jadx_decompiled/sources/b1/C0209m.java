package b1;

import java.util.AbstractMap;

/* renamed from: b1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209m extends AbstractC0205i {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0210n f2629m;

    public C0209m(C0210n c0210n) {
        this.f2629m = c0210n;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i3) {
        C0210n c0210n = this.f2629m;
        return new AbstractMap.SimpleImmutableEntry(c0210n.n.f2631m.f2648p.get(i3), c0210n.n.n.get(i3));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2629m.n.n.size();
    }
}
