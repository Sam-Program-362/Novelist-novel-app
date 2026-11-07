package M1;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class g0 extends WebViewClient {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1114c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C0065n f1115a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1116b = false;

    public g0(C0065n c0065n) {
        this.f1115a = c0065n;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(final WebView webView, final String str, final boolean z3) {
        this.f1115a.f1145a.e(new Runnable() { // from class: M1.e0
            @Override // java.lang.Runnable
            public final void run() {
                g0 g0Var = g0.this;
                C0065n c0065n = g0Var.f1115a;
                C0068q c0068q = new C0068q(2);
                c0065n.getClass();
                WebView webView2 = webView;
                a2.h.e(webView2, "webViewArg");
                String str2 = str;
                a2.h.e(str2, "urlArg");
                O o2 = c0065n.f1145a;
                o2.getClass();
                if (!((C0055d) o2.f1032c).d(g0Var)) {
                    B1.e.r("missing-instance-error", "Callback to `WebViewClient.doUpdateVisitedHistory` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
                } else {
                    new B1.s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory", o2.a(), null).x(P1.f.d0(g0Var, webView2, str2, Boolean.valueOf(z3)), new N(c0068q, 9));
                }
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f1115a.f1145a.e(new c0(this, webView, message, message2, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        this.f1115a.f1145a.e(new a0(this, webView, str, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        this.f1115a.f1145a.e(new a0(this, webView, str, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.f1115a.f1145a.e(new a0(this, webView, str, 2));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f1115a.f1145a.e(new a0(this, webView, str, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.f1115a.f1145a.e(new b0(this, webView, clientCertRequest, 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f1115a.f1145a.e(new c0(this, webView, webResourceRequest, webResourceError, 2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f1115a.f1145a.e(new d0(this, webView, httpAuthHandler, str, str2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.f1115a.f1145a.e(new c0(this, webView, webResourceRequest, webResourceResponse, 3));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f1115a.f1145a.e(new d0(this, webView, str, str2, str3));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f1115a.f1145a.e(new c0(this, webView, sslErrorHandler, sslError, 1));
    }

    @Override // android.webkit.WebViewClient
    public final void onScaleChanged(final WebView webView, final float f3, final float f4) {
        this.f1115a.f1145a.e(new Runnable() { // from class: M1.f0
            @Override // java.lang.Runnable
            public final void run() {
                g0 g0Var = g0.this;
                C0065n c0065n = g0Var.f1115a;
                double d3 = f3;
                double d4 = f4;
                C0068q c0068q = new C0068q(2);
                c0065n.getClass();
                WebView webView2 = webView;
                a2.h.e(webView2, "viewArg");
                O o2 = c0065n.f1145a;
                o2.getClass();
                if (!((C0055d) o2.f1032c).d(g0Var)) {
                    B1.e.r("missing-instance-error", "Callback to `WebViewClient.onScaleChanged` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
                } else {
                    new B1.s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged", o2.a(), null).x(P1.f.d0(g0Var, webView2, Double.valueOf(d3), Double.valueOf(d4)), new N(c0068q, 8));
                }
            }
        });
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f1115a.f1145a.e(new b0(this, webView, webResourceRequest, 1));
        return webResourceRequest.isForMainFrame() && this.f1116b;
    }

    @Override // android.webkit.WebViewClient
    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }
}
