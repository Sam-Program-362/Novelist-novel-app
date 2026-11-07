package O;

import I.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1189k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f1190l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f1191m;

    public /* synthetic */ a(d dVar, f fVar, int i3) {
        this.f1189k = i3;
        this.f1190l = dVar;
        this.f1191m = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1189k) {
            case 0:
                this.f1190l.c().b(this.f1191m);
                break;
            case 1:
                this.f1190l.c().b(this.f1191m);
                break;
            default:
                this.f1190l.c().b(this.f1191m);
                break;
        }
    }
}
