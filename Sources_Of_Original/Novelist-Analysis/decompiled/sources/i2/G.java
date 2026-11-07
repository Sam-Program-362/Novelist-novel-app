package i2;

/* JADX INFO: loaded from: classes.dex */
public abstract class G extends AbstractC0209q {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f2970p = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f2971m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public P1.c f2972o;

    public final void h(boolean z3) {
        long j3 = this.f2971m - (z3 ? 4294967296L : 1L);
        this.f2971m = j3;
        if (j3 <= 0 && this.n) {
            shutdown();
        }
    }

    public abstract Thread k();

    public final void l(boolean z3) {
        this.f2971m = (z3 ? 4294967296L : 1L) + this.f2971m;
        if (z3) {
            return;
        }
        this.n = true;
    }

    public abstract long m();

    public final boolean n() {
        P1.c cVar = this.f2972o;
        if (cVar == null) {
            return false;
        }
        AbstractC0217z abstractC0217z = (AbstractC0217z) (cVar.isEmpty() ? null : cVar.removeFirst());
        if (abstractC0217z == null) {
            return false;
        }
        abstractC0217z.run();
        return true;
    }

    public abstract void shutdown();
}
