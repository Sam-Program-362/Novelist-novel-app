package M0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: M0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0048d extends N0.a {
    public static final Parcelable.Creator<C0048d> CREATOR = new F0.l(24);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f934m;
    public final int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int[] f936p;

    public C0048d(i iVar, boolean z3, boolean z4, int[] iArr, int i3, int[] iArr2) {
        this.f932k = iVar;
        this.f933l = z3;
        this.f934m = z4;
        this.n = iArr;
        this.f935o = i3;
        this.f936p = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.J(parcel, 1, this.f932k, i3);
        H2.h.P(parcel, 2, 4);
        parcel.writeInt(this.f933l ? 1 : 0);
        H2.h.P(parcel, 3, 4);
        parcel.writeInt(this.f934m ? 1 : 0);
        int[] iArr = this.n;
        if (iArr != null) {
            int iQ2 = H2.h.Q(parcel, 4);
            parcel.writeIntArray(iArr);
            H2.h.R(parcel, iQ2);
        }
        H2.h.P(parcel, 5, 4);
        parcel.writeInt(this.f935o);
        int[] iArr2 = this.f936p;
        if (iArr2 != null) {
            int iQ3 = H2.h.Q(parcel, 6);
            parcel.writeIntArray(iArr2);
            H2.h.R(parcel, iQ3);
        }
        H2.h.R(parcel, iQ);
    }
}
