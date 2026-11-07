package F0;

import M0.r;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e extends N0.a {
    public static final Parcelable.Creator<e> CREATOR = new l(9);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f314k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f316m;

    public e(boolean z3, byte[] bArr, String str) {
        if (z3) {
            r.f(bArr);
            r.f(str);
        }
        this.f314k = z3;
        this.f315l = bArr;
        this.f316m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f314k == eVar.f314k && Arrays.equals(this.f315l, eVar.f315l) && Objects.equals(this.f316m, eVar.f316m);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f315l) + (Objects.hash(Boolean.valueOf(this.f314k), this.f316m) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.P(parcel, 1, 4);
        parcel.writeInt(this.f314k ? 1 : 0);
        H2.h.H(parcel, 2, this.f315l);
        H2.h.K(parcel, 3, this.f316m);
        H2.h.R(parcel, iQ);
    }
}
