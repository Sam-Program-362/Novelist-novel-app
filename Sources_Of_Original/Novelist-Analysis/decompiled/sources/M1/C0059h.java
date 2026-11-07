package M1;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.nio.ByteBuffer;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: renamed from: M1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0059h extends I1.u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final O f1117e;

    public C0059h(O o2) {
        super(5);
        this.f1117e = o2;
    }

    public static final void l(String str, Object obj, Throwable th) {
        Log.w("PigeonProxyApiBaseCodec", "Failed to create new Dart proxy instance of " + str + ": " + obj + ". " + th);
    }

    @Override // I1.u, C1.q
    public final Object f(byte b3, ByteBuffer byteBuffer) {
        a2.h.e(byteBuffer, "buffer");
        if (b3 != -128) {
            return super.f(b3, byteBuffer);
        }
        Object objE = e(byteBuffer);
        a2.h.c(objE, "null cannot be cast to non-null type kotlin.Long");
        long jLongValue = ((Long) objE).longValue();
        Object objE2 = ((C0055d) this.f1117e.f1032c).e(jLongValue);
        if (objE2 == null) {
            Log.e("PigeonProxyApiBaseCodec", "Failed to find instance with identifier: " + jLongValue);
        }
        return objE2;
    }

    @Override // I1.u, C1.q
    public final void k(C1.p pVar, Object obj) {
        EnumC0070t enumC0070t;
        EnumC0062k enumC0062k;
        O o2 = this.f1117e;
        C1.f fVar = (C1.f) o2.f1031b;
        C0055d c0055d = (C0055d) o2.f1032c;
        if ((obj instanceof Boolean) || (obj instanceof byte[]) || (obj instanceof Double) || (obj instanceof double[]) || (obj instanceof float[]) || (obj instanceof Integer) || (obj instanceof int[]) || (obj instanceof List) || (obj instanceof Long) || (obj instanceof long[]) || (obj instanceof Map) || (obj instanceof String) || (obj instanceof EnumC0070t) || (obj instanceof EnumC0062k) || (obj instanceof EnumC0076z) || (obj instanceof S) || (obj instanceof EnumC0075y) || (obj instanceof l0) || obj == null) {
            super.k(pVar, obj);
            return;
        }
        p057t1.a aVar = null;
        if (obj instanceof WebResourceRequest) {
            WebResourceRequest webResourceRequest = (WebResourceRequest) obj;
            C0058g c0058g = new C0058g(obj, 0);
            if (!c0055d.d(webResourceRequest)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebResourceRequest.pigeon_newInstance", o2.a(), aVar).x(P1.f.d0(Long.valueOf(c0055d.b(webResourceRequest)), webResourceRequest.getUrl().toString(), Boolean.valueOf(webResourceRequest.isForMainFrame()), Boolean.valueOf(webResourceRequest.isRedirect()), Boolean.valueOf(webResourceRequest.hasGesture()), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders() == null ? Collections.EMPTY_MAP : webResourceRequest.getRequestHeaders()), new B1.d(c0058g, 28));
            }
        } else if (obj instanceof WebResourceResponse) {
            WebResourceResponse webResourceResponse = (WebResourceResponse) obj;
            C0058g c0058g2 = new C0058g(obj, 25);
            if (!c0055d.d(webResourceResponse)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebResourceResponse.pigeon_newInstance", o2.a(), aVar).x(P1.f.d0(Long.valueOf(c0055d.b(webResourceResponse)), Long.valueOf(webResourceResponse.getStatusCode())), new B1.d(c0058g2, 29));
            }
        } else if (obj instanceof WebResourceError) {
            WebResourceError webResourceError = (WebResourceError) obj;
            C0058g c0058g3 = new C0058g(obj, 12);
            if (!c0055d.d(webResourceError)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebResourceError.pigeon_newInstance", o2.a(), aVar).x(P1.f.d0(Long.valueOf(c0055d.b(webResourceError)), Long.valueOf(webResourceError.getErrorCode()), webResourceError.getDescription().toString()), new B1.d(c0058g3, 27));
            }
        } else if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            C0058g c0058g4 = new C0058g(obj, 13);
            if (!c0055d.d(i0Var)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewPoint.pigeon_newInstance", o2.a(), aVar).x(P1.f.d0(Long.valueOf(c0055d.b(i0Var)), Long.valueOf(i0Var.f1121a), Long.valueOf(i0Var.f1122b)), new K(c0058g4, 6));
            }
        } else if (obj instanceof ConsoleMessage) {
            ConsoleMessage consoleMessage = (ConsoleMessage) obj;
            C0058g c0058g5 = new C0058g(obj, 14);
            if (!c0055d.d(consoleMessage)) {
                long jB = c0055d.b(consoleMessage);
                long jLineNumber = consoleMessage.lineNumber();
                String strMessage = consoleMessage.message();
                int i3 = AbstractC0063l.f1139a[consoleMessage.messageLevel().ordinal()];
                if (i3 == 1) {
                    enumC0062k = EnumC0062k.f1131p;
                } else if (i3 == 2) {
                    enumC0062k = EnumC0062k.f1130o;
                } else if (i3 == 3) {
                    enumC0062k = EnumC0062k.f1132q;
                } else if (i3 != 4) {
                    enumC0062k = i3 != 5 ? EnumC0062k.f1133r : EnumC0062k.f1129m;
                } else {
                    enumC0062k = EnumC0062k.n;
                }
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.ConsoleMessage.pigeon_newInstance", o2.a(), null).x(P1.f.d0(Long.valueOf(jB), Long.valueOf(jLineNumber), strMessage, enumC0062k, consoleMessage.sourceId()), new B1.d(c0058g5, 10));
            }
        } else if (obj instanceof CookieManager) {
            CookieManager cookieManager = (CookieManager) obj;
            C0058g c0058g6 = new C0058g(obj, 15);
            if (!c0055d.d(cookieManager)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance", o2.a(), null).x(E2.a.B(Long.valueOf(c0055d.b(cookieManager))), new B1.d(c0058g6, 11));
            }
        } else if (obj instanceof WebView) {
            WebView webView = (WebView) obj;
            C0058g c0058g7 = new C0058g(obj, 16);
            if (!c0055d.d(webView)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance", o2.a(), null).x(E2.a.B(Long.valueOf(c0055d.b(webView))), new K(c0058g7, 3));
            }
        } else if (obj instanceof WebSettings) {
            WebSettings webSettings = (WebSettings) obj;
            C0058g c0058g8 = new C0058g(obj, 17);
            if (!c0055d.d(webSettings)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettings.pigeon_newInstance", o2.a(), null).x(E2.a.B(Long.valueOf(c0055d.b(webSettings))), new K(c0058g8, 0));
            }
        } else if (obj instanceof C0074x) {
            if (!c0055d.d((C0074x) obj)) {
                l("JavaScriptChannel", obj, O1.d.a(H2.h.i(new C0052a("new-instance-error", "Attempting to create a new Dart instance of JavaScriptChannel, but the class has a nonnull callback method.", StringUtils.EMPTY))));
            }
        } else if (obj instanceof WebViewClient) {
            WebViewClient webViewClient = (WebViewClient) obj;
            C0058g c0058g9 = new C0058g(obj, 11);
            if (!c0055d.d(webViewClient)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance", o2.a(), null).x(E2.a.B(Long.valueOf(c0055d.b(webViewClient))), new K(c0058g9, 4));
            }
        } else if (obj instanceof DownloadListener) {
            if (!c0055d.d((DownloadListener) obj)) {
                l("DownloadListener", obj, O1.d.a(H2.h.i(new C0052a("new-instance-error", "Attempting to create a new Dart instance of DownloadListener, but the class has a nonnull callback method.", StringUtils.EMPTY))));
            }
        } else if (obj instanceof Z) {
            if (!c0055d.d((Z) obj)) {
                l("WebChromeClient", obj, O1.d.a(H2.h.i(new C0052a("new-instance-error", "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method.", StringUtils.EMPTY))));
            }
        } else if (obj instanceof C0071u) {
            C0071u c0071u = (C0071u) obj;
            C0058g c0058g10 = new C0058g(obj, 18);
            if (!c0055d.d(c0071u)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.pigeon_newInstance", o2.a(), null).x(E2.a.B(Long.valueOf(c0055d.b(c0071u))), new B1.d(c0058g10, 15));
            }
        } else if (obj instanceof WebStorage) {
            WebStorage webStorage = (WebStorage) obj;
            C0058g c0058g11 = new C0058g(obj, 19);
            if (!c0055d.d(webStorage)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebStorage.pigeon_newInstance", o2.a(), null).x(E2.a.B(Long.valueOf(c0055d.b(webStorage))), new K(c0058g11, 1));
            }
        } else if (obj instanceof WebChromeClient.FileChooserParams) {
            WebChromeClient.FileChooserParams fileChooserParams = (WebChromeClient.FileChooserParams) obj;
            C0058g c0058g12 = new C0058g(obj, 20);
            if (!c0055d.d(fileChooserParams)) {
                long jB2 = c0055d.b(fileChooserParams);
                boolean zIsCaptureEnabled = fileChooserParams.isCaptureEnabled();
                List listAsList = Arrays.asList(fileChooserParams.getAcceptTypes());
                int mode = fileChooserParams.getMode();
                if (mode == 0) {
                    enumC0070t = EnumC0070t.f1158m;
                } else if (mode != 1) {
                    enumC0070t = mode != 3 ? EnumC0070t.f1160p : EnumC0070t.f1159o;
                } else {
                    enumC0070t = EnumC0070t.n;
                }
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.FileChooserParams.pigeon_newInstance", o2.a(), null).x(P1.f.d0(Long.valueOf(jB2), Boolean.valueOf(zIsCaptureEnabled), listAsList, enumC0070t, fileChooserParams.getFilenameHint()), new B1.d(c0058g12, 14));
            }
        } else if (obj instanceof PermissionRequest) {
            PermissionRequest permissionRequest = (PermissionRequest) obj;
            C0058g c0058g13 = new C0058g(obj, 21);
            if (!c0055d.d(permissionRequest)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.pigeon_newInstance", o2.a(), null).x(P1.f.d0(Long.valueOf(c0055d.b(permissionRequest)), Arrays.asList(permissionRequest.getResources())), new B1.d(c0058g13, 19));
            }
        } else if (obj instanceof WebChromeClient.CustomViewCallback) {
            WebChromeClient.CustomViewCallback customViewCallback = (WebChromeClient.CustomViewCallback) obj;
            C0058g c0058g14 = new C0058g(obj, 22);
            if (!c0055d.d(customViewCallback)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.pigeon_newInstance", o2.a(), null).x(E2.a.B(Long.valueOf(c0055d.b(customViewCallback))), new B1.d(c0058g14, 12));
            }
        } else if (obj instanceof View) {
            View view = (View) obj;
            C0058g c0058g15 = new C0058g(obj, 23);
            if (!c0055d.d(view)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance", o2.a(), null).x(E2.a.B(Long.valueOf(c0055d.b(view))), new B1.d(c0058g15, 26));
            }
        } else if (obj instanceof GeolocationPermissions.Callback) {
            GeolocationPermissions.Callback callback = (GeolocationPermissions.Callback) obj;
            C0058g c0058g16 = new C0058g(obj, 24);
            if (!c0055d.d(callback)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.pigeon_newInstance", o2.a(), null).x(E2.a.B(Long.valueOf(c0055d.b(callback))), new B1.d(c0058g16, 16));
            }
        } else if (obj instanceof HttpAuthHandler) {
            HttpAuthHandler httpAuthHandler = (HttpAuthHandler) obj;
            C0058g c0058g17 = new C0058g(obj, 1);
            if (!c0055d.d(httpAuthHandler)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandler.pigeon_newInstance", o2.a(), null).x(E2.a.B(Long.valueOf(c0055d.b(httpAuthHandler))), new B1.d(c0058g17, 17));
            }
        } else if (obj instanceof Message) {
            Message message = (Message) obj;
            C0058g c0058g18 = new C0058g(obj, 2);
            if (!c0055d.d(message)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.pigeon_newInstance", o2.a(), null).x(E2.a.B(Long.valueOf(c0055d.b(message))), new B1.d(c0058g18, 7));
            }
        } else if (obj instanceof ClientCertRequest) {
            ClientCertRequest clientCertRequest = (ClientCertRequest) obj;
            C0058g c0058g19 = new C0058g(obj, 3);
            if (!c0055d.d(clientCertRequest)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.ClientCertRequest.pigeon_newInstance", o2.a(), null).x(E2.a.B(Long.valueOf(c0055d.b(clientCertRequest))), new B1.d(c0058g19, 9));
            }
        } else if (obj instanceof PrivateKey) {
            PrivateKey privateKey = (PrivateKey) obj;
            C0058g c0058g20 = new C0058g(obj, 4);
            if (!c0055d.d(privateKey)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.PrivateKey.pigeon_newInstance", o2.a(), null).x(E2.a.B(Long.valueOf(c0055d.b(privateKey))), new B1.d(c0058g20, 20));
            }
        } else if (obj instanceof X509Certificate) {
            X509Certificate x509Certificate = (X509Certificate) obj;
            C0058g c0058g21 = new C0058g(obj, 5);
            if (!c0055d.d(x509Certificate)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.X509Certificate.pigeon_newInstance", o2.a(), null).x(E2.a.B(Long.valueOf(c0055d.b(x509Certificate))), new K(c0058g21, 7));
            }
        } else if (obj instanceof SslErrorHandler) {
            SslErrorHandler sslErrorHandler = (SslErrorHandler) obj;
            C0058g c0058g22 = new C0058g(obj, 6);
            if (!c0055d.d(sslErrorHandler)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.pigeon_newInstance", o2.a(), null).x(E2.a.B(Long.valueOf(c0055d.b(sslErrorHandler))), new B1.d(c0058g22, 25));
            }
        } else if (obj instanceof SslError) {
            SslError sslError = (SslError) obj;
            C0058g c0058g23 = new C0058g(obj, 7);
            if (!c0055d.d(sslError)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslError.pigeon_newInstance", o2.a(), null).x(P1.f.d0(Long.valueOf(c0055d.b(sslError)), sslError.getCertificate(), sslError.getUrl()), new B1.d(c0058g23, 23));
            }
        } else if (obj instanceof SslCertificate.DName) {
            SslCertificate.DName dName = (SslCertificate.DName) obj;
            C0058g c0058g24 = new C0058g(obj, 8);
            if (!c0055d.d(dName)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificateDName.pigeon_newInstance", o2.a(), null).x(E2.a.B(Long.valueOf(c0055d.b(dName))), new B1.d(c0058g24, 22));
            }
        } else if (obj instanceof SslCertificate) {
            SslCertificate sslCertificate = (SslCertificate) obj;
            C0058g c0058g25 = new C0058g(obj, 9);
            if (!c0055d.d(sslCertificate)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslCertificate.pigeon_newInstance", o2.a(), null).x(E2.a.B(Long.valueOf(c0055d.b(sslCertificate))), new B1.d(c0058g25, 21));
            }
        } else if (obj instanceof Certificate) {
            Certificate certificate = (Certificate) obj;
            C0058g c0058g26 = new C0058g(obj, 10);
            if (!c0055d.d(certificate)) {
                new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.Certificate.pigeon_newInstance", o2.a(), null).x(E2.a.B(Long.valueOf(c0055d.b(certificate))), new B1.d(c0058g26, 8));
            }
        }
        if (c0055d.d(obj)) {
            pVar.write(128);
            c0055d.f();
            Long l3 = (Long) c0055d.f1087b.get(new C0054c(obj));
            if (l3 != null) {
                c0055d.f1089d.put(l3, obj);
            }
            k(pVar, l3);
            return;
        }
        throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass().getName() + "'");
    }
}
