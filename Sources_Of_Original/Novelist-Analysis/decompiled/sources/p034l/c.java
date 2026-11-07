package p034l;

import D.AbstractC0005f;
import H2.h;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f3915i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ExecutorService f3916j = Executors.newFixedThreadPool(4, new b());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile Handler f3917k;

    public static Handler S(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0005f.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
