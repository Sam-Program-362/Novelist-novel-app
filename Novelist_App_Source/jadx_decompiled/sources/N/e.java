package N;

import I.f;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1186k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H.d f1187l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f1188m;

    public /* synthetic */ e(H.d dVar, f fVar, int i3) {
        this.f1186k = i3;
        this.f1187l = dVar;
        this.f1188m = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1186k) {
            case 0:
                this.f1187l.b(this.f1188m);
                break;
            default:
                Object obj = this.f1188m;
                if (obj == null) {
                    obj = new I.e("No provider data returned");
                }
                this.f1187l.b(obj);
                break;
        }
    }
}
