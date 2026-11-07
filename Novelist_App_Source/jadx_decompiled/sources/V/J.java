package V;

/* loaded from: classes.dex */
public final class J extends a2.i implements Z1.l {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f1328l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(N n) {
        super(1);
        this.f1328l = n;
    }

    @Override // Z1.l
    public final Object f(Object obj) {
        Throwable th = (Throwable) obj;
        N n = this.f1328l;
        if (th != null) {
            n.f1347r.m(new Z(th));
        }
        if (n.f1349t.f1208l != O1.f.f1210a) {
            ((W) n.f1349t.a()).close();
        }
        return O1.g.f1211a;
    }
}
