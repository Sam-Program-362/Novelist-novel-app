package Y0;

import java.util.Objects;

/* loaded from: classes.dex */
public final class m extends l {

    /* renamed from: o, reason: collision with root package name */
    public static final m f1603o = new m(0, new Object[0]);

    /* renamed from: m, reason: collision with root package name */
    public final transient Object[] f1604m;
    public final transient int n;

    public m(int i3, Object[] objArr) {
        this.f1604m = objArr;
        this.n = i3;
    }

    @Override // Y0.i
    public final Object[] a() {
        return this.f1604m;
    }

    @Override // Y0.i
    public final int b() {
        return 0;
    }

    @Override // Y0.i
    public final int c() {
        return this.n;
    }

    @Override // Y0.i
    public final boolean d() {
        return false;
    }

    @Override // Y0.l, Y0.i
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f1604m;
        int i3 = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        f.c(i3, this.n);
        Object obj = this.f1604m[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
