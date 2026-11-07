package k1;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: k1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370g {

    /* renamed from: a, reason: collision with root package name */
    public final String f3836a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3837b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f3838c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f3839d;

    /* renamed from: e, reason: collision with root package name */
    public M.c f3840e;

    /* renamed from: f, reason: collision with root package name */
    public C0369f f3841f;

    public C0370g(String str, int i3) {
        this.f3836a = str;
        this.f3837b = i3;
    }

    public final synchronized void a(M.c cVar) {
        HandlerThread handlerThread = new HandlerThread(this.f3836a, this.f3837b);
        this.f3838c = handlerThread;
        handlerThread.start();
        this.f3839d = new Handler(this.f3838c.getLooper());
        this.f3840e = cVar;
    }
}
