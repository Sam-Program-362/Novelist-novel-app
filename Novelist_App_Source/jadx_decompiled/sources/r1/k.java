package r1;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements C.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4382b;

    public /* synthetic */ k(Object obj, int i3) {
        this.f4381a = i3;
        this.f4382b = obj;
    }

    @Override // C.a
    public final void accept(Object obj) {
        switch (this.f4381a) {
            case 0:
                ((n) this.f4382b).setWindowInfoListenerDisplayFeatures((x0.j) obj);
                break;
            default:
                ((k2.p) ((k2.q) this.f4382b)).h((x0.j) obj);
                break;
        }
    }
}
