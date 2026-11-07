package M1;

import D.C0002c;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1097k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g0 f1098l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ WebView f1099m;
    public final /* synthetic */ String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f1100o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1101p;

    public /* synthetic */ d0(g0 g0Var, WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f1098l = g0Var;
        this.f1099m = webView;
        this.f1101p = httpAuthHandler;
        this.n = str;
        this.f1100o = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1097k) {
            case 0:
                String str = (String) this.f1101p;
                g0 g0Var = this.f1098l;
                C0065n c0065n = g0Var.f1115a;
                C0068q c0068q = new C0068q(2);
                c0065n.getClass();
                WebView webView = this.f1099m;
                a2.h.e(webView, "viewArg");
                String str2 = this.n;
                a2.h.e(str2, "realmArg");
                a2.h.e(str, "argsArg");
                O o2 = c0065n.f1145a;
                o2.getClass();
                if (!((C0055d) o2.f1032c).d(g0Var)) {
                    B1.e.r("missing-instance-error", "Callback to `WebViewClient.onReceivedLoginRequest` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
                } else {
                    new B1.s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest", o2.a(), null).x(P1.f.d0(g0Var, webView, str2, this.f1100o, str), new C0002c(c0068q, 28));
                }
                break;
            default:
                HttpAuthHandler httpAuthHandler = (HttpAuthHandler) this.f1101p;
                g0 g0Var2 = this.f1098l;
                C0065n c0065n2 = g0Var2.f1115a;
                C0068q c0068q2 = new C0068q(2);
                c0065n2.getClass();
                WebView webView2 = this.f1099m;
                a2.h.e(webView2, "webViewArg");
                a2.h.e(httpAuthHandler, "handlerArg");
                String str3 = this.n;
                a2.h.e(str3, "hostArg");
                String str4 = this.f1100o;
                a2.h.e(str4, "realmArg");
                O o3 = c0065n2.f1145a;
                o3.getClass();
                if (!((C0055d) o3.f1032c).d(g0Var2)) {
                    B1.e.r("missing-instance-error", "Callback to `WebViewClient.onReceivedHttpAuthRequest` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
                } else {
                    new B1.s((C1.f) o3.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest", o3.a(), null).x(P1.f.d0(g0Var2, webView2, httpAuthHandler, str3, str4), new N(c0068q2, 5));
                }
                break;
        }
    }

    public /* synthetic */ d0(g0 g0Var, WebView webView, String str, String str2, String str3) {
        this.f1098l = g0Var;
        this.f1099m = webView;
        this.n = str;
        this.f1100o = str2;
        this.f1101p = str3;
    }
}
