package p054s1;

import A0.j;
import B1.f;
import B1.g;
import B1.p;
import B1.r;
import H0.i;
import N1.b;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.k;
import io.flutter.plugin.platform.s;
import java.util.HashMap;
import java.util.HashSet;
import p004b1.Q;
import p029j0.a;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {
    public static long y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final HashMap f4479z = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f4480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f4481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p057t1.c f4482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f4483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D1.a f4484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f4485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f4486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B1.a f4487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final B1.c f4488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final B1.c f4489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p f4490k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final A.c f4491l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f4492m;
    public final g n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r f4493o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final B1.a f4494p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g f4495q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final A.c f4496r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f4497s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final io.flutter.plugin.platform.r f4498t;
    public final Q u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f4500w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashSet f4499v = new HashSet();
    public final a x = new a(this);

    public c(Context context, FlutterJNI flutterJNI, s sVar, boolean z3, boolean z4) throws Exception {
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
        j jVarE = j.E();
        if (flutterJNI == null) {
            Object obj = jVarE.f58m;
            flutterJNI = new FlutterJNI();
        }
        this.f4480a = flutterJNI;
        p057t1.c cVar = new p057t1.c(flutterJNI, assets, this.f4500w);
        this.f4482c = cVar;
        flutterJNI.setPlatformMessageHandler(cVar.n);
        j.E().getClass();
        this.f4485f = new j(cVar, flutterJNI);
        new B1.b(cVar);
        this.f4486g = new f(cVar);
        A.c cVar2 = new A.c(cVar, 2);
        this.f4487h = new B1.a(cVar, 2);
        this.f4488i = new B1.c(cVar, 1);
        this.f4489j = new B1.c(cVar, 0);
        this.f4491l = new A.c(cVar, 3);
        A.c cVar3 = new A.c(cVar, context.getPackageManager());
        B1.s sVar2 = new B1.s(cVar, "flutter/restoration", C1.r.f180a, null);
        p pVar = new p();
        pVar.f134b = false;
        pVar.f135c = false;
        B1.a aVar = new B1.a(pVar, 4);
        pVar.f137e = sVar2;
        pVar.f133a = z4;
        sVar2.z(aVar);
        this.f4490k = pVar;
        this.f4492m = new i(cVar);
        this.n = new g(cVar, 3);
        r rVar = new r(cVar);
        this.f4493o = rVar;
        this.f4494p = new B1.a(cVar, 6);
        this.f4495q = new g(cVar, 4);
        this.f4496r = new A.c(cVar, 8);
        D1.a aVar2 = new D1.a(context, cVar2);
        this.f4484e = aVar2;
        p063w1.c cVar4 = (p063w1.c) jVarE.f57l;
        if (!flutterJNI.isAttached()) {
            cVar4.d(context.getApplicationContext());
            cVar4.a(context, null);
        }
        io.flutter.plugin.platform.r rVar2 = new io.flutter.plugin.platform.r();
        rVar2.f3208k = sVar.f3228k;
        rVar2.f3211o = flutterJNI;
        sVar.f3231o = flutterJNI;
        flutterJNI.addEngineLifecycleListener(this.x);
        flutterJNI.setPlatformViewsController(sVar);
        flutterJNI.setPlatformViewsController2(rVar2);
        flutterJNI.setLocalizationPlugin(aVar2);
        jVarE.getClass();
        flutterJNI.setDeferredComponentManager(null);
        flutterJNI.setSettingsChannel(rVar);
        if (!flutterJNI.isAttached()) {
            flutterJNI.attachToNative();
            if (!flutterJNI.isAttached()) {
                throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
            }
        }
        this.f4481b = new k(flutterJNI);
        this.f4497s = sVar;
        this.f4498t = rVar2;
        Q q3 = new Q(4, false);
        q3.f2599l = sVar;
        q3.f2600m = rVar2;
        this.u = q3;
        a aVar3 = new a(context.getApplicationContext(), this, cVar4);
        this.f4483d = aVar3;
        aVar2.b(context.getResources().getConfiguration());
        if (z3 && cVar4.f4666e.f2844a) {
            E2.a.K(this);
        }
        p000a.a.k(context, this);
        aVar3.a(new F1.a(cVar3));
    }
}
