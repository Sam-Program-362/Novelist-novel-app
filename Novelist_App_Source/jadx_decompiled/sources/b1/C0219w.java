package b1;

import java.io.Serializable;

/* renamed from: b1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219w extends AbstractC0215s implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0215s f2649k;

    public C0219w(AbstractC0215s abstractC0215s) {
        this.f2649k = abstractC0215s;
    }

    @Override // b1.AbstractC0215s
    public final AbstractC0215s a() {
        return this.f2649k;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f2649k.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0219w) {
            return this.f2649k.equals(((C0219w) obj).f2649k);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f2649k.hashCode();
    }

    public final String toString() {
        return this.f2649k.toString().concat(".reverse()");
    }
}
