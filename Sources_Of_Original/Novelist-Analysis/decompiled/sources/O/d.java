package O;

import F0.f;
import F0.g;
import F0.j;
import H.k;
import H.l;
import H.m;
import I.e;
import M0.r;
import M1.K;
import M1.X;
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
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import p004b1.J;

/* JADX INFO: loaded from: classes.dex */
public final class d extends N.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f1197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public H.d f1198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f1199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CancellationSignal f1200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f1201h;

    public d(Context context) {
        h.e(context, "context");
        this.f1197d = context;
        this.f1201h = new c(this, new Handler(Looper.getMainLooper()), 0);
    }

    public final l b(j jVar) throws e, I.d, K.b {
        Object obj;
        String string;
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
            p023h1.c cVar = null;
            JSONObject jSONObject = null;
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
                cVar = new p023h1.c(str2, str, str5, str9, str7, uri != null ? uri : null, str11);
            } else if (iVar != null) {
                V0.e eVar = iVar.f1521p;
                V0.c cVar2 = iVar.f1520o;
                V0.d dVar = iVar.n;
                LinkedHashMap linkedHashMap = P.a.f1212a;
                JSONObject jSONObject2 = new JSONObject();
                if (dVar != null) {
                    obj = dVar;
                } else if (cVar2 != null) {
                    obj = cVar2;
                } else {
                    if (eVar == null) {
                        throw new IllegalStateException("No response set.");
                    }
                    obj = eVar;
                }
                if (obj instanceof V0.e) {
                    V0.e eVar2 = (V0.e) obj;
                    V0.h hVar = eVar2.f1503k;
                    h.d(hVar, "getErrorCode(...)");
                    String str12 = eVar2.f1504l;
                    J.a aVar = (J.a) P.a.f1212a.get(hVar);
                    if (aVar == null) {
                        throw new K.b(new J.a(26), p055t.a.a("unknown fido gms exception - ", str12));
                    }
                    if (hVar == V0.h.f1514v && str12 != null && p024h2.d.Y(str12, "Unable to get sync account")) {
                        throw new I.d("Passkey retrieval was cancelled by the user.");
                    }
                    throw new K.b(aVar, str12);
                }
                if (obj instanceof V0.c) {
                    try {
                        J j3 = iVar.f1519m;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            if (j3 != null && j3.j().length > 0) {
                                jSONObject3.put("rawId", E2.a.p(j3.j()));
                            }
                            String str13 = iVar.f1523r;
                            if (str13 != null) {
                                jSONObject3.put("authenticatorAttachment", str13);
                            }
                            String str14 = iVar.f1518l;
                            if (str14 != null && eVar == null) {
                                jSONObject3.put("type", str14);
                            }
                            String str15 = iVar.f1517k;
                            if (str15 != null) {
                                jSONObject3.put("id", str15);
                            }
                            String str16 = "response";
                            if (cVar2 != null) {
                                jSONObject = cVar2.b();
                            } else if (dVar != null) {
                                jSONObject = dVar.b();
                            } else {
                                z3 = false;
                                if (eVar != null) {
                                    try {
                                        jSONObject = new JSONObject();
                                        jSONObject.put("code", eVar.f1503k.f1516k);
                                        String str17 = eVar.f1504l;
                                        if (str17 != null) {
                                            jSONObject.put("message", str17);
                                        }
                                        str16 = "error";
                                    } catch (JSONException e3) {
                                        throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e3);
                                    }
                                }
                            }
                            if (jSONObject != null) {
                                jSONObject3.put(str16, jSONObject);
                            }
                            V0.a aVar2 = iVar.f1522q;
                            if (aVar2 != null) {
                                jSONObject3.put("clientExtensionResults", aVar2.b());
                            } else if (z3) {
                                jSONObject3.put("clientExtensionResults", new JSONObject());
                            }
                            string = jSONObject3.toString();
                            h.d(string, "toJson(...)");
                        } catch (JSONException e4) {
                            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e4);
                        }
                    } catch (Throwable th) {
                        throw new e("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(obj.getClass().getName()));
                    string = jSONObject2.toString();
                    h.d(string, "toString(...)");
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", string);
                jVar2 = new H.j(string, bundle2, 2);
            } else {
                Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
            }
            jVar2 = cVar;
        }
        if (jVar2 != null) {
            return new l(jVar2);
        }
        throw new e("When attempting to convert get response, null credential found");
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
        F0.b bVarB = F0.c.b();
        bVarB.f300a = false;
        F0.c cVarA = bVarB.a();
        F0.e eVar = new F0.e(false, null, null);
        F0.d dVar2 = new F0.d(null, false);
        PackageManager packageManager = context.getPackageManager();
        h.d(packageManager, "getPackageManager(...)");
        int i3 = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        boolean z3 = false;
        F0.c cVarA2 = cVarA;
        for (m mVar : kVar.f412a) {
            if (mVar instanceof p023h1.a) {
                p023h1.a aVar = (p023h1.a) mVar;
                F0.b bVarB2 = F0.c.b();
                bVarB2.f301b = aVar.f2893f;
                bVarB2.f303d = aVar.f2892e;
                String str = aVar.f2891d;
                r.d(str);
                bVarB2.f302c = str;
                bVarB2.f300a = true;
                cVarA2 = bVarB2.a();
                z3 = z3 || aVar.f2894g;
            }
        }
        r.f(cVarA2);
        Y0.b bVarV = S0.a.v(context);
        F0.b bVarB3 = F0.c.b();
        bVarB3.f300a = false;
        bVarB3.a();
        g gVar = new g(fVar, cVarA2, bVarV.f1583k, z3, 0, eVar, dVar2, false);
        L0.k kVarB = L0.k.b();
        kVarB.f813a = new J0.c[]{new J0.c("auth_api_credentials_begin_sign_in", 8L)};
        kVarB.f816d = new A.c(bVarV, gVar, 27);
        kVarB.f814b = false;
        kVarB.f815c = 1553;
        p019g1.i iVarB = bVarV.b(0, kVarB.a());
        iVarB.b(new K(new X(cancellationSignal, this, 2), 9));
        iVarB.a(new b(this, cancellationSignal, 0));
    }
}
