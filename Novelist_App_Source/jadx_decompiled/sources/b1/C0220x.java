package b1;

import java.util.Iterator;
import t.AbstractC0468a;

/* renamed from: b1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220x extends AbstractC0207k {
    public final transient Object n;

    public C0220x(Object obj) {
        this.n = obj;
    }

    @Override // b1.AbstractC0201e
    public final int a(Object[] objArr) {
        objArr[0] = this.n;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.n.equals(obj);
    }

    @Override // b1.AbstractC0201e
    public final AbstractC0222z d() {
        return new C0213q(this.n);
    }

    @Override // b1.AbstractC0207k
    public final AbstractC0205i f() {
        Object[] objArr = {this.n};
        for (int i3 = 0; i3 < 1; i3++) {
            C0202f c0202f = AbstractC0205i.f2623l;
            if (objArr[i3] == null) {
                throw new NullPointerException(B1.e.g("at index ", i3));
            }
        }
        return AbstractC0205i.i(1, objArr);
    }

    @Override // b1.AbstractC0207k, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.n.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C0213q(this.n);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC0468a.b("[", this.n.toString(), "]");
    }
}
