package m;

import java.util.Iterator;

/* renamed from: m.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0424d extends AbstractC0425e implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public C0423c f4090k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4091l = true;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0426f f4092m;

    public C0424d(C0426f c0426f) {
        this.f4092m = c0426f;
    }

    @Override // m.AbstractC0425e
    public final void a(C0423c c0423c) {
        C0423c c0423c2 = this.f4090k;
        if (c0423c == c0423c2) {
            C0423c c0423c3 = c0423c2.n;
            this.f4090k = c0423c3;
            this.f4091l = c0423c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4091l) {
            return this.f4092m.f4093k != null;
        }
        C0423c c0423c = this.f4090k;
        return (c0423c == null || c0423c.f4089m == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4091l) {
            this.f4091l = false;
            this.f4090k = this.f4092m.f4093k;
        } else {
            C0423c c0423c = this.f4090k;
            this.f4090k = c0423c != null ? c0423c.f4089m : null;
        }
        return this.f4090k;
    }
}
