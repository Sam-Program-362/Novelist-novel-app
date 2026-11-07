package M1;

import android.view.View;

/* JADX INFO: renamed from: M1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0073w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1.q f1166a = C1.q.f177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0055d f1167b;

    public C0073w(C0055d c0055d) {
        this.f1167b = c0055d;
    }

    public final io.flutter.plugin.platform.g a(Object obj) {
        Integer num = (Integer) obj;
        if (num == null) {
            throw new IllegalStateException("An identifier is required to retrieve a View instance.");
        }
        Object objE = this.f1167b.e(num.intValue());
        if (objE instanceof io.flutter.plugin.platform.g) {
            return (io.flutter.plugin.platform.g) objE;
        }
        if (objE instanceof View) {
            return new C0072v((View) objE);
        }
        throw new IllegalStateException("Unable to find a PlatformView or View instance: " + obj + ", " + objE);
    }
}
