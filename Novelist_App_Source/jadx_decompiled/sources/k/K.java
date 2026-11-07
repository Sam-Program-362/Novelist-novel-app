package k;

import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class K implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f3611a;

    public K(M m3) {
        this.f3611a = m3;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i3) {
        M m3 = this.f3611a;
        J j3 = m3.x;
        if (i3 != 1 || m3.f3620F.getInputMethodMode() == 2 || m3.f3620F.getContentView() == null) {
            return;
        }
        m3.f3616B.removeCallbacks(j3);
        j3.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i3, int i4, int i5) {
    }
}
