package p023h1;

import H.i;
import a2.h;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p024h2.d;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f2902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2903h;

    public c(String str, String str2, String str3, String str4, String str5, Uri uri, String str6) {
        h.e(str, "id");
        h.e(str2, "idToken");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle);
        this.f2898c = str2;
        this.f2899d = str3;
        this.f2900e = str4;
        this.f2901f = str5;
        this.f2902g = uri;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("idToken should not be empty");
        }
        List listF0 = d.f0(str2, new String[]{"."});
        if (listF0.size() != 3) {
            throw new IllegalArgumentException("Invalid token format");
        }
        try {
            byte[] bArrDecode = Base64.decode((String) listF0.get(1), 8);
            h.b(bArrDecode);
            Charset charset = StandardCharsets.UTF_8;
            h.d(charset, "UTF_8");
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, charset));
            String strOptString = jSONObject.optString("email");
            strOptString = strOptString.length() == 0 ? null : strOptString;
            String strOptString2 = jSONObject.optString("sub");
            if ((strOptString2.length() != 0 ? strOptString2 : null) == null) {
                throw new IllegalArgumentException("ID token missing required field: sub");
            }
            this.f2903h = strOptString;
        } catch (JSONException e3) {
            throw new IllegalArgumentException(e3);
        }
    }
}
