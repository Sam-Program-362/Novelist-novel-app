package p031k;

import D.AbstractC0005f;
import D.G;
import D.H;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import it.returntrue.novelist.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static t0 f3782t;
    public static t0 u;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f3783k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CharSequence f3784l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f3785m;
    public final s0 n = new s0(this, 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s0 f3786o = new s0(this, 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3787p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3788q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u0 f3789r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3790s;

    public t0(CharSequence charSequence, View view) {
        this.f3783k = view;
        this.f3784l = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = H.f189a;
        this.f3785m = Build.VERSION.SDK_INT >= 28 ? AbstractC0005f.k(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f3787p = Integer.MAX_VALUE;
        this.f3788q = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(t0 t0Var) {
        t0 t0Var2 = f3782t;
        if (t0Var2 != null) {
            t0Var2.f3783k.removeCallbacks(t0Var2.n);
        }
        f3782t = t0Var;
        if (t0Var != null) {
            t0Var.f3783k.postDelayed(t0Var.n, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        t0 t0Var = u;
        View view = this.f3783k;
        if (t0Var == this) {
            u = null;
            u0 u0Var = this.f3789r;
            if (u0Var != null) {
                View view2 = (View) u0Var.f3795b;
                if (view2.getParent() != null) {
                    ((WindowManager) u0Var.f3794a.getSystemService("window")).removeView(view2);
                }
                this.f3789r = null;
                this.f3787p = Integer.MAX_VALUE;
                this.f3788q = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f3782t == this) {
            b(null);
        }
        view.removeCallbacks(this.f3786o);
    }

    public final void c(boolean z3) {
        int height;
        int i3;
        int i4;
        int i5;
        long longPressTimeout;
        long j3;
        long j4;
        Field field = G.f187a;
        View view = this.f3783k;
        if (view.isAttachedToWindow()) {
            b(null);
            t0 t0Var = u;
            if (t0Var != null) {
                t0Var.a();
            }
            u = this;
            this.f3790s = z3;
            Context context = view.getContext();
            u0 u0Var = new u0();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            u0Var.f3797d = layoutParams;
            u0Var.f3798e = new Rect();
            u0Var.f3799f = new int[2];
            u0Var.f3800g = new int[2];
            u0Var.f3794a = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            u0Var.f3795b = viewInflate;
            u0Var.f3796c = (TextView) viewInflate.findViewById(R.id.message);
            layoutParams.setTitle(u0.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) u0Var.f3795b;
            Context context2 = u0Var.f3794a;
            this.f3789r = u0Var;
            int width = this.f3787p;
            int i6 = this.f3788q;
            boolean z4 = this.f3790s;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) u0Var.f3797d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) u0Var.f3796c).setText(this.f3784l);
            int[] iArr = (int[]) u0Var.f3800g;
            int[] iArr2 = (int[]) u0Var.f3799f;
            Rect rect = (Rect) u0Var.f3798e;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i6 + dimensionPixelOffset2;
                i3 = i6 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i3 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z4 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i7 = width;
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                for (Context context3 = view.getContext(); context3 instanceof ContextWrapper; context3 = ((ContextWrapper) context3).getBaseContext()) {
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i5 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i4 = 0;
                    i5 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i5 = 1;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i4 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i8 = iArr2[i4] - iArr[i4];
                iArr2[i4] = i8;
                iArr2[i5] = iArr2[i5] - iArr[i5];
                layoutParams2.x = (i8 + i7) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, i4);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i9 = iArr2[i5];
                int i10 = ((i9 + i3) - dimensionPixelOffset3) - measuredHeight;
                int i11 = i9 + height + dimensionPixelOffset3;
                if (z4) {
                    if (i10 >= 0) {
                        layoutParams2.y = i10;
                    } else {
                        layoutParams2.y = i11;
                    }
                } else if (measuredHeight + i11 <= rect.height()) {
                    layoutParams2.y = i11;
                } else {
                    layoutParams2.y = i10;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f3790s) {
                j4 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i5) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j3 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j3 = 15000;
                }
                j4 = j3 - longPressTimeout;
            }
            s0 s0Var = this.f3786o;
            view.removeCallbacks(s0Var);
            view.postDelayed(s0Var, j4);
        }
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f3789r == null || !this.f3790s) {
            View view2 = this.f3783k;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f3787p = Integer.MAX_VALUE;
                        this.f3788q = Integer.MAX_VALUE;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.f3789r == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int iAbs = Math.abs(x - this.f3787p);
                    int i3 = this.f3785m;
                    if (iAbs > i3 || Math.abs(y - this.f3788q) > i3) {
                        this.f3787p = x;
                        this.f3788q = y;
                        b(this);
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f3787p = view.getWidth() / 2;
        this.f3788q = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
