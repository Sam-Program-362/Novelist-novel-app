package p004b1;

import java.util.Objects;

/* JADX INFO: renamed from: b1.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0186t extends AbstractC0176i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C0186t f2639o = new C0186t(0, new Object[0]);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient Object[] f2640m;
    public final transient int n;

    public C0186t(int i3, Object[] objArr) {
        this.f2640m = objArr;
        this.n = i3;
    }

    @Override // p004b1.AbstractC0176i, p004b1.AbstractC0172e
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f2640m;
        int i3 = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // p004b1.AbstractC0172e
    public final int b() {
        return this.n;
    }

    @Override // p004b1.AbstractC0172e
    public final int c() {
        return 0;
    }

    @Override // p004b1.AbstractC0172e
    public final Object[] e() {
        return this.f2640m;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0168a.e(i3, this.n);
        Object obj = this.f2640m[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
