package p053s0;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p051r0.a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pattern f4472d;

    public h() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f4472d = Pattern.compile("\\A\\d+");
    }

    @Override // p053s0.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // p053s0.c
    public final boolean b() {
        int i3;
        PackageInfo packageInfoA;
        boolean zB = super.b();
        if (!zB || (i3 = Build.VERSION.SDK_INT) >= 29) {
            return zB;
        }
        int i4 = a.f4333a;
        if (i3 >= 26) {
            packageInfoA = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfoA = a.a();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfoA = null;
            }
        }
        if (packageInfoA != null) {
            Matcher matcher = this.f4472d.matcher(packageInfoA.versionName);
            if (matcher.find() && Integer.parseInt(packageInfoA.versionName.substring(matcher.start(), matcher.end())) >= 105) {
                return true;
            }
        }
        return false;
    }
}
