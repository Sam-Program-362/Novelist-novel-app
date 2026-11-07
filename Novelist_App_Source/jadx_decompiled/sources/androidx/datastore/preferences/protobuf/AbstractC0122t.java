package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0122t implements Cloneable {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0124v f2112k;

    /* renamed from: l, reason: collision with root package name */
    public AbstractC0124v f2113l;

    public AbstractC0122t(AbstractC0124v abstractC0124v) {
        this.f2112k = abstractC0124v;
        if (abstractC0124v.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f2113l = abstractC0124v.i();
    }

    public final AbstractC0124v a() {
        AbstractC0124v b3 = b();
        b3.getClass();
        if (AbstractC0124v.f(b3, true)) {
            return b3;
        }
        throw new b0();
    }

    public final AbstractC0124v b() {
        if (!this.f2113l.g()) {
            return this.f2113l;
        }
        AbstractC0124v abstractC0124v = this.f2113l;
        abstractC0124v.getClass();
        S s3 = S.f2003c;
        s3.getClass();
        s3.a(abstractC0124v.getClass()).d(abstractC0124v);
        abstractC0124v.h();
        return this.f2113l;
    }

    public final void c() {
        if (this.f2113l.g()) {
            return;
        }
        AbstractC0124v i3 = this.f2112k.i();
        AbstractC0124v abstractC0124v = this.f2113l;
        S s3 = S.f2003c;
        s3.getClass();
        s3.a(i3.getClass()).a(i3, abstractC0124v);
        this.f2113l = i3;
    }

    public final Object clone() {
        AbstractC0122t abstractC0122t = (AbstractC0122t) this.f2112k.c(5);
        abstractC0122t.f2113l = b();
        return abstractC0122t;
    }
}
