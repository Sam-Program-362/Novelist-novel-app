package D;

import a.AbstractC0102a;
import android.annotation.SuppressLint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class U extends d0 {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f202m = false;
    public static Method n;

    /* renamed from: o, reason: collision with root package name */
    public static Class f203o;

    /* renamed from: p, reason: collision with root package name */
    public static Field f204p;

    /* renamed from: q, reason: collision with root package name */
    public static Field f205q;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f206c;

    /* renamed from: d, reason: collision with root package name */
    public w.b[] f207d;

    /* renamed from: e, reason: collision with root package name */
    public w.b f208e;

    /* renamed from: f, reason: collision with root package name */
    public h0 f209f;

    /* renamed from: g, reason: collision with root package name */
    public w.b f210g;

    /* renamed from: h, reason: collision with root package name */
    public int f211h;

    /* renamed from: i, reason: collision with root package name */
    public int f212i;

    /* renamed from: j, reason: collision with root package name */
    public int f213j;

    /* renamed from: k, reason: collision with root package name */
    public Rect[][] f214k;

    /* renamed from: l, reason: collision with root package name */
    public Rect[][] f215l;

    public U(h0 h0Var, WindowInsets windowInsets) {
        super(h0Var);
        this.f208e = null;
        this.f214k = new Rect[10][];
        this.f215l = new Rect[10][];
        this.f206c = windowInsets;
    }

    private C0008i A(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f235a.f241a.r()) {
            return C0008i.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        C0016q w3 = E2.a.w(display, 0);
        C0016q w4 = E2.a.w(display, 1);
        C0016q w5 = E2.a.w(display, 2);
        C0016q w6 = E2.a.w(display, 3);
        return C0008i.a(point.x, point.y, false, w3 != null ? w3.f258b : 0, w4 != null ? w4.f258b : 0, w5 != null ? w5.f258b : 0, w6 != null ? w6.f258b : 0);
    }

    private static List<Rect> B(Rect[][] rectArr, int i3) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((i3 & i4) != 0 && (rectArr2 = rectArr[AbstractC0102a.G(i4)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] C(w.b bVar) {
        ArrayList arrayList = new ArrayList();
        int i3 = bVar.f4635a;
        int i4 = bVar.f4638d;
        int i5 = bVar.f4637c;
        int i6 = bVar.f4636b;
        if (i3 != 0) {
            arrayList.add(new Rect(0, 0, bVar.f4635a, this.f212i));
        }
        if (i6 != 0) {
            arrayList.add(new Rect(0, 0, this.f213j, i6));
        }
        if (i5 != 0) {
            int i7 = this.f213j;
            arrayList.add(new Rect(i7 - i5, 0, i7, this.f212i));
        }
        if (i4 != 0) {
            int i8 = this.f212i;
            arrayList.add(new Rect(0, i8 - i4, this.f213j, i8));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    @SuppressLint({"WrongConstant"})
    private w.b D(int i3, boolean z3) {
        w.b bVar = w.b.f4634e;
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((i3 & i4) != 0) {
                bVar = w.b.a(bVar, E(i4, z3));
            }
        }
        return bVar;
    }

    private w.b G() {
        h0 h0Var = this.f209f;
        return h0Var != null ? h0Var.f241a.j() : w.b.f4634e;
    }

    private w.b H(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f202m) {
            J();
        }
        Method method = n;
        if (method != null && f203o != null && f204p != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f204p.get(f205q.get(invoke));
                if (rect != null) {
                    return w.b.b(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e3) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void J() {
        try {
            n = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f203o = cls;
            f204p = cls.getDeclaredField("mVisibleInsets");
            f205q = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f204p.setAccessible(true);
            f205q.setAccessible(true);
        } catch (ReflectiveOperationException e3) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
        }
        f202m = true;
    }

    public static boolean L(int i3, int i4) {
        return (i3 & 6) == (i4 & 6);
    }

    public w.b E(int i3, boolean z3) {
        w.b j3;
        int i4;
        w.b bVar = w.b.f4634e;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 8) {
                    w.b[] bVarArr = this.f207d;
                    j3 = bVarArr != null ? bVarArr[AbstractC0102a.G(8)] : null;
                    if (j3 != null) {
                        return j3;
                    }
                    w.b l3 = l();
                    w.b G3 = G();
                    int i5 = l3.f4638d;
                    if (i5 > G3.f4638d) {
                        return w.b.b(0, 0, 0, i5);
                    }
                    w.b bVar2 = this.f210g;
                    if (bVar2 != null && !bVar2.equals(bVar) && (i4 = this.f210g.f4638d) > G3.f4638d) {
                        return w.b.b(0, 0, 0, i4);
                    }
                } else {
                    if (i3 == 16) {
                        return k();
                    }
                    if (i3 == 32) {
                        return i();
                    }
                    if (i3 == 64) {
                        return m();
                    }
                    if (i3 == 128) {
                        h0 h0Var = this.f209f;
                        C0006g g3 = h0Var != null ? h0Var.f241a.g() : g();
                        if (g3 != null) {
                            int i6 = Build.VERSION.SDK_INT;
                            return w.b.b(i6 >= 28 ? AbstractC0005f.h(g3.f236a) : 0, i6 >= 28 ? AbstractC0005f.j(g3.f236a) : 0, i6 >= 28 ? AbstractC0005f.i(g3.f236a) : 0, i6 >= 28 ? AbstractC0005f.g(g3.f236a) : 0);
                        }
                    }
                }
            } else {
                if (z3) {
                    w.b G4 = G();
                    w.b j4 = j();
                    return w.b.b(Math.max(G4.f4635a, j4.f4635a), 0, Math.max(G4.f4637c, j4.f4637c), Math.max(G4.f4638d, j4.f4638d));
                }
                if ((this.f211h & 2) == 0) {
                    w.b l4 = l();
                    h0 h0Var2 = this.f209f;
                    j3 = h0Var2 != null ? h0Var2.f241a.j() : null;
                    int i7 = l4.f4638d;
                    if (j3 != null) {
                        i7 = Math.min(i7, j3.f4638d);
                    }
                    return w.b.b(l4.f4635a, 0, l4.f4637c, i7);
                }
            }
        } else {
            if (z3) {
                return w.b.b(0, Math.max(G().f4636b, l().f4636b), 0, 0);
            }
            if ((this.f211h & 4) == 0) {
                return w.b.b(0, l().f4636b, 0, 0);
            }
        }
        return bVar;
    }

    public w.b F(int i3) {
        return D(i3, true);
    }

    public boolean I(int i3) {
        if (i3 != 1 && i3 != 2) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 8 && i3 != 128) {
                return true;
            }
        }
        return !E(i3, false).equals(w.b.f4634e);
    }

    public void K(w.b bVar) {
        this.f210g = bVar;
    }

    @Override // D.d0
    public void d(View view) {
        this.f213j = view.getWidth();
        this.f212i = view.getHeight();
        w.b H3 = H(view);
        if (H3 == null) {
            H3 = w.b.f4634e;
        }
        K(H3);
    }

    @Override // D.d0
    public List<Rect> e(int i3) {
        return B(this.f214k, i3);
    }

    @Override // D.d0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        U u = (U) obj;
        return Objects.equals(this.f210g, u.f210g) && L(this.f211h, u.f211h);
    }

    @Override // D.d0
    public List<Rect> f(int i3) {
        return B(this.f215l, i3);
    }

    @Override // D.d0
    public w.b h(int i3) {
        return D(i3, false);
    }

    @Override // D.d0
    public final w.b l() {
        if (this.f208e == null) {
            WindowInsets windowInsets = this.f206c;
            this.f208e = w.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f208e;
    }

    @Override // D.d0
    public void n(View view) {
        A(view);
    }

    @Override // D.d0
    @SuppressLint({"WrongConstant"})
    public void o() {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            int G3 = AbstractC0102a.G(i3);
            this.f214k[G3] = C(h(i3));
            if (i3 != 8) {
                this.f215l[G3] = C(F(i3));
            }
        }
    }

    @Override // D.d0
    public h0 p(int i3, int i4, int i5, int i6) {
        h0 c3 = h0.c(this.f206c, null);
        int i7 = Build.VERSION.SDK_INT;
        T s3 = i7 >= 36 ? new S(c3) : i7 >= 35 ? new Q(c3) : i7 >= 34 ? new P(c3) : i7 >= 31 ? new O(c3) : i7 >= 30 ? new N(c3) : i7 >= 29 ? new M(c3) : new K(c3);
        s3.h(h0.a(l(), i3, i4, i5, i6));
        s3.f(h0.a(j(), i3, i4, i5, i6));
        return s3.b();
    }

    @Override // D.d0
    public boolean r() {
        return this.f206c.isRound();
    }

    @Override // D.d0
    @SuppressLint({"WrongConstant"})
    public boolean s(int i3) {
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((i3 & i4) != 0 && !I(i4)) {
                return false;
            }
        }
        return true;
    }

    @Override // D.d0
    public void u(w.b[] bVarArr) {
        this.f207d = bVarArr;
    }

    @Override // D.d0
    public void v(h0 h0Var) {
        this.f209f = h0Var;
    }

    @Override // D.d0
    public void x(int i3) {
        this.f211h = i3;
    }

    @Override // D.d0
    public void y(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f214k = (Rect[][]) rectArr.clone();
    }

    @Override // D.d0
    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f215l = (Rect[][]) rectArr.clone();
    }

    @Override // D.d0
    public void t(C0008i c0008i) {
    }
}
