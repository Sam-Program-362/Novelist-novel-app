package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0120t implements Cloneable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AbstractC0122v f2112k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AbstractC0122v f2113l;

    public AbstractC0120t(AbstractC0122v abstractC0122v) {
        this.f2112k = abstractC0122v;
        if (abstractC0122v.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f2113l = abstractC0122v.i();
    }

    public final AbstractC0122v a() {
        AbstractC0122v abstractC0122vB = b();
        abstractC0122vB.getClass();
        if (AbstractC0122v.f(abstractC0122vB, true)) {
            return abstractC0122vB;
        }
        throw new b0();
    }

    public final AbstractC0122v b() {
        if (!this.f2113l.g()) {
            return this.f2113l;
        }
        AbstractC0122v abstractC0122v = this.f2113l;
        abstractC0122v.getClass();
        S s3 = S.f2003c;
        s3.getClass();
        s3.a(abstractC0122v.getClass()).d(abstractC0122v);
        abstractC0122v.h();
        return this.f2113l;
    }

    public final void c() {
        if (this.f2113l.g()) {
            return;
        }
        AbstractC0122v abstractC0122vI = this.f2112k.i();
        AbstractC0122v abstractC0122v = this.f2113l;
        S s3 = S.f2003c;
        s3.getClass();
        s3.a(abstractC0122vI.getClass()).a(abstractC0122vI, abstractC0122v);
        this.f2113l = abstractC0122vI;
    }

    public final Object clone() {
        AbstractC0120t abstractC0120t = (AbstractC0120t) this.f2112k.c(5);
        abstractC0120t.f2113l = b();
        return abstractC0120t;
    }
}
