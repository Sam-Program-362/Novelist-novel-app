package p004b1;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: b1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0171d extends AbstractC0185s implements Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Comparator f2615k;

    public C0171d(Comparator comparator) {
        comparator.getClass();
        this.f2615k = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f2615k.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0171d) {
            return this.f2615k.equals(((C0171d) obj).f2615k);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2615k.hashCode();
    }

    public final String toString() {
        return this.f2615k.toString();
    }
}
