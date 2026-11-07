package M1;

import android.webkit.ValueCallback;

/* JADX INFO: renamed from: M1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0064m implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z1.l f1144b;

    public /* synthetic */ C0064m(Z1.l lVar, int i3) {
        this.f1143a = i3;
        this.f1144b = lVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.f1143a) {
            case 0:
                I1.k kVar = (I1.k) this.f1144b;
                a2.r.a(1, kVar);
                kVar.f(new O1.d((Boolean) obj));
                break;
            default:
                I1.k kVar2 = (I1.k) this.f1144b;
                a2.r.a(1, kVar2);
                kVar2.f(new O1.d((String) obj));
                break;
        }
    }
}
