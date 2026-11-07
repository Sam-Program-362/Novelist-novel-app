package M;

import H.k;
import H.m;
import android.os.CancellationSignal;
import android.util.Log;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h {
    public static boolean a(CancellationSignal cancellationSignal) {
        if (cancellationSignal == null) {
            Log.i("PlayServicesImpl", "No cancellationSignal found");
            return false;
        }
        if (!cancellationSignal.isCanceled()) {
            return false;
        }
        Log.i("PlayServicesImpl", "the flow has been canceled");
        return true;
    }

    public static boolean b(k kVar) {
        a2.h.e(kVar, "request");
        Iterator it2 = kVar.f412a.iterator();
        while (it2.hasNext()) {
            if (((m) it2.next()) instanceof h1.b) {
                return true;
            }
        }
        return false;
    }
}
