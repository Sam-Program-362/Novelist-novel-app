package D;

import M1.C0052a;
import android.content.Context;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.pipes.PipesServer;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;

/* renamed from: D.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0002c implements C1.b, C1.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f225k;

    public static Y0.b b(Context context) {
        M0.r.f(context);
        return new Y0.b(context, new F0.k());
    }

    @Override // C1.b
    public void a(Object obj, A.c cVar) {
        List d02;
        List d03;
        List d04;
        List d05;
        List d06;
        List d07;
        List d08;
        List d09;
        List d010;
        List d011;
        List d012;
        switch (this.f225k) {
            case 5:
                a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                a2.h.c(obj2, "null cannot be cast to non-null type android.os.Message");
                try {
                    ((Message) obj2).sendToTarget();
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
                return;
            case 6:
                a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj3 = ((List) obj).get(0);
                a2.h.c(obj3, "null cannot be cast to non-null type java.security.cert.Certificate");
                try {
                    try {
                        d03 = E2.a.B(((Certificate) obj3).getEncoded());
                    } catch (CertificateEncodingException e3) {
                        throw new RuntimeException(e3);
                    }
                } catch (Throwable th2) {
                    if (th2 instanceof C0052a) {
                        C0052a c0052a2 = th2;
                        d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                    } else {
                        d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), B1.e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                    }
                }
                cVar.e(d03);
                return;
            case 7:
                a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj4 = ((List) obj).get(0);
                a2.h.c(obj4, "null cannot be cast to non-null type android.webkit.WebChromeClient.CustomViewCallback");
                try {
                    ((WebChromeClient.CustomViewCallback) obj4).onCustomViewHidden();
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
                return;
            case 8:
            case 10:
            case 16:
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
            case 18:
            case 19:
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
            case 21:
            case 22:
            default:
                a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj5 = ((List) obj).get(0);
                a2.h.c(obj5, "null cannot be cast to non-null type android.webkit.WebStorage");
                try {
                    ((WebStorage) obj5).deleteAllData();
                    d012 = E2.a.B(null);
                } catch (Throwable th4) {
                    if (th4 instanceof C0052a) {
                        C0052a c0052a4 = th4;
                        d012 = P1.f.d0(c0052a4.f1070k, c0052a4.f1071l, c0052a4.f1072m);
                    } else {
                        d012 = P1.f.d0(th4.getClass().getSimpleName(), th4.toString(), B1.e.l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                    }
                }
                cVar.e(d012);
                return;
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj6 = list.get(0);
                a2.h.c(obj6, "null cannot be cast to non-null type android.webkit.GeolocationPermissions.Callback");
                GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj6;
                Object obj7 = list.get(1);
                a2.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj7;
                Object obj8 = list.get(2);
                a2.h.c(obj8, "null cannot be cast to non-null type kotlin.Boolean");
                boolean booleanValue = ((Boolean) obj8).booleanValue();
                Object obj9 = list.get(3);
                a2.h.c(obj9, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    callback.invoke(str, booleanValue, ((Boolean) obj9).booleanValue());
                    d05 = E2.a.B(null);
                } catch (Throwable th5) {
                    if (th5 instanceof C0052a) {
                        C0052a c0052a5 = th5;
                        d05 = P1.f.d0(c0052a5.f1070k, c0052a5.f1071l, c0052a5.f1072m);
                    } else {
                        d05 = P1.f.d0(th5.getClass().getSimpleName(), th5.toString(), B1.e.l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                    }
                }
                cVar.e(d05);
                return;
            case 11:
                a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj10 = list2.get(0);
                a2.h.c(obj10, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                PermissionRequest permissionRequest = (PermissionRequest) obj10;
                Object obj11 = list2.get(1);
                a2.h.c(obj11, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                try {
                    permissionRequest.grant((String[]) ((List) obj11).toArray(new String[0]));
                    d06 = E2.a.B(null);
                } catch (Throwable th6) {
                    if (th6 instanceof C0052a) {
                        C0052a c0052a6 = th6;
                        d06 = P1.f.d0(c0052a6.f1070k, c0052a6.f1071l, c0052a6.f1072m);
                    } else {
                        d06 = P1.f.d0(th6.getClass().getSimpleName(), th6.toString(), B1.e.l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                    }
                }
                cVar.e(d06);
                return;
            case 12:
                a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj12 = ((List) obj).get(0);
                a2.h.c(obj12, "null cannot be cast to non-null type android.webkit.PermissionRequest");
                try {
                    ((PermissionRequest) obj12).deny();
                    d07 = E2.a.B(null);
                } catch (Throwable th7) {
                    if (th7 instanceof C0052a) {
                        C0052a c0052a7 = th7;
                        d07 = P1.f.d0(c0052a7.f1070k, c0052a7.f1071l, c0052a7.f1072m);
                    } else {
                        d07 = P1.f.d0(th7.getClass().getSimpleName(), th7.toString(), B1.e.l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                    }
                }
                cVar.e(d07);
                return;
            case 13:
                a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj13 = ((List) obj).get(0);
                a2.h.c(obj13, "null cannot be cast to non-null type android.net.http.SslError");
                try {
                    int primaryError = ((SslError) obj13).getPrimaryError();
                    d08 = E2.a.B(primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? M1.S.f1047s : M1.S.f1044p : M1.S.f1042m : M1.S.f1046r : M1.S.f1043o : M1.S.n : M1.S.f1045q);
                } catch (Throwable th8) {
                    if (th8 instanceof C0052a) {
                        C0052a c0052a8 = th8;
                        d08 = P1.f.d0(c0052a8.f1070k, c0052a8.f1071l, c0052a8.f1072m);
                    } else {
                        d08 = P1.f.d0(th8.getClass().getSimpleName(), th8.toString(), B1.e.l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                    }
                }
                cVar.e(d08);
                return;
            case 14:
                a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj14 = ((List) obj).get(0);
                a2.h.c(obj14, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj14).cancel();
                    d09 = E2.a.B(null);
                } catch (Throwable th9) {
                    if (th9 instanceof C0052a) {
                        C0052a c0052a9 = th9;
                        d09 = P1.f.d0(c0052a9.f1070k, c0052a9.f1071l, c0052a9.f1072m);
                    } else {
                        d09 = P1.f.d0(th9.getClass().getSimpleName(), th9.toString(), B1.e.l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                    }
                }
                cVar.e(d09);
                return;
            case 15:
                a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj15 = ((List) obj).get(0);
                a2.h.c(obj15, "null cannot be cast to non-null type android.webkit.SslErrorHandler");
                try {
                    ((SslErrorHandler) obj15).proceed();
                    d010 = E2.a.B(null);
                } catch (Throwable th10) {
                    if (th10 instanceof C0052a) {
                        C0052a c0052a10 = th10;
                        d010 = P1.f.d0(c0052a10.f1070k, c0052a10.f1071l, c0052a10.f1072m);
                    } else {
                        d010 = P1.f.d0(th10.getClass().getSimpleName(), th10.toString(), B1.e.l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                    }
                }
                cVar.e(d010);
                return;
            case 23:
                a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list3 = (List) obj;
                Object obj16 = list3.get(0);
                a2.h.c(obj16, "null cannot be cast to non-null type android.webkit.WebSettings");
                WebSettings webSettings = (WebSettings) obj16;
                Object obj17 = list3.get(1);
                a2.h.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                try {
                    M1.A.l(webSettings, ((Boolean) obj17).booleanValue());
                    d011 = E2.a.B(null);
                } catch (Throwable th11) {
                    if (th11 instanceof C0052a) {
                        C0052a c0052a11 = th11;
                        d011 = P1.f.d0(c0052a11.f1070k, c0052a11.f1071l, c0052a11.f1072m);
                    } else {
                        d011 = P1.f.d0(th11.getClass().getSimpleName(), th11.toString(), B1.e.l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                    }
                }
                cVar.e(d011);
                return;
        }
    }

    @Override // C1.c
    public void e(Object obj) {
        switch (this.f225k) {
            case 8:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.DownloadListener.onDownloadStart'.", StringUtils.EMPTY);
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj2 = list.get(0);
                        a2.h.c(obj2, "null cannot be cast to non-null type kotlin.String");
                        Object obj3 = list.get(1);
                        a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj2, (String) obj3, (String) list.get(2)));
                        break;
                    }
                }
                break;
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 23:
            case 24:
            default:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted'.", StringUtils.EMPTY);
                    int i3 = M1.g0.f1114c;
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() <= 1) {
                        int i4 = M1.g0.f1114c;
                        break;
                    } else {
                        Object obj4 = list2.get(0);
                        a2.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        Object obj5 = list2.get(1);
                        a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj4, (String) obj5, (String) list2.get(2)));
                        int i5 = M1.g0.f1114c;
                        break;
                    }
                }
            case 10:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.postMessage'.", StringUtils.EMPTY);
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj6 = list3.get(0);
                        a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        Object obj7 = list3.get(1);
                        a2.h.c(obj7, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj6, (String) obj7, (String) list3.get(2)));
                        break;
                    }
                }
                break;
            case 16:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView'.", StringUtils.EMPTY);
                    int i6 = M1.Z.f1063h;
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() <= 1) {
                        int i7 = M1.Z.f1063h;
                        break;
                    } else {
                        Object obj8 = list4.get(0);
                        a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list4.get(1);
                        a2.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj8, (String) obj9, (String) list4.get(2)));
                        int i8 = M1.Z.f1063h;
                        break;
                    }
                }
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged'.", StringUtils.EMPTY);
                    int i9 = M1.Z.f1063h;
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() <= 1) {
                        int i10 = M1.Z.f1063h;
                        break;
                    } else {
                        Object obj10 = list5.get(0);
                        a2.h.c(obj10, "null cannot be cast to non-null type kotlin.String");
                        Object obj11 = list5.get(1);
                        a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj10, (String) obj11, (String) list5.get(2)));
                        int i11 = M1.Z.f1063h;
                        break;
                    }
                }
            case 18:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest'.", StringUtils.EMPTY);
                    int i12 = M1.Z.f1063h;
                    break;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() <= 1) {
                        int i13 = M1.Z.f1063h;
                        break;
                    } else {
                        Object obj12 = list6.get(0);
                        a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        Object obj13 = list6.get(1);
                        a2.h.c(obj13, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj12, (String) obj13, (String) list6.get(2)));
                        int i14 = M1.Z.f1063h;
                        break;
                    }
                }
            case 19:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView'.", StringUtils.EMPTY);
                    int i15 = M1.Z.f1063h;
                    break;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() <= 1) {
                        int i16 = M1.Z.f1063h;
                        break;
                    } else {
                        Object obj14 = list7.get(0);
                        a2.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list7.get(1);
                        a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj14, (String) obj15, (String) list7.get(2)));
                        int i17 = M1.Z.f1063h;
                        break;
                    }
                }
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage'.", StringUtils.EMPTY);
                    int i18 = M1.Z.f1063h;
                    break;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() <= 1) {
                        int i19 = M1.Z.f1063h;
                        break;
                    } else {
                        Object obj16 = list8.get(0);
                        a2.h.c(obj16, "null cannot be cast to non-null type kotlin.String");
                        Object obj17 = list8.get(1);
                        a2.h.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj16, (String) obj17, (String) list8.get(2)));
                        int i20 = M1.Z.f1063h;
                        break;
                    }
                }
            case 21:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt'.", StringUtils.EMPTY);
                    int i21 = M1.Z.f1063h;
                    break;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() <= 1) {
                        int i22 = M1.Z.f1063h;
                        break;
                    } else {
                        Object obj18 = list9.get(0);
                        a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        Object obj19 = list9.get(1);
                        a2.h.c(obj19, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj18, (String) obj19, (String) list9.get(2)));
                        int i23 = M1.Z.f1063h;
                        break;
                    }
                }
            case 22:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt'.", StringUtils.EMPTY);
                    int i24 = M1.Z.f1063h;
                    break;
                } else {
                    List list10 = (List) obj;
                    if (list10.size() <= 1) {
                        int i25 = M1.Z.f1063h;
                        break;
                    } else {
                        Object obj20 = list10.get(0);
                        a2.h.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list10.get(1);
                        a2.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj20, (String) obj21, (String) list10.get(2)));
                        int i26 = M1.Z.f1063h;
                        break;
                    }
                }
            case 25:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged'.", StringUtils.EMPTY);
                    int i27 = M1.k0.n;
                    break;
                } else {
                    List list11 = (List) obj;
                    if (list11.size() <= 1) {
                        int i28 = M1.k0.n;
                        break;
                    } else {
                        Object obj22 = list11.get(0);
                        a2.h.c(obj22, "null cannot be cast to non-null type kotlin.String");
                        Object obj23 = list11.get(1);
                        a2.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj22, (String) obj23, (String) list11.get(2)));
                        int i29 = M1.k0.n;
                        break;
                    }
                }
            case 26:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError'.", StringUtils.EMPTY);
                    int i30 = M1.g0.f1114c;
                    break;
                } else {
                    List list12 = (List) obj;
                    if (list12.size() <= 1) {
                        int i31 = M1.g0.f1114c;
                        break;
                    } else {
                        Object obj24 = list12.get(0);
                        a2.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        Object obj25 = list12.get(1);
                        a2.h.c(obj25, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj24, (String) obj25, (String) list12.get(2)));
                        int i32 = M1.g0.f1114c;
                        break;
                    }
                }
            case 27:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource'.", StringUtils.EMPTY);
                    int i33 = M1.g0.f1114c;
                    break;
                } else {
                    List list13 = (List) obj;
                    if (list13.size() <= 1) {
                        int i34 = M1.g0.f1114c;
                        break;
                    } else {
                        Object obj26 = list13.get(0);
                        a2.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list13.get(1);
                        a2.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj26, (String) obj27, (String) list13.get(2)));
                        int i35 = M1.g0.f1114c;
                        break;
                    }
                }
            case 28:
                if (!(obj instanceof List)) {
                    B1.e.r("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest'.", StringUtils.EMPTY);
                    int i36 = M1.g0.f1114c;
                    break;
                } else {
                    List list14 = (List) obj;
                    if (list14.size() <= 1) {
                        int i37 = M1.g0.f1114c;
                        break;
                    } else {
                        Object obj28 = list14.get(0);
                        a2.h.c(obj28, "null cannot be cast to non-null type kotlin.String");
                        Object obj29 = list14.get(1);
                        a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj28, (String) obj29, (String) list14.get(2)));
                        int i38 = M1.g0.f1114c;
                        break;
                    }
                }
        }
    }

    public /* synthetic */ C0002c(Object obj, int i3) {
        this.f225k = i3;
    }
}
