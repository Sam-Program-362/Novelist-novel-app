package p003b0;

import D.G;
import D.h0;
import a2.h;
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
import p001a0.a;

/* JADX INFO: renamed from: b0.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0167w extends FrameLayout {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f2560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f2561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f2562m;
    public boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0167w(Context context, AttributeSet attributeSet, I i3) {
        super(context, attributeSet);
        h.e(context, "context");
        h.e(attributeSet, "attrs");
        this.f2560k = new ArrayList();
        this.f2561l = new ArrayList();
        this.n = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i4 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1683b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163sC = i3.C(id);
        if (classAttribute != null && abstractComponentCallbacksC0163sC == null) {
            if (id == -1) {
                throw new IllegalStateException(p055t.a.b("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : StringUtils.EMPTY));
            }
            B bG = i3.G();
            context.getClassLoader();
            AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163sA = bG.a(classAttribute);
            h.d(abstractComponentCallbacksC0163sA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            abstractComponentCallbacksC0163sA.f2520G = id;
            abstractComponentCallbacksC0163sA.f2521H = id;
            abstractComponentCallbacksC0163sA.f2522I = string;
            abstractComponentCallbacksC0163sA.f2516C = i3;
            C0165u c0165u = i3.f2388v;
            abstractComponentCallbacksC0163sA.f2517D = c0165u;
            abstractComponentCallbacksC0163sA.f2527N = true;
            if ((c0165u == null ? null : c0165u.f2553m) != null) {
                abstractComponentCallbacksC0163sA.f2527N = true;
            }
            C0146a c0146a = new C0146a(i3);
            c0146a.f2450o = true;
            abstractComponentCallbacksC0163sA.f2528O = this;
            c0146a.e(getId(), abstractComponentCallbacksC0163sA, string);
            if (c0146a.f2443g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            I i5 = c0146a.f2451p;
            if (i5.f2388v != null && !i5.f2362I) {
                i5.z(true);
                c0146a.a(i5.f2364K, i5.f2365L);
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
        ArrayList arrayListL = i3.f2371c.l();
        int size = arrayListL.size();
        while (i4 < size) {
            Object obj = arrayListL.get(i4);
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
        h.e(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0163s ? (AbstractComponentCallbacksC0163s) tag : null) != null) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        h0 h0VarC;
        h.e(windowInsets, "insets");
        h0 h0VarC2 = h0.c(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2562m;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            h.d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            h0VarC = h0.c(windowInsetsOnApplyWindowInsets, null);
        } else {
            Field field = G.f187a;
            WindowInsets windowInsetsB = h0VarC2.b();
            if (windowInsetsB != null && !windowInsetsB.equals(windowInsetsB)) {
                h0VarC2 = h0.c(windowInsetsB, this);
            }
            h0VarC = h0VarC2;
        }
        if (!h0VarC.f241a.q()) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                G.a(getChildAt(i3), h0VarC);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        h.e(canvas, "canvas");
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
        h.e(canvas, "canvas");
        h.e(view, "child");
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
        h.e(view, "view");
        this.f2561l.remove(view);
        if (this.f2560k.remove(view)) {
            this.n = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0163s> F getFragment() {
        SignInHubActivity signInHubActivity;
        AbstractComponentCallbacksC0163s abstractComponentCallbacksC0163s;
        I iG;
        View view = this;
        while (true) {
            signInHubActivity = null;
            if (view == null) {
                abstractComponentCallbacksC0163s = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0163s = tag instanceof AbstractComponentCallbacksC0163s ? (AbstractComponentCallbacksC0163s) tag : null;
            if (abstractComponentCallbacksC0163s != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0163s == null) {
            for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof SignInHubActivity) {
                    signInHubActivity = (SignInHubActivity) context;
                    break;
                }
            }
            if (signInHubActivity == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            iG = ((C0165u) signInHubActivity.f2707C.f443l).f2555p;
        } else {
            if (abstractComponentCallbacksC0163s.f2517D == null || !abstractComponentCallbacksC0163s.u) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0163s + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            iG = abstractComponentCallbacksC0163s.g();
        }
        return (F) iG.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        h.e(windowInsets, "insets");
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
                h.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        h.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i3) {
        View childAt = getChildAt(i3);
        h.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i3);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        h.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i3, int i4) {
        int i5 = i3 + i4;
        for (int i6 = i3; i6 < i5; i6++) {
            View childAt = getChildAt(i6);
            h.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i3, i4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i3, int i4) {
        int i5 = i3 + i4;
        for (int i6 = i3; i6 < i5; i6++) {
            View childAt = getChildAt(i6);
            h.d(childAt, "view");
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
        h.e(onApplyWindowInsetsListener, "listener");
        this.f2562m = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        h.e(view, "view");
        if (view.getParent() == this) {
            this.f2561l.add(view);
        }
        super.startViewTransition(view);
    }
}
