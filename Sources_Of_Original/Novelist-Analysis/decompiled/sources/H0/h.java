package H0;

import K0.l;
import L0.C0044d;
import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G1.a f440a = new G1.a("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        i.w(context).x();
        Set set = l.f655a;
        synchronized (set) {
        }
        Iterator it2 = set.iterator();
        if (it2.hasNext()) {
            ((l) it2.next()).getClass();
            throw new UnsupportedOperationException();
        }
        C0044d.a();
    }
}
