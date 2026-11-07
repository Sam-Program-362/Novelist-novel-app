package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0128b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f2141b;

    public C0128b(int i3, Method method) {
        this.f2140a = i3;
        this.f2141b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0128b)) {
            return false;
        }
        C0128b c0128b = (C0128b) obj;
        return this.f2140a == c0128b.f2140a && this.f2141b.getName().equals(c0128b.f2141b.getName());
    }

    public final int hashCode() {
        return this.f2141b.getName().hashCode() + (this.f2140a * 31);
    }
}
