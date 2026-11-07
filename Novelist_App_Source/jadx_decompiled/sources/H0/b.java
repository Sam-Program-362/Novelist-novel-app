package H0;

import M0.r;
import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f420c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static b f421d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f422a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f423b;

    public b(Context context) {
        this.f423b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static b a(Context context) {
        r.f(context);
        ReentrantLock reentrantLock = f420c;
        reentrantLock.lock();
        try {
            if (f421d == null) {
                f421d = new b(context.getApplicationContext());
            }
            b bVar = f421d;
            reentrantLock.unlock();
            return bVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String f(String str, String str2) {
        return str + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + str2;
    }

    public final GoogleSignInAccount b() {
        String d3;
        String d4 = d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(d4) && (d3 = d(f("googleSignInAccount", d4))) != null) {
            try {
                return GoogleSignInAccount.b(d3);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        r.f(googleSignInAccount);
        r.f(googleSignInOptions);
        String str = googleSignInAccount.f2686s;
        e("defaultGoogleSignInAccount", str);
        String f3 = f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f2680l;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f2681m;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.n;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f2682o;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.u;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f2688v;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f2683p;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f2684q;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f2685r);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.f2687t;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, G0.c.f394l);
            int i3 = 0;
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f2720l);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            e(f3, jSONObject.toString());
            String f4 = f("googleSignInOptions", str);
            String str9 = googleSignInOptions.f2698r;
            String str10 = googleSignInOptions.f2697q;
            ArrayList arrayList = googleSignInOptions.f2693l;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList, GoogleSignInOptions.y);
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    jSONArray2.put(((Scope) obj).f2720l);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f2694m;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.n);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f2696p);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f2695o);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                e(f4, jSONObject2.toString());
            } catch (JSONException e3) {
                throw new RuntimeException(e3);
            }
        } catch (JSONException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final String d(String str) {
        ReentrantLock reentrantLock = this.f422a;
        reentrantLock.lock();
        try {
            return this.f423b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(String str, String str2) {
        ReentrantLock reentrantLock = this.f422a;
        reentrantLock.lock();
        try {
            this.f423b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
