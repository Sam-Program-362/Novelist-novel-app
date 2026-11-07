package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f2174k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2175a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p037m.f f2176b = new p037m.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2177c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f2179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Object f2180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final A.b f2184j;

    public z() {
        Object obj = f2174k;
        this.f2180f = obj;
        this.f2184j = new A.b(this, 6);
        this.f2179e = obj;
        this.f2181g = -1;
    }

    public static void a(String str) {
        p034l.a.S().f3913i.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(p055t.a.b("Cannot invoke ", str, " on a background thread"));
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
                p037m.f fVar = this.f2176b;
                fVar.getClass();
                p037m.d dVar = new p037m.d(fVar);
                fVar.f4095m.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((y) ((Map.Entry) dVar.next()).getValue());
                    if (this.f2183i) {
                        break;
                    }
                }
            }
        } while (this.f2183i);
        this.f2182h = false;
    }

    public final void d(InterfaceC0144s interfaceC0144s, A a3) {
        Object obj;
        a("observe");
        if (interfaceC0144s.h().f2160c == EnumC0139m.f2150k) {
            return;
        }
        x xVar = new x(this, interfaceC0144s, a3);
        p037m.f fVar = this.f2176b;
        p037m.c cVarA = fVar.a(a3);
        if (cVarA != null) {
            obj = cVarA.f4088l;
        } else {
            p037m.c cVar = new p037m.c(a3, xVar);
            fVar.n++;
            p037m.c cVar2 = fVar.f4094l;
            if (cVar2 == null) {
                fVar.f4093k = cVar;
                fVar.f4094l = cVar;
            } else {
                cVar2.f4089m = cVar;
                cVar.n = cVar2;
                fVar.f4094l = cVar;
            }
            obj = null;
        }
        y yVar = (y) obj;
        if (yVar != null && !yVar.j(interfaceC0144s)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (yVar != null) {
            return;
        }
        interfaceC0144s.h().a(xVar);
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
