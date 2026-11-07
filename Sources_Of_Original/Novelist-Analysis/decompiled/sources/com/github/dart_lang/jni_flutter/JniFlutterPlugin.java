package com.github.dart_lang.jni_flutter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p031k.u0;
import p067y1.b;
import p070z1.a;

/* JADX INFO: loaded from: classes.dex */
public class JniFlutterPlugin implements b, a {

    @SuppressLint({"StaticFieldLeak"})
    private static Context context;
    private static final ConcurrentHashMap<Long, JniFlutterPlugin> pluginMap = new ConcurrentHashMap<>();
    private volatile Activity activity;
    private long engineId;

    public static Activity getActivity(long j3) {
        JniFlutterPlugin jniFlutterPlugin = pluginMap.get(Long.valueOf(j3));
        Objects.requireNonNull(jniFlutterPlugin);
        return jniFlutterPlugin.activity;
    }

    public static Context getApplicationContext() {
        return context;
    }

    private void setActivity(Activity activity) {
        this.activity = activity;
    }

    @Override // p070z1.a
    public void onAttachedToActivity(p070z1.b bVar) {
        setActivity((Activity) ((u0) bVar).f3794a);
    }

    @Override // p067y1.b
    public void onAttachedToEngine(p067y1.a aVar) {
        long j3 = aVar.f4729b.f4500w;
        this.engineId = j3;
        context = aVar.f4728a;
        pluginMap.put(Long.valueOf(j3), this);
    }

    @Override // p070z1.a
    public void onDetachedFromActivity() {
        setActivity(null);
    }

    @Override // p070z1.a
    public void onDetachedFromActivityForConfigChanges() {
        setActivity(null);
    }

    @Override // p067y1.b
    public void onDetachedFromEngine(p067y1.a aVar) {
        this.activity = null;
        pluginMap.remove(Long.valueOf(this.engineId));
    }

    @Override // p070z1.a
    public void onReattachedToActivityForConfigChanges(p070z1.b bVar) {
        setActivity((Activity) ((u0) bVar).f3794a);
    }
}
