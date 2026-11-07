package k;

/* loaded from: classes.dex */
public final class s0 implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3767k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t0 f3768l;

    public /* synthetic */ s0(t0 t0Var, int i3) {
        this.f3767k = i3;
        this.f3768l = t0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3767k) {
            case 0:
                this.f3768l.c(false);
                break;
            default:
                this.f3768l.a();
                break;
        }
    }
}
