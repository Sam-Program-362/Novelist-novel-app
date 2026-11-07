package p034l;

import H2.h;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile a f3912j;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f3913i = new c();

    public static a S() {
        if (f3912j != null) {
            return f3912j;
        }
        synchronized (a.class) {
            try {
                if (f3912j == null) {
                    f3912j = new a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3912j;
    }
}
