package F0;

import M0.r;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends N0.a {
    public static final Parcelable.Creator<i> CREATOR = new l(6);

    /* renamed from: k, reason: collision with root package name */
    public final String f326k;

    /* renamed from: l, reason: collision with root package name */
    public final String f327l;

    /* renamed from: m, reason: collision with root package name */
    public final String f328m;
    public final String n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f329o;

    /* renamed from: p, reason: collision with root package name */
    public final int f330p;

    /* renamed from: q, reason: collision with root package name */
    public final List f331q;

    public i(String str, String str2, String str3, String str4, boolean z3, int i3, List list) {
        r.f(str);
        this.f326k = str;
        this.f327l = str2;
        this.f328m = str3;
        this.n = str4;
        this.f329o = z3;
        this.f330p = i3;
        this.f331q = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return r.i(this.f326k, iVar.f326k) && r.i(this.n, iVar.n) && r.i(this.f327l, iVar.f327l) && r.i(Boolean.valueOf(this.f329o), Boolean.valueOf(iVar.f329o)) && this.f330p == iVar.f330p && r.i(this.f331q, iVar.f331q);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f326k, this.f327l, this.n, Boolean.valueOf(this.f329o), Integer.valueOf(this.f330p), this.f331q});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = H2.h.Q(parcel, 20293);
        H2.h.K(parcel, 1, this.f326k);
        H2.h.K(parcel, 2, this.f327l);
        H2.h.K(parcel, 3, this.f328m);
        H2.h.K(parcel, 4, this.n);
        H2.h.P(parcel, 5, 4);
        parcel.writeInt(this.f329o ? 1 : 0);
        H2.h.P(parcel, 6, 4);
        parcel.writeInt(this.f330p);
        H2.h.N(parcel, 7, this.f331q);
        H2.h.R(parcel, Q2);
    }
}
