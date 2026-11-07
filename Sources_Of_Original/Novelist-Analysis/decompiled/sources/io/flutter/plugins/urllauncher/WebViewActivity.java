package io.flutter.plugins.urllauncher;

import D.AbstractC0009j;
import L1.g;
import L1.h;
import L1.j;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f3257o = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public WebView f3260m;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final g f3258k = new g(this);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f3259l = new h();
    public final IntentFilter n = new IntentFilter("close action");

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Map<String, String> map;
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f3260m = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        Bundle bundleExtra = intent.getBundleExtra("com.android.browser.headers");
        if (bundleExtra == null) {
            map = Collections.EMPTY_MAP;
        } else {
            HashMap map2 = new HashMap();
            for (String str : bundleExtra.keySet()) {
                map2.put(str, bundleExtra.getString(str));
            }
            map = map2;
        }
        this.f3260m.loadUrl(stringExtra, map);
        this.f3260m.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f3260m.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f3260m.setWebViewClient(this.f3259l);
        this.f3260m.getSettings().setSupportMultipleWindows(true);
        this.f3260m.setWebChromeClient(new j(this));
        int i3 = Build.VERSION.SDK_INT;
        g gVar = this.f3258k;
        IntentFilter intentFilter = this.n;
        if (i3 >= 33) {
            AbstractC0009j.g(this, gVar, intentFilter);
        } else if (i3 >= 26) {
            AbstractC0009j.f(this, gVar, intentFilter);
        } else {
            registerReceiver(gVar, intentFilter, null, null);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f3258k);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (i3 != 4 || !this.f3260m.canGoBack()) {
            return super.onKeyDown(i3, keyEvent);
        }
        this.f3260m.goBack();
        return true;
    }
}
