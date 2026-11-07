package M1;

import D.C0002c;
import android.net.Uri;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.List;
import java.util.Objects;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class Z extends V {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f1063h = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C0065n f1064b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1065c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1066d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1067e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1068f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1069g = false;

    public Z(C0065n c0065n) {
        this.f1064b = c0065n;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C0068q c0068q = new C0068q(1);
        C0065n c0065n = this.f1064b;
        c0065n.getClass();
        a2.h.e(consoleMessage, "messageArg");
        O o2 = c0065n.f1145a;
        o2.getClass();
        if (((C0055d) o2.f1032c).d(this)) {
            new B1.s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage", o2.a(), null).x(P1.f.d0(this, consoleMessage), new C0002c(c0068q, 20));
        } else {
            B1.e.r("missing-instance-error", "Callback to `WebChromeClient.onConsoleMessage` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
        }
        return this.f1066d;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        C0068q c0068q = new C0068q(1);
        C0065n c0065n = this.f1064b;
        c0065n.getClass();
        O o2 = c0065n.f1145a;
        o2.getClass();
        if (((C0055d) o2.f1032c).d(this)) {
            new B1.s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt", o2.a(), null).x(E2.a.B(this), new C0002c(c0068q, 22));
        } else {
            B1.e.r("missing-instance-error", "Callback to `WebChromeClient.onGeolocationPermissionsHidePrompt` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        C0068q c0068q = new C0068q(1);
        C0065n c0065n = this.f1064b;
        c0065n.getClass();
        a2.h.e(str, "originArg");
        a2.h.e(callback, "callbackArg");
        O o2 = c0065n.f1145a;
        o2.getClass();
        if (((C0055d) o2.f1032c).d(this)) {
            new B1.s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt", o2.a(), null).x(P1.f.d0(this, str, callback), new C0002c(c0068q, 21));
        } else {
            B1.e.r("missing-instance-error", "Callback to `WebChromeClient.onGeolocationPermissionsShowPrompt` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        C0068q c0068q = new C0068q(1);
        C0065n c0065n = this.f1064b;
        c0065n.getClass();
        O o2 = c0065n.f1145a;
        o2.getClass();
        if (((C0055d) o2.f1032c).d(this)) {
            new B1.s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView", o2.a(), null).x(E2.a.B(this), new C0002c(c0068q, 16));
        } else {
            B1.e.r("missing-instance-error", "Callback to `WebChromeClient.onHideCustomView` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (!this.f1067e) {
            return false;
        }
        W w3 = new W(this, jsResult, 1);
        P p3 = new P(w3, 0);
        C0065n c0065n = this.f1064b;
        c0065n.getClass();
        a2.h.e(webView, "webViewArg");
        a2.h.e(str, "urlArg");
        a2.h.e(str2, "messageArg");
        O o2 = c0065n.f1145a;
        o2.getClass();
        if (((C0055d) o2.f1032c).d(this)) {
            new B1.s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert", o2.a(), null).x(P1.f.d0(this, webView, str, str2), new I(p3, 1));
            return true;
        }
        Throwable a3 = O1.d.a(H2.h.i(new C0052a("missing-instance-error", "Callback to `WebChromeClient.onJsAlert` failed because native instance was not in the instance manager.", StringUtils.EMPTY)));
        O o3 = w3.f1055l.f1064b.f1145a;
        Objects.requireNonNull(a3);
        o3.getClass();
        O.d(a3);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (!this.f1068f) {
            return false;
        }
        W w3 = new W(this, jsResult, 0);
        P p3 = new P(w3, 0);
        C0065n c0065n = this.f1064b;
        c0065n.getClass();
        a2.h.e(webView, "webViewArg");
        a2.h.e(str, "urlArg");
        a2.h.e(str2, "messageArg");
        O o2 = c0065n.f1145a;
        o2.getClass();
        if (((C0055d) o2.f1032c).d(this)) {
            new B1.s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm", o2.a(), null).x(P1.f.d0(this, webView, str, str2), new I(p3, 3));
            return true;
        }
        Throwable a3 = O1.d.a(H2.h.i(new C0052a("missing-instance-error", "Callback to `WebChromeClient.onJsConfirm` failed because native instance was not in the instance manager.", StringUtils.EMPTY)));
        O o3 = w3.f1055l.f1064b.f1145a;
        Objects.requireNonNull(a3);
        o3.getClass();
        O.d(a3);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (!this.f1069g) {
            return false;
        }
        X x = new X(this, jsPromptResult, 0);
        P p3 = new P(x, 0);
        C0065n c0065n = this.f1064b;
        c0065n.getClass();
        a2.h.e(webView, "webViewArg");
        a2.h.e(str, "urlArg");
        a2.h.e(str2, "messageArg");
        a2.h.e(str3, "defaultValueArg");
        O o2 = c0065n.f1145a;
        o2.getClass();
        if (((C0055d) o2.f1032c).d(this)) {
            new B1.s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt", o2.a(), null).x(P1.f.d0(this, webView, str, str2, str3), new I(p3, 0));
            return true;
        }
        Throwable a3 = O1.d.a(H2.h.i(new C0052a("missing-instance-error", "Callback to `WebChromeClient.onJsPrompt` failed because native instance was not in the instance manager.", StringUtils.EMPTY)));
        O o3 = ((Z) x.f1058l).f1064b.f1145a;
        Objects.requireNonNull(a3);
        o3.getClass();
        O.d(a3);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        C0068q c0068q = new C0068q(1);
        C0065n c0065n = this.f1064b;
        c0065n.getClass();
        a2.h.e(permissionRequest, "requestArg");
        O o2 = c0065n.f1145a;
        o2.getClass();
        if (((C0055d) o2.f1032c).d(this)) {
            new B1.s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest", o2.a(), null).x(P1.f.d0(this, permissionRequest), new C0002c(c0068q, 18));
        } else {
            B1.e.r("missing-instance-error", "Callback to `WebChromeClient.onPermissionRequest` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i3) {
        long j3 = i3;
        C0068q c0068q = new C0068q(1);
        C0065n c0065n = this.f1064b;
        c0065n.getClass();
        a2.h.e(webView, "webViewArg");
        O o2 = c0065n.f1145a;
        o2.getClass();
        if (((C0055d) o2.f1032c).d(this)) {
            new B1.s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged", o2.a(), null).x(P1.f.d0(this, webView, Long.valueOf(j3)), new C0002c(c0068q, 17));
        } else {
            B1.e.r("missing-instance-error", "Callback to `WebChromeClient.onProgressChanged` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        C0068q c0068q = new C0068q(1);
        C0065n c0065n = this.f1064b;
        c0065n.getClass();
        a2.h.e(view, "viewArg");
        a2.h.e(customViewCallback, "callbackArg");
        O o2 = c0065n.f1145a;
        o2.getClass();
        if (((C0055d) o2.f1032c).d(this)) {
            new B1.s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView", o2.a(), null).x(P1.f.d0(this, view, customViewCallback), new C0002c(c0068q, 19));
        } else {
            B1.e.r("missing-instance-error", "Callback to `WebChromeClient.onShowCustomView` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, final ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        final boolean z3 = this.f1065c;
        Z1.l lVar = new Z1.l() { // from class: M1.Y
            @Override // Z1.l
            public final Object f(Object obj) {
                Q q3 = (Q) obj;
                if (q3.f1040d) {
                    O o2 = Z.this.f1064b.f1145a;
                    Throwable th = q3.f1039c;
                    Objects.requireNonNull(th);
                    o2.getClass();
                    O.d(th);
                    return null;
                }
                List list = (List) q3.f1038b;
                Objects.requireNonNull(list);
                if (!z3) {
                    return null;
                }
                Uri[] uriArr = new Uri[list.size()];
                for (int i3 = 0; i3 < list.size(); i3++) {
                    uriArr[i3] = Uri.parse((String) list.get(i3));
                }
                valueCallback.onReceiveValue(uriArr);
                return null;
            }
        };
        P p3 = new P(lVar, 0);
        C0065n c0065n = this.f1064b;
        c0065n.getClass();
        a2.h.e(webView, "webViewArg");
        a2.h.e(fileChooserParams, "paramsArg");
        O o2 = c0065n.f1145a;
        o2.getClass();
        if (((C0055d) o2.f1032c).d(this)) {
            new B1.s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser", o2.a(), null).x(P1.f.d0(this, webView, fileChooserParams), new I(p3, 2));
            return z3;
        }
        lVar.f(new Q(H2.h.i(new C0052a("missing-instance-error", "Callback to `WebChromeClient.onShowFileChooser` failed because native instance was not in the instance manager.", StringUtils.EMPTY))));
        return z3;
    }
}
