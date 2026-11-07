package p035l0;

import A0.j;
import B1.a;
import B1.g;
import D.G;
import H0.i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import io.flutter.plugin.platform.C0220c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import p004b1.Q;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f4017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f4018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q f4019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q f4020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4023g;

    public t() {
        i iVar = new i(this, 23);
        a aVar = new a(this, 21);
        this.f4019c = new Q((L) iVar);
        this.f4020d = new Q(aVar);
        this.f4021e = false;
    }

    public static int e(int i3, int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i4, i5) : size;
        }
        return Math.min(size, Math.max(i4, i5));
    }

    public static void v(View view) {
        ((u) view.getLayoutParams()).getClass();
        throw null;
    }

    public static C0259l w(Context context, AttributeSet attributeSet, int i3, int i4) {
        C0259l c0259l = new C0259l(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p032k0.a.f3815a, i3, i4);
        c0259l.f4005b = typedArrayObtainStyledAttributes.getInt(0, 1);
        c0259l.f4006c = typedArrayObtainStyledAttributes.getInt(9, 1);
        c0259l.f4007d = typedArrayObtainStyledAttributes.getBoolean(8, false);
        c0259l.f4008e = typedArrayObtainStyledAttributes.getBoolean(10, false);
        typedArrayObtainStyledAttributes.recycle();
        return c0259l;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f4018b;
        C0220c c0220c = recyclerView.f2242k;
        B b3 = recyclerView.f2239h0;
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
        int iP = p() - 1;
        if (iP < 0) {
            return;
        }
        RecyclerView.j(o(iP));
        throw null;
    }

    public final void F(C0220c c0220c) {
        ArrayList arrayList = (ArrayList) c0220c.f3170m;
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
        int iS = s();
        int iU = u();
        int iT = this.f4022f - t();
        int iR = this.f4023g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i3 = left - iS;
        int iMin = Math.min(0, i3);
        int i4 = top - iU;
        int iMin2 = Math.min(0, i4);
        int i5 = iWidth - iT;
        int iMax = Math.max(0, i5);
        int iMax2 = Math.max(0, iHeight - iR);
        RecyclerView recyclerView2 = this.f4018b;
        Field field = G.f187a;
        if (recyclerView2.getLayoutDirection() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i3, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i5);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i4, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i6 = iArr[0];
        int i7 = iArr[1];
        if (z4) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iS2 = s();
            int iU2 = u();
            int iT2 = this.f4022f - t();
            int iR2 = this.f4023g - r();
            Rect rect2 = this.f4018b.f2253q;
            int[] iArr2 = RecyclerView.f2207r0;
            u uVar = (u) focusedChild.getLayoutParams();
            Rect rect3 = uVar.f4024a;
            z5 = false;
            rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) uVar).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) uVar).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) uVar).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) uVar).bottomMargin);
            if (rect2.left - i6 >= iT2 || rect2.right - i6 <= iS2 || rect2.top - i7 >= iR2 || rect2.bottom - i7 <= iU2) {
                return false;
            }
        } else {
            z5 = false;
        }
        if (i6 == 0 && i7 == 0) {
            return z5;
        }
        if (z3) {
            recyclerView.scrollBy(i6, i7);
            return 1;
        }
        recyclerView.r(i6, i7);
        return r11;
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

    public boolean d(u uVar) {
        return uVar != null;
    }

    public abstract int f(B b3);

    public abstract void g(B b3);

    public abstract int h(B b3);

    public abstract int i(B b3);

    public abstract void j(B b3);

    public abstract int k(B b3);

    public abstract u l();

    public u m(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    public u n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof u) {
            return new u((u) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new u((ViewGroup.MarginLayoutParams) layoutParams) : new u(layoutParams);
    }

    public final View o(int i3) {
        j jVar = this.f4017a;
        if (jVar == null) {
            return null;
        }
        C0249b c0249b = (C0249b) jVar.f58m;
        int i4 = -1;
        if (i3 >= 0) {
            int childCount = ((RecyclerView) ((g) jVar.f57l).f90l).getChildCount();
            int i5 = i3;
            while (i5 < childCount) {
                int iA = i3 - (i5 - c0249b.a(i5));
                if (iA == 0) {
                    i4 = i5;
                    while (c0249b.b(i4)) {
                        i4++;
                    }
                    break;
                }
                i5 += iA;
            }
        }
        return ((RecyclerView) ((g) jVar.f57l).f90l).getChildAt(i4);
    }

    public final int p() {
        j jVar = this.f4017a;
        if (jVar != null) {
            return ((RecyclerView) ((g) jVar.f57l).f90l).getChildCount() - ((ArrayList) jVar.n).size();
        }
        return 0;
    }

    public int q(C0220c c0220c, B b3) {
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

    public int x(C0220c c0220c, B b3) {
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
