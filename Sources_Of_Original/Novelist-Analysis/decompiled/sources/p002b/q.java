package p002b;

import B1.e;
import M1.O;
import Z1.a;
import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2336k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2337l;

    public /* synthetic */ q(Object obj, int i3) {
        this.f2336k = i3;
        this.f2337l = obj;
    }

    @Override // Z1.a
    public final Object a() {
        switch (this.f2336k) {
            case 0:
                return new r((t) this.f2337l);
            default:
                O o2 = (O) this.f2337l;
                Context context = (Activity) o2.f1031b;
                if (context == null) {
                    context = o2.f1030a;
                }
                return e.j(context.getPackageName(), ".flutter.share_provider");
        }
    }
}
