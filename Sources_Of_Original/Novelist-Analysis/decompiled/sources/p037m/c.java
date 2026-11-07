package p037m;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Map.Entry {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f4087k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f4088l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f4089m;
    public c n;

    public c(Object obj, Object obj2) {
        this.f4087k = obj;
        this.f4088l = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f4087k.equals(cVar.f4087k) && this.f4088l.equals(cVar.f4088l);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4087k;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4088l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f4087k.hashCode() ^ this.f4088l.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f4087k + "=" + this.f4088l;
    }
}
