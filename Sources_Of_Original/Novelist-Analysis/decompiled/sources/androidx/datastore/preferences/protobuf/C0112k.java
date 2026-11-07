package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.pipes.PipesServer;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0112k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0111j f2073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2075c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2076d = 0;

    public C0112k(AbstractC0111j abstractC0111j) {
        Charset charset = AbstractC0124x.f2114a;
        this.f2073a = abstractC0111j;
        abstractC0111j.f2071b = this;
    }

    public final int a() {
        int i3 = this.f2076d;
        if (i3 != 0) {
            this.f2074b = i3;
            this.f2076d = 0;
        } else {
            this.f2074b = this.f2073a.u();
        }
        int i4 = this.f2074b;
        if (i4 == 0 || i4 == this.f2075c) {
            return Integer.MAX_VALUE;
        }
        return i4 >>> 3;
    }

    public final void b(Object obj, V v3, C0115n c0115n) {
        int i3 = this.f2075c;
        this.f2075c = ((this.f2074b >>> 3) << 3) | 4;
        try {
            v3.g(obj, this, c0115n);
            if (this.f2074b != this.f2075c) {
                throw new C0126z("Failed to parse the message.");
            }
            this.f2075c = i3;
        } catch (Throwable th) {
            this.f2075c = i3;
            throw th;
        }
    }

    public final void c(Object obj, V v3, C0115n c0115n) throws C0126z {
        AbstractC0111j abstractC0111j = this.f2073a;
        int iV = abstractC0111j.v();
        if (abstractC0111j.f2070a >= 100) {
            throw new C0126z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iE = abstractC0111j.e(iV);
        abstractC0111j.f2070a++;
        v3.g(obj, this, c0115n);
        abstractC0111j.a(0);
        abstractC0111j.f2070a--;
        abstractC0111j.d(iE);
    }

    public final void d(InterfaceC0123w interfaceC0123w) throws C0126z {
        int iU;
        int i3 = this.f2074b & 7;
        AbstractC0111j abstractC0111j = this.f2073a;
        if (i3 == 0) {
            do {
                ((T) interfaceC0123w).add(Boolean.valueOf(abstractC0111j.f()));
                if (abstractC0111j.c()) {
                    return;
                } else {
                    iU = abstractC0111j.u();
                }
            } while (iU == this.f2074b);
            this.f2076d = iU;
            return;
        }
        if (i3 != 2) {
            throw C0126z.b();
        }
        int iB = abstractC0111j.b() + abstractC0111j.v();
        do {
            ((T) interfaceC0123w).add(Boolean.valueOf(abstractC0111j.f()));
        } while (abstractC0111j.b() < iB);
        v(iB);
    }

    public final C0108g e() throws C0125y {
        w(2);
        return this.f2073a.g();
    }

    public final void f(InterfaceC0123w interfaceC0123w) throws C0125y {
        int iU;
        if ((this.f2074b & 7) != 2) {
            throw C0126z.b();
        }
        do {
            ((T) interfaceC0123w).add(e());
            AbstractC0111j abstractC0111j = this.f2073a;
            if (abstractC0111j.c()) {
                return;
            } else {
                iU = abstractC0111j.u();
            }
        } while (iU == this.f2074b);
        this.f2076d = iU;
    }

    public final void g(InterfaceC0123w interfaceC0123w) throws C0126z {
        int iU;
        int i3 = this.f2074b & 7;
        AbstractC0111j abstractC0111j = this.f2073a;
        if (i3 == 1) {
            do {
                ((T) interfaceC0123w).add(Double.valueOf(abstractC0111j.h()));
                if (abstractC0111j.c()) {
                    return;
                } else {
                    iU = abstractC0111j.u();
                }
            } while (iU == this.f2074b);
            this.f2076d = iU;
            return;
        }
        if (i3 != 2) {
            throw C0126z.b();
        }
        int iV = abstractC0111j.v();
        if ((iV & 7) != 0) {
            throw new C0126z("Failed to parse the message.");
        }
        int iB = abstractC0111j.b() + iV;
        do {
            ((T) interfaceC0123w).add(Double.valueOf(abstractC0111j.h()));
        } while (abstractC0111j.b() < iB);
    }

    public final void h(InterfaceC0123w interfaceC0123w) throws C0126z {
        int iU;
        int i3 = this.f2074b & 7;
        AbstractC0111j abstractC0111j = this.f2073a;
        if (i3 == 0) {
            do {
                ((T) interfaceC0123w).add(Integer.valueOf(abstractC0111j.i()));
                if (abstractC0111j.c()) {
                    return;
                } else {
                    iU = abstractC0111j.u();
                }
            } while (iU == this.f2074b);
            this.f2076d = iU;
            return;
        }
        if (i3 != 2) {
            throw C0126z.b();
        }
        int iB = abstractC0111j.b() + abstractC0111j.v();
        do {
            ((T) interfaceC0123w).add(Integer.valueOf(abstractC0111j.i()));
        } while (abstractC0111j.b() < iB);
        v(iB);
    }

    public final Object i(q0 q0Var, Class cls, C0115n c0115n) throws C0126z {
        int iOrdinal = q0Var.ordinal();
        AbstractC0111j abstractC0111j = this.f2073a;
        switch (iOrdinal) {
            case 0:
                w(1);
                return Double.valueOf(abstractC0111j.h());
            case 1:
                w(5);
                return Float.valueOf(abstractC0111j.l());
            case 2:
                w(0);
                return Long.valueOf(abstractC0111j.n());
            case 3:
                w(0);
                return Long.valueOf(abstractC0111j.w());
            case 4:
                w(0);
                return Integer.valueOf(abstractC0111j.m());
            case 5:
                w(1);
                return Long.valueOf(abstractC0111j.k());
            case 6:
                w(5);
                return Integer.valueOf(abstractC0111j.j());
            case 7:
                w(0);
                return Boolean.valueOf(abstractC0111j.f());
            case 8:
                w(2);
                return abstractC0111j.t();
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                V vA = S.f2003c.a(cls);
                AbstractC0122v abstractC0122vNewInstance = vA.newInstance();
                c(abstractC0122vNewInstance, vA, c0115n);
                vA.d(abstractC0122vNewInstance);
                return abstractC0122vNewInstance;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(abstractC0111j.v());
            case 13:
                w(0);
                return Integer.valueOf(abstractC0111j.i());
            case 14:
                w(5);
                return Integer.valueOf(abstractC0111j.o());
            case 15:
                w(1);
                return Long.valueOf(abstractC0111j.p());
            case 16:
                w(0);
                return Integer.valueOf(abstractC0111j.q());
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                w(0);
                return Long.valueOf(abstractC0111j.r());
        }
    }

    public final void j(InterfaceC0123w interfaceC0123w) throws C0126z {
        int iU;
        int i3 = this.f2074b & 7;
        AbstractC0111j abstractC0111j = this.f2073a;
        if (i3 == 2) {
            int iV = abstractC0111j.v();
            if ((iV & 3) != 0) {
                throw new C0126z("Failed to parse the message.");
            }
            int iB = abstractC0111j.b() + iV;
            do {
                ((T) interfaceC0123w).add(Integer.valueOf(abstractC0111j.j()));
            } while (abstractC0111j.b() < iB);
            return;
        }
        if (i3 != 5) {
            throw C0126z.b();
        }
        do {
            ((T) interfaceC0123w).add(Integer.valueOf(abstractC0111j.j()));
            if (abstractC0111j.c()) {
                return;
            } else {
                iU = abstractC0111j.u();
            }
        } while (iU == this.f2074b);
        this.f2076d = iU;
    }

    public final void k(InterfaceC0123w interfaceC0123w) throws C0126z {
        int iU;
        int i3 = this.f2074b & 7;
        AbstractC0111j abstractC0111j = this.f2073a;
        if (i3 == 1) {
            do {
                ((T) interfaceC0123w).add(Long.valueOf(abstractC0111j.k()));
                if (abstractC0111j.c()) {
                    return;
                } else {
                    iU = abstractC0111j.u();
                }
            } while (iU == this.f2074b);
            this.f2076d = iU;
            return;
        }
        if (i3 != 2) {
            throw C0126z.b();
        }
        int iV = abstractC0111j.v();
        if ((iV & 7) != 0) {
            throw new C0126z("Failed to parse the message.");
        }
        int iB = abstractC0111j.b() + iV;
        do {
            ((T) interfaceC0123w).add(Long.valueOf(abstractC0111j.k()));
        } while (abstractC0111j.b() < iB);
    }

    public final void l(InterfaceC0123w interfaceC0123w) throws C0126z {
        int iU;
        int i3 = this.f2074b & 7;
        AbstractC0111j abstractC0111j = this.f2073a;
        if (i3 == 2) {
            int iV = abstractC0111j.v();
            if ((iV & 3) != 0) {
                throw new C0126z("Failed to parse the message.");
            }
            int iB = abstractC0111j.b() + iV;
            do {
                ((T) interfaceC0123w).add(Float.valueOf(abstractC0111j.l()));
            } while (abstractC0111j.b() < iB);
            return;
        }
        if (i3 != 5) {
            throw C0126z.b();
        }
        do {
            ((T) interfaceC0123w).add(Float.valueOf(abstractC0111j.l()));
            if (abstractC0111j.c()) {
                return;
            } else {
                iU = abstractC0111j.u();
            }
        } while (iU == this.f2074b);
        this.f2076d = iU;
    }

    public final void m(InterfaceC0123w interfaceC0123w) throws C0126z {
        int iU;
        int i3 = this.f2074b & 7;
        AbstractC0111j abstractC0111j = this.f2073a;
        if (i3 == 0) {
            do {
                ((T) interfaceC0123w).add(Integer.valueOf(abstractC0111j.m()));
                if (abstractC0111j.c()) {
                    return;
                } else {
                    iU = abstractC0111j.u();
                }
            } while (iU == this.f2074b);
            this.f2076d = iU;
            return;
        }
        if (i3 != 2) {
            throw C0126z.b();
        }
        int iB = abstractC0111j.b() + abstractC0111j.v();
        do {
            ((T) interfaceC0123w).add(Integer.valueOf(abstractC0111j.m()));
        } while (abstractC0111j.b() < iB);
        v(iB);
    }

    public final void n(InterfaceC0123w interfaceC0123w) throws C0126z {
        int iU;
        int i3 = this.f2074b & 7;
        AbstractC0111j abstractC0111j = this.f2073a;
        if (i3 == 0) {
            do {
                ((T) interfaceC0123w).add(Long.valueOf(abstractC0111j.n()));
                if (abstractC0111j.c()) {
                    return;
                } else {
                    iU = abstractC0111j.u();
                }
            } while (iU == this.f2074b);
            this.f2076d = iU;
            return;
        }
        if (i3 != 2) {
            throw C0126z.b();
        }
        int iB = abstractC0111j.b() + abstractC0111j.v();
        do {
            ((T) interfaceC0123w).add(Long.valueOf(abstractC0111j.n()));
        } while (abstractC0111j.b() < iB);
        v(iB);
    }

    public final void o(InterfaceC0123w interfaceC0123w) throws C0126z {
        int iU;
        int i3 = this.f2074b & 7;
        AbstractC0111j abstractC0111j = this.f2073a;
        if (i3 == 2) {
            int iV = abstractC0111j.v();
            if ((iV & 3) != 0) {
                throw new C0126z("Failed to parse the message.");
            }
            int iB = abstractC0111j.b() + iV;
            do {
                ((T) interfaceC0123w).add(Integer.valueOf(abstractC0111j.o()));
            } while (abstractC0111j.b() < iB);
            return;
        }
        if (i3 != 5) {
            throw C0126z.b();
        }
        do {
            ((T) interfaceC0123w).add(Integer.valueOf(abstractC0111j.o()));
            if (abstractC0111j.c()) {
                return;
            } else {
                iU = abstractC0111j.u();
            }
        } while (iU == this.f2074b);
        this.f2076d = iU;
    }

    public final void p(InterfaceC0123w interfaceC0123w) throws C0126z {
        int iU;
        int i3 = this.f2074b & 7;
        AbstractC0111j abstractC0111j = this.f2073a;
        if (i3 == 1) {
            do {
                ((T) interfaceC0123w).add(Long.valueOf(abstractC0111j.p()));
                if (abstractC0111j.c()) {
                    return;
                } else {
                    iU = abstractC0111j.u();
                }
            } while (iU == this.f2074b);
            this.f2076d = iU;
            return;
        }
        if (i3 != 2) {
            throw C0126z.b();
        }
        int iV = abstractC0111j.v();
        if ((iV & 7) != 0) {
            throw new C0126z("Failed to parse the message.");
        }
        int iB = abstractC0111j.b() + iV;
        do {
            ((T) interfaceC0123w).add(Long.valueOf(abstractC0111j.p()));
        } while (abstractC0111j.b() < iB);
    }

    public final void q(InterfaceC0123w interfaceC0123w) throws C0126z {
        int iU;
        int i3 = this.f2074b & 7;
        AbstractC0111j abstractC0111j = this.f2073a;
        if (i3 == 0) {
            do {
                ((T) interfaceC0123w).add(Integer.valueOf(abstractC0111j.q()));
                if (abstractC0111j.c()) {
                    return;
                } else {
                    iU = abstractC0111j.u();
                }
            } while (iU == this.f2074b);
            this.f2076d = iU;
            return;
        }
        if (i3 != 2) {
            throw C0126z.b();
        }
        int iB = abstractC0111j.b() + abstractC0111j.v();
        do {
            ((T) interfaceC0123w).add(Integer.valueOf(abstractC0111j.q()));
        } while (abstractC0111j.b() < iB);
        v(iB);
    }

    public final void r(InterfaceC0123w interfaceC0123w) throws C0126z {
        int iU;
        int i3 = this.f2074b & 7;
        AbstractC0111j abstractC0111j = this.f2073a;
        if (i3 == 0) {
            do {
                ((T) interfaceC0123w).add(Long.valueOf(abstractC0111j.r()));
                if (abstractC0111j.c()) {
                    return;
                } else {
                    iU = abstractC0111j.u();
                }
            } while (iU == this.f2074b);
            this.f2076d = iU;
            return;
        }
        if (i3 != 2) {
            throw C0126z.b();
        }
        int iB = abstractC0111j.b() + abstractC0111j.v();
        do {
            ((T) interfaceC0123w).add(Long.valueOf(abstractC0111j.r()));
        } while (abstractC0111j.b() < iB);
        v(iB);
    }

    public final void s(InterfaceC0123w interfaceC0123w, boolean z3) throws C0125y {
        String strS;
        int iU;
        if ((this.f2074b & 7) != 2) {
            throw C0126z.b();
        }
        do {
            AbstractC0111j abstractC0111j = this.f2073a;
            if (z3) {
                w(2);
                strS = abstractC0111j.t();
            } else {
                w(2);
                strS = abstractC0111j.s();
            }
            ((T) interfaceC0123w).add(strS);
            if (abstractC0111j.c()) {
                return;
            } else {
                iU = abstractC0111j.u();
            }
        } while (iU == this.f2074b);
        this.f2076d = iU;
    }

    public final void t(InterfaceC0123w interfaceC0123w) throws C0126z {
        int iU;
        int i3 = this.f2074b & 7;
        AbstractC0111j abstractC0111j = this.f2073a;
        if (i3 == 0) {
            do {
                ((T) interfaceC0123w).add(Integer.valueOf(abstractC0111j.v()));
                if (abstractC0111j.c()) {
                    return;
                } else {
                    iU = abstractC0111j.u();
                }
            } while (iU == this.f2074b);
            this.f2076d = iU;
            return;
        }
        if (i3 != 2) {
            throw C0126z.b();
        }
        int iB = abstractC0111j.b() + abstractC0111j.v();
        do {
            ((T) interfaceC0123w).add(Integer.valueOf(abstractC0111j.v()));
        } while (abstractC0111j.b() < iB);
        v(iB);
    }

    public final void u(InterfaceC0123w interfaceC0123w) throws C0126z {
        int iU;
        int i3 = this.f2074b & 7;
        AbstractC0111j abstractC0111j = this.f2073a;
        if (i3 == 0) {
            do {
                ((T) interfaceC0123w).add(Long.valueOf(abstractC0111j.w()));
                if (abstractC0111j.c()) {
                    return;
                } else {
                    iU = abstractC0111j.u();
                }
            } while (iU == this.f2074b);
            this.f2076d = iU;
            return;
        }
        if (i3 != 2) {
            throw C0126z.b();
        }
        int iB = abstractC0111j.b() + abstractC0111j.v();
        do {
            ((T) interfaceC0123w).add(Long.valueOf(abstractC0111j.w()));
        } while (abstractC0111j.b() < iB);
        v(iB);
    }

    public final void v(int i3) throws C0126z {
        if (this.f2073a.b() != i3) {
            throw C0126z.e();
        }
    }

    public final void w(int i3) throws C0125y {
        if ((this.f2074b & 7) != i3) {
            throw C0126z.b();
        }
    }

    public final boolean x() {
        int i3;
        AbstractC0111j abstractC0111j = this.f2073a;
        if (abstractC0111j.c() || (i3 = this.f2074b) == this.f2075c) {
            return false;
        }
        return abstractC0111j.x(i3);
    }
}
