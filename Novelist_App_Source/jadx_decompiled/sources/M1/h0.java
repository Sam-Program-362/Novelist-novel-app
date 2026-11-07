package M1;

import D.C0002c;
import a.AbstractC0102a;
import android.app.Activity;
import android.content.Context;
import java.util.HashMap;
import k.u0;
import y1.C0500a;
import z1.InterfaceC0508a;
import z1.InterfaceC0509b;

/* loaded from: classes.dex */
public class h0 implements y1.b, InterfaceC0508a {

    /* renamed from: k, reason: collision with root package name */
    public C0500a f1118k;

    /* renamed from: l, reason: collision with root package name */
    public O f1119l;

    @Override // z1.InterfaceC0508a
    public final void onAttachedToActivity(InterfaceC0509b interfaceC0509b) {
        O o2 = this.f1119l;
        if (o2 != null) {
            o2.f1030a = (Activity) ((u0) interfaceC0509b).f3794a;
        }
    }

    @Override // y1.b
    public final void onAttachedToEngine(C0500a c0500a) {
        this.f1118k = c0500a;
        C1.f fVar = c0500a.f4730c;
        Context context = c0500a.f4728a;
        O o2 = new O(fVar, context, new C0071u(context.getAssets(), c0500a.f4732e));
        this.f1119l = o2;
        io.flutter.plugin.platform.o oVar = c0500a.f4731d;
        C0073w c0073w = new C0073w((C0055d) o2.f1032c);
        HashMap hashMap = (HashMap) oVar.f3201l;
        if (!hashMap.containsKey("plugins.flutter.io/webview")) {
            hashMap.put("plugins.flutter.io/webview", c0073w);
        }
        O o3 = this.f1119l;
        o3.getClass();
        O1.e eVar = C0057f.f1107b;
        C1.f fVar2 = (C1.f) o3.f1031b;
        AbstractC0102a.O(fVar2, (C0055d) o3.f1032c);
        S0.a.E(fVar2, new C0065n(o3, 0));
        S0.a.F(fVar2, new C0069s(o3, 4));
        H2.h.B(fVar2, new C0069s(o3, 3));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", o3.a(), null).y(new B1.d(new C0069s(o3, 1), 18));
        C0065n c0065n = new C0065n(o3, 4);
        C1.l a3 = o3.a();
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", a3, null).y(new K(c0065n, 5));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", a3, null).y(new N(c0065n, 10));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", o3.a(), null).y(new B1.d(new C0069s(o3, 0), 13));
        E2.a.S(fVar2, new C0065n(o3, 3));
        AbstractC0102a.P(fVar2, new C0061j(o3, 1));
        C0061j c0061j = new C0061j(o3, 4);
        C1.l a4 = o3.a();
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", a4, null).y(new K(c0061j, 2));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", a4, null).y(new C0002c(c0061j, 24));
        A a5 = new A(0);
        C1.l a6 = o3.a();
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", a6, null).y(new C0002c(a5, 11));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", a6, null).y(new C0002c(a5, 12));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", o3.a(), null).y(new C0002c(new B1.b(24), 7));
        AbstractC0102a.Q(fVar2, new C0061j(o3, 3));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallback.invoke", o3.a(), null).y(new C0002c(new B1.b(26), 9));
        E2.a.R(fVar2, new C0065n(o3, 1));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.AndroidMessage.sendToTarget", o3.a(), null).y(new C0002c(new B1.b(27), 5));
        H2.h.z(fVar2, new C0061j(o3, 0));
        A a7 = new A(1);
        C1.l a8 = o3.a();
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.cancel", a8, null).y(new C0002c(a7, 14));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslErrorHandler.proceed", a8, null).y(new C0002c(a7, 15));
        C0069s c0069s = new C0069s(o3, 2);
        C1.l a9 = o3.a();
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslError.getPrimaryError", a9, null).y(new C0002c(c0069s, 13));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.SslError.hasError", a9, null).y(new B1.d(c0069s, 24));
        S0.a.D(fVar2, new C0061j(o3, 2));
        H2.h.A(fVar2, new C0065n(o3, 2));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.Certificate.getEncoded", o3.a(), null).y(new C0002c(new B1.b(22), 6));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebSettingsCompat.setPaymentRequestEnabled", o3.a(), null).y(new C0002c(new A(3), 23));
        new B1.s(fVar2, "dev.flutter.pigeon.webview_flutter_android.WebViewFeature.isFeatureSupported", o3.a(), null).y(new N(new A(4), 11));
    }

    @Override // z1.InterfaceC0508a
    public final void onDetachedFromActivity() {
        this.f1119l.f1030a = this.f1118k.f4728a;
    }

    @Override // z1.InterfaceC0508a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f1119l.f1030a = this.f1118k.f4728a;
    }

    @Override // y1.b
    public final void onDetachedFromEngine(C0500a c0500a) {
        O o2 = this.f1119l;
        if (o2 != null) {
            O1.e eVar = C0057f.f1107b;
            C1.f fVar = (C1.f) o2.f1031b;
            AbstractC0102a.O(fVar, null);
            S0.a.E(fVar, null);
            S0.a.F(fVar, null);
            H2.h.B(fVar, null);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannel.pigeon_defaultConstructor", new I1.u(5), null).y(null);
            I1.u uVar = new I1.u(5);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", uVar, null).y(null);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", uVar, null).y(null);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.DownloadListener.pigeon_defaultConstructor", new I1.u(5), null).y(null);
            E2.a.S(fVar, null);
            AbstractC0102a.P(fVar, null);
            I1.u uVar2 = new I1.u(5);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebStorage.instance", uVar2, null).y(null);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.WebStorage.deleteAllData", uVar2, null).y(null);
            I1.u uVar3 = new I1.u(5);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.grant", uVar3, null).y(null);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.PermissionRequest.deny", uVar3, null).y(null);
            new B1.s(fVar, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallback.onCustomViewHidden", new I1.u(5), null).y(null);
            AbstractC0102a.Q(fVar, null);
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

    @Override // z1.InterfaceC0508a
    public final void onReattachedToActivityForConfigChanges(InterfaceC0509b interfaceC0509b) {
        this.f1119l.f1030a = (Activity) ((u0) interfaceC0509b).f3794a;
    }
}
