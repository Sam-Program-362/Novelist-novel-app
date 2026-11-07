package com.google.android.gms.identitycredentials;

import N0.a;
import V0.l;
import a2.h;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetCredentialRequest extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GetCredentialRequest> CREATOR = new l(17);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f2760k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Bundle f2761l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f2762m;
    public final ResultReceiver n;

    public GetCredentialRequest(ArrayList arrayList, Bundle bundle, String str, ResultReceiver resultReceiver) {
        h.e(arrayList, "credentialOptions");
        h.e(bundle, "data");
        h.e(resultReceiver, "resultReceiver");
        this.f2760k = arrayList;
        this.f2761l = bundle;
        this.f2762m = str;
        this.n = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        h.e(parcel, "dest");
        int iQ = H2.h.Q(parcel, 20293);
        H2.h.N(parcel, 1, this.f2760k);
        H2.h.G(parcel, 2, this.f2761l);
        H2.h.K(parcel, 3, this.f2762m);
        H2.h.J(parcel, 4, this.n, i3);
        H2.h.R(parcel, iQ);
    }
}
