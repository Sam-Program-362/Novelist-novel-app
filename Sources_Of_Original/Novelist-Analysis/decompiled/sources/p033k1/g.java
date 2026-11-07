package p033k1;

import M.c;
import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f3838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f3839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f3840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f3841f;

    public g(String str, int i3) {
        this.f3836a = str;
        this.f3837b = i3;
    }

    public final synchronized void a(c cVar) {
        HandlerThread handlerThread = new HandlerThread(this.f3836a, this.f3837b);
        this.f3838c = handlerThread;
        handlerThread.start();
        this.f3839d = new Handler(this.f3838c.getLooper());
        this.f3840e = cVar;
    }
}
