package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class N implements V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0102a f1998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f1999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0116o f2000c;

    public N(d0 d0Var, C0116o c0116o, AbstractC0102a abstractC0102a) {
        this.f1999b = d0Var;
        c0116o.getClass();
        this.f2000c = c0116o;
        this.f1998a = abstractC0102a;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void a(Object obj, Object obj2) {
        W.k(this.f1999b, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void b(Object obj, E e3) {
        this.f2000c.getClass();
        B1.e.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int c(AbstractC0122v abstractC0122v) {
        this.f1999b.getClass();
        return abstractC0122v.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void d(Object obj) {
        this.f1999b.getClass();
        c0 c0Var = ((AbstractC0122v) obj).unknownFields;
        if (c0Var.f2036e) {
            c0Var.f2036e = false;
        }
        this.f2000c.getClass();
        B1.e.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean e(Object obj) {
        this.f2000c.getClass();
        B1.e.p(obj);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final boolean f(AbstractC0122v abstractC0122v, AbstractC0122v abstractC0122v2) {
        this.f1999b.getClass();
        return abstractC0122v.unknownFields.equals(abstractC0122v2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void g(Object obj, C0112k c0112k, C0115n c0115n) {
        this.f1999b.getClass();
        d0.a(obj);
        this.f2000c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int h(AbstractC0122v abstractC0122v) {
        this.f1999b.getClass();
        c0 c0Var = abstractC0122v.unknownFields;
        int i3 = c0Var.f2035d;
        if (i3 != -1) {
            return i3;
        }
        int iX = 0;
        for (int i4 = 0; i4 < c0Var.f2032a; i4++) {
            int i5 = c0Var.f2033b[i4] >>> 3;
            iX += C0113l.X(3, (C0108g) c0Var.f2034c[i4]) + C0113l.a0(i5) + C0113l.Z(2) + (C0113l.Z(1) * 2);
        }
        c0Var.f2035d = iX;
        return iX;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final AbstractC0122v newInstance() {
        AbstractC0102a abstractC0102a = this.f1998a;
        return abstractC0102a instanceof AbstractC0122v ? ((AbstractC0122v) abstractC0102a).i() : ((AbstractC0120t) ((AbstractC0122v) abstractC0102a).c(5)).b();
    }
}
