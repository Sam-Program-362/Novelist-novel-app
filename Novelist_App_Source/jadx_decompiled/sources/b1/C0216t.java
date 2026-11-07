package b1;

import java.util.Objects;

/* renamed from: b1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0216t extends AbstractC0205i {

    /* renamed from: o, reason: collision with root package name */
    public static final C0216t f2639o = new C0216t(0, new Object[0]);

    /* renamed from: m, reason: collision with root package name */
    public final transient Object[] f2640m;
    public final transient int n;

    public C0216t(int i3, Object[] objArr) {
        this.f2640m = objArr;
        this.n = i3;
    }

    @Override // b1.AbstractC0205i, b1.AbstractC0201e
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f2640m;
        int i3 = this.n;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // b1.AbstractC0201e
    public final int b() {
        return this.n;
    }

    @Override // b1.AbstractC0201e
    public final int c() {
        return 0;
    }

    @Override // b1.AbstractC0201e
    public final Object[] e() {
        return this.f2640m;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        AbstractC0197a.e(i3, this.n);
        Object obj = this.f2640m[i3];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n;
    }
}
