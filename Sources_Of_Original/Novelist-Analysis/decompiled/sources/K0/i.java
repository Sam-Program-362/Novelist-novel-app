package K0;

import L0.A;
import L0.C0041a;
import L0.C0044d;
import L0.s;
import L0.v;
import L0.x;
import M0.C0048d;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A.c f647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0041a f649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Looper f650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final B1.b f653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0044d f654j;

    public i(Context context, A.c cVar, b bVar, h hVar) {
        M0.r.g(context, "Null context is not permitted.");
        M0.r.g(cVar, "Api must not be null.");
        M0.r.g(hVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        M0.r.g(applicationContext, "The provided context did not have an application context.");
        this.f645a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f646b = attributionTag;
        this.f647c = cVar;
        this.f648d = bVar;
        this.f650f = hVar.f644b;
        this.f649e = new C0041a(cVar, bVar, attributionTag);
        this.f652h = new s(this);
        C0044d c0044dF = C0044d.f(applicationContext);
        this.f654j = c0044dF;
        this.f651g = c0044dF.f807h.getAndIncrement();
        this.f653i = hVar.f643a;
        Z0.d dVar = c0044dF.f812m;
        dVar.sendMessage(dVar.obtainMessage(7, this));
    }

    public final A0.j a() {
        A0.j jVar = new A0.j(10);
        Set set = Collections.EMPTY_SET;
        if (((p042o.f) jVar.f57l) == null) {
            jVar.f57l = new p042o.f(0);
        }
        ((p042o.f) jVar.f57l).addAll(set);
        Context context = this.f645a;
        jVar.n = context.getClass().getName();
        jVar.f58m = context.getPackageName();
        return jVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    public final p019g1.i b(int i3, L0.k kVar) {
        v vVar;
        p019g1.e eVar = new p019g1.e();
        p019g1.i iVar = eVar.f2835a;
        B1.b bVar = this.f653i;
        C0044d c0044d = this.f654j;
        Z0.d dVar = c0044d.f812m;
        int i4 = kVar.f815c;
        if (i4 != 0) {
            C0041a c0041a = this.f649e;
            if (c0044d.b()) {
                M0.i iVar2 = (M0.i) M0.h.b().f959a;
                boolean z3 = true;
                if (iVar2 != null) {
                    if (iVar2.f961l) {
                        boolean z4 = iVar2.f962m;
                        L0.p pVar = (L0.p) c0044d.f809j.get(c0041a);
                        if (pVar != null) {
                            c cVar = pVar.f824b;
                            if (cVar instanceof com.google.android.gms.common.internal.a) {
                                com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) cVar;
                                if (aVar.u == null || aVar.g()) {
                                    z3 = z4;
                                } else {
                                    C0048d c0048dB = v.b(pVar, aVar, i4);
                                    if (c0048dB != null) {
                                        pVar.f834l++;
                                        z3 = c0048dB.f934m;
                                    }
                                }
                            }
                        } else {
                            z3 = z4;
                        }
                    }
                    vVar = null;
                }
                vVar = new v(c0044d, i4, c0041a, z3 ? System.currentTimeMillis() : 0L, z3 ? SystemClock.elapsedRealtime() : 0L);
            } else {
                vVar = null;
            }
            if (vVar != null) {
                dVar.getClass();
                A.p pVar2 = new A.p(dVar, 1);
                iVar.getClass();
                ((p019g1.h) iVar.f2847d).e(new p019g1.g(pVar2, vVar));
                iVar.f();
            }
        }
        dVar.sendMessage(dVar.obtainMessage(4, new x(new A(i3, kVar, eVar, bVar), c0044d.f808i.get(), this)));
        return iVar;
    }
}
