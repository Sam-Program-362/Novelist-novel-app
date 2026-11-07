package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130b {

    /* renamed from: a, reason: collision with root package name */
    public final int f2140a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f2141b;

    public C0130b(int i3, Method method) {
        this.f2140a = i3;
        this.f2141b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0130b)) {
            return false;
        }
        C0130b c0130b = (C0130b) obj;
        return this.f2140a == c0130b.f2140a && this.f2141b.getName().equals(c0130b.f2141b.getName());
    }

    public final int hashCode() {
        return this.f2141b.getName().hashCode() + (this.f2140a * 31);
    }
}
