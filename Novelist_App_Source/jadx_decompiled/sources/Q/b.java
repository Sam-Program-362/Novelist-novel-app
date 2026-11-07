package Q;

import F0.i;
import F0.j;
import H.d;
import H.k;
import H.l;
import I.e;
import M0.r;
import M1.K;
import M1.X;
import N.c;
import Y0.f;
import a2.h;
import android.content.Context;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Context f1225d;

    /* renamed from: e, reason: collision with root package name */
    public d f1226e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f1227f;

    /* renamed from: g, reason: collision with root package name */
    public CancellationSignal f1228g;

    /* renamed from: h, reason: collision with root package name */
    public final O.c f1229h;

    public b(Context context) {
        h.e(context, "context");
        this.f1225d = context;
        this.f1229h = new O.c(this, new Handler(Looper.getMainLooper()), 1);
    }

    public static i b(k kVar) {
        h.e(kVar, "request");
        List list = kVar.f412a;
        if (list.size() != 1) {
            throw new I.i("GetSignInWithGoogleOption cannot be combined with other options.");
        }
        Object obj = list.get(0);
        h.c(obj, "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
        h1.b bVar = (h1.b) obj;
        String str = bVar.f2895d;
        r.f(str);
        return new i(str, bVar.f2896e, null, bVar.f2897f, false, 0, null);
    }

    public final l c(j jVar) {
        String str = jVar.f337q;
        h1.c cVar = null;
        if (str != null) {
            String str2 = jVar.f332k;
            h.d(str2, "getId(...)");
            String str3 = jVar.f333l;
            if (str3 == null) {
                str3 = null;
            }
            String str4 = jVar.f334m;
            String str5 = str4 != null ? str4 : null;
            String str6 = jVar.n;
            if (str6 == null) {
                str6 = null;
            }
            String str7 = jVar.f338r;
            String str8 = str7 != null ? str7 : null;
            Uri uri = jVar.f335o;
            cVar = new h1.c(str2, str, str3, str6, str5, uri != null ? uri : null, str8);
        } else {
            Log.w("GetSignInIntent", "Credential returned but no google Id found");
        }
        if (cVar != null) {
            return new l(cVar);
        }
        throw new e("When attempting to convert get response, null credential found");
    }

    public final d d() {
        d dVar = this.f1226e;
        if (dVar != null) {
            return dVar;
        }
        h.g("callback");
        throw null;
    }

    public final Executor e() {
        Executor executor = this.f1227f;
        if (executor != null) {
            return executor;
        }
        h.g("executor");
        throw null;
    }

    public final void f(k kVar, CancellationSignal cancellationSignal, Executor executor, d dVar) {
        h.e(kVar, "request");
        h.e(dVar, "callback");
        h.e(executor, "executor");
        this.f1228g = cancellationSignal;
        this.f1226e = dVar;
        this.f1227f = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (M.h.a(cancellationSignal)) {
            return;
        }
        try {
            i b3 = b(kVar);
            Y0.b v3 = S0.a.v(this.f1225d);
            String str = b3.f326k;
            r.f(str);
            String str2 = b3.n;
            i iVar = new i(str, b3.f327l, v3.f1583k, str2, b3.f329o, b3.f330p, b3.f331q);
            L0.k b4 = L0.k.b();
            b4.f813a = new J0.c[]{f.f1592e};
            b4.f816d = new A.c(v3, iVar, 26);
            b4.f815c = 1555;
            g1.i b5 = v3.b(0, b4.a());
            b5.b(new K(new X(cancellationSignal, this, 3), 10));
            b5.a(new O.b(this, cancellationSignal, 1));
        } catch (I.i e3) {
            CredentialProviderPlayServicesImpl.Companion.getClass();
            if (M.h.a(cancellationSignal)) {
                return;
            }
            e().execute(new M.c(this, e3, 11));
        }
    }
}
