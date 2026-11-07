package F2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    void A(String str, Object obj, Serializable serializable);

    void a(Object obj, String str);

    void b(String str, Object... objArr);

    boolean c();

    boolean d();

    void e(Object... objArr);

    void f(String str, Throwable th);

    void g(Object obj, Object obj2);

    String getName();

    void i(String str, Throwable th);

    void j(String str, Throwable th);

    void k(String str);

    void l(Object obj, String str);

    void m(String str);

    void n(String str);

    boolean o();

    default boolean p(int i3) {
        char c3;
        String str;
        if (i3 == 1) {
            c3 = '(';
        } else if (i3 == 2) {
            c3 = 30;
        } else if (i3 == 3) {
            c3 = 20;
        } else if (i3 == 4) {
            c3 = '\n';
        } else {
            if (i3 != 5) {
                throw null;
            }
            c3 = 0;
        }
        if (c3 == 0) {
            return v();
        }
        if (c3 == '\n') {
            return d();
        }
        if (c3 == 20) {
            return t();
        }
        if (c3 == 30) {
            return c();
        }
        if (c3 == '(') {
            return o();
        }
        StringBuilder sb = new StringBuilder("Level [");
        if (i3 == 1) {
            str = "ERROR";
        } else if (i3 == 2) {
            str = "WARN";
        } else if (i3 == 3) {
            str = "INFO";
        } else if (i3 != 4) {
            str = i3 != 5 ? "null" : "TRACE";
        } else {
            str = "DEBUG";
        }
        sb.append(str);
        sb.append("] not recognized.");
        throw new IllegalArgumentException(sb.toString());
    }

    void q(String str, Object... objArr);

    void r(Object obj, Object obj2, String str);

    void s(Object obj, String str);

    boolean t();

    void u(String str);

    boolean v();

    void w(Object obj, Object obj2, String str);

    void x(String str, Integer num);

    void y(String str, Object obj, Serializable serializable);

    void z(String str, Integer num);
}
