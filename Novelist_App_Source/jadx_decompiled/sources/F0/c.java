package F0;

import M0.r;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends N0.a {
    public static final Parcelable.Creator<c> CREATOR = new l(7);

    /* renamed from: k, reason: collision with root package name */
    public final boolean f304k;

    /* renamed from: l, reason: collision with root package name */
    public final String f305l;

    /* renamed from: m, reason: collision with root package name */
    public final String f306m;
    public final boolean n;

    /* renamed from: o, reason: collision with root package name */
    public final String f307o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f308p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f309q;

    /* renamed from: r, reason: collision with root package name */
    public final List f310r;

    /* renamed from: s, reason: collision with root package name */
    public final String f311s;

    public c(boolean z3, String str, String str2, boolean z4, String str3, ArrayList arrayList, boolean z5, ArrayList arrayList2, String str4) {
        boolean z6 = true;
        if (z4 && z5) {
            z6 = false;
        }
        r.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z6);
        this.f304k = z3;
        if (z3) {
            r.g(str, "serverClientId must be provided if Google ID tokens are requested");
        }
        this.f305l = str;
        this.f306m = str2;
        this.n = z4;
        ArrayList arrayList3 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList3 = new ArrayList(arrayList);
            Collections.sort(arrayList3);
        }
        this.f308p = arrayList3;
        this.f307o = str3;
        this.f309q = z5;
        this.f310r = arrayList2;
        this.f311s = str4;
    }

    public static b b() {
        b bVar = new b();
        bVar.f300a = false;
        bVar.f302c = null;
        bVar.f303d = null;
        bVar.f301b = true;
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f304k == cVar.f304k && r.i(this.f305l, cVar.f305l) && r.i(this.f306m, cVar.f306m) && this.n == cVar.n && r.i(this.f307o, cVar.f307o) && r.i(this.f308p, cVar.f308p) && this.f309q == cVar.f309q && r.i(this.f310r, cVar.f310r) && r.i(this.f311s, cVar.f311s);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f304k), this.f305l, this.f306m, Boolean.valueOf(this.n), this.f307o, this.f308p, Boolean.valueOf(this.f309q), this.f310r, this.f311s});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = H2.h.Q(parcel, 20293);
        H2.h.P(parcel, 1, 4);
        parcel.writeInt(this.f304k ? 1 : 0);
        H2.h.K(parcel, 2, this.f305l);
        H2.h.K(parcel, 3, this.f306m);
        H2.h.P(parcel, 4, 4);
        parcel.writeInt(this.n ? 1 : 0);
        H2.h.K(parcel, 5, this.f307o);
        H2.h.L(parcel, 6, this.f308p);
        H2.h.P(parcel, 7, 4);
        parcel.writeInt(this.f309q ? 1 : 0);
        H2.h.N(parcel, 8, this.f310r);
        H2.h.K(parcel, 9, this.f311s);
        H2.h.R(parcel, Q2);
    }
}
