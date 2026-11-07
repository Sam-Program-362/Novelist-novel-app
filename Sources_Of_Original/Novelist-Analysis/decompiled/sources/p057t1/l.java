package p057t1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class l implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f4580a;

    public l() {
        Looper mainLooper = Looper.getMainLooper();
        this.f4580a = Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(mainLooper) : new Handler(mainLooper);
    }

    @Override // p057t1.f
    public final void a(d dVar) {
        this.f4580a.post(dVar);
    }
}
