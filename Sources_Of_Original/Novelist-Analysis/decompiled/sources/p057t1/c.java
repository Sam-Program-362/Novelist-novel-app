package p057t1;

import B1.g;
import C1.d;
import C1.e;
import C1.f;
import C1.k;
import N1.a;
import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final FlutterJNI f4550k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AssetManager f4551l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f4552m;
    public final j n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g f4553o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4554p;

    public c(FlutterJNI flutterJNI, AssetManager assetManager, long j3) {
        this.f4554p = false;
        a aVar = new a();
        this.f4550k = flutterJNI;
        this.f4551l = assetManager;
        this.f4552m = j3;
        j jVar = new j(flutterJNI);
        this.n = jVar;
        jVar.c("flutter/isolate", aVar, null);
        this.f4553o = new g(jVar, 21);
        if (flutterJNI.isAttached()) {
            this.f4554p = true;
        }
    }

    @Override // C1.f
    public final a a(k kVar) {
        return ((j) this.f4553o.f90l).a(kVar);
    }

    @Override // C1.f
    public final void b(String str, d dVar) {
        this.f4553o.b(str, dVar);
    }

    @Override // C1.f
    public final void c(String str, d dVar, a aVar) {
        this.f4553o.c(str, dVar, aVar);
    }

    public final void d(b bVar, List list) {
        if (this.f4554p) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(bVar);
            this.f4550k.runBundleAndSnapshotFromLibrary(bVar.f4547a, bVar.f4549c, bVar.f4548b, this.f4551l, list, this.f4552m);
            this.f4554p = true;
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // C1.f
    public final void f(String str, ByteBuffer byteBuffer, e eVar) {
        this.f4553o.f(str, byteBuffer, eVar);
    }

    @Override // C1.f
    public final void h(String str, ByteBuffer byteBuffer) {
        this.f4553o.h(str, byteBuffer);
    }
}
