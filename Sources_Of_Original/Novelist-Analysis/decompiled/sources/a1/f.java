package a1;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f1692o = new f(0, new Object[0]);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient Object[] f1693m;
    public final transient int n;

    public f(int i3, Object[] objArr) {
        this.f1693m = objArr;
        this.n = i3;
    }

    @Override // a1.a
    public final Object[] a() {
        return this.f1693m;
    }

    @Override // a1.a
    public final int b() {
        return 0;
    }

    @Override // a1.a
    public final int c() {
        return this.n;
    }

    @Override // a1.e, a1.a
    public final int d(Object[] objArr) {
        Object[] objArr2 = this.f1693m;
        int i3 = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        p000a.a.T(i3, this.n);
        Object obj = this.f1693m[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
