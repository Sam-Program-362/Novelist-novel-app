package l;

import H2.h;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0377a extends h {

    /* renamed from: j, reason: collision with root package name */
    public static volatile C0377a f3912j;

    /* renamed from: i, reason: collision with root package name */
    public final c f3913i = new c();

    public static C0377a S() {
        if (f3912j != null) {
            return f3912j;
        }
        synchronized (C0377a.class) {
            try {
                if (f3912j == null) {
                    f3912j = new C0377a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3912j;
    }
}
