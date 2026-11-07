package q1;

import java.util.concurrent.ThreadFactory;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0448a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public int f4310a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder sb = new StringBuilder("flutter-worker-");
        int i3 = this.f4310a;
        this.f4310a = i3 + 1;
        sb.append(i3);
        thread.setName(sb.toString());
        return thread;
    }
}
