package Y0;

import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1584b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1585c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, g1.e eVar) {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback", 0);
        this.f1584b = 2;
        this.f1585c = eVar;
    }

    @Override // Y0.h
    public final boolean m(int i3, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String d3;
        int i4 = this.f1584b;
        Object obj = this.f1585c;
        switch (i4) {
            case 0:
                if (i3 != 1) {
                    return false;
                }
                Status status = (Status) n.a(parcel, Status.CREATOR);
                F0.h hVar = (F0.h) n.a(parcel, F0.h.CREATOR);
                n.c(parcel);
                H2.h.y(status, hVar, (g1.e) obj);
                return true;
            case 1:
                if (i3 != 1) {
                    return false;
                }
                Status status2 = (Status) n.a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) n.a(parcel, PendingIntent.CREATOR);
                n.c(parcel);
                H2.h.y(status2, pendingIntent, (g1.e) obj);
                return true;
            case 2:
                if (i3 != 1) {
                    return false;
                }
                Status status3 = (Status) n.a(parcel, Status.CREATOR);
                F0.a aVar = (F0.a) n.a(parcel, F0.a.CREATOR);
                n.c(parcel);
                g1.e eVar = (g1.e) obj;
                if (status3.b()) {
                    eVar.b(aVar);
                    return true;
                }
                eVar.a(M0.r.j(status3));
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i3 != 1) {
                    if (i3 != 2) {
                        return false;
                    }
                    o();
                    H0.i.w(revocationBoundService).x();
                    return true;
                }
                o();
                H0.b a3 = H0.b.a(revocationBoundService);
                GoogleSignInAccount b3 = a3.b();
                GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.u;
                if (b3 != null) {
                    String d4 = a3.d("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(d4) && (d3 = a3.d(H0.b.f("googleSignInOptions", d4))) != null) {
                        try {
                            googleSignInOptions = GoogleSignInOptions.b(d3);
                        } catch (JSONException unused) {
                        }
                    }
                    googleSignInOptions = null;
                }
                M0.r.f(googleSignInOptions);
                G0.a aVar2 = new G0.a(revocationBoundService, E0.a.f285a, googleSignInOptions, new K0.h(new B1.b(20), Looper.getMainLooper()));
                Context context = aVar2.f645a;
                L0.s sVar = aVar2.f652h;
                if (b3 == null) {
                    boolean z3 = aVar2.c() == 3;
                    G1.a aVar3 = H0.h.f440a;
                    if (aVar3.f397a <= 3) {
                        Log.d((String) aVar3.f398b, ((String) aVar3.f399c).concat("Signing out"));
                    }
                    H0.h.a(context);
                    if (z3) {
                        BasePendingResult jVar = new L0.j(sVar);
                        jVar.P(Status.f2721o);
                        basePendingResult = jVar;
                    } else {
                        H0.g gVar = new H0.g(sVar, 0);
                        sVar.a(gVar);
                        basePendingResult = gVar;
                    }
                    basePendingResult.L(new L0.l(basePendingResult, new g1.e(), new B1.b(21)));
                    return true;
                }
                boolean z4 = aVar2.c() == 3;
                G1.a aVar4 = H0.h.f440a;
                if (aVar4.f397a <= 3) {
                    Log.d((String) aVar4.f398b, ((String) aVar4.f399c).concat("Revoking access"));
                }
                String d5 = H0.b.a(context).d("refreshToken");
                H0.h.a(context);
                if (!z4) {
                    H0.g gVar2 = new H0.g(sVar, 1);
                    sVar.a(gVar2);
                    basePendingResult2 = gVar2;
                } else if (d5 == null) {
                    G1.a aVar5 = H0.c.f424m;
                    Status status4 = new Status(4, null, null, null);
                    M0.r.a("Status code must not be SUCCESS", !status4.b());
                    BasePendingResult pVar = new K0.p(status4);
                    pVar.P(status4);
                    basePendingResult2 = pVar;
                } else {
                    H0.c cVar = new H0.c(d5);
                    new Thread(cVar).start();
                    basePendingResult2 = cVar.f426l;
                }
                basePendingResult2.L(new L0.l(basePendingResult2, new g1.e(), new B1.b(21)));
                return true;
        }
    }

    public void o() {
        AppOpsManager appOpsManager;
        RevocationBoundService revocationBoundService = (RevocationBoundService) this.f1585c;
        int callingUid = Binder.getCallingUid();
        J0.g a3 = S0.b.a(revocationBoundService);
        a3.getClass();
        try {
            appOpsManager = (AppOpsManager) a3.f558a.getSystemService("appops");
        } catch (SecurityException unused) {
        }
        if (appOpsManager == null) {
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        }
        appOpsManager.checkPackage(callingUid, "com.google.android.gms");
        try {
            PackageInfo packageInfo = revocationBoundService.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            J0.g a4 = J0.g.a(revocationBoundService);
            a4.getClass();
            if (packageInfo != null) {
                if (J0.g.b(packageInfo, false)) {
                    return;
                }
                if (J0.g.b(packageInfo, true)) {
                    Context context = a4.f558a;
                    try {
                        if (!J0.f.f554c) {
                            try {
                                PackageInfo packageInfo2 = S0.b.a(context).f558a.getPackageManager().getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                                J0.g.a(context);
                                if (packageInfo2 == null || J0.g.b(packageInfo2, false) || !J0.g.b(packageInfo2, true)) {
                                    J0.f.f553b = false;
                                } else {
                                    J0.f.f553b = true;
                                }
                                J0.f.f554c = true;
                            } catch (PackageManager.NameNotFoundException e3) {
                                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e3);
                                J0.f.f554c = true;
                            }
                        }
                        if (J0.f.f553b || !"user".equals(Build.TYPE)) {
                            return;
                        } else {
                            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                        }
                    } catch (Throwable th) {
                        J0.f.f554c = true;
                        throw th;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            if (Log.isLoggable("UidVerifier", 3)) {
                Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            }
        }
        int callingUid2 = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(String.valueOf(callingUid2).length() + 41);
        sb.append("Calling UID ");
        sb.append(callingUid2);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, g1.e eVar, int i3) {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 0);
        this.f1584b = i3;
        switch (i3) {
            case 1:
                this.f1585c = eVar;
                super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback", 0);
                break;
            default:
                this.f1585c = eVar;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 0);
        this.f1584b = 3;
        this.f1585c = revocationBoundService;
    }
}
