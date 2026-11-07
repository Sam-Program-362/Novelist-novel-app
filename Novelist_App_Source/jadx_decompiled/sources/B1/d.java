package B1;

import M0.E;
import M1.C0052a;
import M1.C0055d;
import M1.C0058g;
import M1.C0060i;
import M1.C0069s;
import M1.C0074x;
import M1.K;
import M1.S;
import a.AbstractC0102a;
import android.net.http.SslError;
import android.util.Log;
import java.util.List;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.pipes.PipesServer;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements C1.c, g1.c, g1.d, C1.b {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f83k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f84l;

    public /* synthetic */ d(Object obj, int i3) {
        this.f83k = i3;
        this.f84l = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // C1.b
    public void a(Object obj, A.c cVar) {
        List d02;
        List d03;
        List d04;
        switch (this.f83k) {
            case 13:
                C0069s c0069s = (C0069s) this.f84l;
                a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object obj2 = ((List) obj).get(0);
                a2.h.c(obj2, "null cannot be cast to non-null type kotlin.Long");
                try {
                    ((C0055d) c0069s.f1156a.f1032c).a(((Long) obj2).longValue(), new M1.r(c0069s));
                    d02 = E2.a.B(null);
                } catch (Throwable th) {
                    if (th instanceof C0052a) {
                        C0052a c0052a = th;
                        d02 = P1.f.d0(c0052a.f1070k, c0052a.f1071l, c0052a.f1072m);
                    } else {
                        d02 = P1.f.d0(th.getClass().getSimpleName(), th.toString(), e.l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                    }
                }
                cVar.e(d02);
                return;
            case 18:
                C0069s c0069s2 = (C0069s) this.f84l;
                a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj3 = list.get(0);
                a2.h.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                long longValue = ((Long) obj3).longValue();
                Object obj4 = list.get(1);
                a2.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                try {
                    ((C0055d) c0069s2.f1156a.f1032c).a(longValue, new C0074x((String) obj4, c0069s2));
                    d03 = E2.a.B(null);
                } catch (Throwable th2) {
                    if (th2 instanceof C0052a) {
                        C0052a c0052a2 = th2;
                        d03 = P1.f.d0(c0052a2.f1070k, c0052a2.f1071l, c0052a2.f1072m);
                    } else {
                        d03 = P1.f.d0(th2.getClass().getSimpleName(), th2.toString(), e.l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                    }
                }
                cVar.e(d03);
                return;
            default:
                C0069s c0069s3 = (C0069s) this.f84l;
                a2.h.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                int i3 = 0;
                Object obj5 = list2.get(0);
                a2.h.c(obj5, "null cannot be cast to non-null type android.net.http.SslError");
                SslError sslError = (SslError) obj5;
                Object obj6 = list2.get(1);
                a2.h.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.SslErrorType");
                S s3 = (S) obj6;
                try {
                } catch (Throwable th3) {
                    if (th3 instanceof C0052a) {
                        C0052a c0052a3 = th3;
                        d04 = P1.f.d0(c0052a3.f1070k, c0052a3.f1071l, c0052a3.f1072m);
                    } else {
                        d04 = P1.f.d0(th3.getClass().getSimpleName(), th3.toString(), e.l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                    }
                }
                switch (s3.ordinal()) {
                    case 0:
                        i3 = 4;
                        d04 = E2.a.B(Boolean.valueOf(sslError.hasError(i3)));
                        cVar.e(d04);
                        return;
                    case 1:
                        i3 = 1;
                        d04 = E2.a.B(Boolean.valueOf(sslError.hasError(i3)));
                        cVar.e(d04);
                        return;
                    case 2:
                        i3 = 2;
                        d04 = E2.a.B(Boolean.valueOf(sslError.hasError(i3)));
                        cVar.e(d04);
                        return;
                    case 3:
                        i3 = 5;
                        d04 = E2.a.B(Boolean.valueOf(sslError.hasError(i3)));
                        cVar.e(d04);
                        return;
                    case 4:
                        d04 = E2.a.B(Boolean.valueOf(sslError.hasError(i3)));
                        cVar.e(d04);
                        return;
                    case 5:
                        i3 = 3;
                        d04 = E2.a.B(Boolean.valueOf(sslError.hasError(i3)));
                        cVar.e(d04);
                        return;
                    case 6:
                        c0069s3.f1156a.getClass();
                        throw new IllegalArgumentException(s3 + " doesn't represent a native value.");
                    default:
                        i3 = -1;
                        d04 = E2.a.B(Boolean.valueOf(sslError.hasError(i3)));
                        cVar.e(d04);
                        return;
                }
        }
    }

    @Override // g1.c
    public void b(Exception exc) {
        AbstractC0102a.o((I1.k) this.f84l, new I1.a(I1.b.n, exc.getMessage(), null));
    }

    @Override // g1.d
    public void c(Object obj) {
        switch (this.f83k) {
            case 4:
                ((M.d) this.f84l).f(obj);
                break;
            default:
                ((M.f) this.f84l).f(obj);
                break;
        }
    }

    @Override // C1.c
    public void e(Object obj) {
        switch (this.f83k) {
            case 0:
                K k3 = (K) this.f84l;
                boolean z3 = false;
                if (obj != null) {
                    try {
                        z3 = ((JSONObject) obj).getBoolean("handled");
                    } catch (JSONException e3) {
                        Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e3);
                    }
                }
                ((E) k3.f1024l).a(z3);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 13:
            case 18:
            case 24:
            default:
                Object obj2 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance'.", StringUtils.EMPTY, "WebResourceResponse", obj2);
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        Object obj3 = list.get(0);
                        a2.h.c(obj3, "null cannot be cast to non-null type kotlin.String");
                        Object obj4 = list.get(1);
                        a2.h.c(obj4, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj3, (String) obj4, (String) list.get(2)), "WebResourceResponse", obj2);
                        break;
                    }
                }
                break;
            case 6:
                long j3 = ((C0060i) this.f84l).f1120k;
                if (!(obj instanceof List)) {
                    H2.h.i(new C0052a("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference'.", StringUtils.EMPTY));
                    Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j3);
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() > 1) {
                        Object obj5 = list2.get(0);
                        a2.h.c(obj5, "null cannot be cast to non-null type kotlin.String");
                        Object obj6 = list2.get(1);
                        a2.h.c(obj6, "null cannot be cast to non-null type kotlin.String");
                        H2.h.i(new C0052a((String) obj5, (String) obj6, (String) list2.get(2)));
                        Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j3);
                        break;
                    }
                }
                break;
            case 7:
                Object obj7 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance'.", StringUtils.EMPTY, "AndroidMessage", obj7);
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        Object obj8 = list3.get(0);
                        a2.h.c(obj8, "null cannot be cast to non-null type kotlin.String");
                        Object obj9 = list3.get(1);
                        a2.h.c(obj9, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj8, (String) obj9, (String) list3.get(2)), "AndroidMessage", obj7);
                        break;
                    }
                }
                break;
            case 8:
                Object obj10 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance'.", StringUtils.EMPTY, "Certificate", obj10);
                    break;
                } else {
                    List list4 = (List) obj;
                    if (list4.size() > 1) {
                        Object obj11 = list4.get(0);
                        a2.h.c(obj11, "null cannot be cast to non-null type kotlin.String");
                        Object obj12 = list4.get(1);
                        a2.h.c(obj12, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj11, (String) obj12, (String) list4.get(2)), "Certificate", obj10);
                        break;
                    }
                }
                break;
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                Object obj13 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance'.", StringUtils.EMPTY, "ClientCertRequest", obj13);
                    break;
                } else {
                    List list5 = (List) obj;
                    if (list5.size() > 1) {
                        Object obj14 = list5.get(0);
                        a2.h.c(obj14, "null cannot be cast to non-null type kotlin.String");
                        Object obj15 = list5.get(1);
                        a2.h.c(obj15, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj14, (String) obj15, (String) list5.get(2)), "ClientCertRequest", obj13);
                        break;
                    }
                }
                break;
            case 10:
                Object obj16 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance'.", StringUtils.EMPTY, "ConsoleMessage", obj16);
                    break;
                } else {
                    List list6 = (List) obj;
                    if (list6.size() > 1) {
                        Object obj17 = list6.get(0);
                        a2.h.c(obj17, "null cannot be cast to non-null type kotlin.String");
                        Object obj18 = list6.get(1);
                        a2.h.c(obj18, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj17, (String) obj18, (String) list6.get(2)), "ConsoleMessage", obj16);
                        break;
                    }
                }
                break;
            case 11:
                Object obj19 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance'.", StringUtils.EMPTY, "CookieManager", obj19);
                    break;
                } else {
                    List list7 = (List) obj;
                    if (list7.size() > 1) {
                        Object obj20 = list7.get(0);
                        a2.h.c(obj20, "null cannot be cast to non-null type kotlin.String");
                        Object obj21 = list7.get(1);
                        a2.h.c(obj21, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj20, (String) obj21, (String) list7.get(2)), "CookieManager", obj19);
                        break;
                    }
                }
                break;
            case 12:
                Object obj22 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance'.", StringUtils.EMPTY, "CustomViewCallback", obj22);
                    break;
                } else {
                    List list8 = (List) obj;
                    if (list8.size() > 1) {
                        Object obj23 = list8.get(0);
                        a2.h.c(obj23, "null cannot be cast to non-null type kotlin.String");
                        Object obj24 = list8.get(1);
                        a2.h.c(obj24, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj23, (String) obj24, (String) list8.get(2)), "CustomViewCallback", obj22);
                        break;
                    }
                }
                break;
            case 14:
                Object obj25 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance'.", StringUtils.EMPTY, "FileChooserParams", obj25);
                    break;
                } else {
                    List list9 = (List) obj;
                    if (list9.size() > 1) {
                        Object obj26 = list9.get(0);
                        a2.h.c(obj26, "null cannot be cast to non-null type kotlin.String");
                        Object obj27 = list9.get(1);
                        a2.h.c(obj27, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj26, (String) obj27, (String) list9.get(2)), "FileChooserParams", obj25);
                        break;
                    }
                }
                break;
            case 15:
                Object obj28 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance'.", StringUtils.EMPTY, "FlutterAssetManager", obj28);
                    break;
                } else {
                    List list10 = (List) obj;
                    if (list10.size() > 1) {
                        Object obj29 = list10.get(0);
                        a2.h.c(obj29, "null cannot be cast to non-null type kotlin.String");
                        Object obj30 = list10.get(1);
                        a2.h.c(obj30, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj29, (String) obj30, (String) list10.get(2)), "FlutterAssetManager", obj28);
                        break;
                    }
                }
                break;
            case 16:
                Object obj31 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance'.", StringUtils.EMPTY, "GeolocationPermissionsCallback", obj31);
                    break;
                } else {
                    List list11 = (List) obj;
                    if (list11.size() > 1) {
                        Object obj32 = list11.get(0);
                        a2.h.c(obj32, "null cannot be cast to non-null type kotlin.String");
                        Object obj33 = list11.get(1);
                        a2.h.c(obj33, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj32, (String) obj33, (String) list11.get(2)), "GeolocationPermissionsCallback", obj31);
                        break;
                    }
                }
                break;
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                Object obj34 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance'.", StringUtils.EMPTY, "HttpAuthHandler", obj34);
                    break;
                } else {
                    List list12 = (List) obj;
                    if (list12.size() > 1) {
                        Object obj35 = list12.get(0);
                        a2.h.c(obj35, "null cannot be cast to non-null type kotlin.String");
                        Object obj36 = list12.get(1);
                        a2.h.c(obj36, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj35, (String) obj36, (String) list12.get(2)), "HttpAuthHandler", obj34);
                        break;
                    }
                }
                break;
            case 19:
                Object obj37 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance'.", StringUtils.EMPTY, "PermissionRequest", obj37);
                    break;
                } else {
                    List list13 = (List) obj;
                    if (list13.size() > 1) {
                        Object obj38 = list13.get(0);
                        a2.h.c(obj38, "null cannot be cast to non-null type kotlin.String");
                        Object obj39 = list13.get(1);
                        a2.h.c(obj39, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj38, (String) obj39, (String) list13.get(2)), "PermissionRequest", obj37);
                        break;
                    }
                }
                break;
            case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                Object obj40 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance'.", StringUtils.EMPTY, "PrivateKey", obj40);
                    break;
                } else {
                    List list14 = (List) obj;
                    if (list14.size() > 1) {
                        Object obj41 = list14.get(0);
                        a2.h.c(obj41, "null cannot be cast to non-null type kotlin.String");
                        Object obj42 = list14.get(1);
                        a2.h.c(obj42, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj41, (String) obj42, (String) list14.get(2)), "PrivateKey", obj40);
                        break;
                    }
                }
                break;
            case 21:
                Object obj43 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance'.", StringUtils.EMPTY, "SslCertificate", obj43);
                    break;
                } else {
                    List list15 = (List) obj;
                    if (list15.size() > 1) {
                        Object obj44 = list15.get(0);
                        a2.h.c(obj44, "null cannot be cast to non-null type kotlin.String");
                        Object obj45 = list15.get(1);
                        a2.h.c(obj45, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj44, (String) obj45, (String) list15.get(2)), "SslCertificate", obj43);
                        break;
                    }
                }
                break;
            case 22:
                Object obj46 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance'.", StringUtils.EMPTY, "SslCertificateDName", obj46);
                    break;
                } else {
                    List list16 = (List) obj;
                    if (list16.size() > 1) {
                        Object obj47 = list16.get(0);
                        a2.h.c(obj47, "null cannot be cast to non-null type kotlin.String");
                        Object obj48 = list16.get(1);
                        a2.h.c(obj48, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj47, (String) obj48, (String) list16.get(2)), "SslCertificateDName", obj46);
                        break;
                    }
                }
                break;
            case 23:
                Object obj49 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance'.", StringUtils.EMPTY, "SslError", obj49);
                    break;
                } else {
                    List list17 = (List) obj;
                    if (list17.size() > 1) {
                        Object obj50 = list17.get(0);
                        a2.h.c(obj50, "null cannot be cast to non-null type kotlin.String");
                        Object obj51 = list17.get(1);
                        a2.h.c(obj51, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj50, (String) obj51, (String) list17.get(2)), "SslError", obj49);
                        break;
                    }
                }
                break;
            case 25:
                Object obj52 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance'.", StringUtils.EMPTY, "SslErrorHandler", obj52);
                    break;
                } else {
                    List list18 = (List) obj;
                    if (list18.size() > 1) {
                        Object obj53 = list18.get(0);
                        a2.h.c(obj53, "null cannot be cast to non-null type kotlin.String");
                        Object obj54 = list18.get(1);
                        a2.h.c(obj54, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj53, (String) obj54, (String) list18.get(2)), "SslErrorHandler", obj52);
                        break;
                    }
                }
                break;
            case 26:
                Object obj55 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance'.", StringUtils.EMPTY, "View", obj55);
                    break;
                } else {
                    List list19 = (List) obj;
                    if (list19.size() > 1) {
                        Object obj56 = list19.get(0);
                        a2.h.c(obj56, "null cannot be cast to non-null type kotlin.String");
                        Object obj57 = list19.get(1);
                        a2.h.c(obj57, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj56, (String) obj57, (String) list19.get(2)), "View", obj55);
                        break;
                    }
                }
                break;
            case 27:
                Object obj58 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance'.", StringUtils.EMPTY, "WebResourceError", obj58);
                    break;
                } else {
                    List list20 = (List) obj;
                    if (list20.size() > 1) {
                        Object obj59 = list20.get(0);
                        a2.h.c(obj59, "null cannot be cast to non-null type kotlin.String");
                        Object obj60 = list20.get(1);
                        a2.h.c(obj60, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj59, (String) obj60, (String) list20.get(2)), "WebResourceError", obj58);
                        break;
                    }
                }
                break;
            case 28:
                Object obj61 = ((C0058g) this.f84l).f1113l;
                if (!(obj instanceof List)) {
                    e.s("channel-error", "Unable to establish connection on channel: 'dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance'.", StringUtils.EMPTY, "WebResourceRequest", obj61);
                    break;
                } else {
                    List list21 = (List) obj;
                    if (list21.size() > 1) {
                        Object obj62 = list21.get(0);
                        a2.h.c(obj62, "null cannot be cast to non-null type kotlin.String");
                        Object obj63 = list21.get(1);
                        a2.h.c(obj63, "null cannot be cast to non-null type kotlin.String");
                        e.n(new C0052a((String) obj62, (String) obj63, (String) list21.get(2)), "WebResourceRequest", obj61);
                        break;
                    }
                }
                break;
        }
    }
}
