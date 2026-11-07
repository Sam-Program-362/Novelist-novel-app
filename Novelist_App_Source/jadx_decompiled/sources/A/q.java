package A;

import android.os.Handler;
import k1.C0368e;
import k1.C0375l;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f44k = 0;

    /* renamed from: l, reason: collision with root package name */
    public Object f45l;

    /* renamed from: m, reason: collision with root package name */
    public Object f46m;
    public Object n;

    public /* synthetic */ q() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f44k) {
            case 0:
                try {
                    obj = ((h) this.f45l).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.n).post(new a((i) this.f46m, obj, 1));
                return;
            default:
                synchronized (C0375l.f3857p) {
                    C0375l.a((C0375l) this.n, (C0368e) this.f45l);
                }
                ((B1.o) this.f46m).d(null);
                return;
        }
    }

    public q(C0375l c0375l, C0368e c0368e, B1.o oVar) {
        this.f45l = c0368e;
        this.f46m = oVar;
        this.n = c0375l;
    }
}
