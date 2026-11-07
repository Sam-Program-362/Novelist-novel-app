package io.flutter.plugin.platform;

import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.view.View;
import p052r1.AbstractActivityC0262b;

/* JADX INFO: loaded from: classes.dex */
public final class D {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final A f3155i = new A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SingleViewPresentation f3156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0218a f3158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f3161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f3162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public VirtualDisplay f3163h;

    public D(AbstractActivityC0262b abstractActivityC0262b, C0218a c0218a, VirtualDisplay virtualDisplay, g gVar, h hVar, m mVar, int i3) {
        this.f3157b = abstractActivityC0262b;
        this.f3158c = c0218a;
        this.f3161f = hVar;
        this.f3162g = mVar;
        this.f3160e = i3;
        this.f3163h = virtualDisplay;
        this.f3159d = abstractActivityC0262b.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(abstractActivityC0262b, this.f3163h.getDisplay(), gVar, c0218a, i3, mVar);
        this.f3156a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public final View a() {
        SingleViewPresentation singleViewPresentation = this.f3156a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }
}
