package h1;

import H.i;
import android.net.Uri;

/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: c, reason: collision with root package name */
    public final String f2898c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2899d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2900e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2901f;

    /* renamed from: g, reason: collision with root package name */
    public final Uri f2902g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2903h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, android.net.Uri r8, java.lang.String r9) {
        /*
            r2 = this;
            java.lang.String r0 = "id"
            a2.h.e(r3, r0)
            java.lang.String r0 = "idToken"
            a2.h.e(r4, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID"
            r0.putString(r1, r3)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN"
            r0.putString(r1, r4)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME"
            r0.putString(r1, r5)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME"
            r0.putString(r1, r6)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME"
            r0.putString(r1, r7)
            java.lang.String r1 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER"
            r0.putString(r1, r9)
            java.lang.String r9 = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI"
            r0.putParcelable(r9, r8)
            java.lang.String r9 = "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL"
            r2.<init>(r9, r0)
            r2.f2898c = r4
            r2.f2899d = r5
            r2.f2900e = r6
            r2.f2901f = r7
            r2.f2902g = r8
            int r3 = r3.length()
            if (r3 <= 0) goto Lbf
            int r3 = r4.length()
            if (r3 <= 0) goto Lb7
            java.lang.String r3 = "."
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.util.List r3 = h2.AbstractC0273d.f0(r4, r3)
            int r4 = r3.size()
            r5 = 3
            if (r4 != r5) goto Laf
            r4 = 1
            java.lang.Object r3 = r3.get(r4)     // Catch: org.json.JSONException -> La8
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> La8
            r4 = 8
            byte[] r3 = android.util.Base64.decode(r3, r4)     // Catch: org.json.JSONException -> La8
            a2.h.b(r3)     // Catch: org.json.JSONException -> La8
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: org.json.JSONException -> La8
            java.lang.String r5 = "UTF_8"
            a2.h.d(r4, r5)     // Catch: org.json.JSONException -> La8
            java.lang.String r5 = new java.lang.String     // Catch: org.json.JSONException -> La8
            r5.<init>(r3, r4)     // Catch: org.json.JSONException -> La8
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> La8
            r3.<init>(r5)     // Catch: org.json.JSONException -> La8
            java.lang.String r4 = "email"
            java.lang.String r4 = r3.optString(r4)     // Catch: org.json.JSONException -> La8
            int r5 = r4.length()     // Catch: org.json.JSONException -> La8
            r6 = 0
            if (r5 != 0) goto L8d
            r4 = r6
        L8d:
            java.lang.String r5 = "sub"
            java.lang.String r3 = r3.optString(r5)     // Catch: org.json.JSONException -> La8
            int r5 = r3.length()     // Catch: org.json.JSONException -> La8
            if (r5 != 0) goto L9a
            goto L9b
        L9a:
            r6 = r3
        L9b:
            if (r6 == 0) goto La0
            r2.f2903h = r4
            return
        La0:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: org.json.JSONException -> La8
            java.lang.String r4 = "ID token missing required field: sub"
            r3.<init>(r4)     // Catch: org.json.JSONException -> La8
            throw r3     // Catch: org.json.JSONException -> La8
        La8:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r3)
            throw r4
        Laf:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Invalid token format"
            r3.<init>(r4)
            throw r3
        Lb7:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "idToken should not be empty"
            r3.<init>(r4)
            throw r3
        Lbf:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "id should not be empty"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.c.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.net.Uri, java.lang.String):void");
    }
}
