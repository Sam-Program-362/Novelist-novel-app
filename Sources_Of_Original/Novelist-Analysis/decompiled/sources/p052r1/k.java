package p052r1;

import C.a;
import k2.p;
import k2.q;
import p064x0.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4382b;

    public /* synthetic */ k(Object obj, int i3) {
        this.f4381a = i3;
        this.f4382b = obj;
    }

    @Override // C.a
    public final void accept(Object obj) {
        switch (this.f4381a) {
            case 0:
                ((n) this.f4382b).setWindowInfoListenerDisplayFeatures((j) obj);
                break;
            default:
                ((p) ((q) this.f4382b)).h((j) obj);
                break;
        }
    }
}
