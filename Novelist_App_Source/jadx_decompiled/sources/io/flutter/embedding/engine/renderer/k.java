package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry$ImageTextureEntry;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f3083a;

    /* renamed from: c, reason: collision with root package name */
    public Surface f3085c;

    /* renamed from: h, reason: collision with root package name */
    public final a f3090h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f3084b = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    public boolean f3086d = false;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f3087e = new Handler();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f3088f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f3089g = new ArrayList();

    public k(FlutterJNI flutterJNI) {
        a aVar = new a(this, 0);
        this.f3090h = aVar;
        this.f3083a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    public final void a(l lVar) {
        this.f3083a.addIsDisplayingFlutterUiListener(lVar);
        if (this.f3086d) {
            lVar.b();
        }
    }

    public final void b(p pVar) {
        HashSet hashSet = this.f3088f;
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            if (((p) ((WeakReference) it2.next()).get()) == null) {
                it2.remove();
            }
        }
        hashSet.add(new WeakReference(pVar));
    }

    public final TextureRegistry$ImageTextureEntry c() {
        FlutterRenderer$ImageTextureRegistryEntry flutterRenderer$ImageTextureRegistryEntry = new FlutterRenderer$ImageTextureRegistryEntry(this, this.f3084b.getAndIncrement());
        flutterRenderer$ImageTextureRegistryEntry.id();
        this.f3083a.registerImageTexture(flutterRenderer$ImageTextureRegistryEntry.id(), flutterRenderer$ImageTextureRegistryEntry, false);
        return flutterRenderer$ImageTextureRegistryEntry;
    }

    public final TextureRegistry$SurfaceProducer d(int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 29 || (i4 <= 29 && "HUAWEI".equalsIgnoreCase(Build.MANUFACTURER))) {
            h e3 = e();
            return new o(e3.f3054a, this.f3087e, this.f3083a, e3);
        }
        long andIncrement = this.f3084b.getAndIncrement();
        FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = new FlutterRenderer$ImageReaderSurfaceProducer(this, andIncrement);
        boolean z3 = i3 == 2;
        this.f3083a.registerImageTexture(andIncrement, flutterRenderer$ImageReaderSurfaceProducer, z3);
        if (z3) {
            b(flutterRenderer$ImageReaderSurfaceProducer);
        }
        this.f3089g.add(flutterRenderer$ImageReaderSurfaceProducer);
        return flutterRenderer$ImageReaderSurfaceProducer;
    }

    public final h e() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        long andIncrement = this.f3084b.getAndIncrement();
        surfaceTexture.detachFromGLContext();
        h hVar = new h(this, andIncrement, surfaceTexture);
        this.f3083a.registerTexture(hVar.f3054a, hVar.f3055b);
        b(hVar);
        return hVar;
    }

    public final void f(int i3) {
        Iterator it2 = this.f3088f.iterator();
        while (it2.hasNext()) {
            p pVar = (p) ((WeakReference) it2.next()).get();
            if (pVar != null) {
                pVar.onTrimMemory(i3);
            } else {
                it2.remove();
            }
        }
    }

    public final void g(l lVar) {
        this.f3083a.removeIsDisplayingFlutterUiListener(lVar);
    }

    public final void h(p pVar) {
        HashSet hashSet = this.f3088f;
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            WeakReference weakReference = (WeakReference) it2.next();
            if (weakReference.get() == pVar) {
                hashSet.remove(weakReference);
                return;
            }
        }
    }

    public final void i() {
        ArrayList arrayList = this.f3089g;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((FlutterRenderer$ImageReaderSurfaceProducer) obj).getClass();
        }
    }

    public final void j() {
        if (this.f3085c != null) {
            this.f3083a.onSurfaceDestroyed();
            if (this.f3086d) {
                this.f3090h.a();
            }
            this.f3086d = false;
            this.f3085c = null;
        }
    }
}
