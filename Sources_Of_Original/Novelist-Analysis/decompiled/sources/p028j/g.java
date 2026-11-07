package p028j;

import D.G;
import H0.i;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import it.returntrue.novelist.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import p031k.O;
import p031k.P;
import p031k.r;

/* JADX INFO: loaded from: classes.dex */
public final class g extends l implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f3405A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f3406B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f3407C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f3408D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f3410F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public o f3411G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ViewTreeObserver f3412H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public PopupWindow.OnDismissListener f3413I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f3414J;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f3415l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f3416m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f3417o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Handler f3418p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f3421s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f3422t;
    public View x;
    public View y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f3425z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f3419q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f3420r = new ArrayList();
    public final i u = new i(this, 20);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3423v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3424w = 0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f3409E = false;

    public g(Context context, View view, int i3, boolean z3) {
        int i4 = 0;
        this.f3421s = new c(this, i4);
        this.f3422t = new d(this, i4);
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

    @Override // p028j.r
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

    @Override // p028j.p
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
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = jVar2.f3447r;
        for (WeakReference weakReference : copyOnWriteArrayList) {
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

    @Override // p028j.p
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

    @Override // p028j.r
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

    @Override // p028j.r
    public final ListView e() {
        ArrayList arrayList = this.f3420r;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((f) arrayList.get(arrayList.size() - 1)).f3402a.f3623m;
    }

    @Override // p028j.p
    public final boolean g() {
        return false;
    }

    @Override // p028j.r
    public final boolean h() {
        ArrayList arrayList = this.f3420r;
        return arrayList.size() > 0 && ((f) arrayList.get(0)).f3402a.f3620F.isShowing();
    }

    @Override // p028j.p
    public final void j(o oVar) {
        this.f3411G = oVar;
    }

    @Override // p028j.p
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

    @Override // p028j.l
    public final void l(j jVar) {
        jVar.b(this, this.f3415l);
        if (h()) {
            u(jVar);
        } else {
            this.f3419q.add(jVar);
        }
    }

    @Override // p028j.l
    public final void n(View view) {
        if (this.x != view) {
            this.x = view;
            int i3 = this.f3423v;
            Field field = G.f187a;
            this.f3424w = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    @Override // p028j.l
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

    @Override // p028j.l
    public final void p(int i3) {
        if (this.f3423v != i3) {
            this.f3423v = i3;
            View view = this.x;
            Field field = G.f187a;
            this.f3424w = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    @Override // p028j.l
    public final void q(int i3) {
        this.f3405A = true;
        this.f3407C = i3;
    }

    @Override // p028j.l
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3413I = onDismissListener;
    }

    @Override // p028j.l
    public final void s(boolean z3) {
        this.f3410F = z3;
    }

    @Override // p028j.l
    public final void t(int i3) {
        this.f3406B = true;
        this.f3408D = i3;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x017d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0181  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void u(j jVar) {
        boolean z3;
        int i3;
        int i4;
        f fVar;
        View childAt;
        int i5;
        int i6;
        int i7;
        int width;
        MenuItem item;
        h hVar;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f3415l;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        h hVar2 = new h(jVar, layoutInflaterFrom, this.f3417o, R.layout.abc_cascading_menu_item_layout);
        if (!h() && this.f3409E) {
            hVar2.f3428m = true;
        } else if (h()) {
            int size = jVar.f3436f.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    z3 = false;
                    break;
                }
                MenuItem item2 = jVar.getItem(i8);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z3 = true;
                    break;
                }
                i8++;
            }
            hVar2.f3428m = z3;
        }
        int iM = l.m(hVar2, context, this.f3416m);
        P p3 = new P(context, this.n);
        p3.f3636I = this.u;
        p3.f3631w = this;
        p3.f3620F.setOnDismissListener(this);
        p3.f3630v = this.x;
        p3.f3629t = this.f3424w;
        p3.f3619E = true;
        p3.f3620F.setFocusable(true);
        p3.f3620F.setInputMethodMode(2);
        p3.b(hVar2);
        Drawable background = p3.f3620F.getBackground();
        if (background != null) {
            Rect rect = p3.f3617C;
            background.getPadding(rect);
            p3.n = rect.left + rect.right + iM;
        } else {
            p3.n = iM;
        }
        p3.f3629t = this.f3424w;
        ArrayList arrayList = this.f3420r;
        if (arrayList.size() > 0) {
            fVar = (f) arrayList.get(arrayList.size() - 1);
            j jVar2 = fVar.f3403b;
            int size2 = jVar2.f3436f.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size2) {
                    item = null;
                    break;
                }
                item = jVar2.getItem(i9);
                if (item.hasSubMenu() && jVar == item.getSubMenu()) {
                    break;
                } else {
                    i9++;
                }
            }
            if (item == null) {
                i3 = 1;
                childAt = null;
                i4 = 0;
            } else {
                O o2 = fVar.f3402a.f3623m;
                ListAdapter adapter = o2.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    hVar = (h) headerViewListAdapter.getWrappedAdapter();
                } else {
                    hVar = (h) adapter;
                    headersCount = 0;
                }
                int count = hVar.getCount();
                i3 = 1;
                int i10 = 0;
                i4 = 0;
                while (true) {
                    if (i10 >= count) {
                        i10 = -1;
                        break;
                    } else if (item == hVar.getItem(i10)) {
                        break;
                    } else {
                        i10++;
                    }
                }
                childAt = (i10 != -1 && (firstVisiblePosition = (i10 + headersCount) - o2.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < o2.getChildCount()) ? o2.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            i3 = 1;
            i4 = 0;
            fVar = null;
            childAt = null;
        }
        if (childAt != null) {
            int i11 = Build.VERSION.SDK_INT;
            r rVar = p3.f3620F;
            if (i11 <= 28) {
                Method method = P.f3635J;
                if (method != null) {
                    try {
                        method.invoke(rVar, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                rVar.setTouchModal(false);
            }
            p3.f3620F.setEnterTransition(null);
            O o3 = ((f) arrayList.get(arrayList.size() - 1)).f3402a.f3623m;
            int[] iArr = new int[2];
            o3.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.y.getWindowVisibleDisplayFrame(rect2);
            if (this.f3425z == i3) {
                if (o3.getWidth() + iArr[i4] + iM > rect2.right) {
                    i5 = i4;
                } else {
                    i5 = 1;
                }
            } else if (iArr[i4] - iM < 0) {
                i5 = 1;
            } else {
                i5 = i4;
            }
            int i12 = i5 == 1 ? 1 : i4;
            this.f3425z = i5;
            if (Build.VERSION.SDK_INT >= 26) {
                p3.f3630v = childAt;
                i7 = i4;
                i6 = i7;
            } else {
                int[] iArr2 = new int[2];
                this.x.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                childAt.getLocationOnScreen(iArr3);
                if ((this.f3424w & 7) == 5) {
                    iArr2[i4] = this.x.getWidth() + iArr2[i4];
                    iArr3[i4] = childAt.getWidth() + iArr3[i4];
                }
                i6 = iArr3[i4] - iArr2[i4];
                i7 = iArr3[1] - iArr2[1];
            }
            if ((this.f3424w & 5) != 5) {
                width = i12 != 0 ? i6 + childAt.getWidth() : i6 - iM;
            } else if (i12 != 0) {
                width = i6 + iM;
            } else {
                iM = childAt.getWidth();
            }
            p3.f3624o = width;
            p3.f3628s = true;
            p3.f3627r = true;
            p3.f3625p = i7;
            p3.f3626q = true;
        } else {
            if (this.f3405A) {
                p3.f3624o = this.f3407C;
            }
            if (this.f3406B) {
                p3.f3625p = this.f3408D;
                p3.f3626q = true;
            }
            Rect rect3 = this.f3474k;
            p3.f3618D = rect3 != null ? new Rect(rect3) : null;
        }
        arrayList.add(new f(p3, jVar, this.f3425z));
        p3.a();
        O o4 = p3.f3623m;
        o4.setOnKeyListener(this);
        if (fVar == null && this.f3410F && jVar.f3442l != null) {
            boolean z4 = i4;
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, o4, z4);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(z4);
            textView.setText(jVar.f3442l);
            o4.addHeaderView(frameLayout, null, z4);
            p3.a();
        }
    }
}
