package p044o1;

import C1.o;
import android.content.Intent;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class b implements o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public B1.o f4216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AtomicBoolean f4217l;

    @Override // C1.o
    public final boolean a(int i3, int i4, Intent intent) {
        B1.o oVar;
        if (i3 != 22643) {
            return false;
        }
        String str = SharePlusPendingIntent.f2770a;
        if (this.f4217l.compareAndSet(false, true) && (oVar = this.f4216k) != null) {
            oVar.d(str);
            this.f4216k = null;
        }
        return true;
    }
}
