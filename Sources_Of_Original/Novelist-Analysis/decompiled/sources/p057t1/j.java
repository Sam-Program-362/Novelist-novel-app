package p057t1;

import C1.e;
import C1.f;
import C1.k;
import N1.a;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import w.d;

/* JADX INFO: loaded from: classes.dex */
public final class j implements f, k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final FlutterJNI f4571k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashMap f4572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashMap f4573m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f4574o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashMap f4575p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4576q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f4577r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final WeakHashMap f4578s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f4579t;

    public j(FlutterJNI flutterJNI) {
        d dVar = new d();
        dVar.f4639a = (ExecutorService) A0.j.E().n;
        this.f4572l = new HashMap();
        this.f4573m = new HashMap();
        this.n = new Object();
        this.f4574o = new AtomicBoolean(false);
        this.f4575p = new HashMap();
        this.f4576q = 1;
        this.f4577r = new l();
        this.f4578s = new WeakHashMap();
        this.f4571k = flutterJNI;
        this.f4579t = dVar;
    }

    @Override // C1.f
    public final a a(k kVar) {
        d dVar = this.f4579t;
        dVar.getClass();
        i iVar = new i((ExecutorService) dVar.f4639a);
        a aVar = new a();
        this.f4578s.put(aVar, iVar);
        return aVar;
    }

    @Override // C1.f
    public final void b(String str, C1.d dVar) {
        c(str, dVar, null);
    }

    @Override // C1.f
    public final void c(String str, C1.d dVar, a aVar) {
        f fVar;
        if (dVar == null) {
            synchronized (this.n) {
                this.f4572l.remove(str);
            }
            return;
        }
        if (aVar != null) {
            fVar = (f) this.f4578s.get(aVar);
            if (fVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            fVar = null;
        }
        synchronized (this.n) {
            try {
                this.f4572l.put(str, new g(dVar, fVar));
                List<e> list = (List) this.f4573m.remove(str);
                if (list == null) {
                    return;
                }
                for (e eVar : list) {
                    d(str, (g) this.f4572l.get(str), eVar.f4560a, eVar.f4561b, eVar.f4562c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [t1.d] */
    public final void d(final String str, final g gVar, final ByteBuffer byteBuffer, final int i3, final long j3) {
        f fVar = gVar != null ? gVar.f4564b : null;
        String strA = a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            p043o0.a.a(E2.a.V(strA), i3);
        } else {
            String strV = E2.a.V(strA);
            try {
                if (E2.a.f292c == null) {
                    E2.a.f292c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                E2.a.f292c.invoke(null, Long.valueOf(E2.a.f290a), strV, Integer.valueOf(i3));
            } catch (Exception e3) {
                E2.a.y("asyncTraceBegin", e3);
            }
        }
        ?? r3 = new Runnable() { // from class: t1.d
            @Override // java.lang.Runnable
            public final void run() {
                long j4 = j3;
                FlutterJNI flutterJNI = this.f4555k.f4571k;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String strA2 = a.a(sb.toString());
                int i4 = Build.VERSION.SDK_INT;
                int i5 = i3;
                if (i4 >= 29) {
                    p043o0.a.b(E2.a.V(strA2), i5);
                } else {
                    String strV2 = E2.a.V(strA2);
                    try {
                        if (E2.a.f293d == null) {
                            E2.a.f293d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        E2.a.f293d.invoke(null, Long.valueOf(E2.a.f290a), strV2, Integer.valueOf(i5));
                    } catch (Exception e4) {
                        E2.a.y("asyncTraceEnd", e4);
                    }
                }
                try {
                    a.b("DartMessenger#handleMessageFromDart on " + str2);
                    g gVar2 = gVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (gVar2 != null) {
                            try {
                                try {
                                    gVar2.f4563a.o(byteBuffer2, new h(flutterJNI, i5));
                                } catch (Exception e5) {
                                    Log.e("DartMessenger", "Uncaught exception in binary message listener", e5);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i5);
                                }
                            } catch (Error e6) {
                                Thread threadCurrentThread = Thread.currentThread();
                                if (threadCurrentThread.getUncaughtExceptionHandler() == null) {
                                    throw e6;
                                }
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, e6);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i5);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                        flutterJNI.cleanupMessageData(j4);
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    flutterJNI.cleanupMessageData(j4);
                    throw th3;
                }
            }
        };
        f fVar2 = fVar;
        if (fVar == null) {
            fVar2 = this.f4577r;
        }
        fVar2.a(r3);
    }

    @Override // C1.f
    public final void f(String str, ByteBuffer byteBuffer, e eVar) {
        a.b("DartMessenger#send on " + str);
        try {
            int i3 = this.f4576q;
            this.f4576q = i3 + 1;
            if (eVar != null) {
                this.f4575p.put(Integer.valueOf(i3), eVar);
            }
            FlutterJNI flutterJNI = this.f4571k;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, i3);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i3);
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // C1.f
    public final void h(String str, ByteBuffer byteBuffer) {
        f(str, byteBuffer, null);
    }
}
