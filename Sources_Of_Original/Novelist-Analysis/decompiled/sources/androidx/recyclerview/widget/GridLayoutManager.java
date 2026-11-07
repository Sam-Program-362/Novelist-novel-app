package androidx.recyclerview.widget;

import B1.a;
import B1.e;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import io.flutter.plugin.platform.C0220c;
import p035l0.B;
import p035l0.C0258k;
import p035l0.t;
import p035l0.u;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2198p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f2199q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f2198p = -1;
        new SparseIntArray();
        new SparseIntArray();
        a aVar = new a(20);
        this.f2199q = aVar;
        new Rect();
        int i5 = t.w(context, attributeSet, i3, i4).f4006c;
        if (i5 == this.f2198p) {
            return;
        }
        if (i5 < 1) {
            throw new IllegalArgumentException(e.g("Span count should be at least 1. Provided ", i5));
        }
        this.f2198p = i5;
        ((SparseIntArray) aVar.f80l).clear();
        H();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z3) {
        if (z3) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.Q(false);
    }

    public final int R(C0220c c0220c, B b3, int i3) {
        boolean z3 = b3.f3921c;
        a aVar = this.f2199q;
        if (!z3) {
            aVar.getClass();
            return a.j(i3, this.f2198p);
        }
        RecyclerView recyclerView = (RecyclerView) c0220c.f3172p;
        B b4 = recyclerView.f2239h0;
        if (i3 < 0 || i3 >= b4.a()) {
            throw new IndexOutOfBoundsException("invalid position " + i3 + ". State item count is " + b4.a() + recyclerView.h());
        }
        int iW = !b4.f3921c ? i3 : recyclerView.f2246m.w(i3, 0);
        if (iW != -1) {
            aVar.getClass();
            return a.j(iW, this.f2198p);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i3);
        return 0;
    }

    @Override // p035l0.t
    public final boolean d(u uVar) {
        return uVar instanceof C0258k;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p035l0.t
    public final u l() {
        return this.f2200h == 0 ? new C0258k(-2, -1) : new C0258k(-1, -2);
    }

    @Override // p035l0.t
    public final u m(Context context, AttributeSet attributeSet) {
        return new C0258k(context, attributeSet);
    }

    @Override // p035l0.t
    public final u n(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0258k((ViewGroup.MarginLayoutParams) layoutParams) : new C0258k(layoutParams);
    }

    @Override // p035l0.t
    public final int q(C0220c c0220c, B b3) {
        if (this.f2200h == 1) {
            return this.f2198p;
        }
        if (b3.a() < 1) {
            return 0;
        }
        return R(c0220c, b3, b3.a() - 1) + 1;
    }

    @Override // p035l0.t
    public final int x(C0220c c0220c, B b3) {
        if (this.f2200h == 0) {
            return this.f2198p;
        }
        if (b3.a() < 1) {
            return 0;
        }
        return R(c0220c, b3, b3.a() - 1) + 1;
    }
}
