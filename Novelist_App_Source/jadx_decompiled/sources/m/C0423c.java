package m;

import java.util.Map;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423c implements Map.Entry {

    /* renamed from: k, reason: collision with root package name */
    public final Object f4087k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f4088l;

    /* renamed from: m, reason: collision with root package name */
    public C0423c f4089m;
    public C0423c n;

    public C0423c(Object obj, Object obj2) {
        this.f4087k = obj;
        this.f4088l = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0423c)) {
            return false;
        }
        C0423c c0423c = (C0423c) obj;
        return this.f4087k.equals(c0423c.f4087k) && this.f4088l.equals(c0423c.f4088l);
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
