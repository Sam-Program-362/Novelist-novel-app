package p031k;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3652h;

    public final void a(int i3, int i4) {
        this.f3647c = i3;
        this.f3648d = i4;
        this.f3652h = true;
        if (this.f3651g) {
            if (i4 != Integer.MIN_VALUE) {
                this.f3645a = i4;
            }
            if (i3 != Integer.MIN_VALUE) {
                this.f3646b = i3;
                return;
            }
            return;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f3645a = i3;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f3646b = i4;
        }
    }
}
