package M1;

import android.webkit.ClientCertRequest;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.external.ExternalParser;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1078k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1080m;
    public final /* synthetic */ Object n;

    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, int i3) {
        this.f1078k = i3;
        this.f1079l = obj;
        this.f1080m = obj2;
        this.n = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1078k) {
            case 0:
                g0 g0Var = (g0) this.f1079l;
                WebView webView = (WebView) this.f1080m;
                ClientCertRequest clientCertRequest = (ClientCertRequest) this.n;
                C0065n c0065n = g0Var.f1115a;
                C0068q c0068q = new C0068q(2);
                c0065n.getClass();
                a2.h.e(webView, "viewArg");
                a2.h.e(clientCertRequest, "requestArg");
                O o2 = c0065n.f1145a;
                o2.getClass();
                if (!((C0055d) o2.f1032c).d(g0Var)) {
                    B1.e.r("missing-instance-error", "Callback to `WebViewClient.onReceivedClientCertRequest` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
                } else {
                    new B1.s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest", o2.a(), null).x(P1.f.d0(g0Var, webView, clientCertRequest), new N(c0068q, 0));
                }
                break;
            case 1:
                g0 g0Var2 = (g0) this.f1079l;
                WebView webView2 = (WebView) this.f1080m;
                WebResourceRequest webResourceRequest = (WebResourceRequest) this.n;
                C0065n c0065n2 = g0Var2.f1115a;
                C0068q c0068q2 = new C0068q(2);
                c0065n2.getClass();
                a2.h.e(webView2, "webViewArg");
                a2.h.e(webResourceRequest, "requestArg");
                O o3 = c0065n2.f1145a;
                o3.getClass();
                if (!((C0055d) o3.f1032c).d(g0Var2)) {
                    B1.e.r("missing-instance-error", "Callback to `WebViewClient.requestLoading` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
                } else {
                    new B1.s((C1.f) o3.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading", o3.a(), null).x(P1.f.d0(g0Var2, webView2, webResourceRequest), new N(c0068q2, 1));
                }
                break;
            default:
                ((ExternalParser) this.f1079l).lambda$extractMetadata$2((InputStream) this.f1080m, (Metadata) this.n);
                break;
        }
    }
}
