package io.flutter.view;

import M1.C0066o;
import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static s f3379e;

    /* renamed from: f, reason: collision with root package name */
    public static C0066o f3380f;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterJNI f3382b;

    /* renamed from: a, reason: collision with root package name */
    public long f3381a = -1;

    /* renamed from: c, reason: collision with root package name */
    public r f3383c = new r(this, 0);

    /* renamed from: d, reason: collision with root package name */
    public final c f3384d = new c(this);

    public s(FlutterJNI flutterJNI) {
        this.f3382b = flutterJNI;
    }

    public static s a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f3379e == null) {
            f3379e = new s(flutterJNI);
        }
        if (f3380f == null) {
            s sVar = f3379e;
            Objects.requireNonNull(sVar);
            C0066o c0066o = new C0066o(sVar, displayManager, 1);
            f3380f = c0066o;
            displayManager.registerDisplayListener(c0066o, null);
        }
        if (f3379e.f3381a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f3379e.f3381a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f3379e;
    }
}
