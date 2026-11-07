package b1;

import java.util.Arrays;

/* renamed from: b1.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191P extends AbstractC0196V {

    /* renamed from: k, reason: collision with root package name */
    public final long f2597k;

    public C0191P(long j3) {
        this.f2597k = j3;
    }

    @Override // b1.AbstractC0196V
    public final int a() {
        return AbstractC0196V.d(this.f2597k >= 0 ? (byte) 0 : (byte) 32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC0196V abstractC0196V = (AbstractC0196V) obj;
        if (a() != abstractC0196V.a()) {
            return a() - abstractC0196V.a();
        }
        long abs = Math.abs(this.f2597k);
        long abs2 = Math.abs(((C0191P) abstractC0196V).f2597k);
        if (abs < abs2) {
            return -1;
        }
        return abs > abs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0191P.class == obj.getClass() && this.f2597k == ((C0191P) obj).f2597k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(this.f2597k)});
    }

    public final String toString() {
        return Long.toString(this.f2597k);
    }
}
