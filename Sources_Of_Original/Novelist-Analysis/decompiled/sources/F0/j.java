package F0;

import M0.r;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j extends N0.a {
    public static final Parcelable.Creator<j> CREATOR = new l(12);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f333l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f334m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Uri f335o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f336p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f337q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final V0.i f339s;

    public j(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, V0.i iVar) {
        r.f(str);
        this.f332k = str;
        this.f333l = str2;
        this.f334m = str3;
        this.n = str4;
        this.f335o = uri;
        this.f336p = str5;
        this.f337q = str6;
        this.f338r = str7;
        this.f339s = iVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return r.i(this.f332k, jVar.f332k) && r.i(this.f333l, jVar.f333l) && r.i(this.f334m, jVar.f334m) && r.i(this.n, jVar.n) && r.i(this.f335o, jVar.f335o) && r.i(this.f336p, jVar.f336p) && r.i(this.f337q, jVar.f337q) && r.i(this.f338r, jVar.f338r) && r.i(this.f339s, jVar.f339s);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f332k, this.f333l, this.f334m, this.n, this.f335o, this.f336p, this.f337q, this.f338r, this.f339s});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.K(parcel, 1, this.f332k);
        H2.h.K(parcel, 2, this.f333l);
        H2.h.K(parcel, 3, this.f334m);
        H2.h.K(parcel, 4, this.n);
        H2.h.J(parcel, 5, this.f335o, i3);
        H2.h.K(parcel, 6, this.f336p);
        H2.h.K(parcel, 7, this.f337q);
        H2.h.K(parcel, 8, this.f338r);
        H2.h.J(parcel, 9, this.f339s, i3);
        H2.h.R(parcel, iQ);
    }
}
