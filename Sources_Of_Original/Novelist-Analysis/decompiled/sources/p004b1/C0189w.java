package p004b1;

import java.io.Serializable;

/* JADX INFO: renamed from: b1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0189w extends AbstractC0185s implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractC0185s f2649k;

    public C0189w(AbstractC0185s abstractC0185s) {
        this.f2649k = abstractC0185s;
    }

    @Override // p004b1.AbstractC0185s
    public final AbstractC0185s a() {
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
        if (obj instanceof C0189w) {
            return this.f2649k.equals(((C0189w) obj).f2649k);
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
