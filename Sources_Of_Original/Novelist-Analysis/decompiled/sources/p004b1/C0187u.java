package p004b1;

import java.util.Iterator;

/* JADX INFO: renamed from: b1.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0187u extends AbstractC0178k {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object[] f2641s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0187u f2642t;
    public final transient Object[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient int f2643o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final transient Object[] f2644p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient int f2645q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient int f2646r;

    static {
        Object[] objArr = new Object[0];
        f2641s = objArr;
        f2642t = new C0187u(0, 0, 0, objArr, objArr);
    }

    public C0187u(int i3, int i4, int i5, Object[] objArr, Object[] objArr2) {
        this.n = objArr;
        this.f2643o = i3;
        this.f2644p = objArr2;
        this.f2645q = i4;
        this.f2646r = i5;
    }

    @Override // p004b1.AbstractC0172e
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.n;
        int i3 = this.f2646r;
        System.arraycopy(objArr2, 0, objArr, 0, i3);
        return i3;
    }

    @Override // p004b1.AbstractC0172e
    public final int b() {
        return this.f2646r;
    }

    @Override // p004b1.AbstractC0172e
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
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i3 = iRotateLeft & this.f2645q;
            Object obj2 = objArr[i3];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i3 + 1;
        }
    }

    @Override // p004b1.AbstractC0172e
    public final AbstractC0192z d() {
        return f().listIterator(0);
    }

    @Override // p004b1.AbstractC0172e
    public final Object[] e() {
        return this.n;
    }

    @Override // p004b1.AbstractC0178k
    public final AbstractC0176i g() {
        return AbstractC0176i.i(this.f2646r, this.n);
    }

    @Override // p004b1.AbstractC0178k, java.util.Collection, java.util.Set
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
