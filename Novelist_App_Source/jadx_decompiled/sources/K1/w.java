package K1;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class w extends T1.c {
    public Set n;

    /* renamed from: o, reason: collision with root package name */
    public Map f767o;

    /* renamed from: p, reason: collision with root package name */
    public Iterator f768p;

    /* renamed from: q, reason: collision with root package name */
    public Y.d f769q;

    /* renamed from: r, reason: collision with root package name */
    public int f770r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f771s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ L f772t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(L l3, T1.c cVar) {
        super(cVar);
        this.f772t = l3;
    }

    @Override // T1.a
    public final Object m(Object obj) {
        this.f771s = obj;
        this.u |= Integer.MIN_VALUE;
        return L.k(this.f772t, null, this);
    }
}
