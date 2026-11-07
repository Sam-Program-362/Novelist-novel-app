package M0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: M0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0051g extends N0.a {
    public static final Parcelable.Creator<C0051g> CREATOR = new F0.l(19);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f949k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f950l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f951m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f952o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f953p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f954q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f955r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f956s;

    public C0051g(int i3, int i4, int i5, long j3, long j4, String str, String str2, int i6, int i7) {
        this.f949k = i3;
        this.f950l = i4;
        this.f951m = i5;
        this.n = j3;
        this.f952o = j4;
        this.f953p = str;
        this.f954q = str2;
        this.f955r = i6;
        this.f956s = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.P(parcel, 1, 4);
        parcel.writeInt(this.f949k);
        H2.h.P(parcel, 2, 4);
        parcel.writeInt(this.f950l);
        H2.h.P(parcel, 3, 4);
        parcel.writeInt(this.f951m);
        H2.h.P(parcel, 4, 8);
        parcel.writeLong(this.n);
        H2.h.P(parcel, 5, 8);
        parcel.writeLong(this.f952o);
        H2.h.K(parcel, 6, this.f953p);
        H2.h.K(parcel, 7, this.f954q);
        H2.h.P(parcel, 8, 4);
        parcel.writeInt(this.f955r);
        H2.h.P(parcel, 9, 4);
        parcel.writeInt(this.f956s);
        H2.h.R(parcel, iQ);
    }
}
