package F0;

import M0.r;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends N0.a {
    public static final Parcelable.Creator<a> CREATOR = new l(1);

    /* renamed from: k, reason: collision with root package name */
    public final String f294k;

    /* renamed from: l, reason: collision with root package name */
    public final String f295l;

    /* renamed from: m, reason: collision with root package name */
    public final String f296m;
    public final List n;

    /* renamed from: o, reason: collision with root package name */
    public final GoogleSignInAccount f297o;

    /* renamed from: p, reason: collision with root package name */
    public final PendingIntent f298p;

    /* renamed from: q, reason: collision with root package name */
    public final Bundle f299q;

    public a(String str, String str2, String str3, ArrayList arrayList, GoogleSignInAccount googleSignInAccount, PendingIntent pendingIntent, Bundle bundle) {
        this.f294k = str;
        this.f295l = str2;
        this.f296m = str3;
        r.f(arrayList);
        this.n = arrayList;
        this.f297o = googleSignInAccount;
        this.f298p = pendingIntent;
        this.f299q = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return r.i(this.f294k, aVar.f294k) && r.i(this.f295l, aVar.f295l) && r.i(this.f296m, aVar.f296m) && r.i(this.n, aVar.n) && r.i(this.f298p, aVar.f298p) && r.i(this.f297o, aVar.f297o) && r.i(this.f299q, aVar.f299q);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f294k, this.f295l, this.f296m, this.n, this.f298p, this.f297o, this.f299q});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = H2.h.Q(parcel, 20293);
        H2.h.K(parcel, 1, this.f294k);
        H2.h.K(parcel, 2, this.f295l);
        H2.h.K(parcel, 3, this.f296m);
        H2.h.L(parcel, 4, this.n);
        H2.h.J(parcel, 5, this.f297o, i3);
        H2.h.J(parcel, 6, this.f298p, i3);
        H2.h.G(parcel, 7, this.f299q);
        H2.h.R(parcel, Q2);
    }
}
