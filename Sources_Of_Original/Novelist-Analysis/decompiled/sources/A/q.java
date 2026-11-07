package A;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f44k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f45l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f46m;
    public Object n;

    public /* synthetic */ q() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.f44k) {
            case 0:
                try {
                    objCall = ((h) this.f45l).call();
                    break;
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.n).post(new a((i) this.f46m, objCall, 1));
                return;
            default:
                synchronized (p033k1.l.f3857p) {
                    p033k1.l.a((p033k1.l) this.n, (p033k1.e) this.f45l);
                    break;
                }
                ((B1.o) this.f46m).d(null);
                return;
        }
    }

    public q(p033k1.l lVar, p033k1.e eVar, B1.o oVar) {
        this.f45l = eVar;
        this.f46m = oVar;
        this.n = lVar;
    }
}
