package q;

/* loaded from: classes.dex */
public final class e extends S0.a {
    @Override // S0.a
    public final boolean b(g gVar, c cVar) {
        c cVar2 = c.f4283b;
        synchronized (gVar) {
            try {
                if (gVar.f4297l != cVar) {
                    return false;
                }
                gVar.f4297l = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // S0.a
    public final boolean c(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f4296k != obj) {
                    return false;
                }
                gVar.f4296k = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // S0.a
    public final boolean d(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f4298m != fVar) {
                    return false;
                }
                gVar.f4298m = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // S0.a
    public final void y(f fVar, f fVar2) {
        fVar.f4292b = fVar2;
    }

    @Override // S0.a
    public final void z(f fVar, Thread thread) {
        fVar.f4291a = thread;
    }
}
