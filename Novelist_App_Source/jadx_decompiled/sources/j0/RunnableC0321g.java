package j0;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: j0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0321g implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3532k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Context f3533l;

    public /* synthetic */ RunnableC0321g(Context context, int i3) {
        this.f3532k = i3;
        this.f3533l = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3532k) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0321g(this.f3533l, 1));
                break;
            default:
                AbstractC0319e.t(this.f3533l, new ExecutorC0317c(), AbstractC0319e.f3521a, false);
                break;
        }
    }
}
