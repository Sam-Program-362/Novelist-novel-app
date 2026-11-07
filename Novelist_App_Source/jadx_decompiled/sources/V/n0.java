package V;

/* loaded from: classes.dex */
public final class n0 implements R1.f {

    /* renamed from: k, reason: collision with root package name */
    public final n0 f1454k;

    /* renamed from: l, reason: collision with root package name */
    public final N f1455l;

    public n0(n0 n0Var, N n) {
        this.f1454k = n0Var;
        this.f1455l = n;
    }

    public final void c(N n) {
        if (this.f1455l == n) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        n0 n0Var = this.f1454k;
        if (n0Var != null) {
            n0Var.c(n);
        }
    }

    @Override // R1.h
    public final R1.f e(R1.g gVar) {
        return E2.a.s(this, gVar);
    }

    @Override // R1.h
    public final Object f(Object obj, Z1.p pVar) {
        return pVar.e(obj, this);
    }

    @Override // R1.f
    public final R1.g getKey() {
        return m0.f1451k;
    }

    @Override // R1.h
    public final R1.h i(R1.h hVar) {
        a2.h.e(hVar, "context");
        return hVar == R1.i.f1255k ? this : (R1.h) hVar.f(this, new N.d(4));
    }

    @Override // R1.h
    public final R1.h j(R1.g gVar) {
        return E2.a.D(this, gVar);
    }
}
