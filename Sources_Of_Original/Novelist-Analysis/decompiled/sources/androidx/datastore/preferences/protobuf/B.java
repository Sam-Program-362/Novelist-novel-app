package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class B {
    public static InterfaceC0123w a(long j3, Object obj) {
        InterfaceC0123w interfaceC0123w = (InterfaceC0123w) i0.f2065c.h(j3, obj);
        if (((AbstractC0103b) interfaceC0123w).f2028k) {
            return interfaceC0123w;
        }
        T t3 = (T) interfaceC0123w;
        int i3 = t3.f2007m;
        T tC = t3.c(i3 == 0 ? 10 : i3 * 2);
        i0.o(obj, j3, tC);
        return tC;
    }
}
