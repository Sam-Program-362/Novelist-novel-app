package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;
import l.C0377a;
import m.C0423c;
import m.C0424d;
import m.C0426f;
import t.AbstractC0468a;

/* loaded from: classes.dex */
public class z {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f2174k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f2175a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final C0426f f2176b = new C0426f();

    /* renamed from: c, reason: collision with root package name */
    public int f2177c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2178d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f2179e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f2180f;

    /* renamed from: g, reason: collision with root package name */
    public int f2181g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2182h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2183i;

    /* renamed from: j, reason: collision with root package name */
    public final A.b f2184j;

    public z() {
        Object obj = f2174k;
        this.f2180f = obj;
        this.f2184j = new A.b(this, 6);
        this.f2179e = obj;
        this.f2181g = -1;
    }

    public static void a(String str) {
        C0377a.S().f3913i.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC0468a.b("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(y yVar) {
        if (yVar.f2172l) {
            if (!yVar.k()) {
                yVar.h(false);
                return;
            }
            int i3 = yVar.f2173m;
            int i4 = this.f2181g;
            if (i3 >= i4) {
                return;
            }
            yVar.f2173m = i4;
            yVar.f2171k.j(this.f2179e);
        }
    }

    public final void c(y yVar) {
        if (this.f2182h) {
            this.f2183i = true;
            return;
        }
        this.f2182h = true;
        do {
            this.f2183i = false;
            if (yVar != null) {
                b(yVar);
                yVar = null;
            } else {
                C0426f c0426f = this.f2176b;
                c0426f.getClass();
                C0424d c0424d = new C0424d(c0426f);
                c0426f.f4095m.put(c0424d, Boolean.FALSE);
                while (c0424d.hasNext()) {
                    b((y) ((Map.Entry) c0424d.next()).getValue());
                    if (this.f2183i) {
                        break;
                    }
                }
            }
        } while (this.f2183i);
        this.f2182h = false;
    }

    public final void d(InterfaceC0146s interfaceC0146s, A a3) {
        Object obj;
        a("observe");
        if (interfaceC0146s.h().f2160c == EnumC0141m.f2150k) {
            return;
        }
        x xVar = new x(this, interfaceC0146s, a3);
        C0426f c0426f = this.f2176b;
        C0423c a4 = c0426f.a(a3);
        if (a4 != null) {
            obj = a4.f4088l;
        } else {
            C0423c c0423c = new C0423c(a3, xVar);
            c0426f.n++;
            C0423c c0423c2 = c0426f.f4094l;
            if (c0423c2 == null) {
                c0426f.f4093k = c0423c;
                c0426f.f4094l = c0423c;
            } else {
                c0423c2.f4089m = c0423c;
                c0423c.n = c0423c2;
                c0426f.f4094l = c0423c;
            }
            obj = null;
        }
        y yVar = (y) obj;
        if (yVar != null && !yVar.j(interfaceC0146s)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (yVar != null) {
            return;
        }
        interfaceC0146s.h().a(xVar);
    }

    public void g(A a3) {
        a("removeObserver");
        y yVar = (y) this.f2176b.b(a3);
        if (yVar == null) {
            return;
        }
        yVar.i();
        yVar.h(false);
    }

    public void h(Object obj) {
        a("setValue");
        this.f2181g++;
        this.f2179e = obj;
        c(null);
    }

    public void e() {
    }

    public void f() {
    }
}
