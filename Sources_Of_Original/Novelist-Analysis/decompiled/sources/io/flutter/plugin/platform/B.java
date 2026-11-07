package io.flutter.plugin.platform;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class B implements Runnable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f3152l;

    public /* synthetic */ B(Object obj, int i3) {
        this.f3151k = i3;
        this.f3152l = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3151k) {
            case 0:
                A0.k kVar = (A0.k) this.f3152l;
                ((View) kVar.f60l).postDelayed((n) kVar.f61m, 128L);
                break;
            default:
                C c3 = (C) this.f3152l;
                c3.f3153k.getViewTreeObserver().removeOnDrawListener(c3);
                break;
        }
    }
}
