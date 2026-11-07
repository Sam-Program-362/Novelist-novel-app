package b1;

import java.util.Set;

/* renamed from: b1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0207k extends AbstractC0201e implements Set {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f2626m = 0;

    /* renamed from: l, reason: collision with root package name */
    public transient AbstractC0205i f2627l;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC0207k) && (this instanceof C0217u)) {
            AbstractC0207k abstractC0207k = (AbstractC0207k) obj;
            abstractC0207k.getClass();
            if ((abstractC0207k instanceof C0217u) && ((C0217u) this).f2643o != obj.hashCode()) {
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
            if (size() == set.size()) {
                return containsAll(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public AbstractC0205i f() {
        AbstractC0205i abstractC0205i = this.f2627l;
        if (abstractC0205i != null) {
            return abstractC0205i;
        }
        AbstractC0205i g3 = g();
        this.f2627l = g3;
        return g3;
    }

    public AbstractC0205i g() {
        Object[] array = toArray(AbstractC0201e.f2616k);
        C0202f c0202f = AbstractC0205i.f2623l;
        return AbstractC0205i.i(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC0197a.b(this);
    }
}
