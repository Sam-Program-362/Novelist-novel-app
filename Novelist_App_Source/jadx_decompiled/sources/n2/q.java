package n2;

import i2.AbstractC0284a;
import i2.AbstractC0303u;

/* loaded from: classes.dex */
public class q extends AbstractC0284a implements T1.d {
    public final R1.c n;

    public q(R1.c cVar, R1.h hVar) {
        super(hVar, true);
        this.n = cVar;
    }

    @Override // i2.W
    public final boolean E() {
        return true;
    }

    @Override // T1.d
    public final T1.d c() {
        R1.c cVar = this.n;
        if (cVar instanceof T1.d) {
            return (T1.d) cVar;
        }
        return null;
    }

    @Override // i2.W
    public void m(Object obj) {
        a.h(H2.h.s(this.n), AbstractC0303u.h(obj));
    }

    @Override // i2.W
    public void n(Object obj) {
        this.n.resumeWith(AbstractC0303u.h(obj));
    }
}
