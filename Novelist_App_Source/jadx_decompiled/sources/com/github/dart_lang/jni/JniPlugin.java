package com.github.dart_lang.jni;

import y1.C0500a;
import y1.b;

/* loaded from: classes.dex */
public class JniPlugin implements b {
    static {
        System.loadLibrary("dartjni");
        setClassLoader(JniPlugin.class.getClassLoader());
    }

    public static native void setClassLoader(ClassLoader classLoader);

    @Override // y1.b
    public void onAttachedToEngine(C0500a c0500a) {
    }

    @Override // y1.b
    public void onDetachedFromEngine(C0500a c0500a) {
    }
}
