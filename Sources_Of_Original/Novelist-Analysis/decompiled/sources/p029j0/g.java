package p029j0;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f3533l;

    public /* synthetic */ g(Context context, int i3) {
        this.f3532k = i3;
        this.f3533l = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3532k) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(this.f3533l, 1));
                break;
            default:
                e.t(this.f3533l, new c(), e.f3521a, false);
                break;
        }
    }
}
