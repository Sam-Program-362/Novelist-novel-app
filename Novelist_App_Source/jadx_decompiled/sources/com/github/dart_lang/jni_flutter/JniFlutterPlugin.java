package com.github.dart_lang.jni_flutter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import k.u0;
import y1.C0500a;
import y1.b;
import z1.InterfaceC0508a;
import z1.InterfaceC0509b;

/* loaded from: classes.dex */
public class JniFlutterPlugin implements b, InterfaceC0508a {

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

    @Override // z1.InterfaceC0508a
    public void onAttachedToActivity(InterfaceC0509b interfaceC0509b) {
        setActivity((Activity) ((u0) interfaceC0509b).f3794a);
    }

    @Override // y1.b
    public void onAttachedToEngine(C0500a c0500a) {
        long j3 = c0500a.f4729b.f4500w;
        this.engineId = j3;
        context = c0500a.f4728a;
        pluginMap.put(Long.valueOf(j3), this);
    }

    @Override // z1.InterfaceC0508a
    public void onDetachedFromActivity() {
        setActivity(null);
    }

    @Override // z1.InterfaceC0508a
    public void onDetachedFromActivityForConfigChanges() {
        setActivity(null);
    }

    @Override // y1.b
    public void onDetachedFromEngine(C0500a c0500a) {
        this.activity = null;
        pluginMap.remove(Long.valueOf(this.engineId));
    }

    @Override // z1.InterfaceC0508a
    public void onReattachedToActivityForConfigChanges(InterfaceC0509b interfaceC0509b) {
        setActivity((Activity) ((u0) interfaceC0509b).f3794a);
    }
}
