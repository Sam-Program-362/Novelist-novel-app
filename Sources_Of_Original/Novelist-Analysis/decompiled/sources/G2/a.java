package G2;

import H2.e;
import java.io.Serializable;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class a implements F2.b, Serializable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Queue f402m;

    @Override // F2.b
    public final void A(String str, Object obj, Serializable serializable) {
        B(3, str, obj, serializable);
    }

    public final void B(int i3, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            D(i3, new Object[]{obj});
        } else {
            D(i3, new Object[]{obj, obj2});
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0010  */
    public final void C(int i3, String str, Object[] objArr) {
        Throwable th;
        if (objArr.length == 0) {
            th = null;
        } else {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                th = (Throwable) obj;
            } else {
                th = null;
            }
        }
        if (th == null) {
            D(i3, objArr);
            return;
        }
        if (objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        D(i3, objArr2);
    }

    public final void D(int i3, Object[] objArr) {
        b bVar = new b();
        System.currentTimeMillis();
        bVar.f403a = i3;
        bVar.f404b = this.f401l;
        Thread.currentThread().getName();
        bVar.f405c = objArr;
        this.f402m.add(bVar);
    }

    @Override // F2.b
    public final void a(Object obj, String str) {
        D(1, new Object[]{obj});
    }

    @Override // F2.b
    public final void b(String str, Object... objArr) {
        C(4, str, objArr);
    }

    @Override // F2.b
    public final boolean c() {
        return true;
    }

    @Override // F2.b
    public final boolean d() {
        return true;
    }

    @Override // F2.b
    public final void e(Object... objArr) {
        C(1, "pipesClientId={} didn't receive ready byte from server within StartupTimeoutMillis {}; ms elapsed {}; did read >{}<", objArr);
    }

    @Override // F2.b
    public final void f(String str, Throwable th) {
        D(2, null);
    }

    @Override // F2.b
    public final void g(Object obj, Object obj2) {
        B(1, "Error assigning value '{}' to '{}'", obj, obj2);
    }

    @Override // F2.b
    public final String getName() {
        return this.f400k;
    }

    @Override // F2.b
    public final void i(String str, Throwable th) {
        D(4, null);
    }

    @Override // F2.b
    public final void j(String str, Throwable th) {
        D(1, null);
    }

    @Override // F2.b
    public final void k(String str) {
        D(3, null);
    }

    @Override // F2.b
    public final void l(Object obj, String str) {
        D(5, new Object[]{obj});
    }

    @Override // F2.b
    public final void m(String str) {
        D(2, null);
    }

    @Override // F2.b
    public final void n(String str) {
        D(5, null);
    }

    @Override // F2.b
    public final boolean o() {
        return true;
    }

    @Override // F2.b
    public final void q(String str, Object... objArr) {
        C(2, str, objArr);
    }

    @Override // F2.b
    public final void r(Object obj, Object obj2, String str) {
        B(2, str, obj, obj2);
    }

    @Override // F2.b
    public final void s(Object obj, String str) {
        D(4, new Object[]{obj});
    }

    @Override // F2.b
    public final boolean t() {
        return true;
    }

    @Override // F2.b
    public final void u(String str) {
        D(4, null);
    }

    @Override // F2.b
    public final boolean v() {
        return true;
    }

    @Override // F2.b
    public final void w(Object obj, Object obj2, String str) {
        B(4, str, obj, obj2);
    }

    @Override // F2.b
    public final void x(String str, Integer num) {
        D(2, new Object[]{num});
    }

    @Override // F2.b
    public final void y(String str, Object obj, Serializable serializable) {
        B(5, str, obj, serializable);
    }

    @Override // F2.b
    public final void z(String str, Integer num) {
        D(3, new Object[]{num});
    }
}
