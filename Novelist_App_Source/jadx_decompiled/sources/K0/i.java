package K0;

import L0.C0041a;
import L0.C0044d;
import L0.s;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f645a;

    /* renamed from: b, reason: collision with root package name */
    public final String f646b;

    /* renamed from: c, reason: collision with root package name */
    public final A.c f647c;

    /* renamed from: d, reason: collision with root package name */
    public final b f648d;

    /* renamed from: e, reason: collision with root package name */
    public final C0041a f649e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f650f;

    /* renamed from: g, reason: collision with root package name */
    public final int f651g;

    /* renamed from: h, reason: collision with root package name */
    public final s f652h;

    /* renamed from: i, reason: collision with root package name */
    public final B1.b f653i;

    /* renamed from: j, reason: collision with root package name */
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
        C0044d f3 = C0044d.f(applicationContext);
        this.f654j = f3;
        this.f651g = f3.f807h.getAndIncrement();
        this.f653i = hVar.f643a;
        Z0.d dVar = f3.f812m;
        dVar.sendMessage(dVar.obtainMessage(7, this));
    }

    public final A0.j a() {
        A0.j jVar = new A0.j(10);
        Set set = Collections.EMPTY_SET;
        if (((o.f) jVar.f57l) == null) {
            jVar.f57l = new o.f(0);
        }
        ((o.f) jVar.f57l).addAll(set);
        Context context = this.f645a;
        jVar.n = context.getClass().getName();
        jVar.f58m = context.getPackageName();
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g1.i b(int r17, L0.k r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            g1.e r2 = new g1.e
            r2.<init>()
            g1.i r3 = r2.f2835a
            B1.b r4 = r0.f653i
            L0.d r6 = r0.f654j
            Z0.d r13 = r6.f812m
            int r7 = r1.f815c
            if (r7 == 0) goto L91
            L0.a r8 = r0.f649e
            boolean r5 = r6.b()
            if (r5 != 0) goto L1e
            goto L5b
        L1e:
            M0.h r5 = M0.h.b()
            java.lang.Object r5 = r5.f959a
            M0.i r5 = (M0.i) r5
            r9 = 1
            if (r5 == 0) goto L5d
            boolean r10 = r5.f961l
            if (r10 == 0) goto L5b
            boolean r5 = r5.f962m
            java.util.concurrent.ConcurrentHashMap r10 = r6.f809j
            java.lang.Object r10 = r10.get(r8)
            L0.p r10 = (L0.p) r10
            if (r10 == 0) goto L59
            K0.c r11 = r10.f824b
            boolean r12 = r11 instanceof com.google.android.gms.common.internal.a
            if (r12 == 0) goto L5b
            com.google.android.gms.common.internal.a r11 = (com.google.android.gms.common.internal.a) r11
            M0.z r12 = r11.u
            if (r12 == 0) goto L59
            boolean r12 = r11.g()
            if (r12 != 0) goto L59
            M0.d r5 = L0.v.b(r10, r11, r7)
            if (r5 == 0) goto L5b
            int r11 = r10.f834l
            int r11 = r11 + r9
            r10.f834l = r11
            boolean r9 = r5.f934m
            goto L5d
        L59:
            r9 = r5
            goto L5d
        L5b:
            r5 = 0
            goto L74
        L5d:
            L0.v r5 = new L0.v
            r10 = 0
            if (r9 == 0) goto L68
            long r14 = java.lang.System.currentTimeMillis()
            goto L69
        L68:
            r14 = r10
        L69:
            if (r9 == 0) goto L6f
            long r10 = android.os.SystemClock.elapsedRealtime()
        L6f:
            r11 = r10
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r11)
        L74:
            if (r5 == 0) goto L91
            r13.getClass()
            A.p r7 = new A.p
            r8 = 1
            r7.<init>(r13, r8)
            r3.getClass()
            g1.g r8 = new g1.g
            r8.<init>(r7, r5)
            java.lang.Object r5 = r3.f2847d
            g1.h r5 = (g1.h) r5
            r5.e(r8)
            r3.f()
        L91:
            L0.A r5 = new L0.A
            r7 = r17
            r5.<init>(r7, r1, r2, r4)
            java.util.concurrent.atomic.AtomicInteger r1 = r6.f808i
            L0.x r2 = new L0.x
            int r1 = r1.get()
            r2.<init>(r5, r1, r0)
            r1 = 4
            android.os.Message r1 = r13.obtainMessage(r1, r2)
            r13.sendMessage(r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.i.b(int, L0.k):g1.i");
    }
}
