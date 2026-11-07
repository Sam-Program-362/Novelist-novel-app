package io.flutter.plugin.platform;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f3193c;

    public /* synthetic */ l(k kVar, int i3, int i4) {
        this.f3191a = i4;
        this.f3193c = kVar;
        this.f3192b = i3;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        switch (this.f3191a) {
            case 0:
                s sVar = (s) this.f3193c;
                int i3 = this.f3192b;
                if (!z3) {
                    io.flutter.plugin.editing.j jVar = sVar.f3233q;
                    if (jVar != null) {
                        jVar.b(i3);
                    }
                    break;
                } else {
                    B1.s sVar2 = (B1.s) sVar.f3234r.f6l;
                    if (sVar2 != null) {
                        sVar2.s("viewFocused", Integer.valueOf(i3), null);
                        break;
                    }
                }
                break;
            default:
                r rVar = (r) this.f3193c;
                int i4 = this.f3192b;
                if (!z3) {
                    io.flutter.plugin.editing.j jVar2 = rVar.f3212p;
                    if (jVar2 != null) {
                        jVar2.b(i4);
                    }
                    break;
                } else {
                    B1.s sVar3 = (B1.s) rVar.f3213q.f6l;
                    if (sVar3 != null) {
                        sVar3.s("viewFocused", Integer.valueOf(i4), null);
                        break;
                    }
                }
                break;
        }
    }
}
