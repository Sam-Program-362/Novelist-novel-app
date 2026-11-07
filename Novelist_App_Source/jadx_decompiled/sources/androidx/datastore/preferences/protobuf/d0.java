package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class d0 {
    public static c0 a(Object obj) {
        AbstractC0124v abstractC0124v = (AbstractC0124v) obj;
        c0 c0Var = abstractC0124v.unknownFields;
        if (c0Var != c0.f2031f) {
            return c0Var;
        }
        c0 c0Var2 = new c0(0, new int[8], new Object[8], true);
        abstractC0124v.unknownFields = c0Var2;
        return c0Var2;
    }

    public static boolean b(int i3, C0114k c0114k, Object obj) {
        AbstractC0113j abstractC0113j = c0114k.f2073a;
        int i4 = c0114k.f2074b;
        int i5 = i4 >>> 3;
        int i6 = i4 & 7;
        if (i6 == 0) {
            c0114k.w(0);
            ((c0) obj).c(i5 << 3, Long.valueOf(abstractC0113j.n()));
            return true;
        }
        if (i6 == 1) {
            c0114k.w(1);
            ((c0) obj).c((i5 << 3) | 1, Long.valueOf(abstractC0113j.k()));
            return true;
        }
        if (i6 == 2) {
            ((c0) obj).c((i5 << 3) | 2, c0114k.e());
            return true;
        }
        if (i6 != 3) {
            if (i6 == 4) {
                return false;
            }
            if (i6 != 5) {
                throw C0128z.b();
            }
            c0114k.w(5);
            ((c0) obj).c(5 | (i5 << 3), Integer.valueOf(abstractC0113j.j()));
            return true;
        }
        c0 c0Var = new c0(0, new int[8], new Object[8], true);
        int i7 = i5 << 3;
        int i8 = i7 | 4;
        int i9 = i3 + 1;
        if (i9 >= 100) {
            throw new C0128z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0114k.a() != Integer.MAX_VALUE && b(i9, c0114k, c0Var)) {
        }
        if (i8 != c0114k.f2074b) {
            throw new C0128z("Protocol message end-group tag did not match expected tag.");
        }
        if (c0Var.f2036e) {
            c0Var.f2036e = false;
        }
        ((c0) obj).c(i7 | 3, c0Var);
        return true;
    }
}
