package androidx.credentials.playservices;

import H.e;
import H.m;
import H.n;
import H0.i;
import I.a;
import J0.d;
import K0.l;
import L0.C0044d;
import L0.k;
import M.b;
import M.c;
import M.h;
import M1.K;
import O1.g;
import Y0.f;
import a2.o;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements e {
    public static final h Companion = new h();
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int MIN_GMS_APK_VERSION_SIGNAL_API = 254625000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private d googleApiAvailability;

    public CredentialProviderPlayServicesImpl(Context context) {
        a2.h.e(context, "context");
        this.context = context;
        this.googleApiAvailability = d.f550c;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context, int i3) {
        return this.googleApiAvailability.b(context, i3);
    }

    private static final g onClearCredential$lambda$0(Executor executor, H.d dVar) {
        executor.execute(new b(dVar, 0));
        return g.f1211a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$0$0(H.d dVar) {
        dVar.b(new a());
    }

    private static final g onClearCredential$lambda$1(CancellationSignal cancellationSignal, Executor executor, H.d dVar, Boolean bool) {
        Companion.getClass();
        if (!h.a(cancellationSignal)) {
            onClearCredential$lambda$1$0(executor, dVar);
        }
        return g.f1211a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g onClearCredential$lambda$1$0(Executor executor, H.d dVar) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new b(dVar, 3));
        return g.f1211a;
    }

    private static final void onClearCredential$lambda$3(CancellationSignal cancellationSignal, Executor executor, H.d dVar, Exception exc) {
        a2.h.e(exc, "e");
        Log.w(TAG, "Clearing restore credential failed", exc);
        o oVar = new o();
        oVar.f1713k = new a("Clear restore credential failed for unknown reason.");
        if ((exc instanceof K0.e) && ((K0.e) exc).f635k.f2726k == 40201) {
            oVar.f1713k = new a("The restore credential internal service had a failure.");
        }
        Companion.getClass();
        if (h.a(cancellationSignal)) {
            return;
        }
        onClearCredential$lambda$3$0(executor, dVar, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g onClearCredential$lambda$3$0(Executor executor, H.d dVar, o oVar) {
        executor.execute(new c(dVar, oVar, 1));
        return g.f1211a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$3$0$0(H.d dVar, o oVar) {
        dVar.b(oVar.f1713k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g onClearCredential$lambda$4(CancellationSignal cancellationSignal, Executor executor, H.d dVar, W0.c cVar) {
        Companion.getClass();
        if (!h.a(cancellationSignal)) {
            onClearCredential$lambda$4$0(executor, dVar);
        }
        return g.f1211a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g onClearCredential$lambda$4$0(Executor executor, H.d dVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new b(dVar, 1));
        return g.f1211a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$6(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, H.a aVar, CancellationSignal cancellationSignal, Executor executor, H.d dVar, Exception exc) {
        a2.h.e(exc, "it");
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(aVar, cancellationSignal, executor, dVar);
    }

    private static final g onCreateCredential$lambda$0(Executor executor, H.d dVar) {
        executor.execute(new b(dVar, 2));
        return g.f1211a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$0$0(H.d dVar) {
        dVar.b(new I.c("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added", "androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"));
    }

    private static final g onGetCredential$lambda$0(Executor executor, H.d dVar) {
        executor.execute(new b(dVar, 6));
        return g.f1211a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$0$0(H.d dVar) {
        dVar.b(new I.h("this device requires a Google Play Services update for the given feature to be supported"));
    }

    private static final g onGetCredential$lambda$1(Executor executor, H.d dVar) {
        executor.execute(new b(dVar, 5));
        return g.f1211a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$0(H.d dVar) {
        dVar.b(new I.h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    private final void runFallbackClearCredFlow(H.a aVar, final CancellationSignal cancellationSignal, final Executor executor, final H.d dVar) {
        Y0.b bVarV = S0.a.v(this.context);
        bVarV.f645a.getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = l.f655a;
        synchronized (set) {
        }
        Iterator it2 = set.iterator();
        if (it2.hasNext()) {
            ((l) it2.next()).getClass();
            throw new UnsupportedOperationException();
        }
        C0044d.a();
        k kVarB = k.b();
        kVarB.f813a = new J0.c[]{f.f1588a};
        kVarB.f816d = new i(bVarV, 16);
        kVarB.f814b = false;
        kVarB.f815c = 1554;
        p019g1.i iVarB = bVarV.b(1, kVarB.a());
        iVarB.b(new B1.d(new Z1.l() { // from class: M.d
            @Override // Z1.l
            public final Object f(Object obj) {
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0(cancellationSignal, executor, dVar, (Void) obj);
            }
        }, 4));
        iVarB.a(new p019g1.c() { // from class: M.e
            @Override // p019g1.c
            public final void b(Exception exc) {
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2(this.f890k, cancellationSignal, executor, dVar, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g runFallbackClearCredFlow$lambda$0(CancellationSignal cancellationSignal, Executor executor, H.d dVar, Void r3) {
        Companion.getClass();
        if (!h.a(cancellationSignal)) {
            runFallbackClearCredFlow$lambda$0$0(executor, dVar);
        }
        return g.f1211a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g runFallbackClearCredFlow$lambda$0$0(Executor executor, H.d dVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new b(dVar, 4));
        return g.f1211a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, H.d dVar, Exception exc) {
        a2.h.e(exc, "e");
        Companion.getClass();
        if (h.a(cancellationSignal)) {
            return;
        }
        runFallbackClearCredFlow$lambda$2$0$0(exc, executor, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g runFallbackClearCredFlow$lambda$2$0$0(Exception exc, Executor executor, H.d dVar) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new c(dVar, exc, 0));
        return g.f1211a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2$0$0$0(H.d dVar, Exception exc) {
        dVar.b(new a(exc.getMessage()));
    }

    public final d getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // H.e
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    @Override // H.e
    public void onClearCredential(H.a aVar, final CancellationSignal cancellationSignal, final Executor executor, final H.d dVar) {
        a2.h.e(aVar, "request");
        a2.h.e(executor, "executor");
        a2.h.e(dVar, "callback");
        Companion.getClass();
        if (h.a(cancellationSignal)) {
            return;
        }
        if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            runFallbackClearCredFlow(aVar, cancellationSignal, executor, dVar);
            return;
        }
        Context context = this.context;
        a2.h.e(context, "context");
        X0.g gVar = new X0.g(context, X0.g.f1565k, K0.b.f634d, K0.h.f642c);
        W0.b bVar = new W0.b();
        k kVarB = k.b();
        kVarB.f813a = new J0.c[]{p006c1.b.f2660b};
        kVarB.f816d = new B1.g(bVar, 8);
        kVarB.f815c = 32708;
        p019g1.i iVarB = gVar.b(1, kVarB.a());
        a2.h.d(iVarB, "doWrite(...)");
        iVarB.b(new B1.d(new Z1.l() { // from class: M.f
            @Override // Z1.l
            public final Object f(Object obj) {
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$4(cancellationSignal, executor, dVar, (W0.c) obj);
            }
        }, 5));
        iVarB.a(new M.g(this, aVar, cancellationSignal, executor, dVar));
    }

    public void onCreateCredential(Context context, H.b bVar, CancellationSignal cancellationSignal, Executor executor, H.d dVar) {
        a2.h.e(context, "context");
        a2.h.e(bVar, "request");
        throw null;
    }

    public void onGetCredential(Context context, n nVar, CancellationSignal cancellationSignal, Executor executor, H.d dVar) {
        a2.h.e(context, "context");
        a2.h.e(nVar, "pendingGetCredentialHandle");
        a2.h.e(executor, "executor");
        a2.h.e(dVar, "callback");
    }

    public void onPrepareCredential(H.k kVar, CancellationSignal cancellationSignal, Executor executor, H.d dVar) {
        a2.h.e(kVar, "request");
        a2.h.e(executor, "executor");
        a2.h.e(dVar, "callback");
    }

    public void onSignalCredentialState(H.o oVar, Executor executor, H.d dVar) {
        a2.h.e(oVar, "request");
        throw null;
    }

    public final void setGoogleApiAvailability(d dVar) {
        a2.h.e(dVar, "<set-?>");
        this.googleApiAvailability = dVar;
    }

    public final boolean isAvailableOnDevice(int i3) {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, i3);
        boolean z3 = iIsGooglePlayServicesAvailable == 0;
        if (!z3) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new J0.a(iIsGooglePlayServicesAvailable, null, null));
        }
        return z3;
    }

    @Override // H.e
    public void onGetCredential(Context context, H.k kVar, CancellationSignal cancellationSignal, Executor executor, H.d dVar) {
        a2.h.e(context, "context");
        a2.h.e(kVar, "request");
        List<m> list = kVar.f412a;
        a2.h.e(executor, "executor");
        a2.h.e(dVar, "callback");
        Companion.getClass();
        if (h.a(cancellationSignal)) {
            return;
        }
        for (m mVar : list) {
        }
        Companion.getClass();
        for (m mVar2 : list) {
        }
        if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            Companion.getClass();
            if (h.b(kVar)) {
                new Q.b(context).f(kVar, cancellationSignal, executor, dVar);
                return;
            } else {
                new O.d(context).e(kVar, cancellationSignal, executor, dVar);
                return;
            }
        }
        R.b bVar = new R.b(context);
        bVar.f1249g = cancellationSignal;
        bVar.f1247e = dVar;
        bVar.f1248f = executor;
        Companion.getClass();
        if (h.a(cancellationSignal)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        ArrayList arrayList = new ArrayList(P1.g.e0(list));
        for (m mVar3 : list) {
            mVar3.getClass();
            arrayList.add(new W0.h("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", mVar3.f414a, mVar3.f415b, StringUtils.EMPTY, StringUtils.EMPTY, StringUtils.EMPTY));
        }
        GetCredentialRequest getCredentialRequest = new GetCredentialRequest(arrayList, bundle, null, new ResultReceiver(null));
        Context context2 = bVar.f1246d;
        a2.h.e(context2, "context");
        X0.g gVar = new X0.g(context2, X0.g.f1565k, K0.b.f634d, K0.h.f642c);
        k kVarB = k.b();
        kVarB.f813a = new J0.c[]{p006c1.b.f2659a};
        kVarB.f816d = new i(getCredentialRequest, 15);
        kVarB.f815c = 32701;
        p019g1.i iVarB = gVar.b(0, kVarB.a());
        a2.h.d(iVarB, "doRead(...)");
        iVarB.b(new K(new R.a(cancellationSignal, bVar, executor, dVar), 11));
        iVarB.a(new M.g(kVar, bVar, dVar, executor, cancellationSignal));
    }
}
