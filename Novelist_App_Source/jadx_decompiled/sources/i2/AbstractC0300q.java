package i2;

import M1.C0068q;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* renamed from: i2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0300q extends R1.a implements R1.e {

    /* renamed from: l, reason: collision with root package name */
    public static final C0299p f3020l = new C0299p(R1.d.f1254k, new C0068q(4));

    public AbstractC0300q() {
        super(R1.d.f1254k);
    }

    public abstract void c(R1.h hVar, Runnable runnable);

    public boolean d(R1.h hVar) {
        return !(this instanceof f0);
    }

    @Override // R1.a, R1.h
    public final R1.f e(R1.g gVar) {
        R1.f fVar;
        a2.h.e(gVar, ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);
        if (gVar instanceof C0299p) {
            C0299p c0299p = (C0299p) gVar;
            R1.g gVar2 = this.f1251k;
            if ((gVar2 == c0299p || c0299p.f3019l == gVar2) && (fVar = (R1.f) c0299p.f3018k.f(this)) != null) {
                return fVar;
            }
        } else if (R1.d.f1254k == gVar) {
            return this;
        }
        return null;
    }

    public AbstractC0300q g(int i3) {
        n2.a.a(i3);
        return new n2.g(this, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (((R1.f) r3.f3018k.f(r2)) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return R1.i.f1255k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0022, code lost:
    
        if (R1.d.f1254k == r3) goto L15;
     */
    @Override // R1.a, R1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final R1.h j(R1.g r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            a2.h.e(r3, r0)
            boolean r0 = r3 instanceof i2.C0299p
            if (r0 == 0) goto L20
            i2.p r3 = (i2.C0299p) r3
            R1.g r0 = r2.f1251k
            if (r0 == r3) goto L15
            R1.g r1 = r3.f3019l
            if (r1 != r0) goto L14
            goto L15
        L14:
            return r2
        L15:
            Z1.l r3 = r3.f3018k
            java.lang.Object r3 = r3.f(r2)
            R1.f r3 = (R1.f) r3
            if (r3 == 0) goto L27
            goto L24
        L20:
            R1.d r0 = R1.d.f1254k
            if (r0 != r3) goto L27
        L24:
            R1.i r3 = R1.i.f1255k
            return r3
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.AbstractC0300q.j(R1.g):R1.h");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0303u.c(this);
    }
}
