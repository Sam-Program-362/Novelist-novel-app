package b1;

import java.io.Serializable;
import java.util.Map;

/* renamed from: b1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0206j implements Map, Serializable {

    /* renamed from: l, reason: collision with root package name */
    public static final Map.Entry[] f2624l = new Map.Entry[0];

    /* renamed from: k, reason: collision with root package name */
    public transient AbstractC0207k f2625k;

    @Override // java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final AbstractC0207k entrySet() {
        AbstractC0207k abstractC0207k = this.f2625k;
        if (abstractC0207k == null) {
            C0211o c0211o = (C0211o) this;
            abstractC0207k = c0211o.isEmpty() ? C0217u.f2642t : new C0210n(c0211o);
            this.f2625k = abstractC0207k;
        }
        return abstractC0207k;
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
        return ((C0211o) this).n.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return ((C0211o) this).entrySet().equals(((Map) obj).entrySet());
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
        return AbstractC0197a.b(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((C0211o) this).size() == 0;
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
        C0211o c0211o = (C0211o) this;
        int size = c0211o.size();
        if (size < 0) {
            throw new IllegalArgumentException(B1.e.g("size cannot be negative but was: ", size));
        }
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z3 = true;
        for (Map.Entry entry : c0211o.entrySet()) {
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
