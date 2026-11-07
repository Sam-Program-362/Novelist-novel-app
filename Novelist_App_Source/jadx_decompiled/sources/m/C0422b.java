package m;

import java.util.Iterator;

/* renamed from: m.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422b extends AbstractC0425e implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public C0423c f4084k;

    /* renamed from: l, reason: collision with root package name */
    public C0423c f4085l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f4086m;

    public C0422b(C0423c c0423c, C0423c c0423c2, int i3) {
        this.f4086m = i3;
        this.f4084k = c0423c2;
        this.f4085l = c0423c;
    }

    @Override // m.AbstractC0425e
    public final void a(C0423c c0423c) {
        C0423c c0423c2;
        C0423c c0423c3 = null;
        if (this.f4084k == c0423c && c0423c == this.f4085l) {
            this.f4085l = null;
            this.f4084k = null;
        }
        C0423c c0423c4 = this.f4084k;
        if (c0423c4 == c0423c) {
            switch (this.f4086m) {
                case 0:
                    c0423c2 = c0423c4.n;
                    break;
                default:
                    c0423c2 = c0423c4.f4089m;
                    break;
            }
            this.f4084k = c0423c2;
        }
        C0423c c0423c5 = this.f4085l;
        if (c0423c5 == c0423c) {
            C0423c c0423c6 = this.f4084k;
            if (c0423c5 != c0423c6 && c0423c6 != null) {
                c0423c3 = b(c0423c5);
            }
            this.f4085l = c0423c3;
        }
    }

    public final C0423c b(C0423c c0423c) {
        switch (this.f4086m) {
            case 0:
                return c0423c.f4089m;
            default:
                return c0423c.n;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4085l != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0423c c0423c = this.f4085l;
        C0423c c0423c2 = this.f4084k;
        this.f4085l = (c0423c == c0423c2 || c0423c2 == null) ? null : b(c0423c);
        return c0423c;
    }
}
