package k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class a0 implements AdapterView.OnItemClickListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SearchView f3660k;

    public a0(SearchView searchView) {
        this.f3660k = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        this.f3660k.l(i3);
    }
}
