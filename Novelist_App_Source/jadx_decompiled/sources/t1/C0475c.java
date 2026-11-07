package t1;

import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* renamed from: t1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0475c implements C1.f {

    /* renamed from: k, reason: collision with root package name */
    public final FlutterJNI f4550k;

    /* renamed from: l, reason: collision with root package name */
    public final AssetManager f4551l;

    /* renamed from: m, reason: collision with root package name */
    public final long f4552m;
    public final j n;

    /* renamed from: o, reason: collision with root package name */
    public final B1.g f4553o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4554p;

    public C0475c(FlutterJNI flutterJNI, AssetManager assetManager, long j3) {
        this.f4554p = false;
        C0473a c0473a = new C0473a();
        this.f4550k = flutterJNI;
        this.f4551l = assetManager;
        this.f4552m = j3;
        j jVar = new j(flutterJNI);
        this.n = jVar;
        jVar.c("flutter/isolate", c0473a, null);
        this.f4553o = new B1.g(jVar, 21);
        if (flutterJNI.isAttached()) {
            this.f4554p = true;
        }
    }

    @Override // C1.f
    public final C0473a a(C1.k kVar) {
        return ((j) this.f4553o.f90l).a(kVar);
    }

    @Override // C1.f
    public final void b(String str, C1.d dVar) {
        this.f4553o.b(str, dVar);
    }

    @Override // C1.f
    public final void c(String str, C1.d dVar, C0473a c0473a) {
        this.f4553o.c(str, dVar, c0473a);
    }

    public final void d(C0474b c0474b, List list) {
        if (this.f4554p) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        N1.a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(c0474b);
            this.f4550k.runBundleAndSnapshotFromLibrary(c0474b.f4547a, c0474b.f4549c, c0474b.f4548b, this.f4551l, list, this.f4552m);
            this.f4554p = true;
            Trace.endSection();
        } finally {
        }
    }

    @Override // C1.f
    public final void f(String str, ByteBuffer byteBuffer, C1.e eVar) {
        this.f4553o.f(str, byteBuffer, eVar);
    }

    @Override // C1.f
    public final void h(String str, ByteBuffer byteBuffer) {
        this.f4553o.h(str, byteBuffer);
    }
}
