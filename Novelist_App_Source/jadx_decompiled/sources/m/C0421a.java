package m;

import java.util.HashMap;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0421a extends C0426f {

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f4083o = new HashMap();

    @Override // m.C0426f
    public final C0423c a(Object obj) {
        return (C0423c) this.f4083o.get(obj);
    }

    @Override // m.C0426f
    public final Object b(Object obj) {
        Object b3 = super.b(obj);
        this.f4083o.remove(obj);
        return b3;
    }
}
