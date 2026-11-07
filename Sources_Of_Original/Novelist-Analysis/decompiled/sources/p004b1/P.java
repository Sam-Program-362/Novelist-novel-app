package p004b1;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class P extends V {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f2597k;

    public P(long j3) {
        this.f2597k = j3;
    }

    @Override // p004b1.V
    public final int a() {
        return V.d(this.f2597k >= 0 ? (byte) 0 : (byte) 32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        V v3 = (V) obj;
        if (a() != v3.a()) {
            return a() - v3.a();
        }
        long jAbs = Math.abs(this.f2597k);
        long jAbs2 = Math.abs(((P) v3).f2597k);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && P.class == obj.getClass() && this.f2597k == ((P) obj).f2597k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(this.f2597k)});
    }

    public final String toString() {
        return Long.toString(this.f2597k);
    }
}
