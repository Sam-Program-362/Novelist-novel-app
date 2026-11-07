package A;

import android.os.Process;

/* loaded from: classes.dex */
public final class n extends Thread {

    /* renamed from: k, reason: collision with root package name */
    public final int f41k;

    public n(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f41k = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f41k);
        super.run();
    }
}
