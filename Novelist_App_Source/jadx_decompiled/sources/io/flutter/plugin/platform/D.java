package io.flutter.plugin.platform;

import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.view.View;
import r1.AbstractActivityC0455b;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: i, reason: collision with root package name */
    public static final A f3155i = new A();

    /* renamed from: a, reason: collision with root package name */
    public SingleViewPresentation f3156a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3157b;

    /* renamed from: c, reason: collision with root package name */
    public final C0309a f3158c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3159d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3160e;

    /* renamed from: f, reason: collision with root package name */
    public final h f3161f;

    /* renamed from: g, reason: collision with root package name */
    public final m f3162g;

    /* renamed from: h, reason: collision with root package name */
    public VirtualDisplay f3163h;

    public D(AbstractActivityC0455b abstractActivityC0455b, C0309a c0309a, VirtualDisplay virtualDisplay, g gVar, h hVar, m mVar, int i3) {
        this.f3157b = abstractActivityC0455b;
        this.f3158c = c0309a;
        this.f3161f = hVar;
        this.f3162g = mVar;
        this.f3160e = i3;
        this.f3163h = virtualDisplay;
        this.f3159d = abstractActivityC0455b.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(abstractActivityC0455b, this.f3163h.getDisplay(), gVar, c0309a, i3, mVar);
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
