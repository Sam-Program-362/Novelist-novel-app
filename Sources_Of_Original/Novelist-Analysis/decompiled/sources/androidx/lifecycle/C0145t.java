package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0145t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EnumC0139m f2156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0143q f2157b;

    public final void a(InterfaceC0144s interfaceC0144s, EnumC0138l enumC0138l) {
        EnumC0139m enumC0139mA = enumC0138l.a();
        EnumC0139m enumC0139m = this.f2156a;
        a2.h.e(enumC0139m, "state1");
        if (enumC0139mA.compareTo(enumC0139m) < 0) {
            enumC0139m = enumC0139mA;
        }
        this.f2156a = enumC0139m;
        this.f2157b.d(interfaceC0144s, enumC0138l);
        this.f2156a = enumC0139mA;
    }
}
