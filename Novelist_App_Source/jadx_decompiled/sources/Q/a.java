package Q;

import I.f;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1222k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f1223l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f1224m;

    public /* synthetic */ a(b bVar, f fVar, int i3) {
        this.f1222k = i3;
        this.f1223l = bVar;
        this.f1224m = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1222k) {
            case 0:
                this.f1223l.d().b(this.f1224m);
                break;
            case 1:
                this.f1223l.d().b(this.f1224m);
                break;
            default:
                this.f1223l.d().b(this.f1224m);
                break;
        }
    }
}
