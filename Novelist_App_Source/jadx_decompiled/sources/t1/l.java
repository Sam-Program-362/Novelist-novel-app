package t1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class l implements InterfaceC0478f {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f4580a;

    public l() {
        Looper mainLooper = Looper.getMainLooper();
        this.f4580a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // t1.InterfaceC0478f
    public final void a(RunnableC0476d runnableC0476d) {
        this.f4580a.post(runnableC0476d);
    }
}
