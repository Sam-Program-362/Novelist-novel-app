package k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class I implements AdapterView.OnItemSelectedListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3607k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f3608l;

    public /* synthetic */ I(Object obj, int i3) {
        this.f3607k = i3;
        this.f3608l = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i3, long j3) {
        O o2;
        switch (this.f3607k) {
            case 0:
                if (i3 != -1 && (o2 = ((M) this.f3608l).f3623m) != null) {
                    o2.setListSelectionHidden(false);
                    break;
                }
                break;
            default:
                ((SearchView) this.f3608l).m(i3);
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i3 = this.f3607k;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
