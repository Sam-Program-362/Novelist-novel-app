package p037m;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final HashMap f4083o = new HashMap();

    @Override // p037m.f
    public final c a(Object obj) {
        return (c) this.f4083o.get(obj);
    }

    @Override // p037m.f
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.f4083o.remove(obj);
        return objB;
    }
}
