package androidx.lifecycle;

/* renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147t {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0141m f2156a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0145q f2157b;

    public final void a(InterfaceC0146s interfaceC0146s, EnumC0140l enumC0140l) {
        EnumC0141m a3 = enumC0140l.a();
        EnumC0141m enumC0141m = this.f2156a;
        a2.h.e(enumC0141m, "state1");
        if (a3.compareTo(enumC0141m) < 0) {
            enumC0141m = a3;
        }
        this.f2156a = enumC0141m;
        this.f2157b.d(interfaceC0146s, enumC0140l);
        this.f2156a = a3;
    }
}
