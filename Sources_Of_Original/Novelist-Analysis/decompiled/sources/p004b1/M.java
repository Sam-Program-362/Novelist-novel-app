package p004b1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class M extends V {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f2595k;

    public M(boolean z3) {
        this.f2595k = z3;
    }

    @Override // p004b1.V
    public final int a() {
        return V.d((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        V v3 = (V) obj;
        int iA = v3.a();
        int iD = V.d((byte) -32);
        if (iD != iA) {
            return iD - v3.a();
        }
        return (true != this.f2595k ? 20 : 21) - (true != ((M) v3).f2595k ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && M.class == obj.getClass() && this.f2595k == ((M) obj).f2595k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(V.d((byte) -32)), Boolean.valueOf(this.f2595k)});
    }

    public final String toString() {
        return Boolean.toString(this.f2595k);
    }
}
