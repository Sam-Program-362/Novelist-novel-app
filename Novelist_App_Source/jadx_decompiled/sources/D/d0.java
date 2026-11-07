package D;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class d0 {

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f234b;

    /* renamed from: a, reason: collision with root package name */
    public final h0 f235a;

    static {
        int i3 = Build.VERSION.SDK_INT;
        f234b = (i3 >= 36 ? new S() : i3 >= 35 ? new Q() : i3 >= 34 ? new P() : i3 >= 31 ? new O() : i3 >= 30 ? new N() : i3 >= 29 ? new M() : new K()).b().f241a.a().f241a.b().f241a.c();
    }

    public d0(h0 h0Var) {
        this.f235a = h0Var;
    }

    public h0 a() {
        return this.f235a;
    }

    public h0 b() {
        return this.f235a;
    }

    public h0 c() {
        return this.f235a;
    }

    public List<Rect> e(int i3) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return r() == d0Var.r() && q() == d0Var.q() && Objects.equals(l(), d0Var.l()) && Objects.equals(j(), d0Var.j()) && Objects.equals(g(), d0Var.g());
    }

    public List<Rect> f(int i3) {
        return Collections.EMPTY_LIST;
    }

    public C0006g g() {
        return null;
    }

    public w.b h(int i3) {
        return w.b.f4634e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(r()), Boolean.valueOf(q()), l(), j(), g());
    }

    public w.b i() {
        return l();
    }

    public w.b j() {
        return w.b.f4634e;
    }

    public w.b k() {
        return l();
    }

    public w.b l() {
        return w.b.f4634e;
    }

    public w.b m() {
        return l();
    }

    public h0 p(int i3, int i4, int i5, int i6) {
        return f234b;
    }

    public boolean q() {
        return false;
    }

    public boolean r() {
        return false;
    }

    public boolean s(int i3) {
        return true;
    }

    public void o() {
    }

    public void d(View view) {
    }

    public void n(View view) {
    }

    public void t(C0008i c0008i) {
    }

    public void u(w.b[] bVarArr) {
    }

    public void v(h0 h0Var) {
    }

    public void w(w.b bVar) {
    }

    public void x(int i3) {
    }

    public void y(Rect[][] rectArr) {
    }

    public void z(Rect[][] rectArr) {
    }
}
