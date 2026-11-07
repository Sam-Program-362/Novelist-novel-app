package M1;

import D.C0002c;
import android.webkit.WebView;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1073k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g0 f1074l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ WebView f1075m;
    public final /* synthetic */ String n;

    public /* synthetic */ a0(g0 g0Var, WebView webView, String str, int i3) {
        this.f1073k = i3;
        this.f1074l = g0Var;
        this.f1075m = webView;
        this.n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1073k) {
            case 0:
                g0 g0Var = this.f1074l;
                C0065n c0065n = g0Var.f1115a;
                C0068q c0068q = new C0068q(2);
                c0065n.getClass();
                WebView webView = this.f1075m;
                a2.h.e(webView, "webViewArg");
                String str = this.n;
                a2.h.e(str, "urlArg");
                O o2 = c0065n.f1145a;
                o2.getClass();
                if (!((C0055d) o2.f1032c).d(g0Var)) {
                    B1.e.r("missing-instance-error", "Callback to `WebViewClient.onPageStarted` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
                    break;
                } else {
                    new B1.s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted", o2.a(), null).x(P1.f.d0(g0Var, webView, str), new C0002c(c0068q, 29));
                    break;
                }
            case 1:
                g0 g0Var2 = this.f1074l;
                C0065n c0065n2 = g0Var2.f1115a;
                C0068q c0068q2 = new C0068q(2);
                c0065n2.getClass();
                WebView webView2 = this.f1075m;
                a2.h.e(webView2, "viewArg");
                String str2 = this.n;
                a2.h.e(str2, "urlArg");
                O o3 = c0065n2.f1145a;
                o3.getClass();
                if (!((C0055d) o3.f1032c).d(g0Var2)) {
                    B1.e.r("missing-instance-error", "Callback to `WebViewClient.onLoadResource` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
                    break;
                } else {
                    new B1.s((C1.f) o3.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource", o3.a(), null).x(P1.f.d0(g0Var2, webView2, str2), new C0002c(c0068q2, 27));
                    break;
                }
            case 2:
                g0 g0Var3 = this.f1074l;
                C0065n c0065n3 = g0Var3.f1115a;
                C0068q c0068q3 = new C0068q(2);
                c0065n3.getClass();
                WebView webView3 = this.f1075m;
                a2.h.e(webView3, "webViewArg");
                String str3 = this.n;
                a2.h.e(str3, "urlArg");
                O o4 = c0065n3.f1145a;
                o4.getClass();
                if (!((C0055d) o4.f1032c).d(g0Var3)) {
                    B1.e.r("missing-instance-error", "Callback to `WebViewClient.onPageFinished` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
                    break;
                } else {
                    new B1.s((C1.f) o4.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished", o4.a(), null).x(P1.f.d0(g0Var3, webView3, str3), new N(c0068q3, 4));
                    break;
                }
            default:
                g0 g0Var4 = this.f1074l;
                C0065n c0065n4 = g0Var4.f1115a;
                C0068q c0068q4 = new C0068q(2);
                c0065n4.getClass();
                WebView webView4 = this.f1075m;
                a2.h.e(webView4, "viewArg");
                String str4 = this.n;
                a2.h.e(str4, "urlArg");
                O o5 = c0065n4.f1145a;
                o5.getClass();
                if (!((C0055d) o5.f1032c).d(g0Var4)) {
                    B1.e.r("missing-instance-error", "Callback to `WebViewClient.onPageCommitVisible` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
                    break;
                } else {
                    new B1.s((C1.f) o5.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible", o5.a(), null).x(P1.f.d0(g0Var4, webView4, str4), new N(c0068q4, 2));
                    break;
                }
        }
    }
}
