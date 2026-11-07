package p004b1;

import B1.e;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: b1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0177j implements Map, Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Map.Entry[] f2624l = new Map.Entry[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public transient AbstractC0178k f2625k;

    @Override // java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC0178k entrySet() {
        AbstractC0178k c0181n = this.f2625k;
        if (c0181n == null) {
            C0182o c0182o = (C0182o) this;
            c0181n = c0182o.isEmpty() ? C0187u.f2642t : new C0181n(c0182o);
            this.f2625k = c0181n;
        }
        return c0181n;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return ((C0182o) this).n.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return ((C0182o) this).entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC0168a.b(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((C0182o) this).size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        C0182o c0182o = (C0182o) this;
        int size = c0182o.size();
        if (size < 0) {
            throw new IllegalArgumentException(e.g("size cannot be negative but was: ", size));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z3 = true;
        for (Map.Entry entry : c0182o.entrySet()) {
            if (!z3) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z3 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
