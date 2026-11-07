package R;

import H.d;
import N.c;
import a2.h;
import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f1246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f1247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f1248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CancellationSignal f1249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final O.c f1250h;

    public b(Context context) {
        h.e(context, "context");
        this.f1246d = context;
        this.f1250h = new O.c(this, new Handler(Looper.getMainLooper()), 2);
    }
}
