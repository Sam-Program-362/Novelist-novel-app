package k;

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

/* renamed from: k.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0346i implements j.p {

    /* renamed from: B, reason: collision with root package name */
    public C0343f f3695B;

    /* renamed from: C, reason: collision with root package name */
    public C0343f f3696C;

    /* renamed from: D, reason: collision with root package name */
    public A.a f3697D;

    /* renamed from: E, reason: collision with root package name */
    public C0344g f3698E;

    /* renamed from: k, reason: collision with root package name */
    public final Context f3700k;

    /* renamed from: l, reason: collision with root package name */
    public Context f3701l;

    /* renamed from: m, reason: collision with root package name */
    public j.j f3702m;
    public final LayoutInflater n;

    /* renamed from: o, reason: collision with root package name */
    public j.o f3703o;

    /* renamed from: q, reason: collision with root package name */
    public ActionMenuView f3705q;

    /* renamed from: r, reason: collision with root package name */
    public C0345h f3706r;

    /* renamed from: s, reason: collision with root package name */
    public Drawable f3707s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3708t;
    public boolean u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3709v;

    /* renamed from: w, reason: collision with root package name */
    public int f3710w;
    public int x;
    public int y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3711z;

    /* renamed from: p, reason: collision with root package name */
    public final int f3704p = R.layout.abc_action_menu_item_layout;

    /* renamed from: A, reason: collision with root package name */
    public final SparseBooleanArray f3694A = new SparseBooleanArray();

    /* renamed from: F, reason: collision with root package name */
    public final H0.i f3699F = new H0.i(this, 21);

    public C0346i(Context context) {
        this.f3700k = context;
        this.n = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v4, types: [j.q] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final View a(j.k kVar, View view, ActionMenuView actionMenuView) {
        View view2 = kVar.f3473z;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((kVar.y & 8) != 0 && view2 != null)) {
            ActionMenuItemView actionMenuItemView = view instanceof j.q ? (j.q) view : (j.q) this.n.inflate(this.f3704p, (ViewGroup) actionMenuView, false);
            actionMenuItemView.a(kVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f3705q);
            if (this.f3698E == null) {
                this.f3698E = new C0344g(this);
            }
            actionMenuItemView2.setPopupCallback(this.f3698E);
            view3 = actionMenuItemView;
        }
        view3.setVisibility(kVar.f3451B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof C0348k)) {
            view3.setLayoutParams(ActionMenuView.i(layoutParams));
        }
        return view3;
    }

    @Override // j.p
    public final void b(j.j jVar, boolean z3) {
        e();
        C0343f c0343f = this.f3696C;
        if (c0343f != null && c0343f.b()) {
            c0343f.f3484i.dismiss();
        }
        j.o oVar = this.f3703o;
        if (oVar != null) {
            oVar.b(jVar, z3);
        }
    }

    @Override // j.p
    public final boolean c(j.k kVar) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.p
    public final void d() {
        int i3;
        ActionMenuView actionMenuView = this.f3705q;
        ArrayList arrayList = null;
        boolean z3 = false;
        if (actionMenuView != null) {
            j.j jVar = this.f3702m;
            if (jVar != null) {
                jVar.i();
                ArrayList k3 = this.f3702m.k();
                int size = k3.size();
                i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    j.k kVar = (j.k) k3.get(i4);
                    if ((kVar.x & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i3);
                        j.k itemData = childAt instanceof j.q ? ((j.q) childAt).getItemData() : null;
                        View a3 = a(kVar, childAt, actionMenuView);
                        if (kVar != itemData) {
                            a3.setPressed(false);
                            a3.jumpDrawablesToCurrentState();
                        }
                        if (a3 != childAt) {
                            ViewGroup viewGroup = (ViewGroup) a3.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(a3);
                            }
                            this.f3705q.addView(a3, i3);
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
        j.j jVar2 = this.f3702m;
        if (jVar2 != null) {
            jVar2.i();
            ArrayList arrayList2 = jVar2.f3439i;
            int size2 = arrayList2.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((j.k) arrayList2.get(i5)).getClass();
            }
        }
        j.j jVar3 = this.f3702m;
        if (jVar3 != null) {
            jVar3.i();
            arrayList = jVar3.f3440j;
        }
        if (this.u && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !((j.k) arrayList.get(0)).f3451B;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f3706r == null) {
                this.f3706r = new C0345h(this, this.f3700k);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f3706r.getParent();
            if (viewGroup2 != this.f3705q) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f3706r);
                }
                ActionMenuView actionMenuView2 = this.f3705q;
                C0345h c0345h = this.f3706r;
                actionMenuView2.getClass();
                C0348k h3 = ActionMenuView.h();
                h3.f3719c = true;
                actionMenuView2.addView(c0345h, h3);
            }
        } else {
            C0345h c0345h2 = this.f3706r;
            if (c0345h2 != null) {
                ViewParent parent = c0345h2.getParent();
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
        A.a aVar = this.f3697D;
        if (aVar != null && (actionMenuView = this.f3705q) != null) {
            actionMenuView.removeCallbacks(aVar);
            this.f3697D = null;
            return true;
        }
        C0343f c0343f = this.f3695B;
        if (c0343f == null) {
            return false;
        }
        if (c0343f.b()) {
            c0343f.f3484i.dismiss();
        }
        return true;
    }

    @Override // j.p
    public final void f(Context context, j.j jVar) {
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
        int i6 = this.f3710w;
        if (this.u) {
            if (this.f3706r == null) {
                C0345h c0345h = new C0345h(this, this.f3700k);
                this.f3706r = c0345h;
                if (this.f3708t) {
                    c0345h.setImageDrawable(this.f3707s);
                    this.f3707s = null;
                    this.f3708t = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3706r.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i6 -= this.f3706r.getMeasuredWidth();
        } else {
            this.f3706r = null;
        }
        this.x = i6;
        float f3 = resources.getDisplayMetrics().density;
    }

    @Override // j.p
    public final boolean g() {
        int i3;
        ArrayList arrayList;
        int i4;
        boolean z3;
        C0346i c0346i = this;
        j.j jVar = c0346i.f3702m;
        if (jVar != null) {
            arrayList = jVar.k();
            i3 = arrayList.size();
        } else {
            i3 = 0;
            arrayList = null;
        }
        int i5 = c0346i.y;
        int i6 = c0346i.x;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = c0346i.f3705q;
        int i7 = 0;
        boolean z4 = false;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i4 = 2;
            z3 = true;
            if (i7 >= i3) {
                break;
            }
            j.k kVar = (j.k) arrayList.get(i7);
            int i10 = kVar.y;
            if ((i10 & 2) == 2) {
                i8++;
            } else if ((i10 & 1) == 1) {
                i9++;
            } else {
                z4 = true;
            }
            if (c0346i.f3711z && kVar.f3451B) {
                i5 = 0;
            }
            i7++;
        }
        if (c0346i.u && (z4 || i9 + i8 > i5)) {
            i5--;
        }
        int i11 = i5 - i8;
        SparseBooleanArray sparseBooleanArray = c0346i.f3694A;
        sparseBooleanArray.clear();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i3) {
            j.k kVar2 = (j.k) arrayList.get(i12);
            int i14 = kVar2.y;
            boolean z5 = (i14 & 2) == i4 ? z3 : false;
            int i15 = kVar2.f3453b;
            if (z5) {
                View a3 = c0346i.a(kVar2, null, actionMenuView);
                a3.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a3.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                if (i15 != 0) {
                    sparseBooleanArray.put(i15, z3);
                }
                kVar2.d(z3);
            } else if ((i14 & 1) == z3) {
                boolean z6 = sparseBooleanArray.get(i15);
                boolean z7 = ((i11 > 0 || z6) && i6 > 0) ? z3 : false;
                if (z7) {
                    View a4 = c0346i.a(kVar2, null, actionMenuView);
                    a4.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a4.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    z7 &= i6 + i13 > 0;
                }
                if (z7 && i15 != 0) {
                    sparseBooleanArray.put(i15, true);
                } else if (z6) {
                    sparseBooleanArray.put(i15, false);
                    for (int i16 = 0; i16 < i12; i16++) {
                        j.k kVar3 = (j.k) arrayList.get(i16);
                        if (kVar3.f3453b == i15) {
                            if ((kVar3.x & 32) == 32) {
                                i11++;
                            }
                            kVar3.d(false);
                        }
                    }
                }
                if (z7) {
                    i11--;
                }
                kVar2.d(z7);
            } else {
                kVar2.d(false);
                i12++;
                i4 = 2;
                c0346i = this;
                z3 = true;
            }
            i12++;
            i4 = 2;
            c0346i = this;
            z3 = true;
        }
        return z3;
    }

    public final boolean h() {
        j.j jVar;
        if (!this.u) {
            return false;
        }
        C0343f c0343f = this.f3695B;
        if ((c0343f != null && c0343f.b()) || (jVar = this.f3702m) == null || this.f3705q == null || this.f3697D != null) {
            return false;
        }
        jVar.i();
        if (jVar.f3440j.isEmpty()) {
            return false;
        }
        A.a aVar = new A.a(this, new C0343f(this, this.f3701l, this.f3702m, this.f3706r), 8, false);
        this.f3697D = aVar;
        this.f3705q.post(aVar);
        return true;
    }

    @Override // j.p
    public final boolean i(j.k kVar) {
        return false;
    }

    @Override // j.p
    public final void j(j.o oVar) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.p
    public final boolean k(j.t tVar) {
        boolean z3;
        if (tVar.hasVisibleItems()) {
            j.t tVar2 = tVar;
            while (true) {
                j.j jVar = tVar2.f3502v;
                if (jVar == this.f3702m) {
                    break;
                }
                tVar2 = (j.t) jVar;
            }
            j.k kVar = tVar2.f3503w;
            ActionMenuView actionMenuView = this.f3705q;
            View view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = actionMenuView.getChildAt(i3);
                    if ((childAt instanceof j.q) && ((j.q) childAt).getItemData() == kVar) {
                        view = childAt;
                        break;
                    }
                    i3++;
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
                C0343f c0343f = new C0343f(this, this.f3701l, tVar, view);
                this.f3696C = c0343f;
                c0343f.f3482g = z3;
                j.l lVar = c0343f.f3484i;
                if (lVar != null) {
                    lVar.o(z3);
                }
                C0343f c0343f2 = this.f3696C;
                if (!c0343f2.b()) {
                    if (c0343f2.f3480e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    c0343f2.d(0, 0, false, false);
                }
                j.o oVar = this.f3703o;
                if (oVar != null) {
                    oVar.j(tVar);
                }
                return true;
            }
        }
        return false;
    }
}
