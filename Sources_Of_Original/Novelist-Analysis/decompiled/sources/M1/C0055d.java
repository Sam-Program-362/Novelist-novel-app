package M1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: M1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0055d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B1.g f1086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f1087b = new WeakHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f1088c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f1089d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReferenceQueue f1090e = new ReferenceQueue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f1091f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f1092g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RunnableC0053b f1093h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f1094i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1095j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f1096k;

    public C0055d(B1.g gVar) {
        this.f1086a = gVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f1092g = handler;
        RunnableC0053b runnableC0053b = new RunnableC0053b(this, 0);
        this.f1093h = runnableC0053b;
        this.f1094i = 65536L;
        this.f1096k = 3000L;
        handler.postDelayed(runnableC0053b, 3000L);
    }

    public final void a(long j3, Object obj) {
        a2.h.e(obj, "instance");
        f();
        c(j3, obj);
    }

    public final long b(Object obj) {
        a2.h.e(obj, "instance");
        f();
        if (!d(obj)) {
            long j3 = this.f1094i;
            this.f1094i = 1 + j3;
            c(j3, obj);
            return j3;
        }
        throw new IllegalArgumentException(("Instance of " + obj.getClass() + " has already been added.").toString());
    }

    public final void c(long j3, Object obj) {
        if (j3 < 0) {
            throw new IllegalArgumentException(("Identifier must be >= 0: " + j3).toString());
        }
        Long lValueOf = Long.valueOf(j3);
        HashMap map = this.f1088c;
        if (map.containsKey(lValueOf)) {
            throw new IllegalArgumentException(("Identifier has already been added: " + j3).toString());
        }
        C0054c c0054c = new C0054c(obj, this.f1090e);
        this.f1087b.put(c0054c, Long.valueOf(j3));
        map.put(Long.valueOf(j3), c0054c);
        this.f1091f.put(c0054c, Long.valueOf(j3));
        this.f1089d.put(Long.valueOf(j3), obj);
    }

    public final boolean d(Object obj) {
        f();
        if (obj != null) {
            return this.f1087b.containsKey(new C0054c(obj));
        }
        return false;
    }

    public final Object e(long j3) {
        f();
        C0054c c0054c = (C0054c) this.f1088c.get(Long.valueOf(j3));
        if (c0054c != null) {
            return c0054c.get();
        }
        return null;
    }

    public final void f() {
        if (this.f1095j) {
            Log.w("PigeonInstanceManager", "The manager was used after calls to the PigeonFinalizationListener has been stopped.");
        }
    }
}
