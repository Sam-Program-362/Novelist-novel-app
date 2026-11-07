package com.github.dart_lang.jni;

import p067y1.b;

/* JADX INFO: loaded from: classes.dex */
public class JniPlugin implements b {
    static {
        System.loadLibrary("dartjni");
        setClassLoader(JniPlugin.class.getClassLoader());
    }

    public static native void setClassLoader(ClassLoader classLoader);

    @Override // p067y1.b
    public void onAttachedToEngine(p067y1.a aVar) {
    }

    @Override // p067y1.b
    public void onDetachedFromEngine(p067y1.a aVar) {
    }
}
