package p004b1;

import java.util.Set;

/* JADX INFO: renamed from: b1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0178k extends AbstractC0172e implements Set {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f2626m = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public transient AbstractC0176i f2627l;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC0178k) && (this instanceof C0187u)) {
            AbstractC0178k abstractC0178k = (AbstractC0178k) obj;
            abstractC0178k.getClass();
            if ((abstractC0178k instanceof C0187u) && ((C0187u) this).f2643o != obj.hashCode()) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return size() == set.size() && containsAll(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public AbstractC0176i f() {
        AbstractC0176i abstractC0176i = this.f2627l;
        if (abstractC0176i != null) {
            return abstractC0176i;
        }
        AbstractC0176i abstractC0176iG = g();
        this.f2627l = abstractC0176iG;
        return abstractC0176iG;
    }

    public AbstractC0176i g() {
        Object[] array = toArray(AbstractC0172e.f2616k);
        C0173f c0173f = AbstractC0176i.f2623l;
        return AbstractC0176i.i(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC0168a.b(this);
    }
}
