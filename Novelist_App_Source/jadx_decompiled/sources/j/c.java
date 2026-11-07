package j;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import k.P;

/* loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3394k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f3395l;

    public /* synthetic */ c(l lVar, int i3) {
        this.f3394k = i3;
        this.f3395l = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f3394k) {
            case 0:
                g gVar = (g) this.f3395l;
                ArrayList arrayList = gVar.f3420r;
                if (gVar.h() && arrayList.size() > 0) {
                    int i3 = 0;
                    if (!((f) arrayList.get(0)).f3402a.f3619E) {
                        View view = gVar.y;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i3 < size) {
                                Object obj = arrayList.get(i3);
                                i3++;
                                ((f) obj).f3402a.a();
                            }
                            break;
                        } else {
                            gVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                s sVar = (s) this.f3395l;
                P p3 = sVar.f3496r;
                if (sVar.h() && !p3.f3619E) {
                    View view2 = sVar.f3500w;
                    if (view2 != null && view2.isShown()) {
                        p3.a();
                        break;
                    } else {
                        sVar.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
