package J0;

import M0.r;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c extends N0.a {
    public static final Parcelable.Creator<c> CREATOR = new F0.l(17);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f546k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f547l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f548m;
    public final boolean n;

    public c(String str, int i3, long j3, boolean z3) {
        this.f546k = str;
        this.f547l = i3;
        this.f548m = j3;
        this.n = z3;
    }

    public final long b() {
        long j3 = this.f548m;
        return j3 == -1 ? this.f547l : j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (r.i(this.f546k, cVar.f546k) && b() == cVar.b() && this.n == cVar.n) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f546k, Long.valueOf(b()), Boolean.valueOf(this.n)});
    }

    public final String toString() {
        A.c cVar = new A.c(this);
        cVar.h(this.f546k, "name");
        cVar.h(Long.valueOf(b()), "version");
        cVar.h(Boolean.valueOf(this.n), "is_fully_rolled_out");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.K(parcel, 1, this.f546k);
        H2.h.P(parcel, 2, 4);
        parcel.writeInt(this.f547l);
        long jB = b();
        H2.h.P(parcel, 3, 8);
        parcel.writeLong(jB);
        H2.h.P(parcel, 4, 4);
        parcel.writeInt(this.n ? 1 : 0);
        H2.h.R(parcel, iQ);
    }

    public c(String str, long j3) {
        this(str, -1, j3, false);
    }
}
