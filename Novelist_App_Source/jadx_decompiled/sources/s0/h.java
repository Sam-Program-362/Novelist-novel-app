package s0;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r0.AbstractC0450a;

/* loaded from: classes.dex */
public final class h extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Pattern f4472d;

    public h() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f4472d = Pattern.compile("\\A\\d+");
    }

    @Override // s0.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // s0.c
    public final boolean b() {
        int i3;
        PackageInfo packageInfo;
        boolean b3 = super.b();
        if (!b3 || (i3 = Build.VERSION.SDK_INT) >= 29) {
            return b3;
        }
        int i4 = AbstractC0450a.f4333a;
        if (i3 >= 26) {
            packageInfo = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfo = AbstractC0450a.a();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo != null) {
            Matcher matcher = this.f4472d.matcher(packageInfo.versionName);
            if (matcher.find() && Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) >= 105) {
                return true;
            }
        }
        return false;
    }
}
