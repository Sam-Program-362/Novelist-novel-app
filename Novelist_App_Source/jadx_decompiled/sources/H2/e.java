package H2;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes.dex */
public final class e implements F2.b {

    /* renamed from: k, reason: collision with root package name */
    public final String f449k;

    /* renamed from: l, reason: collision with root package name */
    public volatile F2.b f450l;

    /* renamed from: m, reason: collision with root package name */
    public Boolean f451m;
    public Method n;

    /* renamed from: o, reason: collision with root package name */
    public G2.a f452o;

    /* renamed from: p, reason: collision with root package name */
    public final Queue f453p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f454q;

    public e(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z3) {
        this.f449k = str;
        this.f453p = linkedBlockingQueue;
        this.f454q = z3;
    }

    @Override // F2.b
    public final void A(String str, Object obj, Serializable serializable) {
        h().A(str, obj, serializable);
    }

    public final boolean B() {
        Boolean bool = this.f451m;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.n = this.f450l.getClass().getMethod("log", G2.b.class);
            this.f451m = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f451m = Boolean.FALSE;
        }
        return this.f451m.booleanValue();
    }

    @Override // F2.b
    public final void a(Object obj, String str) {
        h().a(obj, str);
    }

    @Override // F2.b
    public final void b(String str, Object... objArr) {
        h().b(str, objArr);
    }

    @Override // F2.b
    public final boolean c() {
        return h().c();
    }

    @Override // F2.b
    public final boolean d() {
        return h().d();
    }

    @Override // F2.b
    public final void e(Object... objArr) {
        h().e(objArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && e.class == obj.getClass() && this.f449k.equals(((e) obj).f449k);
    }

    @Override // F2.b
    public final void f(String str, Throwable th) {
        h().f(str, th);
    }

    @Override // F2.b
    public final void g(Object obj, Object obj2) {
        h().g(obj, obj2);
    }

    @Override // F2.b
    public final String getName() {
        return this.f449k;
    }

    public final F2.b h() {
        if (this.f450l != null) {
            return this.f450l;
        }
        if (this.f454q) {
            return b.f444k;
        }
        if (this.f452o == null) {
            Queue queue = this.f453p;
            G2.a aVar = new G2.a();
            aVar.f401l = this;
            aVar.f400k = this.f449k;
            aVar.f402m = queue;
            this.f452o = aVar;
        }
        return this.f452o;
    }

    public final int hashCode() {
        return this.f449k.hashCode();
    }

    @Override // F2.b
    public final void i(String str, Throwable th) {
        h().i(str, th);
    }

    @Override // F2.b
    public final void j(String str, Throwable th) {
        h().j(str, th);
    }

    @Override // F2.b
    public final void k(String str) {
        h().k(str);
    }

    @Override // F2.b
    public final void l(Object obj, String str) {
        h().l(obj, str);
    }

    @Override // F2.b
    public final void m(String str) {
        h().m(str);
    }

    @Override // F2.b
    public final void n(String str) {
        h().n(str);
    }

    @Override // F2.b
    public final boolean o() {
        return h().o();
    }

    @Override // F2.b
    public final boolean p(int i3) {
        return h().p(i3);
    }

    @Override // F2.b
    public final void q(String str, Object... objArr) {
        h().q(str, objArr);
    }

    @Override // F2.b
    public final void r(Object obj, Object obj2, String str) {
        h().r(obj, obj2, str);
    }

    @Override // F2.b
    public final void s(Object obj, String str) {
        h().s(obj, str);
    }

    @Override // F2.b
    public final boolean t() {
        return h().t();
    }

    @Override // F2.b
    public final void u(String str) {
        h().u(str);
    }

    @Override // F2.b
    public final boolean v() {
        return h().v();
    }

    @Override // F2.b
    public final void w(Object obj, Object obj2, String str) {
        h().w(obj, obj2, str);
    }

    @Override // F2.b
    public final void x(String str, Integer num) {
        h().x(str, num);
    }

    @Override // F2.b
    public final void y(String str, Object obj, Serializable serializable) {
        h().y(str, obj, serializable);
    }

    @Override // F2.b
    public final void z(String str, Integer num) {
        h().z(str, num);
    }
}
