package j;

import D.G;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import it.returntrue.novelist.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k.P;

/* loaded from: classes.dex */
public final class g extends l implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A, reason: collision with root package name */
    public boolean f3405A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f3406B;

    /* renamed from: C, reason: collision with root package name */
    public int f3407C;

    /* renamed from: D, reason: collision with root package name */
    public int f3408D;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3410F;

    /* renamed from: G, reason: collision with root package name */
    public o f3411G;

    /* renamed from: H, reason: collision with root package name */
    public ViewTreeObserver f3412H;

    /* renamed from: I, reason: collision with root package name */
    public PopupWindow.OnDismissListener f3413I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f3414J;

    /* renamed from: l, reason: collision with root package name */
    public final Context f3415l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3416m;
    public final int n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f3417o;

    /* renamed from: p, reason: collision with root package name */
    public final Handler f3418p;

    /* renamed from: s, reason: collision with root package name */
    public final c f3421s;

    /* renamed from: t, reason: collision with root package name */
    public final d f3422t;
    public View x;
    public View y;

    /* renamed from: z, reason: collision with root package name */
    public int f3425z;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f3419q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f3420r = new ArrayList();
    public final H0.i u = new H0.i(this, 20);

    /* renamed from: v, reason: collision with root package name */
    public int f3423v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f3424w = 0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f3409E = false;

    public g(Context context, View view, int i3, boolean z3) {
        this.f3421s = new c(this, r1);
        this.f3422t = new d(this, r1);
        this.f3415l = context;
        this.x = view;
        this.n = i3;
        this.f3417o = z3;
        Field field = G.f187a;
        this.f3425z = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f3416m = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3418p = new Handler();
    }

    @Override // j.r
    public final void a() {
        if (h()) {
            return;
        }
        ArrayList arrayList = this.f3419q;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            u((j) obj);
        }
        arrayList.clear();
        View view = this.x;
        this.y = view;
        if (view != null) {
            boolean z3 = this.f3412H == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f3412H = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f3421s);
            }
            this.y.addOnAttachStateChangeListener(this.f3422t);
        }
    }

    @Override // j.p
    public final void b(j jVar, boolean z3) {
        ArrayList arrayList = this.f3420r;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (jVar == ((f) arrayList.get(i3)).f3403b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            return;
        }
        int i4 = i3 + 1;
        if (i4 < arrayList.size()) {
            ((f) arrayList.get(i4)).f3403b.c(false);
        }
        f fVar = (f) arrayList.remove(i3);
        j jVar2 = fVar.f3403b;
        P p3 = fVar.f3402a;
        CopyOnWriteArrayList copyOnWriteArrayList = jVar2.f3447r;
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            WeakReference weakReference = (WeakReference) it2.next();
            p pVar = (p) weakReference.get();
            if (pVar == null || pVar == this) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        if (this.f3414J) {
            p3.f3620F.setExitTransition(null);
            p3.f3620F.setAnimationStyle(0);
        }
        p3.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f3425z = ((f) arrayList.get(size2 - 1)).f3404c;
        } else {
            View view = this.x;
            Field field = G.f187a;
            this.f3425z = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z3) {
                ((f) arrayList.get(0)).f3403b.c(false);
                return;
            }
            return;
        }
        dismiss();
        o oVar = this.f3411G;
        if (oVar != null) {
            oVar.b(jVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f3412H;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f3412H.removeGlobalOnLayoutListener(this.f3421s);
            }
            this.f3412H = null;
        }
        this.y.removeOnAttachStateChangeListener(this.f3422t);
        this.f3413I.onDismiss();
    }

    @Override // j.p
    public final void d() {
        ArrayList arrayList = this.f3420r;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ListAdapter adapter = ((f) obj).f3402a.f3623m.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override // j.r
    public final void dismiss() {
        ArrayList arrayList = this.f3420r;
        int size = arrayList.size();
        if (size > 0) {
            f[] fVarArr = (f[]) arrayList.toArray(new f[size]);
            for (int i3 = size - 1; i3 >= 0; i3--) {
                f fVar = fVarArr[i3];
                if (fVar.f3402a.f3620F.isShowing()) {
                    fVar.f3402a.dismiss();
                }
            }
        }
    }

    @Override // j.r
    public final ListView e() {
        ArrayList arrayList = this.f3420r;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) arrayList.get(arrayList.size() - 1)).f3402a.f3623m;
    }

    @Override // j.p
    public final boolean g() {
        return false;
    }

    @Override // j.r
    public final boolean h() {
        ArrayList arrayList = this.f3420r;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).f3402a.f3620F.isShowing();
    }

    @Override // j.p
    public final void j(o oVar) {
        this.f3411G = oVar;
    }

    @Override // j.p
    public final boolean k(t tVar) {
        ArrayList arrayList = this.f3420r;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            f fVar = (f) obj;
            if (tVar == fVar.f3403b) {
                fVar.f3402a.f3623m.requestFocus();
                return true;
            }
        }
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        l(tVar);
        o oVar = this.f3411G;
        if (oVar != null) {
            oVar.j(tVar);
        }
        return true;
    }

    @Override // j.l
    public final void l(j jVar) {
        jVar.b(this, this.f3415l);
        if (h()) {
            u(jVar);
        } else {
            this.f3419q.add(jVar);
        }
    }

    @Override // j.l
    public final void n(View view) {
        if (this.x != view) {
            this.x = view;
            int i3 = this.f3423v;
            Field field = G.f187a;
            this.f3424w = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    @Override // j.l
    public final void o(boolean z3) {
        this.f3409E = z3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        f fVar;
        ArrayList arrayList = this.f3420r;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                fVar = null;
                break;
            }
            fVar = (f) arrayList.get(i3);
            if (!fVar.f3402a.f3620F.isShowing()) {
                break;
            } else {
                i3++;
            }
        }
        if (fVar != null) {
            fVar.f3403b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // j.l
    public final void p(int i3) {
        if (this.f3423v != i3) {
            this.f3423v = i3;
            View view = this.x;
            Field field = G.f187a;
            this.f3424w = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    @Override // j.l
    public final void q(int i3) {
        this.f3405A = true;
        this.f3407C = i3;
    }

    @Override // j.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3413I = onDismissListener;
    }

    @Override // j.l
    public final void s(boolean z3) {
        this.f3410F = z3;
    }

    @Override // j.l
    public final void t(int i3) {
        this.f3406B = true;
        this.f3408D = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x017b, code lost:
    
        if (((r7.getWidth() + r11[r16]) + r5) > r9.right) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x017d, code lost:
    
        r7 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0181, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0186, code lost:
    
        if ((r11[r16] - r5) < 0) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(j.j r19) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.g.u(j.j):void");
    }
}
