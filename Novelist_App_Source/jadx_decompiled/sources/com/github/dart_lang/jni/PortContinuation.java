package com.github.dart_lang.jni;

import R1.c;
import R1.h;
import i2.A;
import p2.d;
import p2.e;

/* loaded from: classes.dex */
public class PortContinuation<T> implements c {
    private final long port;

    static {
        System.loadLibrary("dartjni");
    }

    public PortContinuation(long j3) {
        this.port = j3;
    }

    private native void _resumeWith(long j3, Object obj);

    @Override // R1.c
    public h getContext() {
        e eVar = A.f2964a;
        return d.f4262m;
    }

    @Override // R1.c
    public void resumeWith(Object obj) {
        _resumeWith(this.port, obj);
    }
}
