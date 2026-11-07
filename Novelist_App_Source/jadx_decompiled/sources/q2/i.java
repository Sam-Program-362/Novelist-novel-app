package q2;

import java.util.concurrent.atomic.AtomicReferenceArray;
import n2.r;

/* loaded from: classes.dex */
public final class i extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f4329e;

    public i(long j3, i iVar, int i3) {
        super(j3, iVar, i3);
        this.f4329e = new AtomicReferenceArray(h.f4328f);
    }

    @Override // n2.r
    public final int f() {
        return h.f4328f;
    }

    @Override // n2.r
    public final void g(int i3, R1.h hVar) {
        this.f4329e.set(i3, h.f4327e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f4176c + ", hashCode=" + hashCode() + ']';
    }
}
