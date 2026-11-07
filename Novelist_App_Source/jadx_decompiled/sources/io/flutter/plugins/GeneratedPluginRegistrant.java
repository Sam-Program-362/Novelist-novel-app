package io.flutter.plugins;

import H1.a;
import I1.t;
import J1.p;
import K1.L;
import L1.f;
import M1.h0;
import android.util.Log;
import androidx.annotation.Keep;
import com.github.dart_lang.jni.JniPlugin;
import com.github.dart_lang.jni_flutter.JniFlutterPlugin;
import i1.ViewTreeObserverOnGlobalLayoutListenerC0283a;
import j1.C0331e;
import k1.C0375l;
import m1.C0432a;
import n1.C0435a;
import o1.C0441a;
import p1.C0444a;
import r2.b;
import s1.C0467c;

@Keep
/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(C0467c c0467c) {
        try {
            c0467c.f4483d.a(new b());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin clipboard, net.cubiclab.clipboard.ClipboardPlugin", e3);
        }
        try {
            c0467c.f4483d.a(new C0432a());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e4);
        }
        try {
            c0467c.f4483d.a(new C0331e());
        } catch (Exception e5) {
            Log.e(TAG, "Error registering plugin file_picker, com.mr.flutter.plugin.filepicker.FilePickerPlugin", e5);
        }
        try {
            c0467c.f4483d.a(new ViewTreeObserverOnGlobalLayoutListenerC0283a());
        } catch (Exception e6) {
            Log.e(TAG, "Error registering plugin flutter_keyboard_visibility, com.jrai.flutter_keyboard_visibility.FlutterKeyboardVisibilityPlugin", e6);
        }
        try {
            c0467c.f4483d.a(new a());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e7);
        }
        try {
            c0467c.f4483d.a(new t());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin google_sign_in_android, io.flutter.plugins.googlesignin.GoogleSignInPlugin", e8);
        }
        try {
            c0467c.f4483d.a(new p());
        } catch (Exception e9) {
            Log.e(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e9);
        }
        try {
            c0467c.f4483d.a(new JniPlugin());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin jni, com.github.dart_lang.jni.JniPlugin", e10);
        }
        try {
            c0467c.f4483d.a(new JniFlutterPlugin());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin jni_flutter, com.github.dart_lang.jni_flutter.JniFlutterPlugin", e11);
        }
        try {
            c0467c.f4483d.a(new C0435a());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e12);
        }
        try {
            c0467c.f4483d.a(new C0441a());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e13);
        }
        try {
            c0467c.f4483d.a(new L());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e14);
        }
        try {
            c0467c.f4483d.a(new C0375l());
        } catch (Exception e15) {
            Log.e(TAG, "Error registering plugin sqflite_android, com.tekartik.sqflite.SqflitePlugin", e15);
        }
        try {
            c0467c.f4483d.a(new C0444a());
        } catch (Exception e16) {
            Log.e(TAG, "Error registering plugin sqlite3_flutter_libs, eu.simonbinder.sqlite3_flutter_libs.Sqlite3FlutterLibsPlugin", e16);
        }
        try {
            c0467c.f4483d.a(new f());
        } catch (Exception e17) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e17);
        }
        try {
            c0467c.f4483d.a(new h0());
        } catch (Exception e18) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e18);
        }
    }
}
