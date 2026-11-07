package p053s0;

import D.AbstractC0005f;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import p051r0.a;

/* JADX INFO: loaded from: classes.dex */
public final class i extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4473e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, int i3, String str2) {
        super(str, 2, str2);
        this.f4473e = i3;
    }

    @Override // p053s0.c
    public final boolean b() {
        PackageInfo packageInfoA;
        switch (this.f4473e) {
            case 0:
                if (!super.b()) {
                    return false;
                }
                int i3 = a.f4333a;
                if (Build.VERSION.SDK_INT < 26) {
                    try {
                        packageInfoA = a.a();
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        packageInfoA = null;
                    }
                    break;
                } else {
                    packageInfoA = WebView.getCurrentWebViewPackage();
                }
                if (packageInfoA == null) {
                    return false;
                }
                return (Build.VERSION.SDK_INT >= 28 ? AbstractC0005f.c(packageInfoA) : (long) packageInfoA.versionCode) >= 636700000;
            case 1:
                if (!super.b() || !p000a.a.H("MULTI_PROCESS")) {
                    return false;
                }
                int i4 = a.f4333a;
                if (j.f4474a.b()) {
                    return l.f4477a.getStatics().isMultiProcessEnabled();
                }
                throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            default:
                if (p000a.a.H("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
