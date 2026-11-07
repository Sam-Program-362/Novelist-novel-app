package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import org.apache.tika.fork.ContentHandlerProxy;
import org.apache.tika.pipes.PipesServer;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114k {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0113j f2073a;

    /* renamed from: b, reason: collision with root package name */
    public int f2074b;

    /* renamed from: c, reason: collision with root package name */
    public int f2075c;

    /* renamed from: d, reason: collision with root package name */
    public int f2076d = 0;

    public C0114k(AbstractC0113j abstractC0113j) {
        Charset charset = AbstractC0126x.f2114a;
        this.f2073a = abstractC0113j;
        abstractC0113j.f2071b = this;
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

    public final void b(Object obj, V v3, C0117n c0117n) {
        int i3 = this.f2075c;
        this.f2075c = ((this.f2074b >>> 3) << 3) | 4;
        try {
            v3.g(obj, this, c0117n);
            if (this.f2074b == this.f2075c) {
            } else {
                throw new C0128z("Failed to parse the message.");
            }
        } finally {
            this.f2075c = i3;
        }
    }

    public final void c(Object obj, V v3, C0117n c0117n) {
        AbstractC0113j abstractC0113j = this.f2073a;
        int v4 = abstractC0113j.v();
        if (abstractC0113j.f2070a >= 100) {
            throw new C0128z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int e3 = abstractC0113j.e(v4);
        abstractC0113j.f2070a++;
        v3.g(obj, this, c0117n);
        abstractC0113j.a(0);
        abstractC0113j.f2070a--;
        abstractC0113j.d(e3);
    }

    public final void d(InterfaceC0125w interfaceC0125w) {
        int u;
        int i3 = this.f2074b & 7;
        AbstractC0113j abstractC0113j = this.f2073a;
        if (i3 == 0) {
            do {
                ((T) interfaceC0125w).add(Boolean.valueOf(abstractC0113j.f()));
                if (abstractC0113j.c()) {
                    return;
                } else {
                    u = abstractC0113j.u();
                }
            } while (u == this.f2074b);
            this.f2076d = u;
            return;
        }
        if (i3 != 2) {
            throw C0128z.b();
        }
        int b3 = abstractC0113j.b() + abstractC0113j.v();
        do {
            ((T) interfaceC0125w).add(Boolean.valueOf(abstractC0113j.f()));
        } while (abstractC0113j.b() < b3);
        v(b3);
    }

    public final C0110g e() {
        w(2);
        return this.f2073a.g();
    }

    public final void f(InterfaceC0125w interfaceC0125w) {
        int u;
        if ((this.f2074b & 7) != 2) {
            throw C0128z.b();
        }
        do {
            ((T) interfaceC0125w).add(e());
            AbstractC0113j abstractC0113j = this.f2073a;
            if (abstractC0113j.c()) {
                return;
            } else {
                u = abstractC0113j.u();
            }
        } while (u == this.f2074b);
        this.f2076d = u;
    }

    public final void g(InterfaceC0125w interfaceC0125w) {
        int u;
        int i3 = this.f2074b & 7;
        AbstractC0113j abstractC0113j = this.f2073a;
        if (i3 == 1) {
            do {
                ((T) interfaceC0125w).add(Double.valueOf(abstractC0113j.h()));
                if (abstractC0113j.c()) {
                    return;
                } else {
                    u = abstractC0113j.u();
                }
            } while (u == this.f2074b);
            this.f2076d = u;
            return;
        }
        if (i3 != 2) {
            throw C0128z.b();
        }
        int v3 = abstractC0113j.v();
        if ((v3 & 7) != 0) {
            throw new C0128z("Failed to parse the message.");
        }
        int b3 = abstractC0113j.b() + v3;
        do {
            ((T) interfaceC0125w).add(Double.valueOf(abstractC0113j.h()));
        } while (abstractC0113j.b() < b3);
    }

    public final void h(InterfaceC0125w interfaceC0125w) {
        int u;
        int i3 = this.f2074b & 7;
        AbstractC0113j abstractC0113j = this.f2073a;
        if (i3 == 0) {
            do {
                ((T) interfaceC0125w).add(Integer.valueOf(abstractC0113j.i()));
                if (abstractC0113j.c()) {
                    return;
                } else {
                    u = abstractC0113j.u();
                }
            } while (u == this.f2074b);
            this.f2076d = u;
            return;
        }
        if (i3 != 2) {
            throw C0128z.b();
        }
        int b3 = abstractC0113j.b() + abstractC0113j.v();
        do {
            ((T) interfaceC0125w).add(Integer.valueOf(abstractC0113j.i()));
        } while (abstractC0113j.b() < b3);
        v(b3);
    }

    public final Object i(q0 q0Var, Class cls, C0117n c0117n) {
        int ordinal = q0Var.ordinal();
        AbstractC0113j abstractC0113j = this.f2073a;
        switch (ordinal) {
            case 0:
                w(1);
                return Double.valueOf(abstractC0113j.h());
            case 1:
                w(5);
                return Float.valueOf(abstractC0113j.l());
            case 2:
                w(0);
                return Long.valueOf(abstractC0113j.n());
            case 3:
                w(0);
                return Long.valueOf(abstractC0113j.w());
            case 4:
                w(0);
                return Integer.valueOf(abstractC0113j.m());
            case 5:
                w(1);
                return Long.valueOf(abstractC0113j.k());
            case 6:
                w(5);
                return Integer.valueOf(abstractC0113j.j());
            case 7:
                w(0);
                return Boolean.valueOf(abstractC0113j.f());
            case 8:
                w(2);
                return abstractC0113j.t();
            case ContentHandlerProxy.PROCESSING_INSTRUCTION /* 9 */:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                V a3 = S.f2003c.a(cls);
                AbstractC0124v newInstance = a3.newInstance();
                c(newInstance, a3, c0117n);
                a3.d(newInstance);
                return newInstance;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(abstractC0113j.v());
            case 13:
                w(0);
                return Integer.valueOf(abstractC0113j.i());
            case 14:
                w(5);
                return Integer.valueOf(abstractC0113j.o());
            case 15:
                w(1);
                return Long.valueOf(abstractC0113j.p());
            case 16:
                w(0);
                return Integer.valueOf(abstractC0113j.q());
            case PipesServer.TIMEOUT_EXIT_CODE /* 17 */:
                w(0);
                return Long.valueOf(abstractC0113j.r());
        }
    }

    public final void j(InterfaceC0125w interfaceC0125w) {
        int u;
        int i3 = this.f2074b & 7;
        AbstractC0113j abstractC0113j = this.f2073a;
        if (i3 == 2) {
            int v3 = abstractC0113j.v();
            if ((v3 & 3) != 0) {
                throw new C0128z("Failed to parse the message.");
            }
            int b3 = abstractC0113j.b() + v3;
            do {
                ((T) interfaceC0125w).add(Integer.valueOf(abstractC0113j.j()));
            } while (abstractC0113j.b() < b3);
            return;
        }
        if (i3 != 5) {
            throw C0128z.b();
        }
        do {
            ((T) interfaceC0125w).add(Integer.valueOf(abstractC0113j.j()));
            if (abstractC0113j.c()) {
                return;
            } else {
                u = abstractC0113j.u();
            }
        } while (u == this.f2074b);
        this.f2076d = u;
    }

    public final void k(InterfaceC0125w interfaceC0125w) {
        int u;
        int i3 = this.f2074b & 7;
        AbstractC0113j abstractC0113j = this.f2073a;
        if (i3 == 1) {
            do {
                ((T) interfaceC0125w).add(Long.valueOf(abstractC0113j.k()));
                if (abstractC0113j.c()) {
                    return;
                } else {
                    u = abstractC0113j.u();
                }
            } while (u == this.f2074b);
            this.f2076d = u;
            return;
        }
        if (i3 != 2) {
            throw C0128z.b();
        }
        int v3 = abstractC0113j.v();
        if ((v3 & 7) != 0) {
            throw new C0128z("Failed to parse the message.");
        }
        int b3 = abstractC0113j.b() + v3;
        do {
            ((T) interfaceC0125w).add(Long.valueOf(abstractC0113j.k()));
        } while (abstractC0113j.b() < b3);
    }

    public final void l(InterfaceC0125w interfaceC0125w) {
        int u;
        int i3 = this.f2074b & 7;
        AbstractC0113j abstractC0113j = this.f2073a;
        if (i3 == 2) {
            int v3 = abstractC0113j.v();
            if ((v3 & 3) != 0) {
                throw new C0128z("Failed to parse the message.");
            }
            int b3 = abstractC0113j.b() + v3;
            do {
                ((T) interfaceC0125w).add(Float.valueOf(abstractC0113j.l()));
            } while (abstractC0113j.b() < b3);
            return;
        }
        if (i3 != 5) {
            throw C0128z.b();
        }
        do {
            ((T) interfaceC0125w).add(Float.valueOf(abstractC0113j.l()));
            if (abstractC0113j.c()) {
                return;
            } else {
                u = abstractC0113j.u();
            }
        } while (u == this.f2074b);
        this.f2076d = u;
    }

    public final void m(InterfaceC0125w interfaceC0125w) {
        int u;
        int i3 = this.f2074b & 7;
        AbstractC0113j abstractC0113j = this.f2073a;
        if (i3 == 0) {
            do {
                ((T) interfaceC0125w).add(Integer.valueOf(abstractC0113j.m()));
                if (abstractC0113j.c()) {
                    return;
                } else {
                    u = abstractC0113j.u();
                }
            } while (u == this.f2074b);
            this.f2076d = u;
            return;
        }
        if (i3 != 2) {
            throw C0128z.b();
        }
        int b3 = abstractC0113j.b() + abstractC0113j.v();
        do {
            ((T) interfaceC0125w).add(Integer.valueOf(abstractC0113j.m()));
        } while (abstractC0113j.b() < b3);
        v(b3);
    }

    public final void n(InterfaceC0125w interfaceC0125w) {
        int u;
        int i3 = this.f2074b & 7;
        AbstractC0113j abstractC0113j = this.f2073a;
        if (i3 == 0) {
            do {
                ((T) interfaceC0125w).add(Long.valueOf(abstractC0113j.n()));
                if (abstractC0113j.c()) {
                    return;
                } else {
                    u = abstractC0113j.u();
                }
            } while (u == this.f2074b);
            this.f2076d = u;
            return;
        }
        if (i3 != 2) {
            throw C0128z.b();
        }
        int b3 = abstractC0113j.b() + abstractC0113j.v();
        do {
            ((T) interfaceC0125w).add(Long.valueOf(abstractC0113j.n()));
        } while (abstractC0113j.b() < b3);
        v(b3);
    }

    public final void o(InterfaceC0125w interfaceC0125w) {
        int u;
        int i3 = this.f2074b & 7;
        AbstractC0113j abstractC0113j = this.f2073a;
        if (i3 == 2) {
            int v3 = abstractC0113j.v();
            if ((v3 & 3) != 0) {
                throw new C0128z("Failed to parse the message.");
            }
            int b3 = abstractC0113j.b() + v3;
            do {
                ((T) interfaceC0125w).add(Integer.valueOf(abstractC0113j.o()));
            } while (abstractC0113j.b() < b3);
            return;
        }
        if (i3 != 5) {
            throw C0128z.b();
        }
        do {
            ((T) interfaceC0125w).add(Integer.valueOf(abstractC0113j.o()));
            if (abstractC0113j.c()) {
                return;
            } else {
                u = abstractC0113j.u();
            }
        } while (u == this.f2074b);
        this.f2076d = u;
    }

    public final void p(InterfaceC0125w interfaceC0125w) {
        int u;
        int i3 = this.f2074b & 7;
        AbstractC0113j abstractC0113j = this.f2073a;
        if (i3 == 1) {
            do {
                ((T) interfaceC0125w).add(Long.valueOf(abstractC0113j.p()));
                if (abstractC0113j.c()) {
                    return;
                } else {
                    u = abstractC0113j.u();
                }
            } while (u == this.f2074b);
            this.f2076d = u;
            return;
        }
        if (i3 != 2) {
            throw C0128z.b();
        }
        int v3 = abstractC0113j.v();
        if ((v3 & 7) != 0) {
            throw new C0128z("Failed to parse the message.");
        }
        int b3 = abstractC0113j.b() + v3;
        do {
            ((T) interfaceC0125w).add(Long.valueOf(abstractC0113j.p()));
        } while (abstractC0113j.b() < b3);
    }

    public final void q(InterfaceC0125w interfaceC0125w) {
        int u;
        int i3 = this.f2074b & 7;
        AbstractC0113j abstractC0113j = this.f2073a;
        if (i3 == 0) {
            do {
                ((T) interfaceC0125w).add(Integer.valueOf(abstractC0113j.q()));
                if (abstractC0113j.c()) {
                    return;
                } else {
                    u = abstractC0113j.u();
                }
            } while (u == this.f2074b);
            this.f2076d = u;
            return;
        }
        if (i3 != 2) {
            throw C0128z.b();
        }
        int b3 = abstractC0113j.b() + abstractC0113j.v();
        do {
            ((T) interfaceC0125w).add(Integer.valueOf(abstractC0113j.q()));
        } while (abstractC0113j.b() < b3);
        v(b3);
    }

    public final void r(InterfaceC0125w interfaceC0125w) {
        int u;
        int i3 = this.f2074b & 7;
        AbstractC0113j abstractC0113j = this.f2073a;
        if (i3 == 0) {
            do {
                ((T) interfaceC0125w).add(Long.valueOf(abstractC0113j.r()));
                if (abstractC0113j.c()) {
                    return;
                } else {
                    u = abstractC0113j.u();
                }
            } while (u == this.f2074b);
            this.f2076d = u;
            return;
        }
        if (i3 != 2) {
            throw C0128z.b();
        }
        int b3 = abstractC0113j.b() + abstractC0113j.v();
        do {
            ((T) interfaceC0125w).add(Long.valueOf(abstractC0113j.r()));
        } while (abstractC0113j.b() < b3);
        v(b3);
    }

    public final void s(InterfaceC0125w interfaceC0125w, boolean z3) {
        String s3;
        int u;
        if ((this.f2074b & 7) != 2) {
            throw C0128z.b();
        }
        do {
            AbstractC0113j abstractC0113j = this.f2073a;
            if (z3) {
                w(2);
                s3 = abstractC0113j.t();
            } else {
                w(2);
                s3 = abstractC0113j.s();
            }
            ((T) interfaceC0125w).add(s3);
            if (abstractC0113j.c()) {
                return;
            } else {
                u = abstractC0113j.u();
            }
        } while (u == this.f2074b);
        this.f2076d = u;
    }

    public final void t(InterfaceC0125w interfaceC0125w) {
        int u;
        int i3 = this.f2074b & 7;
        AbstractC0113j abstractC0113j = this.f2073a;
        if (i3 == 0) {
            do {
                ((T) interfaceC0125w).add(Integer.valueOf(abstractC0113j.v()));
                if (abstractC0113j.c()) {
                    return;
                } else {
                    u = abstractC0113j.u();
                }
            } while (u == this.f2074b);
            this.f2076d = u;
            return;
        }
        if (i3 != 2) {
            throw C0128z.b();
        }
        int b3 = abstractC0113j.b() + abstractC0113j.v();
        do {
            ((T) interfaceC0125w).add(Integer.valueOf(abstractC0113j.v()));
        } while (abstractC0113j.b() < b3);
        v(b3);
    }

    public final void u(InterfaceC0125w interfaceC0125w) {
        int u;
        int i3 = this.f2074b & 7;
        AbstractC0113j abstractC0113j = this.f2073a;
        if (i3 == 0) {
            do {
                ((T) interfaceC0125w).add(Long.valueOf(abstractC0113j.w()));
                if (abstractC0113j.c()) {
                    return;
                } else {
                    u = abstractC0113j.u();
                }
            } while (u == this.f2074b);
            this.f2076d = u;
            return;
        }
        if (i3 != 2) {
            throw C0128z.b();
        }
        int b3 = abstractC0113j.b() + abstractC0113j.v();
        do {
            ((T) interfaceC0125w).add(Long.valueOf(abstractC0113j.w()));
        } while (abstractC0113j.b() < b3);
        v(b3);
    }

    public final void v(int i3) {
        if (this.f2073a.b() != i3) {
            throw C0128z.e();
        }
    }

    public final void w(int i3) {
        if ((this.f2074b & 7) != i3) {
            throw C0128z.b();
        }
    }

    public final boolean x() {
        int i3;
        AbstractC0113j abstractC0113j = this.f2073a;
        if (abstractC0113j.c() || (i3 = this.f2074b) == this.f2075c) {
            return false;
        }
        return abstractC0113j.x(i3);
    }
}
