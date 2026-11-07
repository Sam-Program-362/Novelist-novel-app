package M1;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: M1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054c extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final int f1081a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0054c(Object obj) {
        this(obj, null);
        a2.h.e(obj, "instance");
    }

    public final boolean equals(Object obj) {
        T t3 = get();
        return t3 != 0 ? (obj instanceof C0054c) && ((C0054c) obj).get() == t3 : obj == this;
    }

    public final int hashCode() {
        return this.f1081a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0054c(Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        a2.h.e(obj, "instance");
        this.f1081a = System.identityHashCode(obj);
    }
}
