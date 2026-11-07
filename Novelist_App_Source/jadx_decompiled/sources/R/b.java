package R;

import H.d;
import N.c;
import a2.h;
import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Context f1246d;

    /* renamed from: e, reason: collision with root package name */
    public d f1247e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f1248f;

    /* renamed from: g, reason: collision with root package name */
    public CancellationSignal f1249g;

    /* renamed from: h, reason: collision with root package name */
    public final O.c f1250h;

    public b(Context context) {
        h.e(context, "context");
        this.f1246d = context;
        this.f1250h = new O.c(this, new Handler(Looper.getMainLooper()), 2);
    }
}
