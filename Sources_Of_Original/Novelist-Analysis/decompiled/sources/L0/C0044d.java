package L0;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: L0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0044d implements Handler.Callback {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Status f796o = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Status f797p = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object f798q = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static C0044d f799r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public M0.j f802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public O0.b f803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J0.d f805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final A.c f806g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicInteger f807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f808i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f809j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p042o.f f810k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p042o.f f811l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Z0.d f812m;
    public volatile boolean n;

    public C0044d(Context context, Looper looper) {
        J0.d dVar = J0.d.f550c;
        this.f800a = 10000L;
        this.f801b = false;
        this.f807h = new AtomicInteger(1);
        this.f808i = new AtomicInteger(0);
        this.f809j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f810k = new p042o.f(0);
        this.f811l = new p042o.f(0);
        this.n = true;
        this.f804e = context;
        Z0.d dVar2 = new Z0.d(looper, this);
        Looper.getMainLooper();
        this.f812m = dVar2;
        this.f805f = dVar;
        this.f806g = new A.c(22);
        PackageManager packageManager = context.getPackageManager();
        if (H2.h.f465h == null) {
            H2.h.f465h = Boolean.valueOf(S0.a.w() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (H2.h.f465h.booleanValue()) {
            this.n = false;
        }
        dVar2.sendMessage(dVar2.obtainMessage(6));
    }

    public static void a() {
        synchronized (f798q) {
            try {
                C0044d c0044d = f799r;
                if (c0044d != null) {
                    c0044d.f808i.incrementAndGet();
                    Z0.d dVar = c0044d.f812m;
                    dVar.sendMessageAtFrontOfQueue(dVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status d(C0041a c0041a, J0.a aVar) {
        return new Status(17, B1.e.k("API: ", (String) c0041a.f789b.f7m, " is not available on this device. Connection failed with: ", String.valueOf(aVar)), aVar.f541m, aVar);
    }

    public static C0044d f(Context context) {
        C0044d c0044d;
        HandlerThread handlerThread;
        synchronized (f798q) {
            if (f799r == null) {
                synchronized (M0.D.f912g) {
                    try {
                        handlerThread = M0.D.f914i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            M0.D.f914i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = M0.D.f914i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = J0.d.f549b;
                f799r = new C0044d(applicationContext, looper);
            }
            c0044d = f799r;
        }
        return c0044d;
    }

    public final boolean b() {
        if (this.f801b) {
            return false;
        }
        M0.i iVar = (M0.i) M0.h.b().f959a;
        if (iVar != null && !iVar.f961l) {
            return false;
        }
        int i3 = ((SparseIntArray) this.f806g.f6l).get(203400000, -1);
        return i3 == -1 || i3 == 0;
    }

    public final boolean c(J0.a aVar, int i3) {
        boolean zBooleanValue;
        PendingIntent activity;
        Boolean bool;
        J0.d dVar = this.f805f;
        Context context = this.f804e;
        dVar.getClass();
        synchronized (S0.a.class) {
            try {
                Context applicationContext = context.getApplicationContext();
                Context context2 = S0.a.f1256a;
                if (context2 == null || (bool = S0.a.f1257b) == null || context2 != applicationContext) {
                    S0.a.f1257b = null;
                    if (S0.a.w()) {
                        S0.a.f1257b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                    } else {
                        try {
                            context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                            S0.a.f1257b = Boolean.TRUE;
                        } catch (ClassNotFoundException unused) {
                            S0.a.f1257b = Boolean.FALSE;
                        }
                    }
                    S0.a.f1256a = applicationContext;
                    zBooleanValue = S0.a.f1257b.booleanValue();
                } else {
                    zBooleanValue = bool.booleanValue();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zBooleanValue) {
            return false;
        }
        int i4 = aVar.f540l;
        if ((i4 == 0 || aVar.f541m == null) ? false : true) {
            activity = aVar.f541m;
        } else {
            Intent intentA = dVar.a(context, i4, null);
            activity = intentA != null ? PendingIntent.getActivity(context, 0, intentA, 201326592) : null;
        }
        if (activity == null) {
            return false;
        }
        int i5 = aVar.f540l;
        int i6 = GoogleApiActivity.f2717l;
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i3);
        intent.putExtra("notify_manager", true);
        dVar.f(context, i5, PendingIntent.getActivity(context, 0, intent, Z0.c.f1679a | 134217728));
        return true;
    }

    public final p e(K0.i iVar) {
        C0041a c0041a = iVar.f649e;
        ConcurrentHashMap concurrentHashMap = this.f809j;
        p pVar = (p) concurrentHashMap.get(c0041a);
        if (pVar == null) {
            pVar = new p(this, iVar);
            concurrentHashMap.put(c0041a, pVar);
        }
        if (pVar.f824b.l()) {
            this.f811l.add(c0041a);
        }
        pVar.m();
        return pVar;
    }

    public final void g(J0.a aVar, int i3) {
        if (c(aVar, i3)) {
            return;
        }
        Z0.d dVar = this.f812m;
        dVar.sendMessage(dVar.obtainMessage(5, i3, 0, aVar));
    }

    /* JADX WARN: Code duplicated, block: B:186:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:188:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:190:0x0407  */
    /* JADX WARN: Code duplicated, block: B:192:0x0411  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v8 L0.p, still in use, count: 2, list:
          (r3v8 L0.p) from 0x03dd: IGET (r3v8 L0.p) A[WRAPPED] (LINE:990) L0.p.g int
          (r3v8 L0.p) from 0x03e3: PHI (r3 I:??) = (r3v5 L0.p), (r3v8 L0.p) binds: [B:184:0x03e2, B:243:0x03e3] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instruction units count: 1264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.C0044d.handleMessage(android.os.Message):boolean");
    }
}
