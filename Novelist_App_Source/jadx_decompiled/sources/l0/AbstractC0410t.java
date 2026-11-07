package l0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import b1.C0192Q;
import io.flutter.plugin.platform.C0311c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k0.AbstractC0363a;

/* renamed from: l0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0410t {

    /* renamed from: a, reason: collision with root package name */
    public A0.j f4017a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f4018b;

    /* renamed from: c, reason: collision with root package name */
    public final C0192Q f4019c;

    /* renamed from: d, reason: collision with root package name */
    public final C0192Q f4020d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4021e;

    /* renamed from: f, reason: collision with root package name */
    public int f4022f;

    /* renamed from: g, reason: collision with root package name */
    public int f4023g;

    public AbstractC0410t() {
        H0.i iVar = new H0.i(this, 23);
        B1.a aVar = new B1.a(this, 21);
        this.f4019c = new C0192Q((InterfaceC0389L) iVar);
        this.f4020d = new C0192Q(aVar);
        this.f4021e = false;
    }

    public static int e(int i3, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i4, i5) : size : Math.min(size, Math.max(i4, i5));
    }

    public static void v(View view) {
        ((C0411u) view.getLayoutParams()).getClass();
        throw null;
    }

    public static C0402l w(Context context, AttributeSet attributeSet, int i3, int i4) {
        C0402l c0402l = new C0402l(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0363a.f3815a, i3, i4);
        c0402l.f4005b = obtainStyledAttributes.getInt(0, 1);
        c0402l.f4006c = obtainStyledAttributes.getInt(9, 1);
        c0402l.f4007d = obtainStyledAttributes.getBoolean(8, false);
        c0402l.f4008e = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return c0402l;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f4018b;
        C0311c c0311c = recyclerView.f2242k;
        C0379B c0379b = recyclerView.f2239h0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z3 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f4018b.canScrollVertically(-1) && !this.f4018b.canScrollHorizontally(-1) && !this.f4018b.canScrollHorizontally(1)) {
            z3 = false;
        }
        accessibilityEvent.setScrollable(z3);
        this.f4018b.getClass();
    }

    public abstract void B(Parcelable parcelable);

    public abstract Parcelable C();

    public final void E() {
        int p3 = p() - 1;
        if (p3 < 0) {
            return;
        }
        RecyclerView.j(o(p3));
        throw null;
    }

    public final void F(C0311c c0311c) {
        ArrayList arrayList = (ArrayList) c0311c.f3170m;
        int size = arrayList.size();
        int i3 = size - 1;
        if (i3 >= 0) {
            arrayList.get(i3).getClass();
            throw new ClassCastException();
        }
        arrayList.clear();
        if (size > 0) {
            this.f4018b.invalidate();
        }
    }

    public final boolean G(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        int s3 = s();
        int u = u();
        int t3 = this.f4022f - t();
        int r3 = this.f4023g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i3 = left - s3;
        int min = Math.min(0, i3);
        int i4 = top - u;
        int min2 = Math.min(0, i4);
        int i5 = width - t3;
        int max = Math.max(0, i5);
        int max2 = Math.max(0, height - r3);
        RecyclerView recyclerView2 = this.f4018b;
        Field field = D.G.f187a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (min == 0) {
                min = Math.min(i3, max);
            }
            max = min;
        } else if (max == 0) {
            max = Math.max(min, i5);
        }
        if (min2 == 0) {
            min2 = Math.min(i4, max2);
        }
        int[] iArr = {max, min2};
        int i6 = iArr[0];
        int i7 = iArr[1];
        if (z4) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int s4 = s();
            int u3 = u();
            int t4 = this.f4022f - t();
            int r4 = this.f4023g - r();
            Rect rect2 = this.f4018b.f2253q;
            int[] iArr2 = RecyclerView.f2207r0;
            C0411u c0411u = (C0411u) focusedChild.getLayoutParams();
            Rect rect3 = c0411u.f4024a;
            z5 = false;
            z6 = true;
            rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) c0411u).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) c0411u).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) c0411u).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) c0411u).bottomMargin);
            if (rect2.left - i6 >= t4 || rect2.right - i6 <= s4 || rect2.top - i7 >= r4 || rect2.bottom - i7 <= u3) {
                return false;
            }
        } else {
            z5 = false;
            z6 = true;
        }
        if (i6 == 0 && i7 == 0) {
            return z5;
        }
        if (z3) {
            recyclerView.scrollBy(i6, i7);
            return z6;
        }
        recyclerView.r(i6, i7);
        return z6;
    }

    public final void H() {
        RecyclerView recyclerView = this.f4018b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f4018b = null;
            this.f4017a = null;
            this.f4022f = 0;
            this.f4023g = 0;
            return;
        }
        this.f4018b = recyclerView;
        this.f4017a = recyclerView.n;
        this.f4022f = recyclerView.getWidth();
        this.f4023g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(C0411u c0411u) {
        return c0411u != null;
    }

    public abstract int f(C0379B c0379b);

    public abstract void g(C0379B c0379b);

    public abstract int h(C0379B c0379b);

    public abstract int i(C0379B c0379b);

    public abstract void j(C0379B c0379b);

    public abstract int k(C0379B c0379b);

    public abstract C0411u l();

    public C0411u m(Context context, AttributeSet attributeSet) {
        return new C0411u(context, attributeSet);
    }

    public C0411u n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0411u ? new C0411u((C0411u) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0411u((ViewGroup.MarginLayoutParams) layoutParams) : new C0411u(layoutParams);
    }

    public final View o(int i3) {
        A0.j jVar = this.f4017a;
        if (jVar == null) {
            return null;
        }
        C0392b c0392b = (C0392b) jVar.f58m;
        int i4 = -1;
        if (i3 >= 0) {
            int childCount = ((RecyclerView) ((B1.g) jVar.f57l).f90l).getChildCount();
            int i5 = i3;
            while (true) {
                if (i5 >= childCount) {
                    break;
                }
                int a3 = i3 - (i5 - c0392b.a(i5));
                if (a3 == 0) {
                    i4 = i5;
                    while (c0392b.b(i4)) {
                        i4++;
                    }
                } else {
                    i5 += a3;
                }
            }
        }
        return ((RecyclerView) ((B1.g) jVar.f57l).f90l).getChildAt(i4);
    }

    public final int p() {
        A0.j jVar = this.f4017a;
        if (jVar != null) {
            return ((RecyclerView) ((B1.g) jVar.f57l).f90l).getChildCount() - ((ArrayList) jVar.n).size();
        }
        return 0;
    }

    public int q(C0311c c0311c, C0379B c0379b) {
        RecyclerView recyclerView = this.f4018b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f4018b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f4018b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f4018b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f4018b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(C0311c c0311c, C0379B c0379b) {
        RecyclerView recyclerView = this.f4018b;
        if (recyclerView == null) {
            return 1;
        }
        recyclerView.getClass();
        return 1;
    }

    public abstract boolean y();

    public abstract void z(RecyclerView recyclerView);

    public void D(int i3) {
    }
}
