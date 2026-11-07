package D;

import android.app.Notification;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.util.concurrent.Executor;
import k.C0357u;

/* renamed from: D.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0005f {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long c(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static Executor d(Context context) {
        return context.getMainExecutor();
    }

    public static int e(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String f(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int g(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int h(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int i(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int j(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int k(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params l(C0357u c0357u) {
        return c0357u.getTextMetricsParams();
    }

    public static int m(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri n(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static void o(TextView textView, int i3) {
        textView.setFirstBaselineToTopHeight(i3);
    }

    public static void p(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static boolean q(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
