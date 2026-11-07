package b1;

import java.util.Iterator;
import java.util.Map;

/* renamed from: b1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210n extends AbstractC0207k {
    public final /* synthetic */ C0211o n;

    public C0210n(C0211o c0211o) {
        this.n = c0211o;
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

    @Override // b1.AbstractC0201e
    public final AbstractC0222z d() {
        return f().listIterator(0);
    }

    @Override // b1.AbstractC0207k
    public final AbstractC0205i g() {
        return new C0209m(this);
    }

    @Override // b1.AbstractC0207k, java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC0197a.b(this.n.entrySet());
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
