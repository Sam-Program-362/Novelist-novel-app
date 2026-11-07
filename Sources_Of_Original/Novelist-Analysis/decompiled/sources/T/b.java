package T;

import android.database.DataSetObserver;
import p031k.M;
import p031k.h0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1265b;

    public /* synthetic */ b(Object obj, int i3) {
        this.f1264a = i3;
        this.f1265b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f1264a) {
            case 0:
                h0 h0Var = (h0) this.f1265b;
                h0Var.f1266k = true;
                h0Var.notifyDataSetChanged();
                break;
            default:
                M m3 = (M) this.f1265b;
                if (m3.f3620F.isShowing()) {
                    m3.a();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f1264a) {
            case 0:
                h0 h0Var = (h0) this.f1265b;
                h0Var.f1266k = false;
                h0Var.notifyDataSetInvalidated();
                break;
            default:
                ((M) this.f1265b).dismiss();
                break;
        }
    }
}
