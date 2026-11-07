package p004b1;

import B1.e;
import java.util.Iterator;
import p055t.a;

/* JADX INFO: renamed from: b1.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0190x extends AbstractC0178k {
    public final transient Object n;

    public C0190x(Object obj) {
        this.n = obj;
    }

    @Override // p004b1.AbstractC0172e
    public final int a(Object[] objArr) {
        objArr[0] = this.n;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.n.equals(obj);
    }

    @Override // p004b1.AbstractC0172e
    public final AbstractC0192z d() {
        return new C0184q(this.n);
    }

    @Override // p004b1.AbstractC0178k
    public final AbstractC0176i f() {
        Object[] objArr = {this.n};
        for (int i3 = 0; i3 < 1; i3++) {
            C0173f c0173f = AbstractC0176i.f2623l;
            if (objArr[i3] == null) {
                throw new NullPointerException(e.g("at index ", i3));
            }
        }
        return AbstractC0176i.i(1, objArr);
    }

    @Override // p004b1.AbstractC0178k, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.n.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C0184q(this.n);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return a.b("[", this.n.toString(), "]");
    }
}
