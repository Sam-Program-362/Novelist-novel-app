package S0;

import J0.g;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f1258b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f1259a;

    static {
        b bVar = new b();
        bVar.f1259a = null;
        f1258b = bVar;
    }

    public static g a(Context context) {
        g gVar;
        b bVar = f1258b;
        synchronized (bVar) {
            try {
                if (bVar.f1259a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f1259a = new g(context, 1);
                }
                gVar = bVar.f1259a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }
}
