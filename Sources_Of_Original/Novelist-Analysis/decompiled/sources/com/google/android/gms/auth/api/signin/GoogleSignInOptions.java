package com.google.android.gms.auth.api.signin;

import G0.c;
import G0.d;
import H2.h;
import K0.b;
import N0.a;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInOptions extends a implements b, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Scope f2690v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Scope f2691w;
    public static final Scope x;
    public static final c y;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f2693l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Account f2694m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f2695o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f2696p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f2697q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f2698r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f2699s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f2700t;

    static {
        Scope scope = new Scope("profile", 1);
        new Scope("email", 1);
        Scope scope2 = new Scope("openid", 1);
        f2690v = scope2;
        Scope scope3 = new Scope("https://www.googleapis.com/auth/games_lite", 1);
        f2691w = scope3;
        x = new Scope("https://www.googleapis.com/auth/games", 1);
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(x)) {
            Scope scope4 = f2691w;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        u = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(x)) {
            Scope scope5 = f2691w;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new d(1);
        y = new c(1);
    }

    public GoogleSignInOptions(int i3, ArrayList arrayList, Account account, boolean z3, boolean z4, boolean z5, String str, String str2, HashMap map, String str3) {
        this.f2692k = i3;
        this.f2693l = arrayList;
        this.f2694m = account;
        this.n = z3;
        this.f2695o = z4;
        this.f2696p = z5;
        this.f2697q = str;
        this.f2698r = str2;
        this.f2699s = new ArrayList(map.values());
        this.f2700t = str3;
    }

    public static GoogleSignInOptions b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            hashSet.add(new Scope(jSONArray.getString(i3), 1));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap c(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                H0.a aVar = (H0.a) obj;
                map.put(Integer.valueOf(aVar.f418l), aVar);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        String str = this.f2697q;
        ArrayList arrayList = this.f2693l;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList2 = googleSignInOptions.f2693l;
            String str2 = googleSignInOptions.f2697q;
            Account account = googleSignInOptions.f2694m;
            if (this.f2699s.isEmpty() && googleSignInOptions.f2699s.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
                Account account2 = this.f2694m;
                if (account2 == null) {
                    if (account != null) {
                        return false;
                    }
                } else if (!account2.equals(account)) {
                    return false;
                }
                if (TextUtils.isEmpty(str)) {
                    if (!TextUtils.isEmpty(str2)) {
                        return false;
                    }
                } else if (!str.equals(str2)) {
                    return false;
                }
                return this.f2696p == googleSignInOptions.f2696p && this.n == googleSignInOptions.n && this.f2695o == googleSignInOptions.f2695o && TextUtils.equals(this.f2700t, googleSignInOptions.f2700t);
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f2693l;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((Scope) arrayList2.get(i3)).f2720l);
        }
        Collections.sort(arrayList);
        int iHashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.f2694m;
        int iHashCode2 = (iHashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.f2697q;
        int iHashCode3 = (((((((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.f2696p ? 1 : 0)) * 31) + (this.n ? 1 : 0)) * 31) + (this.f2695o ? 1 : 0)) * 31;
        String str2 = this.f2700t;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iQ = h.Q(parcel, 20293);
        h.P(parcel, 1, 4);
        parcel.writeInt(this.f2692k);
        h.N(parcel, 2, new ArrayList(this.f2693l));
        h.J(parcel, 3, this.f2694m, i3);
        h.P(parcel, 4, 4);
        parcel.writeInt(this.n ? 1 : 0);
        h.P(parcel, 5, 4);
        parcel.writeInt(this.f2695o ? 1 : 0);
        h.P(parcel, 6, 4);
        parcel.writeInt(this.f2696p ? 1 : 0);
        h.K(parcel, 7, this.f2697q);
        h.K(parcel, 8, this.f2698r);
        h.N(parcel, 9, this.f2699s);
        h.K(parcel, 10, this.f2700t);
        h.R(parcel, iQ);
    }
}
