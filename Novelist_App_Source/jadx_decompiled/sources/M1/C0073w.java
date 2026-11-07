package M1;

import android.view.View;

/* renamed from: M1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073w {

    /* renamed from: a, reason: collision with root package name */
    public final C1.q f1166a = C1.q.f177a;

    /* renamed from: b, reason: collision with root package name */
    public final C0055d f1167b;

    public C0073w(C0055d c0055d) {
        this.f1167b = c0055d;
    }

    public final io.flutter.plugin.platform.g a(Object obj) {
        if (((Integer) obj) == null) {
            throw new IllegalStateException("An identifier is required to retrieve a View instance.");
        }
        Object e3 = this.f1167b.e(r0.intValue());
        if (e3 instanceof io.flutter.plugin.platform.g) {
            return (io.flutter.plugin.platform.g) e3;
        }
        if (e3 instanceof View) {
            return new C0072v((View) e3);
        }
        throw new IllegalStateException("Unable to find a PlatformView or View instance: " + obj + ", " + e3);
    }
}
