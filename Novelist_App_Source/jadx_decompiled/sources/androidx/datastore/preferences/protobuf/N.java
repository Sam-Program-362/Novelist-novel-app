package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class N implements V {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0104a f1998a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f1999b;

    /* renamed from: c, reason: collision with root package name */
    public final C0118o f2000c;

    public N(d0 d0Var, C0118o c0118o, AbstractC0104a abstractC0104a) {
        this.f1999b = d0Var;
        c0118o.getClass();
        this.f2000c = c0118o;
        this.f1998a = abstractC0104a;
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
    public final int c(AbstractC0124v abstractC0124v) {
        this.f1999b.getClass();
        return abstractC0124v.unknownFields.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void d(Object obj) {
        this.f1999b.getClass();
        c0 c0Var = ((AbstractC0124v) obj).unknownFields;
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
    public final boolean f(AbstractC0124v abstractC0124v, AbstractC0124v abstractC0124v2) {
        this.f1999b.getClass();
        return abstractC0124v.unknownFields.equals(abstractC0124v2.unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final void g(Object obj, C0114k c0114k, C0117n c0117n) {
        this.f1999b.getClass();
        d0.a(obj);
        this.f2000c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final int h(AbstractC0124v abstractC0124v) {
        this.f1999b.getClass();
        c0 c0Var = abstractC0124v.unknownFields;
        int i3 = c0Var.f2035d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < c0Var.f2032a; i5++) {
            int i6 = c0Var.f2033b[i5] >>> 3;
            i4 += C0115l.X(3, (C0110g) c0Var.f2034c[i5]) + C0115l.a0(i6) + C0115l.Z(2) + (C0115l.Z(1) * 2);
        }
        c0Var.f2035d = i4;
        return i4;
    }

    @Override // androidx.datastore.preferences.protobuf.V
    public final AbstractC0124v newInstance() {
        AbstractC0104a abstractC0104a = this.f1998a;
        return abstractC0104a instanceof AbstractC0124v ? ((AbstractC0124v) abstractC0104a).i() : ((AbstractC0122t) ((AbstractC0124v) abstractC0104a).c(5)).b();
    }
}
