package i2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class P extends W {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f2979m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P() {
        super(true);
        boolean z3 = true;
        C(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = W.f2991l;
        InterfaceC0293j interfaceC0293j = (InterfaceC0293j) atomicReferenceFieldUpdater.get(this);
        C0294k c0294k = interfaceC0293j instanceof C0294k ? (C0294k) interfaceC0293j : null;
        if (c0294k != null) {
            W j3 = c0294k.j();
            while (!j3.x()) {
                InterfaceC0293j interfaceC0293j2 = (InterfaceC0293j) atomicReferenceFieldUpdater.get(j3);
                C0294k c0294k2 = interfaceC0293j2 instanceof C0294k ? (C0294k) interfaceC0293j2 : null;
                if (c0294k2 != null) {
                    j3 = c0294k2.j();
                }
            }
            this.f2979m = z3;
        }
        z3 = false;
        this.f2979m = z3;
    }

    @Override // i2.W
    public final boolean x() {
        return this.f2979m;
    }

    @Override // i2.W
    public final boolean y() {
        return true;
    }
}
