package p051r0;

import android.content.pm.PackageInfo;
import android.net.Uri;
import java.util.WeakHashMap;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4333a = 0;

    static {
        Uri.parse("*");
        Uri.parse(StringUtils.EMPTY);
        new WeakHashMap();
    }

    public static PackageInfo a() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }
}
