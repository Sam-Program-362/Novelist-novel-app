package i2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class P extends W {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f2979m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P() {
        super(true);
        boolean z3 = true;
        C(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = W.f2991l;
        InterfaceC0202j interfaceC0202j = (InterfaceC0202j) atomicReferenceFieldUpdater.get(this);
        C0203k c0203k = interfaceC0202j instanceof C0203k ? (C0203k) interfaceC0202j : null;
        if (c0203k == null) {
            z3 = false;
            break;
        }
        W wJ = c0203k.j();
        while (!wJ.x()) {
            InterfaceC0202j interfaceC0202j2 = (InterfaceC0202j) atomicReferenceFieldUpdater.get(wJ);
            C0203k c0203k2 = interfaceC0202j2 instanceof C0203k ? (C0203k) interfaceC0202j2 : null;
            if (c0203k2 == null) {
                z3 = false;
                break;
            }
            wJ = c0203k2.j();
        }
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
