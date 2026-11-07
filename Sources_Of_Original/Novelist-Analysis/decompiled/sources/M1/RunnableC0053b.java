package M1;

import androidx.lifecycle.EnumC0138l;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.parser.external.ExternalParser;
import p003b0.C0157l;
import p031k.C0240s;

/* JADX INFO: renamed from: M1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0053b implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1076k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1077l;

    public /* synthetic */ RunnableC0053b(C0157l c0157l, p003b0.U u) {
        this.f1076k = 6;
        this.f1077l = c0157l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zIsEmpty;
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
                    HashMap map = c0055d.f1091f;
                    p057t1.a aVar = null;
                    if (map instanceof b2.a) {
                        a2.r.e(map, "kotlin.collections.MutableMap");
                        throw null;
                    }
                    Long l3 = (Long) map.remove(c0054c);
                    if (l3 != null) {
                        c0055d.f1088c.remove(l3);
                        c0055d.f1089d.remove(l3);
                        B1.g gVar = c0055d.f1086a;
                        long jLongValue = l3.longValue();
                        String str = "dev.flutter.pigeon.webview_flutter_android.PigeonInternalInstanceManager.removeStrongReference";
                        new B1.s(((C0057f) gVar.f90l).f1108a, str, (C1.l) C0057f.f1107b.a(), aVar).x(E2.a.B(l3), new B1.d(new C0060i(jLongValue), 6));
                    }
                }
                break;
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
                    uVar.e(EnumC0138l.ON_PAUSE);
                }
                if (e3.f2118k == 0 && e3.f2120m) {
                    uVar.e(EnumC0138l.ON_STOP);
                    e3.n = true;
                    return;
                }
                return;
            case 4:
                p002b.i iVar = (p002b.i) this.f1077l;
                Runnable runnable = iVar.f2298l;
                if (runnable != null) {
                    runnable.run();
                    iVar.f2298l = null;
                    return;
                }
                return;
            case 5:
                p002b.m.a((p002b.m) this.f1077l);
                return;
            case 6:
                C0157l c0157l = (C0157l) this.f1077l;
                a2.h.e(c0157l, "this$0");
                a2.h.e(null, "$operation");
                c0157l.a(null);
                return;
            case 7:
                ((io.flutter.plugin.platform.s) this.f1077l).e(false);
                return;
            case 8:
                ((B1.o) ((B1.o) this.f1077l).f131b).b();
                return;
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
                p033k1.e eVar = (p033k1.e) this.f1077l;
                ArrayList arrayList = eVar.f3826f;
                while (!arrayList.isEmpty() && eVar.f3832l == null) {
                    ((p036l1.d) arrayList.get(0)).f4031a.run();
                    arrayList.remove(0);
                }
                return;
            case 10:
                ExternalParser.lambda$ignoreStream$0((InputStream) this.f1077l);
                return;
            case 11:
                p057t1.i iVar2 = (p057t1.i) this.f1077l;
                ExecutorService executorService = iVar2.f4568a;
                ConcurrentLinkedQueue concurrentLinkedQueue = iVar2.f4569b;
                AtomicBoolean atomicBoolean = iVar2.f4570c;
                if (atomicBoolean.compareAndSet(false, true)) {
                    try {
                        Runnable runnable2 = (Runnable) concurrentLinkedQueue.poll();
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        if (zIsEmpty) {
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
                    break;
                }
                return;
            case 12:
                ((C0240s) this.f1077l).getClass();
                return;
            default:
                ((p063w1.a) this.f1077l).f4659l.f4667f.prefetchDefaultFontManager();
                return;
        }
    }

    public /* synthetic */ RunnableC0053b(Object obj, int i3) {
        this.f1076k = i3;
        this.f1077l = obj;
    }
}
