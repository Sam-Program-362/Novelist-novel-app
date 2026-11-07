package p047q;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f4281c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f4282a;

    static {
        if (g.n) {
            f4281c = null;
            f4280b = null;
        } else {
            f4281c = new a(null, false);
            f4280b = new a(null, true);
        }
    }

    public a(Throwable th, boolean z3) {
        this.f4282a = th;
    }
}
