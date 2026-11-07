package D;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/* JADX INFO: renamed from: D.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0009j {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Icon b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static float c(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static boolean e(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static Intent f(WebViewActivity webViewActivity, L1.g gVar, IntentFilter intentFilter) {
        return webViewActivity.registerReceiver(gVar, intentFilter, null, null, 0);
    }

    public static Intent g(WebViewActivity webViewActivity, L1.g gVar, IntentFilter intentFilter) {
        return webViewActivity.registerReceiver(gVar, intentFilter, null, null, 2);
    }

    public static void h(MenuItem menuItem, char c3, int i3) {
        menuItem.setAlphabeticShortcut(c3, i3);
    }

    public static void i(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void j(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void k(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void l(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void m(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void n(MenuItem menuItem, char c3, int i3) {
        menuItem.setNumericShortcut(c3, i3);
    }

    public static void o(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void p(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void q(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void r(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }
}
