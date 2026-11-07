package o;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: o.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0438c implements Iterator, Map.Entry {

    /* renamed from: k, reason: collision with root package name */
    public int f4187k;

    /* renamed from: l, reason: collision with root package name */
    public int f4188l = -1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4189m;
    public final /* synthetic */ e n;

    public C0438c(e eVar) {
        this.n = eVar;
        this.f4187k = eVar.f4209m - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f4189m) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i3 = this.f4188l;
        e eVar = this.n;
        return a2.h.a(key, eVar.e(i3)) && a2.h.a(entry.getValue(), eVar.h(this.f4188l));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f4189m) {
            return this.n.e(this.f4188l);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f4189m) {
            return this.n.h(this.f4188l);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4188l < this.f4187k;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f4189m) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i3 = this.f4188l;
        e eVar = this.n;
        Object e3 = eVar.e(i3);
        Object h3 = eVar.h(this.f4188l);
        return (e3 == null ? 0 : e3.hashCode()) ^ (h3 != null ? h3.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4188l++;
        this.f4189m = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f4189m) {
            throw new IllegalStateException();
        }
        this.n.f(this.f4188l);
        this.f4188l--;
        this.f4187k--;
        this.f4189m = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f4189m) {
            return this.n.g(this.f4188l, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
