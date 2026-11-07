package b1;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: b1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0200d extends AbstractC0215s implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Comparator f2615k;

    public C0200d(Comparator comparator) {
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
        if (obj instanceof C0200d) {
            return this.f2615k.equals(((C0200d) obj).f2615k);
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
