package M1;

import androidx.lifecycle.EnumC0140l;
import b0.C0165l;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import k.C0355s;
import k1.C0368e;
import l1.C0420d;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.parser.external.ExternalParser;
import t1.C0473a;
import w1.CallableC0490a;

/* renamed from: M1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0053b implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1076k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1077l;

    public /* synthetic */ RunnableC0053b(C0165l c0165l, b0.U u) {
        this.f1076k = 6;
        this.f1077l = c0165l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean isEmpty;
        switch (this.f1076k) {
            case 0:
                C0055d c0055d = (C0055d) this.f1077l;
                if (c0055d.f1095j) {
                    return;
                }
                while (true) {
                    C0054c c0054c = (C0054c) c0055d.f1090e.poll();
                    if (c0054c == null) {
                        c0055d.f1092g.postDelayed(c0055d.f1093h, c0055d.f1096k);
                        return;
                    }
                    HashMap hashMap = c0055d.f1091f;
                    C0473a c0473a = null;
                    if (hashMap instanceof b2.a) {
                        a2.r.e(hashMap, "kotlin.collections.MutableMap");
                        throw null;
                    }
                    Long l3 = (Long) hashMap.remove(c0054c);
                    if (l3 != null) {
                        c0055d.f1088c.remove(l3);
                        c0055d.f1089d.remove(l3);
                        B1.g gVar = c0055d.f1086a;
                        long longValue = l3.longValue();
                        String str = "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference";
                        new B1.s(((C0057f) gVar.f90l).f1108a, str, (C1.l) C0057f.f1107b.a(), c0473a).x(E2.a.B(l3), new B1.d(new C0060i(longValue), 6));
                    }
                }
            case 1:
                ((O.d) this.f1077l).c().b(new I.e("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            case 2:
                ((Q.b) this.f1077l).d().b(new I.e("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            case 3:
                androidx.lifecycle.E e3 = (androidx.lifecycle.E) this.f1077l;
                androidx.lifecycle.u uVar = e3.f2122p;
                if (e3.f2119l == 0) {
                    e3.f2120m = true;
                    uVar.e(EnumC0140l.ON_PAUSE);
                }
                if (e3.f2118k == 0 && e3.f2120m) {
                    uVar.e(EnumC0140l.ON_STOP);
                    e3.n = true;
                    return;
                }
                return;
            case 4:
                b.i iVar = (b.i) this.f1077l;
                Runnable runnable = iVar.f2298l;
                if (runnable != null) {
                    runnable.run();
                    iVar.f2298l = null;
                    return;
                }
                return;
            case 5:
                b.m.a((b.m) this.f1077l);
                return;
            case 6:
                C0165l c0165l = (C0165l) this.f1077l;
                a2.h.e(c0165l, "this$0");
                a2.h.e(null, "$operation");
                c0165l.a(null);
                return;
            case 7:
                ((io.flutter.plugin.platform.s) this.f1077l).e(false);
                return;
            case 8:
                ((B1.o) ((B1.o) this.f1077l).f131b).b();
                return;
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                C0368e c0368e = (C0368e) this.f1077l;
                ArrayList arrayList = c0368e.f3826f;
                while (!arrayList.isEmpty() && c0368e.f3832l == null) {
                    ((C0420d) arrayList.get(0)).f4031a.run();
                    arrayList.remove(0);
                }
                return;
            case 10:
                ExternalParser.lambda$ignoreStream$0((InputStream) this.f1077l);
                return;
            case 11:
                t1.i iVar2 = (t1.i) this.f1077l;
                ExecutorService executorService = iVar2.f4568a;
                ConcurrentLinkedQueue concurrentLinkedQueue = iVar2.f4569b;
                AtomicBoolean atomicBoolean = iVar2.f4570c;
                if (atomicBoolean.compareAndSet(false, true)) {
                    try {
                        Runnable runnable2 = (Runnable) concurrentLinkedQueue.poll();
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        if (isEmpty) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        atomicBoolean.set(false);
                        if (!concurrentLinkedQueue.isEmpty()) {
                            executorService.execute(new RunnableC0053b(iVar2, 11));
                        }
                    }
                }
                return;
            case 12:
                ((C0355s) this.f1077l).getClass();
                return;
            default:
                ((CallableC0490a) this.f1077l).f4659l.f4667f.prefetchDefaultFontManager();
                return;
        }
    }

    public /* synthetic */ RunnableC0053b(Object obj, int i3) {
        this.f1076k = i3;
        this.f1077l = obj;
    }
}
