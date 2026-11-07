package p042o;

import a2.h;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4188l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4189m;
    public final /* synthetic */ e n;

    public c(e eVar) {
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
        return h.a(key, eVar.e(i3)) && h.a(entry.getValue(), eVar.h(this.f4188l));
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
        Object objE = eVar.e(i3);
        Object objH = eVar.h(this.f4188l);
        return (objE == null ? 0 : objE.hashCode()) ^ (objH != null ? objH.hashCode() : 0);
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
