package t1;

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
import o0.AbstractC0440a;

/* loaded from: classes.dex */
public final class j implements C1.f, k {

    /* renamed from: k, reason: collision with root package name */
    public final FlutterJNI f4571k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f4572l;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f4573m;
    public final Object n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f4574o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f4575p;

    /* renamed from: q, reason: collision with root package name */
    public int f4576q;

    /* renamed from: r, reason: collision with root package name */
    public final l f4577r;

    /* renamed from: s, reason: collision with root package name */
    public final WeakHashMap f4578s;

    /* renamed from: t, reason: collision with root package name */
    public final w.d f4579t;

    public j(FlutterJNI flutterJNI) {
        w.d dVar = new w.d();
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
    public final C0473a a(C1.k kVar) {
        w.d dVar = this.f4579t;
        dVar.getClass();
        i iVar = new i((ExecutorService) dVar.f4639a);
        C0473a c0473a = new C0473a();
        this.f4578s.put(c0473a, iVar);
        return c0473a;
    }

    @Override // C1.f
    public final void b(String str, C1.d dVar) {
        c(str, dVar, null);
    }

    @Override // C1.f
    public final void c(String str, C1.d dVar, C0473a c0473a) {
        InterfaceC0478f interfaceC0478f;
        if (dVar == null) {
            synchronized (this.n) {
                this.f4572l.remove(str);
            }
            return;
        }
        if (c0473a != null) {
            interfaceC0478f = (InterfaceC0478f) this.f4578s.get(c0473a);
            if (interfaceC0478f == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            interfaceC0478f = null;
        }
        synchronized (this.n) {
            try {
                this.f4572l.put(str, new C0479g(dVar, interfaceC0478f));
                List<C0477e> list = (List) this.f4573m.remove(str);
                if (list == null) {
                    return;
                }
                for (C0477e c0477e : list) {
                    d(str, (C0479g) this.f4572l.get(str), c0477e.f4560a, c0477e.f4561b, c0477e.f4562c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [t1.d] */
    public final void d(final String str, final C0479g c0479g, final ByteBuffer byteBuffer, final int i3, final long j3) {
        InterfaceC0478f interfaceC0478f = c0479g != null ? c0479g.f4564b : null;
        String a3 = N1.a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0440a.a(E2.a.V(a3), i3);
        } else {
            String V2 = E2.a.V(a3);
            try {
                if (E2.a.f292c == null) {
                    E2.a.f292c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                E2.a.f292c.invoke(null, Long.valueOf(E2.a.f290a), V2, Integer.valueOf(i3));
            } catch (Exception e3) {
                E2.a.y("asyncTraceBegin", e3);
            }
        }
        ?? r02 = new Runnable() { // from class: t1.d
            @Override // java.lang.Runnable
            public final void run() {
                long j4 = j3;
                FlutterJNI flutterJNI = j.this.f4571k;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a4 = N1.a.a(sb.toString());
                int i4 = Build.VERSION.SDK_INT;
                int i5 = i3;
                if (i4 >= 29) {
                    AbstractC0440a.b(E2.a.V(a4), i5);
                } else {
                    String V3 = E2.a.V(a4);
                    try {
                        if (E2.a.f293d == null) {
                            E2.a.f293d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        E2.a.f293d.invoke(null, Long.valueOf(E2.a.f290a), V3, Integer.valueOf(i5));
                    } catch (Exception e4) {
                        E2.a.y("asyncTraceEnd", e4);
                    }
                }
                try {
                    N1.a.b("DartMessenger#handleMessageFromDart on " + str2);
                    C0479g c0479g2 = c0479g;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    try {
                        if (c0479g2 != null) {
                            try {
                                try {
                                    c0479g2.f4563a.o(byteBuffer2, new C0480h(flutterJNI, i5));
                                } catch (Exception e5) {
                                    Log.e("DartMessenger", "Uncaught exception in binary message listener", e5);
                                    flutterJNI.invokePlatformMessageEmptyResponseCallback(i5);
                                }
                            } catch (Error e6) {
                                Thread currentThread = Thread.currentThread();
                                if (currentThread.getUncaughtExceptionHandler() == null) {
                                    throw e6;
                                }
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e6);
                            }
                        } else {
                            flutterJNI.invokePlatformMessageEmptyResponseCallback(i5);
                        }
                        if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                            byteBuffer2.limit(0);
                        }
                        Trace.endSection();
                    } finally {
                    }
                } finally {
                    flutterJNI.cleanupMessageData(j4);
                }
            }
        };
        InterfaceC0478f interfaceC0478f2 = interfaceC0478f;
        if (interfaceC0478f == null) {
            interfaceC0478f2 = this.f4577r;
        }
        interfaceC0478f2.a(r02);
    }

    @Override // C1.f
    public final void f(String str, ByteBuffer byteBuffer, C1.e eVar) {
        N1.a.b("DartMessenger#send on " + str);
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
