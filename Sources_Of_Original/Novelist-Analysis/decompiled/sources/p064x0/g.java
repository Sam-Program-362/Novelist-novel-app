package p064x0;

import A0.i;
import A0.l;
import A0.n;
import O1.e;
import a2.h;
import a2.p;
import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import p066y0.a;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f4699a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f4700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f4701c;

    static {
        p.a(h.class).c();
        f4700b = new e(f.f4698l);
        f4701c = a.f4681a;
    }

    public static b a(Context context) {
        h.e(context, "context");
        a aVar = (a) f4700b.a();
        if (aVar == null) {
            n nVar = n.f70c;
            if (n.f70c == null) {
                ReentrantLock reentrantLock = n.f71d;
                reentrantLock.lock();
                try {
                    if (n.f70c == null) {
                        l lVar = null;
                        try {
                            p058u0.h hVarB = i.b();
                            if (hVarB != null) {
                                p058u0.h hVar = p058u0.h.f4601p;
                                h.e(hVar, "other");
                                Object objA = hVarB.f4605o.a();
                                h.d(objA, "<get-bigInteger>(...)");
                                Object objA2 = hVar.f4605o.a();
                                h.d(objA2, "<get-bigInteger>(...)");
                                if (((BigInteger) objA).compareTo((BigInteger) objA2) >= 0) {
                                    l lVar2 = new l(context);
                                    if (lVar2.e()) {
                                        lVar = lVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        n.f70c = new n(lVar);
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            aVar = n.f70c;
            h.b(aVar);
        }
        int i3 = m.f4711b;
        b bVar = new b(aVar);
        f4701c.getClass();
        return bVar;
    }
}
