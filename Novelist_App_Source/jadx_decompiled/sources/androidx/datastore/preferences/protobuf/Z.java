package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class Z implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public int f2023k = -1;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2024l;

    /* renamed from: m, reason: collision with root package name */
    public Iterator f2025m;
    public final /* synthetic */ X n;

    public Z(X x) {
        this.n = x;
    }

    public final Iterator a() {
        if (this.f2025m == null) {
            this.f2025m = this.n.f2017l.entrySet().iterator();
        }
        return this.f2025m;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i3 = this.f2023k + 1;
        X x = this.n;
        return i3 < x.f2016k.size() || (!x.f2017l.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f2024l = true;
        int i3 = this.f2023k + 1;
        this.f2023k = i3;
        X x = this.n;
        return i3 < x.f2016k.size() ? (Map.Entry) x.f2016k.get(this.f2023k) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f2024l) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f2024l = false;
        int i3 = X.f2015p;
        X x = this.n;
        x.b();
        if (this.f2023k >= x.f2016k.size()) {
            a().remove();
            return;
        }
        int i4 = this.f2023k;
        this.f2023k = i4 - 1;
        x.h(i4);
    }
}
