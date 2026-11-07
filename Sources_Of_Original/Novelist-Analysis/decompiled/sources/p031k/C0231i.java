package p031k;

import A.a;
import H0.i;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import it.returntrue.novelist.R;
import java.util.ArrayList;
import p028j.j;
import p028j.k;
import p028j.l;
import p028j.o;
import p028j.p;
import p028j.q;
import p028j.t;

/* JADX INFO: renamed from: k.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0231i implements p {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0228f f3695B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C0228f f3696C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public a f3697D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C0229g f3698E;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f3700k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f3701l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j f3702m;
    public final LayoutInflater n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public o f3703o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ActionMenuView f3705q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0230h f3706r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f3707s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3708t;
    public boolean u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f3709v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3710w;
    public int x;
    public int y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f3711z;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f3704p = R.layout.abc_action_menu_item_layout;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final SparseBooleanArray f3694A = new SparseBooleanArray();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final i f3699F = new i(this, 21);

    public C0231i(Context context) {
        this.f3700k = context;
        this.n = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(k kVar, View view, ActionMenuView actionMenuView) {
        View view2 = kVar.f3473z;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((kVar.y & 8) != 0 && view2 != null)) {
            q qVar = view instanceof q ? (q) view : (q) this.n.inflate(this.f3704p, (ViewGroup) actionMenuView, false);
            qVar.a(kVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) qVar;
            actionMenuItemView.setItemInvoker(this.f3705q);
            if (this.f3698E == null) {
                this.f3698E = new C0229g(this);
            }
            actionMenuItemView.setPopupCallback(this.f3698E);
            view3 = (View) qVar;
        }
        view3.setVisibility(kVar.f3451B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C0233k)) {
            view3.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view3;
    }

    @Override // p028j.p
    public final void b(j jVar, boolean z3) {
        e();
        C0228f c0228f = this.f3696C;
        if (c0228f != null && c0228f.b()) {
            c0228f.f3484i.dismiss();
        }
        o oVar = this.f3703o;
        if (oVar != null) {
            oVar.b(jVar, z3);
        }
    }

    @Override // p028j.p
    public final boolean c(k kVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p028j.p
    public final void d() {
        int i3;
        ActionMenuView actionMenuView = this.f3705q;
        ArrayList arrayList = null;
        boolean z3 = false;
        if (actionMenuView != null) {
            j jVar = this.f3702m;
            if (jVar != null) {
                jVar.i();
                ArrayList arrayListK = this.f3702m.k();
                int size = arrayListK.size();
                i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    k kVar = (k) arrayListK.get(i4);
                    if ((kVar.x & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i3);
                        k itemData = childAt instanceof q ? ((q) childAt).getItemData() : null;
                        View viewA = a(kVar, childAt, actionMenuView);
                        if (kVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup = (ViewGroup) viewA.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(viewA);
                            }
                            this.f3705q.addView(viewA, i3);
                        }
                        i3++;
                    }
                }
            } else {
                i3 = 0;
            }
            while (i3 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i3) == this.f3706r) {
                    i3++;
                } else {
                    actionMenuView.removeViewAt(i3);
                }
            }
        }
        this.f3705q.requestLayout();
        j jVar2 = this.f3702m;
        if (jVar2 != null) {
            jVar2.i();
            ArrayList arrayList2 = jVar2.f3439i;
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((k) arrayList2.get(i5)).getClass();
            }
        }
        j jVar3 = this.f3702m;
        if (jVar3 != null) {
            jVar3.i();
            arrayList = jVar3.f3440j;
        }
        if (this.u && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !((k) arrayList.get(0)).f3451B;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f3706r == null) {
                this.f3706r = new C0230h(this, this.f3700k);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f3706r.getParent();
            if (viewGroup2 != this.f3705q) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f3706r);
                }
                ActionMenuView actionMenuView2 = this.f3705q;
                C0230h c0230h = this.f3706r;
                actionMenuView2.getClass();
                C0233k c0233kH = ActionMenuView.h();
                c0233kH.f3719c = true;
                actionMenuView2.addView(c0230h, c0233kH);
            }
        } else {
            C0230h c0230h2 = this.f3706r;
            if (c0230h2 != null) {
                ViewParent parent = c0230h2.getParent();
                ActionMenuView actionMenuView3 = this.f3705q;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.f3706r);
                }
            }
        }
        this.f3705q.setOverflowReserved(this.u);
    }

    public final boolean e() {
        ActionMenuView actionMenuView;
        a aVar = this.f3697D;
        if (aVar != null && (actionMenuView = this.f3705q) != null) {
            actionMenuView.removeCallbacks(aVar);
            this.f3697D = null;
            return true;
        }
        C0228f c0228f = this.f3695B;
        if (c0228f == null) {
            return false;
        }
        if (c0228f.b()) {
            c0228f.f3484i.dismiss();
        }
        return true;
    }

    @Override // p028j.p
    public final void f(Context context, j jVar) {
        this.f3701l = context;
        LayoutInflater.from(context);
        this.f3702m = jVar;
        Resources resources = context.getResources();
        if (!this.f3709v) {
            this.u = true;
        }
        int i3 = 2;
        this.f3710w = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600 || ((i4 > 960 && i5 > 720) || (i4 > 720 && i5 > 960))) {
            i3 = 5;
        } else if (i4 >= 500 || ((i4 > 640 && i5 > 480) || (i4 > 480 && i5 > 640))) {
            i3 = 4;
        } else if (i4 >= 360) {
            i3 = 3;
        }
        this.y = i3;
        int measuredWidth = this.f3710w;
        if (this.u) {
            if (this.f3706r == null) {
                C0230h c0230h = new C0230h(this, this.f3700k);
                this.f3706r = c0230h;
                if (this.f3708t) {
                    c0230h.setImageDrawable(this.f3707s);
                    this.f3707s = null;
                    this.f3708t = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3706r.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f3706r.getMeasuredWidth();
        } else {
            this.f3706r = null;
        }
        this.x = measuredWidth;
        float f3 = resources.getDisplayMetrics().density;
    }

    @Override // p028j.p
    public final boolean g() {
        int size;
        ArrayList arrayListK;
        int i3;
        boolean z3;
        C0231i c0231i = this;
        j jVar = c0231i.f3702m;
        if (jVar != null) {
            arrayListK = jVar.k();
            size = arrayListK.size();
        } else {
            size = 0;
            arrayListK = null;
        }
        int i4 = c0231i.y;
        int i5 = c0231i.x;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = c0231i.f3705q;
        int i6 = 0;
        boolean z4 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z3 = true;
            if (i6 >= size) {
                break;
            }
            k kVar = (k) arrayListK.get(i6);
            int i9 = kVar.y;
            if ((i9 & 2) == 2) {
                i7++;
            } else if ((i9 & 1) == 1) {
                i8++;
            } else {
                z4 = true;
            }
            if (c0231i.f3711z && kVar.f3451B) {
                i4 = 0;
            }
            i6++;
        }
        if (c0231i.u && (z4 || i8 + i7 > i4)) {
            i4--;
        }
        int i10 = i4 - i7;
        SparseBooleanArray sparseBooleanArray = c0231i.f3694A;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            k kVar2 = (k) arrayListK.get(i11);
            int i13 = kVar2.y;
            boolean z5 = (i13 & 2) == i3 ? z3 : false;
            int i14 = kVar2.f3453b;
            if (z5) {
                View viewA = c0231i.a(kVar2, null, actionMenuView);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z3);
                }
                kVar2.d(z3);
            } else {
                if ((i13 & 1) == z3) {
                    boolean z6 = sparseBooleanArray.get(i14);
                    boolean z7 = ((i10 > 0 || z6) && i5 > 0) ? z3 : false;
                    if (z7) {
                        View viewA2 = c0231i.a(kVar2, null, actionMenuView);
                        viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewA2.getMeasuredWidth();
                        i5 -= measuredWidth2;
                        if (i12 == 0) {
                            i12 = measuredWidth2;
                        }
                        z7 &= i5 + i12 > 0;
                    }
                    if (z7 && i14 != 0) {
                        sparseBooleanArray.put(i14, true);
                    } else if (z6) {
                        sparseBooleanArray.put(i14, false);
                        for (int i15 = 0; i15 < i11; i15++) {
                            k kVar3 = (k) arrayListK.get(i15);
                            if (kVar3.f3453b == i14) {
                                if ((kVar3.x & 32) == 32) {
                                    i10++;
                                }
                                kVar3.d(false);
                            }
                        }
                    }
                    if (z7) {
                        i10--;
                    }
                    kVar2.d(z7);
                } else {
                    kVar2.d(false);
                }
                i11++;
                i3 = 2;
                c0231i = this;
                z3 = true;
            }
            i11++;
            i3 = 2;
            c0231i = this;
            z3 = true;
        }
        return z3;
    }

    public final boolean h() {
        j jVar;
        if (!this.u) {
            return false;
        }
        C0228f c0228f = this.f3695B;
        if ((c0228f != null && c0228f.b()) || (jVar = this.f3702m) == null || this.f3705q == null || this.f3697D != null) {
            return false;
        }
        jVar.i();
        if (jVar.f3440j.isEmpty()) {
            return false;
        }
        a aVar = new a(this, new C0228f(this, this.f3701l, this.f3702m, this.f3706r), 8, false);
        this.f3697D = aVar;
        this.f3705q.post(aVar);
        return true;
    }

    @Override // p028j.p
    public final boolean i(k kVar) {
        return false;
    }

    @Override // p028j.p
    public final void j(o oVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p028j.p
    public final boolean k(t tVar) {
        boolean z3;
        if (tVar.hasVisibleItems()) {
            t tVar2 = tVar;
            while (true) {
                j jVar = tVar2.f3502v;
                if (jVar == this.f3702m) {
                    break;
                }
                tVar2 = (t) jVar;
            }
            k kVar = tVar2.f3503w;
            ActionMenuView actionMenuView = this.f3705q;
            View view = null;
            view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = actionMenuView.getChildAt(i3);
                    if ((childAt instanceof q) && ((q) childAt).getItemData() == kVar) {
                        view = childAt;
                        break;
                    }
                }
            }
            if (view != null) {
                tVar.f3503w.getClass();
                int size = tVar.f3436f.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        z3 = false;
                        break;
                    }
                    MenuItem item = tVar.getItem(i4);
                    if (item.isVisible() && item.getIcon() != null) {
                        z3 = true;
                        break;
                    }
                    i4++;
                }
                C0228f c0228f = new C0228f(this, this.f3701l, tVar, view);
                this.f3696C = c0228f;
                c0228f.f3482g = z3;
                l lVar = c0228f.f3484i;
                if (lVar != null) {
                    lVar.o(z3);
                }
                C0228f c0228f2 = this.f3696C;
                if (!c0228f2.b()) {
                    if (c0228f2.f3480e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0228f2.d(0, 0, false, false);
                }
                o oVar = this.f3703o;
                if (oVar != null) {
                    oVar.j(tVar);
                }
                return true;
            }
        }
        return false;
    }
}
