package M1;

import D.C0002c;
import android.app.Activity;
import android.content.Context;
import java.util.HashMap;
import p031k.u0;

/* JADX INFO: loaded from: classes.dex */
public class h0 implements p067y1.b, p070z1.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p067y1.a f1118k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public O f1119l;

    @Override // p070z1.a
    public final void onAttachedToActivity(p070z1.b bVar) {
        O o2 = this.f1119l;
        if (o2 != null) {
            o2.f1030a = (Activity) ((u0) bVar).f3794a;
        }
    }

    @Override // p067y1.b
    public final void onAttachedToEngine(p067y1.a aVar) {
        this.f1118k = aVar;
        C1.f fVar = aVar.f4730c;
        Context context = aVar.f4728a;
        O o2 = new O(fVar, context, new C0071u(context.getAssets(), aVar.f4732e));
        this.f1119l = o2;
        io.flutter.plugin.platform.o oVar = aVar.f4731d;
        C0073w c0073w = new C0073w((C0055d) o2.f1032c);
        HashMap map = (HashMap) oVar.f3201l;
        if (!map.containsKey("plugins.flutter.io/webview")) {
            map.put("plugins.flutter.io/webview", c0073w);
        }
        O o3 = this.f1119l;
        o3.getClass();
        O1.e eVar = C0057f.f1107b;
        C1.f fVar2 = (C1.f) o3.f1031b;
        p000a.a.O(fVar2, (C0055d) o3.f1032c);
        S0.a.E(fVar2, new C0065n(o3, 0));
        S0.a.F(fVar2, new C0069s(o3, 4));
        H2.h.B(fVar2, new C0069s(o3, 3));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", o3.a(), null).y(new B1.d(new C0069s(o3, 1), 18));
        C0065n c0065n = new C0065n(o3, 4);
        C1.l lVarA = o3.a();
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", lVarA, null).y(new K(c0065n, 5));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", lVarA, null).y(new N(c0065n, 10));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", o3.a(), null).y(new B1.d(new C0069s(o3, 0), 13));
        E2.a.S(fVar2, new C0065n(o3, 3));
        p000a.a.P(fVar2, new C0061j(o3, 1));
        C0061j c0061j = new C0061j(o3, 4);
        C1.l lVarA2 = o3.a();
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", lVarA2, null).y(new K(c0061j, 2));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", lVarA2, null).y(new C0002c(c0061j, 24));
        A a3 = new A(0);
        C1.l lVarA3 = o3.a();
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", lVarA3, null).y(new C0002c(a3, 11));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", lVarA3, null).y(new C0002c(a3, 12));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", o3.a(), null).y(new C0002c(new B1.b(24), 7));
        p000a.a.Q(fVar2, new C0061j(o3, 3));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", o3.a(), null).y(new C0002c(new B1.b(26), 9));
        E2.a.R(fVar2, new C0065n(o3, 1));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", o3.a(), null).y(new C0002c(new B1.b(27), 5));
        H2.h.z(fVar2, new C0061j(o3, 0));
        A a4 = new A(1);
        C1.l lVarA4 = o3.a();
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", lVarA4, null).y(new C0002c(a4, 14));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", lVarA4, null).y(new C0002c(a4, 15));
        C0069s c0069s = new C0069s(o3, 2);
        C1.l lVarA5 = o3.a();
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", lVarA5, null).y(new C0002c(c0069s, 13));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", lVarA5, null).y(new B1.d(c0069s, 24));
        S0.a.D(fVar2, new C0061j(o3, 2));
        H2.h.A(fVar2, new C0065n(o3, 2));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", o3.a(), null).y(new C0002c(new B1.b(22), 6));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled", o3.a(), null).y(new C0002c(new A(3), 23));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported", o3.a(), null).y(new N(new A(4), 11));
    }

    @Override // p070z1.a
    public final void onDetachedFromActivity() {
        this.f1119l.f1030a = this.f1118k.f4728a;
    }

    @Override // p070z1.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f1119l.f1030a = this.f1118k.f4728a;
    }

    @Override // p067y1.b
    public final void onDetachedFromEngine(p067y1.a aVar) {
        O o2 = this.f1119l;
        if (o2 != null) {
            O1.e eVar = C0057f.f1107b;
            C1.f fVar = (C1.f) o2.f1031b;
            p000a.a.O(fVar, null);
            S0.a.E(fVar, null);
            S0.a.F(fVar, null);
            H2.h.B(fVar, null);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", new I1.u(5), null).y(null);
            I1.u uVar = new I1.u(5);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", uVar, null).y(null);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", uVar, null).y(null);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", new I1.u(5), null).y(null);
            E2.a.S(fVar, null);
            p000a.a.P(fVar, null);
            I1.u uVar2 = new I1.u(5);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", uVar2, null).y(null);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", uVar2, null).y(null);
            I1.u uVar3 = new I1.u(5);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", uVar3, null).y(null);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", uVar3, null).y(null);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", new I1.u(5), null).y(null);
            p000a.a.Q(fVar, null);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", new I1.u(5), null).y(null);
            E2.a.R(fVar, null);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", new I1.u(5), null).y(null);
            H2.h.z(fVar, null);
            I1.u uVar4 = new I1.u(5);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", uVar4, null).y(null);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", uVar4, null).y(null);
            I1.u uVar5 = new I1.u(5);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", uVar5, null).y(null);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", uVar5, null).y(null);
            S0.a.D(fVar, null);
            H2.h.A(fVar, null);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", new I1.u(5), null).y(null);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled", new I1.u(5), null).y(null);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported", new I1.u(5), null).y(null);
            C0055d c0055d = (C0055d) this.f1119l.f1032c;
            c0055d.f1092g.removeCallbacks(c0055d.f1093h);
            c0055d.f1095j = true;
            this.f1119l = null;
        }
    }

    @Override // p070z1.a
    public final void onReattachedToActivityForConfigChanges(p070z1.b bVar) {
        this.f1119l.f1030a = (Activity) ((u0) bVar).f3794a;
    }
}
