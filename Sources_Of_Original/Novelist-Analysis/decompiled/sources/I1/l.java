package I1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Z1.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f502k;

    public /* synthetic */ l(int i3) {
        this.f502k = i3;
    }

    @Override // Z1.a
    public final Object a() {
        switch (this.f502k) {
            case 0:
                return new u(0);
            case 1:
                return new u(1);
            case 2:
                return new u(3);
            case 3:
                return new u(2);
            case 4:
                return new u(4);
            case 5:
                return new u(5);
            case 6:
                c2.a aVar = c2.d.f2663k;
                return Integer.valueOf(c2.d.f2663k.a().nextInt(2147418112) + 65536);
            default:
                return 33554432;
        }
    }
}
