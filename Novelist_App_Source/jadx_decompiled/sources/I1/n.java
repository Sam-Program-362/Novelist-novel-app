package I1;

import D.C0002c;
import a.AbstractC0102a;
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
import h1.C0269a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.tika.utils.StringUtils;
import t.AbstractC0468a;
import t1.C0473a;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ n f505a = new n();

    /* renamed from: b, reason: collision with root package name */
    public static final O1.e f506b = new O1.e(new l(0));

    public static C1.l a() {
        return (C1.l) f506b.a();
    }

    public static void b(C1.f fVar, final s sVar) {
        a2.h.e(fVar, "binaryMessenger");
        C0473a c0473a = null;
        B1.s sVar2 = new B1.s(fVar, AbstractC0468a.a("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getGoogleServicesJsonServerClientId", StringUtils.EMPTY), a(), c0473a);
        if (sVar != null) {
            final int i3 = 0;
            sVar2.y(new C1.b() { // from class: I1.m
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    String str;
                    String str2;
                    boolean z3;
                    switch (i3) {
                        case 0:
                            try {
                                Context context = ((s) sVar).f513k;
                                int identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
                                d02 = E2.a.B(identifier != 0 ? context.getString(identifier) : null);
                            } catch (Throwable th) {
                                if (th instanceof d) {
                                    d dVar = th;
                                    d02 = P1.f.d0(dVar.f477k, dVar.f478l, null);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                                        AbstractC0102a.o(kVar, new e(f.f484o, "No activity available", null));
                                        return;
                                    }
                                    String str4 = hVar.f498e;
                                    String str5 = hVar.f497d;
                                    ArrayList arrayList = new ArrayList();
                                    if (hVar.f494a) {
                                        if (str5 == null) {
                                            str5 = null;
                                        }
                                        arrayList.add(new h1.b(str3, str5, str4 != null ? str4 : null));
                                    } else {
                                        g gVar = hVar.f495b;
                                        boolean z4 = gVar.f492a;
                                        boolean z5 = gVar.f493b;
                                        if (str3.length() <= 0) {
                                            throw new IllegalArgumentException("serverClientId should not be empty");
                                        }
                                        arrayList.add(new C0269a(str3, str4 != null ? str4 : null, z4, z5));
                                    }
                                    a2.h.e(sVar3.f513k, "context");
                                    H.k kVar2 = new H.k(P1.e.l0(arrayList));
                                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                                    A.c cVar2 = new A.c(sVar3, kVar, 16, false);
                                    a2.h.e(newSingleThreadExecutor, "executor");
                                    H.e b3 = H.f.b(new H.f((Context) activity), kVar2);
                                    if (b3 == null) {
                                        cVar2.b(new I.h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                                        return;
                                    } else {
                                        b3.onGetCredential(activity, kVar2, null, newSingleThreadExecutor, cVar2);
                                        return;
                                    }
                                }
                                AbstractC0102a.o(kVar, new e(f.n, "CredentialManager requires a serverClientId.", null));
                                return;
                            } catch (RuntimeException e3) {
                                AbstractC0102a.o(kVar, new e(f.u, e3.getMessage(), "Cause: " + e3.getCause() + ", Stacktrace: " + Log.getStackTraceString(e3)));
                                return;
                            }
                        case 2:
                            k kVar3 = new k(cVar, 3);
                            s sVar4 = (s) sVar;
                            C0002c c0002c = sVar4.f514l;
                            Context context2 = sVar4.f513k;
                            a2.h.e(context2, "context");
                            H.a aVar = new H.a();
                            new Bundle();
                            ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
                            B1.a aVar2 = new B1.a(kVar3, 9);
                            a2.h.e(newSingleThreadExecutor2, "executor");
                            H.e b4 = H.f.b(new H.f(context2), "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE");
                            if (b4 == null) {
                                aVar2.b(new I.a());
                                return;
                            } else {
                                b4.onClearCredential(aVar, null, newSingleThreadExecutor2, aVar2);
                                return;
                            }
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            k kVar4 = new k(cVar, 4);
                            s sVar5 = (s) sVar;
                            C0002c c0002c2 = sVar5.f515m;
                            Y0.b b5 = C0002c.b(sVar5.f513k);
                            ClearTokenRequest clearTokenRequest = new ClearTokenRequest((String) obj3, b5.f1583k);
                            L0.k b6 = L0.k.b();
                            b6.f813a = new J0.c[]{Y0.f.f1591d};
                            b6.f816d = new A.c(b5, clearTokenRequest, 24);
                            b6.f815c = 1721;
                            g1.i b7 = b5.b(1, b6.a());
                            b7.b(new p(kVar4));
                            b7.a(new p(kVar4));
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
                            v vVar = (v) obj4;
                            Object obj5 = list.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean booleanValue = ((Boolean) obj5).booleanValue();
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
                                g1.i c3 = C0002c.b(sVar6.f513k).c(new AuthorizationRequest(arrayList2, str2, z3, false, str6 != null ? new Account(str6, "com.google") : null, str, null, false, null, false, z3 ? 1 : 0));
                                c3.b(new g1.d() { // from class: I1.r
                                    @Override // g1.d
                                    public final void c(Object obj6) {
                                        F0.a aVar3 = (F0.a) obj6;
                                        s sVar7 = s.this;
                                        sVar7.getClass();
                                        PendingIntent pendingIntent = aVar3.f298p;
                                        k kVar6 = kVar5;
                                        if (pendingIntent == null) {
                                            AbstractC0102a.o(kVar6, new w(aVar3.f295l, aVar3.n, aVar3.f294k));
                                        } else {
                                            if (!booleanValue) {
                                                AbstractC0102a.o(kVar6, new a(b.f471m, null, null));
                                                return;
                                            }
                                            Activity activity2 = sVar7.f516o;
                                            if (activity2 == null) {
                                                AbstractC0102a.o(kVar6, new a(b.f474q, "No activity available", null));
                                                return;
                                            }
                                            try {
                                                sVar7.f517p = kVar6;
                                                activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), 53294, null, 0, 0, 0, null);
                                            } catch (IntentSender.SendIntentException e4) {
                                                sVar7.f517p = null;
                                                AbstractC0102a.o(kVar6, new a(b.f472o, e4.getMessage(), null));
                                            }
                                        }
                                    }
                                });
                                c3.a(new B1.d(kVar5, 2));
                                return;
                            } catch (RuntimeException e4) {
                                AbstractC0102a.o(kVar5, new a(b.f473p, e4.getMessage(), "Cause: " + e4.getCause() + ", Stacktrace: " + Log.getStackTraceString(e4)));
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
                            Y0.b b8 = C0002c.b(sVar7.f513k);
                            RevokeAccessRequest revokeAccessRequest = new RevokeAccessRequest(Y0.l.g(arrayList3), new Account(yVar.f535a, "com.google"), null);
                            RevokeAccessRequest revokeAccessRequest2 = new RevokeAccessRequest(revokeAccessRequest.f2676k, revokeAccessRequest.f2677l, b8.f1583k);
                            L0.k b9 = L0.k.b();
                            b9.f813a = new J0.c[]{Y0.f.f1590c};
                            b9.f816d = new A.c(b8, revokeAccessRequest2, 23);
                            b9.f815c = 1721;
                            g1.i b10 = b8.b(1, b9.a());
                            b10.b(new q(kVar6));
                            b10.a(new q(kVar6));
                            return;
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        B1.s sVar3 = new B1.s(fVar, AbstractC0468a.a("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getCredential", StringUtils.EMPTY), a(), c0473a);
        if (sVar != null) {
            final int i4 = 1;
            sVar3.y(new C1.b() { // from class: I1.m
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    String str;
                    String str2;
                    boolean z3;
                    switch (i4) {
                        case 0:
                            try {
                                Context context = ((s) sVar).f513k;
                                int identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
                                d02 = E2.a.B(identifier != 0 ? context.getString(identifier) : null);
                            } catch (Throwable th) {
                                if (th instanceof d) {
                                    d dVar = th;
                                    d02 = P1.f.d0(dVar.f477k, dVar.f478l, null);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams");
                            h hVar = (h) obj2;
                            k kVar = new k(cVar, 2);
                            s sVar32 = (s) sVar;
                            sVar32.getClass();
                            try {
                                String str3 = hVar.f496c;
                                if (str3 != null && !str3.isEmpty()) {
                                    Activity activity = sVar32.f516o;
                                    if (activity == null) {
                                        AbstractC0102a.o(kVar, new e(f.f484o, "No activity available", null));
                                        return;
                                    }
                                    String str4 = hVar.f498e;
                                    String str5 = hVar.f497d;
                                    ArrayList arrayList = new ArrayList();
                                    if (hVar.f494a) {
                                        if (str5 == null) {
                                            str5 = null;
                                        }
                                        arrayList.add(new h1.b(str3, str5, str4 != null ? str4 : null));
                                    } else {
                                        g gVar = hVar.f495b;
                                        boolean z4 = gVar.f492a;
                                        boolean z5 = gVar.f493b;
                                        if (str3.length() <= 0) {
                                            throw new IllegalArgumentException("serverClientId should not be empty");
                                        }
                                        arrayList.add(new C0269a(str3, str4 != null ? str4 : null, z4, z5));
                                    }
                                    a2.h.e(sVar32.f513k, "context");
                                    H.k kVar2 = new H.k(P1.e.l0(arrayList));
                                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                                    A.c cVar2 = new A.c(sVar32, kVar, 16, false);
                                    a2.h.e(newSingleThreadExecutor, "executor");
                                    H.e b3 = H.f.b(new H.f((Context) activity), kVar2);
                                    if (b3 == null) {
                                        cVar2.b(new I.h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                                        return;
                                    } else {
                                        b3.onGetCredential(activity, kVar2, null, newSingleThreadExecutor, cVar2);
                                        return;
                                    }
                                }
                                AbstractC0102a.o(kVar, new e(f.n, "CredentialManager requires a serverClientId.", null));
                                return;
                            } catch (RuntimeException e3) {
                                AbstractC0102a.o(kVar, new e(f.u, e3.getMessage(), "Cause: " + e3.getCause() + ", Stacktrace: " + Log.getStackTraceString(e3)));
                                return;
                            }
                        case 2:
                            k kVar3 = new k(cVar, 3);
                            s sVar4 = (s) sVar;
                            C0002c c0002c = sVar4.f514l;
                            Context context2 = sVar4.f513k;
                            a2.h.e(context2, "context");
                            H.a aVar = new H.a();
                            new Bundle();
                            ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
                            B1.a aVar2 = new B1.a(kVar3, 9);
                            a2.h.e(newSingleThreadExecutor2, "executor");
                            H.e b4 = H.f.b(new H.f(context2), "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE");
                            if (b4 == null) {
                                aVar2.b(new I.a());
                                return;
                            } else {
                                b4.onClearCredential(aVar, null, newSingleThreadExecutor2, aVar2);
                                return;
                            }
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            k kVar4 = new k(cVar, 4);
                            s sVar5 = (s) sVar;
                            C0002c c0002c2 = sVar5.f515m;
                            Y0.b b5 = C0002c.b(sVar5.f513k);
                            ClearTokenRequest clearTokenRequest = new ClearTokenRequest((String) obj3, b5.f1583k);
                            L0.k b6 = L0.k.b();
                            b6.f813a = new J0.c[]{Y0.f.f1591d};
                            b6.f816d = new A.c(b5, clearTokenRequest, 24);
                            b6.f815c = 1721;
                            g1.i b7 = b5.b(1, b6.a());
                            b7.b(new p(kVar4));
                            b7.a(new p(kVar4));
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
                            v vVar = (v) obj4;
                            Object obj5 = list.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean booleanValue = ((Boolean) obj5).booleanValue();
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
                                g1.i c3 = C0002c.b(sVar6.f513k).c(new AuthorizationRequest(arrayList2, str2, z3, false, str6 != null ? new Account(str6, "com.google") : null, str, null, false, null, false, z3 ? 1 : 0));
                                c3.b(new g1.d() { // from class: I1.r
                                    @Override // g1.d
                                    public final void c(Object obj6) {
                                        F0.a aVar3 = (F0.a) obj6;
                                        s sVar7 = s.this;
                                        sVar7.getClass();
                                        PendingIntent pendingIntent = aVar3.f298p;
                                        k kVar6 = kVar5;
                                        if (pendingIntent == null) {
                                            AbstractC0102a.o(kVar6, new w(aVar3.f295l, aVar3.n, aVar3.f294k));
                                        } else {
                                            if (!booleanValue) {
                                                AbstractC0102a.o(kVar6, new a(b.f471m, null, null));
                                                return;
                                            }
                                            Activity activity2 = sVar7.f516o;
                                            if (activity2 == null) {
                                                AbstractC0102a.o(kVar6, new a(b.f474q, "No activity available", null));
                                                return;
                                            }
                                            try {
                                                sVar7.f517p = kVar6;
                                                activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), 53294, null, 0, 0, 0, null);
                                            } catch (IntentSender.SendIntentException e4) {
                                                sVar7.f517p = null;
                                                AbstractC0102a.o(kVar6, new a(b.f472o, e4.getMessage(), null));
                                            }
                                        }
                                    }
                                });
                                c3.a(new B1.d(kVar5, 2));
                                return;
                            } catch (RuntimeException e4) {
                                AbstractC0102a.o(kVar5, new a(b.f473p, e4.getMessage(), "Cause: " + e4.getCause() + ", Stacktrace: " + Log.getStackTraceString(e4)));
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
                            Y0.b b8 = C0002c.b(sVar7.f513k);
                            RevokeAccessRequest revokeAccessRequest = new RevokeAccessRequest(Y0.l.g(arrayList3), new Account(yVar.f535a, "com.google"), null);
                            RevokeAccessRequest revokeAccessRequest2 = new RevokeAccessRequest(revokeAccessRequest.f2676k, revokeAccessRequest.f2677l, b8.f1583k);
                            L0.k b9 = L0.k.b();
                            b9.f813a = new J0.c[]{Y0.f.f1590c};
                            b9.f816d = new A.c(b8, revokeAccessRequest2, 23);
                            b9.f815c = 1721;
                            g1.i b10 = b8.b(1, b9.a());
                            b10.b(new q(kVar6));
                            b10.a(new q(kVar6));
                            return;
                    }
                }
            });
        } else {
            sVar3.y(null);
        }
        B1.s sVar4 = new B1.s(fVar, AbstractC0468a.a("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearCredentialState", StringUtils.EMPTY), a(), c0473a);
        if (sVar != null) {
            final int i5 = 2;
            sVar4.y(new C1.b() { // from class: I1.m
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    String str;
                    String str2;
                    boolean z3;
                    switch (i5) {
                        case 0:
                            try {
                                Context context = ((s) sVar).f513k;
                                int identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
                                d02 = E2.a.B(identifier != 0 ? context.getString(identifier) : null);
                            } catch (Throwable th) {
                                if (th instanceof d) {
                                    d dVar = th;
                                    d02 = P1.f.d0(dVar.f477k, dVar.f478l, null);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams");
                            h hVar = (h) obj2;
                            k kVar = new k(cVar, 2);
                            s sVar32 = (s) sVar;
                            sVar32.getClass();
                            try {
                                String str3 = hVar.f496c;
                                if (str3 != null && !str3.isEmpty()) {
                                    Activity activity = sVar32.f516o;
                                    if (activity == null) {
                                        AbstractC0102a.o(kVar, new e(f.f484o, "No activity available", null));
                                        return;
                                    }
                                    String str4 = hVar.f498e;
                                    String str5 = hVar.f497d;
                                    ArrayList arrayList = new ArrayList();
                                    if (hVar.f494a) {
                                        if (str5 == null) {
                                            str5 = null;
                                        }
                                        arrayList.add(new h1.b(str3, str5, str4 != null ? str4 : null));
                                    } else {
                                        g gVar = hVar.f495b;
                                        boolean z4 = gVar.f492a;
                                        boolean z5 = gVar.f493b;
                                        if (str3.length() <= 0) {
                                            throw new IllegalArgumentException("serverClientId should not be empty");
                                        }
                                        arrayList.add(new C0269a(str3, str4 != null ? str4 : null, z4, z5));
                                    }
                                    a2.h.e(sVar32.f513k, "context");
                                    H.k kVar2 = new H.k(P1.e.l0(arrayList));
                                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                                    A.c cVar2 = new A.c(sVar32, kVar, 16, false);
                                    a2.h.e(newSingleThreadExecutor, "executor");
                                    H.e b3 = H.f.b(new H.f((Context) activity), kVar2);
                                    if (b3 == null) {
                                        cVar2.b(new I.h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                                        return;
                                    } else {
                                        b3.onGetCredential(activity, kVar2, null, newSingleThreadExecutor, cVar2);
                                        return;
                                    }
                                }
                                AbstractC0102a.o(kVar, new e(f.n, "CredentialManager requires a serverClientId.", null));
                                return;
                            } catch (RuntimeException e3) {
                                AbstractC0102a.o(kVar, new e(f.u, e3.getMessage(), "Cause: " + e3.getCause() + ", Stacktrace: " + Log.getStackTraceString(e3)));
                                return;
                            }
                        case 2:
                            k kVar3 = new k(cVar, 3);
                            s sVar42 = (s) sVar;
                            C0002c c0002c = sVar42.f514l;
                            Context context2 = sVar42.f513k;
                            a2.h.e(context2, "context");
                            H.a aVar = new H.a();
                            new Bundle();
                            ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
                            B1.a aVar2 = new B1.a(kVar3, 9);
                            a2.h.e(newSingleThreadExecutor2, "executor");
                            H.e b4 = H.f.b(new H.f(context2), "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE");
                            if (b4 == null) {
                                aVar2.b(new I.a());
                                return;
                            } else {
                                b4.onClearCredential(aVar, null, newSingleThreadExecutor2, aVar2);
                                return;
                            }
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            k kVar4 = new k(cVar, 4);
                            s sVar5 = (s) sVar;
                            C0002c c0002c2 = sVar5.f515m;
                            Y0.b b5 = C0002c.b(sVar5.f513k);
                            ClearTokenRequest clearTokenRequest = new ClearTokenRequest((String) obj3, b5.f1583k);
                            L0.k b6 = L0.k.b();
                            b6.f813a = new J0.c[]{Y0.f.f1591d};
                            b6.f816d = new A.c(b5, clearTokenRequest, 24);
                            b6.f815c = 1721;
                            g1.i b7 = b5.b(1, b6.a());
                            b7.b(new p(kVar4));
                            b7.a(new p(kVar4));
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
                            v vVar = (v) obj4;
                            Object obj5 = list.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean booleanValue = ((Boolean) obj5).booleanValue();
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
                                g1.i c3 = C0002c.b(sVar6.f513k).c(new AuthorizationRequest(arrayList2, str2, z3, false, str6 != null ? new Account(str6, "com.google") : null, str, null, false, null, false, z3 ? 1 : 0));
                                c3.b(new g1.d() { // from class: I1.r
                                    @Override // g1.d
                                    public final void c(Object obj6) {
                                        F0.a aVar3 = (F0.a) obj6;
                                        s sVar7 = s.this;
                                        sVar7.getClass();
                                        PendingIntent pendingIntent = aVar3.f298p;
                                        k kVar6 = kVar5;
                                        if (pendingIntent == null) {
                                            AbstractC0102a.o(kVar6, new w(aVar3.f295l, aVar3.n, aVar3.f294k));
                                        } else {
                                            if (!booleanValue) {
                                                AbstractC0102a.o(kVar6, new a(b.f471m, null, null));
                                                return;
                                            }
                                            Activity activity2 = sVar7.f516o;
                                            if (activity2 == null) {
                                                AbstractC0102a.o(kVar6, new a(b.f474q, "No activity available", null));
                                                return;
                                            }
                                            try {
                                                sVar7.f517p = kVar6;
                                                activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), 53294, null, 0, 0, 0, null);
                                            } catch (IntentSender.SendIntentException e4) {
                                                sVar7.f517p = null;
                                                AbstractC0102a.o(kVar6, new a(b.f472o, e4.getMessage(), null));
                                            }
                                        }
                                    }
                                });
                                c3.a(new B1.d(kVar5, 2));
                                return;
                            } catch (RuntimeException e4) {
                                AbstractC0102a.o(kVar5, new a(b.f473p, e4.getMessage(), "Cause: " + e4.getCause() + ", Stacktrace: " + Log.getStackTraceString(e4)));
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
                            Y0.b b8 = C0002c.b(sVar7.f513k);
                            RevokeAccessRequest revokeAccessRequest = new RevokeAccessRequest(Y0.l.g(arrayList3), new Account(yVar.f535a, "com.google"), null);
                            RevokeAccessRequest revokeAccessRequest2 = new RevokeAccessRequest(revokeAccessRequest.f2676k, revokeAccessRequest.f2677l, b8.f1583k);
                            L0.k b9 = L0.k.b();
                            b9.f813a = new J0.c[]{Y0.f.f1590c};
                            b9.f816d = new A.c(b8, revokeAccessRequest2, 23);
                            b9.f815c = 1721;
                            g1.i b10 = b8.b(1, b9.a());
                            b10.b(new q(kVar6));
                            b10.a(new q(kVar6));
                            return;
                    }
                }
            });
        } else {
            sVar4.y(null);
        }
        B1.s sVar5 = new B1.s(fVar, AbstractC0468a.a("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearAuthorizationToken", StringUtils.EMPTY), a(), c0473a);
        if (sVar != null) {
            final int i6 = 3;
            sVar5.y(new C1.b() { // from class: I1.m
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    String str;
                    String str2;
                    boolean z3;
                    switch (i6) {
                        case 0:
                            try {
                                Context context = ((s) sVar).f513k;
                                int identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
                                d02 = E2.a.B(identifier != 0 ? context.getString(identifier) : null);
                            } catch (Throwable th) {
                                if (th instanceof d) {
                                    d dVar = th;
                                    d02 = P1.f.d0(dVar.f477k, dVar.f478l, null);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams");
                            h hVar = (h) obj2;
                            k kVar = new k(cVar, 2);
                            s sVar32 = (s) sVar;
                            sVar32.getClass();
                            try {
                                String str3 = hVar.f496c;
                                if (str3 != null && !str3.isEmpty()) {
                                    Activity activity = sVar32.f516o;
                                    if (activity == null) {
                                        AbstractC0102a.o(kVar, new e(f.f484o, "No activity available", null));
                                        return;
                                    }
                                    String str4 = hVar.f498e;
                                    String str5 = hVar.f497d;
                                    ArrayList arrayList = new ArrayList();
                                    if (hVar.f494a) {
                                        if (str5 == null) {
                                            str5 = null;
                                        }
                                        arrayList.add(new h1.b(str3, str5, str4 != null ? str4 : null));
                                    } else {
                                        g gVar = hVar.f495b;
                                        boolean z4 = gVar.f492a;
                                        boolean z5 = gVar.f493b;
                                        if (str3.length() <= 0) {
                                            throw new IllegalArgumentException("serverClientId should not be empty");
                                        }
                                        arrayList.add(new C0269a(str3, str4 != null ? str4 : null, z4, z5));
                                    }
                                    a2.h.e(sVar32.f513k, "context");
                                    H.k kVar2 = new H.k(P1.e.l0(arrayList));
                                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                                    A.c cVar2 = new A.c(sVar32, kVar, 16, false);
                                    a2.h.e(newSingleThreadExecutor, "executor");
                                    H.e b3 = H.f.b(new H.f((Context) activity), kVar2);
                                    if (b3 == null) {
                                        cVar2.b(new I.h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                                        return;
                                    } else {
                                        b3.onGetCredential(activity, kVar2, null, newSingleThreadExecutor, cVar2);
                                        return;
                                    }
                                }
                                AbstractC0102a.o(kVar, new e(f.n, "CredentialManager requires a serverClientId.", null));
                                return;
                            } catch (RuntimeException e3) {
                                AbstractC0102a.o(kVar, new e(f.u, e3.getMessage(), "Cause: " + e3.getCause() + ", Stacktrace: " + Log.getStackTraceString(e3)));
                                return;
                            }
                        case 2:
                            k kVar3 = new k(cVar, 3);
                            s sVar42 = (s) sVar;
                            C0002c c0002c = sVar42.f514l;
                            Context context2 = sVar42.f513k;
                            a2.h.e(context2, "context");
                            H.a aVar = new H.a();
                            new Bundle();
                            ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
                            B1.a aVar2 = new B1.a(kVar3, 9);
                            a2.h.e(newSingleThreadExecutor2, "executor");
                            H.e b4 = H.f.b(new H.f(context2), "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE");
                            if (b4 == null) {
                                aVar2.b(new I.a());
                                return;
                            } else {
                                b4.onClearCredential(aVar, null, newSingleThreadExecutor2, aVar2);
                                return;
                            }
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            k kVar4 = new k(cVar, 4);
                            s sVar52 = (s) sVar;
                            C0002c c0002c2 = sVar52.f515m;
                            Y0.b b5 = C0002c.b(sVar52.f513k);
                            ClearTokenRequest clearTokenRequest = new ClearTokenRequest((String) obj3, b5.f1583k);
                            L0.k b6 = L0.k.b();
                            b6.f813a = new J0.c[]{Y0.f.f1591d};
                            b6.f816d = new A.c(b5, clearTokenRequest, 24);
                            b6.f815c = 1721;
                            g1.i b7 = b5.b(1, b6.a());
                            b7.b(new p(kVar4));
                            b7.a(new p(kVar4));
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
                            v vVar = (v) obj4;
                            Object obj5 = list.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean booleanValue = ((Boolean) obj5).booleanValue();
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
                                g1.i c3 = C0002c.b(sVar6.f513k).c(new AuthorizationRequest(arrayList2, str2, z3, false, str6 != null ? new Account(str6, "com.google") : null, str, null, false, null, false, z3 ? 1 : 0));
                                c3.b(new g1.d() { // from class: I1.r
                                    @Override // g1.d
                                    public final void c(Object obj6) {
                                        F0.a aVar3 = (F0.a) obj6;
                                        s sVar7 = s.this;
                                        sVar7.getClass();
                                        PendingIntent pendingIntent = aVar3.f298p;
                                        k kVar6 = kVar5;
                                        if (pendingIntent == null) {
                                            AbstractC0102a.o(kVar6, new w(aVar3.f295l, aVar3.n, aVar3.f294k));
                                        } else {
                                            if (!booleanValue) {
                                                AbstractC0102a.o(kVar6, new a(b.f471m, null, null));
                                                return;
                                            }
                                            Activity activity2 = sVar7.f516o;
                                            if (activity2 == null) {
                                                AbstractC0102a.o(kVar6, new a(b.f474q, "No activity available", null));
                                                return;
                                            }
                                            try {
                                                sVar7.f517p = kVar6;
                                                activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), 53294, null, 0, 0, 0, null);
                                            } catch (IntentSender.SendIntentException e4) {
                                                sVar7.f517p = null;
                                                AbstractC0102a.o(kVar6, new a(b.f472o, e4.getMessage(), null));
                                            }
                                        }
                                    }
                                });
                                c3.a(new B1.d(kVar5, 2));
                                return;
                            } catch (RuntimeException e4) {
                                AbstractC0102a.o(kVar5, new a(b.f473p, e4.getMessage(), "Cause: " + e4.getCause() + ", Stacktrace: " + Log.getStackTraceString(e4)));
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
                            Y0.b b8 = C0002c.b(sVar7.f513k);
                            RevokeAccessRequest revokeAccessRequest = new RevokeAccessRequest(Y0.l.g(arrayList3), new Account(yVar.f535a, "com.google"), null);
                            RevokeAccessRequest revokeAccessRequest2 = new RevokeAccessRequest(revokeAccessRequest.f2676k, revokeAccessRequest.f2677l, b8.f1583k);
                            L0.k b9 = L0.k.b();
                            b9.f813a = new J0.c[]{Y0.f.f1590c};
                            b9.f816d = new A.c(b8, revokeAccessRequest2, 23);
                            b9.f815c = 1721;
                            g1.i b10 = b8.b(1, b9.a());
                            b10.b(new q(kVar6));
                            b10.a(new q(kVar6));
                            return;
                    }
                }
            });
        } else {
            sVar5.y(null);
        }
        B1.s sVar6 = new B1.s(fVar, AbstractC0468a.a("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.authorize", StringUtils.EMPTY), a(), c0473a);
        if (sVar != null) {
            final int i7 = 4;
            sVar6.y(new C1.b() { // from class: I1.m
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    String str;
                    String str2;
                    boolean z3;
                    switch (i7) {
                        case 0:
                            try {
                                Context context = ((s) sVar).f513k;
                                int identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
                                d02 = E2.a.B(identifier != 0 ? context.getString(identifier) : null);
                            } catch (Throwable th) {
                                if (th instanceof d) {
                                    d dVar = th;
                                    d02 = P1.f.d0(dVar.f477k, dVar.f478l, null);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams");
                            h hVar = (h) obj2;
                            k kVar = new k(cVar, 2);
                            s sVar32 = (s) sVar;
                            sVar32.getClass();
                            try {
                                String str3 = hVar.f496c;
                                if (str3 != null && !str3.isEmpty()) {
                                    Activity activity = sVar32.f516o;
                                    if (activity == null) {
                                        AbstractC0102a.o(kVar, new e(f.f484o, "No activity available", null));
                                        return;
                                    }
                                    String str4 = hVar.f498e;
                                    String str5 = hVar.f497d;
                                    ArrayList arrayList = new ArrayList();
                                    if (hVar.f494a) {
                                        if (str5 == null) {
                                            str5 = null;
                                        }
                                        arrayList.add(new h1.b(str3, str5, str4 != null ? str4 : null));
                                    } else {
                                        g gVar = hVar.f495b;
                                        boolean z4 = gVar.f492a;
                                        boolean z5 = gVar.f493b;
                                        if (str3.length() <= 0) {
                                            throw new IllegalArgumentException("serverClientId should not be empty");
                                        }
                                        arrayList.add(new C0269a(str3, str4 != null ? str4 : null, z4, z5));
                                    }
                                    a2.h.e(sVar32.f513k, "context");
                                    H.k kVar2 = new H.k(P1.e.l0(arrayList));
                                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                                    A.c cVar2 = new A.c(sVar32, kVar, 16, false);
                                    a2.h.e(newSingleThreadExecutor, "executor");
                                    H.e b3 = H.f.b(new H.f((Context) activity), kVar2);
                                    if (b3 == null) {
                                        cVar2.b(new I.h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                                        return;
                                    } else {
                                        b3.onGetCredential(activity, kVar2, null, newSingleThreadExecutor, cVar2);
                                        return;
                                    }
                                }
                                AbstractC0102a.o(kVar, new e(f.n, "CredentialManager requires a serverClientId.", null));
                                return;
                            } catch (RuntimeException e3) {
                                AbstractC0102a.o(kVar, new e(f.u, e3.getMessage(), "Cause: " + e3.getCause() + ", Stacktrace: " + Log.getStackTraceString(e3)));
                                return;
                            }
                        case 2:
                            k kVar3 = new k(cVar, 3);
                            s sVar42 = (s) sVar;
                            C0002c c0002c = sVar42.f514l;
                            Context context2 = sVar42.f513k;
                            a2.h.e(context2, "context");
                            H.a aVar = new H.a();
                            new Bundle();
                            ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
                            B1.a aVar2 = new B1.a(kVar3, 9);
                            a2.h.e(newSingleThreadExecutor2, "executor");
                            H.e b4 = H.f.b(new H.f(context2), "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE");
                            if (b4 == null) {
                                aVar2.b(new I.a());
                                return;
                            } else {
                                b4.onClearCredential(aVar, null, newSingleThreadExecutor2, aVar2);
                                return;
                            }
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            k kVar4 = new k(cVar, 4);
                            s sVar52 = (s) sVar;
                            C0002c c0002c2 = sVar52.f515m;
                            Y0.b b5 = C0002c.b(sVar52.f513k);
                            ClearTokenRequest clearTokenRequest = new ClearTokenRequest((String) obj3, b5.f1583k);
                            L0.k b6 = L0.k.b();
                            b6.f813a = new J0.c[]{Y0.f.f1591d};
                            b6.f816d = new A.c(b5, clearTokenRequest, 24);
                            b6.f815c = 1721;
                            g1.i b7 = b5.b(1, b6.a());
                            b7.b(new p(kVar4));
                            b7.a(new p(kVar4));
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
                            v vVar = (v) obj4;
                            Object obj5 = list.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean booleanValue = ((Boolean) obj5).booleanValue();
                            final k kVar5 = new k(cVar, 0);
                            final s sVar62 = (s) sVar;
                            sVar62.getClass();
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
                                g1.i c3 = C0002c.b(sVar62.f513k).c(new AuthorizationRequest(arrayList2, str2, z3, false, str6 != null ? new Account(str6, "com.google") : null, str, null, false, null, false, z3 ? 1 : 0));
                                c3.b(new g1.d() { // from class: I1.r
                                    @Override // g1.d
                                    public final void c(Object obj6) {
                                        F0.a aVar3 = (F0.a) obj6;
                                        s sVar7 = s.this;
                                        sVar7.getClass();
                                        PendingIntent pendingIntent = aVar3.f298p;
                                        k kVar6 = kVar5;
                                        if (pendingIntent == null) {
                                            AbstractC0102a.o(kVar6, new w(aVar3.f295l, aVar3.n, aVar3.f294k));
                                        } else {
                                            if (!booleanValue) {
                                                AbstractC0102a.o(kVar6, new a(b.f471m, null, null));
                                                return;
                                            }
                                            Activity activity2 = sVar7.f516o;
                                            if (activity2 == null) {
                                                AbstractC0102a.o(kVar6, new a(b.f474q, "No activity available", null));
                                                return;
                                            }
                                            try {
                                                sVar7.f517p = kVar6;
                                                activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), 53294, null, 0, 0, 0, null);
                                            } catch (IntentSender.SendIntentException e4) {
                                                sVar7.f517p = null;
                                                AbstractC0102a.o(kVar6, new a(b.f472o, e4.getMessage(), null));
                                            }
                                        }
                                    }
                                });
                                c3.a(new B1.d(kVar5, 2));
                                return;
                            } catch (RuntimeException e4) {
                                AbstractC0102a.o(kVar5, new a(b.f473p, e4.getMessage(), "Cause: " + e4.getCause() + ", Stacktrace: " + Log.getStackTraceString(e4)));
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
                            Y0.b b8 = C0002c.b(sVar7.f513k);
                            RevokeAccessRequest revokeAccessRequest = new RevokeAccessRequest(Y0.l.g(arrayList3), new Account(yVar.f535a, "com.google"), null);
                            RevokeAccessRequest revokeAccessRequest2 = new RevokeAccessRequest(revokeAccessRequest.f2676k, revokeAccessRequest.f2677l, b8.f1583k);
                            L0.k b9 = L0.k.b();
                            b9.f813a = new J0.c[]{Y0.f.f1590c};
                            b9.f816d = new A.c(b8, revokeAccessRequest2, 23);
                            b9.f815c = 1721;
                            g1.i b10 = b8.b(1, b9.a());
                            b10.b(new q(kVar6));
                            b10.a(new q(kVar6));
                            return;
                    }
                }
            });
        } else {
            sVar6.y(null);
        }
        B1.s sVar7 = new B1.s(fVar, AbstractC0468a.a("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.revokeAccess", StringUtils.EMPTY), a(), c0473a);
        if (sVar == null) {
            sVar7.y(null);
        } else {
            final int i8 = 5;
            sVar7.y(new C1.b() { // from class: I1.m
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    String str;
                    String str2;
                    boolean z3;
                    switch (i8) {
                        case 0:
                            try {
                                Context context = ((s) sVar).f513k;
                                int identifier = context.getResources().getIdentifier("default_web_client_id", "string", context.getPackageName());
                                d02 = E2.a.B(identifier != 0 ? context.getString(identifier) : null);
                            } catch (Throwable th) {
                                if (th instanceof d) {
                                    d dVar = th;
                                    d02 = P1.f.d0(dVar.f477k, dVar.f478l, null);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
                            return;
                        case 1:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.GetCredentialRequestParams");
                            h hVar = (h) obj2;
                            k kVar = new k(cVar, 2);
                            s sVar32 = (s) sVar;
                            sVar32.getClass();
                            try {
                                String str3 = hVar.f496c;
                                if (str3 != null && !str3.isEmpty()) {
                                    Activity activity = sVar32.f516o;
                                    if (activity == null) {
                                        AbstractC0102a.o(kVar, new e(f.f484o, "No activity available", null));
                                        return;
                                    }
                                    String str4 = hVar.f498e;
                                    String str5 = hVar.f497d;
                                    ArrayList arrayList = new ArrayList();
                                    if (hVar.f494a) {
                                        if (str5 == null) {
                                            str5 = null;
                                        }
                                        arrayList.add(new h1.b(str3, str5, str4 != null ? str4 : null));
                                    } else {
                                        g gVar = hVar.f495b;
                                        boolean z4 = gVar.f492a;
                                        boolean z5 = gVar.f493b;
                                        if (str3.length() <= 0) {
                                            throw new IllegalArgumentException("serverClientId should not be empty");
                                        }
                                        arrayList.add(new C0269a(str3, str4 != null ? str4 : null, z4, z5));
                                    }
                                    a2.h.e(sVar32.f513k, "context");
                                    H.k kVar2 = new H.k(P1.e.l0(arrayList));
                                    ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                                    A.c cVar2 = new A.c(sVar32, kVar, 16, false);
                                    a2.h.e(newSingleThreadExecutor, "executor");
                                    H.e b3 = H.f.b(new H.f((Context) activity), kVar2);
                                    if (b3 == null) {
                                        cVar2.b(new I.h("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
                                        return;
                                    } else {
                                        b3.onGetCredential(activity, kVar2, null, newSingleThreadExecutor, cVar2);
                                        return;
                                    }
                                }
                                AbstractC0102a.o(kVar, new e(f.n, "CredentialManager requires a serverClientId.", null));
                                return;
                            } catch (RuntimeException e3) {
                                AbstractC0102a.o(kVar, new e(f.u, e3.getMessage(), "Cause: " + e3.getCause() + ", Stacktrace: " + Log.getStackTraceString(e3)));
                                return;
                            }
                        case 2:
                            k kVar3 = new k(cVar, 3);
                            s sVar42 = (s) sVar;
                            C0002c c0002c = sVar42.f514l;
                            Context context2 = sVar42.f513k;
                            a2.h.e(context2, "context");
                            H.a aVar = new H.a();
                            new Bundle();
                            ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
                            B1.a aVar2 = new B1.a(kVar3, 9);
                            a2.h.e(newSingleThreadExecutor2, "executor");
                            H.e b4 = H.f.b(new H.f(context2), "androidx.credentials.TYPE_CLEAR_CREDENTIAL_STATE");
                            if (b4 == null) {
                                aVar2.b(new I.a());
                                return;
                            } else {
                                b4.onClearCredential(aVar, null, newSingleThreadExecutor2, aVar2);
                                return;
                            }
                        case 3:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            k kVar4 = new k(cVar, 4);
                            s sVar52 = (s) sVar;
                            C0002c c0002c2 = sVar52.f515m;
                            Y0.b b5 = C0002c.b(sVar52.f513k);
                            ClearTokenRequest clearTokenRequest = new ClearTokenRequest((String) obj3, b5.f1583k);
                            L0.k b6 = L0.k.b();
                            b6.f813a = new J0.c[]{Y0.f.f1591d};
                            b6.f816d = new A.c(b5, clearTokenRequest, 24);
                            b6.f815c = 1721;
                            g1.i b7 = b5.b(1, b6.a());
                            b7.b(new p(kVar4));
                            b7.a(new p(kVar4));
                            return;
                        case 4:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformAuthorizationRequest");
                            v vVar = (v) obj4;
                            Object obj5 = list.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            final boolean booleanValue = ((Boolean) obj5).booleanValue();
                            final k kVar5 = new k(cVar, 0);
                            final s sVar62 = (s) sVar;
                            sVar62.getClass();
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
                                g1.i c3 = C0002c.b(sVar62.f513k).c(new AuthorizationRequest(arrayList2, str2, z3, false, str6 != null ? new Account(str6, "com.google") : null, str, null, false, null, false, z3 ? 1 : 0));
                                c3.b(new g1.d() { // from class: I1.r
                                    @Override // g1.d
                                    public final void c(Object obj6) {
                                        F0.a aVar3 = (F0.a) obj6;
                                        s sVar72 = s.this;
                                        sVar72.getClass();
                                        PendingIntent pendingIntent = aVar3.f298p;
                                        k kVar6 = kVar5;
                                        if (pendingIntent == null) {
                                            AbstractC0102a.o(kVar6, new w(aVar3.f295l, aVar3.n, aVar3.f294k));
                                        } else {
                                            if (!booleanValue) {
                                                AbstractC0102a.o(kVar6, new a(b.f471m, null, null));
                                                return;
                                            }
                                            Activity activity2 = sVar72.f516o;
                                            if (activity2 == null) {
                                                AbstractC0102a.o(kVar6, new a(b.f474q, "No activity available", null));
                                                return;
                                            }
                                            try {
                                                sVar72.f517p = kVar6;
                                                activity2.startIntentSenderForResult(pendingIntent.getIntentSender(), 53294, null, 0, 0, 0, null);
                                            } catch (IntentSender.SendIntentException e4) {
                                                sVar72.f517p = null;
                                                AbstractC0102a.o(kVar6, new a(b.f472o, e4.getMessage(), null));
                                            }
                                        }
                                    }
                                });
                                c3.a(new B1.d(kVar5, 2));
                                return;
                            } catch (RuntimeException e4) {
                                AbstractC0102a.o(kVar5, new a(b.f473p, e4.getMessage(), "Cause: " + e4.getCause() + ", Stacktrace: " + Log.getStackTraceString(e4)));
                                return;
                            }
                        default:
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj6 = ((List) obj).get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.googlesignin.PlatformRevokeAccessRequest");
                            y yVar = (y) obj6;
                            k kVar6 = new k(cVar, 1);
                            s sVar72 = (s) sVar;
                            sVar72.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = yVar.f536b.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(new Scope((String) it3.next(), 1));
                            }
                            Y0.b b8 = C0002c.b(sVar72.f513k);
                            RevokeAccessRequest revokeAccessRequest = new RevokeAccessRequest(Y0.l.g(arrayList3), new Account(yVar.f535a, "com.google"), null);
                            RevokeAccessRequest revokeAccessRequest2 = new RevokeAccessRequest(revokeAccessRequest.f2676k, revokeAccessRequest.f2677l, b8.f1583k);
                            L0.k b9 = L0.k.b();
                            b9.f813a = new J0.c[]{Y0.f.f1590c};
                            b9.f816d = new A.c(b8, revokeAccessRequest2, 23);
                            b9.f815c = 1721;
                            g1.i b10 = b8.b(1, b9.a());
                            b10.b(new q(kVar6));
                            b10.a(new q(kVar6));
                            return;
                    }
                }
            });
        }
    }
}
