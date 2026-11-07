package D;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC0017s {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ScrollFeedbackProvider f260k;

    public r(NestedScrollView nestedScrollView) {
        this.f260k = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // D.InterfaceC0017s
    public final void onScrollLimit(int i3, int i4, int i5, boolean z3) {
        this.f260k.onScrollLimit(i3, i4, i5, z3);
    }

    @Override // D.InterfaceC0017s
    public final void onScrollProgress(int i3, int i4, int i5, int i6) {
        this.f260k.onScrollProgress(i3, i4, i5, i6);
    }
}
