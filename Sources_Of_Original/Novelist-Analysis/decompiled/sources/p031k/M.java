package p031k;

import D.G;
import T.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p013f.a;
import p028j.l;
import p028j.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class M implements r {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final Method f3613G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final Method f3614H;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Handler f3616B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Rect f3618D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f3619E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final r f3620F;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f3621k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ListAdapter f3622l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public O f3623m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3624o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3625p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3626q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3627r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3628s;
    public b u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f3630v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public l f3631w;
    public int n = -2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3629t = 0;
    public final J x = new J(this, 1);
    public final L y = new L(this);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final K f3632z = new K(this);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final J f3615A = new J(this, 0);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Rect f3617C = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f3613G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f3614H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public M(Context context, int i3) {
        int resourceId;
        this.f3621k = context;
        this.f3616B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, a.f2800l, i3, 0);
        this.f3624o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f3625p = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f3626q = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        r rVar = new r(context, null, i3, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(null, a.f2803p, i3, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            rVar.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        rVar.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : p017g.a.a(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f3620F = rVar;
        rVar.setInputMethodMode(1);
    }

    @Override // p028j.r
    public final void a() {
        int i3;
        int iMakeMeasureSpec;
        O o2;
        O o3 = this.f3623m;
        Context context = this.f3621k;
        r rVar = this.f3620F;
        int i4 = 0;
        if (o3 == null) {
            O o4 = new O(context, !this.f3619E);
            o4.setHoverListener((P) this);
            this.f3623m = o4;
            o4.setAdapter(this.f3622l);
            this.f3623m.setOnItemClickListener(this.f3631w);
            this.f3623m.setFocusable(true);
            this.f3623m.setFocusableInTouchMode(true);
            this.f3623m.setOnItemSelectedListener(new I(this, i4));
            this.f3623m.setOnScrollListener(this.f3632z);
            rVar.setContentView(this.f3623m);
        }
        Drawable background = rVar.getBackground();
        Rect rect = this.f3617C;
        if (background != null) {
            background.getPadding(rect);
            int i5 = rect.top;
            i3 = rect.bottom + i5;
            if (!this.f3626q) {
                this.f3625p = -i5;
            }
        } else {
            rect.setEmpty();
            i3 = 0;
        }
        int maxAvailableHeight = rVar.getMaxAvailableHeight(this.f3630v, this.f3625p, rVar.getInputMethodMode() == 2);
        int i6 = this.n;
        if (i6 != -2) {
            iMakeMeasureSpec = i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
        }
        int iA = this.f3623m.a(iMakeMeasureSpec, maxAvailableHeight);
        int paddingBottom = iA + (iA > 0 ? this.f3623m.getPaddingBottom() + this.f3623m.getPaddingTop() + i3 : 0);
        this.f3620F.getInputMethodMode();
        rVar.setWindowLayoutType(1002);
        if (rVar.isShowing()) {
            View view = this.f3630v;
            Field field = G.f187a;
            if (view.isAttachedToWindow()) {
                int width = this.n;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f3630v.getWidth();
                }
                rVar.setOutsideTouchable(true);
                rVar.update(this.f3630v, this.f3624o, this.f3625p, width < 0 ? -1 : width, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int width2 = this.n;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f3630v.getWidth();
        }
        rVar.setWidth(width2);
        rVar.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f3613G;
            if (method != null) {
                try {
                    method.invoke(rVar, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            rVar.setIsClippedToScreen(true);
        }
        rVar.setOutsideTouchable(true);
        rVar.setTouchInterceptor(this.y);
        if (this.f3628s) {
            rVar.setOverlapAnchor(this.f3627r);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f3614H;
            if (method2 != null) {
                try {
                    method2.invoke(rVar, this.f3618D);
                } catch (Exception e3) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e3);
                }
            }
        } else {
            rVar.setEpicenterBounds(this.f3618D);
        }
        rVar.showAsDropDown(this.f3630v, this.f3624o, this.f3625p, this.f3629t);
        this.f3623m.setSelection(-1);
        if ((!this.f3619E || this.f3623m.isInTouchMode()) && (o2 = this.f3623m) != null) {
            o2.setListSelectionHidden(true);
            o2.requestLayout();
        }
        if (this.f3619E) {
            return;
        }
        this.f3616B.post(this.f3615A);
    }

    public final void b(ListAdapter listAdapter) {
        b bVar = this.u;
        if (bVar == null) {
            this.u = new b(this, 1);
        } else {
            ListAdapter listAdapter2 = this.f3622l;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.f3622l = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.u);
        }
        O o2 = this.f3623m;
        if (o2 != null) {
            o2.setAdapter(this.f3622l);
        }
    }

    @Override // p028j.r
    public final void dismiss() {
        r rVar = this.f3620F;
        rVar.dismiss();
        rVar.setContentView(null);
        this.f3623m = null;
        this.f3616B.removeCallbacks(this.x);
    }

    @Override // p028j.r
    public final ListView e() {
        return this.f3623m;
    }

    @Override // p028j.r
    public final boolean h() {
        return this.f3620F.isShowing();
    }
}
