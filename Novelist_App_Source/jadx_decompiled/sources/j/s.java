package j;

import D.G;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import it.returntrue.novelist.R;
import java.lang.reflect.Field;
import k.O;
import k.P;

/* loaded from: classes.dex */
public final class s extends l implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: A, reason: collision with root package name */
    public boolean f3487A;

    /* renamed from: B, reason: collision with root package name */
    public int f3488B;

    /* renamed from: C, reason: collision with root package name */
    public int f3489C = 0;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3490D;

    /* renamed from: l, reason: collision with root package name */
    public final Context f3491l;

    /* renamed from: m, reason: collision with root package name */
    public final j f3492m;
    public final h n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f3493o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3494p;

    /* renamed from: q, reason: collision with root package name */
    public final int f3495q;

    /* renamed from: r, reason: collision with root package name */
    public final P f3496r;

    /* renamed from: s, reason: collision with root package name */
    public final c f3497s;

    /* renamed from: t, reason: collision with root package name */
    public final d f3498t;
    public PopupWindow.OnDismissListener u;

    /* renamed from: v, reason: collision with root package name */
    public View f3499v;

    /* renamed from: w, reason: collision with root package name */
    public View f3500w;
    public o x;
    public ViewTreeObserver y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3501z;

    public s(Context context, j jVar, View view, int i3, boolean z3) {
        int i4 = 1;
        this.f3497s = new c(this, i4);
        this.f3498t = new d(this, i4);
        this.f3491l = context;
        this.f3492m = jVar;
        this.f3493o = z3;
        this.n = new h(jVar, LayoutInflater.from(context), z3, R.layout.abc_popup_menu_item_layout);
        this.f3495q = i3;
        Resources resources = context.getResources();
        this.f3494p = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3499v = view;
        this.f3496r = new P(context, i3);
        jVar.b(this, context);
    }

    @Override // j.r
    public final void a() {
        View view;
        if (h()) {
            return;
        }
        if (this.f3501z || (view = this.f3499v) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f3500w = view;
        P p3 = this.f3496r;
        p3.f3620F.setOnDismissListener(this);
        p3.f3631w = this;
        p3.f3619E = true;
        p3.f3620F.setFocusable(true);
        View view2 = this.f3500w;
        boolean z3 = this.y == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.y = viewTreeObserver;
        if (z3) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f3497s);
        }
        view2.addOnAttachStateChangeListener(this.f3498t);
        p3.f3630v = view2;
        p3.f3629t = this.f3489C;
        boolean z4 = this.f3487A;
        Context context = this.f3491l;
        h hVar = this.n;
        if (!z4) {
            this.f3488B = l.m(hVar, context, this.f3494p);
            this.f3487A = true;
        }
        int i3 = this.f3488B;
        Rect rect = p3.f3617C;
        Drawable background = p3.f3620F.getBackground();
        if (background != null) {
            background.getPadding(rect);
            p3.n = rect.left + rect.right + i3;
        } else {
            p3.n = i3;
        }
        p3.f3620F.setInputMethodMode(2);
        Rect rect2 = this.f3474k;
        p3.f3618D = rect2 != null ? new Rect(rect2) : null;
        p3.a();
        O o2 = p3.f3623m;
        o2.setOnKeyListener(this);
        if (this.f3490D) {
            j jVar = this.f3492m;
            if (jVar.f3442l != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) o2, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(jVar.f3442l);
                }
                frameLayout.setEnabled(false);
                o2.addHeaderView(frameLayout, null, false);
            }
        }
        p3.b(hVar);
        p3.a();
    }

    @Override // j.p
    public final void b(j jVar, boolean z3) {
        if (jVar != this.f3492m) {
            return;
        }
        dismiss();
        o oVar = this.x;
        if (oVar != null) {
            oVar.b(jVar, z3);
        }
    }

    @Override // j.p
    public final void d() {
        this.f3487A = false;
        h hVar = this.n;
        if (hVar != null) {
            hVar.notifyDataSetChanged();
        }
    }

    @Override // j.r
    public final void dismiss() {
        if (h()) {
            this.f3496r.dismiss();
        }
    }

    @Override // j.r
    public final ListView e() {
        return this.f3496r.f3623m;
    }

    @Override // j.p
    public final boolean g() {
        return false;
    }

    @Override // j.r
    public final boolean h() {
        return !this.f3501z && this.f3496r.f3620F.isShowing();
    }

    @Override // j.p
    public final void j(o oVar) {
        this.x = oVar;
    }

    @Override // j.p
    public final boolean k(t tVar) {
        boolean z3;
        if (tVar.hasVisibleItems()) {
            n nVar = new n(this.f3491l, tVar, this.f3500w, this.f3493o, this.f3495q, 0);
            o oVar = this.x;
            nVar.f3483h = oVar;
            l lVar = nVar.f3484i;
            if (lVar != null) {
                lVar.j(oVar);
            }
            int size = tVar.f3436f.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z3 = false;
                    break;
                }
                MenuItem item = tVar.getItem(i3);
                if (item.isVisible() && item.getIcon() != null) {
                    z3 = true;
                    break;
                }
                i3++;
            }
            nVar.f3482g = z3;
            l lVar2 = nVar.f3484i;
            if (lVar2 != null) {
                lVar2.o(z3);
            }
            nVar.f3485j = this.u;
            this.u = null;
            this.f3492m.c(false);
            P p3 = this.f3496r;
            int i4 = p3.f3624o;
            int i5 = !p3.f3626q ? 0 : p3.f3625p;
            int i6 = this.f3489C;
            View view = this.f3499v;
            Field field = G.f187a;
            if ((Gravity.getAbsoluteGravity(i6, view.getLayoutDirection()) & 7) == 5) {
                i4 += this.f3499v.getWidth();
            }
            if (!nVar.b()) {
                if (nVar.f3480e != null) {
                    nVar.d(i4, i5, true, true);
                }
            }
            o oVar2 = this.x;
            if (oVar2 != null) {
                oVar2.j(tVar);
            }
            return true;
        }
        return false;
    }

    @Override // j.l
    public final void n(View view) {
        this.f3499v = view;
    }

    @Override // j.l
    public final void o(boolean z3) {
        this.n.f3428m = z3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f3501z = true;
        this.f3492m.c(true);
        ViewTreeObserver viewTreeObserver = this.y;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.y = this.f3500w.getViewTreeObserver();
            }
            this.y.removeGlobalOnLayoutListener(this.f3497s);
            this.y = null;
        }
        this.f3500w.removeOnAttachStateChangeListener(this.f3498t);
        PopupWindow.OnDismissListener onDismissListener = this.u;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f3489C = i3;
    }

    @Override // j.l
    public final void q(int i3) {
        this.f3496r.f3624o = i3;
    }

    @Override // j.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.u = onDismissListener;
    }

    @Override // j.l
    public final void s(boolean z3) {
        this.f3490D = z3;
    }

    @Override // j.l
    public final void t(int i3) {
        P p3 = this.f3496r;
        p3.f3625p = i3;
        p3.f3626q = true;
    }

    @Override // j.l
    public final void l(j jVar) {
    }
}
