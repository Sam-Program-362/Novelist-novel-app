package E2;

import B.c;
import B1.s;
import C1.b;
import C1.l;
import D.AbstractC0005f;
import I.d;
import I.j;
import I1.u;
import M1.C0065n;
import M1.O;
import R1.f;
import R1.g;
import a.AbstractC0102a;
import a2.h;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.hardware.display.DisplayManager;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Trace;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.Base64;
import android.util.Log;
import android.view.ActionMode;
import android.view.View;
import android.webkit.HttpAuthHandler;
import android.widget.TextView;
import android.window.BackEvent;
import f2.InterfaceC0248b;
import g1.i;
import h0.C0259b;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import k.C0357u;
import k.t0;
import o0.AbstractC0440a;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.json.JSONArray;
import org.xmlpull.v1.XmlPullParserException;
import s1.C0467c;
import s1.e;
import t1.C0473a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static long f290a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f291b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f292c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f293d;

    public static boolean A(Context context) {
        Bundle bundle;
        Context applicationContext = context.getApplicationContext();
        try {
            bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException e3) {
            Log.e("ContentSizingFlag", "Could not get metadata", e3);
            bundle = null;
        }
        if (bundle != null) {
            return bundle.getBoolean("io.flutter.embedding.android.EnableContentSizing", false);
        }
        return false;
    }

    public static List B(Object obj) {
        List singletonList = Collections.singletonList(obj);
        h.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static i C(Context context) {
        String str;
        String str2;
        int i3;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            String str3 = e.f4504a.f4502b;
            String str4 = e.f4505b.f4502b;
            String str5 = null;
            if (bundle == null) {
                str = null;
            } else {
                String string = bundle.getString(str3, null);
                if (string == null) {
                    string = bundle.getString(str4);
                }
                str = string;
            }
            Bundle bundle2 = applicationInfo.metaData;
            String str6 = e.f4509f.f4502b;
            if (bundle2 != null) {
                bundle2.getString(str6, null);
            }
            Bundle bundle3 = applicationInfo.metaData;
            String str7 = e.f4510g.f4502b;
            if (bundle3 != null) {
                bundle3.getString(str7, null);
            }
            Bundle bundle4 = applicationInfo.metaData;
            String str8 = e.f4506c.f4502b;
            String str9 = e.f4507d.f4502b;
            if (bundle4 == null) {
                str2 = null;
            } else {
                String string2 = bundle4.getString(str8, null);
                if (string2 == null) {
                    string2 = bundle4.getString(str9);
                }
                str2 = string2;
            }
            Bundle bundle5 = applicationInfo.metaData;
            if (bundle5 != null && (i3 = bundle5.getInt("io.flutter.network-policy", 0)) > 0) {
                JSONArray jSONArray = new JSONArray();
                try {
                    XmlResourceParser xml = context.getResources().getXml(i3);
                    xml.next();
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            if (xml.getName().equals("domain-config")) {
                                E(xml, jSONArray, false);
                            }
                        }
                    }
                    str5 = jSONArray.toString();
                } catch (IOException | XmlPullParserException unused) {
                }
            }
            String str10 = str5;
            String str11 = applicationInfo.nativeLibraryDir;
            Bundle bundle6 = applicationInfo.metaData;
            return new i(str, str2, str10, str11, bundle6 != null ? bundle6.getBoolean("io.flutter.automatically-register-plugins", true) : true);
        } catch (PackageManager.NameNotFoundException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static R1.h D(f fVar, g gVar) {
        h.e(gVar, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        return h.a(fVar.getKey(), gVar) ? R1.i.f1255k : fVar;
    }

    public static void E(XmlResourceParser xmlResourceParser, JSONArray jSONArray, boolean z3) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z3);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    boolean attributeBooleanValue2 = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 4) {
                        throw new IllegalStateException("Expected text");
                    }
                    String trim = xmlResourceParser.getText().trim();
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(trim);
                    jSONArray2.put(attributeBooleanValue2);
                    jSONArray2.put(attributeBooleanValue);
                    jSONArray.put(jSONArray2);
                    xmlResourceParser.next();
                    if (xmlResourceParser.getEventType() != 3) {
                        throw new IllegalStateException("Expected end of domain tag");
                    }
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    E(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    String name = xmlResourceParser.getName();
                    int eventType = xmlResourceParser.getEventType();
                    while (true) {
                        if (eventType != 3 || xmlResourceParser.getName() != name) {
                            eventType = xmlResourceParser.next();
                        }
                    }
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    public static boolean G(Parcel parcel, int i3) {
        a0(parcel, i3, 4);
        return parcel.readInt() != 0;
    }

    public static int H(Parcel parcel, int i3) {
        a0(parcel, i3, 4);
        return parcel.readInt();
    }

    public static long I(Parcel parcel, int i3) {
        a0(parcel, i3, 8);
        return parcel.readLong();
    }

    public static int J(Parcel parcel, int i3) {
        return (i3 & (-65536)) != -65536 ? (char) (i3 >> 16) : parcel.readInt();
    }

    public static void K(C0467c c0467c) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", C0467c.class).invoke(null, c0467c);
        } catch (Exception e3) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + c0467c + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e3);
        }
    }

    public static void O(TextView textView, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0005f.o(textView, i3);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i3 > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), i3 + i4, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void P(TextView textView, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i4 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i3 > Math.abs(i4)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i3 - i4);
        }
    }

    public static void Q(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        t0 t0Var = t0.f3782t;
        if (t0Var != null && t0Var.f3783k == view) {
            t0.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new t0(charSequence, view);
            return;
        }
        t0 t0Var2 = t0.u;
        if (t0Var2 != null && t0Var2.f3783k == view) {
            t0Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void R(C1.f fVar, final C0065n c0065n) {
        O o2;
        h.e(fVar, "binaryMessenger");
        l uVar = (c0065n == null || (o2 = c0065n.f1145a) == null) ? new u(5) : o2.a();
        C0473a c0473a = null;
        s sVar = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.useHttpAuthUsernamePassword", uVar, c0473a);
        if (c0065n != null) {
            final int i3 = 0;
            sVar.y(new b() { // from class: M1.E
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    switch (i3) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj2;
                            try {
                                c0065n2.getClass();
                                d02 = E2.a.B(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
                            break;
                        case 1:
                            C0065n c0065n3 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj3;
                            try {
                                c0065n3.getClass();
                                httpAuthHandler2.cancel();
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
                            break;
                        default:
                            C0065n c0065n4 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj4;
                            Object obj5 = list.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0065n4.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            break;
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        s sVar2 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.cancel", uVar, c0473a);
        if (c0065n != null) {
            final int i4 = 1;
            sVar2.y(new b() { // from class: M1.E
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    switch (i4) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj2;
                            try {
                                c0065n2.getClass();
                                d02 = E2.a.B(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
                            break;
                        case 1:
                            C0065n c0065n3 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj3;
                            try {
                                c0065n3.getClass();
                                httpAuthHandler2.cancel();
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
                            break;
                        default:
                            C0065n c0065n4 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj4;
                            Object obj5 = list.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0065n4.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            break;
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        s sVar3 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.proceed", uVar, c0473a);
        if (c0065n == null) {
            sVar3.y(null);
        } else {
            final int i5 = 2;
            sVar3.y(new b() { // from class: M1.E
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    switch (i5) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj2;
                            try {
                                c0065n2.getClass();
                                d02 = E2.a.B(Boolean.valueOf(httpAuthHandler.useHttpAuthUsernamePassword()));
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
                            break;
                        case 1:
                            C0065n c0065n3 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj).get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler2 = (HttpAuthHandler) obj3;
                            try {
                                c0065n3.getClass();
                                httpAuthHandler2.cancel();
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
                            break;
                        default:
                            C0065n c0065n4 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj4 = list.get(0);
                            a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.HttpAuthHandler");
                            HttpAuthHandler httpAuthHandler3 = (HttpAuthHandler) obj4;
                            Object obj5 = list.get(1);
                            a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            Object obj6 = list.get(2);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj6;
                            try {
                                c0065n4.getClass();
                                httpAuthHandler3.proceed(str, str2);
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            break;
                    }
                }
            });
        }
    }

    public static void S(C1.f fVar, final C0065n c0065n) {
        O o2;
        h.e(fVar, "binaryMessenger");
        l uVar = (c0065n == null || (o2 = c0065n.f1145a) == null) ? new u(5) : o2.a();
        C0473a c0473a = null;
        s sVar = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor", uVar, c0473a);
        if (c0065n != null) {
            final int i3 = 0;
            sVar.y(new b() { // from class: M1.J
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    List d06;
                    List d07;
                    switch (i3) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0065n2.f1145a.f1032c).a(((Long) obj2).longValue(), new Z(c0065n2));
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
                            break;
                        case 1:
                            C0065n c0065n3 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z3 = (Z) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0065n3.getClass();
                                z3.f1065c = booleanValue;
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
                            break;
                        case 2:
                            C0065n c0065n4 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z4 = (Z) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0065n4.getClass();
                                z4.f1066d = booleanValue2;
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            break;
                        case 3:
                            C0065n c0065n5 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z5 = (Z) obj7;
                            Object obj8 = list3.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0065n5.getClass();
                                z5.f1067e = booleanValue3;
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
                            break;
                        case 4:
                            C0065n c0065n6 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z6 = (Z) obj9;
                            Object obj10 = list4.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0065n6.getClass();
                                z6.f1068f = booleanValue4;
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
                            break;
                        default:
                            C0065n c0065n7 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z7 = (Z) obj11;
                            Object obj12 = list5.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0065n7.getClass();
                                z7.f1069g = booleanValue5;
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
                            break;
                    }
                }
            });
        } else {
            sVar.y(null);
        }
        s sVar2 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser", uVar, c0473a);
        if (c0065n != null) {
            final int i4 = 1;
            sVar2.y(new b() { // from class: M1.J
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    List d06;
                    List d07;
                    switch (i4) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0065n2.f1145a.f1032c).a(((Long) obj2).longValue(), new Z(c0065n2));
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
                            break;
                        case 1:
                            C0065n c0065n3 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z3 = (Z) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0065n3.getClass();
                                z3.f1065c = booleanValue;
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
                            break;
                        case 2:
                            C0065n c0065n4 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z4 = (Z) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0065n4.getClass();
                                z4.f1066d = booleanValue2;
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            break;
                        case 3:
                            C0065n c0065n5 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z5 = (Z) obj7;
                            Object obj8 = list3.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0065n5.getClass();
                                z5.f1067e = booleanValue3;
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
                            break;
                        case 4:
                            C0065n c0065n6 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z6 = (Z) obj9;
                            Object obj10 = list4.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0065n6.getClass();
                                z6.f1068f = booleanValue4;
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
                            break;
                        default:
                            C0065n c0065n7 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z7 = (Z) obj11;
                            Object obj12 = list5.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0065n7.getClass();
                                z7.f1069g = booleanValue5;
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
                            break;
                    }
                }
            });
        } else {
            sVar2.y(null);
        }
        s sVar3 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage", uVar, c0473a);
        if (c0065n != null) {
            final int i5 = 2;
            sVar3.y(new b() { // from class: M1.J
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    List d06;
                    List d07;
                    switch (i5) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0065n2.f1145a.f1032c).a(((Long) obj2).longValue(), new Z(c0065n2));
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
                            break;
                        case 1:
                            C0065n c0065n3 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z3 = (Z) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0065n3.getClass();
                                z3.f1065c = booleanValue;
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
                            break;
                        case 2:
                            C0065n c0065n4 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z4 = (Z) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0065n4.getClass();
                                z4.f1066d = booleanValue2;
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            break;
                        case 3:
                            C0065n c0065n5 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z5 = (Z) obj7;
                            Object obj8 = list3.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0065n5.getClass();
                                z5.f1067e = booleanValue3;
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
                            break;
                        case 4:
                            C0065n c0065n6 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z6 = (Z) obj9;
                            Object obj10 = list4.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0065n6.getClass();
                                z6.f1068f = booleanValue4;
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
                            break;
                        default:
                            C0065n c0065n7 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z7 = (Z) obj11;
                            Object obj12 = list5.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0065n7.getClass();
                                z7.f1069g = booleanValue5;
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
                            break;
                    }
                }
            });
        } else {
            sVar3.y(null);
        }
        s sVar4 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert", uVar, c0473a);
        if (c0065n != null) {
            final int i6 = 3;
            sVar4.y(new b() { // from class: M1.J
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    List d06;
                    List d07;
                    switch (i6) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0065n2.f1145a.f1032c).a(((Long) obj2).longValue(), new Z(c0065n2));
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
                            break;
                        case 1:
                            C0065n c0065n3 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z3 = (Z) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0065n3.getClass();
                                z3.f1065c = booleanValue;
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
                            break;
                        case 2:
                            C0065n c0065n4 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z4 = (Z) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0065n4.getClass();
                                z4.f1066d = booleanValue2;
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            break;
                        case 3:
                            C0065n c0065n5 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z5 = (Z) obj7;
                            Object obj8 = list3.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0065n5.getClass();
                                z5.f1067e = booleanValue3;
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
                            break;
                        case 4:
                            C0065n c0065n6 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z6 = (Z) obj9;
                            Object obj10 = list4.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0065n6.getClass();
                                z6.f1068f = booleanValue4;
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
                            break;
                        default:
                            C0065n c0065n7 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z7 = (Z) obj11;
                            Object obj12 = list5.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0065n7.getClass();
                                z7.f1069g = booleanValue5;
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
                            break;
                    }
                }
            });
        } else {
            sVar4.y(null);
        }
        s sVar5 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm", uVar, c0473a);
        if (c0065n != null) {
            final int i7 = 4;
            sVar5.y(new b() { // from class: M1.J
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    List d06;
                    List d07;
                    switch (i7) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0065n2.f1145a.f1032c).a(((Long) obj2).longValue(), new Z(c0065n2));
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
                            break;
                        case 1:
                            C0065n c0065n3 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z3 = (Z) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0065n3.getClass();
                                z3.f1065c = booleanValue;
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
                            break;
                        case 2:
                            C0065n c0065n4 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z4 = (Z) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0065n4.getClass();
                                z4.f1066d = booleanValue2;
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            break;
                        case 3:
                            C0065n c0065n5 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z5 = (Z) obj7;
                            Object obj8 = list3.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0065n5.getClass();
                                z5.f1067e = booleanValue3;
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
                            break;
                        case 4:
                            C0065n c0065n6 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z6 = (Z) obj9;
                            Object obj10 = list4.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0065n6.getClass();
                                z6.f1068f = booleanValue4;
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
                            break;
                        default:
                            C0065n c0065n7 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z7 = (Z) obj11;
                            Object obj12 = list5.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0065n7.getClass();
                                z7.f1069g = booleanValue5;
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
                            break;
                    }
                }
            });
        } else {
            sVar5.y(null);
        }
        s sVar6 = new s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt", uVar, c0473a);
        if (c0065n == null) {
            sVar6.y(null);
        } else {
            final int i8 = 5;
            sVar6.y(new b() { // from class: M1.J
                @Override // C1.b
                public final void a(Object obj, A.c cVar) {
                    List d02;
                    List d03;
                    List d04;
                    List d05;
                    List d06;
                    List d07;
                    switch (i8) {
                        case 0:
                            C0065n c0065n2 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                            try {
                                ((C0055d) c0065n2.f1145a.f1032c).a(((Long) obj2).longValue(), new Z(c0065n2));
                                d02 = E2.a.B(null);
                            } catch (Throwable th) {
                                if (th instanceof C0052a) {
                                    C0052a c0052a = th;
                                    d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                                } else {
                                    d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), B1.e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                                }
                            }
                            cVar.e(d02);
                            break;
                        case 1:
                            C0065n c0065n3 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj3 = list.get(0);
                            a2.h.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z3 = (Z) obj3;
                            Object obj4 = list.get(1);
                            a2.h.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            try {
                                c0065n3.getClass();
                                z3.f1065c = booleanValue;
                                d03 = E2.a.B(null);
                            } catch (Throwable th2) {
                                if (th2 instanceof C0052a) {
                                    C0052a c0052a2 = th2;
                                    d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                                } else {
                                    d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                                }
                            }
                            cVar.e(d03);
                            break;
                        case 2:
                            C0065n c0065n4 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            a2.h.c(obj5, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z4 = (Z) obj5;
                            Object obj6 = list2.get(1);
                            a2.h.c(obj6, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj6).booleanValue();
                            try {
                                c0065n4.getClass();
                                z4.f1066d = booleanValue2;
                                d04 = E2.a.B(null);
                            } catch (Throwable th3) {
                                if (th3 instanceof C0052a) {
                                    C0052a c0052a3 = th3;
                                    d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                                } else {
                                    d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), B1.e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                                }
                            }
                            cVar.e(d04);
                            break;
                        case 3:
                            C0065n c0065n5 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj;
                            Object obj7 = list3.get(0);
                            a2.h.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z5 = (Z) obj7;
                            Object obj8 = list3.get(1);
                            a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue3 = ((Boolean) obj8).booleanValue();
                            try {
                                c0065n5.getClass();
                                z5.f1067e = booleanValue3;
                                d05 = E2.a.B(null);
                            } catch (Throwable th4) {
                                if (th4 instanceof C0052a) {
                                    C0052a c0052a4 = th4;
                                    d05 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                                } else {
                                    d05 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                                }
                            }
                            cVar.e(d05);
                            break;
                        case 4:
                            C0065n c0065n6 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj9 = list4.get(0);
                            a2.h.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z6 = (Z) obj9;
                            Object obj10 = list4.get(1);
                            a2.h.c(obj10, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue4 = ((Boolean) obj10).booleanValue();
                            try {
                                c0065n6.getClass();
                                z6.f1068f = booleanValue4;
                                d06 = E2.a.B(null);
                            } catch (Throwable th5) {
                                if (th5 instanceof C0052a) {
                                    C0052a c0052a5 = th5;
                                    d06 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                                } else {
                                    d06 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                                }
                            }
                            cVar.e(d06);
                            break;
                        default:
                            C0065n c0065n7 = c0065n;
                            a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj11 = list5.get(0);
                            a2.h.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
                            Z z7 = (Z) obj11;
                            Object obj12 = list5.get(1);
                            a2.h.c(obj12, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue5 = ((Boolean) obj12).booleanValue();
                            try {
                                c0065n7.getClass();
                                z7.f1069g = booleanValue5;
                                d07 = E2.a.B(null);
                            } catch (Throwable th6) {
                                if (th6 instanceof C0052a) {
                                    C0052a c0052a6 = th6;
                                    d07 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                                } else {
                                    d07 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                                }
                            }
                            cVar.e(d07);
                            break;
                    }
                }
            });
        }
    }

    public static void T(Parcel parcel, int i3) {
        parcel.setDataPosition(parcel.dataPosition() + J(parcel, i3));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final I.f U(CharSequence charSequence, String str) {
        switch (str.hashCode()) {
            case -781118336:
                if (str.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new I.e(charSequence);
                }
                break;
            case -408155724:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new I.i(charSequence);
                }
                break;
            case -45448328:
                if (str.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new I.g(charSequence);
                }
                break;
            case 580557411:
                if (str.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new d(charSequence);
                }
                break;
            case 627896683:
                if (str.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new j(charSequence);
                }
                break;
            case 1594095913:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new I.h(charSequence);
                }
                break;
        }
        if (!str.startsWith("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION")) {
            return new I.e(charSequence, str);
        }
        int i3 = K.b.f632l;
        String obj = charSequence != null ? charSequence.toString() : null;
        try {
            if (!str.startsWith("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION")) {
                throw new L.a();
            }
            int i4 = K.b.f632l;
            return h(str, obj);
        } catch (L.a unused) {
            return new I.e(obj, str);
        }
    }

    public static String V(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static int W(Parcel parcel) {
        int readInt = parcel.readInt();
        int J2 = J(parcel, readInt);
        char c3 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c3 != 20293) {
            throw new D0.a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i3 = J2 + dataPosition;
        if (i3 >= dataPosition && i3 <= parcel.dataSize()) {
            return i3;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i3).length());
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i3);
        throw new D0.a(sb.toString(), parcel);
    }

    public static ActionMode.Callback X(ActionMode.Callback callback, TextView textView) {
        int i3 = Build.VERSION.SDK_INT;
        return (i3 < 26 || i3 > 27 || (callback instanceof G.h) || callback == null) ? callback : new G.h(callback, textView);
    }

    public static ArrayList Y(DisplayManager displayManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new ArrayList();
        }
        try {
            Field declaredField = DisplayManager.class.getDeclaredField("mGlobal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(displayManager);
            Field declaredField2 = obj.getClass().getDeclaredField("mDisplayListeners");
            declaredField2.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField2.get(obj);
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            Field field = null;
            int i3 = 0;
            while (i3 < size) {
                Object obj2 = arrayList.get(i3);
                i3++;
                if (field == null) {
                    field = obj2.getClass().getField("mListener");
                    field.setAccessible(true);
                }
                arrayList2.add((DisplayManager.DisplayListener) field.get(obj2));
            }
            return arrayList2;
        } catch (IllegalAccessException | NoSuchFieldException e3) {
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e3);
            return new ArrayList();
        }
    }

    public static String Z(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length || (indexOf = str.indexOf("%s", i4)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i4, indexOf);
            sb.append(b0(objArr[i3]));
            i4 = indexOf + 2;
            i3++;
        }
        sb.append((CharSequence) str, i4, str.length());
        if (i3 < length) {
            String str2 = " [";
            while (i3 < objArr.length) {
                sb.append(str2);
                sb.append(b0(objArr[i3]));
                i3++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final C0259b a(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new C0259b(swipeEdge, progress, touchX, touchY, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static void a0(Parcel parcel, int i3, int i4) {
        int J2 = J(parcel, i3);
        if (J2 == i4) {
            return;
        }
        String hexString = Integer.toHexString(J2);
        int length = String.valueOf(i4).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(J2).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i4);
        sb.append(" got ");
        sb.append(J2);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new D0.a(sb.toString(), parcel);
    }

    public static void b(Throwable th, Throwable th2) {
        h.e(th, "<this>");
        h.e(th2, "exception");
        if (th != th2) {
            Integer num = V1.a.f1533a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = U1.a.f1287a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static String b0(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e3) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append("@");
            sb.append(hexString);
            String sb2 = sb.toString();
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(sb2), (Throwable) e3);
            String name2 = e3.getClass().getName();
            StringBuilder sb3 = new StringBuilder(sb2.length() + 8 + name2.length() + 1);
            sb3.append("<");
            sb3.append(sb2);
            sb3.append(" threw ");
            sb3.append(name2);
            sb3.append(">");
            return sb3.toString();
        }
    }

    public static Bitmap c(Bitmap bitmap, int i3) {
        if (bitmap != null) {
            switch (i3) {
                case 1:
                case 3:
                case 6:
                case 8:
                    break;
                case 2:
                case 4:
                case 5:
                case 7:
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    Matrix matrix = new Matrix();
                    if (i3 == 2) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i3 == 7) {
                        matrix.setScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
                    } else if (i3 == 4) {
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    } else if (i3 == 5) {
                        matrix.setScale(1.0f, -1.0f, width / 2.0f, height / 2.0f);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                    if (createBitmap != bitmap) {
                        bitmap.recycle();
                        break;
                    }
                    break;
                default:
                    Log.e("ImageUtils", "Unknown EXIF orientation: " + i3);
                    break;
            }
            return bitmap;
        }
        return bitmap;
    }

    public static Object d(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static Bundle f(Parcel parcel, int i3) {
        int J2 = J(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (J2 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + J2);
        return readBundle;
    }

    public static byte[] g(Parcel parcel, int i3) {
        int J2 = J(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (J2 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + J2);
        return createByteArray;
    }

    public static I.f h(String str, String str2) {
        Exception i3;
        try {
            K.b bVar = new K.b(new J.a(26), null);
            if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(0), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(1), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(2), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(3), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(4), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(5), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(6), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(7), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(8), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(9), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(10), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(11), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(12), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(13), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(14), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(15), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(16), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(17), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(18), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(19), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(20), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(21), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(22), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(23), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(24), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(25), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(26), str2, bVar);
            } else if (str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                i3 = AbstractC0102a.i(new J.a(27), str2, bVar);
            } else {
                if (!str.equals("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new L.a();
                }
                i3 = AbstractC0102a.i(new J.a(28), str2, bVar);
            }
            return (I.f) i3;
        } catch (L.a unused) {
            return new I.e(str2, str);
        }
    }

    public static String i(Object obj, String str) {
        h.e(obj, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        return str + " value: " + obj;
    }

    public static Parcelable j(Parcel parcel, int i3, Parcelable.Creator creator) {
        int J2 = J(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (J2 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + J2);
        return parcelable;
    }

    public static String k(Parcel parcel, int i3) {
        int J2 = J(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (J2 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + J2);
        return readString;
    }

    public static ArrayList l(Parcel parcel, int i3) {
        int J2 = J(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (J2 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + J2);
        return createStringArrayList;
    }

    public static Object[] m(Parcel parcel, int i3, Parcelable.Creator creator) {
        int J2 = J(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (J2 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + J2);
        return createTypedArray;
    }

    public static ArrayList n(Parcel parcel, int i3, Parcelable.Creator creator) {
        int J2 = J(parcel, i3);
        int dataPosition = parcel.dataPosition();
        if (J2 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + J2);
        return createTypedArrayList;
    }

    public static String p(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static void r(Parcel parcel, int i3) {
        if (parcel.dataPosition() == i3) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i3);
        throw new D0.a(sb.toString(), parcel);
    }

    public static f s(f fVar, g gVar) {
        h.e(gVar, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        if (h.a(fVar.getKey(), gVar)) {
            return fVar;
        }
        return null;
    }

    public static final Class t(a2.e eVar) {
        Class a3 = eVar.a();
        h.c(a3, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return a3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class u(InterfaceC0248b interfaceC0248b) {
        h.e(interfaceC0248b, "<this>");
        Class a3 = ((a2.d) interfaceC0248b).a();
        if (a3.isPrimitive()) {
            String name = a3.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r0 >= 2) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int v(J1.e r5) {
        /*
            java.lang.Long r5 = r5.f588c
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L18
            r1 = 30
            if (r0 < r1) goto L14
            int r0 = B0.a.D()
            r1 = 2
            if (r0 < r1) goto L14
            goto L18
        L14:
            r0 = 2147483647(0x7fffffff, float:NaN)
            goto L1c
        L18:
            int r0 = E.c.a()
        L1c:
            if (r5 == 0) goto L30
            long r1 = r5.longValue()
            long r3 = (long) r0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L30
            long r0 = r5.longValue()
            int r5 = java.lang.Math.toIntExact(r0)
            return r5
        L30:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.a.v(J1.e):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r2 = r2.getRoundedCorner(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static D.C0016q w(android.view.Display r2, int r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L37
            android.view.RoundedCorner r2 = D.AbstractC0004e.j(r2, r3)
            if (r2 == 0) goto L37
            D.q r3 = new D.q
            int r0 = D.AbstractC0004e.c(r2)
            if (r0 == 0) goto L2a
            r1 = 1
            if (r0 == r1) goto L2b
            r1 = 2
            if (r0 == r1) goto L2b
            r1 = 3
            if (r0 != r1) goto L1e
            goto L2b
        L1e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Invalid position: "
            java.lang.String r3 = B1.e.g(r3, r0)
            r2.<init>(r3)
            throw r2
        L2a:
            r1 = 0
        L2b:
            int r0 = D.AbstractC0004e.s(r2)
            android.graphics.Point r2 = D.AbstractC0004e.d(r2)
            r3.<init>(r1, r0, r2)
            return r3
        L37:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.a.w(android.view.Display, int):D.q");
    }

    public static c x(C0357u c0357u) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            return new c(AbstractC0005f.l(c0357u));
        }
        TextPaint textPaint = new TextPaint(c0357u.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = c0357u.getBreakStrategy();
        int hyphenationFrequency = c0357u.getHyphenationFrequency();
        if (c0357u.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            if (i3 < 28 || (c0357u.getInputType() & 15) != 3) {
                boolean z3 = c0357u.getLayoutDirection() == 1;
                switch (c0357u.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z3) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            } else {
                byte directionality = Character.getDirectionality(AbstractC0005f.b(DecimalFormatSymbols.getInstance(c0357u.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            }
        }
        return new c(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static void y(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean z() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0440a.c();
        }
        try {
            if (f291b == null) {
                f290a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f291b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f291b.invoke(null, Long.valueOf(f290a))).booleanValue();
        } catch (Exception e3) {
            y("isTagEnabled", e3);
            return false;
        }
    }

    public abstract Object F(Intent intent, int i3);

    public abstract a L(String str, Z1.l lVar);

    public abstract void N(boolean z3);

    public abstract Object e();

    public abstract String o(byte[] bArr, int i3, int i4);

    public abstract int q(String str, byte[] bArr, int i3, int i4);

    public void M(boolean z3) {
    }
}
