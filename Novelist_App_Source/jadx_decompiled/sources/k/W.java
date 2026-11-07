package k;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class W implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3654k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SearchView f3655l;

    public /* synthetic */ W(SearchView searchView, int i3) {
        this.f3654k = i3;
        this.f3655l = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3654k) {
            case 0:
                this.f3655l.q();
                break;
            default:
                T.c cVar = this.f3655l.f1817b0;
                if (cVar instanceof h0) {
                    cVar.b(null);
                    break;
                }
                break;
        }
    }
}
