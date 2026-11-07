package M1;

import D.C0002c;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends WebView implements io.flutter.plugin.platform.g {
    public static final /* synthetic */ int n = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0069s f1136k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public WebViewClient f1137l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public V f1138m;

    public k0(C0069s c0069s) {
        super(c0069s.f1156a.f1030a);
        this.f1136k = c0069s;
        this.f1137l = new WebViewClient();
        this.f1138m = new V();
        setWebViewClient(this.f1137l);
        setWebChromeClient(this.f1138m);
    }

    @Override // android.webkit.WebView
    public WebChromeClient getWebChromeClient() {
        return this.f1138m;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        p052r1.n nVar;
        super.onAttachedToWindow();
        this.f1136k.f1156a.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            ViewParent parent = this;
            while (true) {
                if (parent.getParent() == null) {
                    nVar = null;
                    break;
                }
                parent = parent.getParent();
                if (parent instanceof p052r1.n) {
                    nVar = (p052r1.n) parent;
                    break;
                }
            }
            if (nVar != null) {
                nVar.setImportantForAutofill(1);
            }
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onScrollChanged(final int i3, final int i4, final int i5, final int i6) {
        super.onScrollChanged(i3, i4, i5, i6);
        this.f1136k.f1156a.e(new Runnable() { // from class: M1.j0
            @Override // java.lang.Runnable
            public final void run() {
                k0 k0Var = this.f1124k;
                C0069s c0069s = k0Var.f1136k;
                long j3 = i3;
                long j4 = i4;
                long j5 = i5;
                long j6 = i6;
                C0068q c0068q = new C0068q(3);
                c0069s.getClass();
                O o2 = c0069s.f1156a;
                o2.getClass();
                if (!((C0055d) o2.f1032c).d(k0Var)) {
                    B1.e.r("missing-instance-error", "Callback to `WebView.onScrollChanged` failed because native instance was not in the instance manager.", StringUtils.EMPTY);
                } else {
                    new B1.s((C1.f) o2.f1031b, "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged", o2.a(), null).x(P1.f.d0(k0Var, Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6)), new C0002c(c0068q, 25));
                }
            }
        });
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        super.setWebChromeClient(webChromeClient);
        if (!(webChromeClient instanceof V)) {
            throw new AssertionError("Client must be a SecureWebChromeClient.");
        }
        V v3 = (V) webChromeClient;
        this.f1138m = v3;
        v3.f1053a = this.f1137l;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        this.f1137l = webViewClient;
        this.f1138m.f1053a = webViewClient;
    }

    @Override // io.flutter.plugin.platform.g
    public View getView() {
        return this;
    }
}
