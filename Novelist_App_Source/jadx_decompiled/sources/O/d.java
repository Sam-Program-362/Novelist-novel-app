package O;

import F0.f;
import F0.g;
import F0.j;
import H.k;
import H.l;
import H.m;
import M0.r;
import M1.K;
import M1.X;
import V0.e;
import V0.i;
import a2.h;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import b1.C0185J;
import h1.C0269a;
import h2.AbstractC0273d;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import t.AbstractC0468a;

/* loaded from: classes.dex */
public final class d extends N.c {

    /* renamed from: d, reason: collision with root package name */
    public final Context f1197d;

    /* renamed from: e, reason: collision with root package name */
    public H.d f1198e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f1199f;

    /* renamed from: g, reason: collision with root package name */
    public CancellationSignal f1200g;

    /* renamed from: h, reason: collision with root package name */
    public final c f1201h;

    public d(Context context) {
        h.e(context, "context");
        this.f1197d = context;
        this.f1201h = new c(this, new Handler(Looper.getMainLooper()), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l b(j jVar) {
        e eVar;
        String jSONObject;
        H.c jVar2;
        i iVar = jVar.f339s;
        String str = jVar.f337q;
        String str2 = jVar.f332k;
        String str3 = jVar.f336p;
        boolean z3 = true;
        if (str3 != null) {
            h.d(str2, "getId(...)");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str2);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str3);
            jVar2 = new H.j(str3, bundle, 1);
        } else {
            h1.c cVar = null;
            JSONObject jSONObject2 = null;
            if (str != null) {
                h.d(str2, "getId(...)");
                String str4 = jVar.f333l;
                String str5 = str4 != null ? str4 : null;
                String str6 = jVar.f334m;
                String str7 = str6 != null ? str6 : null;
                String str8 = jVar.n;
                String str9 = str8 != null ? str8 : null;
                String str10 = jVar.f338r;
                String str11 = str10 != null ? str10 : null;
                Uri uri = jVar.f335o;
                cVar = new h1.c(str2, str, str5, str9, str7, uri != null ? uri : null, str11);
            } else if (iVar != null) {
                e eVar2 = iVar.f1521p;
                V0.c cVar2 = iVar.f1520o;
                V0.d dVar = iVar.n;
                LinkedHashMap linkedHashMap = P.a.f1212a;
                JSONObject jSONObject3 = new JSONObject();
                if (dVar != 0) {
                    eVar = dVar;
                } else if (cVar2 != 0) {
                    eVar = cVar2;
                } else {
                    if (eVar2 == null) {
                        throw new IllegalStateException("No response set.");
                    }
                    eVar = eVar2;
                }
                if (eVar instanceof e) {
                    e eVar3 = eVar;
                    V0.h hVar = eVar3.f1503k;
                    h.d(hVar, "getErrorCode(...)");
                    String str12 = eVar3.f1504l;
                    J.a aVar = (J.a) P.a.f1212a.get(hVar);
                    if (aVar == null) {
                        throw new K.b(new J.a(26), AbstractC0468a.a("unknown fido gms exception - ", str12));
                    }
                    if (hVar == V0.h.f1514v && str12 != null && AbstractC0273d.Y(str12, "Unable to get sync account")) {
                        throw new I.d("Passkey retrieval was cancelled by the user.");
                    }
                    throw new K.b(aVar, str12);
                }
                if (eVar instanceof V0.c) {
                    try {
                        C0185J c0185j = iVar.f1519m;
                        try {
                            JSONObject jSONObject4 = new JSONObject();
                            if (c0185j != null && c0185j.j().length > 0) {
                                jSONObject4.put("rawId", E2.a.p(c0185j.j()));
                            }
                            Object obj = iVar.f1523r;
                            if (obj != null) {
                                jSONObject4.put("authenticatorAttachment", obj);
                            }
                            Object obj2 = iVar.f1518l;
                            if (obj2 != null && eVar2 == null) {
                                jSONObject4.put("type", obj2);
                            }
                            Object obj3 = iVar.f1517k;
                            if (obj3 != null) {
                                jSONObject4.put("id", obj3);
                            }
                            String str13 = "response";
                            if (cVar2 != 0) {
                                jSONObject2 = cVar2.b();
                            } else if (dVar != 0) {
                                jSONObject2 = dVar.b();
                            } else {
                                z3 = false;
                                if (eVar2 != null) {
                                    try {
                                        jSONObject2 = new JSONObject();
                                        jSONObject2.put("code", eVar2.f1503k.f1516k);
                                        String str14 = eVar2.f1504l;
                                        if (str14 != null) {
                                            jSONObject2.put("message", str14);
                                        }
                                        str13 = "error";
                                    } catch (JSONException e3) {
                                        throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e3);
                                    }
                                }
                            }
                            if (jSONObject2 != null) {
                                jSONObject4.put(str13, jSONObject2);
                            }
                            V0.a aVar2 = iVar.f1522q;
                            if (aVar2 != null) {
                                jSONObject4.put("clientExtensionResults", aVar2.b());
                            } else if (z3) {
                                jSONObject4.put("clientExtensionResults", new JSONObject());
                            }
                            jSONObject = jSONObject4.toString();
                            h.d(jSONObject, "toJson(...)");
                        } catch (JSONException e4) {
                            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e4);
                        }
                    } catch (Throwable th) {
                        throw new I.e("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(eVar.getClass().getName()));
                    jSONObject = jSONObject3.toString();
                    h.d(jSONObject, "toString(...)");
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", jSONObject);
                jVar2 = new H.j(jSONObject, bundle2, 2);
            } else {
                Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
            }
            jVar2 = cVar;
        }
        if (jVar2 != null) {
            return new l(jVar2);
        }
        throw new I.e("When attempting to convert get response, null credential found");
    }

    public final H.d c() {
        H.d dVar = this.f1198e;
        if (dVar != null) {
            return dVar;
        }
        h.g("callback");
        throw null;
    }

    public final Executor d() {
        Executor executor = this.f1199f;
        if (executor != null) {
            return executor;
        }
        h.g("executor");
        throw null;
    }

    public final void e(k kVar, CancellationSignal cancellationSignal, Executor executor, H.d dVar) {
        h.e(kVar, "request");
        h.e(dVar, "callback");
        h.e(executor, "executor");
        this.f1200g = cancellationSignal;
        this.f1198e = dVar;
        this.f1199f = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (M.h.a(cancellationSignal)) {
            return;
        }
        Context context = this.f1197d;
        h.e(context, "context");
        f fVar = new f(false);
        F0.b b3 = F0.c.b();
        b3.f300a = false;
        F0.c a3 = b3.a();
        F0.e eVar = new F0.e(false, null, null);
        F0.d dVar2 = new F0.d(null, false);
        PackageManager packageManager = context.getPackageManager();
        h.d(packageManager, "getPackageManager(...)");
        int i3 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        boolean z3 = false;
        F0.c cVar = a3;
        for (m mVar : kVar.f412a) {
            if (mVar instanceof C0269a) {
                C0269a c0269a = (C0269a) mVar;
                F0.b b4 = F0.c.b();
                b4.f301b = c0269a.f2893f;
                b4.f303d = c0269a.f2892e;
                String str = c0269a.f2891d;
                r.d(str);
                b4.f302c = str;
                b4.f300a = true;
                cVar = b4.a();
                z3 = z3 || c0269a.f2894g;
            }
        }
        r.f(cVar);
        Y0.b v3 = S0.a.v(context);
        F0.b b5 = F0.c.b();
        b5.f300a = false;
        b5.a();
        g gVar = new g(fVar, cVar, v3.f1583k, z3, 0, eVar, dVar2, false);
        L0.k b6 = L0.k.b();
        b6.f813a = new J0.c[]{new J0.c("auth_api_credentials_begin_sign_in", 8L)};
        b6.f816d = new A.c(v3, gVar, 27);
        b6.f814b = false;
        b6.f815c = 1553;
        g1.i b7 = v3.b(0, b6.a());
        b7.b(new K(new X(cancellationSignal, this, 2), 9));
        b7.a(new b(this, cancellationSignal, 0));
    }
}
