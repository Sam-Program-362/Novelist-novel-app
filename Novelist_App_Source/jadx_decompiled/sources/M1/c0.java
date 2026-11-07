package M1;

import D.C0002c;
import android.net.http.SslError;
import android.os.Message;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1082k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1083l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1084m;
    public final /* synthetic */ Object n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1085o;

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f1082k = i3;
        this.f1083l = obj;
        this.f1084m = obj2;
        this.n = obj3;
        this.f1085o = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1082k) {
            case 0:
                g0 g0Var = (g0) this.f1083l;
                WebView webView = (WebView) this.f1084m;
                Message message = (Message) this.n;
                Message message2 = (Message) this.f1085o;
                C0065n c0065n = g0Var.f1115a;
                C0068q c0068q = new C0068q(2);
                c0065n.getClass();
                a2.h.e(webView, "viewArg");
                a2.h.e(message, "dontResendArg");
                a2.h.e(message2, "resendArg");
                O o2 = c0065n.f1145a;
                o2.getClass();
                if (!((C0055d) o2.f1032c).d(g0Var)) {
                    B1.e.r("missing-instance-error", "Callback to `WebViewClient.onFormResubmission` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
                    break;
                } else {
                    new B1.s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission", o2.a(), null).x(P1.f.d0(g0Var, webView, message, message2), new N(c0068q, 6));
                    break;
                }
            case 1:
                g0 g0Var2 = (g0) this.f1083l;
                WebView webView2 = (WebView) this.f1084m;
                SslErrorHandler sslErrorHandler = (SslErrorHandler) this.n;
                SslError sslError = (SslError) this.f1085o;
                C0065n c0065n2 = g0Var2.f1115a;
                C0068q c0068q2 = new C0068q(2);
                c0065n2.getClass();
                a2.h.e(webView2, "viewArg");
                a2.h.e(sslErrorHandler, "handlerArg");
                a2.h.e(sslError, "errorArg");
                O o3 = c0065n2.f1145a;
                o3.getClass();
                if (!((C0055d) o3.f1032c).d(g0Var2)) {
                    B1.e.r("missing-instance-error", "Callback to `WebViewClient.onReceivedSslError` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
                    break;
                } else {
                    new B1.s((C1.f) o3.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError", o3.a(), null).x(P1.f.d0(g0Var2, webView2, sslErrorHandler, sslError), new N(c0068q2, 7));
                    break;
                }
            case 2:
                g0 g0Var3 = (g0) this.f1083l;
                WebView webView3 = (WebView) this.f1084m;
                WebResourceRequest webResourceRequest = (WebResourceRequest) this.n;
                WebResourceError webResourceError = (WebResourceError) this.f1085o;
                C0065n c0065n3 = g0Var3.f1115a;
                C0068q c0068q3 = new C0068q(2);
                c0065n3.getClass();
                a2.h.e(webView3, "webViewArg");
                a2.h.e(webResourceRequest, "requestArg");
                a2.h.e(webResourceError, "errorArg");
                O o4 = c0065n3.f1145a;
                o4.getClass();
                if (!((C0055d) o4.f1032c).d(g0Var3)) {
                    B1.e.r("missing-instance-error", "Callback to `WebViewClient.onReceivedRequestError` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
                    break;
                } else {
                    new B1.s((C1.f) o4.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError", o4.a(), null).x(P1.f.d0(g0Var3, webView3, webResourceRequest, webResourceError), new N(c0068q3, 3));
                    break;
                }
            case 3:
                g0 g0Var4 = (g0) this.f1083l;
                WebView webView4 = (WebView) this.f1084m;
                WebResourceRequest webResourceRequest2 = (WebResourceRequest) this.n;
                WebResourceResponse webResourceResponse = (WebResourceResponse) this.f1085o;
                C0065n c0065n4 = g0Var4.f1115a;
                C0068q c0068q4 = new C0068q(2);
                c0065n4.getClass();
                a2.h.e(webView4, "webViewArg");
                a2.h.e(webResourceRequest2, "requestArg");
                a2.h.e(webResourceResponse, "responseArg");
                O o5 = c0065n4.f1145a;
                o5.getClass();
                if (!((C0055d) o5.f1032c).d(g0Var4)) {
                    B1.e.r("missing-instance-error", "Callback to `WebViewClient.onReceivedHttpError` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
                    break;
                } else {
                    new B1.s((C1.f) o5.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError", o5.a(), null).x(P1.f.d0(g0Var4, webView4, webResourceRequest2, webResourceResponse), new C0002c(c0068q4, 26));
                    break;
                }
            default:
                B1.o oVar = (B1.o) this.f1083l;
                ((B1.o) oVar.f131b).a((String) this.f1084m, (String) this.n, this.f1085o);
                break;
        }
    }
}
