package I1;

import D.C0002c;
import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ n f505a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O1.e f506b = new O1.e(new l(0));

    public static C1.l a() {
        return (C1.l) f506b.a();
    }

    public static void b(C1.f fVar, final s sVar) {
        a2.h.e(fVar, "binaryMessenger");
        p057t1.a aVar = null;
        B1.s sVar2 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getGoogleServicesJsonServerClientId", StringUtils.EMPTY), a(), aVar);
        if (sVar != null) {
            final int i3 = 0;
            sVar2.y(new C1.b() { // from class: I1.m
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    String str;
                    String str2;
                    boolean z3;
                    switch (i3) {
                        case 0:
                            try {
                                Context context = ((s) sVar).f513k;
                                int identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
                                listD0 = E2.a.B(identifier != 0 ? context.getString(identifier) : null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof d) {
                                    d dVar = th;
                                    listD0 = P1.f.d0(dVar.f477k, dVar.f478l, null);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams");
                            h hVar = (h) obj2;
                            k kVar = new k(cVar, 2);
                            s sVar3 = (s) sVar;
                            sVar3.getClass();
                            try {
                                String str3 = hVar.f496c;
                                if (str3 != null && !str3.isEmpty()) {
                                    Activity activity = sVar3.f516o;
                                    if (activity == null) {
                                        p000a.a.o(kVar, new e(f.f484o, "No activity available", null));
                                        return;
                                    }
                                    String str4 = hVar.f498e;
                                    String str5 = hVar.f497d;
                                    ArrayList arrayList = new ArrayList();
                                    if (hVar.f494a) {
                                        if (str5 == null) {
                                            str5 = null;
                                        }
                                        arrayList.add(new p023h1.b(str3, str5, str4 != null ? str4 : null));
                                    } else {
                                        g gVar = hVar.f495b;
                                        boolean z4 = gVar.f492a;
                                        boolean z5 = gVar.f493b;
                                        if (str3.length() <= 0) {
                                            throw new IllegalArgumentException("serverClientId should not be empty");
                                        }
                                        arrayList.add(new p023h1.a(str3, str4 != null ? str4 : null, z4, z5));
                                    }
                                    a2.h.e(sVar3.f513k, "context");
                                    H.k kVar2 = new H.k(P1.e.l0(arrayList));
                                    ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                                    A.c cVar2 = new A.c(sVar3, kVar, 16, false);
                                    a2.h.e(executorServiceNewSingleThreadExecutor, "executor");
                                    H.e eVarB = H.f.b(new H.f((Context) activity), kVar2);
                                    if (eVarB == null) {
                                        cVar2.b(new I.h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                                        return;
                                    } else {
                                        eVarB.onGetCredential(activity, kVar2, null, executorServiceNewSingleThreadExecutor, cVar2);
                                        return;
                                    }
                                }
                                p000a.a.o(kVar, new e(f.n, "CredentialManager requires a serverClientId.", null));
                                return;
                            } catch (RuntimeException e3) {
                                p000a.a.o(kVar, new e(f.u, e3.getMessage(), "Cause: " + e3.getCause() + ", Stacktrace: " + Log.getStackTraceString(e3)));
                                return;
                            }
                        case 2:
                            k kVar3 = new k(cVar, 3);
                            s sVar4 = (s) sVar;
                            C0002c c0002c = sVar4.f514l;
                            Context context2 = sVar4.f513k;
                            a2.h.e(context2, "context");
                            H.a aVar2 = new H.a();
                            new Bundle();
                            ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
                            B1.a aVar3 = new B1.a(kVar3, 9);
                            a2.h.e(executorServiceNewSingleThreadExecutor2, "executor");
                            H.e eVarB2 = H.f.b(new H.f(context2), "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE");
                            if (eVarB2 == null) {
                                aVar3.b(new I.a());
                                return;
                            } else {
                                eVarB2.onClearCredential(aVar2, null, executorServiceNewSingleThreadExecutor2, aVar3);
                                return;
                            }
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            k kVar4 = new k(cVar, 4);
                            s sVar5 = (s) sVar;
                            C0002c c0002c2 = sVar5.f515m;
                            Y0.b bVarB = C0002c.b(sVar5.f513k);
                            ClearTokenRequest clearTokenRequest = new ClearTokenRequest((String) obj3, bVarB.f1583k);
                            L0.k kVarB = L0.k.b();
                            kVarB.f813a = new J0.c[]{Y0.f.f1591d};
                            kVarB.f816d = new A.c(bVarB, clearTokenRequest, 24);
                            kVarB.f815c = 1721;
                            p019g1.i iVarB = bVarB.b(1, kVarB.a());
                            iVarB.b(new p(kVar4));
                            iVarB.a(new p(kVar4));
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
                            v vVar = (v) obj4;
                            Object obj5 = list.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            final k kVar5 = new k(cVar, 0);
                            final s sVar6 = (s) sVar;
                            sVar6.getClass();
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                List list2 = vVar.f522a;
                                String str6 = vVar.f524c;
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(new Scope((String) it2.next(), 1));
                                }
                                M0.r.a("requestedScopes cannot be null or empty", !arrayList2.isEmpty());
                                String str7 = vVar.f523b;
                                if (str7 != null) {
                                    M0.r.d(str7);
                                    str = str7;
                                } else {
                                    str = null;
                                }
                                String str8 = vVar.f525d;
                                if (str8 != null) {
                                    z3 = true;
                                    str2 = str8;
                                } else {
                                    str2 = null;
                                    z3 = false;
                                }
                                p019g1.i iVarC = C0002c.b(sVar6.f513k).c(new AuthorizationRequest(arrayList2, str2, z3, false, str6 != null ? new Account(str6, "com.google") : null, str, null, false, null, false, z3 ? 1 : 0));
                                iVarC.b(new p019g1.d() { // from class: I1.r
                                    @Override // p019g1.d
                                    public final void c(Object obj6) {
                                        F0.a aVar4 = (F0.a) obj6;
                                        s sVar7 = sVar6;
                                        sVar7.getClass();
                                        PendingIntent pendingIntent = aVar4.f298p;
                                        k kVar6 = kVar5;
                                        if (pendingIntent == null) {
                                            p000a.a.o(kVar6, new w(aVar4.f295l, aVar4.n, aVar4.f294k));
                                        } else {
                                            if (!zBooleanValue) {
                                                p000a.a.o(kVar6, new a(b.f471m, null, null));
                                                return;
                                            }
                                            Activity activity2 = sVar7.f516o;
                                            if (activity2 == null) {
                                                p000a.a.o(kVar6, new a(b.f474q, "No activity available", null));
                                                return;
                                            }
                                            try {
                                                sVar7.f517p = kVar6;
                                                activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), 53294, null, 0, 0, 0, null);
                                            } catch (IntentSender.SendIntentException e4) {
                                                sVar7.f517p = null;
                                                p000a.a.o(kVar6, new a(b.f472o, e4.getMessage(), null));
                                            }
                                        }
                                    }
                                });
                                iVarC.a(new B1.d(kVar5, 2));
                                return;
                            } catch (RuntimeException e4) {
                                p000a.a.o(kVar5, new a(b.f473p, e4.getMessage(), "Cause: " + e4.getCause() + ", Stacktrace: " + Log.getStackTraceString(e4)));
                                return;
                            }
                        default:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformRevokeAccessRequest");
                            y yVar = (y) obj6;
                            k kVar6 = new k(cVar, 1);
                            s sVar7 = (s) sVar;
                            sVar7.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = yVar.f536b.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(new Scope((String) it3.next(), 1));
                            }
                            Y0.b bVarB2 = C0002c.b(sVar7.f513k);
                            RevokeAccessRequest revokeAccessRequest = new RevokeAccessRequest(Y0.l.g(arrayList3), new Account(yVar.f535a, "com.google"), null);
                            RevokeAccessRequest revokeAccessRequest2 = new RevokeAccessRequest(revokeAccessRequest.f2676k, revokeAccessRequest.f2677l, bVarB2.f1583k);
                            L0.k kVarB2 = L0.k.b();
                            kVarB2.f813a = new J0.c[]{Y0.f.f1590c};
                            kVarB2.f816d = new A.c(bVarB2, revokeAccessRequest2, 23);
                            kVarB2.f815c = 1721;
                            p019g1.i iVarB2 = bVarB2.b(1, kVarB2.a());
                            iVarB2.b(new q(kVar6));
                            iVarB2.a(new q(kVar6));
                            return;
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        B1.s sVar3 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getCredential", StringUtils.EMPTY), a(), aVar);
        if (sVar != null) {
            final int i4 = 1;
            sVar3.y(new C1.b() { // from class: I1.m
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    String str;
                    String str2;
                    boolean z3;
                    switch (i4) {
                        case 0:
                            try {
                                Context context = ((s) sVar).f513k;
                                int identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
                                listD0 = E2.a.B(identifier != 0 ? context.getString(identifier) : null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof d) {
                                    d dVar = th;
                                    listD0 = P1.f.d0(dVar.f477k, dVar.f478l, null);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams");
                            h hVar = (h) obj2;
                            k kVar = new k(cVar, 2);
                            s sVar4 = (s) sVar;
                            sVar4.getClass();
                            try {
                                String str3 = hVar.f496c;
                                if (str3 != null && !str3.isEmpty()) {
                                    Activity activity = sVar4.f516o;
                                    if (activity == null) {
                                        p000a.a.o(kVar, new e(f.f484o, "No activity available", null));
                                        return;
                                    }
                                    String str4 = hVar.f498e;
                                    String str5 = hVar.f497d;
                                    ArrayList arrayList = new ArrayList();
                                    if (hVar.f494a) {
                                        if (str5 == null) {
                                            str5 = null;
                                        }
                                        arrayList.add(new p023h1.b(str3, str5, str4 != null ? str4 : null));
                                    } else {
                                        g gVar = hVar.f495b;
                                        boolean z4 = gVar.f492a;
                                        boolean z5 = gVar.f493b;
                                        if (str3.length() <= 0) {
                                            throw new IllegalArgumentException("serverClientId should not be empty");
                                        }
                                        arrayList.add(new p023h1.a(str3, str4 != null ? str4 : null, z4, z5));
                                    }
                                    a2.h.e(sVar4.f513k, "context");
                                    H.k kVar2 = new H.k(P1.e.l0(arrayList));
                                    ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                                    A.c cVar2 = new A.c(sVar4, kVar, 16, false);
                                    a2.h.e(executorServiceNewSingleThreadExecutor, "executor");
                                    H.e eVarB = H.f.b(new H.f((Context) activity), kVar2);
                                    if (eVarB == null) {
                                        cVar2.b(new I.h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                                        return;
                                    } else {
                                        eVarB.onGetCredential(activity, kVar2, null, executorServiceNewSingleThreadExecutor, cVar2);
                                        return;
                                    }
                                }
                                p000a.a.o(kVar, new e(f.n, "CredentialManager requires a serverClientId.", null));
                                return;
                            } catch (RuntimeException e3) {
                                p000a.a.o(kVar, new e(f.u, e3.getMessage(), "Cause: " + e3.getCause() + ", Stacktrace: " + Log.getStackTraceString(e3)));
                                return;
                            }
                        case 2:
                            k kVar3 = new k(cVar, 3);
                            s sVar5 = (s) sVar;
                            C0002c c0002c = sVar5.f514l;
                            Context context2 = sVar5.f513k;
                            a2.h.e(context2, "context");
                            H.a aVar2 = new H.a();
                            new Bundle();
                            ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
                            B1.a aVar3 = new B1.a(kVar3, 9);
                            a2.h.e(executorServiceNewSingleThreadExecutor2, "executor");
                            H.e eVarB2 = H.f.b(new H.f(context2), "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE");
                            if (eVarB2 == null) {
                                aVar3.b(new I.a());
                                return;
                            } else {
                                eVarB2.onClearCredential(aVar2, null, executorServiceNewSingleThreadExecutor2, aVar3);
                                return;
                            }
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            k kVar4 = new k(cVar, 4);
                            s sVar6 = (s) sVar;
                            C0002c c0002c2 = sVar6.f515m;
                            Y0.b bVarB = C0002c.b(sVar6.f513k);
                            ClearTokenRequest clearTokenRequest = new ClearTokenRequest((String) obj3, bVarB.f1583k);
                            L0.k kVarB = L0.k.b();
                            kVarB.f813a = new J0.c[]{Y0.f.f1591d};
                            kVarB.f816d = new A.c(bVarB, clearTokenRequest, 24);
                            kVarB.f815c = 1721;
                            p019g1.i iVarB = bVarB.b(1, kVarB.a());
                            iVarB.b(new p(kVar4));
                            iVarB.a(new p(kVar4));
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
                            v vVar = (v) obj4;
                            Object obj5 = list.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            final k kVar5 = new k(cVar, 0);
                            final s sVar7 = (s) sVar;
                            sVar7.getClass();
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                List list2 = vVar.f522a;
                                String str6 = vVar.f524c;
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(new Scope((String) it2.next(), 1));
                                }
                                M0.r.a("requestedScopes cannot be null or empty", !arrayList2.isEmpty());
                                String str7 = vVar.f523b;
                                if (str7 != null) {
                                    M0.r.d(str7);
                                    str = str7;
                                } else {
                                    str = null;
                                }
                                String str8 = vVar.f525d;
                                if (str8 != null) {
                                    z3 = true;
                                    str2 = str8;
                                } else {
                                    str2 = null;
                                    z3 = false;
                                }
                                p019g1.i iVarC = C0002c.b(sVar7.f513k).c(new AuthorizationRequest(arrayList2, str2, z3, false, str6 != null ? new Account(str6, "com.google") : null, str, null, false, null, false, z3 ? 1 : 0));
                                iVarC.b(new p019g1.d() { // from class: I1.r
                                    @Override // p019g1.d
                                    public final void c(Object obj6) {
                                        F0.a aVar4 = (F0.a) obj6;
                                        s sVar8 = sVar7;
                                        sVar8.getClass();
                                        PendingIntent pendingIntent = aVar4.f298p;
                                        k kVar6 = kVar5;
                                        if (pendingIntent == null) {
                                            p000a.a.o(kVar6, new w(aVar4.f295l, aVar4.n, aVar4.f294k));
                                        } else {
                                            if (!zBooleanValue) {
                                                p000a.a.o(kVar6, new a(b.f471m, null, null));
                                                return;
                                            }
                                            Activity activity2 = sVar8.f516o;
                                            if (activity2 == null) {
                                                p000a.a.o(kVar6, new a(b.f474q, "No activity available", null));
                                                return;
                                            }
                                            try {
                                                sVar8.f517p = kVar6;
                                                activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), 53294, null, 0, 0, 0, null);
                                            } catch (IntentSender.SendIntentException e4) {
                                                sVar8.f517p = null;
                                                p000a.a.o(kVar6, new a(b.f472o, e4.getMessage(), null));
                                            }
                                        }
                                    }
                                });
                                iVarC.a(new B1.d(kVar5, 2));
                                return;
                            } catch (RuntimeException e4) {
                                p000a.a.o(kVar5, new a(b.f473p, e4.getMessage(), "Cause: " + e4.getCause() + ", Stacktrace: " + Log.getStackTraceString(e4)));
                                return;
                            }
                        default:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformRevokeAccessRequest");
                            y yVar = (y) obj6;
                            k kVar6 = new k(cVar, 1);
                            s sVar8 = (s) sVar;
                            sVar8.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = yVar.f536b.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(new Scope((String) it3.next(), 1));
                            }
                            Y0.b bVarB2 = C0002c.b(sVar8.f513k);
                            RevokeAccessRequest revokeAccessRequest = new RevokeAccessRequest(Y0.l.g(arrayList3), new Account(yVar.f535a, "com.google"), null);
                            RevokeAccessRequest revokeAccessRequest2 = new RevokeAccessRequest(revokeAccessRequest.f2676k, revokeAccessRequest.f2677l, bVarB2.f1583k);
                            L0.k kVarB2 = L0.k.b();
                            kVarB2.f813a = new J0.c[]{Y0.f.f1590c};
                            kVarB2.f816d = new A.c(bVarB2, revokeAccessRequest2, 23);
                            kVarB2.f815c = 1721;
                            p019g1.i iVarB2 = bVarB2.b(1, kVarB2.a());
                            iVarB2.b(new q(kVar6));
                            iVarB2.a(new q(kVar6));
                            return;
                    }
                }
            });
        } else {
            sVar3.y(null);
        }
        B1.s sVar4 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearCredentialState", StringUtils.EMPTY), a(), aVar);
        if (sVar != null) {
            final int i5 = 2;
            sVar4.y(new C1.b() { // from class: I1.m
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    String str;
                    String str2;
                    boolean z3;
                    switch (i5) {
                        case 0:
                            try {
                                Context context = ((s) sVar).f513k;
                                int identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
                                listD0 = E2.a.B(identifier != 0 ? context.getString(identifier) : null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof d) {
                                    d dVar = th;
                                    listD0 = P1.f.d0(dVar.f477k, dVar.f478l, null);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams");
                            h hVar = (h) obj2;
                            k kVar = new k(cVar, 2);
                            s sVar5 = (s) sVar;
                            sVar5.getClass();
                            try {
                                String str3 = hVar.f496c;
                                if (str3 != null && !str3.isEmpty()) {
                                    Activity activity = sVar5.f516o;
                                    if (activity == null) {
                                        p000a.a.o(kVar, new e(f.f484o, "No activity available", null));
                                        return;
                                    }
                                    String str4 = hVar.f498e;
                                    String str5 = hVar.f497d;
                                    ArrayList arrayList = new ArrayList();
                                    if (hVar.f494a) {
                                        if (str5 == null) {
                                            str5 = null;
                                        }
                                        arrayList.add(new p023h1.b(str3, str5, str4 != null ? str4 : null));
                                    } else {
                                        g gVar = hVar.f495b;
                                        boolean z4 = gVar.f492a;
                                        boolean z5 = gVar.f493b;
                                        if (str3.length() <= 0) {
                                            throw new IllegalArgumentException("serverClientId should not be empty");
                                        }
                                        arrayList.add(new p023h1.a(str3, str4 != null ? str4 : null, z4, z5));
                                    }
                                    a2.h.e(sVar5.f513k, "context");
                                    H.k kVar2 = new H.k(P1.e.l0(arrayList));
                                    ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                                    A.c cVar2 = new A.c(sVar5, kVar, 16, false);
                                    a2.h.e(executorServiceNewSingleThreadExecutor, "executor");
                                    H.e eVarB = H.f.b(new H.f((Context) activity), kVar2);
                                    if (eVarB == null) {
                                        cVar2.b(new I.h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                                        return;
                                    } else {
                                        eVarB.onGetCredential(activity, kVar2, null, executorServiceNewSingleThreadExecutor, cVar2);
                                        return;
                                    }
                                }
                                p000a.a.o(kVar, new e(f.n, "CredentialManager requires a serverClientId.", null));
                                return;
                            } catch (RuntimeException e3) {
                                p000a.a.o(kVar, new e(f.u, e3.getMessage(), "Cause: " + e3.getCause() + ", Stacktrace: " + Log.getStackTraceString(e3)));
                                return;
                            }
                        case 2:
                            k kVar3 = new k(cVar, 3);
                            s sVar6 = (s) sVar;
                            C0002c c0002c = sVar6.f514l;
                            Context context2 = sVar6.f513k;
                            a2.h.e(context2, "context");
                            H.a aVar2 = new H.a();
                            new Bundle();
                            ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
                            B1.a aVar3 = new B1.a(kVar3, 9);
                            a2.h.e(executorServiceNewSingleThreadExecutor2, "executor");
                            H.e eVarB2 = H.f.b(new H.f(context2), "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE");
                            if (eVarB2 == null) {
                                aVar3.b(new I.a());
                                return;
                            } else {
                                eVarB2.onClearCredential(aVar2, null, executorServiceNewSingleThreadExecutor2, aVar3);
                                return;
                            }
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            k kVar4 = new k(cVar, 4);
                            s sVar7 = (s) sVar;
                            C0002c c0002c2 = sVar7.f515m;
                            Y0.b bVarB = C0002c.b(sVar7.f513k);
                            ClearTokenRequest clearTokenRequest = new ClearTokenRequest((String) obj3, bVarB.f1583k);
                            L0.k kVarB = L0.k.b();
                            kVarB.f813a = new J0.c[]{Y0.f.f1591d};
                            kVarB.f816d = new A.c(bVarB, clearTokenRequest, 24);
                            kVarB.f815c = 1721;
                            p019g1.i iVarB = bVarB.b(1, kVarB.a());
                            iVarB.b(new p(kVar4));
                            iVarB.a(new p(kVar4));
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
                            v vVar = (v) obj4;
                            Object obj5 = list.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            final k kVar5 = new k(cVar, 0);
                            final s sVar8 = (s) sVar;
                            sVar8.getClass();
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                List list2 = vVar.f522a;
                                String str6 = vVar.f524c;
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(new Scope((String) it2.next(), 1));
                                }
                                M0.r.a("requestedScopes cannot be null or empty", !arrayList2.isEmpty());
                                String str7 = vVar.f523b;
                                if (str7 != null) {
                                    M0.r.d(str7);
                                    str = str7;
                                } else {
                                    str = null;
                                }
                                String str8 = vVar.f525d;
                                if (str8 != null) {
                                    z3 = true;
                                    str2 = str8;
                                } else {
                                    str2 = null;
                                    z3 = false;
                                }
                                p019g1.i iVarC = C0002c.b(sVar8.f513k).c(new AuthorizationRequest(arrayList2, str2, z3, false, str6 != null ? new Account(str6, "com.google") : null, str, null, false, null, false, z3 ? 1 : 0));
                                iVarC.b(new p019g1.d() { // from class: I1.r
                                    @Override // p019g1.d
                                    public final void c(Object obj6) {
                                        F0.a aVar4 = (F0.a) obj6;
                                        s sVar9 = sVar8;
                                        sVar9.getClass();
                                        PendingIntent pendingIntent = aVar4.f298p;
                                        k kVar6 = kVar5;
                                        if (pendingIntent == null) {
                                            p000a.a.o(kVar6, new w(aVar4.f295l, aVar4.n, aVar4.f294k));
                                        } else {
                                            if (!zBooleanValue) {
                                                p000a.a.o(kVar6, new a(b.f471m, null, null));
                                                return;
                                            }
                                            Activity activity2 = sVar9.f516o;
                                            if (activity2 == null) {
                                                p000a.a.o(kVar6, new a(b.f474q, "No activity available", null));
                                                return;
                                            }
                                            try {
                                                sVar9.f517p = kVar6;
                                                activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), 53294, null, 0, 0, 0, null);
                                            } catch (IntentSender.SendIntentException e4) {
                                                sVar9.f517p = null;
                                                p000a.a.o(kVar6, new a(b.f472o, e4.getMessage(), null));
                                            }
                                        }
                                    }
                                });
                                iVarC.a(new B1.d(kVar5, 2));
                                return;
                            } catch (RuntimeException e4) {
                                p000a.a.o(kVar5, new a(b.f473p, e4.getMessage(), "Cause: " + e4.getCause() + ", Stacktrace: " + Log.getStackTraceString(e4)));
                                return;
                            }
                        default:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformRevokeAccessRequest");
                            y yVar = (y) obj6;
                            k kVar6 = new k(cVar, 1);
                            s sVar9 = (s) sVar;
                            sVar9.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = yVar.f536b.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(new Scope((String) it3.next(), 1));
                            }
                            Y0.b bVarB2 = C0002c.b(sVar9.f513k);
                            RevokeAccessRequest revokeAccessRequest = new RevokeAccessRequest(Y0.l.g(arrayList3), new Account(yVar.f535a, "com.google"), null);
                            RevokeAccessRequest revokeAccessRequest2 = new RevokeAccessRequest(revokeAccessRequest.f2676k, revokeAccessRequest.f2677l, bVarB2.f1583k);
                            L0.k kVarB2 = L0.k.b();
                            kVarB2.f813a = new J0.c[]{Y0.f.f1590c};
                            kVarB2.f816d = new A.c(bVarB2, revokeAccessRequest2, 23);
                            kVarB2.f815c = 1721;
                            p019g1.i iVarB2 = bVarB2.b(1, kVarB2.a());
                            iVarB2.b(new q(kVar6));
                            iVarB2.a(new q(kVar6));
                            return;
                    }
                }
            });
        } else {
            sVar4.y(null);
        }
        B1.s sVar5 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearAuthorizationToken", StringUtils.EMPTY), a(), aVar);
        if (sVar != null) {
            final int i6 = 3;
            sVar5.y(new C1.b() { // from class: I1.m
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    String str;
                    String str2;
                    boolean z3;
                    switch (i6) {
                        case 0:
                            try {
                                Context context = ((s) sVar).f513k;
                                int identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
                                listD0 = E2.a.B(identifier != 0 ? context.getString(identifier) : null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof d) {
                                    d dVar = th;
                                    listD0 = P1.f.d0(dVar.f477k, dVar.f478l, null);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams");
                            h hVar = (h) obj2;
                            k kVar = new k(cVar, 2);
                            s sVar6 = (s) sVar;
                            sVar6.getClass();
                            try {
                                String str3 = hVar.f496c;
                                if (str3 != null && !str3.isEmpty()) {
                                    Activity activity = sVar6.f516o;
                                    if (activity == null) {
                                        p000a.a.o(kVar, new e(f.f484o, "No activity available", null));
                                        return;
                                    }
                                    String str4 = hVar.f498e;
                                    String str5 = hVar.f497d;
                                    ArrayList arrayList = new ArrayList();
                                    if (hVar.f494a) {
                                        if (str5 == null) {
                                            str5 = null;
                                        }
                                        arrayList.add(new p023h1.b(str3, str5, str4 != null ? str4 : null));
                                    } else {
                                        g gVar = hVar.f495b;
                                        boolean z4 = gVar.f492a;
                                        boolean z5 = gVar.f493b;
                                        if (str3.length() <= 0) {
                                            throw new IllegalArgumentException("serverClientId should not be empty");
                                        }
                                        arrayList.add(new p023h1.a(str3, str4 != null ? str4 : null, z4, z5));
                                    }
                                    a2.h.e(sVar6.f513k, "context");
                                    H.k kVar2 = new H.k(P1.e.l0(arrayList));
                                    ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                                    A.c cVar2 = new A.c(sVar6, kVar, 16, false);
                                    a2.h.e(executorServiceNewSingleThreadExecutor, "executor");
                                    H.e eVarB = H.f.b(new H.f((Context) activity), kVar2);
                                    if (eVarB == null) {
                                        cVar2.b(new I.h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                                        return;
                                    } else {
                                        eVarB.onGetCredential(activity, kVar2, null, executorServiceNewSingleThreadExecutor, cVar2);
                                        return;
                                    }
                                }
                                p000a.a.o(kVar, new e(f.n, "CredentialManager requires a serverClientId.", null));
                                return;
                            } catch (RuntimeException e3) {
                                p000a.a.o(kVar, new e(f.u, e3.getMessage(), "Cause: " + e3.getCause() + ", Stacktrace: " + Log.getStackTraceString(e3)));
                                return;
                            }
                        case 2:
                            k kVar3 = new k(cVar, 3);
                            s sVar7 = (s) sVar;
                            C0002c c0002c = sVar7.f514l;
                            Context context2 = sVar7.f513k;
                            a2.h.e(context2, "context");
                            H.a aVar2 = new H.a();
                            new Bundle();
                            ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
                            B1.a aVar3 = new B1.a(kVar3, 9);
                            a2.h.e(executorServiceNewSingleThreadExecutor2, "executor");
                            H.e eVarB2 = H.f.b(new H.f(context2), "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE");
                            if (eVarB2 == null) {
                                aVar3.b(new I.a());
                                return;
                            } else {
                                eVarB2.onClearCredential(aVar2, null, executorServiceNewSingleThreadExecutor2, aVar3);
                                return;
                            }
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            k kVar4 = new k(cVar, 4);
                            s sVar8 = (s) sVar;
                            C0002c c0002c2 = sVar8.f515m;
                            Y0.b bVarB = C0002c.b(sVar8.f513k);
                            ClearTokenRequest clearTokenRequest = new ClearTokenRequest((String) obj3, bVarB.f1583k);
                            L0.k kVarB = L0.k.b();
                            kVarB.f813a = new J0.c[]{Y0.f.f1591d};
                            kVarB.f816d = new A.c(bVarB, clearTokenRequest, 24);
                            kVarB.f815c = 1721;
                            p019g1.i iVarB = bVarB.b(1, kVarB.a());
                            iVarB.b(new p(kVar4));
                            iVarB.a(new p(kVar4));
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
                            v vVar = (v) obj4;
                            Object obj5 = list.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            final k kVar5 = new k(cVar, 0);
                            final s sVar9 = (s) sVar;
                            sVar9.getClass();
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                List list2 = vVar.f522a;
                                String str6 = vVar.f524c;
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(new Scope((String) it2.next(), 1));
                                }
                                M0.r.a("requestedScopes cannot be null or empty", !arrayList2.isEmpty());
                                String str7 = vVar.f523b;
                                if (str7 != null) {
                                    M0.r.d(str7);
                                    str = str7;
                                } else {
                                    str = null;
                                }
                                String str8 = vVar.f525d;
                                if (str8 != null) {
                                    z3 = true;
                                    str2 = str8;
                                } else {
                                    str2 = null;
                                    z3 = false;
                                }
                                p019g1.i iVarC = C0002c.b(sVar9.f513k).c(new AuthorizationRequest(arrayList2, str2, z3, false, str6 != null ? new Account(str6, "com.google") : null, str, null, false, null, false, z3 ? 1 : 0));
                                iVarC.b(new p019g1.d() { // from class: I1.r
                                    @Override // p019g1.d
                                    public final void c(Object obj6) {
                                        F0.a aVar4 = (F0.a) obj6;
                                        s sVar10 = sVar9;
                                        sVar10.getClass();
                                        PendingIntent pendingIntent = aVar4.f298p;
                                        k kVar6 = kVar5;
                                        if (pendingIntent == null) {
                                            p000a.a.o(kVar6, new w(aVar4.f295l, aVar4.n, aVar4.f294k));
                                        } else {
                                            if (!zBooleanValue) {
                                                p000a.a.o(kVar6, new a(b.f471m, null, null));
                                                return;
                                            }
                                            Activity activity2 = sVar10.f516o;
                                            if (activity2 == null) {
                                                p000a.a.o(kVar6, new a(b.f474q, "No activity available", null));
                                                return;
                                            }
                                            try {
                                                sVar10.f517p = kVar6;
                                                activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), 53294, null, 0, 0, 0, null);
                                            } catch (IntentSender.SendIntentException e4) {
                                                sVar10.f517p = null;
                                                p000a.a.o(kVar6, new a(b.f472o, e4.getMessage(), null));
                                            }
                                        }
                                    }
                                });
                                iVarC.a(new B1.d(kVar5, 2));
                                return;
                            } catch (RuntimeException e4) {
                                p000a.a.o(kVar5, new a(b.f473p, e4.getMessage(), "Cause: " + e4.getCause() + ", Stacktrace: " + Log.getStackTraceString(e4)));
                                return;
                            }
                        default:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformRevokeAccessRequest");
                            y yVar = (y) obj6;
                            k kVar6 = new k(cVar, 1);
                            s sVar10 = (s) sVar;
                            sVar10.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = yVar.f536b.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(new Scope((String) it3.next(), 1));
                            }
                            Y0.b bVarB2 = C0002c.b(sVar10.f513k);
                            RevokeAccessRequest revokeAccessRequest = new RevokeAccessRequest(Y0.l.g(arrayList3), new Account(yVar.f535a, "com.google"), null);
                            RevokeAccessRequest revokeAccessRequest2 = new RevokeAccessRequest(revokeAccessRequest.f2676k, revokeAccessRequest.f2677l, bVarB2.f1583k);
                            L0.k kVarB2 = L0.k.b();
                            kVarB2.f813a = new J0.c[]{Y0.f.f1590c};
                            kVarB2.f816d = new A.c(bVarB2, revokeAccessRequest2, 23);
                            kVarB2.f815c = 1721;
                            p019g1.i iVarB2 = bVarB2.b(1, kVarB2.a());
                            iVarB2.b(new q(kVar6));
                            iVarB2.a(new q(kVar6));
                            return;
                    }
                }
            });
        } else {
            sVar5.y(null);
        }
        B1.s sVar6 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.authorize", StringUtils.EMPTY), a(), aVar);
        if (sVar != null) {
            final int i7 = 4;
            sVar6.y(new C1.b() { // from class: I1.m
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    String str;
                    String str2;
                    boolean z3;
                    switch (i7) {
                        case 0:
                            try {
                                Context context = ((s) sVar).f513k;
                                int identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
                                listD0 = E2.a.B(identifier != 0 ? context.getString(identifier) : null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof d) {
                                    d dVar = th;
                                    listD0 = P1.f.d0(dVar.f477k, dVar.f478l, null);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams");
                            h hVar = (h) obj2;
                            k kVar = new k(cVar, 2);
                            s sVar7 = (s) sVar;
                            sVar7.getClass();
                            try {
                                String str3 = hVar.f496c;
                                if (str3 != null && !str3.isEmpty()) {
                                    Activity activity = sVar7.f516o;
                                    if (activity == null) {
                                        p000a.a.o(kVar, new e(f.f484o, "No activity available", null));
                                        return;
                                    }
                                    String str4 = hVar.f498e;
                                    String str5 = hVar.f497d;
                                    ArrayList arrayList = new ArrayList();
                                    if (hVar.f494a) {
                                        if (str5 == null) {
                                            str5 = null;
                                        }
                                        arrayList.add(new p023h1.b(str3, str5, str4 != null ? str4 : null));
                                    } else {
                                        g gVar = hVar.f495b;
                                        boolean z4 = gVar.f492a;
                                        boolean z5 = gVar.f493b;
                                        if (str3.length() <= 0) {
                                            throw new IllegalArgumentException("serverClientId should not be empty");
                                        }
                                        arrayList.add(new p023h1.a(str3, str4 != null ? str4 : null, z4, z5));
                                    }
                                    a2.h.e(sVar7.f513k, "context");
                                    H.k kVar2 = new H.k(P1.e.l0(arrayList));
                                    ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                                    A.c cVar2 = new A.c(sVar7, kVar, 16, false);
                                    a2.h.e(executorServiceNewSingleThreadExecutor, "executor");
                                    H.e eVarB = H.f.b(new H.f((Context) activity), kVar2);
                                    if (eVarB == null) {
                                        cVar2.b(new I.h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                                        return;
                                    } else {
                                        eVarB.onGetCredential(activity, kVar2, null, executorServiceNewSingleThreadExecutor, cVar2);
                                        return;
                                    }
                                }
                                p000a.a.o(kVar, new e(f.n, "CredentialManager requires a serverClientId.", null));
                                return;
                            } catch (RuntimeException e3) {
                                p000a.a.o(kVar, new e(f.u, e3.getMessage(), "Cause: " + e3.getCause() + ", Stacktrace: " + Log.getStackTraceString(e3)));
                                return;
                            }
                        case 2:
                            k kVar3 = new k(cVar, 3);
                            s sVar8 = (s) sVar;
                            C0002c c0002c = sVar8.f514l;
                            Context context2 = sVar8.f513k;
                            a2.h.e(context2, "context");
                            H.a aVar2 = new H.a();
                            new Bundle();
                            ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
                            B1.a aVar3 = new B1.a(kVar3, 9);
                            a2.h.e(executorServiceNewSingleThreadExecutor2, "executor");
                            H.e eVarB2 = H.f.b(new H.f(context2), "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE");
                            if (eVarB2 == null) {
                                aVar3.b(new I.a());
                                return;
                            } else {
                                eVarB2.onClearCredential(aVar2, null, executorServiceNewSingleThreadExecutor2, aVar3);
                                return;
                            }
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            k kVar4 = new k(cVar, 4);
                            s sVar9 = (s) sVar;
                            C0002c c0002c2 = sVar9.f515m;
                            Y0.b bVarB = C0002c.b(sVar9.f513k);
                            ClearTokenRequest clearTokenRequest = new ClearTokenRequest((String) obj3, bVarB.f1583k);
                            L0.k kVarB = L0.k.b();
                            kVarB.f813a = new J0.c[]{Y0.f.f1591d};
                            kVarB.f816d = new A.c(bVarB, clearTokenRequest, 24);
                            kVarB.f815c = 1721;
                            p019g1.i iVarB = bVarB.b(1, kVarB.a());
                            iVarB.b(new p(kVar4));
                            iVarB.a(new p(kVar4));
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
                            v vVar = (v) obj4;
                            Object obj5 = list.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            final k kVar5 = new k(cVar, 0);
                            final s sVar10 = (s) sVar;
                            sVar10.getClass();
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                List list2 = vVar.f522a;
                                String str6 = vVar.f524c;
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(new Scope((String) it2.next(), 1));
                                }
                                M0.r.a("requestedScopes cannot be null or empty", !arrayList2.isEmpty());
                                String str7 = vVar.f523b;
                                if (str7 != null) {
                                    M0.r.d(str7);
                                    str = str7;
                                } else {
                                    str = null;
                                }
                                String str8 = vVar.f525d;
                                if (str8 != null) {
                                    z3 = true;
                                    str2 = str8;
                                } else {
                                    str2 = null;
                                    z3 = false;
                                }
                                p019g1.i iVarC = C0002c.b(sVar10.f513k).c(new AuthorizationRequest(arrayList2, str2, z3, false, str6 != null ? new Account(str6, "com.google") : null, str, null, false, null, false, z3 ? 1 : 0));
                                iVarC.b(new p019g1.d() { // from class: I1.r
                                    @Override // p019g1.d
                                    public final void c(Object obj6) {
                                        F0.a aVar4 = (F0.a) obj6;
                                        s sVar11 = sVar10;
                                        sVar11.getClass();
                                        PendingIntent pendingIntent = aVar4.f298p;
                                        k kVar6 = kVar5;
                                        if (pendingIntent == null) {
                                            p000a.a.o(kVar6, new w(aVar4.f295l, aVar4.n, aVar4.f294k));
                                        } else {
                                            if (!zBooleanValue) {
                                                p000a.a.o(kVar6, new a(b.f471m, null, null));
                                                return;
                                            }
                                            Activity activity2 = sVar11.f516o;
                                            if (activity2 == null) {
                                                p000a.a.o(kVar6, new a(b.f474q, "No activity available", null));
                                                return;
                                            }
                                            try {
                                                sVar11.f517p = kVar6;
                                                activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), 53294, null, 0, 0, 0, null);
                                            } catch (IntentSender.SendIntentException e4) {
                                                sVar11.f517p = null;
                                                p000a.a.o(kVar6, new a(b.f472o, e4.getMessage(), null));
                                            }
                                        }
                                    }
                                });
                                iVarC.a(new B1.d(kVar5, 2));
                                return;
                            } catch (RuntimeException e4) {
                                p000a.a.o(kVar5, new a(b.f473p, e4.getMessage(), "Cause: " + e4.getCause() + ", Stacktrace: " + Log.getStackTraceString(e4)));
                                return;
                            }
                        default:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformRevokeAccessRequest");
                            y yVar = (y) obj6;
                            k kVar6 = new k(cVar, 1);
                            s sVar11 = (s) sVar;
                            sVar11.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = yVar.f536b.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(new Scope((String) it3.next(), 1));
                            }
                            Y0.b bVarB2 = C0002c.b(sVar11.f513k);
                            RevokeAccessRequest revokeAccessRequest = new RevokeAccessRequest(Y0.l.g(arrayList3), new Account(yVar.f535a, "com.google"), null);
                            RevokeAccessRequest revokeAccessRequest2 = new RevokeAccessRequest(revokeAccessRequest.f2676k, revokeAccessRequest.f2677l, bVarB2.f1583k);
                            L0.k kVarB2 = L0.k.b();
                            kVarB2.f813a = new J0.c[]{Y0.f.f1590c};
                            kVarB2.f816d = new A.c(bVarB2, revokeAccessRequest2, 23);
                            kVarB2.f815c = 1721;
                            p019g1.i iVarB2 = bVarB2.b(1, kVarB2.a());
                            iVarB2.b(new q(kVar6));
                            iVarB2.a(new q(kVar6));
                            return;
                    }
                }
            });
        } else {
            sVar6.y(null);
        }
        B1.s sVar7 = new B1.s(fVar, p055t.a.a("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.revokeAccess", StringUtils.EMPTY), a(), aVar);
        if (sVar == null) {
            sVar7.y(null);
        } else {
            final int i8 = 5;
            sVar7.y(new C1.b() { // from class: I1.m
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    String str;
                    String str2;
                    boolean z3;
                    switch (i8) {
                        case 0:
                            try {
                                Context context = ((s) sVar).f513k;
                                int identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
                                listD0 = E2.a.B(identifier != 0 ? context.getString(identifier) : null);
                                break;
                            } catch (Throwable th) {
                                if (th instanceof d) {
                                    d dVar = th;
                                    listD0 = P1.f.d0(dVar.f477k, dVar.f478l, null);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams");
                            h hVar = (h) obj2;
                            k kVar = new k(cVar, 2);
                            s sVar8 = (s) sVar;
                            sVar8.getClass();
                            try {
                                String str3 = hVar.f496c;
                                if (str3 != null && !str3.isEmpty()) {
                                    Activity activity = sVar8.f516o;
                                    if (activity == null) {
                                        p000a.a.o(kVar, new e(f.f484o, "No activity available", null));
                                        return;
                                    }
                                    String str4 = hVar.f498e;
                                    String str5 = hVar.f497d;
                                    ArrayList arrayList = new ArrayList();
                                    if (hVar.f494a) {
                                        if (str5 == null) {
                                            str5 = null;
                                        }
                                        arrayList.add(new p023h1.b(str3, str5, str4 != null ? str4 : null));
                                    } else {
                                        g gVar = hVar.f495b;
                                        boolean z4 = gVar.f492a;
                                        boolean z5 = gVar.f493b;
                                        if (str3.length() <= 0) {
                                            throw new IllegalArgumentException("serverClientId should not be empty");
                                        }
                                        arrayList.add(new p023h1.a(str3, str4 != null ? str4 : null, z4, z5));
                                    }
                                    a2.h.e(sVar8.f513k, "context");
                                    H.k kVar2 = new H.k(P1.e.l0(arrayList));
                                    ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                                    A.c cVar2 = new A.c(sVar8, kVar, 16, false);
                                    a2.h.e(executorServiceNewSingleThreadExecutor, "executor");
                                    H.e eVarB = H.f.b(new H.f((Context) activity), kVar2);
                                    if (eVarB == null) {
                                        cVar2.b(new I.h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                                        return;
                                    } else {
                                        eVarB.onGetCredential(activity, kVar2, null, executorServiceNewSingleThreadExecutor, cVar2);
                                        return;
                                    }
                                }
                                p000a.a.o(kVar, new e(f.n, "CredentialManager requires a serverClientId.", null));
                                return;
                            } catch (RuntimeException e3) {
                                p000a.a.o(kVar, new e(f.u, e3.getMessage(), "Cause: " + e3.getCause() + ", Stacktrace: " + Log.getStackTraceString(e3)));
                                return;
                            }
                        case 2:
                            k kVar3 = new k(cVar, 3);
                            s sVar9 = (s) sVar;
                            C0002c c0002c = sVar9.f514l;
                            Context context2 = sVar9.f513k;
                            a2.h.e(context2, "context");
                            H.a aVar2 = new H.a();
                            new Bundle();
                            ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
                            B1.a aVar3 = new B1.a(kVar3, 9);
                            a2.h.e(executorServiceNewSingleThreadExecutor2, "executor");
                            H.e eVarB2 = H.f.b(new H.f(context2), "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE");
                            if (eVarB2 == null) {
                                aVar3.b(new I.a());
                                return;
                            } else {
                                eVarB2.onClearCredential(aVar2, null, executorServiceNewSingleThreadExecutor2, aVar3);
                                return;
                            }
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            k kVar4 = new k(cVar, 4);
                            s sVar10 = (s) sVar;
                            C0002c c0002c2 = sVar10.f515m;
                            Y0.b bVarB = C0002c.b(sVar10.f513k);
                            ClearTokenRequest clearTokenRequest = new ClearTokenRequest((String) obj3, bVarB.f1583k);
                            L0.k kVarB = L0.k.b();
                            kVarB.f813a = new J0.c[]{Y0.f.f1591d};
                            kVarB.f816d = new A.c(bVarB, clearTokenRequest, 24);
                            kVarB.f815c = 1721;
                            p019g1.i iVarB = bVarB.b(1, kVarB.a());
                            iVarB.b(new p(kVar4));
                            iVarB.a(new p(kVar4));
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
                            v vVar = (v) obj4;
                            Object obj5 = list.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            final k kVar5 = new k(cVar, 0);
                            final s sVar11 = (s) sVar;
                            sVar11.getClass();
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                List list2 = vVar.f522a;
                                String str6 = vVar.f524c;
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(new Scope((String) it2.next(), 1));
                                }
                                M0.r.a("requestedScopes cannot be null or empty", !arrayList2.isEmpty());
                                String str7 = vVar.f523b;
                                if (str7 != null) {
                                    M0.r.d(str7);
                                    str = str7;
                                } else {
                                    str = null;
                                }
                                String str8 = vVar.f525d;
                                if (str8 != null) {
                                    z3 = true;
                                    str2 = str8;
                                } else {
                                    str2 = null;
                                    z3 = false;
                                }
                                p019g1.i iVarC = C0002c.b(sVar11.f513k).c(new AuthorizationRequest(arrayList2, str2, z3, false, str6 != null ? new Account(str6, "com.google") : null, str, null, false, null, false, z3 ? 1 : 0));
                                iVarC.b(new p019g1.d() { // from class: I1.r
                                    @Override // p019g1.d
                                    public final void c(Object obj6) {
                                        F0.a aVar4 = (F0.a) obj6;
                                        s sVar12 = sVar11;
                                        sVar12.getClass();
                                        PendingIntent pendingIntent = aVar4.f298p;
                                        k kVar6 = kVar5;
                                        if (pendingIntent == null) {
                                            p000a.a.o(kVar6, new w(aVar4.f295l, aVar4.n, aVar4.f294k));
                                        } else {
                                            if (!zBooleanValue) {
                                                p000a.a.o(kVar6, new a(b.f471m, null, null));
                                                return;
                                            }
                                            Activity activity2 = sVar12.f516o;
                                            if (activity2 == null) {
                                                p000a.a.o(kVar6, new a(b.f474q, "No activity available", null));
                                                return;
                                            }
                                            try {
                                                sVar12.f517p = kVar6;
                                                activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), 53294, null, 0, 0, 0, null);
                                            } catch (IntentSender.SendIntentException e4) {
                                                sVar12.f517p = null;
                                                p000a.a.o(kVar6, new a(b.f472o, e4.getMessage(), null));
                                            }
                                        }
                                    }
                                });
                                iVarC.a(new B1.d(kVar5, 2));
                                return;
                            } catch (RuntimeException e4) {
                                p000a.a.o(kVar5, new a(b.f473p, e4.getMessage(), "Cause: " + e4.getCause() + ", Stacktrace: " + Log.getStackTraceString(e4)));
                                return;
                            }
                        default:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformRevokeAccessRequest");
                            y yVar = (y) obj6;
                            k kVar6 = new k(cVar, 1);
                            s sVar12 = (s) sVar;
                            sVar12.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = yVar.f536b.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(new Scope((String) it3.next(), 1));
                            }
                            Y0.b bVarB2 = C0002c.b(sVar12.f513k);
                            RevokeAccessRequest revokeAccessRequest = new RevokeAccessRequest(Y0.l.g(arrayList3), new Account(yVar.f535a, "com.google"), null);
                            RevokeAccessRequest revokeAccessRequest2 = new RevokeAccessRequest(revokeAccessRequest.f2676k, revokeAccessRequest.f2677l, bVarB2.f1583k);
                            L0.k kVarB2 = L0.k.b();
                            kVarB2.f813a = new J0.c[]{Y0.f.f1590c};
                            kVarB2.f816d = new A.c(bVarB2, revokeAccessRequest2, 23);
                            kVarB2.f815c = 1721;
                            p019g1.i iVarB2 = bVarB2.b(1, kVarB2.a());
                            iVarB2.b(new q(kVar6));
                            iVarB2.a(new q(kVar6));
                            return;
                    }
                }
            });
        }
    }
}
