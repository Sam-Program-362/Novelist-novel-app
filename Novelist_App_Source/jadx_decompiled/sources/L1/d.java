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
import t.AbstractC0468a;
import t1.C0473a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f872a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final O1.e f873b = new O1.e(new l(4));

    public static void a(C1.f fVar, final A0.j jVar) {
        a2.h.e(fVar, "binaryMessenger");
        String a3 = AbstractC0468a.a("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", StringUtils.EMPTY);
        O1.e eVar = f873b;
        C0473a c0473a = null;
        s sVar = new s(fVar, a3, (C1.l) eVar.a(), c0473a);
        if (jVar != null) {
            final int i3 = 0;
            sVar.y(new C1.b() { // from class: L1.c
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    A0.j jVar2;
                    List d04;
                    List d05;
                    List d06;
                    switch (i3) {
                        case 0:
                            e eVar2 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z3 = false;
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            try {
                                A0.j jVar3 = (A0.j) eVar2;
                                jVar3.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName resolveActivity = intent.resolveActivity(((Context) ((B1.d) jVar3.f58m).f84l).getPackageManager());
                                String shortString = resolveActivity == null ? null : resolveActivity.toShortString();
                                if (shortString != null) {
                                    z3 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                d02 = E2.a.B(Boolean.valueOf(z3));
                            } catch (Throwable th) {
                                if (th instanceof b) {
                                    b bVar = th;
                                    d02 = P1.f.d0(bVar.f868k, bVar.f869l, null);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                jVar2 = (A0.j) eVar3;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar2 = th2;
                                    d03 = P1.f.d0(bVar2.f868k, bVar2.f869l, null);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            if (((Activity) jVar2.n) == null) {
                                throw new b();
                            }
                            Intent putExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", A0.j.v(map));
                            if (booleanValue && Build.VERSION.SDK_INT >= 30) {
                                putExtra.addFlags(1024);
                            }
                            try {
                                ((Activity) jVar2.n).startActivity(putExtra);
                                z4 = true;
                            } catch (ActivityNotFoundException unused) {
                            }
                            d03 = E2.a.B(Boolean.valueOf(z4));
                            cVar.e(d03);
                            return;
                        case 2:
                            e eVar4 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj6 = list2.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(1);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            Object obj8 = list2.get(2);
                            a2.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            k kVar = (k) obj8;
                            Object obj9 = list2.get(3);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                d04 = E2.a.B(Boolean.valueOf(((A0.j) eVar4).I(str3, booleanValue2, kVar, (a) obj9)));
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar3 = th3;
                                    d04 = P1.f.d0(bVar3.f868k, bVar3.f869l, null);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            return;
                        case 3:
                            try {
                                d05 = E2.a.B(Boolean.valueOf(((A0.j) jVar).M()));
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar4 = th4;
                                    d05 = P1.f.d0(bVar4.f868k, bVar4.f869l, null);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
                            return;
                        default:
                            try {
                                ((Context) ((A0.j) jVar).f57l).sendBroadcast(new Intent("close action"));
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar5 = th5;
                                    d06 = P1.f.d0(bVar5.f868k, bVar5.f869l, null);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
                            return;
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        s sVar2 = new s(fVar, AbstractC0468a.a("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", StringUtils.EMPTY), (C1.l) eVar.a(), c0473a);
        if (jVar != null) {
            final int i4 = 1;
            sVar2.y(new C1.b() { // from class: L1.c
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    A0.j jVar2;
                    List d04;
                    List d05;
                    List d06;
                    switch (i4) {
                        case 0:
                            e eVar2 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z3 = false;
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            try {
                                A0.j jVar3 = (A0.j) eVar2;
                                jVar3.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName resolveActivity = intent.resolveActivity(((Context) ((B1.d) jVar3.f58m).f84l).getPackageManager());
                                String shortString = resolveActivity == null ? null : resolveActivity.toShortString();
                                if (shortString != null) {
                                    z3 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                d02 = E2.a.B(Boolean.valueOf(z3));
                            } catch (Throwable th) {
                                if (th instanceof b) {
                                    b bVar = th;
                                    d02 = P1.f.d0(bVar.f868k, bVar.f869l, null);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                jVar2 = (A0.j) eVar3;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar2 = th2;
                                    d03 = P1.f.d0(bVar2.f868k, bVar2.f869l, null);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            if (((Activity) jVar2.n) == null) {
                                throw new b();
                            }
                            Intent putExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", A0.j.v(map));
                            if (booleanValue && Build.VERSION.SDK_INT >= 30) {
                                putExtra.addFlags(1024);
                            }
                            try {
                                ((Activity) jVar2.n).startActivity(putExtra);
                                z4 = true;
                            } catch (ActivityNotFoundException unused) {
                            }
                            d03 = E2.a.B(Boolean.valueOf(z4));
                            cVar.e(d03);
                            return;
                        case 2:
                            e eVar4 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj6 = list2.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(1);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            Object obj8 = list2.get(2);
                            a2.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            k kVar = (k) obj8;
                            Object obj9 = list2.get(3);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                d04 = E2.a.B(Boolean.valueOf(((A0.j) eVar4).I(str3, booleanValue2, kVar, (a) obj9)));
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar3 = th3;
                                    d04 = P1.f.d0(bVar3.f868k, bVar3.f869l, null);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            return;
                        case 3:
                            try {
                                d05 = E2.a.B(Boolean.valueOf(((A0.j) jVar).M()));
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar4 = th4;
                                    d05 = P1.f.d0(bVar4.f868k, bVar4.f869l, null);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
                            return;
                        default:
                            try {
                                ((Context) ((A0.j) jVar).f57l).sendBroadcast(new Intent("close action"));
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar5 = th5;
                                    d06 = P1.f.d0(bVar5.f868k, bVar5.f869l, null);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
                            return;
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        s sVar3 = new s(fVar, AbstractC0468a.a("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", StringUtils.EMPTY), (C1.l) eVar.a(), c0473a);
        if (jVar != null) {
            final int i5 = 2;
            sVar3.y(new C1.b() { // from class: L1.c
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    A0.j jVar2;
                    List d04;
                    List d05;
                    List d06;
                    switch (i5) {
                        case 0:
                            e eVar2 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z3 = false;
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            try {
                                A0.j jVar3 = (A0.j) eVar2;
                                jVar3.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName resolveActivity = intent.resolveActivity(((Context) ((B1.d) jVar3.f58m).f84l).getPackageManager());
                                String shortString = resolveActivity == null ? null : resolveActivity.toShortString();
                                if (shortString != null) {
                                    z3 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                d02 = E2.a.B(Boolean.valueOf(z3));
                            } catch (Throwable th) {
                                if (th instanceof b) {
                                    b bVar = th;
                                    d02 = P1.f.d0(bVar.f868k, bVar.f869l, null);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                jVar2 = (A0.j) eVar3;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar2 = th2;
                                    d03 = P1.f.d0(bVar2.f868k, bVar2.f869l, null);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            if (((Activity) jVar2.n) == null) {
                                throw new b();
                            }
                            Intent putExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", A0.j.v(map));
                            if (booleanValue && Build.VERSION.SDK_INT >= 30) {
                                putExtra.addFlags(1024);
                            }
                            try {
                                ((Activity) jVar2.n).startActivity(putExtra);
                                z4 = true;
                            } catch (ActivityNotFoundException unused) {
                            }
                            d03 = E2.a.B(Boolean.valueOf(z4));
                            cVar.e(d03);
                            return;
                        case 2:
                            e eVar4 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj6 = list2.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(1);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            Object obj8 = list2.get(2);
                            a2.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            k kVar = (k) obj8;
                            Object obj9 = list2.get(3);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                d04 = E2.a.B(Boolean.valueOf(((A0.j) eVar4).I(str3, booleanValue2, kVar, (a) obj9)));
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar3 = th3;
                                    d04 = P1.f.d0(bVar3.f868k, bVar3.f869l, null);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            return;
                        case 3:
                            try {
                                d05 = E2.a.B(Boolean.valueOf(((A0.j) jVar).M()));
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar4 = th4;
                                    d05 = P1.f.d0(bVar4.f868k, bVar4.f869l, null);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
                            return;
                        default:
                            try {
                                ((Context) ((A0.j) jVar).f57l).sendBroadcast(new Intent("close action"));
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar5 = th5;
                                    d06 = P1.f.d0(bVar5.f868k, bVar5.f869l, null);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
                            return;
                    }
                }
            });
        } else {
            sVar3.y(null);
        }
        s sVar4 = new s(fVar, AbstractC0468a.a("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", StringUtils.EMPTY), (C1.l) eVar.a(), c0473a);
        if (jVar != null) {
            final int i6 = 3;
            sVar4.y(new C1.b() { // from class: L1.c
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    A0.j jVar2;
                    List d04;
                    List d05;
                    List d06;
                    switch (i6) {
                        case 0:
                            e eVar2 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z3 = false;
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            try {
                                A0.j jVar3 = (A0.j) eVar2;
                                jVar3.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName resolveActivity = intent.resolveActivity(((Context) ((B1.d) jVar3.f58m).f84l).getPackageManager());
                                String shortString = resolveActivity == null ? null : resolveActivity.toShortString();
                                if (shortString != null) {
                                    z3 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                d02 = E2.a.B(Boolean.valueOf(z3));
                            } catch (Throwable th) {
                                if (th instanceof b) {
                                    b bVar = th;
                                    d02 = P1.f.d0(bVar.f868k, bVar.f869l, null);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                jVar2 = (A0.j) eVar3;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar2 = th2;
                                    d03 = P1.f.d0(bVar2.f868k, bVar2.f869l, null);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            if (((Activity) jVar2.n) == null) {
                                throw new b();
                            }
                            Intent putExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", A0.j.v(map));
                            if (booleanValue && Build.VERSION.SDK_INT >= 30) {
                                putExtra.addFlags(1024);
                            }
                            try {
                                ((Activity) jVar2.n).startActivity(putExtra);
                                z4 = true;
                            } catch (ActivityNotFoundException unused) {
                            }
                            d03 = E2.a.B(Boolean.valueOf(z4));
                            cVar.e(d03);
                            return;
                        case 2:
                            e eVar4 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj6 = list2.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(1);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            Object obj8 = list2.get(2);
                            a2.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            k kVar = (k) obj8;
                            Object obj9 = list2.get(3);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                d04 = E2.a.B(Boolean.valueOf(((A0.j) eVar4).I(str3, booleanValue2, kVar, (a) obj9)));
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar3 = th3;
                                    d04 = P1.f.d0(bVar3.f868k, bVar3.f869l, null);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            return;
                        case 3:
                            try {
                                d05 = E2.a.B(Boolean.valueOf(((A0.j) jVar).M()));
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar4 = th4;
                                    d05 = P1.f.d0(bVar4.f868k, bVar4.f869l, null);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
                            return;
                        default:
                            try {
                                ((Context) ((A0.j) jVar).f57l).sendBroadcast(new Intent("close action"));
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar5 = th5;
                                    d06 = P1.f.d0(bVar5.f868k, bVar5.f869l, null);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
                            return;
                    }
                }
            });
        } else {
            sVar4.y(null);
        }
        s sVar5 = new s(fVar, AbstractC0468a.a("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", StringUtils.EMPTY), (C1.l) eVar.a(), c0473a);
        if (jVar == null) {
            sVar5.y(null);
        } else {
            final int i7 = 4;
            sVar5.y(new C1.b() { // from class: L1.c
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    A0.j jVar2;
                    List d04;
                    List d05;
                    List d06;
                    switch (i7) {
                        case 0:
                            e eVar2 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z3 = false;
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            try {
                                A0.j jVar3 = (A0.j) eVar2;
                                jVar3.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName resolveActivity = intent.resolveActivity(((Context) ((B1.d) jVar3.f58m).f84l).getPackageManager());
                                String shortString = resolveActivity == null ? null : resolveActivity.toShortString();
                                if (shortString != null) {
                                    z3 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                d02 = E2.a.B(Boolean.valueOf(z3));
                            } catch (Throwable th) {
                                if (th instanceof b) {
                                    b bVar = th;
                                    d02 = P1.f.d0(bVar.f868k, bVar.f869l, null);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
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
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                jVar2 = (A0.j) eVar3;
                            } catch (Throwable th2) {
                                if (th2 instanceof b) {
                                    b bVar2 = th2;
                                    d03 = P1.f.d0(bVar2.f868k, bVar2.f869l, null);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            if (((Activity) jVar2.n) == null) {
                                throw new b();
                            }
                            Intent putExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", A0.j.v(map));
                            if (booleanValue && Build.VERSION.SDK_INT >= 30) {
                                putExtra.addFlags(1024);
                            }
                            try {
                                ((Activity) jVar2.n).startActivity(putExtra);
                                z4 = true;
                            } catch (ActivityNotFoundException unused) {
                            }
                            d03 = E2.a.B(Boolean.valueOf(z4));
                            cVar.e(d03);
                            return;
                        case 2:
                            e eVar4 = jVar;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj6 = list2.get(0);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(1);
                            a2.h.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            Object obj8 = list2.get(2);
                            a2.h.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            k kVar = (k) obj8;
                            Object obj9 = list2.get(3);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                d04 = E2.a.B(Boolean.valueOf(((A0.j) eVar4).I(str3, booleanValue2, kVar, (a) obj9)));
                            } catch (Throwable th3) {
                                if (th3 instanceof b) {
                                    b bVar3 = th3;
                                    d04 = P1.f.d0(bVar3.f868k, bVar3.f869l, null);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            return;
                        case 3:
                            try {
                                d05 = E2.a.B(Boolean.valueOf(((A0.j) jVar).M()));
                            } catch (Throwable th4) {
                                if (th4 instanceof b) {
                                    b bVar4 = th4;
                                    d05 = P1.f.d0(bVar4.f868k, bVar4.f869l, null);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
                            return;
                        default:
                            try {
                                ((Context) ((A0.j) jVar).f57l).sendBroadcast(new Intent("close action"));
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof b) {
                                    b bVar5 = th5;
                                    d06 = P1.f.d0(bVar5.f868k, bVar5.f869l, null);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
                            return;
                    }
                }
            });
        }
    }
}
