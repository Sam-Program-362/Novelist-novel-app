package com.google.android.gms.auth.api.signin;

import G0.d;
import H2.h;
import M0.r;
import N0.a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new d(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f2680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f2681m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f2682o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Uri f2683p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f2684q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f2685r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f2686s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f2687t;
    public final String u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f2688v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final HashSet f2689w = new HashSet();

    public GoogleSignInAccount(int i3, String str, String str2, String str3, String str4, Uri uri, String str5, long j3, String str6, ArrayList arrayList, String str7, String str8) {
        this.f2679k = i3;
        this.f2680l = str;
        this.f2681m = str2;
        this.n = str3;
        this.f2682o = str4;
        this.f2683p = uri;
        this.f2684q = str5;
        this.f2685r = j3;
        this.f2686s = str6;
        this.f2687t = arrayList;
        this.u = str7;
        this.f2688v = str8;
    }

    public static GoogleSignInAccount b(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j3 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            hashSet.add(new Scope(jSONArray.getString(i3), 1));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        r.d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j3, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f2684q = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f2686s.equals(this.f2686s)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f2687t);
        hashSet.addAll(googleSignInAccount.f2689w);
        HashSet hashSet2 = new HashSet(this.f2687t);
        hashSet2.addAll(this.f2689w);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.f2686s.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f2687t);
        hashSet.addAll(this.f2689w);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = h.Q(parcel, 20293);
        h.P(parcel, 1, 4);
        parcel.writeInt(this.f2679k);
        h.K(parcel, 2, this.f2680l);
        h.K(parcel, 3, this.f2681m);
        h.K(parcel, 4, this.n);
        h.K(parcel, 5, this.f2682o);
        h.J(parcel, 6, this.f2683p, i3);
        h.K(parcel, 7, this.f2684q);
        h.P(parcel, 8, 8);
        parcel.writeLong(this.f2685r);
        h.K(parcel, 9, this.f2686s);
        h.N(parcel, 10, this.f2687t);
        h.K(parcel, 11, this.u);
        h.K(parcel, 12, this.f2688v);
        h.R(parcel, iQ);
    }
}
