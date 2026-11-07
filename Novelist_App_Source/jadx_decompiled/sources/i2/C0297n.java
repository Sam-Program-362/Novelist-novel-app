package i2;

import java.util.concurrent.CancellationException;

/* renamed from: i2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3011a;

    /* renamed from: b, reason: collision with root package name */
    public final C f3012b;

    /* renamed from: c, reason: collision with root package name */
    public final Z1.q f3013c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3014d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f3015e;

    public C0297n(Object obj, C c3, Z1.q qVar, Object obj2, Throwable th) {
        this.f3011a = obj;
        this.f3012b = c3;
        this.f3013c = qVar;
        this.f3014d = obj2;
        this.f3015e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0297n a(C0297n c0297n, C c3, CancellationException cancellationException, int i3) {
        Object obj = c0297n.f3011a;
        if ((i3 & 2) != 0) {
            c3 = c0297n.f3012b;
        }
        C c4 = c3;
        Z1.q qVar = c0297n.f3013c;
        Object obj2 = c0297n.f3014d;
        CancellationException cancellationException2 = cancellationException;
        if ((i3 & 16) != 0) {
            cancellationException2 = c0297n.f3015e;
        }
        c0297n.getClass();
        return new C0297n(obj, c4, qVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0297n)) {
            return false;
        }
        C0297n c0297n = (C0297n) obj;
        return a2.h.a(this.f3011a, c0297n.f3011a) && a2.h.a(this.f3012b, c0297n.f3012b) && a2.h.a(this.f3013c, c0297n.f3013c) && a2.h.a(this.f3014d, c0297n.f3014d) && a2.h.a(this.f3015e, c0297n.f3015e);
    }

    public final int hashCode() {
        Object obj = this.f3011a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C c3 = this.f3012b;
        int hashCode2 = (hashCode + (c3 == null ? 0 : c3.hashCode())) * 31;
        Z1.q qVar = this.f3013c;
        int hashCode3 = (hashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj2 = this.f3014d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f3015e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f3011a + ", cancelHandler=" + this.f3012b + ", onCancellation=" + this.f3013c + ", idempotentResume=" + this.f3014d + ", cancelCause=" + this.f3015e + ')';
    }

    public /* synthetic */ C0297n(Object obj, C c3, Z1.q qVar, CancellationException cancellationException, int i3) {
        this(obj, (i3 & 2) != 0 ? null : c3, (i3 & 4) != 0 ? null : qVar, (Object) null, (i3 & 16) != 0 ? null : cancellationException);
    }
}
