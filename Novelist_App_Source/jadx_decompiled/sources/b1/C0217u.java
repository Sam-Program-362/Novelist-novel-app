package b1;

import java.util.Iterator;

/* renamed from: b1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217u extends AbstractC0207k {

    /* renamed from: s, reason: collision with root package name */
    public static final Object[] f2641s;

    /* renamed from: t, reason: collision with root package name */
    public static final C0217u f2642t;
    public final transient Object[] n;

    /* renamed from: o, reason: collision with root package name */
    public final transient int f2643o;

    /* renamed from: p, reason: collision with root package name */
    public final transient Object[] f2644p;

    /* renamed from: q, reason: collision with root package name */
    public final transient int f2645q;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f2646r;

    static {
        Object[] objArr = new Object[0];
        f2641s = objArr;
        f2642t = new C0217u(0, 0, 0, objArr, objArr);
    }

    public C0217u(int i3, int i4, int i5, Object[] objArr, Object[] objArr2) {
        this.n = objArr;
        this.f2643o = i3;
        this.f2644p = objArr2;
        this.f2645q = i4;
        this.f2646r = i5;
    }

    @Override // b1.AbstractC0201e
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.n;
        int i3 = this.f2646r;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // b1.AbstractC0201e
    public final int b() {
        return this.f2646r;
    }

    @Override // b1.AbstractC0201e
    public final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f2644p;
        if (objArr.length == 0) {
            return false;
        }
        int rotateLeft = (int) (Integer.rotateLeft((int) (obj.hashCode() * (-862048943)), 15) * 461845907);
        while (true) {
            int i3 = rotateLeft & this.f2645q;
            Object obj2 = objArr[i3];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            rotateLeft = i3 + 1;
        }
    }

    @Override // b1.AbstractC0201e
    public final AbstractC0222z d() {
        return f().listIterator(0);
    }

    @Override // b1.AbstractC0201e
    public final Object[] e() {
        return this.n;
    }

    @Override // b1.AbstractC0207k
    public final AbstractC0205i g() {
        return AbstractC0205i.i(this.f2646r, this.n);
    }

    @Override // b1.AbstractC0207k, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f2643o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2646r;
    }
}
