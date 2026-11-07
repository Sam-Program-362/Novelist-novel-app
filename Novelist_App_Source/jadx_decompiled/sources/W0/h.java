package W0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import h2.AbstractC0273d;

/* loaded from: classes.dex */
public final class h extends N0.a {
    public static final Parcelable.Creator<h> CREATOR = new V0.l(14);

    /* renamed from: k, reason: collision with root package name */
    public final String f1541k;

    /* renamed from: l, reason: collision with root package name */
    public final Bundle f1542l;

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f1543m;
    public final String n;

    /* renamed from: o, reason: collision with root package name */
    public final String f1544o;

    /* renamed from: p, reason: collision with root package name */
    public final String f1545p;

    public h(String str, Bundle bundle, Bundle bundle2, String str2, String str3, String str4) {
        a2.h.e(str, "type");
        a2.h.e(bundle, "credentialRetrievalData");
        a2.h.e(bundle2, "candidateQueryData");
        a2.h.e(str2, "requestMatcher");
        a2.h.e(str3, "requestType");
        a2.h.e(str4, "protocolType");
        this.f1541k = str;
        this.f1542l = bundle;
        this.f1543m = bundle2;
        this.n = str2;
        this.f1544o = str3;
        this.f1545p = str4;
        boolean z3 = (AbstractC0273d.d0(str3) || AbstractC0273d.d0(str4)) ? false : true;
        boolean z4 = !AbstractC0273d.d0(str) && str3.length() == 0 && str4.length() == 0;
        if (z3 || z4) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + String.valueOf(str).length() + 31 + String.valueOf(str3).length() + 19 + 69);
        sb.append("Either type: ");
        sb.append(str);
        sb.append(", or requestType: ");
        sb.append(str3);
        sb.append(" and protocolType: ");
        sb.append(str4);
        sb.append(" must be specified, but at least one contains an invalid blank value.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        a2.h.e(parcel, "dest");
        int Q2 = H2.h.Q(parcel, 20293);
        H2.h.K(parcel, 1, this.f1541k);
        H2.h.G(parcel, 2, this.f1542l);
        H2.h.G(parcel, 3, this.f1543m);
        H2.h.K(parcel, 4, this.n);
        H2.h.K(parcel, 5, this.f1544o);
        H2.h.K(parcel, 6, this.f1545p);
        H2.h.R(parcel, Q2);
    }
}
