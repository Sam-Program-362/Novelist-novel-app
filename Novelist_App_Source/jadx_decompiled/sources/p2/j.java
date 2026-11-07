package p2;

import i2.AbstractC0303u;

/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: m, reason: collision with root package name */
    public final Runnable f4267m;

    public j(Runnable runnable, long j3, boolean z3) {
        super(j3, z3);
        this.f4267m = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4267m.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f4267m;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0303u.c(runnable));
        sb.append(", ");
        sb.append(this.f4265k);
        sb.append(", ");
        sb.append(this.f4266l ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}
