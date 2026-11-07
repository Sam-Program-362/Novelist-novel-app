package s1;

import B1.p;
import B1.r;
import a.AbstractC0102a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import b1.C0192Q;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.platform.s;
import j0.C0315a;
import java.util.HashMap;
import java.util.HashSet;
import t1.C0475c;

/* renamed from: s1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0467c implements N1.b {
    public static long y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final HashMap f4479z = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f4480a;

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.k f4481b;

    /* renamed from: c, reason: collision with root package name */
    public final C0475c f4482c;

    /* renamed from: d, reason: collision with root package name */
    public final C0315a f4483d;

    /* renamed from: e, reason: collision with root package name */
    public final D1.a f4484e;

    /* renamed from: f, reason: collision with root package name */
    public final A0.j f4485f;

    /* renamed from: g, reason: collision with root package name */
    public final B1.f f4486g;

    /* renamed from: h, reason: collision with root package name */
    public final B1.a f4487h;

    /* renamed from: i, reason: collision with root package name */
    public final B1.c f4488i;

    /* renamed from: j, reason: collision with root package name */
    public final B1.c f4489j;

    /* renamed from: k, reason: collision with root package name */
    public final p f4490k;

    /* renamed from: l, reason: collision with root package name */
    public final A.c f4491l;

    /* renamed from: m, reason: collision with root package name */
    public final H0.i f4492m;
    public final B1.g n;

    /* renamed from: o, reason: collision with root package name */
    public final r f4493o;

    /* renamed from: p, reason: collision with root package name */
    public final B1.a f4494p;

    /* renamed from: q, reason: collision with root package name */
    public final B1.g f4495q;

    /* renamed from: r, reason: collision with root package name */
    public final A.c f4496r;

    /* renamed from: s, reason: collision with root package name */
    public final s f4497s;

    /* renamed from: t, reason: collision with root package name */
    public final io.flutter.plugin.platform.r f4498t;
    public final C0192Q u;

    /* renamed from: w, reason: collision with root package name */
    public final long f4500w;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f4499v = new HashSet();
    public final C0465a x = new C0465a(this);

    public C0467c(Context context, FlutterJNI flutterJNI, s sVar, boolean z3, boolean z4) {
        AssetManager assets;
        long j3 = y;
        y = 1 + j3;
        this.f4500w = j3;
        f4479z.put(Long.valueOf(j3), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        A0.j E3 = A0.j.E();
        if (flutterJNI == null) {
            Object obj = E3.f58m;
            flutterJNI = new FlutterJNI();
        }
        this.f4480a = flutterJNI;
        C0475c c0475c = new C0475c(flutterJNI, assets, this.f4500w);
        this.f4482c = c0475c;
        flutterJNI.setPlatformMessageHandler(c0475c.n);
        A0.j.E().getClass();
        this.f4485f = new A0.j(c0475c, flutterJNI);
        new B1.b(c0475c);
        this.f4486g = new B1.f(c0475c);
        A.c cVar = new A.c(c0475c, 2);
        this.f4487h = new B1.a(c0475c, 2);
        this.f4488i = new B1.c(c0475c, 1);
        this.f4489j = new B1.c(c0475c, 0);
        this.f4491l = new A.c(c0475c, 3);
        A.c cVar2 = new A.c(c0475c, context.getPackageManager());
        B1.s sVar2 = new B1.s(c0475c, "flutter/restoration", C1.r.f180a, null);
        p pVar = new p();
        pVar.f134b = false;
        pVar.f135c = false;
        B1.a aVar = new B1.a(pVar, 4);
        pVar.f137e = sVar2;
        pVar.f133a = z4;
        sVar2.z(aVar);
        this.f4490k = pVar;
        this.f4492m = new H0.i(c0475c);
        this.n = new B1.g(c0475c, 3);
        r rVar = new r(c0475c);
        this.f4493o = rVar;
        this.f4494p = new B1.a(c0475c, 6);
        this.f4495q = new B1.g(c0475c, 4);
        this.f4496r = new A.c(c0475c, 8);
        D1.a aVar2 = new D1.a(context, cVar);
        this.f4484e = aVar2;
        w1.c cVar3 = (w1.c) E3.f57l;
        if (!flutterJNI.isAttached()) {
            cVar3.d(context.getApplicationContext());
            cVar3.a(context, null);
        }
        io.flutter.plugin.platform.r rVar2 = new io.flutter.plugin.platform.r();
        rVar2.f3208k = sVar.f3228k;
        rVar2.f3211o = flutterJNI;
        sVar.f3231o = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.x);
        flutterJNI.setPlatformViewsController(sVar);
        flutterJNI.setPlatformViewsController2(rVar2);
        flutterJNI.setLocalizationPlugin(aVar2);
        E3.getClass();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(rVar);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f4481b = new io.flutter.embedding.engine.renderer.k(flutterJNI);
        this.f4497s = sVar;
        this.f4498t = rVar2;
        C0192Q c0192q = new C0192Q(4, false);
        c0192q.f2599l = sVar;
        c0192q.f2600m = rVar2;
        this.u = c0192q;
        C0315a c0315a = new C0315a(context.getApplicationContext(), this, cVar3);
        this.f4483d = c0315a;
        aVar2.b(context.getResources().getConfiguration());
        if (z3 && cVar3.f4666e.f2844a) {
            E2.a.K(this);
        }
        AbstractC0102a.k(context, this);
        c0315a.a(new F1.a(cVar2));
    }
}
