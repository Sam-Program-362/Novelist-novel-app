package G0;

import K0.i;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f384k = 1;

    public final synchronized int c() {
        int i3;
        try {
            i3 = f384k;
            if (i3 == 1) {
                Context context = this.f645a;
                J0.d dVar = J0.d.f550c;
                int iB = dVar.b(context, 12451000);
                if (iB == 0) {
                    i3 = 4;
                    f384k = 4;
                } else if (dVar.a(context, iB, null) != null || U0.a.a(context) == 0) {
                    i3 = 2;
                    f384k = 2;
                } else {
                    i3 = 3;
                    f384k = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i3;
    }
}
