package L1;

import B1.s;
import I1.l;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.util.List;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f872a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final O1.e f873b = new O1.e(new l(4));

    public static void a(C1.f fVar, final A0.j jVar) {
        a2.h.e(fVar, "binaryMessenger");
        String strA = p055t.a.a("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", StringUtils.EMPTY);
        O1.e eVar = f873b;
        p057t1.a aVar = null;
        s sVar = new s(fVar, strA, (C1.l) eVar.a(), aVar);
        if (jVar != null) {
            final int i3 = 0;
            sVar.y(new C1.b() { // from class: L1.c
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    List listD4;
                    switch (i3) {
                        case 0:
                            e eVar2 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z3 = false;
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            try {
                                A0.j jVar2 = (A0.j) eVar2;
                                jVar2.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName componentNameResolveActivity = intent.resolveActivity(((Context) ((B1.d) jVar2.f58m).f84l).getPackageManager());
                                String shortString = componentNameResolveActivity == null ? null : componentNameResolveActivity.toShortString();
                                if (shortString != null) {
                                    z3 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                listD0 = E2.a.B(Boolean.valueOf(z3));
                                break;
                            } catch (Throwable th) {
                                if (th instanceof b) {
                                    b bVar = th;
                                    listD0 = P1.f.d0(bVar.f868k, bVar.f869l, null);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            return;
                        case 1:
                            e eVar3 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            boolean z4 = false;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map map = (Map) obj4;
                            Object obj5 = list.get(2);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                A0.j jVar3 = (A0.j) eVar3;
                                if (((Activity) jVar3.n) == null) {
                                    throw new b();
                                }
                                Intent intentPutExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", A0.j.v(map));
                                if (zBooleanValue && Build.VERSION.SDK_INT >= 30) {
                                    intentPutExtra.addFlags(1024);
                                }
                                try {
                                    ((Activity) jVar3.n).startActivity(intentPutExtra);
                                    z4 = true;
                                } catch (ActivityNotFoundException unused) {
                                }
                                listD1 = E2.a.B(Boolean.valueOf(z4));
                                cVar.e(listD1);
                                return;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar2 = th2;
                                    listD1 = P1.f.d0(bVar2.f868k, bVar2.f869l, null);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            break;
                        case 2:
                            e eVar4 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj6 = list2.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(1);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            Object obj8 = list2.get(2);
                            a2.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            k kVar = (k) obj8;
                            Object obj9 = list2.get(3);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                listD2 = E2.a.B(Boolean.valueOf(((A0.j) eVar4).I(str3, zBooleanValue2, kVar, (a) obj9)));
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar3 = th3;
                                    listD2 = P1.f.d0(bVar3.f868k, bVar3.f869l, null);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            return;
                        case 3:
                            try {
                                listD3 = E2.a.B(Boolean.valueOf(((A0.j) jVar).M()));
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar4 = th4;
                                    listD3 = P1.f.d0(bVar4.f868k, bVar4.f869l, null);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            return;
                        default:
                            try {
                                ((Context) ((A0.j) jVar).f57l).sendBroadcast(new Intent("close action"));
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar5 = th5;
                                    listD4 = P1.f.d0(bVar5.f868k, bVar5.f869l, null);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            return;
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        s sVar2 = new s(fVar, p055t.a.a("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", StringUtils.EMPTY), (C1.l) eVar.a(), aVar);
        if (jVar != null) {
            final int i4 = 1;
            sVar2.y(new C1.b() { // from class: L1.c
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    List listD4;
                    switch (i4) {
                        case 0:
                            e eVar2 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z3 = false;
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            try {
                                A0.j jVar2 = (A0.j) eVar2;
                                jVar2.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName componentNameResolveActivity = intent.resolveActivity(((Context) ((B1.d) jVar2.f58m).f84l).getPackageManager());
                                String shortString = componentNameResolveActivity == null ? null : componentNameResolveActivity.toShortString();
                                if (shortString != null) {
                                    z3 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                listD0 = E2.a.B(Boolean.valueOf(z3));
                                break;
                            } catch (Throwable th) {
                                if (th instanceof b) {
                                    b bVar = th;
                                    listD0 = P1.f.d0(bVar.f868k, bVar.f869l, null);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            return;
                        case 1:
                            e eVar3 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            boolean z4 = false;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map map = (Map) obj4;
                            Object obj5 = list.get(2);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                A0.j jVar3 = (A0.j) eVar3;
                                if (((Activity) jVar3.n) == null) {
                                    throw new b();
                                }
                                Intent intentPutExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", A0.j.v(map));
                                if (zBooleanValue && Build.VERSION.SDK_INT >= 30) {
                                    intentPutExtra.addFlags(1024);
                                }
                                try {
                                    ((Activity) jVar3.n).startActivity(intentPutExtra);
                                    z4 = true;
                                } catch (ActivityNotFoundException unused) {
                                }
                                listD1 = E2.a.B(Boolean.valueOf(z4));
                                cVar.e(listD1);
                                return;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar2 = th2;
                                    listD1 = P1.f.d0(bVar2.f868k, bVar2.f869l, null);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            break;
                        case 2:
                            e eVar4 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj6 = list2.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(1);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            Object obj8 = list2.get(2);
                            a2.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            k kVar = (k) obj8;
                            Object obj9 = list2.get(3);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                listD2 = E2.a.B(Boolean.valueOf(((A0.j) eVar4).I(str3, zBooleanValue2, kVar, (a) obj9)));
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar3 = th3;
                                    listD2 = P1.f.d0(bVar3.f868k, bVar3.f869l, null);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            return;
                        case 3:
                            try {
                                listD3 = E2.a.B(Boolean.valueOf(((A0.j) jVar).M()));
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar4 = th4;
                                    listD3 = P1.f.d0(bVar4.f868k, bVar4.f869l, null);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            return;
                        default:
                            try {
                                ((Context) ((A0.j) jVar).f57l).sendBroadcast(new Intent("close action"));
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar5 = th5;
                                    listD4 = P1.f.d0(bVar5.f868k, bVar5.f869l, null);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            return;
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        s sVar3 = new s(fVar, p055t.a.a("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", StringUtils.EMPTY), (C1.l) eVar.a(), aVar);
        if (jVar != null) {
            final int i5 = 2;
            sVar3.y(new C1.b() { // from class: L1.c
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    List listD4;
                    switch (i5) {
                        case 0:
                            e eVar2 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z3 = false;
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            try {
                                A0.j jVar2 = (A0.j) eVar2;
                                jVar2.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName componentNameResolveActivity = intent.resolveActivity(((Context) ((B1.d) jVar2.f58m).f84l).getPackageManager());
                                String shortString = componentNameResolveActivity == null ? null : componentNameResolveActivity.toShortString();
                                if (shortString != null) {
                                    z3 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                listD0 = E2.a.B(Boolean.valueOf(z3));
                                break;
                            } catch (Throwable th) {
                                if (th instanceof b) {
                                    b bVar = th;
                                    listD0 = P1.f.d0(bVar.f868k, bVar.f869l, null);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            return;
                        case 1:
                            e eVar3 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            boolean z4 = false;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map map = (Map) obj4;
                            Object obj5 = list.get(2);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                A0.j jVar3 = (A0.j) eVar3;
                                if (((Activity) jVar3.n) == null) {
                                    throw new b();
                                }
                                Intent intentPutExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", A0.j.v(map));
                                if (zBooleanValue && Build.VERSION.SDK_INT >= 30) {
                                    intentPutExtra.addFlags(1024);
                                }
                                try {
                                    ((Activity) jVar3.n).startActivity(intentPutExtra);
                                    z4 = true;
                                } catch (ActivityNotFoundException unused) {
                                }
                                listD1 = E2.a.B(Boolean.valueOf(z4));
                                cVar.e(listD1);
                                return;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar2 = th2;
                                    listD1 = P1.f.d0(bVar2.f868k, bVar2.f869l, null);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            break;
                        case 2:
                            e eVar4 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj6 = list2.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(1);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            Object obj8 = list2.get(2);
                            a2.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            k kVar = (k) obj8;
                            Object obj9 = list2.get(3);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                listD2 = E2.a.B(Boolean.valueOf(((A0.j) eVar4).I(str3, zBooleanValue2, kVar, (a) obj9)));
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar3 = th3;
                                    listD2 = P1.f.d0(bVar3.f868k, bVar3.f869l, null);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            return;
                        case 3:
                            try {
                                listD3 = E2.a.B(Boolean.valueOf(((A0.j) jVar).M()));
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar4 = th4;
                                    listD3 = P1.f.d0(bVar4.f868k, bVar4.f869l, null);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            return;
                        default:
                            try {
                                ((Context) ((A0.j) jVar).f57l).sendBroadcast(new Intent("close action"));
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar5 = th5;
                                    listD4 = P1.f.d0(bVar5.f868k, bVar5.f869l, null);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            return;
                    }
                }
            });
        } else {
            sVar3.y(null);
        }
        s sVar4 = new s(fVar, p055t.a.a("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", StringUtils.EMPTY), (C1.l) eVar.a(), aVar);
        if (jVar != null) {
            final int i6 = 3;
            sVar4.y(new C1.b() { // from class: L1.c
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    List listD4;
                    switch (i6) {
                        case 0:
                            e eVar2 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z3 = false;
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            try {
                                A0.j jVar2 = (A0.j) eVar2;
                                jVar2.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName componentNameResolveActivity = intent.resolveActivity(((Context) ((B1.d) jVar2.f58m).f84l).getPackageManager());
                                String shortString = componentNameResolveActivity == null ? null : componentNameResolveActivity.toShortString();
                                if (shortString != null) {
                                    z3 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                listD0 = E2.a.B(Boolean.valueOf(z3));
                                break;
                            } catch (Throwable th) {
                                if (th instanceof b) {
                                    b bVar = th;
                                    listD0 = P1.f.d0(bVar.f868k, bVar.f869l, null);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            return;
                        case 1:
                            e eVar3 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            boolean z4 = false;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map map = (Map) obj4;
                            Object obj5 = list.get(2);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                A0.j jVar3 = (A0.j) eVar3;
                                if (((Activity) jVar3.n) == null) {
                                    throw new b();
                                }
                                Intent intentPutExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", A0.j.v(map));
                                if (zBooleanValue && Build.VERSION.SDK_INT >= 30) {
                                    intentPutExtra.addFlags(1024);
                                }
                                try {
                                    ((Activity) jVar3.n).startActivity(intentPutExtra);
                                    z4 = true;
                                } catch (ActivityNotFoundException unused) {
                                }
                                listD1 = E2.a.B(Boolean.valueOf(z4));
                                cVar.e(listD1);
                                return;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar2 = th2;
                                    listD1 = P1.f.d0(bVar2.f868k, bVar2.f869l, null);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            break;
                        case 2:
                            e eVar4 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj6 = list2.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(1);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            Object obj8 = list2.get(2);
                            a2.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            k kVar = (k) obj8;
                            Object obj9 = list2.get(3);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                listD2 = E2.a.B(Boolean.valueOf(((A0.j) eVar4).I(str3, zBooleanValue2, kVar, (a) obj9)));
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar3 = th3;
                                    listD2 = P1.f.d0(bVar3.f868k, bVar3.f869l, null);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            return;
                        case 3:
                            try {
                                listD3 = E2.a.B(Boolean.valueOf(((A0.j) jVar).M()));
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar4 = th4;
                                    listD3 = P1.f.d0(bVar4.f868k, bVar4.f869l, null);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            return;
                        default:
                            try {
                                ((Context) ((A0.j) jVar).f57l).sendBroadcast(new Intent("close action"));
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar5 = th5;
                                    listD4 = P1.f.d0(bVar5.f868k, bVar5.f869l, null);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            return;
                    }
                }
            });
        } else {
            sVar4.y(null);
        }
        s sVar5 = new s(fVar, p055t.a.a("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", StringUtils.EMPTY), (C1.l) eVar.a(), aVar);
        if (jVar == null) {
            sVar5.y(null);
        } else {
            final int i7 = 4;
            sVar5.y(new C1.b() { // from class: L1.c
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List listD0;
                    List listD1;
                    List listD2;
                    List listD3;
                    List listD4;
                    switch (i7) {
                        case 0:
                            e eVar2 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z3 = false;
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            try {
                                A0.j jVar2 = (A0.j) eVar2;
                                jVar2.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName componentNameResolveActivity = intent.resolveActivity(((Context) ((B1.d) jVar2.f58m).f84l).getPackageManager());
                                String shortString = componentNameResolveActivity == null ? null : componentNameResolveActivity.toShortString();
                                if (shortString != null) {
                                    z3 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                listD0 = E2.a.B(Boolean.valueOf(z3));
                                break;
                            } catch (Throwable th) {
                                if (th instanceof b) {
                                    b bVar = th;
                                    listD0 = P1.f.d0(bVar.f868k, bVar.f869l, null);
                                } else {
                                    listD0 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(listD0);
                            return;
                        case 1:
                            e eVar3 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            boolean z4 = false;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map map = (Map) obj4;
                            Object obj5 = list.get(2);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                A0.j jVar3 = (A0.j) eVar3;
                                if (((Activity) jVar3.n) == null) {
                                    throw new b();
                                }
                                Intent intentPutExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", A0.j.v(map));
                                if (zBooleanValue && Build.VERSION.SDK_INT >= 30) {
                                    intentPutExtra.addFlags(1024);
                                }
                                try {
                                    ((Activity) jVar3.n).startActivity(intentPutExtra);
                                    z4 = true;
                                } catch (ActivityNotFoundException unused) {
                                }
                                listD1 = E2.a.B(Boolean.valueOf(z4));
                                cVar.e(listD1);
                                return;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar2 = th2;
                                    listD1 = P1.f.d0(bVar2.f868k, bVar2.f869l, null);
                                } else {
                                    listD1 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            break;
                        case 2:
                            e eVar4 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj6 = list2.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(1);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean zBooleanValue2 = ((Boolean) obj7).booleanValue();
                            Object obj8 = list2.get(2);
                            a2.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            k kVar = (k) obj8;
                            Object obj9 = list2.get(3);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                listD2 = E2.a.B(Boolean.valueOf(((A0.j) eVar4).I(str3, zBooleanValue2, kVar, (a) obj9)));
                                break;
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar3 = th3;
                                    listD2 = P1.f.d0(bVar3.f868k, bVar3.f869l, null);
                                } else {
                                    listD2 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(listD2);
                            return;
                        case 3:
                            try {
                                listD3 = E2.a.B(Boolean.valueOf(((A0.j) jVar).M()));
                                break;
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar4 = th4;
                                    listD3 = P1.f.d0(bVar4.f868k, bVar4.f869l, null);
                                } else {
                                    listD3 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(listD3);
                            return;
                        default:
                            try {
                                ((Context) ((A0.j) jVar).f57l).sendBroadcast(new Intent("close action"));
                                listD4 = E2.a.B(null);
                                break;
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar5 = th5;
                                    listD4 = P1.f.d0(bVar5.f868k, bVar5.f869l, null);
                                } else {
                                    listD4 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(listD4);
                            return;
                    }
                }
            });
        }
    }
}
