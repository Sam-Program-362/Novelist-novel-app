package b0;

import D.h0;
import a0.AbstractC0103a;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import it.returntrue.novelist.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.apache.tika.utils.StringUtils;
import t.AbstractC0468a;

/* renamed from: b0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175w extends FrameLayout {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2560k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f2561l;

    /* renamed from: m, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f2562m;
    public boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0175w(Context context, AttributeSet attributeSet, I i3) {
        super(context, attributeSet);
        a2.h.e(context, "context");
        a2.h.e(attributeSet, "attrs");
        this.f2560k = new ArrayList();
        this.f2561l = new ArrayList();
        this.n = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i4 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0103a.f1683b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0171s C2 = i3.C(id);
        if (classAttribute != null && C2 == null) {
            if (id == -1) {
                throw new IllegalStateException(AbstractC0468a.b("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : StringUtils.EMPTY));
            }
            C0153B G3 = i3.G();
            context.getClassLoader();
            AbstractComponentCallbacksC0171s a3 = G3.a(classAttribute);
            a2.h.d(a3, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a3.f2520G = id;
            a3.f2521H = id;
            a3.f2522I = string;
            a3.f2516C = i3;
            C0173u c0173u = i3.f2388v;
            a3.f2517D = c0173u;
            a3.f2527N = true;
            if ((c0173u == null ? null : c0173u.f2553m) != null) {
                a3.f2527N = true;
            }
            C0154a c0154a = new C0154a(i3);
            c0154a.f2450o = true;
            a3.f2528O = this;
            c0154a.e(getId(), a3, string);
            if (c0154a.f2443g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            I i5 = c0154a.f2451p;
            if (i5.f2388v != null && !i5.f2362I) {
                i5.z(true);
                c0154a.a(i5.f2364K, i5.f2365L);
                i5.f2370b = true;
                try {
                    i5.T(i5.f2364K, i5.f2365L);
                    i5.d();
                    i5.e0();
                    i5.v();
                    ((HashMap) i5.f2371c.f145l).values().removeAll(Collections.singleton(null));
                } catch (Throwable th) {
                    i5.d();
                    throw th;
                }
            }
        }
        ArrayList l3 = i3.f2371c.l();
        int size = l3.size();
        while (i4 < size) {
            Object obj = l3.get(i4);
            i4++;
            int i6 = ((O) obj).f2419c.f2521H;
            getId();
        }
    }

    public final void a(View view) {
        if (this.f2561l.contains(view)) {
            this.f2560k.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        a2.h.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0171s ? (AbstractComponentCallbacksC0171s) tag : null) != null) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        h0 h0Var;
        a2.h.e(windowInsets, "insets");
        h0 c3 = h0.c(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2562m;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            a2.h.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            h0Var = h0.c(onApplyWindowInsets, null);
        } else {
            Field field = D.G.f187a;
            WindowInsets b3 = c3.b();
            if (b3 != null && !b3.equals(b3)) {
                c3 = h0.c(b3, this);
            }
            h0Var = c3;
        }
        if (!h0Var.f241a.q()) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                D.G.a(getChildAt(i3), h0Var);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a2.h.e(canvas, "canvas");
        if (this.n) {
            ArrayList arrayList = this.f2560k;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        a2.h.e(canvas, "canvas");
        a2.h.e(view, "child");
        if (this.n) {
            ArrayList arrayList = this.f2560k;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        a2.h.e(view, "view");
        this.f2561l.remove(view);
        if (this.f2560k.remove(view)) {
            this.n = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0171s> F getFragment() {
        SignInHubActivity signInHubActivity;
        AbstractComponentCallbacksC0171s abstractComponentCallbacksC0171s;
        I i3;
        View view = this;
        while (true) {
            signInHubActivity = null;
            if (view == null) {
                abstractComponentCallbacksC0171s = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0171s = tag instanceof AbstractComponentCallbacksC0171s ? (AbstractComponentCallbacksC0171s) tag : null;
            if (abstractComponentCallbacksC0171s != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0171s == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof SignInHubActivity) {
                    signInHubActivity = (SignInHubActivity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (signInHubActivity == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            i3 = ((C0173u) signInHubActivity.f2707C.f443l).f2555p;
        } else {
            if (abstractComponentCallbacksC0171s.f2517D == null || !abstractComponentCallbacksC0171s.u) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0171s + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            i3 = abstractComponentCallbacksC0171s.g();
        }
        return (F) i3.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        a2.h.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                a2.h.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        a2.h.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i3) {
        View childAt = getChildAt(i3);
        a2.h.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i3);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        a2.h.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i3, int i4) {
        int i5 = i3 + i4;
        for (int i6 = i3; i6 < i5; i6++) {
            View childAt = getChildAt(i6);
            a2.h.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i3, i4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i3, int i4) {
        int i5 = i3 + i4;
        for (int i6 = i3; i6 < i5; i6++) {
            View childAt = getChildAt(i6);
            a2.h.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i3, i4);
    }

    public final void setDrawDisappearingViewsLast(boolean z3) {
        this.n = z3;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        a2.h.e(onApplyWindowInsetsListener, "listener");
        this.f2562m = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        a2.h.e(view, "view");
        if (view.getParent() == this) {
            this.f2561l.add(view);
        }
        super.startViewTransition(view);
    }
}
