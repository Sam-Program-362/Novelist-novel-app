package D;

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

/* JADX INFO: loaded from: classes.dex */
public abstract class U extends d0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f202m = false;
    public static Method n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Class f203o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Field f204p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Field f205q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w.b[] f207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w.b f208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h0 f209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public w.b f210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect[][] f214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
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
        C0016q c0016qW = E2.a.w(display, 0);
        C0016q c0016qW2 = E2.a.w(display, 1);
        C0016q c0016qW3 = E2.a.w(display, 2);
        C0016q c0016qW4 = E2.a.w(display, 3);
        return C0008i.a(point.x, point.y, false, c0016qW != null ? c0016qW.f258b : 0, c0016qW2 != null ? c0016qW2.f258b : 0, c0016qW3 != null ? c0016qW3.f258b : 0, c0016qW4 != null ? c0016qW4.f258b : 0);
    }

    private static List<Rect> B(Rect[][] rectArr, int i3) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((i3 & i4) != 0 && (rectArr2 = rectArr[p000a.a.G(i4)]) != null) {
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
        w.b bVarA = w.b.f4634e;
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((i3 & i4) != 0) {
                bVarA = w.b.a(bVarA, E(i4, z3));
            }
        }
        return bVarA;
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
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f204p.get(f205q.get(objInvoke));
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
        w.b bVarJ;
        int i4;
        w.b bVar = w.b.f4634e;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 8) {
                    w.b[] bVarArr = this.f207d;
                    bVarJ = bVarArr != null ? bVarArr[p000a.a.G(8)] : null;
                    if (bVarJ != null) {
                        return bVarJ;
                    }
                    w.b bVarL = l();
                    w.b bVarG = G();
                    int i5 = bVarL.f4638d;
                    if (i5 > bVarG.f4638d) {
                        return w.b.b(0, 0, 0, i5);
                    }
                    w.b bVar2 = this.f210g;
                    if (bVar2 != null && !bVar2.equals(bVar) && (i4 = this.f210g.f4638d) > bVarG.f4638d) {
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
                        C0006g c0006gG = h0Var != null ? h0Var.f241a.g() : g();
                        if (c0006gG != null) {
                            int i6 = Build.VERSION.SDK_INT;
                            return w.b.b(i6 >= 28 ? AbstractC0005f.h(c0006gG.f236a) : 0, i6 >= 28 ? AbstractC0005f.j(c0006gG.f236a) : 0, i6 >= 28 ? AbstractC0005f.i(c0006gG.f236a) : 0, i6 >= 28 ? AbstractC0005f.g(c0006gG.f236a) : 0);
                        }
                    }
                }
            } else {
                if (z3) {
                    w.b bVarG2 = G();
                    w.b bVarJ2 = j();
                    return w.b.b(Math.max(bVarG2.f4635a, bVarJ2.f4635a), 0, Math.max(bVarG2.f4637c, bVarJ2.f4637c), Math.max(bVarG2.f4638d, bVarJ2.f4638d));
                }
                if ((this.f211h & 2) == 0) {
                    w.b bVarL2 = l();
                    h0 h0Var2 = this.f209f;
                    bVarJ = h0Var2 != null ? h0Var2.f241a.j() : null;
                    int iMin = bVarL2.f4638d;
                    if (bVarJ != null) {
                        iMin = Math.min(iMin, bVarJ.f4638d);
                    }
                    return w.b.b(bVarL2.f4635a, 0, bVarL2.f4637c, iMin);
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
        w.b bVarH = H(view);
        if (bVarH == null) {
            bVarH = w.b.f4634e;
        }
        K(bVarH);
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
            int iG = p000a.a.G(i3);
            this.f214k[iG] = C(h(i3));
            if (i3 != 8) {
                this.f215l[iG] = C(F(i3));
            }
        }
    }

    @Override // D.d0
    public h0 p(int i3, int i4, int i5, int i6) {
        T m3;
        h0 h0VarC = h0.c(this.f206c, null);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 36) {
            m3 = new S(h0VarC);
        } else if (i7 >= 35) {
            m3 = new Q(h0VarC);
        } else if (i7 >= 34) {
            m3 = new P(h0VarC);
        } else if (i7 >= 31) {
            m3 = new O(h0VarC);
        } else if (i7 >= 30) {
            m3 = new N(h0VarC);
        } else {
            m3 = i7 >= 29 ? new M(h0VarC) : new K(h0VarC);
        }
        m3.h(h0.a(l(), i3, i4, i5, i6));
        m3.f(h0.a(j(), i3, i4, i5, i6));
        return m3.b();
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
