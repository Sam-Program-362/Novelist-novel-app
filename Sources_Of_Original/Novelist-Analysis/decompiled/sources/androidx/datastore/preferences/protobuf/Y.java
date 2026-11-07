package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Comparable f2020k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f2021l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ X f2022m;

    public Y(X x, Comparable comparable, Object obj) {
        this.f2022m = x;
        this.f2020k = comparable;
        this.f2021l = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2020k.compareTo(((Y) obj).f2020k);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f2020k;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f2021l;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2020k;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2021l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f2020k;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f2021l;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f2022m.b();
        Object obj2 = this.f2021l;
        this.f2021l = obj;
        return obj2;
    }

    public final String toString() {
        return this.f2020k + "=" + this.f2021l;
    }
}
