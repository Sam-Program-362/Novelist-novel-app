package p004b1;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: b1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0181n extends AbstractC0178k {
    public final /* synthetic */ C0182o n;

    public C0181n(C0182o c0182o) {
        this.n = c0182o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.n.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // p004b1.AbstractC0172e
    public final AbstractC0192z d() {
        return f().listIterator(0);
    }

    @Override // p004b1.AbstractC0178k
    public final AbstractC0176i g() {
        return new C0180m(this);
    }

    @Override // p004b1.AbstractC0178k, java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC0168a.b(this.n.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n.n.size();
    }
}
