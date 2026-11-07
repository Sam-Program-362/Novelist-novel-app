package l0;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* renamed from: l0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0381D implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public int f3924k;

    /* renamed from: l, reason: collision with root package name */
    public int f3925l;

    /* renamed from: m, reason: collision with root package name */
    public OverScroller f3926m;
    public Interpolator n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3927o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3928p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f3929q;

    public RunnableC0381D(RecyclerView recyclerView) {
        this.f3929q = recyclerView;
        InterpolatorC0405o interpolatorC0405o = RecyclerView.f2210u0;
        this.n = interpolatorC0405o;
        this.f3927o = false;
        this.f3928p = false;
        this.f3926m = new OverScroller(recyclerView.getContext(), interpolatorC0405o);
    }

    public final void a() {
        if (this.f3927o) {
            this.f3928p = true;
            return;
        }
        RecyclerView recyclerView = this.f3929q;
        recyclerView.removeCallbacks(this);
        Field field = D.G.f187a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f3929q;
        if (recyclerView.f2256s == null) {
            recyclerView.removeCallbacks(this);
            this.f3926m.abortAnimation();
            return;
        }
        this.f3928p = false;
        this.f3927o = true;
        recyclerView.d();
        OverScroller overScroller = this.f3926m;
        recyclerView.f2256s.getClass();
        if (overScroller.computeScrollOffset()) {
            int[] iArr = recyclerView.f2248n0;
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f3924k;
            int i6 = currY - this.f3925l;
            this.f3924k = currX;
            this.f3925l = currY;
            if (recyclerView.f(i5, i6, 1, iArr, null)) {
                i3 = i5 - iArr[0];
                i4 = i6 - iArr[1];
            } else {
                i3 = i5;
                i4 = i6;
            }
            if (!recyclerView.f2257t.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(i3, i4);
            }
            recyclerView.g(null, 1);
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z3 = (i3 == 0 && i4 == 0) || (i3 != 0 && recyclerView.f2256s.b() && i3 == 0) || (i4 != 0 && recyclerView.f2256s.c() && i4 == 0);
            if (overScroller.isFinished() || !(z3 || recyclerView.k())) {
                recyclerView.setScrollState(0);
                C0398h c0398h = recyclerView.f2238g0;
                c0398h.getClass();
                c0398h.f3993c = 0;
                recyclerView.s(1);
            } else {
                a();
                RunnableC0400j runnableC0400j = recyclerView.f2237f0;
                if (runnableC0400j != null) {
                    runnableC0400j.a(recyclerView, i3, i4);
                }
            }
        }
        this.f3927o = false;
        if (this.f3928p) {
            a();
        }
    }
}
