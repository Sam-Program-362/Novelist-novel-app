package x0;

import A0.n;
import a2.p;
import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import y0.InterfaceC0499a;

/* renamed from: x0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0497g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0497g f4699a = new C0497g();

    /* renamed from: b, reason: collision with root package name */
    public static final O1.e f4700b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0491a f4701c;

    static {
        p.a(h.class).c();
        f4700b = new O1.e(C0496f.f4698l);
        f4701c = C0491a.f4681a;
    }

    public static C0492b a(Context context) {
        a2.h.e(context, "context");
        InterfaceC0499a interfaceC0499a = (InterfaceC0499a) f4700b.a();
        if (interfaceC0499a == null) {
            n nVar = n.f70c;
            if (n.f70c == null) {
                ReentrantLock reentrantLock = n.f71d;
                reentrantLock.lock();
                try {
                    if (n.f70c == null) {
                        A0.l lVar = null;
                        try {
                            u0.h b3 = A0.i.b();
                            if (b3 != null) {
                                u0.h hVar = u0.h.f4601p;
                                a2.h.e(hVar, "other");
                                Object a3 = b3.f4605o.a();
                                a2.h.d(a3, "<get-bigInteger>(...)");
                                Object a4 = hVar.f4605o.a();
                                a2.h.d(a4, "<get-bigInteger>(...)");
                                if (((BigInteger) a3).compareTo((BigInteger) a4) >= 0) {
                                    A0.l lVar2 = new A0.l(context);
                                    if (lVar2.e()) {
                                        lVar = lVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        n.f70c = new n(lVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            interfaceC0499a = n.f70c;
            a2.h.b(interfaceC0499a);
        }
        int i3 = m.f4711b;
        C0492b c0492b = new C0492b(interfaceC0499a);
        f4701c.getClass();
        return c0492b;
    }
}
