package L0;

import java.util.Arrays;

/* JADX INFO: renamed from: L0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0041a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A.c f789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K0.b f790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f791d;

    public C0041a(A.c cVar, K0.b bVar, String str) {
        this.f789b = cVar;
        this.f790c = bVar;
        this.f791d = str;
        this.f788a = Arrays.hashCode(new Object[]{cVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0041a)) {
            return false;
        }
        C0041a c0041a = (C0041a) obj;
        return M0.r.i(this.f789b, c0041a.f789b) && M0.r.i(this.f790c, c0041a.f790c) && M0.r.i(this.f791d, c0041a.f791d);
    }

    public final int hashCode() {
        return this.f788a;
    }
}
